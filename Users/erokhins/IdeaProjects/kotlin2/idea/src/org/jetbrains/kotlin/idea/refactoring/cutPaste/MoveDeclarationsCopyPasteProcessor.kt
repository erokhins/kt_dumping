'CopyPastePostProcessor<MoveDeclarationsTransferableData>' @ [39:44] ==> public constructor CopyPastePostProcessor<T : (TextBlockTransferableData..TextBlockTransferableData?)>() defined in com.intellij.codeInsight.editorActions.CopyPastePostProcessor[JavaClassConstructorDescriptor]
Inferred types:
    <T : (TextBlockTransferableData..TextBlockTransferableData?)> -> MoveDeclarationsTransferableData

'getInstance' @ [41:34] ==> @NotNull public open fun getInstance(@NotNull p0: raw (Class<(Any..Any?)>..Class<*>)): Logger defined in com.intellij.openapi.diagnostic.Logger[JavaMethodDescriptor]

'MoveDeclarationsCopyPasteProcessor' @ [41:46] ==> public companion object defined in org.jetbrains.kotlin.idea.refactoring.cutPaste.MoveDeclarationsCopyPasteProcessor[FakeCallableDescriptorForObject]

'java' @ [41:88] ==> public val <T> KClass<MoveDeclarationsCopyPasteProcessor>.java: Class<MoveDeclarationsCopyPasteProcessor> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> MoveDeclarationsCopyPasteProcessor

'file' @ [44:35] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.refactoring.cutPaste.MoveDeclarationsCopyPasteProcessor.Companion.rangeToDeclarations[ValueParameterDescriptorImpl]

'elementsInRange' @ [44:40] ==> public fun PsiFile.elementsInRange(range: TextRange): List<PsiElement> defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'TextRange' @ [44:56] ==> public constructor TextRange(p0: Int, p1: Int) defined in com.intellij.openapi.util.TextRange[JavaClassConstructorDescriptor]

'startOffset' @ [44:66] ==> value-parameter startOffset: Int defined in org.jetbrains.kotlin.idea.refactoring.cutPaste.MoveDeclarationsCopyPasteProcessor.Companion.rangeToDeclarations[ValueParameterDescriptorImpl]

'endOffset' @ [44:79] ==> value-parameter endOffset: Int defined in org.jetbrains.kotlin.idea.refactoring.cutPaste.MoveDeclarationsCopyPasteProcessor.Companion.rangeToDeclarations[ValueParameterDescriptorImpl]

'elementsInRange' @ [45:38] ==> val elementsInRange: List<PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.cutPaste.MoveDeclarationsCopyPasteProcessor.Companion.rangeToDeclarations[LocalVariableDescriptor]

'filterNot' @ [45:54] ==> public inline fun <T> Iterable<PsiElement>.filterNot(predicate: (PsiElement) -> Boolean): List<PsiElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'it' @ [45:66] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.cutPaste.MoveDeclarationsCopyPasteProcessor.Companion.rangeToDeclarations.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [45:89] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.cutPaste.MoveDeclarationsCopyPasteProcessor.Companion.rangeToDeclarations.<anonymous>[ValueParameterDescriptorImpl]

'meaningfulElements' @ [46:17] ==> val meaningfulElements: List<PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.cutPaste.MoveDeclarationsCopyPasteProcessor.Companion.rangeToDeclarations[LocalVariableDescriptor]

'isEmpty' @ [46:36] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'emptyList' @ [46:54] ==> public fun <T> emptyList(): List<KtNamedDeclaration> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtNamedDeclaration

'!' @ [47:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'meaningfulElements' @ [47:18] ==> val meaningfulElements: List<PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.cutPaste.MoveDeclarationsCopyPasteProcessor.Companion.rangeToDeclarations[LocalVariableDescriptor]

'all' @ [47:37] ==> public inline fun <T> Iterable<PsiElement>.all(predicate: (PsiElement) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'it' @ [47:43] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.cutPaste.MoveDeclarationsCopyPasteProcessor.Companion.rangeToDeclarations.<anonymous>[ValueParameterDescriptorImpl]

'emptyList' @ [47:78] ==> public fun <T> emptyList(): List<KtNamedDeclaration> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtNamedDeclaration

'Suppress' @ [48:13] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'meaningfulElements' @ [49:20] ==> val meaningfulElements: List<PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.cutPaste.MoveDeclarationsCopyPasteProcessor.Companion.rangeToDeclarations[LocalVariableDescriptor]

'file' @ [59:13] ==> value-parameter file: PsiFile defined in org.jetbrains.kotlin.idea.refactoring.cutPaste.MoveDeclarationsCopyPasteProcessor.collectTransferableData[ValueParameterDescriptorImpl]

'emptyList' @ [59:37] ==> public fun <T> emptyList(): List<MoveDeclarationsTransferableData> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MoveDeclarationsTransferableData

'startOffsets' @ [60:13] ==> value-parameter startOffsets: IntArray defined in org.jetbrains.kotlin.idea.refactoring.cutPaste.MoveDeclarationsCopyPasteProcessor.collectTransferableData[ValueParameterDescriptorImpl]

'size' @ [60:26] ==> public final val size: Int defined in kotlin.IntArray[DeserializedPropertyDescriptor]

'emptyList' @ [60:44] ==> public fun <T> emptyList(): List<MoveDeclarationsTransferableData> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MoveDeclarationsTransferableData

'rangeToDeclarations' @ [62:28] ==> public final fun rangeToDeclarations(file: KtFile, startOffset: Int, endOffset: Int): List<KtNamedDeclaration> defined in org.jetbrains.kotlin.idea.refactoring.cutPaste.MoveDeclarationsCopyPasteProcessor.Companion[SimpleFunctionDescriptorImpl]

'file' @ [62:48] ==> value-parameter file: PsiFile defined in org.jetbrains.kotlin.idea.refactoring.cutPaste.MoveDeclarationsCopyPasteProcessor.collectTransferableData[ValueParameterDescriptorImpl]

'startOffsets' @ [62:54] ==> value-parameter startOffsets: IntArray defined in org.jetbrains.kotlin.idea.refactoring.cutPaste.MoveDeclarationsCopyPasteProcessor.collectTransferableData[ValueParameterDescriptorImpl]

'endOffsets' @ [62:71] ==> value-parameter endOffsets: IntArray defined in org.jetbrains.kotlin.idea.refactoring.cutPaste.MoveDeclarationsCopyPasteProcessor.collectTransferableData[ValueParameterDescriptorImpl]

'declarations' @ [63:13] ==> val declarations: List<KtNamedDeclaration> defined in org.jetbrains.kotlin.idea.refactoring.cutPaste.MoveDeclarationsCopyPasteProcessor.collectTransferableData[LocalVariableDescriptor]

'isEmpty' @ [63:26] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'emptyList' @ [63:44] ==> public fun <T> emptyList(): List<MoveDeclarationsTransferableData> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MoveDeclarationsTransferableData

'declarations' @ [65:22] ==> val declarations: List<KtNamedDeclaration> defined in org.jetbrains.kotlin.idea.refactoring.cutPaste.MoveDeclarationsCopyPasteProcessor.collectTransferableData[LocalVariableDescriptor]

'map' @ [65:35] ==> public inline fun <T, R> Iterable<KtNamedDeclaration>.map(transform: (KtNamedDeclaration) -> (PsiElement..PsiElement?)): List<(PsiElement..PsiElement?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtNamedDeclaration
    <R> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)

'it' @ [65:41] ==> value-parameter it: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.cutPaste.MoveDeclarationsCopyPasteProcessor.collectTransferableData.<anonymous>[ValueParameterDescriptorImpl]

'parent' @ [65:44] ==> public final val KtNamedDeclaration.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'distinct' @ [65:53] ==> public fun <T> Iterable<(PsiElement..PsiElement?)>.distinct(): List<(PsiElement..PsiElement?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)

'singleOrNull' @ [65:64] ==> public fun <T> List<(PsiElement..PsiElement?)>.singleOrNull(): PsiElement? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)

'emptyList' @ [65:89] ==> public fun <T> emptyList(): List<MoveDeclarationsTransferableData> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MoveDeclarationsTransferableData

'when (parent) {
            is KtFile -> null
            is KtClassBody -> (parent.parent as? KtObjectDeclaration)?.fqName?.asString() ?: return emptyList()
            else -> return emptyList()
        }' @ [66:34] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: String?, entry1: String?, entry2: String?): String?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> String?

'parent' @ [66:40] ==> val parent: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.cutPaste.MoveDeclarationsCopyPasteProcessor.collectTransferableData[LocalVariableDescriptor]

'?:' @ [68:31] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: String?, right: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> String

'parent' @ [68:32] ==> val parent: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.cutPaste.MoveDeclarationsCopyPasteProcessor.collectTransferableData[LocalVariableDescriptor]

'parent' @ [68:39] ==> public final val KtClassBody.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'fqName' @ [68:72] ==> public final val KtObjectDeclaration.fqName: FqName?[MyPropertyDescriptor]

'asString' @ [68:80] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'emptyList' @ [68:101] ==> public fun <T> emptyList(): List<MoveDeclarationsTransferableData> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MoveDeclarationsTransferableData

'emptyList' @ [69:28] ==> public fun <T> emptyList(): List<MoveDeclarationsTransferableData> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MoveDeclarationsTransferableData

'declarations' @ [72:13] ==> val declarations: List<KtNamedDeclaration> defined in org.jetbrains.kotlin.idea.refactoring.cutPaste.MoveDeclarationsCopyPasteProcessor.collectTransferableData[LocalVariableDescriptor]

'any' @ [72:26] ==> public inline fun <T> Iterable<KtNamedDeclaration>.any(predicate: (KtNamedDeclaration) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtNamedDeclaration

'it' @ [72:32] ==> value-parameter it: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.cutPaste.MoveDeclarationsCopyPasteProcessor.collectTransferableData.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [72:35] ==> public final val KtNamedDeclaration.name: String?[MyPropertyDescriptor]

'emptyList' @ [72:58] ==> public fun <T> emptyList(): List<MoveDeclarationsTransferableData> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MoveDeclarationsTransferableData

'declarations' @ [73:32] ==> val declarations: List<KtNamedDeclaration> defined in org.jetbrains.kotlin.idea.refactoring.cutPaste.MoveDeclarationsCopyPasteProcessor.collectTransferableData[LocalVariableDescriptor]

'map' @ [73:45] ==> public inline fun <T, R> Iterable<KtNamedDeclaration>.map(transform: (KtNamedDeclaration) -> String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtNamedDeclaration
    <R> -> String

'it' @ [73:51] ==> value-parameter it: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.cutPaste.MoveDeclarationsCopyPasteProcessor.collectTransferableData.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [73:54] ==> public final val KtNamedDeclaration.name: String?[MyPropertyDescriptor]

'toSet' @ [73:63] ==> public fun <T> Iterable<String>.toSet(): Set<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'declarations' @ [75:25] ==> val declarations: List<KtNamedDeclaration> defined in org.jetbrains.kotlin.idea.refactoring.cutPaste.MoveDeclarationsCopyPasteProcessor.collectTransferableData[LocalVariableDescriptor]

'map' @ [75:38] ==> public inline fun <T, R> Iterable<KtNamedDeclaration>.map(transform: (KtNamedDeclaration) -> String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtNamedDeclaration
    <R> -> String

'MoveDeclarationsTransferableData' @ [75:44] ==> public companion object defined in org.jetbrains.kotlin.idea.refactoring.cutPaste.MoveDeclarationsTransferableData[FakeCallableDescriptorForObject]

'STUB_RENDERER' @ [75:77] ==> public final val STUB_RENDERER: DescriptorRenderer defined in org.jetbrains.kotlin.idea.refactoring.cutPaste.MoveDeclarationsTransferableData.Companion[PropertyDescriptorImpl]

'render' @ [75:91] ==> public abstract fun render(declarationDescriptor: DeclarationDescriptor): String defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[DeserializedSimpleFunctionDescriptor]

'it' @ [75:98] ==> value-parameter it: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.cutPaste.MoveDeclarationsCopyPasteProcessor.collectTransferableData.<anonymous>[ValueParameterDescriptorImpl]

'resolveToDescriptor' @ [75:101] ==> public fun KtDeclaration.resolveToDescriptor(bodyResolveMode: BodyResolveMode = ...): DeclarationDescriptor defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'listOf' @ [76:16] ==> public fun <T> listOf(element: MoveDeclarationsTransferableData): List<MoveDeclarationsTransferableData> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MoveDeclarationsTransferableData

'MoveDeclarationsTransferableData' @ [76:23] ==> public constructor MoveDeclarationsTransferableData(sourceFileUrl: String, sourceObjectFqName: String?, stubTexts: List<String>, declarationNames: Set<String>) defined in org.jetbrains.kotlin.idea.refactoring.cutPaste.MoveDeclarationsTransferableData[ClassConstructorDescriptorImpl]

'file' @ [76:56] ==> value-parameter file: PsiFile defined in org.jetbrains.kotlin.idea.refactoring.cutPaste.MoveDeclarationsCopyPasteProcessor.collectTransferableData[ValueParameterDescriptorImpl]

'virtualFile' @ [76:61] ==> public final val KtFile.virtualFile: (VirtualFile..VirtualFile?)[MyPropertyDescriptor]

'url' @ [76:73] ==> public final val VirtualFile.url: String[MyPropertyDescriptor]

'sourceObjectFqName' @ [76:78] ==> val sourceObjectFqName: String? defined in org.jetbrains.kotlin.idea.refactoring.cutPaste.MoveDeclarationsCopyPasteProcessor.collectTransferableData[LocalVariableDescriptor]

'stubTexts' @ [76:98] ==> val stubTexts: List<String> defined in org.jetbrains.kotlin.idea.refactoring.cutPaste.MoveDeclarationsCopyPasteProcessor.collectTransferableData[LocalVariableDescriptor]

'declarationNames' @ [76:109] ==> val declarationNames: Set<String> defined in org.jetbrains.kotlin.idea.refactoring.cutPaste.MoveDeclarationsCopyPasteProcessor.collectTransferableData[LocalVariableDescriptor]

'content' @ [81:17] ==> value-parameter content: Transferable defined in org.jetbrains.kotlin.idea.refactoring.cutPaste.MoveDeclarationsCopyPasteProcessor.extractTransferableData[ValueParameterDescriptorImpl]

'isDataFlavorSupported' @ [81:25] ==> public abstract fun isDataFlavorSupported(p0: (DataFlavor..DataFlavor?)): Boolean defined in java.awt.datatransfer.Transferable[JavaMethodDescriptor]

'MoveDeclarationsTransferableData' @ [81:47] ==> public companion object defined in org.jetbrains.kotlin.idea.refactoring.cutPaste.MoveDeclarationsTransferableData[FakeCallableDescriptorForObject]

'DATA_FLAVOR' @ [81:80] ==> public final val DATA_FLAVOR: DataFlavor defined in org.jetbrains.kotlin.idea.refactoring.cutPaste.MoveDeclarationsTransferableData.Companion[PropertyDescriptorImpl]

'listOf' @ [82:24] ==> public fun <T> listOf(element: MoveDeclarationsTransferableData): List<MoveDeclarationsTransferableData> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MoveDeclarationsTransferableData

'content' @ [82:31] ==> value-parameter content: Transferable defined in org.jetbrains.kotlin.idea.refactoring.cutPaste.MoveDeclarationsCopyPasteProcessor.extractTransferableData[ValueParameterDescriptorImpl]

'getTransferData' @ [82:39] ==> public abstract fun getTransferData(p0: (DataFlavor..DataFlavor?)): (Any..Any?) defined in java.awt.datatransfer.Transferable[JavaMethodDescriptor]

'MoveDeclarationsTransferableData' @ [82:55] ==> public companion object defined in org.jetbrains.kotlin.idea.refactoring.cutPaste.MoveDeclarationsTransferableData[FakeCallableDescriptorForObject]

'DATA_FLAVOR' @ [82:88] ==> public final val DATA_FLAVOR: DataFlavor defined in org.jetbrains.kotlin.idea.refactoring.cutPaste.MoveDeclarationsTransferableData.Companion[PropertyDescriptorImpl]

'LOG' @ [86:13] ==> private final val LOG: Logger defined in org.jetbrains.kotlin.idea.refactoring.cutPaste.MoveDeclarationsCopyPasteProcessor.Companion[PropertyDescriptorImpl]

'error' @ [86:17] ==> public open fun error(@NotNull p0: Throwable): Unit defined in com.intellij.openapi.diagnostic.Logger[JavaMethodDescriptor]

'e' @ [86:23] ==> val e: Throwable defined in org.jetbrains.kotlin.idea.refactoring.cutPaste.MoveDeclarationsCopyPasteProcessor.extractTransferableData[LocalVariableDescriptor]

'emptyList' @ [88:16] ==> public fun <T> emptyList(): List<MoveDeclarationsTransferableData> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MoveDeclarationsTransferableData

'values' @ [99:20] ==> value-parameter values: List<MoveDeclarationsTransferableData> defined in org.jetbrains.kotlin.idea.refactoring.cutPaste.MoveDeclarationsCopyPasteProcessor.processTransferableData[ValueParameterDescriptorImpl]

'single' @ [99:27] ==> public fun <T> List<MoveDeclarationsTransferableData>.single(): MoveDeclarationsTransferableData defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MoveDeclarationsTransferableData

'bounds' @ [102:17] ==> value-parameter bounds: RangeMarker defined in org.jetbrains.kotlin.idea.refactoring.cutPaste.MoveDeclarationsCopyPasteProcessor.processTransferableData[ValueParameterDescriptorImpl]

'isValid' @ [102:24] ==> public final val RangeMarker.isValid: Boolean[MyPropertyDescriptor]

'MoveDeclarationsEditorCookie' @ [103:30] ==> public constructor MoveDeclarationsEditorCookie(data: MoveDeclarationsTransferableData, bounds: RangeMarker, modificationCount: Long) defined in org.jetbrains.kotlin.idea.refactoring.cutPaste.MoveDeclarationsEditorCookie[ClassConstructorDescriptorImpl]

'data' @ [103:59] ==> val data: MoveDeclarationsTransferableData defined in org.jetbrains.kotlin.idea.refactoring.cutPaste.MoveDeclarationsCopyPasteProcessor.processTransferableData[LocalVariableDescriptor]

'bounds' @ [103:65] ==> value-parameter bounds: RangeMarker defined in org.jetbrains.kotlin.idea.refactoring.cutPaste.MoveDeclarationsCopyPasteProcessor.processTransferableData[ValueParameterDescriptorImpl]

'getInstance' @ [103:104] ==> public open fun getInstance(p0: (Project..Project?)): (PsiModificationTracker..PsiModificationTracker?) defined in com.intellij.psi.util.PsiModificationTracker.SERVICE[JavaMethodDescriptor]

'project' @ [103:116] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.refactoring.cutPaste.MoveDeclarationsCopyPasteProcessor.processTransferableData[ValueParameterDescriptorImpl]

'modificationCount' @ [103:125] ==> public final val PsiModificationTracker.modificationCount: Long[MyPropertyDescriptor]

'editor' @ [104:17] ==> value-parameter editor: Editor defined in org.jetbrains.kotlin.idea.refactoring.cutPaste.MoveDeclarationsCopyPasteProcessor.processTransferableData[ValueParameterDescriptorImpl]

'putUserData' @ [104:24] ==> public abstract fun <T : (Any..Any?)> putUserData(@NotNull p0: Key<(MoveDeclarationsEditorCookie..MoveDeclarationsEditorCookie?)>, @Nullable p1: MoveDeclarationsEditorCookie?): Unit defined in com.intellij.openapi.editor.Editor[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> MoveDeclarationsEditorCookie

'MoveDeclarationsEditorCookie' @ [104:36] ==> public companion object defined in org.jetbrains.kotlin.idea.refactoring.cutPaste.MoveDeclarationsEditorCookie[FakeCallableDescriptorForObject]

'KEY' @ [104:65] ==> public final val KEY: Key<MoveDeclarationsEditorCookie> defined in org.jetbrains.kotlin.idea.refactoring.cutPaste.MoveDeclarationsEditorCookie.Companion[PropertyDescriptorImpl]

'cookie' @ [104:70] ==> val cookie: MoveDeclarationsEditorCookie defined in org.jetbrains.kotlin.idea.refactoring.cutPaste.MoveDeclarationsCopyPasteProcessor.processTransferableData.putCookie[LocalVariableDescriptor]

'if (ApplicationManager.getApplication().isUnitTestMode) {
            putCookie()
        }
        else {
            // in real application we put cookie later to allow all other paste handlers do their work (because modificationCount will change)
            ApplicationManager.getApplication().invokeLater(::putCookie)
        }' @ [108:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'getApplication' @ [108:32] ==> public open fun getApplication(): (Application..Application?) defined in com.intellij.openapi.application.ApplicationManager[JavaMethodDescriptor]

'isUnitTestMode' @ [108:49] ==> public final val Application.isUnitTestMode: Boolean[MyPropertyDescriptor]

'putCookie' @ [109:13] ==> local final fun putCookie(): Unit defined in org.jetbrains.kotlin.idea.refactoring.cutPaste.MoveDeclarationsCopyPasteProcessor.processTransferableData[SimpleFunctionDescriptorImpl]

'getApplication' @ [113:32] ==> public open fun getApplication(): (Application..Application?) defined in com.intellij.openapi.application.ApplicationManager[JavaMethodDescriptor]

'invokeLater' @ [113:49] ==> public final fun invokeLater(@NotNull p0: () -> Unit): Unit defined in com.intellij.openapi.application.Application[MyFunctionDescriptor]

