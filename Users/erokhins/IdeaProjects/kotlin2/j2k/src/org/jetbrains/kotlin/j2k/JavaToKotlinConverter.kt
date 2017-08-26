'getInstance' @ [55:30] ==> @NotNull public open fun getInstance(@NotNull @NonNls p0: String): Logger defined in com.intellij.openapi.diagnostic.Logger[JavaMethodDescriptor]

'EmptyProgressIndicator' @ [67:109] ==> public constructor EmptyProgressIndicator() defined in com.intellij.openapi.progress.EmptyProgressIndicator[JavaClassConstructorDescriptor]

'WithProgressProcessor' @ [68:37] ==> public constructor WithProgressProcessor(progress: ProgressIndicator?, files: List<PsiJavaFile>?) defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.WithProgressProcessor[ClassConstructorDescriptorImpl]

'progress' @ [68:59] ==> value-parameter progress: ProgressIndicator = ... defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.filesToKotlin[ValueParameterDescriptorImpl]

'files' @ [68:69] ==> value-parameter files: List<PsiJavaFile> defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.filesToKotlin[ValueParameterDescriptorImpl]

'component1' @ [69:14] ==> public final operator fun component1(): List<JavaToKotlinConverter.ElementResult?> defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.Result[SimpleFunctionDescriptorImpl]

'component2' @ [69:23] ==> public final operator fun component2(): JavaToKotlinConverter.ExternalCodeProcessing? defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.Result[SimpleFunctionDescriptorImpl]

'getApplication' @ [69:68] ==> public open fun getApplication(): (Application..Application?) defined in com.intellij.openapi.application.ApplicationManager[JavaMethodDescriptor]

'runReadAction' @ [69:85] ==> public abstract fun <T : (Any..Any?)> runReadAction(@NotNull p0: Computable<(JavaToKotlinConverter.Result..JavaToKotlinConverter.Result?)>): (JavaToKotlinConverter.Result..JavaToKotlinConverter.Result?) defined in com.intellij.openapi.application.Application[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (org.jetbrains.kotlin.j2k.JavaToKotlinConverter.Result..org.jetbrains.kotlin.j2k.JavaToKotlinConverter.Result?)

'Computable' @ [69:99] ==> public fun <T : (Any..Any?)> Computable(function: () -> (JavaToKotlinConverter.Result..JavaToKotlinConverter.Result?)): Computable<(JavaToKotlinConverter.Result..JavaToKotlinConverter.Result?)> defined in com.intellij.openapi.util[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : (Any..Any?)> -> (org.jetbrains.kotlin.j2k.JavaToKotlinConverter.Result..org.jetbrains.kotlin.j2k.JavaToKotlinConverter.Result?)

'elementsToKotlin' @ [70:13] ==> private final fun elementsToKotlin(inputElements: List<PsiElement>, processor: JavaToKotlinConverter.WithProgressProcessor): JavaToKotlinConverter.Result defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter[SimpleFunctionDescriptorImpl]

'files' @ [70:30] ==> value-parameter files: List<PsiJavaFile> defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.filesToKotlin[ValueParameterDescriptorImpl]

'withProgressProcessor' @ [70:37] ==> val withProgressProcessor: JavaToKotlinConverter.WithProgressProcessor defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.filesToKotlin[LocalVariableDescriptor]

'withProgressProcessor' @ [74:21] ==> val withProgressProcessor: JavaToKotlinConverter.WithProgressProcessor defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.filesToKotlin[LocalVariableDescriptor]

'processItems' @ [74:43] ==> public final fun <TInputItem, TOutputItem> processItems(fractionPortion: Double, inputItems: Iterable<IndexedValue<JavaToKotlinConverter.ElementResult?>>, processItem: (IndexedValue<JavaToKotlinConverter.ElementResult?>) -> (String..String?)): List<(String..String?)> defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.WithProgressProcessor[SimpleFunctionDescriptorImpl]
Inferred types:
    <TInputItem> -> IndexedValue<ElementResult?>
    <TOutputItem> -> (kotlin.String..kotlin.String?)

'results' @ [74:61] ==> val results: List<JavaToKotlinConverter.ElementResult?> defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.filesToKotlin[LocalVariableDescriptor]

'withIndex' @ [74:69] ==> public fun <T> Iterable<JavaToKotlinConverter.ElementResult?>.withIndex(): Iterable<IndexedValue<JavaToKotlinConverter.ElementResult?>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ElementResult?

'component1' @ [75:18] ==> public final operator fun component1(): Int defined in kotlin.collections.IndexedValue[DeserializedSimpleFunctionDescriptor]

'component2' @ [75:21] ==> public final operator fun component2(): JavaToKotlinConverter.ElementResult? defined in kotlin.collections.IndexedValue[DeserializedSimpleFunctionDescriptor]

'pair' @ [75:31] ==> value-parameter pair: IndexedValue<JavaToKotlinConverter.ElementResult?> defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.filesToKotlin.<anonymous>[ValueParameterDescriptorImpl]

'getApplication' @ [77:53] ==> public open fun getApplication(): (Application..Application?) defined in com.intellij.openapi.application.ApplicationManager[JavaMethodDescriptor]

'runReadAction' @ [77:70] ==> public abstract fun <T : (Any..Any?)> runReadAction(@NotNull p0: Computable<(KtFile..KtFile?)>): (KtFile..KtFile?) defined in com.intellij.openapi.application.Application[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (org.jetbrains.kotlin.psi.KtFile..org.jetbrains.kotlin.psi.KtFile?)

'Computable' @ [77:84] ==> public fun <T : (Any..Any?)> Computable(function: () -> (KtFile..KtFile?)): Computable<(KtFile..KtFile?)> defined in com.intellij.openapi.util[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : (Any..Any?)> -> (org.jetbrains.kotlin.psi.KtFile..org.jetbrains.kotlin.psi.KtFile?)

'KtPsiFactory' @ [78:21] ==> @JvmOverloads public constructor KtPsiFactory(project: Project, markGenerated: Boolean = ...) defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedClassConstructorDescriptor]

'project' @ [78:34] ==> private final val project: Project defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter[PropertyDescriptorImpl]

'createAnalyzableFile' @ [78:43] ==> public final fun createAnalyzableFile(fileName: String, text: String, contextToAnalyzeIn: PsiElement): KtFile defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'result' @ [78:76] ==> val result: JavaToKotlinConverter.ElementResult? defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.filesToKotlin.<anonymous>[LocalVariableDescriptor]

'text' @ [78:85] ==> public final val text: String defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.ElementResult[PropertyDescriptorImpl]

'files' @ [78:91] ==> value-parameter files: List<PsiJavaFile> defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.filesToKotlin[ValueParameterDescriptorImpl]

'i' @ [78:97] ==> val i: Int defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.filesToKotlin.<anonymous>[LocalVariableDescriptor]

'result' @ [81:17] ==> val result: JavaToKotlinConverter.ElementResult? defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.filesToKotlin.<anonymous>[LocalVariableDescriptor]

'importsToAdd' @ [81:26] ==> public final val importsToAdd: Set<FqName> defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.ElementResult[PropertyDescriptorImpl]

'forEach' @ [81:39] ==> @HidesMembers public inline fun <T> Iterable<FqName>.forEach(action: (FqName) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FqName

'postProcessor' @ [81:49] ==> value-parameter postProcessor: PostProcessor defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.filesToKotlin[ValueParameterDescriptorImpl]

'insertImport' @ [81:63] ==> public abstract fun insertImport(file: KtFile, fqName: FqName): Unit defined in org.jetbrains.kotlin.j2k.PostProcessor[SimpleFunctionDescriptorImpl]

'kotlinFile' @ [81:76] ==> val kotlinFile: (KtFile..KtFile?) defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.filesToKotlin.<anonymous>[LocalVariableDescriptor]

'it' @ [81:88] ==> value-parameter it: FqName defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.filesToKotlin.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'AfterConversionPass' @ [83:17] ==> public constructor AfterConversionPass(project: Project, postProcessor: PostProcessor) defined in org.jetbrains.kotlin.j2k.AfterConversionPass[ClassConstructorDescriptorImpl]

'project' @ [83:37] ==> private final val project: Project defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter[PropertyDescriptorImpl]

'postProcessor' @ [83:46] ==> value-parameter postProcessor: PostProcessor defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.filesToKotlin[ValueParameterDescriptorImpl]

'run' @ [83:61] ==> public final fun run(kotlinFile: KtFile, range: TextRange?): Unit defined in org.jetbrains.kotlin.j2k.AfterConversionPass[SimpleFunctionDescriptorImpl]

'kotlinFile' @ [83:65] ==> val kotlinFile: (KtFile..KtFile?) defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.filesToKotlin.<anonymous>[LocalVariableDescriptor]

'kotlinFile' @ [85:17] ==> val kotlinFile: (KtFile..KtFile?) defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.filesToKotlin.<anonymous>[LocalVariableDescriptor]

'text' @ [85:28] ==> public final val KtFile.text: (String..String?)[MyPropertyDescriptor]

'e' @ [88:23] ==> val e: ProcessCanceledException defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.filesToKotlin.<anonymous>[LocalVariableDescriptor]

'LOG' @ [91:17] ==> private final val LOG: Logger defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter[PropertyDescriptorImpl]

'error' @ [91:21] ==> public open fun error(@NotNull p0: Throwable): Unit defined in com.intellij.openapi.diagnostic.Logger[JavaMethodDescriptor]

't' @ [91:27] ==> val t: Throwable defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.filesToKotlin.<anonymous>[LocalVariableDescriptor]

'result' @ [92:17] ==> val result: JavaToKotlinConverter.ElementResult? defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.filesToKotlin.<anonymous>[LocalVariableDescriptor]

'text' @ [92:26] ==> public final val text: String defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.ElementResult[PropertyDescriptorImpl]

'FilesResult' @ [96:16] ==> public constructor FilesResult(results: List<String>, externalCodeProcessing: JavaToKotlinConverter.ExternalCodeProcessing?) defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.FilesResult[ClassConstructorDescriptorImpl]

'texts' @ [96:28] ==> val texts: List<(String..String?)> defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.filesToKotlin[LocalVariableDescriptor]

'externalCodeProcessing' @ [96:35] ==> val externalCodeProcessing: JavaToKotlinConverter.ExternalCodeProcessing? defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.filesToKotlin[LocalVariableDescriptor]

'elementsToKotlin' @ [100:16] ==> private final fun elementsToKotlin(inputElements: List<PsiElement>, processor: JavaToKotlinConverter.WithProgressProcessor): JavaToKotlinConverter.Result defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter[SimpleFunctionDescriptorImpl]

'inputElements' @ [100:33] ==> value-parameter inputElements: List<PsiElement> defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.elementsToKotlin[ValueParameterDescriptorImpl]

'DEFAULT' @ [100:70] ==> public final val DEFAULT: JavaToKotlinConverter.WithProgressProcessor defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.WithProgressProcessor.Companion[PropertyDescriptorImpl]

'LinkedHashMap' @ [105:36] ==> public constructor LinkedHashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.LinkedHashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> PsiElement
    <V : (Any..Any?)> -> MutableCollection<UsageProcessing>

'usageProcessings' @ [107:17] ==> val usageProcessings: LinkedHashMap<PsiElement, MutableCollection<UsageProcessing>> defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.elementsToKotlin[LocalVariableDescriptor]

'getOrPut' @ [107:34] ==> public inline fun <K, V> MutableMap<PsiElement, MutableCollection<UsageProcessing>>.getOrPut(key: PsiElement, defaultValue: () -> MutableCollection<UsageProcessing>): MutableCollection<UsageProcessing> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> PsiElement
    <V> -> MutableCollection<UsageProcessing>

'it' @ [107:43] ==> value-parameter it: UsageProcessing defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.elementsToKotlin.<anonymous>[ValueParameterDescriptorImpl]

'targetElement' @ [107:46] ==> public abstract val targetElement: PsiElement defined in org.jetbrains.kotlin.j2k.usageProcessing.UsageProcessing[PropertyDescriptorImpl]

'ArrayList' @ [107:63] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> UsageProcessing

'add' @ [107:78] ==> public abstract fun add(element: UsageProcessing): Boolean defined in kotlin.collections.MutableCollection[DeserializedSimpleFunctionDescriptor]

'it' @ [107:82] ==> value-parameter it: UsageProcessing defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.elementsToKotlin.<anonymous>[ValueParameterDescriptorImpl]

'inputElements' @ [111:23] ==> value-parameter inputElements: List<PsiElement> defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.elementsToKotlin[ValueParameterDescriptorImpl]

'any' @ [111:37] ==> public inline fun <T> Iterable<PsiElement>.any(predicate: (PsiElement) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'it' @ [111:43] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.elementsToKotlin.inConversionScope.<anonymous>[ValueParameterDescriptorImpl]

'isAncestor' @ [111:46] ==> public fun PsiElement?.isAncestor(element: PsiElement, strict: Boolean = ...): Boolean defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'element' @ [111:57] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.elementsToKotlin.inConversionScope[ValueParameterDescriptorImpl]

'processor' @ [114:39] ==> value-parameter processor: JavaToKotlinConverter.WithProgressProcessor defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.elementsToKotlin[ValueParameterDescriptorImpl]

'processItems' @ [114:49] ==> public final fun <TInputItem, TOutputItem> processItems(fractionPortion: Double, inputItems: Iterable<PsiElement>, processItem: (PsiElement) -> Converter.IntermediateResult?): List<Converter.IntermediateResult?> defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.WithProgressProcessor[SimpleFunctionDescriptorImpl]
Inferred types:
    <TInputItem> -> PsiElement
    <TOutputItem> -> IntermediateResult?

'inputElements' @ [114:68] ==> value-parameter inputElements: List<PsiElement> defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.elementsToKotlin[ValueParameterDescriptorImpl]

'Converter' @ [115:17] ==> public companion object defined in org.jetbrains.kotlin.j2k.Converter[FakeCallableDescriptorForObject]

'create' @ [115:27] ==> public final fun create(elementToConvert: PsiElement, settings: ConverterSettings, services: JavaToKotlinConverterServices, inConversionScope: (PsiElement) -> Boolean, usageProcessingsCollector: (UsageProcessing) -> Unit): Converter defined in org.jetbrains.kotlin.j2k.Converter.Companion[SimpleFunctionDescriptorImpl]

'inputElement' @ [115:34] ==> value-parameter inputElement: PsiElement defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.elementsToKotlin.<anonymous>[ValueParameterDescriptorImpl]

'settings' @ [115:48] ==> private final val settings: ConverterSettings defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter[PropertyDescriptorImpl]

'services' @ [115:58] ==> private final val services: JavaToKotlinConverterServices defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter[PropertyDescriptorImpl]

'inConversionScope' @ [115:70] ==> local final fun inConversionScope(element: PsiElement): Boolean defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.elementsToKotlin[SimpleFunctionDescriptorImpl]

'usageProcessingCollector' @ [115:89] ==> val usageProcessingCollector: (UsageProcessing) -> Unit defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.elementsToKotlin[LocalVariableDescriptor]

'convert' @ [115:115] ==> public final fun convert(): Converter.IntermediateResult? defined in org.jetbrains.kotlin.j2k.Converter[SimpleFunctionDescriptorImpl]

'toMutableList' @ [116:15] ==> public fun <T> Collection<Converter.IntermediateResult?>.toMutableList(): MutableList<Converter.IntermediateResult?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IntermediateResult?

'processor' @ [118:27] ==> value-parameter processor: JavaToKotlinConverter.WithProgressProcessor defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.elementsToKotlin[ValueParameterDescriptorImpl]

'processItems' @ [118:37] ==> public final fun <TInputItem, TOutputItem> processItems(fractionPortion: Double, inputItems: Iterable<IndexedValue<Converter.IntermediateResult?>>, processItem: (IndexedValue<Converter.IntermediateResult?>) -> JavaToKotlinConverter.ElementResult?): List<JavaToKotlinConverter.ElementResult?> defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.WithProgressProcessor[SimpleFunctionDescriptorImpl]
Inferred types:
    <TInputItem> -> IndexedValue<IntermediateResult?>
    <TOutputItem> -> ElementResult?

'intermediateResults' @ [118:56] ==> val intermediateResults: MutableList<Converter.IntermediateResult?> defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.elementsToKotlin[LocalVariableDescriptor]

'withIndex' @ [118:76] ==> public fun <T> Iterable<Converter.IntermediateResult?>.withIndex(): Iterable<IndexedValue<Converter.IntermediateResult?>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IntermediateResult?

'component1' @ [119:22] ==> public final operator fun component1(): Int defined in kotlin.collections.IndexedValue[DeserializedSimpleFunctionDescriptor]

'component2' @ [119:25] ==> public final operator fun component2(): Converter.IntermediateResult? defined in kotlin.collections.IndexedValue[DeserializedSimpleFunctionDescriptor]

'pair' @ [119:35] ==> value-parameter pair: IndexedValue<Converter.IntermediateResult?> defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.elementsToKotlin.<anonymous>[ValueParameterDescriptorImpl]

'intermediateResults' @ [120:17] ==> val intermediateResults: MutableList<Converter.IntermediateResult?> defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.elementsToKotlin[LocalVariableDescriptor]

'i' @ [120:37] ==> val i: Int defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.elementsToKotlin.<anonymous>[LocalVariableDescriptor]

'result' @ [121:17] ==> val result: Converter.IntermediateResult? defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.elementsToKotlin.<anonymous>[LocalVariableDescriptor]

'let' @ [121:25] ==> @InlineOnly public inline fun <T, R> Converter.IntermediateResult.let(block: (Converter.IntermediateResult) -> JavaToKotlinConverter.ElementResult): JavaToKotlinConverter.ElementResult defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IntermediateResult
    <R> -> ElementResult

'component1' @ [122:26] ==> public final operator fun component1(): String defined in org.jetbrains.kotlin.j2k.Converter.Result[SimpleFunctionDescriptorImpl]

'component2' @ [122:32] ==> public final operator fun component2(): Set<FqName> defined in org.jetbrains.kotlin.j2k.Converter.Result[SimpleFunctionDescriptorImpl]

'it' @ [122:48] ==> value-parameter it: Converter.IntermediateResult defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.elementsToKotlin.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'invoke' @ [122:51] ==> public abstract operator fun invoke(p1: Map<PsiElement, Collection<UsageProcessing>>): Converter.Result defined in kotlin.Function1[FunctionInvokeDescriptor]

'usageProcessings' @ [122:65] ==> val usageProcessings: LinkedHashMap<PsiElement, MutableCollection<UsageProcessing>> defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.elementsToKotlin[LocalVariableDescriptor]

'ElementResult' @ [123:21] ==> public constructor ElementResult(text: String, importsToAdd: Set<FqName>, parseContext: ParseContext) defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.ElementResult[ClassConstructorDescriptorImpl]

'text' @ [123:35] ==> val text: String defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.elementsToKotlin.<anonymous>.<anonymous>[LocalVariableDescriptor]

'importsToAdd' @ [123:41] ==> val importsToAdd: Set<FqName> defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.elementsToKotlin.<anonymous>.<anonymous>[LocalVariableDescriptor]

'it' @ [123:55] ==> value-parameter it: Converter.IntermediateResult defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.elementsToKotlin.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'parseContext' @ [123:58] ==> public final val parseContext: ParseContext defined in org.jetbrains.kotlin.j2k.Converter.IntermediateResult[PropertyDescriptorImpl]

'buildExternalCodeProcessing' @ [127:42] ==> private final fun buildExternalCodeProcessing(usageProcessings: Map<PsiElement, Collection<UsageProcessing>>, inConversionScope: (PsiElement) -> Boolean): JavaToKotlinConverter.ExternalCodeProcessing? defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter[SimpleFunctionDescriptorImpl]

'usageProcessings' @ [127:70] ==> val usageProcessings: LinkedHashMap<PsiElement, MutableCollection<UsageProcessing>> defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.elementsToKotlin[LocalVariableDescriptor]

'inConversionScope' @ [127:90] ==> local final fun inConversionScope(element: PsiElement): Boolean defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.elementsToKotlin[SimpleFunctionDescriptorImpl]

'Result' @ [129:20] ==> public constructor Result(results: List<JavaToKotlinConverter.ElementResult?>, externalCodeProcessing: JavaToKotlinConverter.ExternalCodeProcessing?) defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.Result[ClassConstructorDescriptorImpl]

'results' @ [129:27] ==> val results: List<JavaToKotlinConverter.ElementResult?> defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.elementsToKotlin[LocalVariableDescriptor]

'externalCodeProcessing' @ [129:36] ==> val externalCodeProcessing: JavaToKotlinConverter.ExternalCodeProcessing? defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.elementsToKotlin[LocalVariableDescriptor]

'Element' @ [133:13] ==> public companion object defined in org.jetbrains.kotlin.j2k.ast.Element[FakeCallableDescriptorForObject]

'saveCreationStacktraces' @ [133:21] ==> public final var saveCreationStacktraces: Boolean defined in org.jetbrains.kotlin.j2k.ast.Element.Companion[PropertyDescriptorImpl]

'elementsToKotlin' @ [135:24] ==> public final fun elementsToKotlin(inputElements: List<PsiElement>): JavaToKotlinConverter.Result defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter[SimpleFunctionDescriptorImpl]

'inputElements' @ [135:41] ==> value-parameter inputElements: List<PsiElement> defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.elementsToKotlin[ValueParameterDescriptorImpl]

'Element' @ [138:17] ==> public companion object defined in org.jetbrains.kotlin.j2k.ast.Element[FakeCallableDescriptorForObject]

'saveCreationStacktraces' @ [138:25] ==> public final var saveCreationStacktraces: Boolean defined in org.jetbrains.kotlin.j2k.ast.Element.Companion[PropertyDescriptorImpl]

'getValue' @ [149:27] ==> @InlineOnly public operator inline fun <T> Lazy<T>.getValue(thisRef: Any?, property: KProperty<*>): T defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'NONE' @ [149:53] ==> enum entry NONE defined in kotlin.LazyThreadSafetyMode[FakeCallableDescriptorForObject]

'target' @ [149:61] ==> public final val target: PsiElement defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.ReferenceInfo[PropertyDescriptorImpl]

'parentsWithSelf' @ [149:68] ==> public val PsiElement.parentsWithSelf: Sequence<PsiElement> defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'takeWhile' @ [149:84] ==> public fun <T> Sequence<PsiElement>.takeWhile(predicate: (PsiElement) -> Boolean): Sequence<PsiElement> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'it' @ [149:96] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.ReferenceInfo.depth.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'count' @ [149:113] ==> public fun <T> Sequence<PsiElement>.count(): Int defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'getValue' @ [150:28] ==> @InlineOnly public operator inline fun <T> Lazy<T>.getValue(thisRef: Any?, property: KProperty<*>): T defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'NONE' @ [150:54] ==> enum entry NONE defined in kotlin.LazyThreadSafetyMode[FakeCallableDescriptorForObject]

'reference' @ [150:62] ==> public final val reference: PsiReference defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.ReferenceInfo[PropertyDescriptorImpl]

'element' @ [150:72] ==> public final val PsiReference.element: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'textRange' @ [150:80] ==> public final val PsiElement.textRange: (TextRange..TextRange?)[MyPropertyDescriptor]

'startOffset' @ [150:90] ==> public final val TextRange.startOffset: Int[MyPropertyDescriptor]

'usageProcessings' @ [157:13] ==> value-parameter usageProcessings: Map<PsiElement, Collection<UsageProcessing>> defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.buildExternalCodeProcessing[ValueParameterDescriptorImpl]

'isEmpty' @ [157:30] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.Map[DeserializedSimpleFunctionDescriptor]

'usageProcessings' @ [159:65] ==> value-parameter usageProcessings: Map<PsiElement, Collection<UsageProcessing>> defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.buildExternalCodeProcessing[ValueParameterDescriptorImpl]

'values' @ [159:82] ==> public abstract val values: Collection<Collection<UsageProcessing>> defined in kotlin.collections.Map[DeserializedPropertyDescriptor]

'flatMap' @ [160:18] ==> public inline fun <T, R> Iterable<Collection<UsageProcessing>>.flatMap(transform: (Collection<UsageProcessing>) -> Iterable<UsageProcessing>): List<UsageProcessing> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Collection<UsageProcessing>
    <R> -> UsageProcessing

'it' @ [160:28] ==> value-parameter it: Collection<UsageProcessing> defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.buildExternalCodeProcessing.<anonymous>[ValueParameterDescriptorImpl]

'filter' @ [161:18] ==> public inline fun <T> Iterable<UsageProcessing>.filter(predicate: (UsageProcessing) -> Boolean): List<UsageProcessing> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> UsageProcessing

'it' @ [161:27] ==> value-parameter it: UsageProcessing defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.buildExternalCodeProcessing.<anonymous>[ValueParameterDescriptorImpl]

'javaCodeProcessors' @ [161:30] ==> public abstract val javaCodeProcessors: List<ExternalCodeProcessor> defined in org.jetbrains.kotlin.j2k.usageProcessing.UsageProcessing[PropertyDescriptorImpl]

'isNotEmpty' @ [161:49] ==> @InlineOnly public inline fun <T> Collection<ExternalCodeProcessor>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ExternalCodeProcessor

'it' @ [161:65] ==> value-parameter it: UsageProcessing defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.buildExternalCodeProcessing.<anonymous>[ValueParameterDescriptorImpl]

'kotlinCodeProcessors' @ [161:68] ==> public abstract val kotlinCodeProcessors: List<ExternalCodeProcessor> defined in org.jetbrains.kotlin.j2k.usageProcessing.UsageProcessing[PropertyDescriptorImpl]

'isNotEmpty' @ [161:89] ==> @InlineOnly public inline fun <T> Collection<ExternalCodeProcessor>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ExternalCodeProcessor

'groupBy' @ [162:18] ==> public inline fun <T, K> Iterable<UsageProcessing>.groupBy(keySelector: (UsageProcessing) -> PsiElement): Map<PsiElement, List<UsageProcessing>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> UsageProcessing
    <K> -> PsiElement

'it' @ [162:28] ==> value-parameter it: UsageProcessing defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.buildExternalCodeProcessing.<anonymous>[ValueParameterDescriptorImpl]

'targetElement' @ [162:31] ==> public abstract val targetElement: PsiElement defined in org.jetbrains.kotlin.j2k.usageProcessing.UsageProcessing[PropertyDescriptorImpl]

'map' @ [163:13] ==> val map: Map<PsiElement, Collection<UsageProcessing>> defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.buildExternalCodeProcessing[LocalVariableDescriptor]

'isEmpty' @ [163:17] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.Map[DeserializedSimpleFunctionDescriptor]

'ArrayList' @ [167:28] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> ReferenceInfo

'progress' @ [169:17] ==> value-parameter progress: ProgressIndicator defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.buildExternalCodeProcessing.<no name provided>.prepareWriteOperation[ValueParameterDescriptorImpl]

'text' @ [169:26] ==> public final var ProgressIndicator.text: (String..String?)[MyPropertyDescriptor]

'component1' @ [171:23] ==> public final operator fun component1(): Int defined in kotlin.collections.IndexedValue[DeserializedSimpleFunctionDescriptor]

'component2' @ [171:26] ==> public final operator fun component2(): Map.Entry<PsiElement, Collection<UsageProcessing>> defined in kotlin.collections.IndexedValue[DeserializedSimpleFunctionDescriptor]

'map' @ [171:36] ==> val map: Map<PsiElement, Collection<UsageProcessing>> defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.buildExternalCodeProcessing[LocalVariableDescriptor]

'entries' @ [171:40] ==> public abstract val entries: Set<Map.Entry<PsiElement, Collection<UsageProcessing>>> defined in kotlin.collections.Map[DeserializedPropertyDescriptor]

'withIndex' @ [171:48] ==> public fun <T> Iterable<Map.Entry<PsiElement, Collection<UsageProcessing>>>.withIndex(): Iterable<IndexedValue<Map.Entry<PsiElement, Collection<UsageProcessing>>>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Entry<PsiElement, Collection<UsageProcessing>>

'entry' @ [172:38] ==> val entry: Map.Entry<PsiElement, Collection<UsageProcessing>> defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.buildExternalCodeProcessing.<no name provided>.prepareWriteOperation[LocalVariableDescriptor]

'key' @ [172:44] ==> public abstract val key: PsiElement defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'entry' @ [173:39] ==> val entry: Map.Entry<PsiElement, Collection<UsageProcessing>> defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.buildExternalCodeProcessing.<no name provided>.prepareWriteOperation[LocalVariableDescriptor]

'value' @ [173:45] ==> public abstract val value: Collection<UsageProcessing> defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'progress' @ [175:21] ==> value-parameter progress: ProgressIndicator defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.buildExternalCodeProcessing.<no name provided>.prepareWriteOperation[ValueParameterDescriptorImpl]

'text2' @ [175:30] ==> public final var ProgressIndicator.text2: (String..String?)[MyPropertyDescriptor]

'?:' @ [175:38] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: String?, right: (String..String?)): (String..String?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> (kotlin.String..kotlin.String?)

'psiElement' @ [175:39] ==> val psiElement: PsiElement defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.buildExternalCodeProcessing.<no name provided>.prepareWriteOperation[LocalVariableDescriptor]

'name' @ [175:72] ==> public final val PsiNamedElement.name: String?[MyPropertyDescriptor]

'progress' @ [176:21] ==> value-parameter progress: ProgressIndicator defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.buildExternalCodeProcessing.<no name provided>.prepareWriteOperation[ValueParameterDescriptorImpl]

'checkCanceled' @ [176:30] ==> public abstract fun checkCanceled(): Unit defined in com.intellij.openapi.progress.ProgressIndicator[JavaMethodDescriptor]

'getInstance' @ [178:37] ==> @NotNull public open fun getInstance(): ProgressManager defined in com.intellij.openapi.progress.ProgressManager[JavaMethodDescriptor]

'runProcess' @ [178:51] ==> public final fun runProcess(@NotNull p0: () -> Unit, p1: (ProgressIndicator..ProgressIndicator?)): Unit defined in com.intellij.openapi.progress.ProgressManager[MyFunctionDescriptor]

'processings' @ [180:50] ==> val processings: Collection<UsageProcessing> defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.buildExternalCodeProcessing.<no name provided>.prepareWriteOperation[LocalVariableDescriptor]

'any' @ [180:62] ==> public inline fun <T> Iterable<UsageProcessing>.any(predicate: (UsageProcessing) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> UsageProcessing

'it' @ [180:68] ==> value-parameter it: UsageProcessing defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.buildExternalCodeProcessing.<no name provided>.prepareWriteOperation.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'javaCodeProcessors' @ [180:71] ==> public abstract val javaCodeProcessors: List<ExternalCodeProcessor> defined in org.jetbrains.kotlin.j2k.usageProcessing.UsageProcessing[PropertyDescriptorImpl]

'isNotEmpty' @ [180:90] ==> @InlineOnly public inline fun <T> Collection<ExternalCodeProcessor>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ExternalCodeProcessor

'processings' @ [181:52] ==> val processings: Collection<UsageProcessing> defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.buildExternalCodeProcessing.<no name provided>.prepareWriteOperation[LocalVariableDescriptor]

'any' @ [181:64] ==> public inline fun <T> Iterable<UsageProcessing>.any(predicate: (UsageProcessing) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> UsageProcessing

'it' @ [181:70] ==> value-parameter it: UsageProcessing defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.buildExternalCodeProcessing.<no name provided>.prepareWriteOperation.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'kotlinCodeProcessors' @ [181:73] ==> public abstract val kotlinCodeProcessors: List<ExternalCodeProcessor> defined in org.jetbrains.kotlin.j2k.usageProcessing.UsageProcessing[PropertyDescriptorImpl]

'isNotEmpty' @ [181:94] ==> @InlineOnly public inline fun <T> Collection<ExternalCodeProcessor>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ExternalCodeProcessor

'services' @ [182:33] ==> private final val services: JavaToKotlinConverterServices defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter[PropertyDescriptorImpl]

'referenceSearcher' @ [182:42] ==> public abstract val referenceSearcher: ReferenceSearcher defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverterServices[PropertyDescriptorImpl]

'findUsagesForExternalCodeProcessing' @ [182:60] ==> public abstract fun findUsagesForExternalCodeProcessing(element: PsiElement, searchJava: Boolean, searchKotlin: Boolean): Collection<PsiReference> defined in org.jetbrains.kotlin.j2k.ReferenceSearcher[SimpleFunctionDescriptorImpl]

'psiElement' @ [182:96] ==> val psiElement: PsiElement defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.buildExternalCodeProcessing.<no name provided>.prepareWriteOperation[LocalVariableDescriptor]

'searchJava' @ [182:108] ==> val searchJava: Boolean defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.buildExternalCodeProcessing.<no name provided>.prepareWriteOperation.<anonymous>[LocalVariableDescriptor]

'searchKotlin' @ [182:120] ==> val searchKotlin: Boolean defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.buildExternalCodeProcessing.<no name provided>.prepareWriteOperation.<anonymous>[LocalVariableDescriptor]

'filterNot' @ [183:42] ==> public inline fun <T> Iterable<PsiReference>.filterNot(predicate: (PsiReference) -> Boolean): List<PsiReference> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiReference

'invoke' @ [183:54] ==> public abstract operator fun invoke(p1: PsiElement): Boolean defined in kotlin.Function1[FunctionInvokeDescriptor]

'it' @ [183:72] ==> value-parameter it: PsiReference defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.buildExternalCodeProcessing.<no name provided>.prepareWriteOperation.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'element' @ [183:75] ==> public final val PsiReference.element: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'mapTo' @ [184:42] ==> public inline fun <T, R, C : MutableCollection<in JavaToKotlinConverter.ReferenceInfo>> Iterable<PsiReference>.mapTo(destination: ArrayList<JavaToKotlinConverter.ReferenceInfo>, transform: (PsiReference) -> JavaToKotlinConverter.ReferenceInfo): ArrayList<JavaToKotlinConverter.ReferenceInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiReference
    <R> -> ReferenceInfo
    <C : MutableCollection<in R>> -> ArrayList<ReferenceInfo>

'refs' @ [184:48] ==> val refs: ArrayList<JavaToKotlinConverter.ReferenceInfo> defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.buildExternalCodeProcessing.<no name provided>.prepareWriteOperation[LocalVariableDescriptor]

'ReferenceInfo' @ [184:56] ==> public constructor ReferenceInfo(reference: PsiReference, target: PsiElement, file: PsiFile, processings: Collection<UsageProcessing>) defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.ReferenceInfo[ClassConstructorDescriptorImpl]

'it' @ [184:70] ==> value-parameter it: PsiReference defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.buildExternalCodeProcessing.<no name provided>.prepareWriteOperation.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'psiElement' @ [184:74] ==> val psiElement: PsiElement defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.buildExternalCodeProcessing.<no name provided>.prepareWriteOperation[LocalVariableDescriptor]

'it' @ [184:86] ==> value-parameter it: PsiReference defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.buildExternalCodeProcessing.<no name provided>.prepareWriteOperation.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'element' @ [184:89] ==> public final val PsiReference.element: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'containingFile' @ [184:97] ==> public final val PsiElement.containingFile: (PsiFile..PsiFile?)[MyPropertyDescriptor]

'processings' @ [184:113] ==> val processings: Collection<UsageProcessing> defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.buildExternalCodeProcessing.<no name provided>.prepareWriteOperation[LocalVariableDescriptor]

'ProgressPortionReporter' @ [186:29] ==> public constructor ProgressPortionReporter(indicator: ProgressIndicator, start: Double, portion: Double) defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.ProgressPortionReporter[ClassConstructorDescriptorImpl]

'progress' @ [186:53] ==> value-parameter progress: ProgressIndicator defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.buildExternalCodeProcessing.<no name provided>.prepareWriteOperation[ValueParameterDescriptorImpl]

'i' @ [186:63] ==> val i: Int defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.buildExternalCodeProcessing.<no name provided>.prepareWriteOperation[LocalVariableDescriptor]

'map' @ [186:67] ==> val map: Map<PsiElement, Collection<UsageProcessing>> defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.buildExternalCodeProcessing[LocalVariableDescriptor]

'size' @ [186:71] ==> public abstract val size: Int defined in kotlin.collections.Map[DeserializedPropertyDescriptor]

'toDouble' @ [186:76] ==> public open fun toDouble(): Double defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'/' @ [186:88] ==> public final operator fun div(other: Int): Double defined in kotlin.Double[DeserializedSimpleFunctionDescriptor]

'map' @ [186:94] ==> val map: Map<PsiElement, Collection<UsageProcessing>> defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.buildExternalCodeProcessing[LocalVariableDescriptor]

'size' @ [186:98] ==> public abstract val size: Int defined in kotlin.collections.Map[DeserializedPropertyDescriptor]

'processUsages' @ [190:26] ==> private final fun processUsages(refs: Collection<JavaToKotlinConverter.ReferenceInfo>): Unit defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter[SimpleFunctionDescriptorImpl]

'refs' @ [190:40] ==> val refs: ArrayList<JavaToKotlinConverter.ReferenceInfo> defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.buildExternalCodeProcessing.<no name provided>.prepareWriteOperation[LocalVariableDescriptor]

'refs' @ [196:26] ==> value-parameter refs: Collection<JavaToKotlinConverter.ReferenceInfo> defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.processUsages[ValueParameterDescriptorImpl]

'groupBy' @ [196:31] ==> public inline fun <T, K> Iterable<JavaToKotlinConverter.ReferenceInfo>.groupBy(keySelector: (JavaToKotlinConverter.ReferenceInfo) -> PsiFile): Map<PsiFile, List<JavaToKotlinConverter.ReferenceInfo>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ReferenceInfo
    <K> -> PsiFile

'it' @ [196:41] ==> value-parameter it: JavaToKotlinConverter.ReferenceInfo defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.processUsages.<anonymous>[ValueParameterDescriptorImpl]

'file' @ [196:44] ==> public final val file: PsiFile defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.ReferenceInfo[PropertyDescriptorImpl]

'values' @ [196:51] ==> public abstract val values: Collection<List<JavaToKotlinConverter.ReferenceInfo>> defined in kotlin.collections.Map[DeserializedPropertyDescriptor]

'component1' @ [198:19] ==> public final operator fun component1(): PsiReference defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.ReferenceInfo[SimpleFunctionDescriptorImpl]

'component2' @ [198:30] ==> public final operator fun component2(): PsiElement defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.ReferenceInfo[SimpleFunctionDescriptorImpl]

'component3' @ [198:33] ==> public final operator fun component3(): PsiFile defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.ReferenceInfo[SimpleFunctionDescriptorImpl]

'component4' @ [198:36] ==> public final operator fun component4(): Collection<UsageProcessing> defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.ReferenceInfo[SimpleFunctionDescriptorImpl]

'fileRefs' @ [198:52] ==> val fileRefs: List<JavaToKotlinConverter.ReferenceInfo> defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.processUsages[LocalVariableDescriptor]

'sortedWith' @ [198:61] ==> public fun <T> Iterable<JavaToKotlinConverter.ReferenceInfo>.sortedWith(comparator: Comparator<in JavaToKotlinConverter.ReferenceInfo> /* = Comparator<in JavaToKotlinConverter.ReferenceInfo> */): List<JavaToKotlinConverter.ReferenceInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ReferenceInfo

'ReferenceComparator' @ [198:72] ==> private object ReferenceComparator : Comparator<JavaToKotlinConverter.ReferenceInfo> defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter[FakeCallableDescriptorForObject]

'when (reference.element.language) {
                    JavaLanguage.INSTANCE -> processings.flatMap { it.javaCodeProcessors }
                    KotlinLanguage.INSTANCE -> processings.flatMap { it.kotlinCodeProcessors }
                    else -> continue@ReferenceLoop
                }' @ [199:34] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: List<ExternalCodeProcessor>, entry1: List<ExternalCodeProcessor>, entry2: List<ExternalCodeProcessor>): List<ExternalCodeProcessor>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> List<ExternalCodeProcessor>

'reference' @ [199:40] ==> val reference: PsiReference defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.processUsages[LocalVariableDescriptor]

'element' @ [199:50] ==> public final val PsiReference.element: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'language' @ [199:58] ==> public final val PsiElement.language: Language[MyPropertyDescriptor]

'INSTANCE' @ [200:34] ==> @NotNull public final val INSTANCE: JavaLanguage defined in com.intellij.lang.java.JavaLanguage[JavaPropertyDescriptor]

'processings' @ [200:46] ==> val processings: Collection<UsageProcessing> defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.processUsages[LocalVariableDescriptor]

'flatMap' @ [200:58] ==> public inline fun <T, R> Iterable<UsageProcessing>.flatMap(transform: (UsageProcessing) -> Iterable<ExternalCodeProcessor>): List<ExternalCodeProcessor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> UsageProcessing
    <R> -> ExternalCodeProcessor

'it' @ [200:68] ==> value-parameter it: UsageProcessing defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.processUsages.<anonymous>[ValueParameterDescriptorImpl]

'javaCodeProcessors' @ [200:71] ==> public abstract val javaCodeProcessors: List<ExternalCodeProcessor> defined in org.jetbrains.kotlin.j2k.usageProcessing.UsageProcessing[PropertyDescriptorImpl]

'INSTANCE' @ [201:36] ==> @NotNull public final val INSTANCE: KotlinLanguage defined in org.jetbrains.kotlin.idea.KotlinLanguage[JavaPropertyDescriptor]

'processings' @ [201:48] ==> val processings: Collection<UsageProcessing> defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.processUsages[LocalVariableDescriptor]

'flatMap' @ [201:60] ==> public inline fun <T, R> Iterable<UsageProcessing>.flatMap(transform: (UsageProcessing) -> Iterable<ExternalCodeProcessor>): List<ExternalCodeProcessor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> UsageProcessing
    <R> -> ExternalCodeProcessor

'it' @ [201:70] ==> value-parameter it: UsageProcessing defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.processUsages.<anonymous>[ValueParameterDescriptorImpl]

'kotlinCodeProcessors' @ [201:73] ==> public abstract val kotlinCodeProcessors: List<ExternalCodeProcessor> defined in org.jetbrains.kotlin.j2k.usageProcessing.UsageProcessing[PropertyDescriptorImpl]

'checkReferenceValid' @ [205:17] ==> private final fun checkReferenceValid(reference: PsiReference, afterProcessor: ExternalCodeProcessor?): Unit defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter[SimpleFunctionDescriptorImpl]

'reference' @ [205:37] ==> val reference: PsiReference defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.processUsages[LocalVariableDescriptor]

'listOf' @ [207:34] ==> public fun <T> listOf(element: PsiReference): List<PsiReference> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiReference

'reference' @ [207:41] ==> val reference: PsiReference defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.processUsages[LocalVariableDescriptor]

'processors' @ [208:35] ==> val processors: List<ExternalCodeProcessor> defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.processUsages[LocalVariableDescriptor]

'references' @ [209:21] ==> var references: List<PsiReference> defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.processUsages[LocalVariableDescriptor]

'references' @ [209:34] ==> var references: List<PsiReference> defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.processUsages[LocalVariableDescriptor]

'flatMap' @ [209:45] ==> public inline fun <T, R> Iterable<PsiReference>.flatMap(transform: (PsiReference) -> Iterable<PsiReference>): List<PsiReference> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiReference
    <R> -> PsiReference

'processor' @ [209:55] ==> val processor: ExternalCodeProcessor defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.processUsages[LocalVariableDescriptor]

'processUsage' @ [209:65] ==> public abstract fun processUsage(reference: PsiReference): Array<PsiReference>? defined in org.jetbrains.kotlin.j2k.usageProcessing.ExternalCodeProcessor[SimpleFunctionDescriptorImpl]

'it' @ [209:78] ==> value-parameter it: PsiReference defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.processUsages.<anonymous>[ValueParameterDescriptorImpl]

'toList' @ [209:83] ==> public fun <T> Array<out PsiReference>.toList(): List<PsiReference> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiReference

'listOf' @ [209:95] ==> public fun <T> listOf(element: PsiReference): List<PsiReference> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiReference

'it' @ [209:102] ==> value-parameter it: PsiReference defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.processUsages.<anonymous>[ValueParameterDescriptorImpl]

'references' @ [210:21] ==> var references: List<PsiReference> defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.processUsages[LocalVariableDescriptor]

'forEach' @ [210:32] ==> @HidesMembers public inline fun <T> Iterable<PsiReference>.forEach(action: (PsiReference) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiReference

'checkReferenceValid' @ [210:42] ==> private final fun checkReferenceValid(reference: PsiReference, afterProcessor: ExternalCodeProcessor?): Unit defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter[SimpleFunctionDescriptorImpl]

'it' @ [210:62] ==> value-parameter it: PsiReference defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.processUsages.<anonymous>[ValueParameterDescriptorImpl]

'processor' @ [210:66] ==> val processor: ExternalCodeProcessor defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.processUsages[LocalVariableDescriptor]

'reference' @ [217:23] ==> value-parameter reference: PsiReference defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.checkReferenceValid[ValueParameterDescriptorImpl]

'element' @ [217:33] ==> public final val PsiReference.element: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'assert' @ [218:9] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'element' @ [218:16] ==> val element: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.checkReferenceValid[LocalVariableDescriptor]

'isValid' @ [218:24] ==> public final val PsiElement.isValid: Boolean[MyPropertyDescriptor]

'element' @ [218:35] ==> val element: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.checkReferenceValid[LocalVariableDescriptor]

'containingFile' @ [218:43] ==> public final val PsiElement.containingFile: (PsiFile..PsiFile?)[MyPropertyDescriptor]

'+' @ [219:13] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'reference' @ [219:25] ==> value-parameter reference: PsiReference defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.checkReferenceValid[ValueParameterDescriptorImpl]

'if (afterProcessor != null) " after processing with $afterProcessor" else ""' @ [219:55] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'afterProcessor' @ [219:59] ==> value-parameter afterProcessor: ExternalCodeProcessor? defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.checkReferenceValid[ValueParameterDescriptorImpl]

'afterProcessor' @ [219:108] ==> value-parameter afterProcessor: ExternalCodeProcessor? defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.checkReferenceValid[ValueParameterDescriptorImpl]

'info1' @ [225:26] ==> value-parameter info1: JavaToKotlinConverter.ReferenceInfo defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.ReferenceComparator.compare[ValueParameterDescriptorImpl]

'depth' @ [225:32] ==> public final val depth: Int defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.ReferenceInfo[PropertyDescriptorImpl]

'info2' @ [226:26] ==> value-parameter info2: JavaToKotlinConverter.ReferenceInfo defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.ReferenceComparator.compare[ValueParameterDescriptorImpl]

'depth' @ [226:32] ==> public final val depth: Int defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.ReferenceInfo[PropertyDescriptorImpl]

'depth1' @ [227:17] ==> val depth1: Int defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.ReferenceComparator.compare[LocalVariableDescriptor]

'depth2' @ [227:27] ==> val depth2: Int defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.ReferenceComparator.compare[LocalVariableDescriptor]

'-' @ [228:24] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'depth1' @ [228:25] ==> val depth1: Int defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.ReferenceComparator.compare[LocalVariableDescriptor]

'compareTo' @ [228:32] ==> public open fun compareTo(other: Int): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'depth2' @ [228:42] ==> val depth2: Int defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.ReferenceComparator.compare[LocalVariableDescriptor]

'-' @ [232:20] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'info1' @ [232:21] ==> value-parameter info1: JavaToKotlinConverter.ReferenceInfo defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.ReferenceComparator.compare[ValueParameterDescriptorImpl]

'offset' @ [232:27] ==> public final val offset: Int defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.ReferenceInfo[PropertyDescriptorImpl]

'compareTo' @ [232:34] ==> public open fun compareTo(other: Int): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'info2' @ [232:44] ==> value-parameter info2: JavaToKotlinConverter.ReferenceInfo defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.ReferenceComparator.compare[ValueParameterDescriptorImpl]

'offset' @ [232:50] ==> public final val offset: Int defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.ReferenceInfo[PropertyDescriptorImpl]

'WithProgressProcessor' @ [238:27] ==> public constructor WithProgressProcessor(progress: ProgressIndicator?, files: List<PsiJavaFile>?) defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.WithProgressProcessor[ClassConstructorDescriptorImpl]

'files' @ [242:33] ==> private final val files: List<PsiJavaFile>? defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.WithProgressProcessor[PropertyDescriptorImpl]

'size' @ [242:40] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'fileCount' @ [243:37] ==> private final val fileCount: Int defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.WithProgressProcessor[PropertyDescriptorImpl]

'toString' @ [243:47] ==> public open fun toString(): String defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'if (fileCount > 1) "files" else "file"' @ [243:66] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'fileCount' @ [243:70] ==> private final val fileCount: Int defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.WithProgressProcessor[PropertyDescriptorImpl]

'ArrayList' @ [252:31] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> TOutputItem

'getInstance' @ [254:29] ==> @NotNull public open fun getInstance(): ProgressManager defined in com.intellij.openapi.progress.ProgressManager[JavaMethodDescriptor]

'runProcess' @ [254:43] ==> public final fun runProcess(@NotNull p0: () -> Unit, p1: (ProgressIndicator..ProgressIndicator?)): Unit defined in com.intellij.openapi.progress.ProgressManager[MyFunctionDescriptor]

'progress' @ [256:25] ==> private final val progress: ProgressIndicator? defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.WithProgressProcessor[PropertyDescriptorImpl]

'text' @ [256:35] ==> public final var ProgressIndicator.text: (String..String?)[MyPropertyDescriptor]

'progressText' @ [256:44] ==> private final val progressText: String defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.WithProgressProcessor[PropertyDescriptorImpl]

'fileCountText' @ [256:59] ==> private final val fileCountText: String defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.WithProgressProcessor[PropertyDescriptorImpl]

'pass' @ [256:82] ==> private final var pass: Int defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.WithProgressProcessor[PropertyDescriptorImpl]

'component1' @ [258:31] ==> public final operator fun component1(): Int defined in kotlin.collections.IndexedValue[DeserializedSimpleFunctionDescriptor]

'component2' @ [258:34] ==> public final operator fun component2(): TInputItem defined in kotlin.collections.IndexedValue[DeserializedSimpleFunctionDescriptor]

'inputItems' @ [258:43] ==> value-parameter inputItems: Iterable<TInputItem> defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.WithProgressProcessor.processItems[ValueParameterDescriptorImpl]

'withIndex' @ [258:54] ==> public fun <T> Iterable<TInputItem>.withIndex(): Iterable<IndexedValue<TInputItem>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TInputItem

'progress' @ [259:29] ==> private final val progress: ProgressIndicator? defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.WithProgressProcessor[PropertyDescriptorImpl]

'checkCanceled' @ [259:39] ==> public abstract fun checkCanceled(): Unit defined in com.intellij.openapi.progress.ProgressIndicator[JavaMethodDescriptor]

'progress' @ [260:29] ==> private final val progress: ProgressIndicator? defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.WithProgressProcessor[PropertyDescriptorImpl]

'fraction' @ [260:39] ==> public final var ProgressIndicator.fraction: Double[MyPropertyDescriptor]

'fraction' @ [260:50] ==> private final var fraction: Double defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.WithProgressProcessor[PropertyDescriptorImpl]

'fractionPortion' @ [260:61] ==> value-parameter fractionPortion: Double defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.WithProgressProcessor.processItems[ValueParameterDescriptorImpl]

'i' @ [260:79] ==> val i: Int defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.WithProgressProcessor.processItems.<anonymous>[LocalVariableDescriptor]

'fileCount' @ [260:83] ==> private final val fileCount: Int defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.WithProgressProcessor[PropertyDescriptorImpl]

'progress' @ [262:29] ==> private final val progress: ProgressIndicator? defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.WithProgressProcessor[PropertyDescriptorImpl]

'text2' @ [262:39] ==> public final var ProgressIndicator.text2: (String..String?)[MyPropertyDescriptor]

'files' @ [262:47] ==> private final val files: List<PsiJavaFile>? defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.WithProgressProcessor[PropertyDescriptorImpl]

'i' @ [262:55] ==> val i: Int defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.WithProgressProcessor.processItems.<anonymous>[LocalVariableDescriptor]

'virtualFile' @ [262:58] ==> public final val PsiJavaFile.virtualFile: (VirtualFile..VirtualFile?)[MyPropertyDescriptor]

'presentableUrl' @ [262:70] ==> public final val VirtualFile.presentableUrl: String[MyPropertyDescriptor]

'outputItems' @ [264:29] ==> val outputItems: ArrayList<TOutputItem> defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.WithProgressProcessor.processItems[LocalVariableDescriptor]

'add' @ [264:41] ==> public open fun add(element: TOutputItem): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'invoke' @ [264:45] ==> public abstract operator fun invoke(p1: TInputItem): TOutputItem defined in kotlin.Function1[FunctionInvokeDescriptor]

'item' @ [264:57] ==> val item: TInputItem defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.WithProgressProcessor.processItems.<anonymous>[LocalVariableDescriptor]

'pass' @ [267:25] ==> private final var pass: Int defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.WithProgressProcessor[PropertyDescriptorImpl]

'fraction' @ [268:25] ==> private final var fraction: Double defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.WithProgressProcessor[PropertyDescriptorImpl]

'fractionPortion' @ [268:37] ==> value-parameter fractionPortion: Double defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.WithProgressProcessor.processItems[ValueParameterDescriptorImpl]

'EmptyProgressIndicator' @ [270:21] ==> public constructor EmptyProgressIndicator() defined in com.intellij.openapi.progress.EmptyProgressIndicator[JavaClassConstructorDescriptor]

'outputItems' @ [271:20] ==> val outputItems: ArrayList<TOutputItem> defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.WithProgressProcessor.processItems[LocalVariableDescriptor]

'DelegatingProgressIndicator' @ [279:9] ==> public constructor DelegatingProgressIndicator(indicator: ProgressIndicator) defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.DelegatingProgressIndicator[ClassConstructorDescriptorImpl]

'indicator' @ [279:37] ==> value-parameter indicator: ProgressIndicator defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.ProgressPortionReporter.<init>[ValueParameterDescriptorImpl]

'fraction' @ [282:13] ==> public final var JavaToKotlinConverter.ProgressPortionReporter.fraction: Double[MyPropertyDescriptor]

'fraction' @ [286:13] ==> public final var JavaToKotlinConverter.ProgressPortionReporter.fraction: Double[MyPropertyDescriptor]

'fraction' @ [290:13] ==> public final var JavaToKotlinConverter.ProgressPortionReporter.fraction: Double[MyPropertyDescriptor]

'portion' @ [290:24] ==> private final val portion: Double defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.ProgressPortionReporter[PropertyDescriptorImpl]

'super' @ [294:13] ==> <this> defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.ProgressPortionReporter[LazyClassReceiverParameterDescriptor]

'setFraction' @ [294:19] ==> public open fun setFraction(fraction: Double): Unit defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.DelegatingProgressIndicator[SimpleFunctionDescriptorImpl]

'start' @ [294:31] ==> private final val start: Double defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.ProgressPortionReporter[PropertyDescriptorImpl]

'fraction' @ [294:40] ==> value-parameter fraction: Double defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.ProgressPortionReporter.setFraction[ValueParameterDescriptorImpl]

'portion' @ [294:51] ==> private final val portion: Double defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.ProgressPortionReporter[PropertyDescriptorImpl]

'/' @ [298:20] ==> public final operator fun div(other: Double): Double defined in kotlin.Double[DeserializedSimpleFunctionDescriptor]

'super' @ [298:21] ==> <this> defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.ProgressPortionReporter[LazyClassReceiverParameterDescriptor]

'getFraction' @ [298:27] ==> public open fun getFraction(): Double defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.DelegatingProgressIndicator[SimpleFunctionDescriptorImpl]

'start' @ [298:43] ==> private final val start: Double defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.ProgressPortionReporter[PropertyDescriptorImpl]

'portion' @ [298:52] ==> private final val portion: Double defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.ProgressPortionReporter[PropertyDescriptorImpl]

'' @ [312:50] ==> public constructor Any() defined in kotlin.Any[DeserializedClassConstructorDescriptor]

'delegate' @ [313:13] ==> protected final val delegate: ProgressIndicator defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.DelegatingProgressIndicator[PropertyDescriptorImpl]

'indicator' @ [313:24] ==> value-parameter indicator: ProgressIndicator defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.DelegatingProgressIndicator.<init>[ValueParameterDescriptorImpl]

'' @ [316:22] ==> public constructor Any() defined in kotlin.Any[DeserializedClassConstructorDescriptor]

'getInstance' @ [317:45] ==> @NotNull public open fun getInstance(): ProgressManager defined in com.intellij.openapi.progress.ProgressManager[JavaMethodDescriptor]

'progressIndicator' @ [317:59] ==> public final val ProgressManager.progressIndicator: (ProgressIndicator..ProgressIndicator?)[MyPropertyDescriptor]

'delegate' @ [318:13] ==> protected final val delegate: ProgressIndicator defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.DelegatingProgressIndicator[PropertyDescriptorImpl]

'indicator' @ [318:24] ==> val indicator: (ProgressIndicator..ProgressIndicator?) defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.DelegatingProgressIndicator.<init>[LocalVariableDescriptor]

'EmptyProgressIndicator' @ [318:37] ==> public constructor EmptyProgressIndicator() defined in com.intellij.openapi.progress.EmptyProgressIndicator[JavaClassConstructorDescriptor]

'delegate' @ [321:32] ==> protected final val delegate: ProgressIndicator defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.DelegatingProgressIndicator[PropertyDescriptorImpl]

'start' @ [321:41] ==> public abstract fun start(): Unit defined in com.intellij.openapi.progress.ProgressIndicator[JavaMethodDescriptor]

'delegate' @ [322:31] ==> protected final val delegate: ProgressIndicator defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.DelegatingProgressIndicator[PropertyDescriptorImpl]

'stop' @ [322:40] ==> public abstract fun stop(): Unit defined in com.intellij.openapi.progress.ProgressIndicator[JavaMethodDescriptor]

'delegate' @ [323:36] ==> protected final val delegate: ProgressIndicator defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.DelegatingProgressIndicator[PropertyDescriptorImpl]

'isRunning' @ [323:45] ==> public final val ProgressIndicator.isRunning: Boolean[MyPropertyDescriptor]

'delegate' @ [324:33] ==> protected final val delegate: ProgressIndicator defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.DelegatingProgressIndicator[PropertyDescriptorImpl]

'cancel' @ [324:42] ==> public abstract fun cancel(): Unit defined in com.intellij.openapi.progress.ProgressIndicator[JavaMethodDescriptor]

'delegate' @ [325:37] ==> protected final val delegate: ProgressIndicator defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.DelegatingProgressIndicator[PropertyDescriptorImpl]

'isCanceled' @ [325:46] ==> public final val ProgressIndicator.isCanceled: Boolean[MyPropertyDescriptor]

'delegate' @ [328:13] ==> protected final val delegate: ProgressIndicator defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.DelegatingProgressIndicator[PropertyDescriptorImpl]

'text' @ [328:22] ==> public final var ProgressIndicator.text: (String..String?)[MyPropertyDescriptor]

'text' @ [328:29] ==> value-parameter text: String? defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.DelegatingProgressIndicator.setText[ValueParameterDescriptorImpl]

'delegate' @ [331:34] ==> protected final val delegate: ProgressIndicator defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.DelegatingProgressIndicator[PropertyDescriptorImpl]

'text' @ [331:43] ==> public final var ProgressIndicator.text: (String..String?)[MyPropertyDescriptor]

'delegate' @ [334:13] ==> protected final val delegate: ProgressIndicator defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.DelegatingProgressIndicator[PropertyDescriptorImpl]

'text2' @ [334:22] ==> public final var ProgressIndicator.text2: (String..String?)[MyPropertyDescriptor]

'text' @ [334:30] ==> value-parameter text: String? defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.DelegatingProgressIndicator.setText2[ValueParameterDescriptorImpl]

'delegate' @ [337:35] ==> protected final val delegate: ProgressIndicator defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.DelegatingProgressIndicator[PropertyDescriptorImpl]

'text2' @ [337:44] ==> public final var ProgressIndicator.text2: (String..String?)[MyPropertyDescriptor]

'delegate' @ [338:38] ==> protected final val delegate: ProgressIndicator defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.DelegatingProgressIndicator[PropertyDescriptorImpl]

'fraction' @ [338:47] ==> public final var ProgressIndicator.fraction: Double[MyPropertyDescriptor]

'delegate' @ [341:13] ==> protected final val delegate: ProgressIndicator defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.DelegatingProgressIndicator[PropertyDescriptorImpl]

'fraction' @ [341:22] ==> public final var ProgressIndicator.fraction: Double[MyPropertyDescriptor]

'fraction' @ [341:33] ==> value-parameter fraction: Double defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.DelegatingProgressIndicator.setFraction[ValueParameterDescriptorImpl]

'delegate' @ [344:36] ==> protected final val delegate: ProgressIndicator defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.DelegatingProgressIndicator[PropertyDescriptorImpl]

'pushState' @ [344:45] ==> public abstract fun pushState(): Unit defined in com.intellij.openapi.progress.ProgressIndicator[JavaMethodDescriptor]

'delegate' @ [345:35] ==> protected final val delegate: ProgressIndicator defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.DelegatingProgressIndicator[PropertyDescriptorImpl]

'popState' @ [345:44] ==> public abstract fun popState(): Unit defined in com.intellij.openapi.progress.ProgressIndicator[JavaMethodDescriptor]

'delegate' @ [346:52] ==> protected final val delegate: ProgressIndicator defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.DelegatingProgressIndicator[PropertyDescriptorImpl]

'startNonCancelableSection' @ [346:61] ==> public abstract fun startNonCancelableSection(): Unit defined in com.intellij.openapi.progress.ProgressIndicator[JavaMethodDescriptor]

'delegate' @ [347:53] ==> protected final val delegate: ProgressIndicator defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.DelegatingProgressIndicator[PropertyDescriptorImpl]

'finishNonCancelableSection' @ [347:62] ==> public abstract fun finishNonCancelableSection(): Unit defined in com.intellij.openapi.progress.ProgressIndicator[JavaMethodDescriptor]

'delegate' @ [348:34] ==> protected final val delegate: ProgressIndicator defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.DelegatingProgressIndicator[PropertyDescriptorImpl]

'isModal' @ [348:43] ==> public final val ProgressIndicator.isModal: Boolean[MyPropertyDescriptor]

'delegate' @ [349:43] ==> protected final val delegate: ProgressIndicator defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.DelegatingProgressIndicator[PropertyDescriptorImpl]

'modalityState' @ [349:52] ==> public final val ProgressIndicator.modalityState: ModalityState[MyPropertyDescriptor]

'delegate' @ [352:13] ==> protected final val delegate: ProgressIndicator defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.DelegatingProgressIndicator[PropertyDescriptorImpl]

'setModalityProgress' @ [352:22] ==> public abstract fun setModalityProgress(p0: (ProgressIndicator..ProgressIndicator?)): Unit defined in com.intellij.openapi.progress.ProgressIndicator[JavaMethodDescriptor]

'modalityProgress' @ [352:42] ==> value-parameter modalityProgress: ProgressIndicator defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.DelegatingProgressIndicator.setModalityProgress[ValueParameterDescriptorImpl]

'delegate' @ [355:42] ==> protected final val delegate: ProgressIndicator defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.DelegatingProgressIndicator[PropertyDescriptorImpl]

'isIndeterminate' @ [355:51] ==> public final var ProgressIndicator.isIndeterminate: Boolean[MyPropertyDescriptor]

'delegate' @ [358:13] ==> protected final val delegate: ProgressIndicator defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.DelegatingProgressIndicator[PropertyDescriptorImpl]

'isIndeterminate' @ [358:22] ==> public final var ProgressIndicator.isIndeterminate: Boolean[MyPropertyDescriptor]

'indeterminate' @ [358:40] ==> value-parameter indeterminate: Boolean defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.DelegatingProgressIndicator.setIndeterminate[ValueParameterDescriptorImpl]

'delegate' @ [361:40] ==> protected final val delegate: ProgressIndicator defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.DelegatingProgressIndicator[PropertyDescriptorImpl]

'checkCanceled' @ [361:49] ==> public abstract fun checkCanceled(): Unit defined in com.intellij.openapi.progress.ProgressIndicator[JavaMethodDescriptor]

'delegate' @ [362:55] ==> protected final val delegate: ProgressIndicator defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.DelegatingProgressIndicator[PropertyDescriptorImpl]

'delegate' @ [363:42] ==> protected final val delegate: ProgressIndicator defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.DelegatingProgressIndicator[PropertyDescriptorImpl]

'isPopupWasShown' @ [363:51] ==> public final val ProgressIndicator.isPopupWasShown: Boolean[MyPropertyDescriptor]

'delegate' @ [364:36] ==> protected final val delegate: ProgressIndicator defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.DelegatingProgressIndicator[PropertyDescriptorImpl]

'isShowing' @ [364:45] ==> public final val ProgressIndicator.isShowing: Boolean[MyPropertyDescriptor]

