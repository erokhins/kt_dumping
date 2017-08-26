'KotlinLightCodeInsightFixtureTestCase' @ [64:41] ==> public constructor KotlinLightCodeInsightFixtureTestCase() defined in org.jetbrains.kotlin.idea.test.KotlinLightCodeInsightFixtureTestCase[ClassConstructorDescriptorImpl]

'INSTANCE' @ [66:113] ==> @NotNull public final val INSTANCE: KotlinWithJdkAndRuntimeLightProjectDescriptor defined in org.jetbrains.kotlin.idea.test.KotlinWithJdkAndRuntimeLightProjectDescriptor[JavaPropertyDescriptor]

'File' @ [73:24] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'path' @ [73:29] ==> value-parameter path: String defined in org.jetbrains.kotlin.findUsages.AbstractFindUsagesTest.doTest[ValueParameterDescriptorImpl]

'mainFile' @ [74:28] ==> val mainFile: File defined in org.jetbrains.kotlin.findUsages.AbstractFindUsagesTest.doTest[LocalVariableDescriptor]

'name' @ [74:37] ==> public final val File.name: (String..String?)[MyPropertyDescriptor]

'loadFile' @ [75:37] ==> @NotNull public open fun loadFile(@NotNull p0: File, p1: Boolean): String defined in com.intellij.openapi.util.io.FileUtil[JavaMethodDescriptor]

'mainFile' @ [75:46] ==> val mainFile: File defined in org.jetbrains.kotlin.findUsages.AbstractFindUsagesTest.doTest[LocalVariableDescriptor]

'mainFileName' @ [76:22] ==> val mainFileName: (String..String?) defined in org.jetbrains.kotlin.findUsages.AbstractFindUsagesTest.doTest[LocalVariableDescriptor]

'substringBefore' @ [76:35] ==> public fun String.substringBefore(delimiter: String, missingDelimiterValue: String = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'==' @ [78:32] ==> public open fun equals(other: Any?): Boolean defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'getExtension' @ [78:43] ==> @NotNull public open fun getExtension(@NotNull p0: String): String defined in com.intellij.openapi.util.io.FileUtilRt[JavaMethodDescriptor]

'path' @ [78:56] ==> value-parameter path: String defined in org.jetbrains.kotlin.findUsages.AbstractFindUsagesTest.doTest[ValueParameterDescriptorImpl]

'Suppress' @ [80:9] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'if (!isPropertiesFile) {
            val caretElementClassNames = InTextDirectivesUtils.findLinesWithPrefixesRemoved(mainFileText, "// PSI_ELEMENT: ")
            Class.forName(caretElementClassNames.single())
        }
        else if (InTextDirectivesUtils.isDirectiveDefined(mainFileText, "## FIND_FILE_USAGES")) {
            PropertiesFile::class.java
        }
        else {
            Property::class.java
        }' @ [81:34] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (Class<out (Any..Any?)>..Class<out (Any..Any?)>?), elseBranch: (Class<out (Any..Any?)>..Class<out (Any..Any?)>?)): (Class<out (Any..Any?)>..Class<out (Any..Any?)>?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (java.lang.Class<out (kotlin.Any..kotlin.Any?)>..java.lang.Class<out (kotlin.Any..kotlin.Any?)>?)

'!' @ [81:38] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isPropertiesFile' @ [81:39] ==> val isPropertiesFile: Boolean defined in org.jetbrains.kotlin.findUsages.AbstractFindUsagesTest.doTest[LocalVariableDescriptor]

'findLinesWithPrefixesRemoved' @ [82:64] ==> @NotNull public open fun findLinesWithPrefixesRemoved(p0: (String..String?), vararg p1: (String..String?)): (MutableList<(String..String?)>..List<(String..String?)>) defined in org.jetbrains.kotlin.test.InTextDirectivesUtils[JavaMethodDescriptor]

'mainFileText' @ [82:93] ==> val mainFileText: String defined in org.jetbrains.kotlin.findUsages.AbstractFindUsagesTest.doTest[LocalVariableDescriptor]

'forName' @ [83:19] ==> @CallerSensitive public open fun forName(p0: (String..String?)): (Class<*>..Class<*>?) defined in java.lang.Class[JavaMethodDescriptor]

'caretElementClassNames' @ [83:27] ==> val caretElementClassNames: (MutableList<(String..String?)>..List<(String..String?)>) defined in org.jetbrains.kotlin.findUsages.AbstractFindUsagesTest.doTest[LocalVariableDescriptor]

'single' @ [83:50] ==> public fun <T> List<(String..String?)>.single(): (String..String?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.String..kotlin.String?)

'if (InTextDirectivesUtils.isDirectiveDefined(mainFileText, "## FIND_FILE_USAGES")) {
            PropertiesFile::class.java
        }
        else {
            Property::class.java
        }' @ [85:14] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Class<out Any>, elseBranch: Class<out Any>): Class<out Any>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Class<out Any>

'isDirectiveDefined' @ [85:40] ==> public open fun isDirectiveDefined(p0: (String..String?), p1: (String..String?)): Boolean defined in org.jetbrains.kotlin.test.InTextDirectivesUtils[JavaMethodDescriptor]

'mainFileText' @ [85:59] ==> val mainFileText: String defined in org.jetbrains.kotlin.findUsages.AbstractFindUsagesTest.doTest[LocalVariableDescriptor]

'java' @ [86:35] ==> public val <T> KClass<PropertiesFile>.java: Class<PropertiesFile> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> PropertiesFile

'java' @ [89:29] ==> public val <T> KClass<Property>.java: Class<Property> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Property

'findListWithPrefixes' @ [92:52] ==> @NotNull public open fun findListWithPrefixes(@NotNull p0: String, @NotNull vararg p1: (String..String?)): (MutableList<(String..String?)>..List<(String..String?)>) defined in org.jetbrains.kotlin.test.InTextDirectivesUtils[JavaMethodDescriptor]

'mainFileText' @ [92:73] ==> val mainFileText: String defined in org.jetbrains.kotlin.findUsages.AbstractFindUsagesTest.doTest[LocalVariableDescriptor]

'fixtureClasses' @ [93:30] ==> val fixtureClasses: (MutableList<(String..String?)>..List<(String..String?)>) defined in org.jetbrains.kotlin.findUsages.AbstractFindUsagesTest.doTest[LocalVariableDescriptor]

'TestFixtureExtension' @ [94:13] ==> public companion object defined in org.jetbrains.kotlin.idea.test.TestFixtureExtension[FakeCallableDescriptorForObject]

'loadFixture' @ [94:34] ==> @Suppress public final fun loadFixture(className: String, module: Module): TestFixtureExtension defined in org.jetbrains.kotlin.idea.test.TestFixtureExtension.Companion[SimpleFunctionDescriptorImpl]

'fixtureClass' @ [94:46] ==> val fixtureClass: (String..String?) defined in org.jetbrains.kotlin.findUsages.AbstractFindUsagesTest.doTest[LocalVariableDescriptor]

'myFixture' @ [94:60] ==> protected/*protected and package*/ final var myFixture: (JavaCodeInsightTestFixture..JavaCodeInsightTestFixture?) defined in org.jetbrains.kotlin.findUsages.AbstractFindUsagesTest[JavaPropertyDescriptor]

'module' @ [94:70] ==> public final val JavaCodeInsightTestFixture.module: (Module..Module?)[MyPropertyDescriptor]

'extraConfig' @ [98:13] ==> protected open fun extraConfig(path: String): Unit defined in org.jetbrains.kotlin.findUsages.AbstractFindUsagesTest[SimpleFunctionDescriptorImpl]

'path' @ [98:25] ==> value-parameter path: String defined in org.jetbrains.kotlin.findUsages.AbstractFindUsagesTest.doTest[ValueParameterDescriptorImpl]

'OptionsParser' @ [100:26] ==> public companion object defined in org.jetbrains.kotlin.findUsages.OptionsParser[FakeCallableDescriptorForObject]

'getParserByPsiElementClass' @ [100:40] ==> public final fun getParserByPsiElementClass(klass: Class<out PsiElement>): OptionsParser? defined in org.jetbrains.kotlin.findUsages.OptionsParser.Companion[SimpleFunctionDescriptorImpl]

'caretElementClass' @ [100:67] ==> val caretElementClass: Class<T> defined in org.jetbrains.kotlin.findUsages.AbstractFindUsagesTest.doTest[LocalVariableDescriptor]

'path' @ [102:28] ==> value-parameter path: String defined in org.jetbrains.kotlin.findUsages.AbstractFindUsagesTest.doTest[ValueParameterDescriptorImpl]

'substringBeforeLast' @ [102:33] ==> public fun String.substringBeforeLast(delimiter: String, missingDelimiterValue: String = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'File' @ [104:27] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'rootPath' @ [104:32] ==> val rootPath: String defined in org.jetbrains.kotlin.findUsages.AbstractFindUsagesTest.doTest[LocalVariableDescriptor]

'rootDir' @ [105:30] ==> val rootDir: File defined in org.jetbrains.kotlin.findUsages.AbstractFindUsagesTest.doTest[LocalVariableDescriptor]

'listFiles' @ [105:38] ==> public final fun listFiles(p0: (((File..File?), (String..String?)) -> Boolean..(((File..File?), (String..String?)) -> Boolean)?)): (Array<(File..File?)>..Array<out (File..File?)>?) defined in java.io.File[MyFunctionDescriptor]

'!' @ [106:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'name' @ [106:22] ==> value-parameter name: (String..String?) defined in org.jetbrains.kotlin.findUsages.AbstractFindUsagesTest.doTest.<anonymous>[ValueParameterDescriptorImpl]

'startsWith' @ [106:27] ==> public fun String.startsWith(prefix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'prefix' @ [106:38] ==> val prefix: String defined in org.jetbrains.kotlin.findUsages.AbstractFindUsagesTest.doTest[LocalVariableDescriptor]

'name' @ [106:49] ==> value-parameter name: (String..String?) defined in org.jetbrains.kotlin.findUsages.AbstractFindUsagesTest.doTest.<anonymous>[ValueParameterDescriptorImpl]

'mainFileName' @ [106:57] ==> val mainFileName: (String..String?) defined in org.jetbrains.kotlin.findUsages.AbstractFindUsagesTest.doTest[LocalVariableDescriptor]

'getExtension' @ [108:38] ==> @NotNull public open fun getExtension(@NotNull p0: String): String defined in com.intellij.openapi.util.io.FileUtilRt[JavaMethodDescriptor]

'name' @ [108:51] ==> value-parameter name: (String..String?) defined in org.jetbrains.kotlin.findUsages.AbstractFindUsagesTest.doTest.<anonymous>[ValueParameterDescriptorImpl]

'ext' @ [109:17] ==> val ext: String defined in org.jetbrains.kotlin.findUsages.AbstractFindUsagesTest.doTest.<anonymous>[LocalVariableDescriptor]

'SUPPORTED_EXTENSIONS' @ [109:24] ==> public final val SUPPORTED_EXTENSIONS: Set<String> defined in org.jetbrains.kotlin.findUsages.AbstractFindUsagesTest.Companion[PropertyDescriptorImpl]

'!' @ [109:48] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'name' @ [109:49] ==> value-parameter name: (String..String?) defined in org.jetbrains.kotlin.findUsages.AbstractFindUsagesTest.doTest.<anonymous>[ValueParameterDescriptorImpl]

'endsWith' @ [109:54] ==> public fun String.endsWith(suffix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'extraFiles' @ [112:26] ==> val extraFiles: (Array<(File..File?)>..Array<out (File..File?)>?) defined in org.jetbrains.kotlin.findUsages.AbstractFindUsagesTest.doTest[LocalVariableDescriptor]

'myFixture' @ [113:17] ==> protected/*protected and package*/ final var myFixture: (JavaCodeInsightTestFixture..JavaCodeInsightTestFixture?) defined in org.jetbrains.kotlin.findUsages.AbstractFindUsagesTest[JavaPropertyDescriptor]

'configureByFile' @ [113:27] ==> public abstract fun configureByFile(@NotNull p0: String): (PsiFile..PsiFile?) defined in com.intellij.testFramework.fixtures.JavaCodeInsightTestFixture[JavaMethodDescriptor]

'file' @ [113:43] ==> val file: (File..File?) defined in org.jetbrains.kotlin.findUsages.AbstractFindUsagesTest.doTest[LocalVariableDescriptor]

'name' @ [113:48] ==> public final val File.name: (String..String?)[MyPropertyDescriptor]

'myFixture' @ [115:13] ==> protected/*protected and package*/ final var myFixture: (JavaCodeInsightTestFixture..JavaCodeInsightTestFixture?) defined in org.jetbrains.kotlin.findUsages.AbstractFindUsagesTest[JavaPropertyDescriptor]

'configureByFile' @ [115:23] ==> public abstract fun configureByFile(@NotNull p0: String): (PsiFile..PsiFile?) defined in com.intellij.testFramework.fixtures.JavaCodeInsightTestFixture[JavaMethodDescriptor]

'mainFileName' @ [115:39] ==> val mainFileName: (String..String?) defined in org.jetbrains.kotlin.findUsages.AbstractFindUsagesTest.doTest[LocalVariableDescriptor]

'if (InTextDirectivesUtils.isDirectiveDefined(mainFileText, "// FIND_BY_REF"))
                TargetElementUtil.findTargetElement(myFixture.editor,
                                                    TargetElementUtil.REFERENCED_ELEMENT_ACCEPTED or JavaTargetElementEvaluator.NEW_AS_CONSTRUCTOR)!!
            else
                myFixture.elementAtCaret' @ [117:32] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: PsiElement, elseBranch: PsiElement): PsiElement[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> PsiElement

'isDirectiveDefined' @ [117:58] ==> public open fun isDirectiveDefined(p0: (String..String?), p1: (String..String?)): Boolean defined in org.jetbrains.kotlin.test.InTextDirectivesUtils[JavaMethodDescriptor]

'mainFileText' @ [117:77] ==> val mainFileText: String defined in org.jetbrains.kotlin.findUsages.AbstractFindUsagesTest.doTest[LocalVariableDescriptor]

'!!' @ [118:17] ==> public final fun <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-EXCLEXCL-RESOLVE>`(baseExpr: PsiElement?): PsiElement[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> -> PsiElement

'findTargetElement' @ [118:35] ==> @Nullable public open fun findTargetElement(p0: (Editor..Editor?), p1: Int): PsiElement? defined in com.intellij.codeInsight.TargetElementUtil[JavaMethodDescriptor]

'myFixture' @ [118:53] ==> protected/*protected and package*/ final var myFixture: (JavaCodeInsightTestFixture..JavaCodeInsightTestFixture?) defined in org.jetbrains.kotlin.findUsages.AbstractFindUsagesTest[JavaPropertyDescriptor]

'editor' @ [118:63] ==> public final val JavaCodeInsightTestFixture.editor: (Editor..Editor?)[MyPropertyDescriptor]

'or' @ [119:53] ==> public final infix fun or(other: Int): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'REFERENCED_ELEMENT_ACCEPTED' @ [119:71] ==> public const final val REFERENCED_ELEMENT_ACCEPTED: Int defined in com.intellij.codeInsight.TargetElementUtil[JavaPropertyDescriptor]

'NEW_AS_CONSTRUCTOR' @ [119:129] ==> public const final val NEW_AS_CONSTRUCTOR: Int defined in com.intellij.codeInsight.JavaTargetElementEvaluator[JavaPropertyDescriptor]

'myFixture' @ [121:17] ==> protected/*protected and package*/ final var myFixture: (JavaCodeInsightTestFixture..JavaCodeInsightTestFixture?) defined in org.jetbrains.kotlin.findUsages.AbstractFindUsagesTest[JavaPropertyDescriptor]

'elementAtCaret' @ [121:27] ==> public final val JavaCodeInsightTestFixture.elementAtCaret: PsiElement[MyPropertyDescriptor]

'assertInstanceOf' @ [122:28] ==> @Contract public open fun <T : (Any..Any?)> assertInstanceOf(p0: (Any..Any?), @NotNull p1: Class<(T..T?)>): (T..T?) defined in com.intellij.testFramework.UsefulTestCase[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (T..T?)

'caretElement' @ [122:45] ==> val caretElement: PsiElement defined in org.jetbrains.kotlin.findUsages.AbstractFindUsagesTest.doTest[LocalVariableDescriptor]

'caretElementClass' @ [122:59] ==> val caretElementClass: Class<T> defined in org.jetbrains.kotlin.findUsages.AbstractFindUsagesTest.doTest[LocalVariableDescriptor]

'caretElement' @ [124:34] ==> val caretElement: PsiElement defined in org.jetbrains.kotlin.findUsages.AbstractFindUsagesTest.doTest[LocalVariableDescriptor]

'containingFile' @ [124:47] ==> public final val PsiElement.containingFile: (PsiFile..PsiFile?)[MyPropertyDescriptor]

'containingFile' @ [125:36] ==> val containingFile: (PsiFile..PsiFile?) defined in org.jetbrains.kotlin.findUsages.AbstractFindUsagesTest.doTest[LocalVariableDescriptor]

'ProjectRootsUtil' @ [125:62] ==> public object ProjectRootsUtil defined in org.jetbrains.kotlin.idea.util[FakeCallableDescriptorForObject]

'isLibraryFile' @ [125:79] ==> @JvmStatic public final fun isLibraryFile(project: Project, file: VirtualFile): Boolean defined in org.jetbrains.kotlin.idea.util.ProjectRootsUtil[DeserializedSimpleFunctionDescriptor]

'project' @ [125:93] ==> public final val AbstractFindUsagesTest.project: Project[MyPropertyDescriptor]

'containingFile' @ [125:102] ==> val containingFile: (PsiFile..PsiFile?) defined in org.jetbrains.kotlin.findUsages.AbstractFindUsagesTest.doTest[LocalVariableDescriptor]

'virtualFile' @ [125:117] ==> public final val PsiFile.virtualFile: (VirtualFile..VirtualFile?)[MyPropertyDescriptor]

'parser' @ [127:27] ==> val parser: OptionsParser? defined in org.jetbrains.kotlin.findUsages.AbstractFindUsagesTest.doTest[LocalVariableDescriptor]

'parse' @ [127:35] ==> public abstract fun parse(text: String, project: Project): FindUsagesOptions defined in org.jetbrains.kotlin.findUsages.OptionsParser[SimpleFunctionDescriptorImpl]

'mainFileText' @ [127:41] ==> val mainFileText: String defined in org.jetbrains.kotlin.findUsages.AbstractFindUsagesTest.doTest[LocalVariableDescriptor]

'project' @ [127:55] ==> public final val AbstractFindUsagesTest.project: Project[MyPropertyDescriptor]

'if (isLibraryElement) {
                val originalElement = caretElement.originalElement
                findUsagesAndCheckResults(mainFileText, prefix, rootPath, originalElement, options, project)

                val navigationElement = caretElement.navigationElement
                if (navigationElement !== originalElement) {
                    findUsagesAndCheckResults(mainFileText, prefix, rootPath, navigationElement, options, project)
                }
            }
            else {
                findUsagesAndCheckResults(mainFileText, prefix, rootPath, caretElement, options, project)
            }' @ [130:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'isLibraryElement' @ [130:17] ==> val isLibraryElement: Boolean defined in org.jetbrains.kotlin.findUsages.AbstractFindUsagesTest.doTest[LocalVariableDescriptor]

'caretElement' @ [131:39] ==> val caretElement: PsiElement defined in org.jetbrains.kotlin.findUsages.AbstractFindUsagesTest.doTest[LocalVariableDescriptor]

'originalElement' @ [131:52] ==> public final val PsiElement.originalElement: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'findUsagesAndCheckResults' @ [132:17] ==> internal fun <T : PsiElement> findUsagesAndCheckResults(mainFileText: String, prefix: String, rootPath: String, caretElement: (PsiElement..PsiElement?), options: FindUsagesOptions?, project: Project, alwaysAppendFileName: Boolean = ...): Unit defined in org.jetbrains.kotlin.findUsages[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : PsiElement> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)

'mainFileText' @ [132:43] ==> val mainFileText: String defined in org.jetbrains.kotlin.findUsages.AbstractFindUsagesTest.doTest[LocalVariableDescriptor]

'prefix' @ [132:57] ==> val prefix: String defined in org.jetbrains.kotlin.findUsages.AbstractFindUsagesTest.doTest[LocalVariableDescriptor]

'rootPath' @ [132:65] ==> val rootPath: String defined in org.jetbrains.kotlin.findUsages.AbstractFindUsagesTest.doTest[LocalVariableDescriptor]

'originalElement' @ [132:75] ==> val originalElement: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.findUsages.AbstractFindUsagesTest.doTest[LocalVariableDescriptor]

'options' @ [132:92] ==> val options: FindUsagesOptions? defined in org.jetbrains.kotlin.findUsages.AbstractFindUsagesTest.doTest[LocalVariableDescriptor]

'project' @ [132:101] ==> public final val AbstractFindUsagesTest.project: Project[MyPropertyDescriptor]

'caretElement' @ [134:41] ==> val caretElement: PsiElement defined in org.jetbrains.kotlin.findUsages.AbstractFindUsagesTest.doTest[LocalVariableDescriptor]

'navigationElement' @ [134:54] ==> public final val PsiElement.navigationElement: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'navigationElement' @ [135:21] ==> val navigationElement: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.findUsages.AbstractFindUsagesTest.doTest[LocalVariableDescriptor]

'originalElement' @ [135:43] ==> val originalElement: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.findUsages.AbstractFindUsagesTest.doTest[LocalVariableDescriptor]

'findUsagesAndCheckResults' @ [136:21] ==> internal fun <T : PsiElement> findUsagesAndCheckResults(mainFileText: String, prefix: String, rootPath: String, caretElement: (PsiElement..PsiElement?), options: FindUsagesOptions?, project: Project, alwaysAppendFileName: Boolean = ...): Unit defined in org.jetbrains.kotlin.findUsages[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : PsiElement> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)

'mainFileText' @ [136:47] ==> val mainFileText: String defined in org.jetbrains.kotlin.findUsages.AbstractFindUsagesTest.doTest[LocalVariableDescriptor]

'prefix' @ [136:61] ==> val prefix: String defined in org.jetbrains.kotlin.findUsages.AbstractFindUsagesTest.doTest[LocalVariableDescriptor]

'rootPath' @ [136:69] ==> val rootPath: String defined in org.jetbrains.kotlin.findUsages.AbstractFindUsagesTest.doTest[LocalVariableDescriptor]

'navigationElement' @ [136:79] ==> val navigationElement: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.findUsages.AbstractFindUsagesTest.doTest[LocalVariableDescriptor]

'options' @ [136:98] ==> val options: FindUsagesOptions? defined in org.jetbrains.kotlin.findUsages.AbstractFindUsagesTest.doTest[LocalVariableDescriptor]

'project' @ [136:107] ==> public final val AbstractFindUsagesTest.project: Project[MyPropertyDescriptor]

'findUsagesAndCheckResults' @ [140:17] ==> internal fun <T : PsiElement> findUsagesAndCheckResults(mainFileText: String, prefix: String, rootPath: String, caretElement: PsiElement, options: FindUsagesOptions?, project: Project, alwaysAppendFileName: Boolean = ...): Unit defined in org.jetbrains.kotlin.findUsages[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : PsiElement> -> PsiElement

'mainFileText' @ [140:43] ==> val mainFileText: String defined in org.jetbrains.kotlin.findUsages.AbstractFindUsagesTest.doTest[LocalVariableDescriptor]

'prefix' @ [140:57] ==> val prefix: String defined in org.jetbrains.kotlin.findUsages.AbstractFindUsagesTest.doTest[LocalVariableDescriptor]

'rootPath' @ [140:65] ==> val rootPath: String defined in org.jetbrains.kotlin.findUsages.AbstractFindUsagesTest.doTest[LocalVariableDescriptor]

'caretElement' @ [140:75] ==> val caretElement: PsiElement defined in org.jetbrains.kotlin.findUsages.AbstractFindUsagesTest.doTest[LocalVariableDescriptor]

'options' @ [140:89] ==> val options: FindUsagesOptions? defined in org.jetbrains.kotlin.findUsages.AbstractFindUsagesTest.doTest[LocalVariableDescriptor]

'project' @ [140:98] ==> public final val AbstractFindUsagesTest.project: Project[MyPropertyDescriptor]

'fixtureClasses' @ [144:13] ==> val fixtureClasses: (MutableList<(String..String?)>..List<(String..String?)>) defined in org.jetbrains.kotlin.findUsages.AbstractFindUsagesTest.doTest[LocalVariableDescriptor]

'forEach' @ [144:28] ==> @HidesMembers public inline fun <T> Iterable<(String..String?)>.forEach(action: ((String..String?)) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.String..kotlin.String?)

'TestFixtureExtension' @ [144:38] ==> public companion object defined in org.jetbrains.kotlin.idea.test.TestFixtureExtension[FakeCallableDescriptorForObject]

'unloadFixture' @ [144:59] ==> public final fun unloadFixture(className: String): Unit defined in org.jetbrains.kotlin.idea.test.TestFixtureExtension.Companion[SimpleFunctionDescriptorImpl]

'it' @ [144:73] ==> value-parameter it: (String..String?) defined in org.jetbrains.kotlin.findUsages.AbstractFindUsagesTest.doTest.<anonymous>[ValueParameterDescriptorImpl]

'setOf' @ [150:36] ==> public fun <T> setOf(vararg elements: String): Set<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'UsageViewPresentation' @ [152:39] ==> public constructor UsageViewPresentation() defined in com.intellij.usages.UsageViewPresentation[JavaClassConstructorDescriptor]

'usageInfos' @ [158:20] ==> value-parameter usageInfos: Collection<UsageInfo> defined in org.jetbrains.kotlin.findUsages.AbstractFindUsagesTest.Companion.getUsageAdapters[ValueParameterDescriptorImpl]

'map' @ [159:22] ==> public inline fun <T, R> Iterable<UsageInfo>.map(transform: (UsageInfo) -> UsageInfo2UsageAdapter): List<UsageInfo2UsageAdapter> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> UsageInfo
    <R> -> UsageInfo2UsageAdapter

'UsageInfo2UsageAdapter' @ [159:28] ==> public constructor UsageInfo2UsageAdapter(@NotNull p0: UsageInfo) defined in com.intellij.usages.UsageInfo2UsageAdapter[JavaClassConstructorDescriptor]

'filter' @ [160:22] ==> public inline fun <T> Iterable<UsageInfo2UsageAdapter>.filter(predicate: (UsageInfo2UsageAdapter) -> Boolean): List<UsageInfo2UsageAdapter> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> UsageInfo2UsageAdapter

'filters' @ [160:47] ==> value-parameter filters: Collection<UsageFilteringRule> defined in org.jetbrains.kotlin.findUsages.AbstractFindUsagesTest.Companion.getUsageAdapters[ValueParameterDescriptorImpl]

'all' @ [160:55] ==> public inline fun <T> Iterable<UsageFilteringRule>.all(predicate: (UsageFilteringRule) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> UsageFilteringRule

'it' @ [160:61] ==> value-parameter it: UsageFilteringRule defined in org.jetbrains.kotlin.findUsages.AbstractFindUsagesTest.Companion.getUsageAdapters.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'isVisible' @ [160:64] ==> @Deprecated public open fun isVisible(@NotNull p0: Usage): Boolean defined in com.intellij.usages.rules.UsageFilteringRule[JavaMethodDescriptor]

'usageAdapter' @ [160:74] ==> value-parameter usageAdapter: UsageInfo2UsageAdapter defined in org.jetbrains.kotlin.findUsages.AbstractFindUsagesTest.Companion.getUsageAdapters.<anonymous>[ValueParameterDescriptorImpl]

'element' @ [164:17] ==> value-parameter element: PsiElement? defined in org.jetbrains.kotlin.findUsages.AbstractFindUsagesTest.Companion.getUsageType[ValueParameterDescriptorImpl]

'element' @ [166:17] ==> value-parameter element: PsiElement? defined in org.jetbrains.kotlin.findUsages.AbstractFindUsagesTest.Companion.getUsageType[ValueParameterDescriptorImpl]

'getNonStrictParentOfType' @ [166:25] ==> public inline fun <reified T : PsiElement> PsiElement.getNonStrictParentOfType(): PsiComment? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> PsiComment

'COMMENT_USAGE' @ [167:34] ==> public final val COMMENT_USAGE: (UsageType..UsageType?) defined in com.intellij.usages.impl.rules.UsageType[JavaPropertyDescriptor]

'getExtensions' @ [170:40] ==> @NotNull public open fun <T : (Any..Any?)> getExtensions(@NotNull p0: ExtensionPointName<(UsageTypeProvider..UsageTypeProvider?)>): (Array<(UsageTypeProvider..UsageTypeProvider?)>..Array<out (UsageTypeProvider..UsageTypeProvider?)>) defined in com.intellij.openapi.extensions.Extensions[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (com.intellij.usages.impl.rules.UsageTypeProvider..com.intellij.usages.impl.rules.UsageTypeProvider?)

'EP_NAME' @ [170:72] ==> public final val EP_NAME: (ExtensionPointName<(UsageTypeProvider..UsageTypeProvider?)>..ExtensionPointName<(UsageTypeProvider..UsageTypeProvider?)>?) defined in com.intellij.usages.impl.rules.UsageTypeProvider[JavaPropertyDescriptor]

'providers' @ [171:20] ==> val providers: (Array<(UsageTypeProvider..UsageTypeProvider?)>..Array<out (UsageTypeProvider..UsageTypeProvider?)>) defined in org.jetbrains.kotlin.findUsages.AbstractFindUsagesTest.Companion.getUsageType[LocalVariableDescriptor]

'mapNotNull' @ [172:29] ==> public inline fun <T, R : Any> Array<out (UsageTypeProvider..UsageTypeProvider?)>.mapNotNull(transform: ((UsageTypeProvider..UsageTypeProvider?)) -> UsageType?): List<UsageType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.usages.impl.rules.UsageTypeProvider..com.intellij.usages.impl.rules.UsageTypeProvider?)
    <R : Any> -> UsageType

'it' @ [172:42] ==> value-parameter it: (UsageTypeProvider..UsageTypeProvider?) defined in org.jetbrains.kotlin.findUsages.AbstractFindUsagesTest.Companion.getUsageType.<anonymous>[ValueParameterDescriptorImpl]

'getUsageType' @ [172:45] ==> @Nullable public abstract fun getUsageType(p0: (PsiElement..PsiElement?)): UsageType? defined in com.intellij.usages.impl.rules.UsageTypeProvider[JavaMethodDescriptor]

'element' @ [172:58] ==> value-parameter element: PsiElement? defined in org.jetbrains.kotlin.findUsages.AbstractFindUsagesTest.Companion.getUsageType[ValueParameterDescriptorImpl]

'firstOrNull' @ [173:29] ==> public fun <T> List<UsageType>.firstOrNull(): UsageType? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> UsageType

'UNCLASSIFIED' @ [174:33] ==> public final val UNCLASSIFIED: (UsageType..UsageType?) defined in com.intellij.usages.impl.rules.UsageType[JavaPropertyDescriptor]

'findLinesWithPrefixesRemoved' @ [178:65] ==> @NotNull public open fun findLinesWithPrefixesRemoved(p0: (String..String?), vararg p1: (String..String?)): (MutableList<(String..String?)>..List<(String..String?)>) defined in org.jetbrains.kotlin.test.InTextDirectivesUtils[JavaMethodDescriptor]

'mainFileText' @ [178:94] ==> value-parameter mainFileText: String defined in org.jetbrains.kotlin.findUsages.AbstractFindUsagesTest.Companion.instantiateClasses[ValueParameterDescriptorImpl]

'directive' @ [178:108] ==> value-parameter directive: String defined in org.jetbrains.kotlin.findUsages.AbstractFindUsagesTest.Companion.instantiateClasses[ValueParameterDescriptorImpl]

'filteringRuleClassNames' @ [179:20] ==> val filteringRuleClassNames: (MutableList<(String..String?)>..List<(String..String?)>) defined in org.jetbrains.kotlin.findUsages.AbstractFindUsagesTest.Companion.instantiateClasses[LocalVariableDescriptor]

'map' @ [180:22] ==> public inline fun <T, R> Iterable<(String..String?)>.map(transform: ((String..String?)) -> T): List<T> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.String..kotlin.String?)
    <R> -> T

'Suppress' @ [181:25] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'forName' @ [182:32] ==> @CallerSensitive public open fun forName(p0: (String..String?)): (Class<*>..Class<*>?) defined in java.lang.Class[JavaMethodDescriptor]

'it' @ [182:40] ==> value-parameter it: (String..String?) defined in org.jetbrains.kotlin.findUsages.AbstractFindUsagesTest.Companion.instantiateClasses.<anonymous>[ValueParameterDescriptorImpl]

'newInstance' @ [182:44] ==> @CallerSensitive public open fun newInstance(): (Any..Any?) defined in java.lang.Class[JavaMethodDescriptor]

'isDirectiveDefined' @ [197:50] ==> public open fun isDirectiveDefined(p0: (String..String?), p1: (String..String?)): Boolean defined in org.jetbrains.kotlin.test.InTextDirectivesUtils[JavaMethodDescriptor]

'mainFileText' @ [197:69] ==> value-parameter mainFileText: String defined in org.jetbrains.kotlin.findUsages.findUsagesAndCheckResults[ValueParameterDescriptorImpl]

'ArrayList' @ [200:19] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> String

'ExpressionsOfTypeProcessor' @ [202:13] ==> public companion object defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor[FakeCallableDescriptorForObject]

'mode' @ [202:40] ==> public final var mode: ExpressionsOfTypeProcessor.Mode defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.Companion[DeserializedPropertyDescriptor]

'ExpressionsOfTypeProcessor' @ [202:49] ==> public companion object defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor[FakeCallableDescriptorForObject]

'ALWAYS_PLAIN' @ [202:81] ==> enum entry ALWAYS_PLAIN defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.Mode[FakeCallableDescriptorForObject]

'ExpressionsOfTypeProcessor' @ [203:13] ==> public companion object defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor[FakeCallableDescriptorForObject]

'testLog' @ [203:40] ==> public final var testLog: MutableList<String>? defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.Companion[DeserializedPropertyDescriptor]

'logList' @ [203:50] ==> val logList: ArrayList<String> defined in org.jetbrains.kotlin.findUsages.findUsagesAndCheckResults[LocalVariableDescriptor]

'isDirectiveDefined' @ [206:35] ==> public open fun isDirectiveDefined(p0: (String..String?), p1: (String..String?)): Boolean defined in org.jetbrains.kotlin.test.InTextDirectivesUtils[JavaMethodDescriptor]

'mainFileText' @ [206:54] ==> value-parameter mainFileText: String defined in org.jetbrains.kotlin.findUsages.findUsagesAndCheckResults[ValueParameterDescriptorImpl]

'ExpressionsOfTypeProcessor' @ [207:13] ==> public companion object defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor[FakeCallableDescriptorForObject]

'mode' @ [207:40] ==> public final var mode: ExpressionsOfTypeProcessor.Mode defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.Companion[DeserializedPropertyDescriptor]

'ExpressionsOfTypeProcessor' @ [207:47] ==> public companion object defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor[FakeCallableDescriptorForObject]

'PLAIN_WHEN_NEEDED' @ [207:79] ==> enum entry PLAIN_WHEN_NEEDED defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.Mode[FakeCallableDescriptorForObject]

'!=' @ [211:17] ==> public open fun equals(other: Any?): Boolean defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'findLinesWithPrefixesRemoved' @ [211:39] ==> @NotNull public open fun findLinesWithPrefixesRemoved(p0: (String..String?), vararg p1: (String..String?)): (MutableList<(String..String?)>..List<(String..String?)>) defined in org.jetbrains.kotlin.test.InTextDirectivesUtils[JavaMethodDescriptor]

'mainFileText' @ [211:68] ==> value-parameter mainFileText: String defined in org.jetbrains.kotlin.findUsages.findUsagesAndCheckResults[ValueParameterDescriptorImpl]

'CHECK_SUPER_METHODS_YES_NO_DIALOG' @ [211:82] ==> public val CHECK_SUPER_METHODS_YES_NO_DIALOG: String defined in org.jetbrains.kotlin.idea.refactoring[DeserializedPropertyDescriptor]

'firstOrNull' @ [211:123] ==> public fun <T> List<(String..String?)>.firstOrNull(): String? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.String..kotlin.String?)

'findUsages' @ [213:9] ==> internal fun findUsages(targetElement: PsiElement, options: FindUsagesOptions?, highlightingMode: Boolean, project: Project, searchSuperDeclaration: Boolean = ...): Collection<UsageInfo> defined in org.jetbrains.kotlin.findUsages in file AbstractFindUsagesTest.kt[SimpleFunctionDescriptorImpl]

'caretElement' @ [213:20] ==> value-parameter caretElement: T defined in org.jetbrains.kotlin.findUsages.findUsagesAndCheckResults[ValueParameterDescriptorImpl]

'options' @ [213:34] ==> value-parameter options: FindUsagesOptions? defined in org.jetbrains.kotlin.findUsages.findUsagesAndCheckResults[ValueParameterDescriptorImpl]

'highlightingMode' @ [213:43] ==> val highlightingMode: Boolean defined in org.jetbrains.kotlin.findUsages.findUsagesAndCheckResults[LocalVariableDescriptor]

'project' @ [213:61] ==> value-parameter project: Project defined in org.jetbrains.kotlin.findUsages.findUsagesAndCheckResults[ValueParameterDescriptorImpl]

'searchSuperDeclaration' @ [213:70] ==> val searchSuperDeclaration: Boolean defined in org.jetbrains.kotlin.findUsages.findUsagesAndCheckResults[LocalVariableDescriptor]

'ExpressionsOfTypeProcessor' @ [216:9] ==> public companion object defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor[FakeCallableDescriptorForObject]

'testLog' @ [216:36] ==> public final var testLog: MutableList<String>? defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.Companion[DeserializedPropertyDescriptor]

'logList' @ [217:13] ==> val logList: ArrayList<String> defined in org.jetbrains.kotlin.findUsages.findUsagesAndCheckResults[LocalVariableDescriptor]

'size' @ [217:21] ==> public open val size: Int defined in java.util.ArrayList[JavaPropertyDescriptor]

'log' @ [218:13] ==> var log: String? defined in org.jetbrains.kotlin.findUsages.findUsagesAndCheckResults[LocalVariableDescriptor]

'logList' @ [218:19] ==> val logList: ArrayList<String> defined in org.jetbrains.kotlin.findUsages.findUsagesAndCheckResults[LocalVariableDescriptor]

'sorted' @ [218:27] ==> public fun <T : Comparable<String>> Iterable<String>.sorted(): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Comparable<T>> -> String

'joinToString' @ [218:36] ==> public fun <T> Iterable<String>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((String) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'ExpressionsOfTypeProcessor' @ [221:9] ==> public companion object defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor[FakeCallableDescriptorForObject]

'mode' @ [221:36] ==> public final var mode: ExpressionsOfTypeProcessor.Mode defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.Companion[DeserializedPropertyDescriptor]

'ExpressionsOfTypeProcessor' @ [221:43] ==> public companion object defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor[FakeCallableDescriptorForObject]

'ALWAYS_SMART' @ [221:75] ==> enum entry ALWAYS_SMART defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.Mode[FakeCallableDescriptorForObject]

'AbstractFindUsagesTest' @ [224:26] ==> public companion object defined in org.jetbrains.kotlin.findUsages.AbstractFindUsagesTest[FakeCallableDescriptorForObject]

'instantiateClasses' @ [224:49] ==> internal final fun <T> instantiateClasses(mainFileText: String, directive: String): Collection<UsageFilteringRule> defined in org.jetbrains.kotlin.findUsages.AbstractFindUsagesTest.Companion[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> UsageFilteringRule

'mainFileText' @ [224:88] ==> value-parameter mainFileText: String defined in org.jetbrains.kotlin.findUsages.findUsagesAndCheckResults[ValueParameterDescriptorImpl]

'AbstractFindUsagesTest' @ [225:25] ==> public companion object defined in org.jetbrains.kotlin.findUsages.AbstractFindUsagesTest[FakeCallableDescriptorForObject]

'instantiateClasses' @ [225:48] ==> internal final fun <T> instantiateClasses(mainFileText: String, directive: String): Collection<UsageGroupingRule> defined in org.jetbrains.kotlin.findUsages.AbstractFindUsagesTest.Companion[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> UsageGroupingRule

'mainFileText' @ [225:86] ==> value-parameter mainFileText: String defined in org.jetbrains.kotlin.findUsages.findUsagesAndCheckResults[ValueParameterDescriptorImpl]

'AbstractFindUsagesTest' @ [227:26] ==> public companion object defined in org.jetbrains.kotlin.findUsages.AbstractFindUsagesTest[FakeCallableDescriptorForObject]

'getUsageAdapters' @ [227:49] ==> internal final fun getUsageAdapters(filters: Collection<UsageFilteringRule>, usageInfos: Collection<UsageInfo>): Collection<UsageInfo2UsageAdapter> defined in org.jetbrains.kotlin.findUsages.AbstractFindUsagesTest.Companion[SimpleFunctionDescriptorImpl]

'filteringRules' @ [227:66] ==> val filteringRules: Collection<UsageFilteringRule> defined in org.jetbrains.kotlin.findUsages.findUsagesAndCheckResults[LocalVariableDescriptor]

'usageInfos' @ [227:82] ==> val usageInfos: Collection<UsageInfo> defined in org.jetbrains.kotlin.findUsages.findUsagesAndCheckResults[LocalVariableDescriptor]

'filteredUsages' @ [229:22] ==> val filteredUsages: Collection<UsageInfo2UsageAdapter> defined in org.jetbrains.kotlin.findUsages.findUsagesAndCheckResults[LocalVariableDescriptor]

'map' @ [229:37] ==> public inline fun <T, R> Iterable<UsageInfo2UsageAdapter>.map(transform: (UsageInfo2UsageAdapter) -> String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> UsageInfo2UsageAdapter
    <R> -> String

'it' @ [229:43] ==> value-parameter it: UsageInfo2UsageAdapter defined in org.jetbrains.kotlin.findUsages.findUsagesAndCheckResults.<anonymous>[ValueParameterDescriptorImpl]

'file' @ [229:46] ==> public final val UsageInfo2UsageAdapter.file: (VirtualFile..VirtualFile?)[MyPropertyDescriptor]

'name' @ [229:51] ==> public final val VirtualFile.name: String[MyPropertyDescriptor]

'distinct' @ [229:58] ==> public fun <T> Iterable<String>.distinct(): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'alwaysAppendFileName' @ [230:26] ==> value-parameter alwaysAppendFileName: Boolean = ... defined in org.jetbrains.kotlin.findUsages.findUsagesAndCheckResults[ValueParameterDescriptorImpl]

'usageFiles' @ [230:50] ==> val usageFiles: List<String> defined in org.jetbrains.kotlin.findUsages.findUsagesAndCheckResults[LocalVariableDescriptor]

'size' @ [230:61] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'groupingRules' @ [233:29] ==> val groupingRules: Collection<UsageGroupingRule> defined in org.jetbrains.kotlin.findUsages.findUsagesAndCheckResults[LocalVariableDescriptor]

'map' @ [234:18] ==> public inline fun <T, R> Iterable<UsageGroupingRule>.map(transform: (UsageGroupingRule) -> String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> UsageGroupingRule
    <R> -> String

'it' @ [234:24] ==> value-parameter it: UsageGroupingRule defined in org.jetbrains.kotlin.findUsages.findUsagesAndCheckResults.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'groupUsage' @ [234:27] ==> @Nullable @Deprecated public open fun groupUsage(@NotNull p0: Usage): UsageGroup? defined in com.intellij.usages.rules.UsageGroupingRule[JavaMethodDescriptor]

'usageAdapter' @ [234:38] ==> value-parameter usageAdapter: UsageInfo2UsageAdapter defined in org.jetbrains.kotlin.findUsages.findUsagesAndCheckResults.<anonymous>[ValueParameterDescriptorImpl]

'getText' @ [234:53] ==> @NotNull public abstract fun getText(@Nullable p0: UsageView?): String defined in com.intellij.usages.UsageGroup[JavaMethodDescriptor]

'joinToString' @ [235:18] ==> public fun <T> Iterable<String>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((String) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'!' @ [236:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'groupAsString' @ [236:14] ==> var groupAsString: String defined in org.jetbrains.kotlin.findUsages.findUsagesAndCheckResults.<anonymous>[LocalVariableDescriptor]

'isEmpty' @ [236:28] ==> @InlineOnly public inline fun CharSequence.isEmpty(): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'groupAsString' @ [237:13] ==> var groupAsString: String defined in org.jetbrains.kotlin.findUsages.findUsagesAndCheckResults.<anonymous>[LocalVariableDescriptor]

'groupAsString' @ [237:32] ==> var groupAsString: String defined in org.jetbrains.kotlin.findUsages.findUsagesAndCheckResults.<anonymous>[LocalVariableDescriptor]

'AbstractFindUsagesTest' @ [240:25] ==> public companion object defined in org.jetbrains.kotlin.findUsages.AbstractFindUsagesTest[FakeCallableDescriptorForObject]

'getUsageType' @ [240:48] ==> internal final fun getUsageType(element: PsiElement?): UsageType? defined in org.jetbrains.kotlin.findUsages.AbstractFindUsagesTest.Companion[SimpleFunctionDescriptorImpl]

'usageAdapter' @ [240:61] ==> value-parameter usageAdapter: UsageInfo2UsageAdapter defined in org.jetbrains.kotlin.findUsages.findUsagesAndCheckResults.<anonymous>[ValueParameterDescriptorImpl]

'element' @ [240:74] ==> public final val UsageInfo2UsageAdapter.element: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'usageType' @ [241:33] ==> val usageType: UsageType? defined in org.jetbrains.kotlin.findUsages.findUsagesAndCheckResults.<anonymous>[LocalVariableDescriptor]

'toString' @ [241:44] ==> @NotNull public open fun toString(@NotNull p0: UsageViewPresentation): String defined in com.intellij.usages.impl.rules.UsageType[JavaMethodDescriptor]

'USAGE_VIEW_PRESENTATION' @ [241:76] ==> public final val USAGE_VIEW_PRESENTATION: UsageViewPresentation defined in org.jetbrains.kotlin.findUsages.AbstractFindUsagesTest.Companion[PropertyDescriptorImpl]

'ArrayList' @ [243:27] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> TextChunk

'usageChunks' @ [244:9] ==> val usageChunks: ArrayList<TextChunk> defined in org.jetbrains.kotlin.findUsages.findUsagesAndCheckResults.<anonymous>[LocalVariableDescriptor]

'addAll' @ [244:21] ==> public open fun addAll(elements: Collection<TextChunk>): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'usageAdapter' @ [244:28] ==> value-parameter usageAdapter: UsageInfo2UsageAdapter defined in org.jetbrains.kotlin.findUsages.findUsagesAndCheckResults.<anonymous>[ValueParameterDescriptorImpl]

'presentation' @ [244:41] ==> public final val UsageInfo2UsageAdapter.presentation: UsagePresentation[MyPropertyDescriptor]

'text' @ [244:54] ==> public final val UsagePresentation.text: (Array<(TextChunk..TextChunk?)>..Array<out (TextChunk..TextChunk?)>)[MyPropertyDescriptor]

'asList' @ [244:59] ==> public fun <T> Array<out (TextChunk..TextChunk?)>.asList(): List<(TextChunk..TextChunk?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.usages.TextChunk..com.intellij.usages.TextChunk?)

'usageChunks' @ [245:9] ==> val usageChunks: ArrayList<TextChunk> defined in org.jetbrains.kotlin.findUsages.findUsagesAndCheckResults.<anonymous>[LocalVariableDescriptor]

'add' @ [245:21] ==> public open fun add(index: Int, element: TextChunk): Unit defined in java.util.ArrayList[JavaMethodDescriptor]

'TextChunk' @ [245:28] ==> public constructor TextChunk(@NotNull p0: TextAttributes, @NotNull p1: String) defined in com.intellij.usages.TextChunk[JavaClassConstructorDescriptor]

'TextAttributes' @ [245:38] ==> public constructor TextAttributes() defined in com.intellij.openapi.editor.markup.TextAttributes[JavaClassConstructorDescriptor]

'buildString' @ [247:9] ==> @InlineOnly public inline fun buildString(builderAction: StringBuilder /* = StringBuilder */.() -> Unit): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'appendFileName' @ [248:17] ==> val appendFileName: Boolean defined in org.jetbrains.kotlin.findUsages.findUsagesAndCheckResults[LocalVariableDescriptor]

'append' @ [249:17] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'append' @ [249:29] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'usageAdapter' @ [249:36] ==> value-parameter usageAdapter: UsageInfo2UsageAdapter defined in org.jetbrains.kotlin.findUsages.findUsagesAndCheckResults.<anonymous>[ValueParameterDescriptorImpl]

'file' @ [249:49] ==> public final val UsageInfo2UsageAdapter.file: (VirtualFile..VirtualFile?)[MyPropertyDescriptor]

'name' @ [249:54] ==> public final val VirtualFile.name: String[MyPropertyDescriptor]

'append' @ [249:60] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'append' @ [251:13] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'usageTypeAsString' @ [251:20] ==> val usageTypeAsString: String defined in org.jetbrains.kotlin.findUsages.findUsagesAndCheckResults.<anonymous>[LocalVariableDescriptor]

'append' @ [252:13] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'append' @ [253:13] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'groupAsString' @ [253:20] ==> var groupAsString: String defined in org.jetbrains.kotlin.findUsages.findUsagesAndCheckResults.<anonymous>[LocalVariableDescriptor]

'append' @ [254:13] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'usageChunks' @ [254:20] ==> val usageChunks: ArrayList<TextChunk> defined in org.jetbrains.kotlin.findUsages.findUsagesAndCheckResults.<anonymous>[LocalVariableDescriptor]

'joinToString' @ [254:32] ==> public fun <T> Iterable<TextChunk>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((TextChunk) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TextChunk

'filteredUsages' @ [258:23] ==> val filteredUsages: Collection<UsageInfo2UsageAdapter> defined in org.jetbrains.kotlin.findUsages.findUsagesAndCheckResults[LocalVariableDescriptor]

'map' @ [258:38] ==> public inline fun <T, R> Iterable<UsageInfo2UsageAdapter>.map(transform: (UsageInfo2UsageAdapter) -> String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> UsageInfo2UsageAdapter
    <R> -> String

'convertToString' @ [258:42] ==> val convertToString: (UsageInfo2UsageAdapter) -> String defined in org.jetbrains.kotlin.findUsages.findUsagesAndCheckResults[LocalVariableDescriptor]

'sorted' @ [258:59] ==> public fun <T : Comparable<String>> Iterable<String>.sorted(): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Comparable<T>> -> String

'assertEqualsToFile' @ [259:21] ==> public open fun assertEqualsToFile(@NotNull p0: File, @NotNull p1: String): Unit defined in org.jetbrains.kotlin.test.KotlinTestUtils[JavaMethodDescriptor]

'File' @ [259:40] ==> public constructor File(p0: (String..String?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'rootPath' @ [259:45] ==> value-parameter rootPath: String defined in org.jetbrains.kotlin.findUsages.findUsagesAndCheckResults[ValueParameterDescriptorImpl]

'prefix' @ [259:55] ==> value-parameter prefix: String defined in org.jetbrains.kotlin.findUsages.findUsagesAndCheckResults[ValueParameterDescriptorImpl]

'finalUsages' @ [259:80] ==> val finalUsages: List<String> defined in org.jetbrains.kotlin.findUsages.findUsagesAndCheckResults[LocalVariableDescriptor]

'joinToString' @ [259:92] ==> public fun <T> Iterable<String>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((String) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'log' @ [261:9] ==> var log: String? defined in org.jetbrains.kotlin.findUsages.findUsagesAndCheckResults[LocalVariableDescriptor]

'assertEqualsToFile' @ [262:25] ==> public open fun assertEqualsToFile(@NotNull p0: File, @NotNull p1: String): Unit defined in org.jetbrains.kotlin.test.KotlinTestUtils[JavaMethodDescriptor]

'File' @ [262:44] ==> public constructor File(p0: (String..String?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'rootPath' @ [262:49] ==> value-parameter rootPath: String defined in org.jetbrains.kotlin.findUsages.findUsagesAndCheckResults[ValueParameterDescriptorImpl]

'prefix' @ [262:59] ==> value-parameter prefix: String defined in org.jetbrains.kotlin.findUsages.findUsagesAndCheckResults[ValueParameterDescriptorImpl]

'log' @ [262:76] ==> var log: String? defined in org.jetbrains.kotlin.findUsages.findUsagesAndCheckResults[LocalVariableDescriptor]

'ExpressionsOfTypeProcessor' @ [266:13] ==> public companion object defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor[FakeCallableDescriptorForObject]

'mode' @ [266:40] ==> public final var mode: ExpressionsOfTypeProcessor.Mode defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.Companion[DeserializedPropertyDescriptor]

'ExpressionsOfTypeProcessor' @ [266:47] ==> public companion object defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor[FakeCallableDescriptorForObject]

'ALWAYS_PLAIN' @ [266:79] ==> enum entry ALWAYS_PLAIN defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.Mode[FakeCallableDescriptorForObject]

'findUsagesAndCheckResults' @ [268:13] ==> internal fun <T : PsiElement> findUsagesAndCheckResults(mainFileText: String, prefix: String, rootPath: String, caretElement: T, options: FindUsagesOptions?, project: Project, alwaysAppendFileName: Boolean = ...): Unit defined in org.jetbrains.kotlin.findUsages[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : PsiElement> -> T

'mainFileText' @ [268:39] ==> value-parameter mainFileText: String defined in org.jetbrains.kotlin.findUsages.findUsagesAndCheckResults[ValueParameterDescriptorImpl]

'prefix' @ [268:53] ==> value-parameter prefix: String defined in org.jetbrains.kotlin.findUsages.findUsagesAndCheckResults[ValueParameterDescriptorImpl]

'rootPath' @ [268:61] ==> value-parameter rootPath: String defined in org.jetbrains.kotlin.findUsages.findUsagesAndCheckResults[ValueParameterDescriptorImpl]

'caretElement' @ [268:71] ==> value-parameter caretElement: T defined in org.jetbrains.kotlin.findUsages.findUsagesAndCheckResults[ValueParameterDescriptorImpl]

'options' @ [268:85] ==> value-parameter options: FindUsagesOptions? defined in org.jetbrains.kotlin.findUsages.findUsagesAndCheckResults[ValueParameterDescriptorImpl]

'project' @ [268:94] ==> value-parameter project: Project defined in org.jetbrains.kotlin.findUsages.findUsagesAndCheckResults[ValueParameterDescriptorImpl]

'ExpressionsOfTypeProcessor' @ [271:13] ==> public companion object defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor[FakeCallableDescriptorForObject]

'mode' @ [271:40] ==> public final var mode: ExpressionsOfTypeProcessor.Mode defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.Companion[DeserializedPropertyDescriptor]

'ExpressionsOfTypeProcessor' @ [271:47] ==> public companion object defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor[FakeCallableDescriptorForObject]

'ALWAYS_SMART' @ [271:79] ==> enum entry ALWAYS_SMART defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.Mode[FakeCallableDescriptorForObject]

'when {
            targetElement is PsiMember ->
                JavaFindUsagesHandler(targetElement, JavaFindUsagesHandlerFactory(project))
            else -> {
                if (!searchSuperDeclaration) {
                    setDialogsResult(CHECK_SUPER_METHODS_YES_NO_DIALOG, Messages.NO)
                }

                val findManagerImpl = FindManager.getInstance(project) as FindManagerImpl
                findManagerImpl.findUsagesManager.getFindUsagesHandler(targetElement, false) ?: error("Cannot find handler for: $targetElement")
            }
        }' @ [284:42] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: FindUsagesHandler, entry1: FindUsagesHandler): FindUsagesHandler[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> FindUsagesHandler

'targetElement' @ [285:13] ==> value-parameter targetElement: PsiElement defined in org.jetbrains.kotlin.findUsages.findUsages[ValueParameterDescriptorImpl]

'JavaFindUsagesHandler' @ [286:17] ==> public constructor JavaFindUsagesHandler(@NotNull p0: PsiElement, @NotNull p1: JavaFindUsagesHandlerFactory) defined in com.intellij.find.findUsages.JavaFindUsagesHandler[JavaClassConstructorDescriptor]

'targetElement' @ [286:39] ==> value-parameter targetElement: PsiElement defined in org.jetbrains.kotlin.findUsages.findUsages[ValueParameterDescriptorImpl]

'JavaFindUsagesHandlerFactory' @ [286:54] ==> public constructor JavaFindUsagesHandlerFactory(p0: (Project..Project?)) defined in com.intellij.find.findUsages.JavaFindUsagesHandlerFactory[JavaClassConstructorDescriptor]

'project' @ [286:83] ==> value-parameter project: Project defined in org.jetbrains.kotlin.findUsages.findUsages[ValueParameterDescriptorImpl]

'!' @ [288:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'searchSuperDeclaration' @ [288:22] ==> value-parameter searchSuperDeclaration: Boolean = ... defined in org.jetbrains.kotlin.findUsages.findUsages[ValueParameterDescriptorImpl]

'setDialogsResult' @ [289:21] ==> public fun setDialogsResult(key: String, result: Any): Unit defined in org.jetbrains.kotlin.idea.core.util[DeserializedSimpleFunctionDescriptor]

'CHECK_SUPER_METHODS_YES_NO_DIALOG' @ [289:38] ==> public val CHECK_SUPER_METHODS_YES_NO_DIALOG: String defined in org.jetbrains.kotlin.idea.refactoring[DeserializedPropertyDescriptor]

'NO' @ [289:82] ==> public const final val NO: Int defined in com.intellij.openapi.ui.Messages[JavaPropertyDescriptor]

'getInstance' @ [292:51] ==> public open fun getInstance(p0: (Project..Project?)): (FindManager..FindManager?) defined in com.intellij.find.FindManager[JavaMethodDescriptor]

'project' @ [292:63] ==> value-parameter project: Project defined in org.jetbrains.kotlin.findUsages.findUsages[ValueParameterDescriptorImpl]

'findManagerImpl' @ [293:17] ==> val findManagerImpl: FindManagerImpl defined in org.jetbrains.kotlin.findUsages.findUsages[LocalVariableDescriptor]

'findUsagesManager' @ [293:33] ==> public final val FindManagerImpl.findUsagesManager: FindUsagesManager[MyPropertyDescriptor]

'getFindUsagesHandler' @ [293:51] ==> @Nullable public open fun getFindUsagesHandler(@NotNull p0: PsiElement, p1: Boolean): FindUsagesHandler? defined in com.intellij.find.findUsages.FindUsagesManager[JavaMethodDescriptor]

'targetElement' @ [293:72] ==> value-parameter targetElement: PsiElement defined in org.jetbrains.kotlin.findUsages.findUsages[ValueParameterDescriptorImpl]

'error' @ [293:97] ==> @InlineOnly public inline fun error(message: Any): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'targetElement' @ [293:130] ==> value-parameter targetElement: PsiElement defined in org.jetbrains.kotlin.findUsages.findUsages[ValueParameterDescriptorImpl]

'Suppress' @ [297:9] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'options' @ [298:23] ==> value-parameter options: FindUsagesOptions? defined in org.jetbrains.kotlin.findUsages.findUsages[ValueParameterDescriptorImpl]

'handler' @ [298:34] ==> val handler: FindUsagesHandler defined in org.jetbrains.kotlin.findUsages.findUsages[LocalVariableDescriptor]

'getFindUsagesOptions' @ [298:42] ==> @NotNull public open fun getFindUsagesOptions(@Nullable p0: DataContext?): FindUsagesOptions defined in com.intellij.find.findUsages.FindUsagesHandler[JavaMethodDescriptor]

'options' @ [300:9] ==> val options: FindUsagesOptions defined in org.jetbrains.kotlin.findUsages.findUsages[LocalVariableDescriptor]

'searchScope' @ [300:17] ==> @NotNull public final var searchScope: SearchScope defined in com.intellij.find.findUsages.FindUsagesOptions[JavaPropertyDescriptor]

'allScope' @ [300:49] ==> @NotNull public open fun allScope(@NotNull p0: Project): GlobalSearchScope defined in com.intellij.psi.search.GlobalSearchScope[JavaMethodDescriptor]

'project' @ [300:58] ==> value-parameter project: Project defined in org.jetbrains.kotlin.findUsages.findUsages[ValueParameterDescriptorImpl]

'CollectProcessor' @ [302:42] ==> public constructor CollectProcessor<T : (Any..Any?)>() defined in com.intellij.util.CommonProcessors.CollectProcessor[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> UsageInfo

'handler' @ [303:28] ==> val handler: FindUsagesHandler defined in org.jetbrains.kotlin.findUsages.findUsages[LocalVariableDescriptor]

'primaryElements' @ [303:36] ==> public final val FindUsagesHandler.primaryElements: (Array<(PsiElement..PsiElement?)>..Array<out (PsiElement..PsiElement?)>)[MyPropertyDescriptor]

'handler' @ [303:54] ==> val handler: FindUsagesHandler defined in org.jetbrains.kotlin.findUsages.findUsages[LocalVariableDescriptor]

'secondaryElements' @ [303:62] ==> public final val FindUsagesHandler.secondaryElements: (Array<(PsiElement..PsiElement?)>..Array<out (PsiElement..PsiElement?)>)[MyPropertyDescriptor]

'if (highlightingMode) {
                //TODO: should findReferencesToHighlight work outside read-action or it makes no sense?
                for (reference in handler.findReferencesToHighlight(psiElement, options.searchScope)) {
                    processor.process(UsageInfo(reference))
                }
            }
            else {
                // run in another thread to test read-action assertions
                val thread = Thread {
                    handler.processElementUsages(psiElement, processor, options)
                }
                thread.start()
                thread.join()
            }' @ [304:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'highlightingMode' @ [304:17] ==> value-parameter highlightingMode: Boolean defined in org.jetbrains.kotlin.findUsages.findUsages[ValueParameterDescriptorImpl]

'handler' @ [306:35] ==> val handler: FindUsagesHandler defined in org.jetbrains.kotlin.findUsages.findUsages[LocalVariableDescriptor]

'findReferencesToHighlight' @ [306:43] ==> @NotNull public open fun findReferencesToHighlight(@NotNull p0: PsiElement, @NotNull p1: SearchScope): (MutableCollection<(PsiReference..PsiReference?)>..Collection<(PsiReference..PsiReference?)>) defined in com.intellij.find.findUsages.FindUsagesHandler[JavaMethodDescriptor]

'psiElement' @ [306:69] ==> val psiElement: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.findUsages.findUsages[LocalVariableDescriptor]

'options' @ [306:81] ==> val options: FindUsagesOptions defined in org.jetbrains.kotlin.findUsages.findUsages[LocalVariableDescriptor]

'searchScope' @ [306:89] ==> @NotNull public final var searchScope: SearchScope defined in com.intellij.find.findUsages.FindUsagesOptions[JavaPropertyDescriptor]

'processor' @ [307:21] ==> val processor: CommonProcessors.CollectProcessor<UsageInfo> defined in org.jetbrains.kotlin.findUsages.findUsages[LocalVariableDescriptor]

'process' @ [307:31] ==> public open fun process(p0: (UsageInfo..UsageInfo?)): Boolean defined in com.intellij.util.CommonProcessors.CollectProcessor[JavaMethodDescriptor]

'UsageInfo' @ [307:39] ==> public constructor UsageInfo(@NotNull p0: PsiReference) defined in com.intellij.usageView.UsageInfo[JavaClassConstructorDescriptor]

'reference' @ [307:49] ==> val reference: (PsiReference..PsiReference?) defined in org.jetbrains.kotlin.findUsages.findUsages[LocalVariableDescriptor]

'Thread' @ [312:30] ==> public constructor Thread(p0: (() -> Unit..(() -> Unit)?)) defined in java.lang.Thread[SamAdapterClassConstructorDescriptor]

'handler' @ [313:21] ==> val handler: FindUsagesHandler defined in org.jetbrains.kotlin.findUsages.findUsages[LocalVariableDescriptor]

'processElementUsages' @ [313:29] ==> public open fun processElementUsages(@NotNull p0: PsiElement, @NotNull p1: Processor<(UsageInfo..UsageInfo?)>, @NotNull p2: FindUsagesOptions): Boolean defined in com.intellij.find.findUsages.FindUsagesHandler[JavaMethodDescriptor]

'psiElement' @ [313:50] ==> val psiElement: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.findUsages.findUsages[LocalVariableDescriptor]

'processor' @ [313:62] ==> val processor: CommonProcessors.CollectProcessor<UsageInfo> defined in org.jetbrains.kotlin.findUsages.findUsages[LocalVariableDescriptor]

'options' @ [313:73] ==> val options: FindUsagesOptions defined in org.jetbrains.kotlin.findUsages.findUsages[LocalVariableDescriptor]

'thread' @ [315:17] ==> val thread: Thread defined in org.jetbrains.kotlin.findUsages.findUsages[LocalVariableDescriptor]

'start' @ [315:24] ==> public open fun start(): Unit defined in java.lang.Thread[JavaMethodDescriptor]

'thread' @ [316:17] ==> val thread: Thread defined in org.jetbrains.kotlin.findUsages.findUsages[LocalVariableDescriptor]

'join' @ [316:24] ==> public final fun join(): Unit defined in java.lang.Thread[JavaMethodDescriptor]

'processor' @ [320:16] ==> val processor: CommonProcessors.CollectProcessor<UsageInfo> defined in org.jetbrains.kotlin.findUsages.findUsages[LocalVariableDescriptor]

'results' @ [320:26] ==> public final val <T : (Any..Any?)> CommonProcessors.CollectProcessor<UsageInfo>.results: (MutableCollection<(UsageInfo..UsageInfo?)>..Collection<(UsageInfo..UsageInfo?)>)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> UsageInfo

'clearDialogsResults' @ [323:9] ==> public fun clearDialogsResults(): Unit defined in org.jetbrains.kotlin.idea.core.util[DeserializedSimpleFunctionDescriptor]

