'KotlinLightCodeInsightFixtureTestCaseBase' @ [46:56] ==> public constructor KotlinLightCodeInsightFixtureTestCaseBase() defined in org.jetbrains.kotlin.idea.test.KotlinLightCodeInsightFixtureTestCaseBase[JavaClassConstructorDescriptor]

'ArrayList' @ [49:30] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> Throwable

'myFixture' @ [51:42] ==> protected/*protected and package*/ final var myFixture: (JavaCodeInsightTestFixture..JavaCodeInsightTestFixture?) defined in org.jetbrains.kotlin.idea.test.KotlinLightCodeInsightFixtureTestCase[JavaPropertyDescriptor]

'module' @ [51:52] ==> public final val JavaCodeInsightTestFixture.module: (Module..Module?)[MyPropertyDescriptor]

'super' @ [56:9] ==> <this> defined in org.jetbrains.kotlin.idea.test.KotlinLightCodeInsightFixtureTestCase[LazyClassReceiverParameterDescriptor]

'setUp' @ [56:15] ==> protected/*protected and package*/ open fun setUp(): Unit defined in org.jetbrains.kotlin.idea.test.KotlinLightCodeInsightFixtureTestCaseBase[JavaMethodDescriptor]

'getInstance' @ [57:25] ==> public open fun getInstance(p0: (Project..Project?)): (StartupManager..StartupManager?) defined in com.intellij.openapi.startup.StartupManager[JavaMethodDescriptor]

'project' @ [57:37] ==> public final val KotlinLightCodeInsightFixtureTestCase.project: Project[MyPropertyDescriptor]

'runPostStartupActivities' @ [57:69] ==> public open fun runPostStartupActivities(): Unit defined in com.intellij.ide.startup.impl.StartupManagerImpl[JavaMethodDescriptor]

'allowRootAccess' @ [58:23] ==> public open fun allowRootAccess(@NotNull vararg p0: (String..String?)): Unit defined in com.intellij.openapi.vfs.newvfs.impl.VfsRootAccess[JavaMethodDescriptor]

'getHomeDirectory' @ [58:55] ==> @NotNull public open fun getHomeDirectory(): String defined in org.jetbrains.kotlin.test.KotlinTestUtils[JavaMethodDescriptor]

'kotlinInternalModeOriginalValue' @ [60:9] ==> private final var kotlinInternalModeOriginalValue: Boolean defined in org.jetbrains.kotlin.idea.test.KotlinLightCodeInsightFixtureTestCase[PropertyDescriptorImpl]

'KotlinInternalMode' @ [60:43] ==> public companion object Instance defined in org.jetbrains.kotlin.idea.actions.internal.KotlinInternalMode[FakeCallableDescriptorForObject]

'enabled' @ [60:62] ==> public final var enabled: Boolean defined in org.jetbrains.kotlin.idea.actions.internal.KotlinInternalMode.Instance[DeserializedPropertyDescriptor]

'KotlinInternalMode' @ [61:9] ==> public companion object Instance defined in org.jetbrains.kotlin.idea.actions.internal.KotlinInternalMode[FakeCallableDescriptorForObject]

'enabled' @ [61:28] ==> public final var enabled: Boolean defined in org.jetbrains.kotlin.idea.actions.internal.KotlinInternalMode.Instance[DeserializedPropertyDescriptor]

'project' @ [63:9] ==> public final val KotlinLightCodeInsightFixtureTestCase.project: Project[MyPropertyDescriptor]

'getComponent' @ [63:17] ==> public abstract fun <T : (Any..Any?)> getComponent(@NotNull p0: Class<(EditorTracker..EditorTracker?)>): (EditorTracker..EditorTracker?) defined in com.intellij.openapi.project.Project[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (com.intellij.codeInsight.daemon.impl.EditorTracker..com.intellij.codeInsight.daemon.impl.EditorTracker?)

'EditorTracker' @ [63:30] ==> public constructor EditorTracker(p0: (Project..Project?), p1: (WindowManager..WindowManager?), p2: (EditorFactory..EditorFactory?)) defined in com.intellij.codeInsight.daemon.impl.EditorTracker[JavaClassConstructorDescriptor]

'java' @ [63:51] ==> public val <T> KClass<EditorTracker>.java: Class<EditorTracker> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> EditorTracker

'projectOpened' @ [63:58] ==> public open fun projectOpened(): Unit defined in com.intellij.codeInsight.daemon.impl.EditorTracker[JavaMethodDescriptor]

'invalidateLibraryCache' @ [65:9] ==> public fun invalidateLibraryCache(project: Project): Unit defined in org.jetbrains.kotlin.idea.test in file testUtils.kt[SimpleFunctionDescriptorImpl]

'project' @ [65:32] ==> public final val KotlinLightCodeInsightFixtureTestCase.project: Project[MyPropertyDescriptor]

'captureExceptions' @ [67:13] ==> protected open val captureExceptions: Boolean defined in org.jetbrains.kotlin.idea.test.KotlinLightCodeInsightFixtureTestCase[PropertyDescriptorImpl]

'setNewInstance' @ [68:34] ==> public open fun setNewInstance(@NotNull p0: LoggedErrorProcessor): Unit defined in com.intellij.testFramework.LoggedErrorProcessor[JavaMethodDescriptor]

'LoggedErrorProcessor' @ [68:58] ==> public constructor LoggedErrorProcessor() defined in com.intellij.testFramework.LoggedErrorProcessor[JavaClassConstructorDescriptor]

'exceptions' @ [70:21] ==> private final val exceptions: ArrayList<Throwable> defined in org.jetbrains.kotlin.idea.test.KotlinLightCodeInsightFixtureTestCase[PropertyDescriptorImpl]

'addIfNotNull' @ [70:32] ==> public fun <T : Any> MutableCollection<Throwable>.addIfNotNull(t: Throwable?): Unit defined in org.jetbrains.kotlin.utils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> Throwable

't' @ [70:45] ==> value-parameter t: Throwable? defined in org.jetbrains.kotlin.idea.test.KotlinLightCodeInsightFixtureTestCase.setUp.<no name provided>.processError[ValueParameterDescriptorImpl]

'super' @ [71:21] ==> <this> defined in org.jetbrains.kotlin.idea.test.KotlinLightCodeInsightFixtureTestCase.setUp.<no name provided>[LazyClassReceiverParameterDescriptor]

'processError' @ [71:27] ==> public open fun processError(p0: (String..String?), p1: (Throwable..Throwable?), p2: (Array<(String..String?)>..Array<out (String..String?)>?), @NotNull p3: Logger): Unit defined in com.intellij.testFramework.LoggedErrorProcessor[JavaMethodDescriptor]

'message' @ [71:40] ==> value-parameter message: String? defined in org.jetbrains.kotlin.idea.test.KotlinLightCodeInsightFixtureTestCase.setUp.<no name provided>.processError[ValueParameterDescriptorImpl]

't' @ [71:49] ==> value-parameter t: Throwable? defined in org.jetbrains.kotlin.idea.test.KotlinLightCodeInsightFixtureTestCase.setUp.<no name provided>.processError[ValueParameterDescriptorImpl]

'details' @ [71:52] ==> value-parameter details: Array<out String>? defined in org.jetbrains.kotlin.idea.test.KotlinLightCodeInsightFixtureTestCase.setUp.<no name provided>.processError[ValueParameterDescriptorImpl]

'logger' @ [71:61] ==> value-parameter logger: Logger defined in org.jetbrains.kotlin.idea.test.KotlinLightCodeInsightFixtureTestCase.setUp.<no name provided>.processError[ValueParameterDescriptorImpl]

'fixTemplates' @ [75:29] ==> public open fun fixTemplates(): Unit defined in com.intellij.codeInsight.CodeInsightTestCase[JavaMethodDescriptor]

'restoreDefaultProcessor' @ [79:30] ==> public open fun restoreDefaultProcessor(): Unit defined in com.intellij.testFramework.LoggedErrorProcessor[JavaMethodDescriptor]

'KotlinInternalMode' @ [81:9] ==> public companion object Instance defined in org.jetbrains.kotlin.idea.actions.internal.KotlinInternalMode[FakeCallableDescriptorForObject]

'enabled' @ [81:28] ==> public final var enabled: Boolean defined in org.jetbrains.kotlin.idea.actions.internal.KotlinInternalMode.Instance[DeserializedPropertyDescriptor]

'kotlinInternalModeOriginalValue' @ [81:38] ==> private final var kotlinInternalModeOriginalValue: Boolean defined in org.jetbrains.kotlin.idea.test.KotlinLightCodeInsightFixtureTestCase[PropertyDescriptorImpl]

'disallowRootAccess' @ [82:23] ==> public open fun disallowRootAccess(@NotNull vararg p0: (String..String?)): Unit defined in com.intellij.openapi.vfs.newvfs.impl.VfsRootAccess[JavaMethodDescriptor]

'getHomeDirectory' @ [82:58] ==> @NotNull public open fun getHomeDirectory(): String defined in org.jetbrains.kotlin.test.KotlinTestUtils[JavaMethodDescriptor]

'doKotlinTearDown' @ [84:9] ==> public fun doKotlinTearDown(project: Project, runnable: () -> Unit): Unit defined in org.jetbrains.kotlin.idea.test in file testUtils.kt[SimpleFunctionDescriptorImpl]

'project' @ [84:26] ==> public final val KotlinLightCodeInsightFixtureTestCase.project: Project[MyPropertyDescriptor]

'super' @ [85:13] ==> <this> defined in org.jetbrains.kotlin.idea.test.KotlinLightCodeInsightFixtureTestCase[LazyClassReceiverParameterDescriptor]

'tearDown' @ [85:19] ==> protected/*protected and package*/ open fun tearDown(): Unit defined in org.jetbrains.kotlin.idea.test.KotlinLightCodeInsightFixtureTestCaseBase[JavaMethodDescriptor]

'exceptions' @ [88:13] ==> private final val exceptions: ArrayList<Throwable> defined in org.jetbrains.kotlin.idea.test.KotlinLightCodeInsightFixtureTestCase[PropertyDescriptorImpl]

'isNotEmpty' @ [88:24] ==> @InlineOnly public inline fun <T> Collection<Throwable>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Throwable

'exceptions' @ [89:13] ==> private final val exceptions: ArrayList<Throwable> defined in org.jetbrains.kotlin.idea.test.KotlinLightCodeInsightFixtureTestCase[PropertyDescriptorImpl]

'forEach' @ [89:24] ==> @HidesMembers public inline fun <T> Iterable<Throwable>.forEach(action: (Throwable) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Throwable

'it' @ [89:34] ==> value-parameter it: Throwable defined in org.jetbrains.kotlin.idea.test.KotlinLightCodeInsightFixtureTestCase.tearDown.<anonymous>[ValueParameterDescriptorImpl]

'printStackTrace' @ [89:37] ==> public open fun printStackTrace(): Unit defined in kotlin.Throwable[JavaMethodDescriptor]

'AssertionError' @ [90:19] ==> public final fun <init>(p0: (Any..Any?)): AssertionError /* = AssertionError */ defined in kotlin.AssertionError[TypeAliasConstructorDescriptorImpl]

'getProjectDescriptorFromFileDirective' @ [95:15] ==> protected final fun getProjectDescriptorFromFileDirective(): LightProjectDescriptor defined in org.jetbrains.kotlin.idea.test.KotlinLightCodeInsightFixtureTestCase[SimpleFunctionDescriptorImpl]

'toLowerCase' @ [98:35] ==> @Contract public open fun toLowerCase(@Nullable p0: String?): (String..String?) defined in com.intellij.openapi.util.text.StringUtil[JavaMethodDescriptor]

'getTestName' @ [98:47] ==> @NotNull protected/*protected and package*/ open fun getTestName(p0: Boolean): String defined in org.jetbrains.kotlin.idea.test.KotlinLightCodeInsightFixtureTestCase[JavaMethodDescriptor]

'if (testName.endsWith("runtime")) {
            return KotlinWithJdkAndRuntimeLightProjectDescriptor.INSTANCE
        }
        else if (testName.endsWith("stdlib")) {
            return ProjectDescriptorWithStdlibSources.INSTANCE
        }' @ [100:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'testName' @ [100:13] ==> val testName: (String..String?) defined in org.jetbrains.kotlin.idea.test.KotlinLightCodeInsightFixtureTestCase.getProjectDescriptorFromTestName[LocalVariableDescriptor]

'endsWith' @ [100:22] ==> public fun String.endsWith(suffix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'INSTANCE' @ [101:66] ==> @NotNull public final val INSTANCE: KotlinWithJdkAndRuntimeLightProjectDescriptor defined in org.jetbrains.kotlin.idea.test.KotlinWithJdkAndRuntimeLightProjectDescriptor[JavaPropertyDescriptor]

'testName' @ [103:18] ==> val testName: (String..String?) defined in org.jetbrains.kotlin.idea.test.KotlinLightCodeInsightFixtureTestCase.getProjectDescriptorFromTestName[LocalVariableDescriptor]

'endsWith' @ [103:27] ==> public fun String.endsWith(suffix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'INSTANCE' @ [104:55] ==> @NotNull public final val INSTANCE: ProjectDescriptorWithStdlibSources defined in org.jetbrains.kotlin.idea.test.ProjectDescriptorWithStdlibSources[JavaPropertyDescriptor]

'INSTANCE' @ [107:45] ==> public final val INSTANCE: (KotlinLightProjectDescriptor..KotlinLightProjectDescriptor?) defined in org.jetbrains.kotlin.idea.test.KotlinLightProjectDescriptor[JavaPropertyDescriptor]

'!' @ [111:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isAllFilesPresentInTest' @ [111:14] ==> protected final fun isAllFilesPresentInTest(): Boolean defined in org.jetbrains.kotlin.idea.test.KotlinLightCodeInsightFixtureTestCase[SimpleFunctionDescriptorImpl]

'loadFile' @ [113:41] ==> @NotNull public open fun loadFile(@NotNull p0: File, p1: Boolean): String defined in com.intellij.openapi.util.io.FileUtil[JavaMethodDescriptor]

'File' @ [113:50] ==> public constructor File(p0: (String..String?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'testDataPath' @ [113:55] ==> protected for synthetic extension final val KotlinLightCodeInsightFixtureTestCase.testDataPath: String[MyPropertyDescriptor]

'fileName' @ [113:69] ==> protected open fun fileName(): String defined in org.jetbrains.kotlin.idea.test.KotlinLightCodeInsightFixtureTestCase[SimpleFunctionDescriptorImpl]

'findLinesWithPrefixesRemoved' @ [115:66] ==> @NotNull public open fun findLinesWithPrefixesRemoved(p0: (String..String?), vararg p1: (String..String?)): (MutableList<(String..String?)>..List<(String..String?)>) defined in org.jetbrains.kotlin.test.InTextDirectivesUtils[JavaMethodDescriptor]

'fileText' @ [115:95] ==> val fileText: String defined in org.jetbrains.kotlin.idea.test.KotlinLightCodeInsightFixtureTestCase.getProjectDescriptorFromFileDirective[LocalVariableDescriptor]

'if (!withLibraryDirective.isEmpty()) {
                    return JdkAndMockLibraryProjectDescriptor(PluginTestCaseBase.getTestDataPathBase() + "/" + withLibraryDirective.get(0), true)
                }
                else if (InTextDirectivesUtils.isDirectiveDefined(fileText, "RUNTIME_WITH_SOURCES")) {
                    return ProjectDescriptorWithStdlibSources.INSTANCE
                }
                else if (InTextDirectivesUtils.isDirectiveDefined(fileText, "RUNTIME_WITH_KOTLIN_TEST")) {
                    return KotlinWithJdkAndRuntimeLightProjectDescriptor.INSTANCE_WITH_KOTLIN_TEST
                }
                else if (InTextDirectivesUtils.isDirectiveDefined(fileText, "RUNTIME_WITH_FULL_JDK")) {
                    return KotlinWithJdkAndRuntimeLightProjectDescriptor.INSTANCE_FULL_JDK
                }
                else if (InTextDirectivesUtils.isDirectiveDefined(fileText, "RUNTIME") ||
                         InTextDirectivesUtils.isDirectiveDefined(fileText, "WITH_RUNTIME")) {
                    return KotlinWithJdkAndRuntimeLightProjectDescriptor.INSTANCE
                }
                else if (InTextDirectivesUtils.isDirectiveDefined(fileText, "JS")) {
                    return KotlinStdJSProjectDescriptor
                }' @ [116:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'!' @ [116:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'withLibraryDirective' @ [116:22] ==> val withLibraryDirective: (MutableList<(String..String?)>..List<(String..String?)>) defined in org.jetbrains.kotlin.idea.test.KotlinLightCodeInsightFixtureTestCase.getProjectDescriptorFromFileDirective[LocalVariableDescriptor]

'isEmpty' @ [116:43] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'JdkAndMockLibraryProjectDescriptor' @ [117:28] ==> public constructor JdkAndMockLibraryProjectDescriptor(sourcesPath: (String..String?), withSources: Boolean) defined in org.jetbrains.kotlin.idea.test.JdkAndMockLibraryProjectDescriptor[JavaClassConstructorDescriptor]

'+' @ [117:63] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'getTestDataPathBase' @ [117:82] ==> @NotNull public open fun getTestDataPathBase(): String defined in org.jetbrains.kotlin.idea.test.PluginTestCaseBase[JavaMethodDescriptor]

'withLibraryDirective' @ [117:112] ==> val withLibraryDirective: (MutableList<(String..String?)>..List<(String..String?)>) defined in org.jetbrains.kotlin.idea.test.KotlinLightCodeInsightFixtureTestCase.getProjectDescriptorFromFileDirective[LocalVariableDescriptor]

'get' @ [117:133] ==> public abstract fun get(index: Int): (String..String?) defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'if (InTextDirectivesUtils.isDirectiveDefined(fileText, "RUNTIME_WITH_SOURCES")) {
                    return ProjectDescriptorWithStdlibSources.INSTANCE
                }
                else if (InTextDirectivesUtils.isDirectiveDefined(fileText, "RUNTIME_WITH_KOTLIN_TEST")) {
                    return KotlinWithJdkAndRuntimeLightProjectDescriptor.INSTANCE_WITH_KOTLIN_TEST
                }
                else if (InTextDirectivesUtils.isDirectiveDefined(fileText, "RUNTIME_WITH_FULL_JDK")) {
                    return KotlinWithJdkAndRuntimeLightProjectDescriptor.INSTANCE_FULL_JDK
                }
                else if (InTextDirectivesUtils.isDirectiveDefined(fileText, "RUNTIME") ||
                         InTextDirectivesUtils.isDirectiveDefined(fileText, "WITH_RUNTIME")) {
                    return KotlinWithJdkAndRuntimeLightProjectDescriptor.INSTANCE
                }
                else if (InTextDirectivesUtils.isDirectiveDefined(fileText, "JS")) {
                    return KotlinStdJSProjectDescriptor
                }' @ [119:22] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'isDirectiveDefined' @ [119:48] ==> public open fun isDirectiveDefined(p0: (String..String?), p1: (String..String?)): Boolean defined in org.jetbrains.kotlin.test.InTextDirectivesUtils[JavaMethodDescriptor]

'fileText' @ [119:67] ==> val fileText: String defined in org.jetbrains.kotlin.idea.test.KotlinLightCodeInsightFixtureTestCase.getProjectDescriptorFromFileDirective[LocalVariableDescriptor]

'INSTANCE' @ [120:63] ==> @NotNull public final val INSTANCE: ProjectDescriptorWithStdlibSources defined in org.jetbrains.kotlin.idea.test.ProjectDescriptorWithStdlibSources[JavaPropertyDescriptor]

'if (InTextDirectivesUtils.isDirectiveDefined(fileText, "RUNTIME_WITH_KOTLIN_TEST")) {
                    return KotlinWithJdkAndRuntimeLightProjectDescriptor.INSTANCE_WITH_KOTLIN_TEST
                }
                else if (InTextDirectivesUtils.isDirectiveDefined(fileText, "RUNTIME_WITH_FULL_JDK")) {
                    return KotlinWithJdkAndRuntimeLightProjectDescriptor.INSTANCE_FULL_JDK
                }
                else if (InTextDirectivesUtils.isDirectiveDefined(fileText, "RUNTIME") ||
                         InTextDirectivesUtils.isDirectiveDefined(fileText, "WITH_RUNTIME")) {
                    return KotlinWithJdkAndRuntimeLightProjectDescriptor.INSTANCE
                }
                else if (InTextDirectivesUtils.isDirectiveDefined(fileText, "JS")) {
                    return KotlinStdJSProjectDescriptor
                }' @ [122:22] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'isDirectiveDefined' @ [122:48] ==> public open fun isDirectiveDefined(p0: (String..String?), p1: (String..String?)): Boolean defined in org.jetbrains.kotlin.test.InTextDirectivesUtils[JavaMethodDescriptor]

'fileText' @ [122:67] ==> val fileText: String defined in org.jetbrains.kotlin.idea.test.KotlinLightCodeInsightFixtureTestCase.getProjectDescriptorFromFileDirective[LocalVariableDescriptor]

'INSTANCE_WITH_KOTLIN_TEST' @ [123:74] ==> @NotNull public final val INSTANCE_WITH_KOTLIN_TEST: KotlinWithJdkAndRuntimeLightProjectDescriptor defined in org.jetbrains.kotlin.idea.test.KotlinWithJdkAndRuntimeLightProjectDescriptor[JavaPropertyDescriptor]

'if (InTextDirectivesUtils.isDirectiveDefined(fileText, "RUNTIME_WITH_FULL_JDK")) {
                    return KotlinWithJdkAndRuntimeLightProjectDescriptor.INSTANCE_FULL_JDK
                }
                else if (InTextDirectivesUtils.isDirectiveDefined(fileText, "RUNTIME") ||
                         InTextDirectivesUtils.isDirectiveDefined(fileText, "WITH_RUNTIME")) {
                    return KotlinWithJdkAndRuntimeLightProjectDescriptor.INSTANCE
                }
                else if (InTextDirectivesUtils.isDirectiveDefined(fileText, "JS")) {
                    return KotlinStdJSProjectDescriptor
                }' @ [125:22] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'isDirectiveDefined' @ [125:48] ==> public open fun isDirectiveDefined(p0: (String..String?), p1: (String..String?)): Boolean defined in org.jetbrains.kotlin.test.InTextDirectivesUtils[JavaMethodDescriptor]

'fileText' @ [125:67] ==> val fileText: String defined in org.jetbrains.kotlin.idea.test.KotlinLightCodeInsightFixtureTestCase.getProjectDescriptorFromFileDirective[LocalVariableDescriptor]

'INSTANCE_FULL_JDK' @ [126:74] ==> @NotNull public final val INSTANCE_FULL_JDK: KotlinWithJdkAndRuntimeLightProjectDescriptor defined in org.jetbrains.kotlin.idea.test.KotlinWithJdkAndRuntimeLightProjectDescriptor[JavaPropertyDescriptor]

'if (InTextDirectivesUtils.isDirectiveDefined(fileText, "RUNTIME") ||
                         InTextDirectivesUtils.isDirectiveDefined(fileText, "WITH_RUNTIME")) {
                    return KotlinWithJdkAndRuntimeLightProjectDescriptor.INSTANCE
                }
                else if (InTextDirectivesUtils.isDirectiveDefined(fileText, "JS")) {
                    return KotlinStdJSProjectDescriptor
                }' @ [128:22] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'isDirectiveDefined' @ [128:48] ==> public open fun isDirectiveDefined(p0: (String..String?), p1: (String..String?)): Boolean defined in org.jetbrains.kotlin.test.InTextDirectivesUtils[JavaMethodDescriptor]

'fileText' @ [128:67] ==> val fileText: String defined in org.jetbrains.kotlin.idea.test.KotlinLightCodeInsightFixtureTestCase.getProjectDescriptorFromFileDirective[LocalVariableDescriptor]

'isDirectiveDefined' @ [129:48] ==> public open fun isDirectiveDefined(p0: (String..String?), p1: (String..String?)): Boolean defined in org.jetbrains.kotlin.test.InTextDirectivesUtils[JavaMethodDescriptor]

'fileText' @ [129:67] ==> val fileText: String defined in org.jetbrains.kotlin.idea.test.KotlinLightCodeInsightFixtureTestCase.getProjectDescriptorFromFileDirective[LocalVariableDescriptor]

'INSTANCE' @ [130:74] ==> @NotNull public final val INSTANCE: KotlinWithJdkAndRuntimeLightProjectDescriptor defined in org.jetbrains.kotlin.idea.test.KotlinWithJdkAndRuntimeLightProjectDescriptor[JavaPropertyDescriptor]

'isDirectiveDefined' @ [132:48] ==> public open fun isDirectiveDefined(p0: (String..String?), p1: (String..String?)): Boolean defined in org.jetbrains.kotlin.test.InTextDirectivesUtils[JavaMethodDescriptor]

'fileText' @ [132:67] ==> val fileText: String defined in org.jetbrains.kotlin.idea.test.KotlinLightCodeInsightFixtureTestCase.getProjectDescriptorFromFileDirective[LocalVariableDescriptor]

'KotlinStdJSProjectDescriptor' @ [133:28] ==> public object KotlinStdJSProjectDescriptor : KotlinLightProjectDescriptor defined in org.jetbrains.kotlin.idea.test in file KotlinStdJSProjectDescriptor.kt[FakeCallableDescriptorForObject]

'rethrow' @ [137:23] ==> public fun rethrow(e: Throwable): RuntimeException /* = RuntimeException */ defined in org.jetbrains.kotlin.utils[DeserializedSimpleFunctionDescriptor]

'e' @ [137:31] ==> val e: IOException defined in org.jetbrains.kotlin.idea.test.KotlinLightCodeInsightFixtureTestCase.getProjectDescriptorFromFileDirective[LocalVariableDescriptor]

'INSTANCE' @ [141:45] ==> public final val INSTANCE: (KotlinLightProjectDescriptor..KotlinLightProjectDescriptor?) defined in org.jetbrains.kotlin.idea.test.KotlinLightProjectDescriptor[JavaPropertyDescriptor]

'isAllFilesPresentTest' @ [144:72] ==> public open fun isAllFilesPresentTest(p0: (String..String?)): Boolean defined in org.jetbrains.kotlin.test.KotlinTestUtils[JavaMethodDescriptor]

'getTestName' @ [144:94] ==> @NotNull protected/*protected and package*/ open fun getTestName(p0: Boolean): String defined in org.jetbrains.kotlin.idea.test.KotlinLightCodeInsightFixtureTestCase[JavaMethodDescriptor]

'?:' @ [147:15] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: String?, right: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> String

'getTestDataFileName' @ [147:31] ==> @Nullable public open fun getTestDataFileName(@NotNull p0: Class<*>, @NotNull p1: String): String? defined in org.jetbrains.kotlin.test.KotlinTestUtils[JavaMethodDescriptor]

'this' @ [147:51] ==> <this> defined in org.jetbrains.kotlin.idea.test.KotlinLightCodeInsightFixtureTestCase[LazyClassReceiverParameterDescriptor]

'java' @ [147:63] ==> public val <T> KClass<out KotlinLightCodeInsightFixtureTestCase>.java: Class<out KotlinLightCodeInsightFixtureTestCase> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Captured(out KotlinLightCodeInsightFixtureTestCase)

'this' @ [147:69] ==> <this> defined in org.jetbrains.kotlin.idea.test.KotlinLightCodeInsightFixtureTestCase[LazyClassReceiverParameterDescriptor]

'name' @ [147:74] ==> public final var KotlinLightCodeInsightFixtureTestCase.name: (String..String?)[MyPropertyDescriptor]

'getTestName' @ [147:84] ==> @NotNull protected/*protected and package*/ open fun getTestName(p0: Boolean): String defined in org.jetbrains.kotlin.idea.test.KotlinLightCodeInsightFixtureTestCase[JavaMethodDescriptor]

'myFixture' @ [150:28] ==> protected/*protected and package*/ final var myFixture: (JavaCodeInsightTestFixture..JavaCodeInsightTestFixture?) defined in org.jetbrains.kotlin.idea.test.KotlinLightCodeInsightFixtureTestCase[JavaPropertyDescriptor]

'editor' @ [150:38] ==> public final val JavaCodeInsightTestFixture.editor: (Editor..Editor?)[MyPropertyDescriptor]

'dataContext' @ [150:58] ==> public final val EditorEx.dataContext: DataContext[MyPropertyDescriptor]

'getInstanceEx' @ [152:41] ==> public open fun getInstanceEx(): (ActionManagerEx..ActionManagerEx?) defined in com.intellij.openapi.actionSystem.ex.ActionManagerEx[JavaMethodDescriptor]

'managerEx' @ [153:22] ==> val managerEx: (ActionManagerEx..ActionManagerEx?) defined in org.jetbrains.kotlin.idea.test.KotlinLightCodeInsightFixtureTestCase.performNotWriteEditorAction[LocalVariableDescriptor]

'getAction' @ [153:32] ==> public abstract fun getAction(@NonNls @NotNull p0: String): (AnAction..AnAction?) defined in com.intellij.openapi.actionSystem.ex.ActionManagerEx[JavaMethodDescriptor]

'actionId' @ [153:42] ==> value-parameter actionId: String defined in org.jetbrains.kotlin.idea.test.KotlinLightCodeInsightFixtureTestCase.performNotWriteEditorAction[ValueParameterDescriptorImpl]

'AnActionEvent' @ [154:21] ==> public constructor AnActionEvent(p0: (InputEvent..InputEvent?), @NotNull p1: DataContext, @NotNull @NonNls p2: String, @NotNull p3: Presentation, @NotNull p4: ActionManager, @JdkConstants.InputEventMask p5: Int) defined in com.intellij.openapi.actionSystem.AnActionEvent[JavaClassConstructorDescriptor]

'dataContext' @ [154:41] ==> val dataContext: DataContext defined in org.jetbrains.kotlin.idea.test.KotlinLightCodeInsightFixtureTestCase.performNotWriteEditorAction[LocalVariableDescriptor]

'UNKNOWN' @ [154:67] ==> public const final val UNKNOWN: String defined in com.intellij.openapi.actionSystem.ActionPlaces[JavaPropertyDescriptor]

'Presentation' @ [154:76] ==> public constructor Presentation() defined in com.intellij.openapi.actionSystem.Presentation[JavaClassConstructorDescriptor]

'managerEx' @ [154:92] ==> val managerEx: (ActionManagerEx..ActionManagerEx?) defined in org.jetbrains.kotlin.idea.test.KotlinLightCodeInsightFixtureTestCase.performNotWriteEditorAction[LocalVariableDescriptor]

'action' @ [156:9] ==> val action: (AnAction..AnAction?) defined in org.jetbrains.kotlin.idea.test.KotlinLightCodeInsightFixtureTestCase.performNotWriteEditorAction[LocalVariableDescriptor]

'update' @ [156:16] ==> public open fun update(p0: (AnActionEvent..AnActionEvent?)): Unit defined in com.intellij.openapi.actionSystem.AnAction[JavaMethodDescriptor]

'event' @ [156:23] ==> val event: AnActionEvent defined in org.jetbrains.kotlin.idea.test.KotlinLightCodeInsightFixtureTestCase.performNotWriteEditorAction[LocalVariableDescriptor]

'!' @ [157:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'event' @ [157:14] ==> val event: AnActionEvent defined in org.jetbrains.kotlin.idea.test.KotlinLightCodeInsightFixtureTestCase.performNotWriteEditorAction[LocalVariableDescriptor]

'presentation' @ [157:20] ==> public final val AnActionEvent.presentation: Presentation[MyPropertyDescriptor]

'isEnabled' @ [157:33] ==> public final var Presentation.isEnabled: Boolean[MyPropertyDescriptor]

'managerEx' @ [161:9] ==> val managerEx: (ActionManagerEx..ActionManagerEx?) defined in org.jetbrains.kotlin.idea.test.KotlinLightCodeInsightFixtureTestCase.performNotWriteEditorAction[LocalVariableDescriptor]

'fireBeforeActionPerformed' @ [161:19] ==> public abstract fun fireBeforeActionPerformed(p0: (AnAction..AnAction?), p1: (DataContext..DataContext?), p2: (AnActionEvent..AnActionEvent?)): Unit defined in com.intellij.openapi.actionSystem.ex.ActionManagerEx[JavaMethodDescriptor]

'action' @ [161:45] ==> val action: (AnAction..AnAction?) defined in org.jetbrains.kotlin.idea.test.KotlinLightCodeInsightFixtureTestCase.performNotWriteEditorAction[LocalVariableDescriptor]

'dataContext' @ [161:53] ==> val dataContext: DataContext defined in org.jetbrains.kotlin.idea.test.KotlinLightCodeInsightFixtureTestCase.performNotWriteEditorAction[LocalVariableDescriptor]

'event' @ [161:66] ==> val event: AnActionEvent defined in org.jetbrains.kotlin.idea.test.KotlinLightCodeInsightFixtureTestCase.performNotWriteEditorAction[LocalVariableDescriptor]

'action' @ [162:9] ==> val action: (AnAction..AnAction?) defined in org.jetbrains.kotlin.idea.test.KotlinLightCodeInsightFixtureTestCase.performNotWriteEditorAction[LocalVariableDescriptor]

'actionPerformed' @ [162:16] ==> public abstract fun actionPerformed(p0: (AnActionEvent..AnActionEvent?)): Unit defined in com.intellij.openapi.actionSystem.AnAction[JavaMethodDescriptor]

'event' @ [162:32] ==> val event: AnActionEvent defined in org.jetbrains.kotlin.idea.test.KotlinLightCodeInsightFixtureTestCase.performNotWriteEditorAction[LocalVariableDescriptor]

'managerEx' @ [164:9] ==> val managerEx: (ActionManagerEx..ActionManagerEx?) defined in org.jetbrains.kotlin.idea.test.KotlinLightCodeInsightFixtureTestCase.performNotWriteEditorAction[LocalVariableDescriptor]

'fireAfterActionPerformed' @ [164:19] ==> public abstract fun fireAfterActionPerformed(p0: (AnAction..AnAction?), p1: (DataContext..DataContext?), p2: (AnActionEvent..AnActionEvent?)): Unit defined in com.intellij.openapi.actionSystem.ex.ActionManagerEx[JavaMethodDescriptor]

'action' @ [164:44] ==> val action: (AnAction..AnAction?) defined in org.jetbrains.kotlin.idea.test.KotlinLightCodeInsightFixtureTestCase.performNotWriteEditorAction[LocalVariableDescriptor]

'dataContext' @ [164:52] ==> val dataContext: DataContext defined in org.jetbrains.kotlin.idea.test.KotlinLightCodeInsightFixtureTestCase.performNotWriteEditorAction[LocalVariableDescriptor]

'event' @ [164:65] ==> val event: AnActionEvent defined in org.jetbrains.kotlin.idea.test.KotlinLightCodeInsightFixtureTestCase.performNotWriteEditorAction[LocalVariableDescriptor]

'this' @ [169:16] ==> <this> defined in org.jetbrains.kotlin.idea.test.KotlinLightCodeInsightFixtureTestCase[LazyClassReceiverParameterDescriptor]

'findAnnotation' @ [169:28] ==> @SinceKotlin public inline fun <reified T : Annotation> KAnnotatedElement.findAnnotation(): TestMetadata? defined in kotlin.reflect.full[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Annotation> -> TestMetadata

'value' @ [169:60] ==> public final val value: String defined in org.jetbrains.kotlin.test.TestMetadata[JavaPropertyDescriptor]

'super' @ [169:69] ==> <this> defined in org.jetbrains.kotlin.idea.test.KotlinLightCodeInsightFixtureTestCase[LazyClassReceiverParameterDescriptor]

'getTestDataPath' @ [169:75] ==> @NonNls protected/*protected and package*/ open fun getTestDataPath(): (String..String?) defined in org.jetbrains.kotlin.idea.test.KotlinLightCodeInsightFixtureTestCaseBase[JavaMethodDescriptor]

