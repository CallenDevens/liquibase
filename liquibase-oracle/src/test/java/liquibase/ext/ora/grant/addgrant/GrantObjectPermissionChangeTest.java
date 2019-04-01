package liquibase.ext.ora.grant.addgrant;

import liquibase.ext.ora.testing.BaseTestCase;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GrantObjectPermissionChangeTest extends BaseTestCase {

    @Test
    public void placeholder() {

    }
//
//    @Before
//    public void setUp() throws Exception {
//        changeLogFile = "liquibase/ext/ora/grant/addgrant/changelog.test.xml";
//        connectToDB();
//        cleanDB();
//    }
//
//    @Test
//    public void test() throws Exception {
//        if (connection == null) {
//            return;
//        }
//
//        liquiBase.update("null");
//    }
//
//    @Test
//    public void generateStatement() {
//        final GrantObjectPermissionChange change = PermissionHelper.createGrantObjectPermissionChangeWithAllPrivileges();
//        final GrantObjectPermissionStatement statement = PermissionHelper.createObjectPermissionStatement(change);
//
//        assertEquals(PermissionHelper.SCHEMA_NAME, statement.getSchemaName());
//        assertEquals(PermissionHelper.TABLE_NAME, statement.getObjectName());
//        assertEquals(PermissionHelper.RECIPIENT_USER, statement.getRecipientList());
//        assertEquals(true, statement.getSelect());
//        assertEquals(true, statement.getUpdate());
//        assertEquals(true, statement.getInsert());
//        assertEquals(true, statement.getDelete());
//        assertEquals(true, statement.getExecute());
//        assertEquals(true, statement.getIndex());
//        assertEquals(true, statement.getReferences());
//
//
//    }
//
//    @Test
//    public void getConfirmationMessage() {
//        GrantObjectPermissionChange change = new GrantObjectPermissionChange();
//
//        change.setObjectName(PermissionHelper.TABLE_NAME);
//        change.setRecipientList(PermissionHelper.RECIPIENT_USER);
//
//        assertEquals("Grants on " + change.getObjectName() + " have been given to " + change.getRecipientList(),
//                change.getConfirmationMessage());
//    }
//
//    @Test
//    public void getChangeMetaData() {
//        GrantObjectPermissionChange change = new GrantObjectPermissionChange();
//
//        assertEquals("grantObjectPermission", Scope.getCurrentScope().getSingleton(ChangeFactory.class).getChangeMetaData(change).getName());
//        assertEquals("Grant Schema Object Permission", Scope.getCurrentScope().getSingleton(ChangeFactory.class).getChangeMetaData(change).getDescription());
//        assertEquals(ChangeMetaData.PRIORITY_DEFAULT, Scope.getCurrentScope().getSingleton(ChangeFactory.class).getChangeMetaData(change).getPriority());
//    }
//
//    @Test
//    public void parseAndGenerate() throws Exception {
//        if (connection == null) {
//            return;
//        }
//
//        Database database = liquiBase.getDatabase();
//        ResourceAccessor resourceAccessor = new FileSystemResourceAccessor("src/test/java");
//
//        ChangeLogParameters changeLogParameters = new ChangeLogParameters();
//
//        DatabaseChangeLog changeLog = ChangeLogParserFactory.getInstance()
//                .getParser(changeLogFile, resourceAccessor)
//                .parse(changeLogFile, changeLogParameters, resourceAccessor);
//
//        changeLog.validate(database);
//
//        List<ChangeSet> changeSets = changeLog.getChangeSets();
//        assertEquals("number of changesets in the " + changeLogFile + " is incorrect", 2, changeSets.size());
//        ChangeSet changeSet = changeSets.get(1);
//
//        assertEquals("Wrong number of changes found in changeset", 1, changeSet.getChanges().size());
//        Change change = changeSet.getChanges().get(0);
//
//        List<String> expectedQueries = new ArrayList<String>();
//        expectedQueries.add("GRANT SELECT,UPDATE,INSERT,DELETE ON LIQUIBASE.addgrant TO SYSTEM");
//
//        Sql[] sql = SqlGeneratorFactory.getInstance().generateSql(change.generateStatements(database)[0], database);
//        assertEquals("wrong number of statements generated", expectedQueries.size(), sql.length);
//        assertEquals(expectedQueries.get(0), sql[0].toSql());
//    }
//
//    @Test
//    public void generateSqlStatement() {
//        // Given
//        final GrantObjectPermissionChange change = PermissionHelper.createGrantObjectPermissionChangeWithAllPrivileges();
//        final GrantObjectPermissionStatement statement = PermissionHelper.createObjectPermissionStatement(change);
//        Database databaseMock = mock(Database.class);
//        when(databaseMock.escapeTableName(anyString(), anyString(), anyString())).thenReturn(statement.getObjectName());
//
//        // When
//        Sql[] sqls = new GrantObjectPermissionGenerator().generateSql(statement, databaseMock, null);
//
//        // Then
//        assertEquals(1, sqls.length);
//        assertEquals("GRANT SELECT,UPDATE,INSERT,DELETE,EXECUTE,REFERENCES,INDEX ON " + PermissionHelper.TABLE_NAME
//                + " TO " + PermissionHelper.RECIPIENT_USER + " WITH GRANT OPTION", sqls[0].toSql());
//    }

}