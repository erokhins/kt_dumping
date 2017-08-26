'AbstractJavaToKotlinConverterTest' @ [34:61] ==> public constructor AbstractJavaToKotlinConverterTest() defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterTest[ClassConstructorDescriptorImpl]

'!!' @ [36:23] ==> public final fun <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-EXCLEXCL-RESOLVE>`(baseExpr: Project?): Project[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> -> Project

'getProject' @ [36:45] ==> public open fun getProject(): (Project..Project?) defined in com.intellij.testFramework.LightPlatformTestCase[JavaMethodDescriptor]

'getInstance' @ [37:37] ==> @NotNull public open fun getInstance(@NotNull p0: Project): PsiManager defined in com.intellij.psi.PsiManager[JavaMethodDescriptor]

'project' @ [37:49] ==> val project: Project defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterMultiFileTest.doTest[LocalVariableDescriptor]

'File' @ [39:30] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'dirPath' @ [39:35] ==> value-parameter dirPath: String defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterMultiFileTest.doTest[ValueParameterDescriptorImpl]

'listFiles' @ [39:44] ==> public final fun listFiles(p0: (((File..File?), (String..String?)) -> Boolean..(((File..File?), (String..String?)) -> Boolean)?)): (Array<(File..File?)>..Array<out (File..File?)>?) defined in java.io.File[MyFunctionDescriptor]

'name' @ [39:67] ==> value-parameter name: (String..String?) defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterMultiFileTest.doTest.<anonymous>[ValueParameterDescriptorImpl]

'endsWith' @ [39:72] ==> public fun String.endsWith(suffix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'ArrayList' @ [40:33] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> PsiJavaFile

'filesToConvert' @ [41:26] ==> val filesToConvert: (Array<(File..File?)>..Array<out (File..File?)>?) defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterMultiFileTest.doTest[LocalVariableDescriptor]

'addFile' @ [42:31] ==> protected final fun addFile(file: File, dirName: String): VirtualFile defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterMultiFileTest[SimpleFunctionDescriptorImpl]

'javaFile' @ [42:39] ==> val javaFile: (File..File?) defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterMultiFileTest.doTest[LocalVariableDescriptor]

'psiManager' @ [43:27] ==> val psiManager: PsiManager defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterMultiFileTest.doTest[LocalVariableDescriptor]

'findFile' @ [43:38] ==> @Nullable public abstract fun findFile(@NotNull p0: VirtualFile): PsiFile? defined in com.intellij.psi.PsiManager[JavaMethodDescriptor]

'virtualFile' @ [43:47] ==> val virtualFile: VirtualFile defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterMultiFileTest.doTest[LocalVariableDescriptor]

'psiFilesToConvert' @ [44:13] ==> val psiFilesToConvert: ArrayList<PsiJavaFile> defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterMultiFileTest.doTest[LocalVariableDescriptor]

'add' @ [44:31] ==> public open fun add(element: PsiJavaFile): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'psiFile' @ [44:35] ==> val psiFile: PsiJavaFile defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterMultiFileTest.doTest[LocalVariableDescriptor]

'File' @ [47:29] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'dirPath' @ [47:34] ==> value-parameter dirPath: String defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterMultiFileTest.doTest[ValueParameterDescriptorImpl]

'separator' @ [47:49] ==> public const final val separator: (String..String?) defined in java.io.File[JavaPropertyDescriptor]

'listFiles' @ [47:73] ==> public final fun listFiles(p0: (((File..File?), (String..String?)) -> Boolean..(((File..File?), (String..String?)) -> Boolean)?)): (Array<(File..File?)>..Array<out (File..File?)>?) defined in java.io.File[MyFunctionDescriptor]

'name' @ [47:96] ==> value-parameter name: (String..String?) defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterMultiFileTest.doTest.<anonymous>[ValueParameterDescriptorImpl]

'endsWith' @ [47:101] ==> public fun String.endsWith(suffix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'name' @ [47:122] ==> value-parameter name: (String..String?) defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterMultiFileTest.doTest.<anonymous>[ValueParameterDescriptorImpl]

'endsWith' @ [47:127] ==> public fun String.endsWith(suffix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'ArrayList' @ [48:32] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> PsiFile

'externalFiles' @ [49:22] ==> val externalFiles: (Array<(File..File?)>..Array<out (File..File?)>?) defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterMultiFileTest.doTest[LocalVariableDescriptor]

'addFile' @ [50:31] ==> protected final fun addFile(file: File, dirName: String): VirtualFile defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterMultiFileTest[SimpleFunctionDescriptorImpl]

'file' @ [50:39] ==> val file: (File..File?) defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterMultiFileTest.doTest[LocalVariableDescriptor]

'psiManager' @ [51:27] ==> val psiManager: PsiManager defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterMultiFileTest.doTest[LocalVariableDescriptor]

'findFile' @ [51:38] ==> @Nullable public abstract fun findFile(@NotNull p0: VirtualFile): PsiFile? defined in com.intellij.psi.PsiManager[JavaMethodDescriptor]

'virtualFile' @ [51:47] ==> val virtualFile: VirtualFile defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterMultiFileTest.doTest[LocalVariableDescriptor]

'externalPsiFiles' @ [52:13] ==> val externalPsiFiles: ArrayList<PsiFile> defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterMultiFileTest.doTest[LocalVariableDescriptor]

'add' @ [52:30] ==> public open fun add(element: PsiFile): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'psiFile' @ [52:34] ==> val psiFile: PsiFile defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterMultiFileTest.doTest[LocalVariableDescriptor]

'assert' @ [53:13] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'psiFile' @ [53:20] ==> val psiFile: PsiFile defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterMultiFileTest.doTest[LocalVariableDescriptor]

'psiFile' @ [53:46] ==> val psiFile: PsiFile defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterMultiFileTest.doTest[LocalVariableDescriptor]

'JavaToKotlinConverter' @ [56:25] ==> public constructor JavaToKotlinConverter(project: Project, settings: ConverterSettings, services: JavaToKotlinConverterServices) defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter[DeserializedClassConstructorDescriptor]

'project' @ [56:47] ==> val project: Project defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterMultiFileTest.doTest[LocalVariableDescriptor]

'ConverterSettings' @ [56:56] ==> public companion object defined in org.jetbrains.kotlin.j2k.ConverterSettings[FakeCallableDescriptorForObject]

'defaultSettings' @ [56:74] ==> public final val defaultSettings: ConverterSettings defined in org.jetbrains.kotlin.j2k.ConverterSettings.Companion[DeserializedPropertyDescriptor]

'IdeaJavaToKotlinServices' @ [56:91] ==> public object IdeaJavaToKotlinServices : JavaToKotlinConverterServices defined in org.jetbrains.kotlin.idea.j2k[FakeCallableDescriptorForObject]

'component1' @ [57:14] ==> public final operator fun component1(): List<String> defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.FilesResult[DeserializedSimpleFunctionDescriptor]

'component2' @ [57:23] ==> public final operator fun component2(): JavaToKotlinConverter.ExternalCodeProcessing? defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.FilesResult[DeserializedSimpleFunctionDescriptor]

'converter' @ [57:48] ==> val converter: JavaToKotlinConverter defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterMultiFileTest.doTest[LocalVariableDescriptor]

'filesToKotlin' @ [57:58] ==> public final fun filesToKotlin(files: List<PsiJavaFile>, postProcessor: PostProcessor, progress: ProgressIndicator = ...): JavaToKotlinConverter.FilesResult defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter[DeserializedSimpleFunctionDescriptor]

'psiFilesToConvert' @ [57:72] ==> val psiFilesToConvert: ArrayList<PsiJavaFile> defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterMultiFileTest.doTest[LocalVariableDescriptor]

'J2kPostProcessor' @ [57:91] ==> public constructor J2kPostProcessor(formatCode: Boolean) defined in org.jetbrains.kotlin.idea.j2k.J2kPostProcessor[DeserializedClassConstructorDescriptor]

'externalCodeProcessor' @ [59:23] ==> val externalCodeProcessor: JavaToKotlinConverter.ExternalCodeProcessing? defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterMultiFileTest.doTest[LocalVariableDescriptor]

'prepareWriteOperation' @ [59:46] ==> public abstract fun prepareWriteOperation(progress: ProgressIndicator): () -> Unit defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.ExternalCodeProcessing[DeserializedSimpleFunctionDescriptor]

'EmptyProgressIndicator' @ [59:68] ==> public constructor EmptyProgressIndicator() defined in com.intellij.openapi.progress.EmptyProgressIndicator[JavaClassConstructorDescriptor]

'project' @ [60:9] ==> val project: Project defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterMultiFileTest.doTest[LocalVariableDescriptor]

'executeWriteCommand' @ [60:17] ==> public fun Project.executeWriteCommand(name: String, command: () -> Unit): Unit defined in org.jetbrains.kotlin.idea.util.application[DeserializedSimpleFunctionDescriptor]

'process' @ [60:43] ==> val process: (() -> Unit)? defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterMultiFileTest.doTest[LocalVariableDescriptor]

'invoke' @ [60:52] ==> public abstract operator fun invoke(): Unit defined in kotlin.Function0[FunctionInvokeDescriptor]

'File' @ [62:42] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'filesToConvert' @ [62:47] ==> val filesToConvert: (Array<(File..File?)>..Array<out (File..File?)>?) defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterMultiFileTest.doTest[LocalVariableDescriptor]

'i' @ [62:62] ==> value-parameter i: Int defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterMultiFileTest.doTest.expectedResultFile[ValueParameterDescriptorImpl]

'path' @ [62:65] ==> public final val File.path: (String..String?)[MyPropertyDescriptor]

'replace' @ [62:70] ==> public fun String.replace(oldValue: String, newValue: String, ignoreCase: Boolean = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'ArrayList' @ [64:27] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> KtFile

'component1' @ [65:15] ==> public final operator fun component1(): Int defined in kotlin.collections.IndexedValue[DeserializedSimpleFunctionDescriptor]

'component2' @ [65:18] ==> public final operator fun component2(): PsiJavaFile defined in kotlin.collections.IndexedValue[DeserializedSimpleFunctionDescriptor]

'psiFilesToConvert' @ [65:31] ==> val psiFilesToConvert: ArrayList<PsiJavaFile> defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterMultiFileTest.doTest[LocalVariableDescriptor]

'withIndex' @ [65:49] ==> public fun <T> Iterable<PsiJavaFile>.withIndex(): Iterable<IndexedValue<PsiJavaFile>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiJavaFile

'deleteFile' @ [66:13] ==> protected final fun deleteFile(virtualFile: VirtualFile): Unit defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterMultiFileTest[SimpleFunctionDescriptorImpl]

'javaFile' @ [66:24] ==> val javaFile: PsiJavaFile defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterMultiFileTest.doTest[LocalVariableDescriptor]

'virtualFile' @ [66:33] ==> public final val PsiJavaFile.virtualFile: (VirtualFile..VirtualFile?)[MyPropertyDescriptor]

'addFile' @ [67:31] ==> protected final fun addFile(text: String, fileName: String, dirName: String): VirtualFile defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterMultiFileTest[SimpleFunctionDescriptorImpl]

'results' @ [67:39] ==> val results: List<String> defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterMultiFileTest.doTest[LocalVariableDescriptor]

'i' @ [67:47] ==> val i: Int defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterMultiFileTest.doTest[LocalVariableDescriptor]

'expectedResultFile' @ [67:51] ==> local final fun expectedResultFile(i: Int): File defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterMultiFileTest.doTest[SimpleFunctionDescriptorImpl]

'i' @ [67:70] ==> val i: Int defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterMultiFileTest.doTest[LocalVariableDescriptor]

'name' @ [67:73] ==> public final val File.name: (String..String?)[MyPropertyDescriptor]

'resultFiles' @ [68:13] ==> val resultFiles: ArrayList<KtFile> defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterMultiFileTest.doTest[LocalVariableDescriptor]

'add' @ [68:25] ==> public open fun add(element: KtFile): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'psiManager' @ [68:29] ==> val psiManager: PsiManager defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterMultiFileTest.doTest[LocalVariableDescriptor]

'findFile' @ [68:40] ==> @Nullable public abstract fun findFile(@NotNull p0: VirtualFile): PsiFile? defined in com.intellij.psi.PsiManager[JavaMethodDescriptor]

'virtualFile' @ [68:49] ==> val virtualFile: VirtualFile defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterMultiFileTest.doTest[LocalVariableDescriptor]

'component1' @ [71:15] ==> public final operator fun component1(): Int defined in kotlin.collections.IndexedValue[DeserializedSimpleFunctionDescriptor]

'component2' @ [71:18] ==> public final operator fun component2(): KtFile defined in kotlin.collections.IndexedValue[DeserializedSimpleFunctionDescriptor]

'resultFiles' @ [71:33] ==> val resultFiles: ArrayList<KtFile> defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterMultiFileTest.doTest[LocalVariableDescriptor]

'withIndex' @ [71:45] ==> public fun <T> Iterable<KtFile>.withIndex(): Iterable<IndexedValue<KtFile>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtFile

'assertEqualsToFile' @ [72:29] ==> public open fun assertEqualsToFile(@NotNull p0: File, @NotNull p1: String): Unit defined in org.jetbrains.kotlin.test.KotlinTestUtils[JavaMethodDescriptor]

'expectedResultFile' @ [72:48] ==> local final fun expectedResultFile(i: Int): File defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterMultiFileTest.doTest[SimpleFunctionDescriptorImpl]

'i' @ [72:67] ==> val i: Int defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterMultiFileTest.doTest[LocalVariableDescriptor]

'kotlinFile' @ [72:71] ==> val kotlinFile: KtFile defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterMultiFileTest.doTest[LocalVariableDescriptor]

'dumpTextWithErrors' @ [72:82] ==> public fun KtFile.dumpTextWithErrors(): String defined in org.jetbrains.kotlin.idea.test in file testUtils.kt[SimpleFunctionDescriptorImpl]

'component1' @ [75:15] ==> public final operator fun component1(): (File..File?) defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [75:29] ==> public final operator fun component2(): PsiFile defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'externalFiles' @ [75:49] ==> val externalFiles: (Array<(File..File?)>..Array<out (File..File?)>?) defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterMultiFileTest.doTest[LocalVariableDescriptor]

'zip' @ [75:63] ==> public infix fun <T, R> Array<out (File..File?)>.zip(other: Iterable<PsiFile>): List<Pair<(File..File?), PsiFile>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (java.io.File..java.io.File?)
    <R> -> PsiFile

'externalPsiFiles' @ [75:67] ==> val externalPsiFiles: ArrayList<PsiFile> defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterMultiFileTest.doTest[LocalVariableDescriptor]

'File' @ [76:32] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'externalFile' @ [76:37] ==> val externalFile: (File..File?) defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterMultiFileTest.doTest[LocalVariableDescriptor]

'path' @ [76:50] ==> public final val File.path: (String..String?)[MyPropertyDescriptor]

'if (externalPsiFile is KtFile) {
                externalPsiFile.dumpTextWithErrors()
            }
            else {
                //TODO: errors dump for java files too
                externalPsiFile.text
            }' @ [77:30] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (String..String?), elseBranch: (String..String?)): (String..String?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (kotlin.String..kotlin.String?)

'externalPsiFile' @ [77:34] ==> val externalPsiFile: PsiFile defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterMultiFileTest.doTest[LocalVariableDescriptor]

'externalPsiFile' @ [78:17] ==> val externalPsiFile: PsiFile defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterMultiFileTest.doTest[LocalVariableDescriptor]

'dumpTextWithErrors' @ [78:33] ==> public fun KtFile.dumpTextWithErrors(): String defined in org.jetbrains.kotlin.idea.test in file testUtils.kt[SimpleFunctionDescriptorImpl]

'externalPsiFile' @ [82:17] ==> val externalPsiFile: PsiFile defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterMultiFileTest.doTest[LocalVariableDescriptor]

'text' @ [82:33] ==> public final val PsiFile.text: (String..String?)[MyPropertyDescriptor]

'assertEqualsToFile' @ [84:29] ==> public open fun assertEqualsToFile(@NotNull p0: File, @NotNull p1: String): Unit defined in org.jetbrains.kotlin.test.KotlinTestUtils[JavaMethodDescriptor]

'expectedFile' @ [84:48] ==> val expectedFile: File defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterMultiFileTest.doTest[LocalVariableDescriptor]

'resultText' @ [84:62] ==> var resultText: (String..String?) defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterMultiFileTest.doTest[LocalVariableDescriptor]

'INSTANCE' @ [89:61] ==> @NotNull public final val INSTANCE: KotlinWithJdkAndRuntimeLightProjectDescriptor defined in org.jetbrains.kotlin.idea.test.KotlinWithJdkAndRuntimeLightProjectDescriptor[JavaPropertyDescriptor]

