'this' @ [49:18] ==> <this> defined in org.jetbrains.kotlin.idea.test.configureAs[ReceiverParameterDescriptorImpl]

'updateModel' @ [50:5] ==> public open fun updateModel(@NotNull p0: Module, @NotNull p1: Consumer<(ModifiableRootModel..ModifiableRootModel?)>): Unit defined in com.intellij.openapi.roots.ModuleRootModificationUtil[JavaMethodDescriptor]

'module' @ [50:17] ==> val module: Module defined in org.jetbrains.kotlin.idea.test.configureAs[LocalVariableDescriptor]

'Consumer' @ [50:25] ==> public fun <T : (Any..Any?)> Consumer(function: ((ModifiableRootModel..ModifiableRootModel?)) -> Unit): Consumer<ModifiableRootModel> defined in com.intellij.util[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : (Any..Any?)> -> ModifiableRootModel

'descriptor' @ [51:13] ==> value-parameter descriptor: KotlinLightProjectDescriptor defined in org.jetbrains.kotlin.idea.test.configureAs[ValueParameterDescriptorImpl]

'sdk' @ [51:24] ==> public final val KotlinLightProjectDescriptor.sdk: Sdk?[MyPropertyDescriptor]

'model' @ [52:13] ==> value-parameter model: (ModifiableRootModel..ModifiableRootModel?) defined in org.jetbrains.kotlin.idea.test.configureAs.<anonymous>[ValueParameterDescriptorImpl]

'sdk' @ [52:19] ==> public final var ModifiableRootModel.sdk: Sdk?[MyPropertyDescriptor]

'descriptor' @ [52:25] ==> value-parameter descriptor: KotlinLightProjectDescriptor defined in org.jetbrains.kotlin.idea.test.configureAs[ValueParameterDescriptorImpl]

'sdk' @ [52:36] ==> public final val KotlinLightProjectDescriptor.sdk: Sdk?[MyPropertyDescriptor]

'model' @ [54:23] ==> value-parameter model: (ModifiableRootModel..ModifiableRootModel?) defined in org.jetbrains.kotlin.idea.test.configureAs.<anonymous>[ValueParameterDescriptorImpl]

'contentEntries' @ [54:29] ==> public final val ModifiableRootModel.contentEntries: (Array<(ContentEntry..ContentEntry?)>..Array<out (ContentEntry..ContentEntry?)>)[MyPropertyDescriptor]

'if (entries.isEmpty()) {
            descriptor.configureModule(module, model)
        }
        else {
            descriptor.configureModule(module, model, entries[0])
        }' @ [55:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'entries' @ [55:13] ==> val entries: (Array<(ContentEntry..ContentEntry?)>..Array<out (ContentEntry..ContentEntry?)>) defined in org.jetbrains.kotlin.idea.test.configureAs.<anonymous>[LocalVariableDescriptor]

'isEmpty' @ [55:21] ==> @InlineOnly public inline fun <T> Array<out (ContentEntry..ContentEntry?)>.isEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.openapi.roots.ContentEntry..com.intellij.openapi.roots.ContentEntry?)

'descriptor' @ [56:13] ==> value-parameter descriptor: KotlinLightProjectDescriptor defined in org.jetbrains.kotlin.idea.test.configureAs[ValueParameterDescriptorImpl]

'configureModule' @ [56:24] ==> public open fun configureModule(@NotNull module: Module, @NotNull model: ModifiableRootModel): Unit defined in org.jetbrains.kotlin.idea.test.KotlinLightProjectDescriptor[JavaMethodDescriptor]

'module' @ [56:40] ==> val module: Module defined in org.jetbrains.kotlin.idea.test.configureAs[LocalVariableDescriptor]

'model' @ [56:48] ==> value-parameter model: (ModifiableRootModel..ModifiableRootModel?) defined in org.jetbrains.kotlin.idea.test.configureAs.<anonymous>[ValueParameterDescriptorImpl]

'descriptor' @ [59:13] ==> value-parameter descriptor: KotlinLightProjectDescriptor defined in org.jetbrains.kotlin.idea.test.configureAs[ValueParameterDescriptorImpl]

'configureModule' @ [59:24] ==> @Override public open fun configureModule(@NotNull module: Module, @NotNull model: ModifiableRootModel, @NotNull contentEntry: ContentEntry): Unit defined in org.jetbrains.kotlin.idea.test.KotlinLightProjectDescriptor[JavaMethodDescriptor]

'module' @ [59:40] ==> val module: Module defined in org.jetbrains.kotlin.idea.test.configureAs[LocalVariableDescriptor]

'model' @ [59:48] ==> value-parameter model: (ModifiableRootModel..ModifiableRootModel?) defined in org.jetbrains.kotlin.idea.test.configureAs.<anonymous>[ValueParameterDescriptorImpl]

'entries' @ [59:55] ==> val entries: (Array<(ContentEntry..ContentEntry?)>..Array<out (ContentEntry..ContentEntry?)>) defined in org.jetbrains.kotlin.idea.test.configureAs.<anonymous>[LocalVariableDescriptor]

'when(kind) {
        ModuleKind.KOTLIN_JVM_WITH_STDLIB_SOURCES ->
            this.configureAs(ProjectDescriptorWithStdlibSources.INSTANCE)
        ModuleKind.KOTLIN_JAVASCRIPT -> {
            this.configureAs(KotlinStdJSProjectDescriptor)
        }

    }' @ [65:5] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'kind' @ [65:10] ==> value-parameter kind: ModuleKind defined in org.jetbrains.kotlin.idea.test.configureAs[ValueParameterDescriptorImpl]

'KOTLIN_JVM_WITH_STDLIB_SOURCES' @ [66:20] ==> enum entry KOTLIN_JVM_WITH_STDLIB_SOURCES defined in org.jetbrains.kotlin.idea.test.ModuleKind[FakeCallableDescriptorForObject]

'this' @ [67:13] ==> <this> defined in org.jetbrains.kotlin.idea.test.configureAs[ReceiverParameterDescriptorImpl]

'configureAs' @ [67:18] ==> public fun Module.configureAs(descriptor: KotlinLightProjectDescriptor): Unit defined in org.jetbrains.kotlin.idea.test in file testUtils.kt[SimpleFunctionDescriptorImpl]

'INSTANCE' @ [67:65] ==> @NotNull public final val INSTANCE: ProjectDescriptorWithStdlibSources defined in org.jetbrains.kotlin.idea.test.ProjectDescriptorWithStdlibSources[JavaPropertyDescriptor]

'KOTLIN_JAVASCRIPT' @ [68:20] ==> enum entry KOTLIN_JAVASCRIPT defined in org.jetbrains.kotlin.idea.test.ModuleKind[FakeCallableDescriptorForObject]

'this' @ [69:13] ==> <this> defined in org.jetbrains.kotlin.idea.test.configureAs[ReceiverParameterDescriptorImpl]

'configureAs' @ [69:18] ==> public fun Module.configureAs(descriptor: KotlinLightProjectDescriptor): Unit defined in org.jetbrains.kotlin.idea.test in file testUtils.kt[SimpleFunctionDescriptorImpl]

'KotlinStdJSProjectDescriptor' @ [69:30] ==> public object KotlinStdJSProjectDescriptor : KotlinLightProjectDescriptor defined in org.jetbrains.kotlin.idea.test in file KotlinStdJSProjectDescriptor.kt[FakeCallableDescriptorForObject]

'analyzeFully' @ [76:23] ==> public fun KtElement.analyzeFully(): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'diagnostics' @ [76:38] ==> public final val BindingContext.diagnostics: Diagnostics[MyPropertyDescriptor]

'diagnostics' @ [77:18] ==> val diagnostics: Diagnostics defined in org.jetbrains.kotlin.idea.test.dumpTextWithErrors[LocalVariableDescriptor]

'filter' @ [77:30] ==> public inline fun <T> Iterable<Diagnostic>.filter(predicate: (Diagnostic) -> Boolean): List<Diagnostic> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Diagnostic

'it' @ [77:39] ==> value-parameter it: Diagnostic defined in org.jetbrains.kotlin.idea.test.dumpTextWithErrors.<anonymous>[ValueParameterDescriptorImpl]

'severity' @ [77:42] ==> public final val Diagnostic.severity: Severity[MyPropertyDescriptor]

'ERROR' @ [77:63] ==> enum entry ERROR defined in org.jetbrains.kotlin.diagnostics.Severity[FakeCallableDescriptorForObject]

'errors' @ [78:9] ==> val errors: List<Diagnostic> defined in org.jetbrains.kotlin.idea.test.dumpTextWithErrors[LocalVariableDescriptor]

'isEmpty' @ [78:16] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'text' @ [78:34] ==> public final val KtFile.text: (String..String?)[MyPropertyDescriptor]

'errors' @ [79:18] ==> val errors: List<Diagnostic> defined in org.jetbrains.kotlin.idea.test.dumpTextWithErrors[LocalVariableDescriptor]

'map' @ [79:25] ==> public inline fun <T, R> Iterable<Diagnostic>.map(transform: (Diagnostic) -> String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Diagnostic
    <R> -> String

'+' @ [79:31] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'render' @ [79:67] ==> @NotNull public open fun render(@NotNull p0: Diagnostic): String defined in org.jetbrains.kotlin.diagnostics.rendering.DefaultErrorMessages[JavaMethodDescriptor]

'it' @ [79:74] ==> value-parameter it: Diagnostic defined in org.jetbrains.kotlin.idea.test.dumpTextWithErrors.<anonymous>[ValueParameterDescriptorImpl]

'replace' @ [79:78] ==> public fun String.replace(oldChar: Char, newChar: Char, ignoreCase: Boolean = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'joinToString' @ [79:99] ==> public fun <T> Iterable<String>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((String) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'header' @ [80:12] ==> val header: String defined in org.jetbrains.kotlin.idea.test.dumpTextWithErrors[LocalVariableDescriptor]

'text' @ [80:21] ==> public final val KtFile.text: (String..String?)[MyPropertyDescriptor]

'closeAndDeleteProject' @ [83:53] ==> public open fun closeAndDeleteProject(): Unit defined in com.intellij.testFramework.LightPlatformTestCase[JavaMethodDescriptor]

'doKotlinTearDown' @ [86:5] ==> public fun doKotlinTearDown(project: Project, runnable: () -> Unit): Unit defined in org.jetbrains.kotlin.idea.test in file testUtils.kt[SimpleFunctionDescriptorImpl]

'project' @ [86:22] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.test.doKotlinTearDown[ValueParameterDescriptorImpl]

'runnable' @ [86:33] ==> value-parameter runnable: RunnableWithException defined in org.jetbrains.kotlin.idea.test.doKotlinTearDown[ValueParameterDescriptorImpl]

'run' @ [86:42] ==> public abstract fun run(): Unit defined in org.jetbrains.kotlin.idea.test.RunnableWithException[JavaMethodDescriptor]

'unInvalidateBuiltinsAndStdLib' @ [90:5] ==> public fun unInvalidateBuiltinsAndStdLib(project: Project, runnable: () -> Unit): Unit defined in org.jetbrains.kotlin.idea.test in file testUtils.kt[SimpleFunctionDescriptorImpl]

'project' @ [90:35] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.test.doKotlinTearDown[ValueParameterDescriptorImpl]

'invoke' @ [91:9] ==> public abstract operator fun invoke(): Unit defined in kotlin.Function0[FunctionInvokeDescriptor]

'HashSet' @ [96:31] ==> public constructor HashSet<E : (Any..Any?)>() defined in java.util.HashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> KotlinDecompiledFileViewProvider

'getInstance' @ [97:47] ==> @NotNull public open fun getInstance(@NotNull p0: Project): PsiManager defined in com.intellij.psi.PsiManager[JavaMethodDescriptor]

'project' @ [97:59] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.test.unInvalidateBuiltinsAndStdLib[ValueParameterDescriptorImpl]

'fileManager' @ [97:85] ==> public final val PsiManagerEx.fileManager: FileManager[MyPropertyDescriptor]

'vFileToViewProviderMap' @ [97:117] ==> public final val FileManagerImpl.vFileToViewProviderMap: ConcurrentMap<(VirtualFile..VirtualFile?), (FileViewProvider..FileViewProvider?)>[MyPropertyDescriptor]

'component1' @ [98:11] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<(VirtualFile..VirtualFile?), (FileViewProvider..FileViewProvider?)>.component1(): (VirtualFile..VirtualFile?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> (com.intellij.openapi.vfs.VirtualFile..com.intellij.openapi.vfs.VirtualFile?)
    <V> -> (com.intellij.psi.FileViewProvider..com.intellij.psi.FileViewProvider?)

'component2' @ [98:17] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<(VirtualFile..VirtualFile?), (FileViewProvider..FileViewProvider?)>.component2(): (FileViewProvider..FileViewProvider?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> (com.intellij.openapi.vfs.VirtualFile..com.intellij.openapi.vfs.VirtualFile?)
    <V> -> (com.intellij.psi.FileViewProvider..com.intellij.psi.FileViewProvider?)

'vFileToViewProviderMap' @ [98:34] ==> val vFileToViewProviderMap: ConcurrentMap<(VirtualFile..VirtualFile?), (FileViewProvider..FileViewProvider?)> defined in org.jetbrains.kotlin.idea.test.unInvalidateBuiltinsAndStdLib[LocalVariableDescriptor]

'file' @ [99:13] ==> val file: (VirtualFile..VirtualFile?) defined in org.jetbrains.kotlin.idea.test.unInvalidateBuiltinsAndStdLib[LocalVariableDescriptor]

'isStdLibFile' @ [99:18] ==> private val VirtualFile.isStdLibFile: Boolean defined in org.jetbrains.kotlin.idea.test in file testUtils.kt[PropertyDescriptorImpl]

'viewProvider' @ [99:34] ==> val viewProvider: (FileViewProvider..FileViewProvider?) defined in org.jetbrains.kotlin.idea.test.unInvalidateBuiltinsAndStdLib[LocalVariableDescriptor]

'stdLibViewProviders' @ [100:13] ==> val stdLibViewProviders: HashSet<KotlinDecompiledFileViewProvider> defined in org.jetbrains.kotlin.idea.test.unInvalidateBuiltinsAndStdLib[LocalVariableDescriptor]

'add' @ [100:33] ==> public open fun add(element: KotlinDecompiledFileViewProvider): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'viewProvider' @ [100:37] ==> val viewProvider: (FileViewProvider..FileViewProvider?) defined in org.jetbrains.kotlin.idea.test.unInvalidateBuiltinsAndStdLib[LocalVariableDescriptor]

'invoke' @ [104:5] ==> public abstract operator fun invoke(): Unit defined in kotlin.Function0[FunctionInvokeDescriptor]

'!!' @ [108:21] ==> public final fun <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-EXCLEXCL-RESOLVE>`(baseExpr: Field?): Field[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> -> Field

'java' @ [108:40] ==> public val <T> KClass<PsiFileImpl>.java: Class<PsiFileImpl> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> PsiFileImpl

'getDeclaredField' @ [108:45] ==> @CallerSensitive public open fun getDeclaredField(p0: (String..String?)): (Field..Field?) defined in java.lang.Class[JavaMethodDescriptor]

'field' @ [109:9] ==> val field: Field defined in org.jetbrains.kotlin.idea.test.unInvalidateBuiltinsAndStdLib.unInvalidateFile[LocalVariableDescriptor]

'isAccessible' @ [109:15] ==> public final var Field.isAccessible: Boolean[MyPropertyDescriptor]

'field' @ [110:9] ==> val field: Field defined in org.jetbrains.kotlin.idea.test.unInvalidateBuiltinsAndStdLib.unInvalidateFile[LocalVariableDescriptor]

'set' @ [110:15] ==> @CallerSensitive public open operator fun set(p0: (Any..Any?), p1: (Any..Any?)): Unit defined in java.lang.reflect.Field[JavaMethodDescriptor]

'file' @ [110:19] ==> value-parameter file: PsiFileImpl defined in org.jetbrains.kotlin.idea.test.unInvalidateBuiltinsAndStdLib.unInvalidateFile[ValueParameterDescriptorImpl]

'stdLibViewProviders' @ [113:5] ==> val stdLibViewProviders: HashSet<KotlinDecompiledFileViewProvider> defined in org.jetbrains.kotlin.idea.test.unInvalidateBuiltinsAndStdLib[LocalVariableDescriptor]

'forEach' @ [113:25] ==> @HidesMembers public inline fun <T> Iterable<KotlinDecompiledFileViewProvider>.forEach(action: (KotlinDecompiledFileViewProvider) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinDecompiledFileViewProvider

'it' @ [114:9] ==> value-parameter it: KotlinDecompiledFileViewProvider defined in org.jetbrains.kotlin.idea.test.unInvalidateBuiltinsAndStdLib.<anonymous>[ValueParameterDescriptorImpl]

'allFiles' @ [114:12] ==> public final val KotlinDecompiledFileViewProvider.allFiles: (MutableList<(PsiFile..PsiFile?)>..List<(PsiFile..PsiFile?)>)[MyPropertyDescriptor]

'forEach' @ [114:21] ==> @HidesMembers public inline fun <T> Iterable<(PsiFile..PsiFile?)>.forEach(action: ((PsiFile..PsiFile?)) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiFile..com.intellij.psi.PsiFile?)

'unInvalidateFile' @ [114:31] ==> local final fun unInvalidateFile(file: PsiFileImpl): Unit defined in org.jetbrains.kotlin.idea.test.unInvalidateBuiltinsAndStdLib[SimpleFunctionDescriptorImpl]

'it' @ [114:48] ==> value-parameter it: (PsiFile..PsiFile?) defined in org.jetbrains.kotlin.idea.test.unInvalidateBuiltinsAndStdLib.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'vFileToViewProviderMap' @ [115:9] ==> val vFileToViewProviderMap: ConcurrentMap<(VirtualFile..VirtualFile?), (FileViewProvider..FileViewProvider?)> defined in org.jetbrains.kotlin.idea.test.unInvalidateBuiltinsAndStdLib[LocalVariableDescriptor]

'it' @ [115:32] ==> value-parameter it: KotlinDecompiledFileViewProvider defined in org.jetbrains.kotlin.idea.test.unInvalidateBuiltinsAndStdLib.<anonymous>[ValueParameterDescriptorImpl]

'virtualFile' @ [115:35] ==> public final val KotlinDecompiledFileViewProvider.virtualFile: VirtualFile[MyPropertyDescriptor]

'it' @ [115:50] ==> value-parameter it: KotlinDecompiledFileViewProvider defined in org.jetbrains.kotlin.idea.test.unInvalidateBuiltinsAndStdLib.<anonymous>[ValueParameterDescriptorImpl]

'presentableUrl' @ [119:55] ==> public final val VirtualFile.presentableUrl: String[MyPropertyDescriptor]

'contains' @ [119:70] ==> public operator fun CharSequence.contains(other: CharSequence, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'LibraryModificationTracker' @ [122:5] ==> public companion object defined in org.jetbrains.kotlin.idea.caches.resolve.LibraryModificationTracker[FakeCallableDescriptorForObject]

'getInstance' @ [122:32] ==> @JvmStatic public final fun getInstance(project: Project): LibraryModificationTracker defined in org.jetbrains.kotlin.idea.caches.resolve.LibraryModificationTracker.Companion[DeserializedSimpleFunctionDescriptor]

'project' @ [122:44] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.test.invalidateLibraryCache[ValueParameterDescriptorImpl]

'incModificationCount' @ [122:53] ==> public open fun incModificationCount(): Unit defined in org.jetbrains.kotlin.idea.caches.resolve.LibraryModificationTracker[JavaMethodDescriptor]

'extractMultipleMarkerOffsets' @ [126:12] ==> public fun Document.extractMultipleMarkerOffsets(project: Project, caretMarker: String = ...): List<Int> defined in org.jetbrains.kotlin.idea.test in file testUtils.kt[SimpleFunctionDescriptorImpl]

'project' @ [126:41] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.test.extractMarkerOffset[ValueParameterDescriptorImpl]

'caretMarker' @ [126:50] ==> value-parameter caretMarker: String = ... defined in org.jetbrains.kotlin.idea.test.extractMarkerOffset[ValueParameterDescriptorImpl]

'singleOrNull' @ [126:63] ==> public fun <T> List<Int>.singleOrNull(): Int? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'-' @ [126:81] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'ArrayList' @ [130:19] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> Int

'runWriteAction' @ [132:5] ==> public fun <T> runWriteAction(action: () -> Unit): Unit defined in org.jetbrains.kotlin.idea.util.application[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit

'StringBuilder' @ [133:20] ==> public final fun <init>(p0: (String..String?)): StringBuilder /* = StringBuilder */ defined in kotlin.text.StringBuilder[TypeAliasConstructorDescriptorImpl]

'text' @ [133:34] ==> public final val Document.text: String[MyPropertyDescriptor]

'text' @ [135:26] ==> val text: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.idea.test.extractMultipleMarkerOffsets.<anonymous>[LocalVariableDescriptor]

'indexOf' @ [135:31] ==> public open fun indexOf(p0: (String..String?)): Int defined in java.lang.StringBuilder[JavaMethodDescriptor]

'caretMarker' @ [135:39] ==> value-parameter caretMarker: String = ... defined in org.jetbrains.kotlin.idea.test.extractMultipleMarkerOffsets[ValueParameterDescriptorImpl]

'if (offset >= 0) {
                text.delete(offset, offset + caretMarker.length)
                setText(text.toString())

                offsets += offset
            }
            else break' @ [136:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'offset' @ [136:17] ==> val offset: Int defined in org.jetbrains.kotlin.idea.test.extractMultipleMarkerOffsets.<anonymous>[LocalVariableDescriptor]

'text' @ [137:17] ==> val text: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.idea.test.extractMultipleMarkerOffsets.<anonymous>[LocalVariableDescriptor]

'delete' @ [137:22] ==> public open fun delete(p0: Int, p1: Int): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'offset' @ [137:29] ==> val offset: Int defined in org.jetbrains.kotlin.idea.test.extractMultipleMarkerOffsets.<anonymous>[LocalVariableDescriptor]

'offset' @ [137:37] ==> val offset: Int defined in org.jetbrains.kotlin.idea.test.extractMultipleMarkerOffsets.<anonymous>[LocalVariableDescriptor]

'caretMarker' @ [137:46] ==> value-parameter caretMarker: String = ... defined in org.jetbrains.kotlin.idea.test.extractMultipleMarkerOffsets[ValueParameterDescriptorImpl]

'length' @ [137:58] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'setText' @ [138:17] ==> public abstract fun setText(@NotNull p0: CharSequence): Unit defined in com.intellij.openapi.editor.Document[JavaMethodDescriptor]

'text' @ [138:25] ==> val text: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.idea.test.extractMultipleMarkerOffsets.<anonymous>[LocalVariableDescriptor]

'toString' @ [138:30] ==> public open fun toString(): String defined in java.lang.StringBuilder[JavaMethodDescriptor]

'offsets' @ [140:17] ==> val offsets: ArrayList<Int> defined in org.jetbrains.kotlin.idea.test.extractMultipleMarkerOffsets[LocalVariableDescriptor]

'offset' @ [140:28] ==> val offset: Int defined in org.jetbrains.kotlin.idea.test.extractMultipleMarkerOffsets.<anonymous>[LocalVariableDescriptor]

'getInstance' @ [146:24] ==> public open fun getInstance(@NotNull p0: Project): (PsiDocumentManager..PsiDocumentManager?) defined in com.intellij.psi.PsiDocumentManager[JavaMethodDescriptor]

'project' @ [146:36] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.test.extractMultipleMarkerOffsets[ValueParameterDescriptorImpl]

'commitAllDocuments' @ [146:45] ==> public abstract fun commitAllDocuments(): Unit defined in com.intellij.psi.PsiDocumentManager[JavaMethodDescriptor]

'getInstance' @ [147:24] ==> public open fun getInstance(@NotNull p0: Project): (PsiDocumentManager..PsiDocumentManager?) defined in com.intellij.psi.PsiDocumentManager[JavaMethodDescriptor]

'project' @ [147:36] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.test.extractMultipleMarkerOffsets[ValueParameterDescriptorImpl]

'doPostponedOperationsAndUnblockDocument' @ [147:45] ==> public abstract fun doPostponedOperationsAndUnblockDocument(@NotNull p0: Document): Unit defined in com.intellij.psi.PsiDocumentManager[JavaMethodDescriptor]

'this' @ [147:85] ==> <this> defined in org.jetbrains.kotlin.idea.test.extractMultipleMarkerOffsets[ReceiverParameterDescriptorImpl]

'offsets' @ [149:12] ==> val offsets: ArrayList<Int> defined in org.jetbrains.kotlin.idea.test.extractMultipleMarkerOffsets[LocalVariableDescriptor]

