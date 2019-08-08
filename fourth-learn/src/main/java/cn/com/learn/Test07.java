package cn.com.learn;

/**
 * @author jiangmaofang
 * @date 2019/08/02 16:58
 */
public class Test07 {
    public static void main(String[] args){
        System.out.println("11");
        System.out.println("SELECT c.ID id,\n" +
                "       c.NAME name,\n" +
                "       c.TYPE type,\n" +
                "       d1.meaning typeName,\n" +
                "       c.LEVEL_TYPE levelType,\n" +
                "       d2.meaning levelTypeName,\n" +
                "       ifnull(t.configNum, 0) configNum,\n" +
                "       u1.user_full_name createdByName,\n" +
                "       c.CREATION_DATE creationDate,\n" +
                "       u2.user_full_name lastUpdatedByName,\n" +
                "       c.LAST_UPDATE_DATE lastUpdateDate\n" +
                " FROM vr_meeting_category c\n" +
                " left join saaf_lookup_values d1 on d1.lookup_type='MEETING_TYPE' and d1.lookup_code=c.TYPE\n" +
                " left join saaf_lookup_values d2 on d2.lookup_type='TASK_GRADE_CODE' and d2.lookup_code=c.LEVEL_TYPE\n" +
                " left join saaf_users u1 on u1.user_id=c.CREATED_BY\n" +
                " left join saaf_users u2 on u2.user_id=c.LAST_UPDATED_BY\n" +
                " left join (select CATEGORY_ID, count(1) configNum from vr_meeting_topic_config group by CATEGORY_ID) t on c.id=t.CATEGORY_ID\n" +
                " where 1=1");
    }

}
