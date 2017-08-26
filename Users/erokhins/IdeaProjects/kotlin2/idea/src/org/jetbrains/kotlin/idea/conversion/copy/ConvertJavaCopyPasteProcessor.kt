'CopyPastePostProcessor<TextBlockTransferableData>' @ [57:39] ==> public constructor CopyPastePostProcessor<T : (TextBlockTransferableData..TextBlockTransferableData?)>() defined in com.intellij.codeInsight.editorActions.CopyPastePostProcessor[JavaClassConstructorDescriptor]
Inferred types:
    <T : (TextBlockTransferableData..TextBlockTransferableData?)> -> TextBlockTransferableData

'getInstance' @ [58:30] ==> @NotNull public open fun getInstance(@NotNull p0: raw (Class<(Any..Any?)>..Class<*>)): Logger defined in com.intellij.openapi.diagnostic.Logger[JavaMethodDescriptor]

'ConvertJavaCopyPasteProcessor' @ [58:42] ==> public companion object defined in org.jetbrains.kotlin.idea.conversion.copy.ConvertJavaCopyPasteProcessor[FakeCallableDescriptorForObject]

'java' @ [58:79] ==> public val <T> KClass<ConvertJavaCopyPasteProcessor>.java: Class<ConvertJavaCopyPasteProcessor> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> ConvertJavaCopyPasteProcessor

'content' @ [62:17] ==> value-parameter content: Transferable defined in org.jetbrains.kotlin.idea.conversion.copy.ConvertJavaCopyPasteProcessor.extractTransferableData[ValueParameterDescriptorImpl]

'isDataFlavorSupported' @ [62:25] ==> public abstract fun isDataFlavorSupported(p0: (DataFlavor..DataFlavor?)): Boolean defined in java.awt.datatransfer.Transferable[JavaMethodDescriptor]

'DATA_FLAVOR' @ [62:62] ==> public final val DATA_FLAVOR: DataFlavor defined in org.jetbrains.kotlin.idea.conversion.copy.CopiedJavaCode.Companion[PropertyDescriptorImpl]

'listOf' @ [63:24] ==> public fun <T> listOf(element: TextBlockTransferableData): List<TextBlockTransferableData> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TextBlockTransferableData

'content' @ [63:31] ==> value-parameter content: Transferable defined in org.jetbrains.kotlin.idea.conversion.copy.ConvertJavaCopyPasteProcessor.extractTransferableData[ValueParameterDescriptorImpl]

'getTransferData' @ [63:39] ==> public abstract fun getTransferData(p0: (DataFlavor..DataFlavor?)): (Any..Any?) defined in java.awt.datatransfer.Transferable[JavaMethodDescriptor]

'DATA_FLAVOR' @ [63:70] ==> public final val DATA_FLAVOR: DataFlavor defined in org.jetbrains.kotlin.idea.conversion.copy.CopiedJavaCode.Companion[PropertyDescriptorImpl]

'LOG' @ [67:13] ==> private final val LOG: Logger defined in org.jetbrains.kotlin.idea.conversion.copy.ConvertJavaCopyPasteProcessor[PropertyDescriptorImpl]

'error' @ [67:17] ==> public open fun error(@NotNull p0: Throwable): Unit defined in com.intellij.openapi.diagnostic.Logger[JavaMethodDescriptor]

'e' @ [67:23] ==> val e: Throwable defined in org.jetbrains.kotlin.idea.conversion.copy.ConvertJavaCopyPasteProcessor.extractTransferableData[LocalVariableDescriptor]

'listOf' @ [69:16] ==> @InlineOnly public inline fun <T> listOf(): List<TextBlockTransferableData> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TextBlockTransferableData

'file' @ [73:13] ==> value-parameter file: PsiFile defined in org.jetbrains.kotlin.idea.conversion.copy.ConvertJavaCopyPasteProcessor.collectTransferableData[ValueParameterDescriptorImpl]

'listOf' @ [73:42] ==> @InlineOnly public inline fun <T> listOf(): List<TextBlockTransferableData> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TextBlockTransferableData

'listOf' @ [75:16] ==> public fun <T> listOf(element: CopiedJavaCode): List<CopiedJavaCode> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CopiedJavaCode

'CopiedJavaCode' @ [75:23] ==> public constructor CopiedJavaCode(fileText: String, startOffsets: IntArray, endOffsets: IntArray) defined in org.jetbrains.kotlin.idea.conversion.copy.CopiedJavaCode[ClassConstructorDescriptorImpl]

'file' @ [75:38] ==> value-parameter file: PsiFile defined in org.jetbrains.kotlin.idea.conversion.copy.ConvertJavaCopyPasteProcessor.collectTransferableData[ValueParameterDescriptorImpl]

'getText' @ [75:43] ==> @NonNls @Contract public abstract fun getText(): (String..String?) defined in com.intellij.psi.PsiFile[JavaMethodDescriptor]

'startOffsets' @ [75:56] ==> value-parameter startOffsets: IntArray defined in org.jetbrains.kotlin.idea.conversion.copy.ConvertJavaCopyPasteProcessor.collectTransferableData[ValueParameterDescriptorImpl]

'endOffsets' @ [75:70] ==> value-parameter endOffsets: IntArray defined in org.jetbrains.kotlin.idea.conversion.copy.ConvertJavaCopyPasteProcessor.collectTransferableData[ValueParameterDescriptorImpl]

'getInstance' @ [79:25] ==> public open fun getInstance(@NotNull p0: Project): (DumbService..DumbService?) defined in com.intellij.openapi.project.DumbService[JavaMethodDescriptor]

'project' @ [79:37] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.conversion.copy.ConvertJavaCopyPasteProcessor.processTransferableData[ValueParameterDescriptorImpl]

'isDumb' @ [79:46] ==> public final val DumbService.isDumb: Boolean[MyPropertyDescriptor]

'!' @ [80:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'getInstance' @ [80:34] ==> public open fun getInstance(): (KotlinEditorOptions..KotlinEditorOptions?) defined in org.jetbrains.kotlin.idea.editor.KotlinEditorOptions[JavaMethodDescriptor]

'isEnableJavaToKotlinConversion' @ [80:48] ==> public final var KotlinEditorOptions.isEnableJavaToKotlinConversion: Boolean[MyPropertyDescriptor]

'values' @ [82:20] ==> value-parameter values: List<TextBlockTransferableData> defined in org.jetbrains.kotlin.idea.conversion.copy.ConvertJavaCopyPasteProcessor.processTransferableData[ValueParameterDescriptorImpl]

'single' @ [82:27] ==> public fun <T> List<TextBlockTransferableData>.single(): TextBlockTransferableData defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TextBlockTransferableData

'editor' @ [84:24] ==> value-parameter editor: Editor defined in org.jetbrains.kotlin.idea.conversion.copy.ConvertJavaCopyPasteProcessor.processTransferableData[ValueParameterDescriptorImpl]

'document' @ [84:31] ==> public final val Editor.document: Document[MyPropertyDescriptor]

'?:' @ [85:26] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: KtFile?, right: KtFile): KtFile[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> KtFile

'getInstance' @ [85:45] ==> public open fun getInstance(@NotNull p0: Project): (PsiDocumentManager..PsiDocumentManager?) defined in com.intellij.psi.PsiDocumentManager[JavaMethodDescriptor]

'project' @ [85:57] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.conversion.copy.ConvertJavaCopyPasteProcessor.processTransferableData[ValueParameterDescriptorImpl]

'getPsiFile' @ [85:66] ==> @Nullable public abstract fun getPsiFile(@NotNull p0: Document): PsiFile? defined in com.intellij.psi.PsiDocumentManager[JavaMethodDescriptor]

'document' @ [85:77] ==> val document: Document defined in org.jetbrains.kotlin.idea.conversion.copy.ConvertJavaCopyPasteProcessor.processTransferableData[LocalVariableDescriptor]

'isNoConversionPosition' @ [87:13] ==> internal fun isNoConversionPosition(file: KtFile, offset: Int): Boolean defined in org.jetbrains.kotlin.idea.conversion.copy in file ConvertJavaCopyPasteProcessor.kt[SimpleFunctionDescriptorImpl]

'targetFile' @ [87:36] ==> val targetFile: KtFile defined in org.jetbrains.kotlin.idea.conversion.copy.ConvertJavaCopyPasteProcessor.processTransferableData[LocalVariableDescriptor]

'bounds' @ [87:48] ==> value-parameter bounds: RangeMarker defined in org.jetbrains.kotlin.idea.conversion.copy.ConvertJavaCopyPasteProcessor.processTransferableData[ValueParameterDescriptorImpl]

'startOffset' @ [87:55] ==> public final val RangeMarker.startOffset: Int[MyPropertyDescriptor]

'DataForConversion' @ [92:37] ==> public companion object defined in org.jetbrains.kotlin.idea.conversion.copy.DataForConversion[FakeCallableDescriptorForObject]

'prepare' @ [92:55] ==> public final fun prepare(copiedCode: CopiedJavaCode, project: Project): DataForConversion defined in org.jetbrains.kotlin.idea.conversion.copy.DataForConversion.Companion[SimpleFunctionDescriptorImpl]

'data' @ [92:63] ==> val data: CopiedJavaCode defined in org.jetbrains.kotlin.idea.conversion.copy.ConvertJavaCopyPasteProcessor.processTransferableData[LocalVariableDescriptor]

'project' @ [92:69] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.conversion.copy.ConvertJavaCopyPasteProcessor.processTransferableData[ValueParameterDescriptorImpl]

'dataForConversion' @ [93:26] ==> val dataForConversion: DataForConversion defined in org.jetbrains.kotlin.idea.conversion.copy.ConvertJavaCopyPasteProcessor.processTransferableData.doConversion[LocalVariableDescriptor]

'elementsAndTexts' @ [93:44] ==> public final val elementsAndTexts: ElementAndTextList defined in org.jetbrains.kotlin.idea.conversion.copy.DataForConversion[PropertyDescriptorImpl]

'convertCodeToKotlin' @ [93:61] ==> internal fun ElementAndTextList.convertCodeToKotlin(project: Project): ConversionResult defined in org.jetbrains.kotlin.idea.conversion.copy in file ConvertJavaCopyPasteProcessor.kt[SimpleFunctionDescriptorImpl]

'project' @ [93:81] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.conversion.copy.ConvertJavaCopyPasteProcessor.processTransferableData[ValueParameterDescriptorImpl]

'buildReferenceData' @ [94:33] ==> private final fun buildReferenceData(text: String, parseContext: ParseContext, importsAndPackage: String, targetFile: KtFile): Collection<KotlinReferenceData> defined in org.jetbrains.kotlin.idea.conversion.copy.ConvertJavaCopyPasteProcessor[SimpleFunctionDescriptorImpl]

'result' @ [94:52] ==> val result: ConversionResult defined in org.jetbrains.kotlin.idea.conversion.copy.ConvertJavaCopyPasteProcessor.processTransferableData.doConversion[LocalVariableDescriptor]

'text' @ [94:59] ==> public final val text: String defined in org.jetbrains.kotlin.idea.conversion.copy.ConversionResult[PropertyDescriptorImpl]

'result' @ [94:65] ==> val result: ConversionResult defined in org.jetbrains.kotlin.idea.conversion.copy.ConvertJavaCopyPasteProcessor.processTransferableData.doConversion[LocalVariableDescriptor]

'parseContext' @ [94:72] ==> public final val parseContext: ParseContext defined in org.jetbrains.kotlin.idea.conversion.copy.ConversionResult[PropertyDescriptorImpl]

'dataForConversion' @ [94:86] ==> val dataForConversion: DataForConversion defined in org.jetbrains.kotlin.idea.conversion.copy.ConvertJavaCopyPasteProcessor.processTransferableData.doConversion[LocalVariableDescriptor]

'importsAndPackage' @ [94:104] ==> public final val importsAndPackage: String defined in org.jetbrains.kotlin.idea.conversion.copy.DataForConversion[PropertyDescriptorImpl]

'targetFile' @ [94:123] ==> val targetFile: KtFile defined in org.jetbrains.kotlin.idea.conversion.copy.ConvertJavaCopyPasteProcessor.processTransferableData[LocalVariableDescriptor]

'if (result.textChanged) result.text else null' @ [95:24] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String?, elseBranch: String?): String?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String?

'result' @ [95:28] ==> val result: ConversionResult defined in org.jetbrains.kotlin.idea.conversion.copy.ConvertJavaCopyPasteProcessor.processTransferableData.doConversion[LocalVariableDescriptor]

'textChanged' @ [95:35] ==> public final val textChanged: Boolean defined in org.jetbrains.kotlin.idea.conversion.copy.ConversionResult[PropertyDescriptorImpl]

'result' @ [95:48] ==> val result: ConversionResult defined in org.jetbrains.kotlin.idea.conversion.copy.ConvertJavaCopyPasteProcessor.processTransferableData.doConversion[LocalVariableDescriptor]

'text' @ [95:55] ==> public final val text: String defined in org.jetbrains.kotlin.idea.conversion.copy.ConversionResult[PropertyDescriptorImpl]

'Result' @ [96:20] ==> public constructor Result(text: String?, referenceData: Collection<KotlinReferenceData>, explicitImports: Set<FqName>) defined in org.jetbrains.kotlin.idea.conversion.copy.ConvertJavaCopyPasteProcessor.processTransferableData.Result[ClassConstructorDescriptorImpl]

'text' @ [96:27] ==> val text: String? defined in org.jetbrains.kotlin.idea.conversion.copy.ConvertJavaCopyPasteProcessor.processTransferableData.doConversion[LocalVariableDescriptor]

'referenceData' @ [96:33] ==> val referenceData: Collection<KotlinReferenceData> defined in org.jetbrains.kotlin.idea.conversion.copy.ConvertJavaCopyPasteProcessor.processTransferableData.doConversion[LocalVariableDescriptor]

'result' @ [96:48] ==> val result: ConversionResult defined in org.jetbrains.kotlin.idea.conversion.copy.ConvertJavaCopyPasteProcessor.processTransferableData.doConversion[LocalVariableDescriptor]

'importsToAdd' @ [96:55] ==> public final val importsToAdd: Set<FqName> defined in org.jetbrains.kotlin.idea.conversion.copy.ConversionResult[PropertyDescriptorImpl]

'referenceData' @ [100:17] ==> value-parameter referenceData: Collection<KotlinReferenceData> defined in org.jetbrains.kotlin.idea.conversion.copy.ConvertJavaCopyPasteProcessor.processTransferableData.insertImports[ValueParameterDescriptorImpl]

'isEmpty' @ [100:31] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.Collection[DeserializedSimpleFunctionDescriptor]

'explicitImports' @ [100:44] ==> value-parameter explicitImports: Collection<FqName> defined in org.jetbrains.kotlin.idea.conversion.copy.ConvertJavaCopyPasteProcessor.processTransferableData.insertImports[ValueParameterDescriptorImpl]

'isEmpty' @ [100:60] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.Collection[DeserializedSimpleFunctionDescriptor]

'bounds' @ [100:78] ==> value-parameter bounds: TextRange defined in org.jetbrains.kotlin.idea.conversion.copy.ConvertJavaCopyPasteProcessor.processTransferableData.insertImports[ValueParameterDescriptorImpl]

'getInstance' @ [102:32] ==> public open fun getInstance(@NotNull p0: Project): (PsiDocumentManager..PsiDocumentManager?) defined in com.intellij.psi.PsiDocumentManager[JavaMethodDescriptor]

'project' @ [102:44] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.conversion.copy.ConvertJavaCopyPasteProcessor.processTransferableData[ValueParameterDescriptorImpl]

'commitAllDocuments' @ [102:53] ==> public abstract fun commitAllDocuments(): Unit defined in com.intellij.psi.PsiDocumentManager[JavaMethodDescriptor]

'document' @ [104:31] ==> val document: Document defined in org.jetbrains.kotlin.idea.conversion.copy.ConvertJavaCopyPasteProcessor.processTransferableData[LocalVariableDescriptor]

'createRangeMarker' @ [104:40] ==> @NotNull public open fun createRangeMarker(@NotNull p0: TextRange): RangeMarker defined in com.intellij.openapi.editor.Document[JavaMethodDescriptor]

'bounds' @ [104:58] ==> value-parameter bounds: TextRange defined in org.jetbrains.kotlin.idea.conversion.copy.ConvertJavaCopyPasteProcessor.processTransferableData.insertImports[ValueParameterDescriptorImpl]

'rangeMarker' @ [105:13] ==> val rangeMarker: RangeMarker defined in org.jetbrains.kotlin.idea.conversion.copy.ConvertJavaCopyPasteProcessor.processTransferableData.insertImports[LocalVariableDescriptor]

'isGreedyToLeft' @ [105:25] ==> public final var RangeMarker.isGreedyToLeft: Boolean[MyPropertyDescriptor]

'rangeMarker' @ [106:13] ==> val rangeMarker: RangeMarker defined in org.jetbrains.kotlin.idea.conversion.copy.ConvertJavaCopyPasteProcessor.processTransferableData.insertImports[LocalVariableDescriptor]

'isGreedyToRight' @ [106:25] ==> public final var RangeMarker.isGreedyToRight: Boolean[MyPropertyDescriptor]

'KotlinCopyPasteReferenceProcessor' @ [108:13] ==> public constructor KotlinCopyPasteReferenceProcessor() defined in org.jetbrains.kotlin.idea.codeInsight.KotlinCopyPasteReferenceProcessor[ClassConstructorDescriptorImpl]

'processReferenceData' @ [108:49] ==> public final fun processReferenceData(project: Project, file: KtFile, blockStart: Int, referenceData: Array<KotlinReferenceData>): Unit defined in org.jetbrains.kotlin.idea.codeInsight.KotlinCopyPasteReferenceProcessor[SimpleFunctionDescriptorImpl]

'project' @ [108:70] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.conversion.copy.ConvertJavaCopyPasteProcessor.processTransferableData[ValueParameterDescriptorImpl]

'targetFile' @ [108:79] ==> val targetFile: KtFile defined in org.jetbrains.kotlin.idea.conversion.copy.ConvertJavaCopyPasteProcessor.processTransferableData[LocalVariableDescriptor]

'bounds' @ [108:91] ==> value-parameter bounds: TextRange defined in org.jetbrains.kotlin.idea.conversion.copy.ConvertJavaCopyPasteProcessor.processTransferableData.insertImports[ValueParameterDescriptorImpl]

'start' @ [108:98] ==> public val TextRange.start: Int defined in org.jetbrains.kotlin.idea.conversion.copy in file RangeUtils.kt[PropertyDescriptorImpl]

'referenceData' @ [108:105] ==> value-parameter referenceData: Collection<KotlinReferenceData> defined in org.jetbrains.kotlin.idea.conversion.copy.ConvertJavaCopyPasteProcessor.processTransferableData.insertImports[ValueParameterDescriptorImpl]

'toTypedArray' @ [108:119] ==> public inline fun <reified T> Collection<KotlinReferenceData>.toTypedArray(): Array<KotlinReferenceData> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> KotlinReferenceData

'runWriteAction' @ [110:13] ==> public fun <T> runWriteAction(action: () -> Unit): Unit defined in org.jetbrains.kotlin.idea.util.application[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit

'explicitImports' @ [111:17] ==> value-parameter explicitImports: Collection<FqName> defined in org.jetbrains.kotlin.idea.conversion.copy.ConvertJavaCopyPasteProcessor.processTransferableData.insertImports[ValueParameterDescriptorImpl]

'forEach' @ [111:33] ==> @HidesMembers public inline fun <T> Iterable<FqName>.forEach(action: (FqName) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FqName

'targetFile' @ [112:21] ==> val targetFile: KtFile defined in org.jetbrains.kotlin.idea.conversion.copy.ConvertJavaCopyPasteProcessor.processTransferableData[LocalVariableDescriptor]

'resolveImportReference' @ [112:32] ==> public fun KtFile.resolveImportReference(fqName: FqName): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'fqName' @ [112:55] ==> value-parameter fqName: FqName defined in org.jetbrains.kotlin.idea.conversion.copy.ConvertJavaCopyPasteProcessor.processTransferableData.insertImports.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'firstOrNull' @ [112:63] ==> public fun <T> Iterable<DeclarationDescriptor>.firstOrNull(): DeclarationDescriptor? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'let' @ [112:78] ==> @InlineOnly public inline fun <T, R> DeclarationDescriptor.let(block: (DeclarationDescriptor) -> ImportDescriptorResult): ImportDescriptorResult defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor
    <R> -> ImportDescriptorResult

'ImportInsertHelper' @ [113:25] ==> public companion object defined in org.jetbrains.kotlin.idea.util.ImportInsertHelper[FakeCallableDescriptorForObject]

'getInstance' @ [113:44] ==> @JvmStatic public final fun getInstance(project: Project): ImportInsertHelper defined in org.jetbrains.kotlin.idea.util.ImportInsertHelper.Companion[DeserializedSimpleFunctionDescriptor]

'project' @ [113:56] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.conversion.copy.ConvertJavaCopyPasteProcessor.processTransferableData[ValueParameterDescriptorImpl]

'importDescriptor' @ [113:65] ==> public abstract fun importDescriptor(file: KtFile, descriptor: DeclarationDescriptor, forceAllUnderImport: Boolean = ...): ImportDescriptorResult defined in org.jetbrains.kotlin.idea.util.ImportInsertHelper[DeserializedSimpleFunctionDescriptor]

'targetFile' @ [113:82] ==> val targetFile: KtFile defined in org.jetbrains.kotlin.idea.conversion.copy.ConvertJavaCopyPasteProcessor.processTransferableData[LocalVariableDescriptor]

'it' @ [113:94] ==> value-parameter it: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.conversion.copy.ConvertJavaCopyPasteProcessor.processTransferableData.insertImports.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'rangeMarker' @ [118:20] ==> val rangeMarker: RangeMarker defined in org.jetbrains.kotlin.idea.conversion.copy.ConvertJavaCopyPasteProcessor.processTransferableData.insertImports[LocalVariableDescriptor]

'range' @ [118:32] ==> public val RangeMarker.range: TextRange? defined in org.jetbrains.kotlin.idea.conversion.copy in file RangeUtils.kt[PropertyDescriptorImpl]

'conversionResult' @ [124:13] ==> var conversionResult: Result? defined in org.jetbrains.kotlin.idea.conversion.copy.ConvertJavaCopyPasteProcessor.processTransferableData[LocalVariableDescriptor]

'doConversion' @ [124:32] ==> local final fun doConversion(): Result defined in org.jetbrains.kotlin.idea.conversion.copy.ConvertJavaCopyPasteProcessor.processTransferableData[SimpleFunctionDescriptorImpl]

'conversionResult' @ [126:17] ==> var conversionResult: Result? defined in org.jetbrains.kotlin.idea.conversion.copy.ConvertJavaCopyPasteProcessor.processTransferableData[LocalVariableDescriptor]

'text' @ [126:36] ==> public final val text: String? defined in org.jetbrains.kotlin.idea.conversion.copy.ConvertJavaCopyPasteProcessor.processTransferableData.Result[PropertyDescriptorImpl]

'insertImports' @ [128:13] ==> local final fun insertImports(bounds: TextRange, referenceData: Collection<KotlinReferenceData>, explicitImports: Collection<FqName>): TextRange? defined in org.jetbrains.kotlin.idea.conversion.copy.ConvertJavaCopyPasteProcessor.processTransferableData[SimpleFunctionDescriptorImpl]

'bounds' @ [128:27] ==> value-parameter bounds: RangeMarker defined in org.jetbrains.kotlin.idea.conversion.copy.ConvertJavaCopyPasteProcessor.processTransferableData[ValueParameterDescriptorImpl]

'range' @ [128:34] ==> public val RangeMarker.range: TextRange? defined in org.jetbrains.kotlin.idea.conversion.copy in file RangeUtils.kt[PropertyDescriptorImpl]

'conversionResult' @ [128:56] ==> var conversionResult: Result? defined in org.jetbrains.kotlin.idea.conversion.copy.ConvertJavaCopyPasteProcessor.processTransferableData[LocalVariableDescriptor]

'referenceData' @ [128:75] ==> public final val referenceData: Collection<KotlinReferenceData> defined in org.jetbrains.kotlin.idea.conversion.copy.ConvertJavaCopyPasteProcessor.processTransferableData.Result[PropertyDescriptorImpl]

'conversionResult' @ [128:90] ==> var conversionResult: Result? defined in org.jetbrains.kotlin.idea.conversion.copy.ConvertJavaCopyPasteProcessor.processTransferableData[LocalVariableDescriptor]

'explicitImports' @ [128:109] ==> public final val explicitImports: Set<FqName> defined in org.jetbrains.kotlin.idea.conversion.copy.ConvertJavaCopyPasteProcessor.processTransferableData.Result[PropertyDescriptorImpl]

'data' @ [132:26] ==> val data: CopiedJavaCode defined in org.jetbrains.kotlin.idea.conversion.copy.ConvertJavaCopyPasteProcessor.processTransferableData[LocalVariableDescriptor]

'startOffsets' @ [132:31] ==> public final val startOffsets: IntArray defined in org.jetbrains.kotlin.idea.conversion.copy.CopiedJavaCode[PropertyDescriptorImpl]

'indices' @ [132:44] ==> public val IntArray.indices: IntRange defined in kotlin.collections[DeserializedPropertyDescriptor]

'sumBy' @ [132:52] ==> public inline fun <T> Iterable<Int>.sumBy(selector: (Int) -> Int): Int defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'data' @ [132:60] ==> val data: CopiedJavaCode defined in org.jetbrains.kotlin.idea.conversion.copy.ConvertJavaCopyPasteProcessor.processTransferableData[LocalVariableDescriptor]

'endOffsets' @ [132:65] ==> public final val endOffsets: IntArray defined in org.jetbrains.kotlin.idea.conversion.copy.CopiedJavaCode[PropertyDescriptorImpl]

'it' @ [132:76] ==> value-parameter it: Int defined in org.jetbrains.kotlin.idea.conversion.copy.ConvertJavaCopyPasteProcessor.processTransferableData.<anonymous>[ValueParameterDescriptorImpl]

'data' @ [132:82] ==> val data: CopiedJavaCode defined in org.jetbrains.kotlin.idea.conversion.copy.ConvertJavaCopyPasteProcessor.processTransferableData[LocalVariableDescriptor]

'startOffsets' @ [132:87] ==> public final val startOffsets: IntArray defined in org.jetbrains.kotlin.idea.conversion.copy.CopiedJavaCode[PropertyDescriptorImpl]

'it' @ [132:100] ==> value-parameter it: Int defined in org.jetbrains.kotlin.idea.conversion.copy.ConvertJavaCopyPasteProcessor.processTransferableData.<anonymous>[ValueParameterDescriptorImpl]

'textLength' @ [133:13] ==> val textLength: Int defined in org.jetbrains.kotlin.idea.conversion.copy.ConvertJavaCopyPasteProcessor.processTransferableData[LocalVariableDescriptor]

'doConversionAndInsertImportsIfUnchanged' @ [134:17] ==> local final fun doConversionAndInsertImportsIfUnchanged(): Boolean defined in org.jetbrains.kotlin.idea.conversion.copy.ConvertJavaCopyPasteProcessor.processTransferableData[SimpleFunctionDescriptorImpl]

'confirmConvertJavaOnPaste' @ [137:13] ==> internal fun confirmConvertJavaOnPaste(project: Project, isPlainText: Boolean): Boolean defined in org.jetbrains.kotlin.idea.conversion.copy in file ConvertJavaCopyPasteProcessor.kt[SimpleFunctionDescriptorImpl]

'project' @ [137:39] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.conversion.copy.ConvertJavaCopyPasteProcessor.processTransferableData[ValueParameterDescriptorImpl]

'conversionResult' @ [138:17] ==> var conversionResult: Result? defined in org.jetbrains.kotlin.idea.conversion.copy.ConvertJavaCopyPasteProcessor.processTransferableData[LocalVariableDescriptor]

'doConversionAndInsertImportsIfUnchanged' @ [139:21] ==> local final fun doConversionAndInsertImportsIfUnchanged(): Boolean defined in org.jetbrains.kotlin.idea.conversion.copy.ConvertJavaCopyPasteProcessor.processTransferableData[SimpleFunctionDescriptorImpl]

'component1' @ [141:18] ==> public final operator fun component1(): String? defined in org.jetbrains.kotlin.idea.conversion.copy.ConvertJavaCopyPasteProcessor.processTransferableData.Result[SimpleFunctionDescriptorImpl]

'component2' @ [141:24] ==> public final operator fun component2(): Collection<KotlinReferenceData> defined in org.jetbrains.kotlin.idea.conversion.copy.ConvertJavaCopyPasteProcessor.processTransferableData.Result[SimpleFunctionDescriptorImpl]

'component3' @ [141:39] ==> public final operator fun component3(): Set<FqName> defined in org.jetbrains.kotlin.idea.conversion.copy.ConvertJavaCopyPasteProcessor.processTransferableData.Result[SimpleFunctionDescriptorImpl]

'conversionResult' @ [141:58] ==> var conversionResult: Result? defined in org.jetbrains.kotlin.idea.conversion.copy.ConvertJavaCopyPasteProcessor.processTransferableData[LocalVariableDescriptor]

'text' @ [142:13] ==> val text: String? defined in org.jetbrains.kotlin.idea.conversion.copy.ConvertJavaCopyPasteProcessor.processTransferableData[LocalVariableDescriptor]

'runWriteAction' @ [145:21] ==> public fun <T> runWriteAction(action: () -> TextRange): TextRange defined in org.jetbrains.kotlin.idea.util.application[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TextRange

'bounds' @ [146:43] ==> value-parameter bounds: RangeMarker defined in org.jetbrains.kotlin.idea.conversion.copy.ConvertJavaCopyPasteProcessor.processTransferableData[ValueParameterDescriptorImpl]

'startOffset' @ [146:50] ==> public final val RangeMarker.startOffset: Int[MyPropertyDescriptor]

'document' @ [147:25] ==> val document: Document defined in org.jetbrains.kotlin.idea.conversion.copy.ConvertJavaCopyPasteProcessor.processTransferableData[LocalVariableDescriptor]

'replaceString' @ [147:34] ==> public abstract fun replaceString(p0: Int, p1: Int, @NotNull p2: CharSequence): Unit defined in com.intellij.openapi.editor.Document[JavaMethodDescriptor]

'startOffset' @ [147:48] ==> val startOffset: Int defined in org.jetbrains.kotlin.idea.conversion.copy.ConvertJavaCopyPasteProcessor.processTransferableData.<anonymous>[LocalVariableDescriptor]

'bounds' @ [147:61] ==> value-parameter bounds: RangeMarker defined in org.jetbrains.kotlin.idea.conversion.copy.ConvertJavaCopyPasteProcessor.processTransferableData[ValueParameterDescriptorImpl]

'endOffset' @ [147:68] ==> public final val RangeMarker.endOffset: Int[MyPropertyDescriptor]

'text' @ [147:79] ==> val text: String? defined in org.jetbrains.kotlin.idea.conversion.copy.ConvertJavaCopyPasteProcessor.processTransferableData[LocalVariableDescriptor]

'startOffset' @ [149:50] ==> val startOffset: Int defined in org.jetbrains.kotlin.idea.conversion.copy.ConvertJavaCopyPasteProcessor.processTransferableData.<anonymous>[LocalVariableDescriptor]

'text' @ [149:64] ==> val text: String? defined in org.jetbrains.kotlin.idea.conversion.copy.ConvertJavaCopyPasteProcessor.processTransferableData[LocalVariableDescriptor]

'length' @ [149:69] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'editor' @ [150:25] ==> value-parameter editor: Editor defined in org.jetbrains.kotlin.idea.conversion.copy.ConvertJavaCopyPasteProcessor.processTransferableData[ValueParameterDescriptorImpl]

'caretModel' @ [150:32] ==> public final val Editor.caretModel: CaretModel[MyPropertyDescriptor]

'moveToOffset' @ [150:43] ==> public abstract fun moveToOffset(p0: Int): Unit defined in com.intellij.openapi.editor.CaretModel[JavaMethodDescriptor]

'endOffsetAfterCopy' @ [150:56] ==> val endOffsetAfterCopy: Int defined in org.jetbrains.kotlin.idea.conversion.copy.ConvertJavaCopyPasteProcessor.processTransferableData.<anonymous>[LocalVariableDescriptor]

'TextRange' @ [151:25] ==> public constructor TextRange(p0: Int, p1: Int) defined in com.intellij.openapi.util.TextRange[JavaClassConstructorDescriptor]

'startOffset' @ [151:35] ==> val startOffset: Int defined in org.jetbrains.kotlin.idea.conversion.copy.ConvertJavaCopyPasteProcessor.processTransferableData.<anonymous>[LocalVariableDescriptor]

'endOffsetAfterCopy' @ [151:48] ==> val endOffsetAfterCopy: Int defined in org.jetbrains.kotlin.idea.conversion.copy.ConvertJavaCopyPasteProcessor.processTransferableData.<anonymous>[LocalVariableDescriptor]

'insertImports' @ [154:29] ==> local final fun insertImports(bounds: TextRange, referenceData: Collection<KotlinReferenceData>, explicitImports: Collection<FqName>): TextRange? defined in org.jetbrains.kotlin.idea.conversion.copy.ConvertJavaCopyPasteProcessor.processTransferableData[SimpleFunctionDescriptorImpl]

'boundsAfterReplace' @ [154:43] ==> val boundsAfterReplace: TextRange defined in org.jetbrains.kotlin.idea.conversion.copy.ConvertJavaCopyPasteProcessor.processTransferableData[LocalVariableDescriptor]

'referenceData' @ [154:63] ==> val referenceData: Collection<KotlinReferenceData> defined in org.jetbrains.kotlin.idea.conversion.copy.ConvertJavaCopyPasteProcessor.processTransferableData[LocalVariableDescriptor]

'explicitImports' @ [154:78] ==> val explicitImports: Set<FqName> defined in org.jetbrains.kotlin.idea.conversion.copy.ConvertJavaCopyPasteProcessor.processTransferableData[LocalVariableDescriptor]

'getInstance' @ [156:32] ==> public open fun getInstance(@NotNull p0: Project): (PsiDocumentManager..PsiDocumentManager?) defined in com.intellij.psi.PsiDocumentManager[JavaMethodDescriptor]

'project' @ [156:44] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.conversion.copy.ConvertJavaCopyPasteProcessor.processTransferableData[ValueParameterDescriptorImpl]

'commitAllDocuments' @ [156:53] ==> public abstract fun commitAllDocuments(): Unit defined in com.intellij.psi.PsiDocumentManager[JavaMethodDescriptor]

'AfterConversionPass' @ [157:13] ==> public constructor AfterConversionPass(project: Project, postProcessor: PostProcessor) defined in org.jetbrains.kotlin.j2k.AfterConversionPass[DeserializedClassConstructorDescriptor]

'project' @ [157:33] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.conversion.copy.ConvertJavaCopyPasteProcessor.processTransferableData[ValueParameterDescriptorImpl]

'J2kPostProcessor' @ [157:42] ==> public constructor J2kPostProcessor(formatCode: Boolean) defined in org.jetbrains.kotlin.idea.j2k.J2kPostProcessor[ClassConstructorDescriptorImpl]

'run' @ [157:79] ==> public final fun run(kotlinFile: KtFile, range: TextRange?): Unit defined in org.jetbrains.kotlin.j2k.AfterConversionPass[DeserializedSimpleFunctionDescriptor]

'targetFile' @ [157:83] ==> val targetFile: KtFile defined in org.jetbrains.kotlin.idea.conversion.copy.ConvertJavaCopyPasteProcessor.processTransferableData[LocalVariableDescriptor]

'newBounds' @ [157:95] ==> val newBounds: TextRange? defined in org.jetbrains.kotlin.idea.conversion.copy.ConvertJavaCopyPasteProcessor.processTransferableData[LocalVariableDescriptor]

'conversionPerformed' @ [159:13] ==> @TestOnly public final var conversionPerformed: Boolean defined in org.jetbrains.kotlin.idea.conversion.copy.ConvertJavaCopyPasteProcessor.Companion[PropertyDescriptorImpl]

'buildString' @ [166:24] ==> @InlineOnly public inline fun buildString(builderAction: StringBuilder /* = StringBuilder */.() -> Unit): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'append' @ [167:13] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'importsAndPackage' @ [167:20] ==> value-parameter importsAndPackage: String defined in org.jetbrains.kotlin.idea.conversion.copy.ConvertJavaCopyPasteProcessor.buildReferenceData[ValueParameterDescriptorImpl]

'component1' @ [169:18] ==> public final operator fun component1(): String defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [169:33] ==> public final operator fun component2(): String defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'when (parseContext) {
                ParseContext.CODE_BLOCK -> "fun ${generateDummyFunctionName(text)}() {\n" to "\n}"
                ParseContext.TOP_LEVEL -> "" to ""
            }' @ [169:50] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Pair<String, String>, entry1: Pair<String, String>): Pair<String, String>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Pair<String, String>

'parseContext' @ [169:56] ==> value-parameter parseContext: ParseContext defined in org.jetbrains.kotlin.idea.conversion.copy.ConvertJavaCopyPasteProcessor.buildReferenceData[ValueParameterDescriptorImpl]

'CODE_BLOCK' @ [170:30] ==> enum entry CODE_BLOCK defined in org.jetbrains.kotlin.j2k.ParseContext[FakeCallableDescriptorForObject]

'to' @ [170:44] ==> public infix fun <A, B> String.to(that: String): Pair<String, String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> String

'generateDummyFunctionName' @ [170:51] ==> private final fun generateDummyFunctionName(convertedCode: String): String defined in org.jetbrains.kotlin.idea.conversion.copy.ConvertJavaCopyPasteProcessor[SimpleFunctionDescriptorImpl]

'text' @ [170:77] ==> value-parameter text: String defined in org.jetbrains.kotlin.idea.conversion.copy.ConvertJavaCopyPasteProcessor.buildReferenceData[ValueParameterDescriptorImpl]

'TOP_LEVEL' @ [171:30] ==> enum entry TOP_LEVEL defined in org.jetbrains.kotlin.j2k.ParseContext[FakeCallableDescriptorForObject]

'to' @ [171:43] ==> public infix fun <A, B> String.to(that: String): Pair<String, String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> String

'append' @ [174:13] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'contextPrefix' @ [174:20] ==> val contextPrefix: String defined in org.jetbrains.kotlin.idea.conversion.copy.ConvertJavaCopyPasteProcessor.buildReferenceData.<anonymous>[LocalVariableDescriptor]

'blockStart' @ [176:13] ==> var blockStart: Int? defined in org.jetbrains.kotlin.idea.conversion.copy.ConvertJavaCopyPasteProcessor.buildReferenceData[LocalVariableDescriptor]

'length' @ [176:26] ==> public open val length: Int defined in java.lang.StringBuilder[JavaPropertyDescriptor]

'append' @ [177:13] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'text' @ [177:20] ==> value-parameter text: String defined in org.jetbrains.kotlin.idea.conversion.copy.ConvertJavaCopyPasteProcessor.buildReferenceData[ValueParameterDescriptorImpl]

'blockEnd' @ [178:13] ==> var blockEnd: Int? defined in org.jetbrains.kotlin.idea.conversion.copy.ConvertJavaCopyPasteProcessor.buildReferenceData[LocalVariableDescriptor]

'length' @ [178:24] ==> public open val length: Int defined in java.lang.StringBuilder[JavaPropertyDescriptor]

'append' @ [180:13] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'contextSuffix' @ [180:20] ==> val contextSuffix: String defined in org.jetbrains.kotlin.idea.conversion.copy.ConvertJavaCopyPasteProcessor.buildReferenceData.<anonymous>[LocalVariableDescriptor]

'KtPsiFactory' @ [183:25] ==> @JvmOverloads public constructor KtPsiFactory(project: Project, markGenerated: Boolean = ...) defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedClassConstructorDescriptor]

'targetFile' @ [183:38] ==> value-parameter targetFile: KtFile defined in org.jetbrains.kotlin.idea.conversion.copy.ConvertJavaCopyPasteProcessor.buildReferenceData[ValueParameterDescriptorImpl]

'project' @ [183:49] ==> public final val KtFile.project: Project[MyPropertyDescriptor]

'createAnalyzableFile' @ [183:58] ==> public final fun createAnalyzableFile(fileName: String, text: String, contextToAnalyzeIn: PsiElement): KtFile defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'fileText' @ [183:91] ==> val fileText: String defined in org.jetbrains.kotlin.idea.conversion.copy.ConvertJavaCopyPasteProcessor.buildReferenceData[LocalVariableDescriptor]

'targetFile' @ [183:101] ==> value-parameter targetFile: KtFile defined in org.jetbrains.kotlin.idea.conversion.copy.ConvertJavaCopyPasteProcessor.buildReferenceData[ValueParameterDescriptorImpl]

'KotlinCopyPasteReferenceProcessor' @ [185:16] ==> public constructor KotlinCopyPasteReferenceProcessor() defined in org.jetbrains.kotlin.idea.codeInsight.KotlinCopyPasteReferenceProcessor[ClassConstructorDescriptorImpl]

'collectReferenceData' @ [185:52] ==> public final fun collectReferenceData(file: KtFile, startOffsets: IntArray, endOffsets: IntArray): List<KotlinReferenceData> defined in org.jetbrains.kotlin.idea.codeInsight.KotlinCopyPasteReferenceProcessor[SimpleFunctionDescriptorImpl]

'dummyFile' @ [185:73] ==> val dummyFile: KtFile defined in org.jetbrains.kotlin.idea.conversion.copy.ConvertJavaCopyPasteProcessor.buildReferenceData[LocalVariableDescriptor]

'intArrayOf' @ [185:84] ==> public fun intArrayOf(vararg elements: Int): IntArray defined in kotlin[DeserializedSimpleFunctionDescriptor]

'blockStart' @ [185:95] ==> var blockStart: Int? defined in org.jetbrains.kotlin.idea.conversion.copy.ConvertJavaCopyPasteProcessor.buildReferenceData[LocalVariableDescriptor]

'intArrayOf' @ [185:110] ==> public fun intArrayOf(vararg elements: Int): IntArray defined in kotlin[DeserializedSimpleFunctionDescriptor]

'blockEnd' @ [185:121] ==> var blockEnd: Int? defined in org.jetbrains.kotlin.idea.conversion.copy.ConvertJavaCopyPasteProcessor.buildReferenceData[LocalVariableDescriptor]

'i' @ [191:31] ==> var i: Int defined in org.jetbrains.kotlin.idea.conversion.copy.ConvertJavaCopyPasteProcessor.generateDummyFunctionName[LocalVariableDescriptor]

'convertedCode' @ [192:17] ==> value-parameter convertedCode: String defined in org.jetbrains.kotlin.idea.conversion.copy.ConvertJavaCopyPasteProcessor.generateDummyFunctionName[ValueParameterDescriptorImpl]

'indexOf' @ [192:31] ==> public fun CharSequence.indexOf(string: String, startIndex: Int = ..., ignoreCase: Boolean = ...): Int defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'name' @ [192:39] ==> val name: String defined in org.jetbrains.kotlin.idea.conversion.copy.ConvertJavaCopyPasteProcessor.generateDummyFunctionName[LocalVariableDescriptor]

'name' @ [192:57] ==> val name: String defined in org.jetbrains.kotlin.idea.conversion.copy.ConvertJavaCopyPasteProcessor.generateDummyFunctionName[LocalVariableDescriptor]

'i' @ [193:13] ==> var i: Int defined in org.jetbrains.kotlin.idea.conversion.copy.ConvertJavaCopyPasteProcessor.generateDummyFunctionName[LocalVariableDescriptor]

'TestOnly' @ [198:9] ==> public constructor TestOnly() defined in org.jetbrains.annotations.TestOnly[JavaClassConstructorDescriptor]

'JavaToKotlinConverter' @ [210:21] ==> public constructor JavaToKotlinConverter(project: Project, settings: ConverterSettings, services: JavaToKotlinConverterServices) defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter[DeserializedClassConstructorDescriptor]

'project' @ [211:13] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.conversion.copy.convertCodeToKotlin[ValueParameterDescriptorImpl]

'defaultSettings' @ [212:31] ==> public final val defaultSettings: ConverterSettings defined in org.jetbrains.kotlin.j2k.ConverterSettings.Companion[DeserializedPropertyDescriptor]

'IdeaJavaToKotlinServices' @ [213:13] ==> public object IdeaJavaToKotlinServices : JavaToKotlinConverterServices defined in org.jetbrains.kotlin.idea.j2k in file IdeaJavaToKotlinServices.kt[FakeCallableDescriptorForObject]

'this' @ [216:25] ==> <this> defined in org.jetbrains.kotlin.idea.conversion.copy.convertCodeToKotlin[ReceiverParameterDescriptorImpl]

'toList' @ [216:30] ==> public final fun toList(): List<Any> defined in org.jetbrains.kotlin.idea.conversion.copy.ElementAndTextList[SimpleFunctionDescriptorImpl]

'filterIsInstance' @ [216:39] ==> public inline fun <reified R> Iterable<*>.filterIsInstance(): List<PsiElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> PsiElement

'getInstance' @ [218:29] ==> @NotNull public open fun getInstance(): ProgressManager defined in com.intellij.openapi.progress.ProgressManager[JavaMethodDescriptor]

'runProcessWithProgressSynchronously' @ [218:43] ==> public abstract fun <T : (Any..Any?), E : (Exception..Exception?)> runProcessWithProgressSynchronously(@NotNull p0: ThrowableComputable<(JavaToKotlinConverter.Result..JavaToKotlinConverter.Result?), (Exception /* = Exception */..Exception? /* = Exception? */)>, @NotNull @Nls p1: String, p2: Boolean, @Nullable p3: Project?): (JavaToKotlinConverter.Result..JavaToKotlinConverter.Result?) defined in com.intellij.openapi.progress.ProgressManager[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (org.jetbrains.kotlin.j2k.JavaToKotlinConverter.Result..org.jetbrains.kotlin.j2k.JavaToKotlinConverter.Result?)
    <E : (Exception..Exception?)> -> (kotlin.Exception /* = java.lang.Exception */..kotlin.Exception? /* = java.lang.Exception? */)

'ThrowableComputable' @ [219:21] ==> public fun <T : (Any..Any?), E : (Throwable..Throwable?)> ThrowableComputable(function: () -> (JavaToKotlinConverter.Result..JavaToKotlinConverter.Result?)): ThrowableComputable<JavaToKotlinConverter.Result, Exception /* = Exception */> defined in com.intellij.openapi.util[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : (Any..Any?)> -> Result
    <E : (Throwable..Throwable?)> -> Exception

'runReadAction' @ [220:25] ==> public fun <T> runReadAction(action: () -> JavaToKotlinConverter.Result): JavaToKotlinConverter.Result defined in org.jetbrains.kotlin.idea.util.application[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Result

'converter' @ [220:41] ==> val converter: JavaToKotlinConverter defined in org.jetbrains.kotlin.idea.conversion.copy.convertCodeToKotlin[LocalVariableDescriptor]

'elementsToKotlin' @ [220:51] ==> public final fun elementsToKotlin(inputElements: List<PsiElement>): JavaToKotlinConverter.Result defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter[DeserializedSimpleFunctionDescriptor]

'inputElements' @ [220:68] ==> val inputElements: List<PsiElement> defined in org.jetbrains.kotlin.idea.conversion.copy.convertCodeToKotlin[LocalVariableDescriptor]

'title' @ [222:40] ==> public final val title: String defined in org.jetbrains.kotlin.idea.actions.JavaToKotlinAction.Companion[PropertyDescriptorImpl]

'project' @ [224:21] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.conversion.copy.convertCodeToKotlin[ValueParameterDescriptorImpl]

'results' @ [225:15] ==> public final val results: List<JavaToKotlinConverter.ElementResult?> defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.Result[DeserializedPropertyDescriptor]

'LinkedHashSet' @ [228:24] ==> public constructor LinkedHashSet<E : (Any..Any?)>() defined in java.util.LinkedHashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> FqName

'StringBuilder' @ [231:32] ==> public final fun <init>(): StringBuilder /* = StringBuilder */ defined in kotlin.text.StringBuilder[TypeAliasConstructorDescriptorImpl]

'StringBuilder' @ [232:31] ==> public final fun <init>(): StringBuilder /* = StringBuilder */ defined in kotlin.text.StringBuilder[TypeAliasConstructorDescriptorImpl]

'this' @ [234:5] ==> <this> defined in org.jetbrains.kotlin.idea.conversion.copy.convertCodeToKotlin[ReceiverParameterDescriptorImpl]

'process' @ [234:10] ==> public final fun process(processor: ElementsAndTextsProcessor): Unit defined in org.jetbrains.kotlin.idea.conversion.copy.ElementAndTextList[SimpleFunctionDescriptorImpl]

'element' @ [236:32] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.conversion.copy.convertCodeToKotlin.<no name provided>.processElement[ValueParameterDescriptorImpl]

'text' @ [236:40] ==> public final val PsiElement.text: (String..String?)[MyPropertyDescriptor]

'originalCodeBuilder' @ [237:13] ==> val originalCodeBuilder: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.idea.conversion.copy.convertCodeToKotlin[LocalVariableDescriptor]

'append' @ [237:33] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'originalText' @ [237:40] ==> val originalText: (String..String?) defined in org.jetbrains.kotlin.idea.conversion.copy.convertCodeToKotlin.<no name provided>.processElement[LocalVariableDescriptor]

'results' @ [239:26] ==> val results: List<JavaToKotlinConverter.ElementResult?> defined in org.jetbrains.kotlin.idea.conversion.copy.convertCodeToKotlin[LocalVariableDescriptor]

'resultIndex' @ [239:34] ==> var resultIndex: Int defined in org.jetbrains.kotlin.idea.conversion.copy.convertCodeToKotlin[LocalVariableDescriptor]

'if (result != null) {
                convertedCodeBuilder.append(result.text)
                if (parseContext == null) { // use parse context of the first converted element as parse context for the whole text
                    parseContext = result.parseContext
                }
                importsToAdd.addAll(result.importsToAdd)
            }
            else { // failed to convert element to Kotlin, insert "as is"
                convertedCodeBuilder.append(originalText)
            }' @ [240:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (Serializable..Serializable?), elseBranch: (Serializable..Serializable?)): (Serializable..Serializable?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (java.io.Serializable..java.io.Serializable?)

'result' @ [240:17] ==> val result: JavaToKotlinConverter.ElementResult? defined in org.jetbrains.kotlin.idea.conversion.copy.convertCodeToKotlin.<no name provided>.processElement[LocalVariableDescriptor]

'convertedCodeBuilder' @ [241:17] ==> val convertedCodeBuilder: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.idea.conversion.copy.convertCodeToKotlin[LocalVariableDescriptor]

'append' @ [241:38] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'result' @ [241:45] ==> val result: JavaToKotlinConverter.ElementResult? defined in org.jetbrains.kotlin.idea.conversion.copy.convertCodeToKotlin.<no name provided>.processElement[LocalVariableDescriptor]

'text' @ [241:52] ==> public final val text: String defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.ElementResult[DeserializedPropertyDescriptor]

'parseContext' @ [242:21] ==> var parseContext: ParseContext? defined in org.jetbrains.kotlin.idea.conversion.copy.convertCodeToKotlin[LocalVariableDescriptor]

'parseContext' @ [243:21] ==> var parseContext: ParseContext? defined in org.jetbrains.kotlin.idea.conversion.copy.convertCodeToKotlin[LocalVariableDescriptor]

'result' @ [243:36] ==> val result: JavaToKotlinConverter.ElementResult? defined in org.jetbrains.kotlin.idea.conversion.copy.convertCodeToKotlin.<no name provided>.processElement[LocalVariableDescriptor]

'parseContext' @ [243:43] ==> public final val parseContext: ParseContext defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.ElementResult[DeserializedPropertyDescriptor]

'importsToAdd' @ [245:17] ==> val importsToAdd: LinkedHashSet<FqName> defined in org.jetbrains.kotlin.idea.conversion.copy.convertCodeToKotlin[LocalVariableDescriptor]

'addAll' @ [245:30] ==> public open fun addAll(elements: Collection<FqName>): Boolean defined in java.util.LinkedHashSet[JavaMethodDescriptor]

'result' @ [245:37] ==> val result: JavaToKotlinConverter.ElementResult? defined in org.jetbrains.kotlin.idea.conversion.copy.convertCodeToKotlin.<no name provided>.processElement[LocalVariableDescriptor]

'importsToAdd' @ [245:44] ==> public final val importsToAdd: Set<FqName> defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.ElementResult[DeserializedPropertyDescriptor]

'convertedCodeBuilder' @ [248:17] ==> val convertedCodeBuilder: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.idea.conversion.copy.convertCodeToKotlin[LocalVariableDescriptor]

'append' @ [248:38] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'originalText' @ [248:45] ==> val originalText: (String..String?) defined in org.jetbrains.kotlin.idea.conversion.copy.convertCodeToKotlin.<no name provided>.processElement[LocalVariableDescriptor]

'originalCodeBuilder' @ [253:13] ==> val originalCodeBuilder: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.idea.conversion.copy.convertCodeToKotlin[LocalVariableDescriptor]

'append' @ [253:33] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'string' @ [253:40] ==> value-parameter string: String defined in org.jetbrains.kotlin.idea.conversion.copy.convertCodeToKotlin.<no name provided>.processText[ValueParameterDescriptorImpl]

'convertedCodeBuilder' @ [254:13] ==> val convertedCodeBuilder: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.idea.conversion.copy.convertCodeToKotlin[LocalVariableDescriptor]

'append' @ [254:34] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'string' @ [254:41] ==> value-parameter string: String defined in org.jetbrains.kotlin.idea.conversion.copy.convertCodeToKotlin.<no name provided>.processText[ValueParameterDescriptorImpl]

'convertedCodeBuilder' @ [258:25] ==> val convertedCodeBuilder: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.idea.conversion.copy.convertCodeToKotlin[LocalVariableDescriptor]

'toString' @ [258:46] ==> public open fun toString(): String defined in java.lang.StringBuilder[JavaMethodDescriptor]

'originalCodeBuilder' @ [259:24] ==> val originalCodeBuilder: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.idea.conversion.copy.convertCodeToKotlin[LocalVariableDescriptor]

'toString' @ [259:44] ==> public open fun toString(): String defined in java.lang.StringBuilder[JavaMethodDescriptor]

'ConversionResult' @ [260:12] ==> public constructor ConversionResult(text: String, parseContext: ParseContext, importsToAdd: Set<FqName>, textChanged: Boolean) defined in org.jetbrains.kotlin.idea.conversion.copy.ConversionResult[ClassConstructorDescriptorImpl]

'convertedCode' @ [260:29] ==> val convertedCode: String defined in org.jetbrains.kotlin.idea.conversion.copy.convertCodeToKotlin[LocalVariableDescriptor]

'parseContext' @ [260:44] ==> var parseContext: ParseContext? defined in org.jetbrains.kotlin.idea.conversion.copy.convertCodeToKotlin[LocalVariableDescriptor]

'CODE_BLOCK' @ [260:73] ==> enum entry CODE_BLOCK defined in org.jetbrains.kotlin.j2k.ParseContext[FakeCallableDescriptorForObject]

'importsToAdd' @ [260:85] ==> val importsToAdd: LinkedHashSet<FqName> defined in org.jetbrains.kotlin.idea.conversion.copy.convertCodeToKotlin[LocalVariableDescriptor]

'convertedCode' @ [260:99] ==> val convertedCode: String defined in org.jetbrains.kotlin.idea.conversion.copy.convertCodeToKotlin[LocalVariableDescriptor]

'originalCode' @ [260:116] ==> val originalCode: String defined in org.jetbrains.kotlin.idea.conversion.copy.convertCodeToKotlin[LocalVariableDescriptor]

'offset' @ [264:9] ==> value-parameter offset: Int defined in org.jetbrains.kotlin.idea.conversion.copy.isNoConversionPosition[ValueParameterDescriptorImpl]

'file' @ [265:17] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.conversion.copy.isNoConversionPosition[ValueParameterDescriptorImpl]

'findElementAt' @ [265:22] ==> public open fun findElementAt(p0: Int): PsiElement? defined in org.jetbrains.kotlin.psi.KtFile[JavaMethodDescriptor]

'offset' @ [265:36] ==> value-parameter offset: Int defined in org.jetbrains.kotlin.idea.conversion.copy.isNoConversionPosition[ValueParameterDescriptorImpl]

'token' @ [267:9] ==> val token: PsiElement defined in org.jetbrains.kotlin.idea.conversion.copy.isNoConversionPosition[LocalVariableDescriptor]

'token' @ [267:36] ==> val token: PsiElement defined in org.jetbrains.kotlin.idea.conversion.copy.isNoConversionPosition[LocalVariableDescriptor]

'endOffset' @ [267:42] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'offset' @ [267:55] ==> value-parameter offset: Int defined in org.jetbrains.kotlin.idea.conversion.copy.isNoConversionPosition[ValueParameterDescriptorImpl]

'token' @ [269:21] ==> val token: PsiElement defined in org.jetbrains.kotlin.idea.conversion.copy.isNoConversionPosition[LocalVariableDescriptor]

'parentsWithSelf' @ [269:27] ==> public val PsiElement.parentsWithSelf: Sequence<PsiElement> defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'element' @ [270:13] ==> val element: PsiElement defined in org.jetbrains.kotlin.idea.conversion.copy.isNoConversionPosition[LocalVariableDescriptor]

'element' @ [271:20] ==> val element: PsiElement defined in org.jetbrains.kotlin.idea.conversion.copy.isNoConversionPosition[LocalVariableDescriptor]

'node' @ [271:28] ==> public final val PsiComment.node: (ASTNode..ASTNode?)[MyPropertyDescriptor]

'elementType' @ [271:33] ==> public final val ASTNode.elementType: IElementType[MyPropertyDescriptor]

'EOL_COMMENT' @ [271:57] ==> public final val EOL_COMMENT: (KtToken..KtToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'offset' @ [271:72] ==> value-parameter offset: Int defined in org.jetbrains.kotlin.idea.conversion.copy.isNoConversionPosition[ValueParameterDescriptorImpl]

'element' @ [271:82] ==> val element: PsiElement defined in org.jetbrains.kotlin.idea.conversion.copy.isNoConversionPosition[LocalVariableDescriptor]

'endOffset' @ [271:90] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'element' @ [273:13] ==> val element: PsiElement defined in org.jetbrains.kotlin.idea.conversion.copy.isNoConversionPosition[LocalVariableDescriptor]

'element' @ [274:13] ==> val element: PsiElement defined in org.jetbrains.kotlin.idea.conversion.copy.isNoConversionPosition[LocalVariableDescriptor]

'getInstance' @ [280:29] ==> public open fun getInstance(): (KotlinEditorOptions..KotlinEditorOptions?) defined in org.jetbrains.kotlin.idea.editor.KotlinEditorOptions[JavaMethodDescriptor]

'isDonTShowConversionDialog' @ [280:43] ==> public final var KotlinEditorOptions.isDonTShowConversionDialog: Boolean[MyPropertyDescriptor]

'KotlinPasteFromJavaDialog' @ [282:18] ==> public constructor KotlinPasteFromJavaDialog(@NotNull project: Project, isPlainText: Boolean) defined in org.jetbrains.kotlin.idea.conversion.copy.KotlinPasteFromJavaDialog[JavaClassConstructorDescriptor]

'project' @ [282:44] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.conversion.copy.confirmConvertJavaOnPaste[ValueParameterDescriptorImpl]

'isPlainText' @ [282:53] ==> value-parameter isPlainText: Boolean defined in org.jetbrains.kotlin.idea.conversion.copy.confirmConvertJavaOnPaste[ValueParameterDescriptorImpl]

'dialog' @ [283:5] ==> val dialog: KotlinPasteFromJavaDialog defined in org.jetbrains.kotlin.idea.conversion.copy.confirmConvertJavaOnPaste[LocalVariableDescriptor]

'show' @ [283:12] ==> public open fun show(): Unit defined in org.jetbrains.kotlin.idea.conversion.copy.KotlinPasteFromJavaDialog[JavaMethodDescriptor]

'dialog' @ [284:12] ==> val dialog: KotlinPasteFromJavaDialog defined in org.jetbrains.kotlin.idea.conversion.copy.confirmConvertJavaOnPaste[LocalVariableDescriptor]

'isOK' @ [284:19] ==> public final val KotlinPasteFromJavaDialog.isOK: Boolean[MyPropertyDescriptor]

