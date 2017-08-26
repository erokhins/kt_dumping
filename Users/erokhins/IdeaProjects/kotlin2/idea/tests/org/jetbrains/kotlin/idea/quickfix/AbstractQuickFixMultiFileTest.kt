'KotlinLightCodeInsightFixtureTestCase' @ [54:48] ==> public constructor KotlinLightCodeInsightFixtureTestCase() defined in org.jetbrains.kotlin.idea.test.KotlinLightCodeInsightFixtureTestCase[ClassConstructorDescriptorImpl]

'Throws' @ [55:5] ==> public constructor Throws(vararg exceptionClasses: KClass<out Throwable>) defined in kotlin.jvm.Throws[DeserializedClassConstructorDescriptor]

'Exception' @ [55:13] ==> public final fun <init>(): Exception /* = Exception */ defined in kotlin.Exception[TypeAliasConstructorDescriptorImpl]

'enableInspections' @ [57:9] ==> @Throws private final fun enableInspections(beforeFileName: String): Unit defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest[SimpleFunctionDescriptorImpl]

'beforeFileName' @ [57:27] ==> value-parameter beforeFileName: String defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest.doTestWithExtraFile[ValueParameterDescriptorImpl]

'if (beforeFileName.endsWith(".test")) {
            doMultiFileTest(beforeFileName)
        }
        else {
            doTest(beforeFileName)
        }' @ [59:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'beforeFileName' @ [59:13] ==> value-parameter beforeFileName: String defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest.doTestWithExtraFile[ValueParameterDescriptorImpl]

'endsWith' @ [59:28] ==> public fun String.endsWith(suffix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'doMultiFileTest' @ [60:13] ==> @Throws protected final fun doMultiFileTest(beforeFileName: String): Unit defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest[SimpleFunctionDescriptorImpl]

'beforeFileName' @ [60:29] ==> value-parameter beforeFileName: String defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest.doTestWithExtraFile[ValueParameterDescriptorImpl]

'doTest' @ [63:13] ==> @Throws private final fun doTest(beforeFileName: String): Unit defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest[SimpleFunctionDescriptorImpl]

'beforeFileName' @ [63:20] ==> value-parameter beforeFileName: String defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest.doTestWithExtraFile[ValueParameterDescriptorImpl]

'Throws' @ [67:5] ==> public constructor Throws(vararg exceptionClasses: KClass<out Throwable>) defined in kotlin.jvm.Throws[DeserializedClassConstructorDescriptor]

'IOException' @ [67:13] ==> public constructor IOException() defined in java.io.IOException[JavaClassConstructorDescriptor]

'ClassNotFoundException' @ [67:33] ==> public constructor ClassNotFoundException() defined in java.lang.ClassNotFoundException[JavaClassConstructorDescriptor]

'findInspectionFile' @ [69:30] ==> public fun findInspectionFile(startDir: File): File? defined in org.jetbrains.kotlin.idea.quickfix.utils in file quickfixTestUtils.kt[SimpleFunctionDescriptorImpl]

'File' @ [69:49] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'beforeFileName' @ [69:54] ==> value-parameter beforeFileName: String defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest.enableInspections[ValueParameterDescriptorImpl]

'parentFile' @ [69:70] ==> public final val File.parentFile: (File..File?)[MyPropertyDescriptor]

'inspectionFile' @ [70:13] ==> val inspectionFile: File? defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest.enableInspections[LocalVariableDescriptor]

'loadFile' @ [71:38] ==> @NotNull public open fun loadFile(@NotNull p0: File): String defined in com.intellij.openapi.util.io.FileUtil[JavaMethodDescriptor]

'inspectionFile' @ [71:47] ==> val inspectionFile: File? defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest.enableInspections[LocalVariableDescriptor]

'trim' @ [71:63] ==> public inline fun String.trim(predicate: (Char) -> Boolean): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'it' @ [71:70] ==> value-parameter it: Char defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest.enableInspections.<anonymous>[ValueParameterDescriptorImpl]

'forName' @ [72:41] ==> @CallerSensitive public open fun forName(p0: (String..String?)): (Class<*>..Class<*>?) defined in java.lang.Class[JavaMethodDescriptor]

'className' @ [72:49] ==> val className: String defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest.enableInspections[LocalVariableDescriptor]

'enableInspectionTools' @ [73:13] ==> private final fun enableInspectionTools(klass: Class<*>): Unit defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest[SimpleFunctionDescriptorImpl]

'inspectionClass' @ [73:35] ==> val inspectionClass: (Class<*>..Class<*>?) defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest.enableInspections[LocalVariableDescriptor]

'newArrayList' @ [78:33] ==> @NotNull @Contract public open fun <T : (Any..Any?)> newArrayList(): ArrayList<(InspectionEP..InspectionEP?)> defined in com.intellij.util.containers.ContainerUtil[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> InspectionEP

'addAll' @ [79:23] ==> @NotNull public open fun <T : (Any..Any?), A : (InspectionEP..InspectionEP?), C : (MutableCollection<(InspectionEP..InspectionEP?)>..Collection<(InspectionEP..InspectionEP?)>?)> addAll(@NotNull p0: List<InspectionEP>, @NotNull vararg p1: (LocalInspectionEP..LocalInspectionEP?)): List<InspectionEP> defined in com.intellij.util.containers.ContainerUtil[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> InspectionEP
    <A : (T..T?)> -> LocalInspectionEP
    <C : (MutableCollection<(T..T?)>..Collection<(T..T?)>?)> -> List<InspectionEP>

'eps' @ [79:83] ==> val eps: ArrayList<(InspectionEP..InspectionEP?)> defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest.enableInspectionTools[LocalVariableDescriptor]

'getExtensions' @ [79:100] ==> @NotNull public open fun <T : (Any..Any?)> getExtensions(@NotNull p0: ExtensionPointName<(LocalInspectionEP..LocalInspectionEP?)>): (Array<(LocalInspectionEP..LocalInspectionEP?)>..Array<out (LocalInspectionEP..LocalInspectionEP?)>) defined in com.intellij.openapi.extensions.Extensions[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (com.intellij.codeInspection.LocalInspectionEP..com.intellij.codeInspection.LocalInspectionEP?)

'LOCAL_INSPECTION' @ [79:132] ==> public final val LOCAL_INSPECTION: (ExtensionPointName<(LocalInspectionEP..LocalInspectionEP?)>..ExtensionPointName<(LocalInspectionEP..LocalInspectionEP?)>?) defined in com.intellij.codeInspection.LocalInspectionEP[JavaPropertyDescriptor]

'addAll' @ [80:23] ==> @NotNull public open fun <T : (Any..Any?), A : (InspectionEP..InspectionEP?), C : (MutableCollection<(InspectionEP..InspectionEP?)>..Collection<(InspectionEP..InspectionEP?)>?)> addAll(@NotNull p0: List<InspectionEP>, @NotNull vararg p1: (InspectionEP..InspectionEP?)): List<InspectionEP> defined in com.intellij.util.containers.ContainerUtil[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> InspectionEP
    <A : (T..T?)> -> InspectionEP
    <C : (MutableCollection<(T..T?)>..Collection<(T..T?)>?)> -> List<InspectionEP>

'eps' @ [80:78] ==> val eps: ArrayList<(InspectionEP..InspectionEP?)> defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest.enableInspectionTools[LocalVariableDescriptor]

'getExtensions' @ [80:95] ==> @NotNull public open fun <T : (Any..Any?)> getExtensions(@NotNull p0: ExtensionPointName<(InspectionEP..InspectionEP?)>): (Array<(InspectionEP..InspectionEP?)>..Array<out (InspectionEP..InspectionEP?)>) defined in com.intellij.openapi.extensions.Extensions[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (com.intellij.codeInspection.InspectionEP..com.intellij.codeInspection.InspectionEP?)

'GLOBAL_INSPECTION' @ [80:122] ==> public final val GLOBAL_INSPECTION: (ExtensionPointName<(InspectionEP..InspectionEP?)>..ExtensionPointName<(InspectionEP..InspectionEP?)>?) defined in com.intellij.codeInspection.InspectionEP[JavaPropertyDescriptor]

'eps' @ [83:20] ==> val eps: ArrayList<(InspectionEP..InspectionEP?)> defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest.enableInspectionTools[LocalVariableDescriptor]

'klass' @ [84:17] ==> value-parameter klass: Class<*> defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest.enableInspectionTools[ValueParameterDescriptorImpl]

'name' @ [84:23] ==> public final val <T : (Any..Any?)> Class<out (Any..Any?)>.name: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Captured(*)

'ep' @ [84:31] ==> val ep: (InspectionEP..InspectionEP?) defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest.enableInspectionTools[LocalVariableDescriptor]

'implementationClass' @ [84:34] ==> @Attribute public final var implementationClass: (String..String?) defined in com.intellij.codeInspection.InspectionEP[JavaPropertyDescriptor]

'tool' @ [85:17] ==> var tool: InspectionProfileEntry? defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest.enableInspectionTools[LocalVariableDescriptor]

'ep' @ [85:24] ==> val ep: (InspectionEP..InspectionEP?) defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest.enableInspectionTools[LocalVariableDescriptor]

'instantiateTool' @ [85:27] ==> @NotNull public open fun instantiateTool(): InspectionProfileEntry defined in com.intellij.codeInspection.InspectionEP[JavaMethodDescriptor]

'assert' @ [88:9] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'tool' @ [88:16] ==> var tool: InspectionProfileEntry? defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest.enableInspectionTools[LocalVariableDescriptor]

'+' @ [88:32] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'klass' @ [88:79] ==> value-parameter klass: Class<*> defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest.enableInspectionTools[ValueParameterDescriptorImpl]

'myFixture' @ [90:9] ==> protected/*protected and package*/ final var myFixture: (JavaCodeInsightTestFixture..JavaCodeInsightTestFixture?) defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest[JavaPropertyDescriptor]

'enableInspections' @ [90:19] ==> public abstract fun enableInspections(@NotNull vararg p0: (InspectionProfileEntry..InspectionProfileEntry?)): Unit defined in com.intellij.testFramework.fixtures.JavaCodeInsightTestFixture[JavaMethodDescriptor]

'tool' @ [90:37] ==> var tool: InspectionProfileEntry? defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest.enableInspectionTools[LocalVariableDescriptor]

'super' @ [94:9] ==> <this> defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest[LazyClassReceiverParameterDescriptor]

'setUp' @ [94:15] ==> protected open fun setUp(): Unit defined in org.jetbrains.kotlin.idea.test.KotlinLightCodeInsightFixtureTestCase[SimpleFunctionDescriptorImpl]

'getInstance' @ [95:29] ==> public open fun getInstance(): (CodeInsightSettings..CodeInsightSettings?) defined in com.intellij.codeInsight.CodeInsightSettings[JavaMethodDescriptor]

'EXCLUDED_PACKAGES' @ [95:43] ==> @Property @AbstractCollection public final var EXCLUDED_PACKAGES: (Array<(String..String?)>..Array<out (String..String?)>?) defined in com.intellij.codeInsight.CodeInsightSettings[JavaPropertyDescriptor]

'arrayOf' @ [95:63] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: String): Array<String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> String

'getInstance' @ [99:29] ==> public open fun getInstance(): (CodeInsightSettings..CodeInsightSettings?) defined in com.intellij.codeInsight.CodeInsightSettings[JavaMethodDescriptor]

'EXCLUDED_PACKAGES' @ [99:43] ==> @Property @AbstractCollection public final var EXCLUDED_PACKAGES: (Array<(String..String?)>..Array<out (String..String?)>?) defined in com.intellij.codeInsight.CodeInsightSettings[JavaPropertyDescriptor]

'EMPTY_STRING_ARRAY' @ [99:73] ==> public final val EMPTY_STRING_ARRAY: (Array<(String..String?)>..Array<out (String..String?)>?) defined in com.intellij.util.ArrayUtil[JavaPropertyDescriptor]

'super' @ [100:9] ==> <this> defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest[LazyClassReceiverParameterDescriptor]

'tearDown' @ [100:15] ==> protected open fun tearDown(): Unit defined in org.jetbrains.kotlin.idea.test.KotlinLightCodeInsightFixtureTestCase[SimpleFunctionDescriptorImpl]

'mutableListOf' @ [109:22] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableListOf(): MutableList<VirtualFile> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> VirtualFile

'subFiles' @ [110:25] ==> value-parameter subFiles: List<AbstractQuickFixMultiFileTest.TestFile> defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest.configureMultiFileTest[ValueParameterDescriptorImpl]

'vFiles' @ [111:13] ==> val vFiles: MutableList<VirtualFile> defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest.configureMultiFileTest[LocalVariableDescriptor]

'add' @ [111:20] ==> public abstract fun add(element: VirtualFile): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'createTestFile' @ [111:24] ==> private final fun createTestFile(testFile: AbstractQuickFixMultiFileTest.TestFile): VirtualFile defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest[SimpleFunctionDescriptorImpl]

'subFile' @ [111:39] ==> val subFile: AbstractQuickFixMultiFileTest.TestFile defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest.configureMultiFileTest[LocalVariableDescriptor]

'createTestFile' @ [113:27] ==> private final fun createTestFile(testFile: AbstractQuickFixMultiFileTest.TestFile): VirtualFile defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest[SimpleFunctionDescriptorImpl]

'beforeFile' @ [113:42] ==> value-parameter beforeFile: AbstractQuickFixMultiFileTest.TestFile defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest.configureMultiFileTest[ValueParameterDescriptorImpl]

'vFiles' @ [114:9] ==> val vFiles: MutableList<VirtualFile> defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest.configureMultiFileTest[LocalVariableDescriptor]

'add' @ [114:16] ==> public abstract fun add(element: VirtualFile): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'beforeVFile' @ [114:20] ==> val beforeVFile: VirtualFile defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest.configureMultiFileTest[LocalVariableDescriptor]

'myFixture' @ [115:9] ==> protected/*protected and package*/ final var myFixture: (JavaCodeInsightTestFixture..JavaCodeInsightTestFixture?) defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest[JavaPropertyDescriptor]

'configureFromExistingVirtualFile' @ [115:19] ==> public abstract fun configureFromExistingVirtualFile(@NotNull p0: VirtualFile): Unit defined in com.intellij.testFramework.fixtures.JavaCodeInsightTestFixture[JavaMethodDescriptor]

'beforeVFile' @ [115:52] ==> val beforeVFile: VirtualFile defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest.configureMultiFileTest[LocalVariableDescriptor]

'assertEquals' @ [116:18] ==> public open fun assertEquals(p0: (Any..Any?), p1: (Any..Any?)): Unit defined in junit.framework.TestCase[JavaMethodDescriptor]

'guessFileType' @ [116:31] ==> protected final fun guessFileType(file: AbstractQuickFixMultiFileTest.TestFile): FileType defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest.Companion[SimpleFunctionDescriptorImpl]

'beforeFile' @ [116:45] ==> value-parameter beforeFile: AbstractQuickFixMultiFileTest.TestFile defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest.configureMultiFileTest[ValueParameterDescriptorImpl]

'myFixture' @ [116:58] ==> protected/*protected and package*/ final var myFixture: (JavaCodeInsightTestFixture..JavaCodeInsightTestFixture?) defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest[JavaPropertyDescriptor]

'file' @ [116:68] ==> public final val JavaCodeInsightTestFixture.file: (PsiFile..PsiFile?)[MyPropertyDescriptor]

'virtualFile' @ [116:73] ==> public final val PsiFile.virtualFile: (VirtualFile..VirtualFile?)[MyPropertyDescriptor]

'fileType' @ [116:85] ==> public final val VirtualFile.fileType: FileType[MyPropertyDescriptor]

'assertTrue' @ [118:18] ==> public open fun assertTrue(p0: (String..String?), p1: Boolean): Unit defined in junit.framework.TestCase[JavaMethodDescriptor]

'+' @ [118:29] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'beforeFile' @ [118:76] ==> value-parameter beforeFile: AbstractQuickFixMultiFileTest.TestFile defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest.configureMultiFileTest[ValueParameterDescriptorImpl]

'path' @ [118:87] ==> public final val path: String defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest.TestFile[PropertyDescriptorImpl]

'myFixture' @ [118:100] ==> protected/*protected and package*/ final var myFixture: (JavaCodeInsightTestFixture..JavaCodeInsightTestFixture?) defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest[JavaPropertyDescriptor]

'editor' @ [118:110] ==> public final val JavaCodeInsightTestFixture.editor: (Editor..Editor?)[MyPropertyDescriptor]

'caretModel' @ [118:117] ==> public final val Editor.caretModel: CaretModel[MyPropertyDescriptor]

'offset' @ [118:128] ==> public final val CaretModel.offset: Int[MyPropertyDescriptor]

'vFiles' @ [119:16] ==> val vFiles: MutableList<VirtualFile> defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest.configureMultiFileTest[LocalVariableDescriptor]

'runWriteAction' @ [123:16] ==> public fun <T> runWriteAction(action: () -> VirtualFile): VirtualFile defined in org.jetbrains.kotlin.test.testFramework[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> VirtualFile

'myFixture' @ [124:25] ==> protected/*protected and package*/ final var myFixture: (JavaCodeInsightTestFixture..JavaCodeInsightTestFixture?) defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest[JavaPropertyDescriptor]

'tempDirFixture' @ [124:35] ==> public final val JavaCodeInsightTestFixture.tempDirFixture: TempDirTestFixture[MyPropertyDescriptor]

'createFile' @ [124:50] ==> @NotNull public abstract fun createFile(@NotNull p0: String): VirtualFile defined in com.intellij.testFramework.fixtures.TempDirTestFixture[JavaMethodDescriptor]

'testFile' @ [124:61] ==> value-parameter testFile: AbstractQuickFixMultiFileTest.TestFile defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest.createTestFile[ValueParameterDescriptorImpl]

'path' @ [124:70] ==> public final val path: String defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest.TestFile[PropertyDescriptorImpl]

'vFile' @ [125:13] ==> val vFile: VirtualFile defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest.createTestFile.<anonymous>[LocalVariableDescriptor]

'setCharset' @ [125:19] ==> public open fun setCharset(p0: (Charset..Charset?)): Unit defined in com.intellij.openapi.vfs.VirtualFile[JavaMethodDescriptor]

'UTF8_CHARSET' @ [125:45] ==> public final val UTF8_CHARSET: (Charset..Charset?) defined in com.intellij.openapi.vfs.CharsetToolkit[JavaPropertyDescriptor]

'saveText' @ [126:21] ==> public open fun saveText(@NotNull p0: VirtualFile, @NotNull p1: String): Unit defined in com.intellij.openapi.vfs.VfsUtil[JavaMethodDescriptor]

'vFile' @ [126:30] ==> val vFile: VirtualFile defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest.createTestFile.<anonymous>[LocalVariableDescriptor]

'testFile' @ [126:37] ==> value-parameter testFile: AbstractQuickFixMultiFileTest.TestFile defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest.createTestFile[ValueParameterDescriptorImpl]

'content' @ [126:46] ==> public final val content: String defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest.TestFile[PropertyDescriptorImpl]

'vFile' @ [127:13] ==> val vFile: VirtualFile defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest.createTestFile.<anonymous>[LocalVariableDescriptor]

'Throws' @ [131:5] ==> public constructor Throws(vararg exceptionClasses: KClass<out Throwable>) defined in kotlin.jvm.Throws[DeserializedClassConstructorDescriptor]

'Exception' @ [131:13] ==> public final fun <init>(): Exception /* = Exception */ defined in kotlin.Exception[TypeAliasConstructorDescriptorImpl]

'loadFile' @ [133:38] ==> @NotNull public open fun loadFile(@NotNull p0: File, p1: Boolean): String defined in com.intellij.openapi.util.io.FileUtil[JavaMethodDescriptor]

'File' @ [133:47] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'beforeFileName' @ [133:52] ==> value-parameter beforeFileName: String defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest.doMultiFileTest[ValueParameterDescriptorImpl]

'createTestFiles' @ [135:40] ==> @NotNull public open fun <M : (Any..Any?), F : (Any..Any?)> createTestFiles(@Nullable p0: String?, p1: (String..String?), p2: (KotlinTestUtils.TestFileFactory<(Void..Void?), (AbstractQuickFixMultiFileTest.TestFile..AbstractQuickFixMultiFileTest.TestFile?)>..KotlinTestUtils.TestFileFactory<(Void..Void?), (AbstractQuickFixMultiFileTest.TestFile..AbstractQuickFixMultiFileTest.TestFile?)>?)): (MutableList<(AbstractQuickFixMultiFileTest.TestFile..AbstractQuickFixMultiFileTest.TestFile?)>..List<(AbstractQuickFixMultiFileTest.TestFile..AbstractQuickFixMultiFileTest.TestFile?)>) defined in org.jetbrains.kotlin.test.KotlinTestUtils[JavaMethodDescriptor]
Inferred types:
    <M : (Any..Any?)> -> (java.lang.Void..java.lang.Void?)
    <F : (Any..Any?)> -> (org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest.TestFile..org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest.TestFile?)

'multifileText' @ [137:17] ==> val multifileText: String defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest.doMultiFileTest[LocalVariableDescriptor]

'KotlinTestUtils.TestFileFactoryNoModules<TestFile>' @ [138:26] ==> public constructor TestFileFactoryNoModules<F : (Any..Any?)>() defined in org.jetbrains.kotlin.test.KotlinTestUtils.TestFileFactoryNoModules[JavaClassConstructorDescriptor]
Inferred types:
    <F : (Any..Any?)> -> TestFile

'text' @ [140:36] ==> value-parameter text: String defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest.doMultiFileTest.<no name provided>.create[ValueParameterDescriptorImpl]

'text' @ [141:29] ==> var text: String defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest.doMultiFileTest.<no name provided>.create[LocalVariableDescriptor]

'startsWith' @ [141:34] ==> public fun String.startsWith(prefix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'!!' @ [142:52] ==> public final fun <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-EXCLEXCL-RESOLVE>`(baseExpr: String?): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> -> String

'substringAfter' @ [142:63] ==> @Nullable @Contract public open fun substringAfter(@NotNull p0: String, @NotNull p1: String): String? defined in com.intellij.openapi.util.text.StringUtil[JavaMethodDescriptor]

'text' @ [142:78] ==> var text: String defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest.doMultiFileTest.<no name provided>.create[LocalVariableDescriptor]

'text' @ [144:29] ==> var text: String defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest.doMultiFileTest.<no name provided>.create[LocalVariableDescriptor]

'firstLineDropped' @ [144:36] ==> val firstLineDropped: String defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest.doMultiFileTest.<no name provided>.create[LocalVariableDescriptor]

'TestFile' @ [146:32] ==> internal constructor TestFile(path: String, content: String) defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest.TestFile[ClassConstructorDescriptorImpl]

'fileName' @ [146:41] ==> value-parameter fileName: String defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest.doMultiFileTest.<no name provided>.create[ValueParameterDescriptorImpl]

'text' @ [146:51] ==> var text: String defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest.doMultiFileTest.<no name provided>.create[LocalVariableDescriptor]

'subFiles' @ [150:25] ==> val subFiles: (MutableList<(AbstractQuickFixMultiFileTest.TestFile..AbstractQuickFixMultiFileTest.TestFile?)>..List<(AbstractQuickFixMultiFileTest.TestFile..AbstractQuickFixMultiFileTest.TestFile?)>) defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest.doMultiFileTest[LocalVariableDescriptor]

'firstOrNull' @ [150:34] ==> public inline fun <T> Iterable<(AbstractQuickFixMultiFileTest.TestFile..AbstractQuickFixMultiFileTest.TestFile?)>.firstOrNull(predicate: ((AbstractQuickFixMultiFileTest.TestFile..AbstractQuickFixMultiFileTest.TestFile?)) -> Boolean): AbstractQuickFixMultiFileTest.TestFile? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest.TestFile..org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest.TestFile?)

'file' @ [150:56] ==> value-parameter file: (AbstractQuickFixMultiFileTest.TestFile..AbstractQuickFixMultiFileTest.TestFile?) defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest.doMultiFileTest.<anonymous>[ValueParameterDescriptorImpl]

'path' @ [150:61] ==> public final val path: String defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest.TestFile[PropertyDescriptorImpl]

'contains' @ [150:66] ==> public operator fun CharSequence.contains(other: CharSequence, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'subFiles' @ [151:26] ==> val subFiles: (MutableList<(AbstractQuickFixMultiFileTest.TestFile..AbstractQuickFixMultiFileTest.TestFile?)>..List<(AbstractQuickFixMultiFileTest.TestFile..AbstractQuickFixMultiFileTest.TestFile?)>) defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest.doMultiFileTest[LocalVariableDescriptor]

'firstOrNull' @ [151:35] ==> public inline fun <T> Iterable<(AbstractQuickFixMultiFileTest.TestFile..AbstractQuickFixMultiFileTest.TestFile?)>.firstOrNull(predicate: ((AbstractQuickFixMultiFileTest.TestFile..AbstractQuickFixMultiFileTest.TestFile?)) -> Boolean): AbstractQuickFixMultiFileTest.TestFile? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest.TestFile..org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest.TestFile?)

'file' @ [151:57] ==> value-parameter file: (AbstractQuickFixMultiFileTest.TestFile..AbstractQuickFixMultiFileTest.TestFile?) defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest.doMultiFileTest.<anonymous>[ValueParameterDescriptorImpl]

'path' @ [151:62] ==> public final val path: String defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest.TestFile[PropertyDescriptorImpl]

'contains' @ [151:67] ==> public operator fun CharSequence.contains(other: CharSequence, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'subFiles' @ [153:9] ==> val subFiles: (MutableList<(AbstractQuickFixMultiFileTest.TestFile..AbstractQuickFixMultiFileTest.TestFile?)>..List<(AbstractQuickFixMultiFileTest.TestFile..AbstractQuickFixMultiFileTest.TestFile?)>) defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest.doMultiFileTest[LocalVariableDescriptor]

'remove' @ [153:18] ==> public abstract fun remove(element: (AbstractQuickFixMultiFileTest.TestFile..AbstractQuickFixMultiFileTest.TestFile?)): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'beforeFile' @ [153:25] ==> val beforeFile: AbstractQuickFixMultiFileTest.TestFile defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest.doMultiFileTest[LocalVariableDescriptor]

'afterFile' @ [154:13] ==> val afterFile: AbstractQuickFixMultiFileTest.TestFile? defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest.doMultiFileTest[LocalVariableDescriptor]

'subFiles' @ [155:13] ==> val subFiles: (MutableList<(AbstractQuickFixMultiFileTest.TestFile..AbstractQuickFixMultiFileTest.TestFile?)>..List<(AbstractQuickFixMultiFileTest.TestFile..AbstractQuickFixMultiFileTest.TestFile?)>) defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest.doMultiFileTest[LocalVariableDescriptor]

'remove' @ [155:22] ==> public abstract fun remove(element: (AbstractQuickFixMultiFileTest.TestFile..AbstractQuickFixMultiFileTest.TestFile?)): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'afterFile' @ [155:29] ==> val afterFile: AbstractQuickFixMultiFileTest.TestFile? defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest.doMultiFileTest[LocalVariableDescriptor]

'configureMultiFileTest' @ [158:9] ==> protected final fun configureMultiFileTest(subFiles: List<AbstractQuickFixMultiFileTest.TestFile>, beforeFile: AbstractQuickFixMultiFileTest.TestFile): List<VirtualFile> defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest[SimpleFunctionDescriptorImpl]

'subFiles' @ [158:32] ==> val subFiles: (MutableList<(AbstractQuickFixMultiFileTest.TestFile..AbstractQuickFixMultiFileTest.TestFile?)>..List<(AbstractQuickFixMultiFileTest.TestFile..AbstractQuickFixMultiFileTest.TestFile?)>) defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest.doMultiFileTest[LocalVariableDescriptor]

'beforeFile' @ [158:42] ==> val beforeFile: AbstractQuickFixMultiFileTest.TestFile defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest.doMultiFileTest[LocalVariableDescriptor]

'getInstance' @ [160:26] ==> public open fun getInstance(): (CommandProcessor..CommandProcessor?) defined in com.intellij.openapi.command.CommandProcessor[JavaMethodDescriptor]

'executeCommand' @ [160:40] ==> public final fun executeCommand(@Nullable p0: Project?, @NotNull p1: () -> Unit, @Nullable p2: String?, @Nullable p3: Any?): Unit defined in com.intellij.openapi.command.CommandProcessor[MyFunctionDescriptor]

'project' @ [160:55] ==> public final val AbstractQuickFixMultiFileTest.project: Project[MyPropertyDescriptor]

'file' @ [162:31] ==> public final val AbstractQuickFixMultiFileTest.file: (PsiFile..PsiFile?)[MyPropertyDescriptor]

'parse' @ [164:45] ==> @NotNull public open fun parse(@NotNull p0: PsiFile, @NotNull p1: String): ActionHint defined in com.intellij.codeInsight.daemon.quickFix.ActionHint[JavaMethodDescriptor]

'psiFile' @ [164:51] ==> val psiFile: (PsiFile..PsiFile?) defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest.doMultiFileTest.<anonymous>[LocalVariableDescriptor]

'beforeFile' @ [164:60] ==> val beforeFile: AbstractQuickFixMultiFileTest.TestFile defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest.doMultiFileTest[LocalVariableDescriptor]

'content' @ [164:71] ==> public final val content: String defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest.TestFile[PropertyDescriptorImpl]

'actionHint' @ [165:28] ==> val actionHint: ActionHint defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest.doMultiFileTest.<anonymous>[LocalVariableDescriptor]

'expectedText' @ [165:39] ==> public final val ActionHint.expectedText: (String..String?)[MyPropertyDescriptor]

'actionHint' @ [167:47] ==> val actionHint: ActionHint defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest.doMultiFileTest.<anonymous>[LocalVariableDescriptor]

'shouldPresent' @ [167:58] ==> public open fun shouldPresent(): Boolean defined in com.intellij.codeInsight.daemon.quickFix.ActionHint[JavaMethodDescriptor]

'psiFile' @ [169:21] ==> val psiFile: (PsiFile..PsiFile?) defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest.doMultiFileTest.<anonymous>[LocalVariableDescriptor]

'DirectiveBasedActionUtils' @ [170:21] ==> public object DirectiveBasedActionUtils defined in org.jetbrains.kotlin.idea.test in file DirectiveBasedActionUtils.kt[FakeCallableDescriptorForObject]

'checkForUnexpectedErrors' @ [170:47] ==> public final fun checkForUnexpectedErrors(file: KtFile): Unit defined in org.jetbrains.kotlin.idea.test.DirectiveBasedActionUtils[SimpleFunctionDescriptorImpl]

'psiFile' @ [170:72] ==> val psiFile: (PsiFile..PsiFile?) defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest.doMultiFileTest.<anonymous>[LocalVariableDescriptor]

'doAction' @ [173:17] ==> @Throws public final fun doAction(text: String, actionShouldBeAvailable: Boolean, testFilePath: String): Unit defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest[SimpleFunctionDescriptorImpl]

'text' @ [173:26] ==> val text: (String..String?) defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest.doMultiFileTest.<anonymous>[LocalVariableDescriptor]

'actionShouldBeAvailable' @ [173:32] ==> val actionShouldBeAvailable: Boolean defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest.doMultiFileTest.<anonymous>[LocalVariableDescriptor]

'getTestName' @ [173:57] ==> @NotNull protected/*protected and package*/ open fun getTestName(p0: Boolean): String defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest[JavaMethodDescriptor]

'file' @ [175:34] ==> public final val AbstractQuickFixMultiFileTest.file: (PsiFile..PsiFile?)[MyPropertyDescriptor]

'text' @ [175:39] ==> public final val PsiFile.text: (String..String?)[MyPropertyDescriptor]

'StringBuilder' @ [176:33] ==> public final fun <init>(p0: (String..String?)): StringBuilder /* = StringBuilder */ defined in kotlin.text.StringBuilder[TypeAliasConstructorDescriptorImpl]

'actualText' @ [176:47] ==> val actualText: (String..String?) defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest.doMultiFileTest.<anonymous>[LocalVariableDescriptor]

'insert' @ [176:59] ==> public open fun insert(p0: Int, p1: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'editor' @ [176:66] ==> public final val AbstractQuickFixMultiFileTest.editor: Editor[MyPropertyDescriptor]

'caretModel' @ [176:73] ==> public final val Editor.caretModel: CaretModel[MyPropertyDescriptor]

'offset' @ [176:84] ==> public final val CaretModel.offset: Int[MyPropertyDescriptor]

'toString' @ [176:103] ==> public open fun toString(): String defined in java.lang.StringBuilder[JavaMethodDescriptor]

'if (actionShouldBeAvailable) {
                    TestCase.assertNotNull(".after file should exist", afterFile)
                    if (afterText != afterFile!!.content) {
                        val actualTestFile = StringBuilder()
                        actualTestFile.append("// FILE: ").append(beforeFile.path).append("\n").append(beforeFile.content)
                        for (file in subFiles) {
                            actualTestFile.append("// FILE: ").append(file.path).append("\n").append(file.content)
                        }
                        actualTestFile.append("// FILE: ").append(afterFile.path).append("\n").append(afterText)

                        KotlinTestUtils.assertEqualsToFile(File(beforeFileName), actualTestFile.toString())
                    }
                }
                else {
                    TestCase.assertNull(".after file should not exist", afterFile)
                }' @ [178:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'actionShouldBeAvailable' @ [178:21] ==> val actionShouldBeAvailable: Boolean defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest.doMultiFileTest.<anonymous>[LocalVariableDescriptor]

'assertNotNull' @ [179:30] ==> public open fun assertNotNull(p0: (String..String?), p1: (Any..Any?)): Unit defined in junit.framework.TestCase[JavaMethodDescriptor]

'afterFile' @ [179:72] ==> val afterFile: AbstractQuickFixMultiFileTest.TestFile? defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest.doMultiFileTest[LocalVariableDescriptor]

'afterText' @ [180:25] ==> val afterText: String defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest.doMultiFileTest.<anonymous>[LocalVariableDescriptor]

'afterFile' @ [180:38] ==> val afterFile: AbstractQuickFixMultiFileTest.TestFile? defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest.doMultiFileTest[LocalVariableDescriptor]

'content' @ [180:50] ==> public final val content: String defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest.TestFile[PropertyDescriptorImpl]

'StringBuilder' @ [181:46] ==> public final fun <init>(): StringBuilder /* = StringBuilder */ defined in kotlin.text.StringBuilder[TypeAliasConstructorDescriptorImpl]

'actualTestFile' @ [182:25] ==> val actualTestFile: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest.doMultiFileTest.<anonymous>[LocalVariableDescriptor]

'append' @ [182:40] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'append' @ [182:60] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'beforeFile' @ [182:67] ==> val beforeFile: AbstractQuickFixMultiFileTest.TestFile defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest.doMultiFileTest[LocalVariableDescriptor]

'path' @ [182:78] ==> public final val path: String defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest.TestFile[PropertyDescriptorImpl]

'append' @ [182:84] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'append' @ [182:97] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'beforeFile' @ [182:104] ==> val beforeFile: AbstractQuickFixMultiFileTest.TestFile defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest.doMultiFileTest[LocalVariableDescriptor]

'content' @ [182:115] ==> public final val content: String defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest.TestFile[PropertyDescriptorImpl]

'subFiles' @ [183:38] ==> val subFiles: (MutableList<(AbstractQuickFixMultiFileTest.TestFile..AbstractQuickFixMultiFileTest.TestFile?)>..List<(AbstractQuickFixMultiFileTest.TestFile..AbstractQuickFixMultiFileTest.TestFile?)>) defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest.doMultiFileTest[LocalVariableDescriptor]

'actualTestFile' @ [184:29] ==> val actualTestFile: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest.doMultiFileTest.<anonymous>[LocalVariableDescriptor]

'append' @ [184:44] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'append' @ [184:64] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'file' @ [184:71] ==> val file: (AbstractQuickFixMultiFileTest.TestFile..AbstractQuickFixMultiFileTest.TestFile?) defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest.doMultiFileTest.<anonymous>[LocalVariableDescriptor]

'path' @ [184:76] ==> public final val path: String defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest.TestFile[PropertyDescriptorImpl]

'append' @ [184:82] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'append' @ [184:95] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'file' @ [184:102] ==> val file: (AbstractQuickFixMultiFileTest.TestFile..AbstractQuickFixMultiFileTest.TestFile?) defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest.doMultiFileTest.<anonymous>[LocalVariableDescriptor]

'content' @ [184:107] ==> public final val content: String defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest.TestFile[PropertyDescriptorImpl]

'actualTestFile' @ [186:25] ==> val actualTestFile: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest.doMultiFileTest.<anonymous>[LocalVariableDescriptor]

'append' @ [186:40] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'append' @ [186:60] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'afterFile' @ [186:67] ==> val afterFile: AbstractQuickFixMultiFileTest.TestFile? defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest.doMultiFileTest[LocalVariableDescriptor]

'path' @ [186:77] ==> public final val path: String defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest.TestFile[PropertyDescriptorImpl]

'append' @ [186:83] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'append' @ [186:96] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'afterText' @ [186:103] ==> val afterText: String defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest.doMultiFileTest.<anonymous>[LocalVariableDescriptor]

'assertEqualsToFile' @ [188:41] ==> public open fun assertEqualsToFile(@NotNull p0: File, @NotNull p1: String): Unit defined in org.jetbrains.kotlin.test.KotlinTestUtils[JavaMethodDescriptor]

'File' @ [188:60] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'beforeFileName' @ [188:65] ==> value-parameter beforeFileName: String defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest.doMultiFileTest[ValueParameterDescriptorImpl]

'actualTestFile' @ [188:82] ==> val actualTestFile: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest.doMultiFileTest.<anonymous>[LocalVariableDescriptor]

'toString' @ [188:97] ==> public open fun toString(): String defined in java.lang.StringBuilder[JavaMethodDescriptor]

'assertNull' @ [192:30] ==> public open fun assertNull(p0: (String..String?), p1: (Any..Any?)): Unit defined in junit.framework.TestCase[JavaMethodDescriptor]

'afterFile' @ [192:73] ==> val afterFile: AbstractQuickFixMultiFileTest.TestFile? defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest.doMultiFileTest[LocalVariableDescriptor]

'e' @ [196:23] ==> val e: ComparisonFailure defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest.doMultiFileTest.<anonymous>[LocalVariableDescriptor]

'e' @ [199:23] ==> val e: AssertionError /* = AssertionError */ defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest.doMultiFileTest.<anonymous>[LocalVariableDescriptor]

'e' @ [202:17] ==> val e: Throwable defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest.doMultiFileTest.<anonymous>[LocalVariableDescriptor]

'printStackTrace' @ [202:19] ==> public open fun printStackTrace(): Unit defined in kotlin.Throwable[JavaMethodDescriptor]

'fail' @ [203:26] ==> public open fun fail(p0: (String..String?)): Unit defined in junit.framework.TestCase[JavaMethodDescriptor]

'getTestName' @ [203:31] ==> @NotNull protected/*protected and package*/ open fun getTestName(p0: Boolean): String defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest[JavaMethodDescriptor]

'Throws' @ [208:5] ==> public constructor Throws(vararg exceptionClasses: KClass<out Throwable>) defined in kotlin.jvm.Throws[DeserializedClassConstructorDescriptor]

'Exception' @ [208:13] ==> public final fun <init>(): Exception /* = Exception */ defined in kotlin.Exception[TypeAliasConstructorDescriptorImpl]

'File' @ [210:24] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'beforeFileName' @ [210:29] ==> value-parameter beforeFileName: String defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest.doTest[ValueParameterDescriptorImpl]

'loadFile' @ [211:41] ==> @NotNull public open fun loadFile(@NotNull p0: File, p1: Boolean): String defined in com.intellij.openapi.util.io.FileUtil[JavaMethodDescriptor]

'mainFile' @ [211:50] ==> val mainFile: File defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest.doTest[LocalVariableDescriptor]

'mainFile' @ [213:27] ==> val mainFile: File defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest.doTest[LocalVariableDescriptor]

'parentFile' @ [213:36] ==> public final val File.parentFile: (File..File?)[MyPropertyDescriptor]

'mainFile' @ [215:28] ==> val mainFile: File defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest.doTest[LocalVariableDescriptor]

'name' @ [215:37] ==> public final val File.name: (String..String?)[MyPropertyDescriptor]

'mainFileDir' @ [216:26] ==> val mainFileDir: File defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest.doTest[LocalVariableDescriptor]

'listFiles' @ [216:38] ==> public final fun listFiles(p0: (((File..File?), (String..String?)) -> Boolean..(((File..File?), (String..String?)) -> Boolean)?)): (Array<(File..File?)>..Array<out (File..File?)>?) defined in java.io.File[MyFunctionDescriptor]

'name' @ [216:63] ==> value-parameter name: (String..String?) defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest.doTest.<anonymous>[ValueParameterDescriptorImpl]

'startsWith' @ [216:68] ==> public fun String.startsWith(prefix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'extraFileNamePrefix' @ [216:79] ==> private final fun extraFileNamePrefix(mainFileName: String): String defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest.Companion[SimpleFunctionDescriptorImpl]

'mainFileName' @ [216:99] ==> val mainFileName: (String..String?) defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest.doTest[LocalVariableDescriptor]

'name' @ [216:117] ==> value-parameter name: (String..String?) defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest.doTest.<anonymous>[ValueParameterDescriptorImpl]

'mainFileName' @ [216:125] ==> val mainFileName: (String..String?) defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest.doTest[LocalVariableDescriptor]

'ArrayList' @ [218:25] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> String

'testFiles' @ [219:9] ==> val testFiles: ArrayList<String> defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest.doTest[LocalVariableDescriptor]

'add' @ [219:19] ==> public open fun add(element: String): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'mainFile' @ [219:23] ==> val mainFile: File defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest.doTest[LocalVariableDescriptor]

'name' @ [219:32] ==> public final val File.name: (String..String?)[MyPropertyDescriptor]

'extraFiles' @ [220:9] ==> val extraFiles: (Array<(File..File?)>..Array<out (File..File?)>) defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest.doTest[LocalVariableDescriptor]

'mapTo' @ [220:20] ==> public inline fun <T, R, C : MutableCollection<in (String..String?)>> Array<out (File..File?)>.mapTo(destination: ArrayList<String>, transform: ((File..File?)) -> (String..String?)): ArrayList<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (java.io.File..java.io.File?)
    <R> -> (kotlin.String..kotlin.String?)
    <C : MutableCollection<in R>> -> ArrayList<String>

'testFiles' @ [220:26] ==> val testFiles: ArrayList<String> defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest.doTest[LocalVariableDescriptor]

'file' @ [220:47] ==> value-parameter file: (File..File?) defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest.doTest.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [220:52] ==> public final val File.name: (String..String?)[MyPropertyDescriptor]

'myFixture' @ [222:9] ==> protected/*protected and package*/ final var myFixture: (JavaCodeInsightTestFixture..JavaCodeInsightTestFixture?) defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest[JavaPropertyDescriptor]

'configureByFiles' @ [222:19] ==> @NotNull public abstract fun configureByFiles(@NotNull vararg p0: (String..String?)): (Array<(PsiFile..PsiFile?)>..Array<out (PsiFile..PsiFile?)>) defined in com.intellij.testFramework.fixtures.JavaCodeInsightTestFixture[JavaMethodDescriptor]

'testFiles' @ [222:37] ==> val testFiles: ArrayList<String> defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest.doTest[LocalVariableDescriptor]

'toTypedArray' @ [222:47] ==> public inline fun <reified T> Collection<String>.toTypedArray(): Array<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> String

'getInstance' @ [224:26] ==> public open fun getInstance(): (CommandProcessor..CommandProcessor?) defined in com.intellij.openapi.command.CommandProcessor[JavaMethodDescriptor]

'executeCommand' @ [224:40] ==> public final fun executeCommand(@Nullable p0: Project?, @NotNull p1: () -> Unit, @Nullable p2: String?, @Nullable p3: Any?): Unit defined in com.intellij.openapi.command.CommandProcessor[MyFunctionDescriptor]

'project' @ [224:55] ==> public final val AbstractQuickFixMultiFileTest.project: Project[MyPropertyDescriptor]

'file' @ [226:31] ==> public final val AbstractQuickFixMultiFileTest.file: (PsiFile..PsiFile?)[MyPropertyDescriptor]

'parse' @ [228:45] ==> @NotNull public open fun parse(@NotNull p0: PsiFile, @NotNull p1: String): ActionHint defined in com.intellij.codeInsight.daemon.quickFix.ActionHint[JavaMethodDescriptor]

'psiFile' @ [228:51] ==> val psiFile: (PsiFile..PsiFile?) defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest.doTest.<anonymous>[LocalVariableDescriptor]

'originalFileText' @ [228:60] ==> val originalFileText: String defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest.doTest[LocalVariableDescriptor]

'actionHint' @ [229:28] ==> val actionHint: ActionHint defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest.doTest.<anonymous>[LocalVariableDescriptor]

'expectedText' @ [229:39] ==> public final val ActionHint.expectedText: (String..String?)[MyPropertyDescriptor]

'actionHint' @ [231:47] ==> val actionHint: ActionHint defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest.doTest.<anonymous>[LocalVariableDescriptor]

'shouldPresent' @ [231:58] ==> public open fun shouldPresent(): Boolean defined in com.intellij.codeInsight.daemon.quickFix.ActionHint[JavaMethodDescriptor]

'psiFile' @ [233:21] ==> val psiFile: (PsiFile..PsiFile?) defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest.doTest.<anonymous>[LocalVariableDescriptor]

'DirectiveBasedActionUtils' @ [234:21] ==> public object DirectiveBasedActionUtils defined in org.jetbrains.kotlin.idea.test in file DirectiveBasedActionUtils.kt[FakeCallableDescriptorForObject]

'checkForUnexpectedErrors' @ [234:47] ==> public final fun checkForUnexpectedErrors(file: KtFile): Unit defined in org.jetbrains.kotlin.idea.test.DirectiveBasedActionUtils[SimpleFunctionDescriptorImpl]

'psiFile' @ [234:72] ==> val psiFile: (PsiFile..PsiFile?) defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest.doTest.<anonymous>[LocalVariableDescriptor]

'doAction' @ [237:17] ==> @Throws public final fun doAction(text: String, actionShouldBeAvailable: Boolean, testFilePath: String): Unit defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest[SimpleFunctionDescriptorImpl]

'text' @ [237:26] ==> val text: (String..String?) defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest.doTest.<anonymous>[LocalVariableDescriptor]

'actionShouldBeAvailable' @ [237:32] ==> val actionShouldBeAvailable: Boolean defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest.doTest.<anonymous>[LocalVariableDescriptor]

'beforeFileName' @ [237:57] ==> value-parameter beforeFileName: String defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest.doTest[ValueParameterDescriptorImpl]

'actionShouldBeAvailable' @ [239:21] ==> val actionShouldBeAvailable: Boolean defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest.doTest.<anonymous>[LocalVariableDescriptor]

'beforeFileName' @ [240:41] ==> value-parameter beforeFileName: String defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest.doTest[ValueParameterDescriptorImpl]

'replace' @ [240:56] ==> public fun String.replace(oldValue: String, newValue: String, ignoreCase: Boolean = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'myFixture' @ [242:25] ==> protected/*protected and package*/ final var myFixture: (JavaCodeInsightTestFixture..JavaCodeInsightTestFixture?) defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest[JavaPropertyDescriptor]

'checkResultByFile' @ [242:35] ==> public abstract fun checkResultByFile(@NotNull p0: String): Unit defined in com.intellij.testFramework.fixtures.JavaCodeInsightTestFixture[JavaMethodDescriptor]

'mainFile' @ [242:53] ==> val mainFile: File defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest.doTest[LocalVariableDescriptor]

'name' @ [242:62] ==> public final val File.name: (String..String?)[MyPropertyDescriptor]

'replace' @ [242:67] ==> public fun String.replace(oldValue: String, newValue: String, ignoreCase: Boolean = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'assertEqualsToFile' @ [245:41] ==> public open fun assertEqualsToFile(@NotNull p0: File, @NotNull p1: Editor): Unit defined in org.jetbrains.kotlin.test.KotlinTestUtils[JavaMethodDescriptor]

'File' @ [245:60] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'afterFilePath' @ [245:65] ==> val afterFilePath: String defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest.doTest.<anonymous>[LocalVariableDescriptor]

'editor' @ [245:81] ==> public final val AbstractQuickFixMultiFileTest.editor: Editor[MyPropertyDescriptor]

'myFixture' @ [248:36] ==> protected/*protected and package*/ final var myFixture: (JavaCodeInsightTestFixture..JavaCodeInsightTestFixture?) defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest[JavaPropertyDescriptor]

'file' @ [248:46] ==> public final val JavaCodeInsightTestFixture.file: (PsiFile..PsiFile?)[MyPropertyDescriptor]

'mainFile' @ [249:40] ==> val mainFile: (PsiFile..PsiFile?) defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest.doTest.<anonymous>[LocalVariableDescriptor]

'name' @ [249:49] ==> public final var PsiFile.name: String[MyPropertyDescriptor]

'mainFile' @ [250:34] ==> val mainFile: (PsiFile..PsiFile?) defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest.doTest.<anonymous>[LocalVariableDescriptor]

'containingDirectory' @ [250:43] ==> public final val PsiFile.containingDirectory: (PsiDirectory..PsiDirectory?)[MyPropertyDescriptor]

'files' @ [250:63] ==> public final val PsiDirectory.files: (Array<(PsiFile..PsiFile?)>..Array<out (PsiFile..PsiFile?)>)[MyPropertyDescriptor]

'file' @ [251:40] ==> val file: (PsiFile..PsiFile?) defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest.doTest.<anonymous>[LocalVariableDescriptor]

'name' @ [251:45] ==> public final var PsiFile.name: String[MyPropertyDescriptor]

'fileName' @ [252:29] ==> val fileName: String defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest.doTest.<anonymous>[LocalVariableDescriptor]

'mainFileName' @ [252:41] ==> val mainFileName: String defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest.doTest.<anonymous>[LocalVariableDescriptor]

'!' @ [252:57] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'fileName' @ [252:58] ==> val fileName: String defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest.doTest.<anonymous>[LocalVariableDescriptor]

'startsWith' @ [252:67] ==> public fun String.startsWith(prefix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'extraFileNamePrefix' @ [252:78] ==> private final fun extraFileNamePrefix(mainFileName: String): String defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest.Companion[SimpleFunctionDescriptorImpl]

'myFixture' @ [252:98] ==> protected/*protected and package*/ final var myFixture: (JavaCodeInsightTestFixture..JavaCodeInsightTestFixture?) defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest[JavaPropertyDescriptor]

'file' @ [252:108] ==> public final val JavaCodeInsightTestFixture.file: (PsiFile..PsiFile?)[MyPropertyDescriptor]

'name' @ [252:113] ==> public final var PsiFile.name: String[MyPropertyDescriptor]

'beforeFileName' @ [254:49] ==> value-parameter beforeFileName: String defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest.doTest[ValueParameterDescriptorImpl]

'replace' @ [254:64] ==> public fun String.replace(oldValue: String, newValue: String, ignoreCase: Boolean = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'mainFileName' @ [254:72] ==> val mainFileName: String defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest.doTest.<anonymous>[LocalVariableDescriptor]

'fileName' @ [254:86] ==> val fileName: String defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest.doTest.<anonymous>[LocalVariableDescriptor]

'File' @ [255:41] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'extraFileFullPath' @ [255:46] ==> val extraFileFullPath: String defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest.doTest.<anonymous>[LocalVariableDescriptor]

'replace' @ [255:64] ==> public fun String.replace(oldValue: String, newValue: String, ignoreCase: Boolean = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'if (afterFile.exists()) {
                            KotlinTestUtils.assertEqualsToFile(afterFile, file.text)
                        }
                        else {
                            KotlinTestUtils.assertEqualsToFile(File(extraFileFullPath), file.text)
                        }' @ [256:25] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'afterFile' @ [256:29] ==> val afterFile: File defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest.doTest.<anonymous>[LocalVariableDescriptor]

'exists' @ [256:39] ==> public open fun exists(): Boolean defined in java.io.File[JavaMethodDescriptor]

'assertEqualsToFile' @ [257:45] ==> public open fun assertEqualsToFile(@NotNull p0: File, @NotNull p1: String): Unit defined in org.jetbrains.kotlin.test.KotlinTestUtils[JavaMethodDescriptor]

'afterFile' @ [257:64] ==> val afterFile: File defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest.doTest.<anonymous>[LocalVariableDescriptor]

'file' @ [257:75] ==> val file: (PsiFile..PsiFile?) defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest.doTest.<anonymous>[LocalVariableDescriptor]

'text' @ [257:80] ==> public final val PsiFile.text: (String..String?)[MyPropertyDescriptor]

'assertEqualsToFile' @ [260:45] ==> public open fun assertEqualsToFile(@NotNull p0: File, @NotNull p1: String): Unit defined in org.jetbrains.kotlin.test.KotlinTestUtils[JavaMethodDescriptor]

'File' @ [260:64] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'extraFileFullPath' @ [260:69] ==> val extraFileFullPath: String defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest.doTest.<anonymous>[LocalVariableDescriptor]

'file' @ [260:89] ==> val file: (PsiFile..PsiFile?) defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest.doTest.<anonymous>[LocalVariableDescriptor]

'text' @ [260:94] ==> public final val PsiFile.text: (String..String?)[MyPropertyDescriptor]

'e' @ [266:23] ==> val e: ComparisonFailure defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest.doTest.<anonymous>[LocalVariableDescriptor]

'e' @ [269:23] ==> val e: AssertionError /* = AssertionError */ defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest.doTest.<anonymous>[LocalVariableDescriptor]

'e' @ [272:17] ==> val e: Throwable defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest.doTest.<anonymous>[LocalVariableDescriptor]

'printStackTrace' @ [272:19] ==> public open fun printStackTrace(): Unit defined in kotlin.Throwable[JavaMethodDescriptor]

'fail' @ [273:26] ==> public open fun fail(p0: (String..String?)): Unit defined in junit.framework.TestCase[JavaMethodDescriptor]

'getTestName' @ [273:31] ==> @NotNull protected/*protected and package*/ open fun getTestName(p0: Boolean): String defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest[JavaMethodDescriptor]

'Throws' @ [278:5] ==> public constructor Throws(vararg exceptionClasses: KClass<out Throwable>) defined in kotlin.jvm.Throws[DeserializedClassConstructorDescriptor]

'Exception' @ [278:13] ==> public final fun <init>(): Exception /* = Exception */ defined in kotlin.Exception[TypeAliasConstructorDescriptorImpl]

'if (text.startsWith("/"))
            Pattern.compile(text.substring(1, text.length - 1))
        else
            Pattern.compile(StringUtil.escapeToRegexp(text))' @ [280:23] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (Pattern..Pattern?), elseBranch: (Pattern..Pattern?)): (Pattern..Pattern?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (java.util.regex.Pattern..java.util.regex.Pattern?)

'text' @ [280:27] ==> value-parameter text: String defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest.doAction[ValueParameterDescriptorImpl]

'startsWith' @ [280:32] ==> public fun String.startsWith(prefix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'compile' @ [281:21] ==> public open fun compile(p0: (String..String?)): (Pattern..Pattern?) defined in java.util.regex.Pattern[JavaMethodDescriptor]

'text' @ [281:29] ==> value-parameter text: String defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest.doAction[ValueParameterDescriptorImpl]

'substring' @ [281:34] ==> @InlineOnly public inline fun String.substring(startIndex: Int, endIndex: Int): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'text' @ [281:47] ==> value-parameter text: String defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest.doAction[ValueParameterDescriptorImpl]

'length' @ [281:52] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'compile' @ [283:21] ==> public open fun compile(p0: (String..String?)): (Pattern..Pattern?) defined in java.util.regex.Pattern[JavaMethodDescriptor]

'escapeToRegexp' @ [283:40] ==> @NotNull @Contract public open fun escapeToRegexp(@NotNull p0: String): String defined in com.intellij.openapi.util.text.StringUtil[JavaMethodDescriptor]

'text' @ [283:55] ==> value-parameter text: String defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest.doAction[ValueParameterDescriptorImpl]

'availableActions' @ [285:32] ==> private final val availableActions: List<IntentionAction> defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest[PropertyDescriptorImpl]

'findActionByPattern' @ [286:22] ==> private final fun findActionByPattern(pattern: Pattern, availableActions: List<IntentionAction>): IntentionAction? defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest.Companion[SimpleFunctionDescriptorImpl]

'pattern' @ [286:42] ==> val pattern: (Pattern..Pattern?) defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest.doAction[LocalVariableDescriptor]

'availableActions' @ [286:51] ==> val availableActions: List<IntentionAction> defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest.doAction[LocalVariableDescriptor]

'if (action == null) {
            if (actionShouldBeAvailable) {
                val texts = getActionsTexts(availableActions)
                val infos = myFixture.doHighlighting()
                TestCase.fail("Action with text '" + text + "' is not available in test " + testFilePath + "\n" +
                              "Available actions (" + texts.size + "): \n" +
                              StringUtil.join(texts, "\n") +
                              "\nActions:\n" +
                              StringUtil.join(availableActions, "\n") +
                              "\nInfos:\n" +
                              StringUtil.join(infos, "\n"))
            }
            else {
                DirectiveBasedActionUtils.checkAvailableActionsAreExpected(file, availableActions)
            }
        }
        else {
            if (!actionShouldBeAvailable) {
                TestCase.fail("Action '$text' is available (but must not) in test $testFilePath")
            }

            CodeInsightTestFixtureImpl.invokeIntention(action, file, editor, action.text)

            if (!shouldBeAvailableAfterExecution()) {
                val afterAction = findActionByPattern(pattern, this.availableActions)

                if (afterAction != null) {
                    TestCase.fail("Action '$text' is still available after its invocation in test $testFilePath")
                }
            }
        }' @ [288:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'action' @ [288:13] ==> val action: IntentionAction? defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest.doAction[LocalVariableDescriptor]

'if (actionShouldBeAvailable) {
                val texts = getActionsTexts(availableActions)
                val infos = myFixture.doHighlighting()
                TestCase.fail("Action with text '" + text + "' is not available in test " + testFilePath + "\n" +
                              "Available actions (" + texts.size + "): \n" +
                              StringUtil.join(texts, "\n") +
                              "\nActions:\n" +
                              StringUtil.join(availableActions, "\n") +
                              "\nInfos:\n" +
                              StringUtil.join(infos, "\n"))
            }
            else {
                DirectiveBasedActionUtils.checkAvailableActionsAreExpected(file, availableActions)
            }' @ [289:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'actionShouldBeAvailable' @ [289:17] ==> value-parameter actionShouldBeAvailable: Boolean defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest.doAction[ValueParameterDescriptorImpl]

'getActionsTexts' @ [290:29] ==> private final fun getActionsTexts(availableActions: List<IntentionAction>): List<String> defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest.Companion[SimpleFunctionDescriptorImpl]

'availableActions' @ [290:45] ==> val availableActions: List<IntentionAction> defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest.doAction[LocalVariableDescriptor]

'myFixture' @ [291:29] ==> protected/*protected and package*/ final var myFixture: (JavaCodeInsightTestFixture..JavaCodeInsightTestFixture?) defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest[JavaPropertyDescriptor]

'doHighlighting' @ [291:39] ==> @NotNull public abstract fun doHighlighting(): (MutableList<(HighlightInfo..HighlightInfo?)>..List<(HighlightInfo..HighlightInfo?)>) defined in com.intellij.testFramework.fixtures.JavaCodeInsightTestFixture[JavaMethodDescriptor]

'fail' @ [292:26] ==> public open fun fail(p0: (String..String?)): Unit defined in junit.framework.TestCase[JavaMethodDescriptor]

'+' @ [292:31] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'text' @ [292:54] ==> value-parameter text: String defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest.doAction[ValueParameterDescriptorImpl]

'testFilePath' @ [292:93] ==> value-parameter testFilePath: String defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest.doAction[ValueParameterDescriptorImpl]

'texts' @ [293:55] ==> val texts: List<String> defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest.doAction[LocalVariableDescriptor]

'size' @ [293:61] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'join' @ [294:42] ==> @NotNull @Contract public open fun join(@NotNull p0: (MutableCollection<(String..String?)>..Collection<(String..String?)>), @NotNull p1: String): String defined in com.intellij.openapi.util.text.StringUtil[JavaMethodDescriptor]

'texts' @ [294:47] ==> val texts: List<String> defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest.doAction[LocalVariableDescriptor]

'join' @ [296:42] ==> @Contract public open fun join(@NotNull p0: (MutableIterable<*>..Iterable<*>), @NotNull @NonNls p1: String): (String..String?) defined in com.intellij.openapi.util.text.StringUtil[JavaMethodDescriptor]

'availableActions' @ [296:47] ==> val availableActions: List<IntentionAction> defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest.doAction[LocalVariableDescriptor]

'join' @ [298:42] ==> @Contract public open fun join(@NotNull p0: (MutableIterable<*>..Iterable<*>), @NotNull @NonNls p1: String): (String..String?) defined in com.intellij.openapi.util.text.StringUtil[JavaMethodDescriptor]

'infos' @ [298:47] ==> val infos: (MutableList<(HighlightInfo..HighlightInfo?)>..List<(HighlightInfo..HighlightInfo?)>) defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest.doAction[LocalVariableDescriptor]

'checkAvailableActionsAreExpected' @ [301:43] ==> public final fun checkAvailableActionsAreExpected(file: PsiFile, availableActions: Collection<IntentionAction>): Unit defined in org.jetbrains.kotlin.idea.test.DirectiveBasedActionUtils[SimpleFunctionDescriptorImpl]

'file' @ [301:76] ==> public final val AbstractQuickFixMultiFileTest.file: (PsiFile..PsiFile?)[MyPropertyDescriptor]

'availableActions' @ [301:82] ==> val availableActions: List<IntentionAction> defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest.doAction[LocalVariableDescriptor]

'!' @ [305:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'actionShouldBeAvailable' @ [305:18] ==> value-parameter actionShouldBeAvailable: Boolean defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest.doAction[ValueParameterDescriptorImpl]

'fail' @ [306:26] ==> public open fun fail(p0: (String..String?)): Unit defined in junit.framework.TestCase[JavaMethodDescriptor]

'text' @ [306:41] ==> value-parameter text: String defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest.doAction[ValueParameterDescriptorImpl]

'testFilePath' @ [306:84] ==> value-parameter testFilePath: String defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest.doAction[ValueParameterDescriptorImpl]

'invokeIntention' @ [309:40] ==> public open fun invokeIntention(@NotNull p0: IntentionAction, p1: (PsiFile..PsiFile?), p2: (Editor..Editor?), p3: (String..String?)): Boolean defined in com.intellij.testFramework.fixtures.impl.CodeInsightTestFixtureImpl[JavaMethodDescriptor]

'action' @ [309:56] ==> val action: IntentionAction? defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest.doAction[LocalVariableDescriptor]

'file' @ [309:64] ==> public final val AbstractQuickFixMultiFileTest.file: (PsiFile..PsiFile?)[MyPropertyDescriptor]

'editor' @ [309:70] ==> public final val AbstractQuickFixMultiFileTest.editor: Editor[MyPropertyDescriptor]

'action' @ [309:78] ==> val action: IntentionAction? defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest.doAction[LocalVariableDescriptor]

'text' @ [309:85] ==> public final val IntentionAction.text: String[MyPropertyDescriptor]

'!' @ [311:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'shouldBeAvailableAfterExecution' @ [311:18] ==> protected final fun shouldBeAvailableAfterExecution(): Boolean defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest.Companion[SimpleFunctionDescriptorImpl]

'findActionByPattern' @ [312:35] ==> private final fun findActionByPattern(pattern: Pattern, availableActions: List<IntentionAction>): IntentionAction? defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest.Companion[SimpleFunctionDescriptorImpl]

'pattern' @ [312:55] ==> val pattern: (Pattern..Pattern?) defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest.doAction[LocalVariableDescriptor]

'this' @ [312:64] ==> <this> defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest[LazyClassReceiverParameterDescriptor]

'availableActions' @ [312:69] ==> private final val availableActions: List<IntentionAction> defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest[PropertyDescriptorImpl]

'afterAction' @ [314:21] ==> val afterAction: IntentionAction? defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest.doAction[LocalVariableDescriptor]

'fail' @ [315:30] ==> public open fun fail(p0: (String..String?)): Unit defined in junit.framework.TestCase[JavaMethodDescriptor]

'text' @ [315:45] ==> value-parameter text: String defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest.doAction[ValueParameterDescriptorImpl]

'testFilePath' @ [315:100] ==> value-parameter testFilePath: String defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest.doAction[ValueParameterDescriptorImpl]

'myFixture' @ [324:13] ==> protected/*protected and package*/ final var myFixture: (JavaCodeInsightTestFixture..JavaCodeInsightTestFixture?) defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest[JavaPropertyDescriptor]

'doHighlighting' @ [324:23] ==> @NotNull public abstract fun doHighlighting(): (MutableList<(HighlightInfo..HighlightInfo?)>..List<(HighlightInfo..HighlightInfo?)>) defined in com.intellij.testFramework.fixtures.JavaCodeInsightTestFixture[JavaMethodDescriptor]

'myFixture' @ [325:20] ==> protected/*protected and package*/ final var myFixture: (JavaCodeInsightTestFixture..JavaCodeInsightTestFixture?) defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest[JavaPropertyDescriptor]

'availableIntentions' @ [325:30] ==> public final val JavaCodeInsightTestFixture.availableIntentions: (MutableList<(IntentionAction..IntentionAction?)>..List<(IntentionAction..IntentionAction?)>)[MyPropertyDescriptor]

'ArrayList' @ [337:25] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> String

'availableActions' @ [338:37] ==> value-parameter availableActions: List<IntentionAction> defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest.Companion.getActionsTexts[ValueParameterDescriptorImpl]

'texts' @ [339:17] ==> val texts: ArrayList<String> defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest.Companion.getActionsTexts[LocalVariableDescriptor]

'add' @ [339:23] ==> public open fun add(element: String): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'intentionAction' @ [339:27] ==> val intentionAction: IntentionAction defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest.Companion.getActionsTexts[LocalVariableDescriptor]

'text' @ [339:43] ==> public final val IntentionAction.text: String[MyPropertyDescriptor]

'texts' @ [341:20] ==> val texts: ArrayList<String> defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest.Companion.getActionsTexts[LocalVariableDescriptor]

'mainFileName' @ [345:20] ==> value-parameter mainFileName: String defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest.Companion.extraFileNamePrefix[ValueParameterDescriptorImpl]

'replace' @ [345:33] ==> public fun String.replace(oldValue: String, newValue: String, ignoreCase: Boolean = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'replace' @ [345:58] ==> public fun String.replace(oldValue: String, newValue: String, ignoreCase: Boolean = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'if (file.path.contains("." + KotlinFileType.EXTENSION)) {
                return KotlinFileType.INSTANCE
            }
            else if (file.path.contains("." + JavaFileType.DEFAULT_EXTENSION)) {
                return JavaFileType.INSTANCE
            }
            else {
                return PlainTextFileType.INSTANCE
            }' @ [349:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Nothing, elseBranch: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Nothing

'file' @ [349:17] ==> value-parameter file: AbstractQuickFixMultiFileTest.TestFile defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest.Companion.guessFileType[ValueParameterDescriptorImpl]

'path' @ [349:22] ==> public final val path: String defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest.TestFile[PropertyDescriptorImpl]

'contains' @ [349:27] ==> public operator fun CharSequence.contains(other: CharSequence, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'+' @ [349:36] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'EXTENSION' @ [349:57] ==> public const final val EXTENSION: String defined in org.jetbrains.kotlin.idea.KotlinFileType[JavaPropertyDescriptor]

'INSTANCE' @ [350:39] ==> public final val INSTANCE: (KotlinFileType..KotlinFileType?) defined in org.jetbrains.kotlin.idea.KotlinFileType[JavaPropertyDescriptor]

'if (file.path.contains("." + JavaFileType.DEFAULT_EXTENSION)) {
                return JavaFileType.INSTANCE
            }
            else {
                return PlainTextFileType.INSTANCE
            }' @ [352:18] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Nothing, elseBranch: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Nothing

'file' @ [352:22] ==> value-parameter file: AbstractQuickFixMultiFileTest.TestFile defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest.Companion.guessFileType[ValueParameterDescriptorImpl]

'path' @ [352:27] ==> public final val path: String defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest.TestFile[PropertyDescriptorImpl]

'contains' @ [352:32] ==> public operator fun CharSequence.contains(other: CharSequence, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'+' @ [352:41] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'DEFAULT_EXTENSION' @ [352:60] ==> @NonNls public const final val DEFAULT_EXTENSION: String defined in com.intellij.ide.highlighter.JavaFileType[JavaPropertyDescriptor]

'INSTANCE' @ [353:37] ==> public final val INSTANCE: (JavaFileType..JavaFileType?) defined in com.intellij.ide.highlighter.JavaFileType[JavaPropertyDescriptor]

'INSTANCE' @ [356:42] ==> public final val INSTANCE: (PlainTextFileType..PlainTextFileType?) defined in com.intellij.openapi.fileTypes.PlainTextFileType[JavaPropertyDescriptor]

'availableActions' @ [361:37] ==> value-parameter availableActions: List<IntentionAction> defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest.Companion.findActionByPattern[ValueParameterDescriptorImpl]

'pattern' @ [362:21] ==> value-parameter pattern: Pattern defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest.Companion.findActionByPattern[ValueParameterDescriptorImpl]

'matcher' @ [362:29] ==> public open fun matcher(p0: (CharSequence..CharSequence?)): (Matcher..Matcher?) defined in java.util.regex.Pattern[JavaMethodDescriptor]

'availableAction' @ [362:37] ==> val availableAction: IntentionAction defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest.Companion.findActionByPattern[LocalVariableDescriptor]

'text' @ [362:53] ==> public final val IntentionAction.text: String[MyPropertyDescriptor]

'matches' @ [362:59] ==> public open fun matches(): Boolean defined in java.util.regex.Matcher[JavaMethodDescriptor]

'availableAction' @ [363:28] ==> val availableAction: IntentionAction defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiFileTest.Companion.findActionByPattern[LocalVariableDescriptor]

