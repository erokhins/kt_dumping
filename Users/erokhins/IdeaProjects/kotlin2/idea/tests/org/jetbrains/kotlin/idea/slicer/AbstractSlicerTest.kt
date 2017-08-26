'KotlinLightCodeInsightFixtureTestCase' @ [36:37] ==> public constructor KotlinLightCodeInsightFixtureTestCase() defined in org.jetbrains.kotlin.idea.test.KotlinLightCodeInsightFixtureTestCase[ClassConstructorDescriptorImpl]

'`object`' @ [39:20] ==> value-parameter `object`: KotlinSliceUsage defined in org.jetbrains.kotlin.idea.slicer.AbstractSlicerTest.SliceUsageHashingStrategy.computeHashCode[ValueParameterDescriptorImpl]

'usageInfo' @ [39:29] ==> public final val KotlinSliceUsage.usageInfo: UsageInfo[MyPropertyDescriptor]

'hashCode' @ [39:39] ==> public open fun hashCode(): Int defined in com.intellij.usageView.UsageInfo[JavaMethodDescriptor]

'`object`' @ [39:57] ==> value-parameter `object`: KotlinSliceUsage defined in org.jetbrains.kotlin.idea.slicer.AbstractSlicerTest.SliceUsageHashingStrategy.computeHashCode[ValueParameterDescriptorImpl]

'forcedExpressionMode' @ [39:66] ==> public final val forcedExpressionMode: Boolean defined in org.jetbrains.kotlin.idea.slicer.KotlinSliceUsage[DeserializedPropertyDescriptor]

'hashCode' @ [39:87] ==> public open fun hashCode(): Int defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'o1' @ [43:20] ==> value-parameter o1: KotlinSliceUsage defined in org.jetbrains.kotlin.idea.slicer.AbstractSlicerTest.SliceUsageHashingStrategy.equals[ValueParameterDescriptorImpl]

'usageInfo' @ [43:23] ==> public final val KotlinSliceUsage.usageInfo: UsageInfo[MyPropertyDescriptor]

'o2' @ [43:36] ==> value-parameter o2: KotlinSliceUsage defined in org.jetbrains.kotlin.idea.slicer.AbstractSlicerTest.SliceUsageHashingStrategy.equals[ValueParameterDescriptorImpl]

'usageInfo' @ [43:39] ==> public final val KotlinSliceUsage.usageInfo: UsageInfo[MyPropertyDescriptor]

'o1' @ [43:52] ==> value-parameter o1: KotlinSliceUsage defined in org.jetbrains.kotlin.idea.slicer.AbstractSlicerTest.SliceUsageHashingStrategy.equals[ValueParameterDescriptorImpl]

'forcedExpressionMode' @ [43:55] ==> public final val forcedExpressionMode: Boolean defined in org.jetbrains.kotlin.idea.slicer.KotlinSliceUsage[DeserializedPropertyDescriptor]

'o2' @ [43:79] ==> value-parameter o2: KotlinSliceUsage defined in org.jetbrains.kotlin.idea.slicer.AbstractSlicerTest.SliceUsageHashingStrategy.equals[ValueParameterDescriptorImpl]

'forcedExpressionMode' @ [43:82] ==> public final val forcedExpressionMode: Boolean defined in org.jetbrains.kotlin.idea.slicer.KotlinSliceUsage[DeserializedPropertyDescriptor]

'this' @ [49:13] ==> <this> defined in org.jetbrains.kotlin.idea.slicer.AbstractSlicerTest.processChildrenWithoutProgress[ReceiverParameterDescriptorImpl]

'runReadAction' @ [51:23] ==> public fun <T> runReadAction(action: () -> (PsiElement..PsiElement?)): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.util.application[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)

'element' @ [51:39] ==> public final val KotlinSliceUsage.element: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'Suppress' @ [53:9] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'UniqueProcessor' @ [54:48] ==> public constructor UniqueProcessor<T : (Any..Any?)>(@NotNull p0: ((KotlinSliceUsage..KotlinSliceUsage?)) -> Boolean, @NotNull p1: TObjectHashingStrategy<(KotlinSliceUsage..KotlinSliceUsage?)>) defined in com.intellij.util.CommonProcessors.UniqueProcessor[SamAdapterClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (org.jetbrains.kotlin.idea.slicer.KotlinSliceUsage..org.jetbrains.kotlin.idea.slicer.KotlinSliceUsage?)

'invoke' @ [56:21] ==> public abstract operator fun invoke(p1: KotlinSliceUsage): Unit defined in kotlin.Function1[FunctionInvokeDescriptor]

'it' @ [56:31] ==> value-parameter it: (KotlinSliceUsage..KotlinSliceUsage?) defined in org.jetbrains.kotlin.idea.slicer.AbstractSlicerTest.processChildrenWithoutProgress.<anonymous>[ValueParameterDescriptorImpl]

'SliceUsageHashingStrategy' @ [59:17] ==> public object SliceUsageHashingStrategy : TObjectHashingStrategy<KotlinSliceUsage> defined in org.jetbrains.kotlin.idea.slicer.AbstractSlicerTest[FakeCallableDescriptorForObject]

'runReadAction' @ [62:9] ==> public fun <T> runReadAction(action: () -> Unit): Unit defined in org.jetbrains.kotlin.idea.util.application[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit

'if (params.dataFlowToThis) {
                processUsagesFlownDownTo(element, uniqueProcessor)
            }
            else {
                processUsagesFlownFromThe(element, uniqueProcessor)
            }' @ [63:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'params' @ [63:17] ==> public final val params: (SliceAnalysisParams..SliceAnalysisParams?) defined in org.jetbrains.kotlin.idea.slicer.KotlinSliceUsage[JavaPropertyDescriptor]

'dataFlowToThis' @ [63:24] ==> public final var dataFlowToThis: Boolean defined in com.intellij.slicer.SliceAnalysisParams[JavaPropertyDescriptor]

'processUsagesFlownDownTo' @ [64:17] ==> public open fun processUsagesFlownDownTo(element: PsiElement, uniqueProcessor: Processor<SliceUsage>): Unit defined in org.jetbrains.kotlin.idea.slicer.KotlinSliceUsage[DeserializedSimpleFunctionDescriptor]

'element' @ [64:42] ==> val element: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.slicer.AbstractSlicerTest.processChildrenWithoutProgress[LocalVariableDescriptor]

'uniqueProcessor' @ [64:51] ==> val uniqueProcessor: Processor<SliceUsage> defined in org.jetbrains.kotlin.idea.slicer.AbstractSlicerTest.processChildrenWithoutProgress[LocalVariableDescriptor]

'processUsagesFlownFromThe' @ [67:17] ==> public open fun processUsagesFlownFromThe(element: PsiElement, uniqueProcessor: Processor<SliceUsage>): Unit defined in org.jetbrains.kotlin.idea.slicer.KotlinSliceUsage[DeserializedSimpleFunctionDescriptor]

'element' @ [67:43] ==> val element: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.slicer.AbstractSlicerTest.processChildrenWithoutProgress[LocalVariableDescriptor]

'uniqueProcessor' @ [67:52] ==> val uniqueProcessor: Processor<SliceUsage> defined in org.jetbrains.kotlin.idea.slicer.AbstractSlicerTest.processChildrenWithoutProgress[LocalVariableDescriptor]

'THashSet' @ [73:29] ==> public constructor THashSet<E : (Any..Any?)>(p0: (TObjectHashingStrategy<(KotlinSliceUsage..KotlinSliceUsage?)>..TObjectHashingStrategy<(KotlinSliceUsage..KotlinSliceUsage?)>?)) defined in gnu.trove.THashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> KotlinSliceUsage

'SliceUsageHashingStrategy' @ [73:56] ==> public object SliceUsageHashingStrategy : TObjectHashingStrategy<KotlinSliceUsage> defined in org.jetbrains.kotlin.idea.slicer.AbstractSlicerTest[FakeCallableDescriptorForObject]

'text' @ [76:24] ==> public final val TextChunk.text: String[MyPropertyDescriptor]

'attributes' @ [77:17] ==> public final val TextChunk.attributes: TextAttributes[MyPropertyDescriptor]

'fontType' @ [77:28] ==> public final var TextAttributes.fontType: Int[MyPropertyDescriptor]

'BOLD' @ [77:45] ==> public const final val BOLD: Int defined in java.awt.Font[JavaPropertyDescriptor]

'text' @ [78:17] ==> var text: String defined in org.jetbrains.kotlin.idea.slicer.AbstractSlicerTest.buildTreeRepresentation.render[LocalVariableDescriptor]

'text' @ [78:32] ==> var text: String defined in org.jetbrains.kotlin.idea.slicer.AbstractSlicerTest.buildTreeRepresentation.render[LocalVariableDescriptor]

'text' @ [80:20] ==> var text: String defined in org.jetbrains.kotlin.idea.slicer.AbstractSlicerTest.buildTreeRepresentation.render[LocalVariableDescriptor]

'!' @ [84:32] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'visitedUsages' @ [84:33] ==> val visitedUsages: THashSet<KotlinSliceUsage> defined in org.jetbrains.kotlin.idea.slicer.AbstractSlicerTest.buildTreeRepresentation[LocalVariableDescriptor]

'add' @ [84:47] ==> public open fun add(element: (KotlinSliceUsage..KotlinSliceUsage?)): Boolean defined in gnu.trove.THashSet[JavaMethodDescriptor]

'usage' @ [84:51] ==> value-parameter usage: KotlinSliceUsage defined in org.jetbrains.kotlin.idea.slicer.AbstractSlicerTest.buildTreeRepresentation.process[ValueParameterDescriptorImpl]

'buildString' @ [86:20] ==> @InlineOnly public inline fun buildString(builderAction: StringBuilder /* = StringBuilder */.() -> Unit): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'usage' @ [87:30] ==> value-parameter usage: KotlinSliceUsage defined in org.jetbrains.kotlin.idea.slicer.AbstractSlicerTest.buildTreeRepresentation.process[ValueParameterDescriptorImpl]

'text' @ [87:36] ==> public final val KotlinSliceUsage.text: (Array<(TextChunk..TextChunk?)>..Array<out (TextChunk..TextChunk?)>)[MyPropertyDescriptor]

'append' @ [88:17] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'chunks' @ [88:24] ==> val chunks: (Array<(TextChunk..TextChunk?)>..Array<out (TextChunk..TextChunk?)>) defined in org.jetbrains.kotlin.idea.slicer.AbstractSlicerTest.buildTreeRepresentation.process.<anonymous>[LocalVariableDescriptor]

'first' @ [88:31] ==> public fun <T> Array<out (TextChunk..TextChunk?)>.first(): (TextChunk..TextChunk?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.usages.TextChunk..com.intellij.usages.TextChunk?)

'render' @ [88:39] ==> local final fun TextChunk.render(): String defined in org.jetbrains.kotlin.idea.slicer.AbstractSlicerTest.buildTreeRepresentation[SimpleFunctionDescriptorImpl]

'append' @ [89:17] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'repeat' @ [89:29] ==> public fun CharSequence.repeat(n: Int): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'indent' @ [89:36] ==> value-parameter indent: Int defined in org.jetbrains.kotlin.idea.slicer.AbstractSlicerTest.buildTreeRepresentation.process[ValueParameterDescriptorImpl]

'usage' @ [90:21] ==> value-parameter usage: KotlinSliceUsage defined in org.jetbrains.kotlin.idea.slicer.AbstractSlicerTest.buildTreeRepresentation.process[ValueParameterDescriptorImpl]

'append' @ [91:21] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'append' @ [93:17] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'repeat' @ [93:36] ==> public fun CharSequence.repeat(n: Int): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'usage' @ [93:43] ==> value-parameter usage: KotlinSliceUsage defined in org.jetbrains.kotlin.idea.slicer.AbstractSlicerTest.buildTreeRepresentation.process[ValueParameterDescriptorImpl]

'lambdaLevel' @ [93:49] ==> public final val lambdaLevel: Int defined in org.jetbrains.kotlin.idea.slicer.KotlinSliceUsage[DeserializedPropertyDescriptor]

'chunks' @ [94:17] ==> val chunks: (Array<(TextChunk..TextChunk?)>..Array<out (TextChunk..TextChunk?)>) defined in org.jetbrains.kotlin.idea.slicer.AbstractSlicerTest.buildTreeRepresentation.process.<anonymous>[LocalVariableDescriptor]

'slice' @ [94:24] ==> public fun <T> Array<out (TextChunk..TextChunk?)>.slice(indices: IntRange): List<(TextChunk..TextChunk?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.usages.TextChunk..com.intellij.usages.TextChunk?)

'..' @ [94:30] ==> public final operator fun rangeTo(other: Int): IntRange defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'chunks' @ [94:33] ==> val chunks: (Array<(TextChunk..TextChunk?)>..Array<out (TextChunk..TextChunk?)>) defined in org.jetbrains.kotlin.idea.slicer.AbstractSlicerTest.buildTreeRepresentation.process.<anonymous>[LocalVariableDescriptor]

'size' @ [94:40] ==> public final val size: Int defined in kotlin.Array[DeserializedPropertyDescriptor]

'joinTo' @ [94:50] ==> public fun <T, A : Appendable /* = Appendable */> Iterable<(TextChunk..TextChunk?)>.joinTo(buffer: StringBuilder /* = StringBuilder */, separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: (((TextChunk..TextChunk?)) -> CharSequence)? = ...): StringBuilder /* = StringBuilder */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.usages.TextChunk..com.intellij.usages.TextChunk?)
    <A : Appendable /* = Appendable */> -> StringBuilder

'this' @ [95:25] ==> <this> defined in org.jetbrains.kotlin.idea.slicer.AbstractSlicerTest.buildTreeRepresentation.process.<anonymous>[ReceiverParameterDescriptorImpl]

'if (isDuplicated) "DUPLICATE: " else ""' @ [97:34] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'isDuplicated' @ [97:38] ==> val isDuplicated: Boolean defined in org.jetbrains.kotlin.idea.slicer.AbstractSlicerTest.buildTreeRepresentation.process[LocalVariableDescriptor]

'it' @ [99:21] ==> value-parameter it: (TextChunk..TextChunk?) defined in org.jetbrains.kotlin.idea.slicer.AbstractSlicerTest.buildTreeRepresentation.process.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'render' @ [99:24] ==> local final fun TextChunk.render(): String defined in org.jetbrains.kotlin.idea.slicer.AbstractSlicerTest.buildTreeRepresentation[SimpleFunctionDescriptorImpl]

'!' @ [100:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isDuplicated' @ [100:22] ==> val isDuplicated: Boolean defined in org.jetbrains.kotlin.idea.slicer.AbstractSlicerTest.buildTreeRepresentation.process[LocalVariableDescriptor]

'usage' @ [101:21] ==> value-parameter usage: KotlinSliceUsage defined in org.jetbrains.kotlin.idea.slicer.AbstractSlicerTest.buildTreeRepresentation.process[ValueParameterDescriptorImpl]

'processChildrenWithoutProgress' @ [101:27] ==> private final fun KotlinSliceUsage.processChildrenWithoutProgress(processor: (KotlinSliceUsage) -> Unit): Unit defined in org.jetbrains.kotlin.idea.slicer.AbstractSlicerTest[SimpleFunctionDescriptorImpl]

'append' @ [102:25] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'process' @ [102:32] ==> local final fun process(usage: KotlinSliceUsage, indent: Int): String defined in org.jetbrains.kotlin.idea.slicer.AbstractSlicerTest.buildTreeRepresentation[SimpleFunctionDescriptorImpl]

'it' @ [102:40] ==> value-parameter it: KotlinSliceUsage defined in org.jetbrains.kotlin.idea.slicer.AbstractSlicerTest.buildTreeRepresentation.process.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'indent' @ [102:44] ==> value-parameter indent: Int defined in org.jetbrains.kotlin.idea.slicer.AbstractSlicerTest.buildTreeRepresentation.process[ValueParameterDescriptorImpl]

'replace' @ [105:15] ==> @InlineOnly public inline fun CharSequence.replace(regex: Regex, replacement: String): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'Regex' @ [105:23] ==> public constructor Regex(pattern: String) defined in kotlin.text.Regex[DeserializedClassConstructorDescriptor]

'process' @ [108:16] ==> local final fun process(usage: KotlinSliceUsage, indent: Int): String defined in org.jetbrains.kotlin.idea.slicer.AbstractSlicerTest.buildTreeRepresentation[SimpleFunctionDescriptorImpl]

'rootUsage' @ [108:24] ==> value-parameter rootUsage: KotlinSliceUsage defined in org.jetbrains.kotlin.idea.slicer.AbstractSlicerTest.buildTreeRepresentation[ValueParameterDescriptorImpl]

'File' @ [112:24] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'path' @ [112:29] ==> value-parameter path: String defined in org.jetbrains.kotlin.idea.slicer.AbstractSlicerTest.doTest[ValueParameterDescriptorImpl]

'myFixture' @ [114:9] ==> protected/*protected and package*/ final var myFixture: (JavaCodeInsightTestFixture..JavaCodeInsightTestFixture?) defined in org.jetbrains.kotlin.idea.slicer.AbstractSlicerTest[JavaPropertyDescriptor]

'testDataPath' @ [114:19] ==> public final var JavaCodeInsightTestFixture.testDataPath: String[MyPropertyDescriptor]

'getHomeDirectory' @ [114:53] ==> @NotNull public open fun getHomeDirectory(): String defined in org.jetbrains.kotlin.test.KotlinTestUtils[JavaMethodDescriptor]

'mainFile' @ [114:75] ==> val mainFile: File defined in org.jetbrains.kotlin.idea.slicer.AbstractSlicerTest.doTest[LocalVariableDescriptor]

'parent' @ [114:84] ==> public final val File.parent: (String..String?)[MyPropertyDescriptor]

'loadFile' @ [116:33] ==> @NotNull public open fun loadFile(@NotNull p0: File, p1: Boolean): String defined in com.intellij.openapi.util.io.FileUtil[JavaMethodDescriptor]

'mainFile' @ [116:42] ==> val mainFile: File defined in org.jetbrains.kotlin.idea.slicer.AbstractSlicerTest.doTest[LocalVariableDescriptor]

'findStringWithPrefixes' @ [117:46] ==> @Nullable public open fun findStringWithPrefixes(p0: (String..String?), vararg p1: (String..String?)): String? defined in org.jetbrains.kotlin.test.InTextDirectivesUtils[JavaMethodDescriptor]

'fileText' @ [117:69] ==> val fileText: String defined in org.jetbrains.kotlin.idea.slicer.AbstractSlicerTest.doTest[LocalVariableDescriptor]

'isDirectiveDefined' @ [118:54] ==> public open fun isDirectiveDefined(p0: (String..String?), p1: (String..String?)): Boolean defined in org.jetbrains.kotlin.test.InTextDirectivesUtils[JavaMethodDescriptor]

'fileText' @ [118:73] ==> val fileText: String defined in org.jetbrains.kotlin.idea.slicer.AbstractSlicerTest.doTest[LocalVariableDescriptor]

'SliceAnalysisParams' @ [119:30] ==> public constructor SliceAnalysisParams() defined in com.intellij.slicer.SliceAnalysisParams[JavaClassConstructorDescriptor]

'apply' @ [119:52] ==> @InlineOnly public inline fun <T> SliceAnalysisParams.apply(block: SliceAnalysisParams.() -> Unit): SliceAnalysisParams defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SliceAnalysisParams

'dataFlowToThis' @ [120:13] ==> public final var dataFlowToThis: Boolean defined in com.intellij.slicer.SliceAnalysisParams[JavaPropertyDescriptor]

'when (flowKind) {
                "IN" -> true
                "OUT" -> false
                else -> throw AssertionError("Invalid flow kind: $flowKind")
            }' @ [120:30] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean, entry2: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'flowKind' @ [120:36] ==> val flowKind: String? defined in org.jetbrains.kotlin.idea.slicer.AbstractSlicerTest.doTest[LocalVariableDescriptor]

'AssertionError' @ [123:31] ==> public final fun <init>(p0: (Any..Any?)): AssertionError /* = AssertionError */ defined in kotlin.AssertionError[TypeAliasConstructorDescriptorImpl]

'flowKind' @ [123:67] ==> val flowKind: String? defined in org.jetbrains.kotlin.idea.slicer.AbstractSlicerTest.doTest[LocalVariableDescriptor]

'showInstanceDereferences' @ [125:13] ==> public final var showInstanceDereferences: Boolean defined in com.intellij.slicer.SliceAnalysisParams[JavaPropertyDescriptor]

'withDereferences' @ [125:40] ==> val withDereferences: Boolean defined in org.jetbrains.kotlin.idea.slicer.AbstractSlicerTest.doTest[LocalVariableDescriptor]

'scope' @ [126:13] ==> public final var scope: (AnalysisScope..AnalysisScope?) defined in com.intellij.slicer.SliceAnalysisParams[JavaPropertyDescriptor]

'AnalysisScope' @ [126:21] ==> public constructor AnalysisScope(@NotNull p0: Project) defined in com.intellij.analysis.AnalysisScope[JavaClassConstructorDescriptor]

'project' @ [126:35] ==> public final val AbstractSlicerTest.project: Project[MyPropertyDescriptor]

'myFixture' @ [129:20] ==> protected/*protected and package*/ final var myFixture: (JavaCodeInsightTestFixture..JavaCodeInsightTestFixture?) defined in org.jetbrains.kotlin.idea.slicer.AbstractSlicerTest[JavaPropertyDescriptor]

'configureByFile' @ [129:30] ==> public abstract fun configureByFile(@NotNull p0: String): (PsiFile..PsiFile?) defined in com.intellij.testFramework.fixtures.JavaCodeInsightTestFixture[JavaMethodDescriptor]

'mainFile' @ [129:46] ==> val mainFile: File defined in org.jetbrains.kotlin.idea.slicer.AbstractSlicerTest.doTest[LocalVariableDescriptor]

'name' @ [129:55] ==> public final val File.name: (String..String?)[MyPropertyDescriptor]

'file' @ [130:30] ==> val file: KtFile defined in org.jetbrains.kotlin.idea.slicer.AbstractSlicerTest.doTest[LocalVariableDescriptor]

'findElementAt' @ [130:35] ==> public open fun findElementAt(p0: Int): PsiElement? defined in org.jetbrains.kotlin.psi.KtFile[JavaMethodDescriptor]

'editor' @ [130:49] ==> public final val AbstractSlicerTest.editor: Editor[MyPropertyDescriptor]

'caretModel' @ [130:56] ==> public final val Editor.caretModel: CaretModel[MyPropertyDescriptor]

'offset' @ [130:67] ==> public final val CaretModel.offset: Int[MyPropertyDescriptor]

'KotlinSliceProvider' @ [131:29] ==> public constructor KotlinSliceProvider() defined in org.jetbrains.kotlin.idea.slicer.KotlinSliceProvider[DeserializedClassConstructorDescriptor]

'sliceProvider' @ [132:26] ==> val sliceProvider: KotlinSliceProvider defined in org.jetbrains.kotlin.idea.slicer.AbstractSlicerTest.doTest[LocalVariableDescriptor]

'getExpressionAtCaret' @ [132:40] ==> public open fun getExpressionAtCaret(atCaret: PsiElement?, dataFlowToThis: Boolean): KtExpression? defined in org.jetbrains.kotlin.idea.slicer.KotlinSliceProvider[DeserializedSimpleFunctionDescriptor]

'elementAtCaret' @ [132:61] ==> val elementAtCaret: PsiElement? defined in org.jetbrains.kotlin.idea.slicer.AbstractSlicerTest.doTest[LocalVariableDescriptor]

'analysisParams' @ [132:77] ==> val analysisParams: SliceAnalysisParams defined in org.jetbrains.kotlin.idea.slicer.AbstractSlicerTest.doTest[LocalVariableDescriptor]

'dataFlowToThis' @ [132:92] ==> public final var dataFlowToThis: Boolean defined in com.intellij.slicer.SliceAnalysisParams[JavaPropertyDescriptor]

'sliceProvider' @ [133:25] ==> val sliceProvider: KotlinSliceProvider defined in org.jetbrains.kotlin.idea.slicer.AbstractSlicerTest.doTest[LocalVariableDescriptor]

'createRootUsage' @ [133:39] ==> public open fun createRootUsage(element: PsiElement, params: SliceAnalysisParams): KotlinSliceUsage defined in org.jetbrains.kotlin.idea.slicer.KotlinSliceProvider[DeserializedSimpleFunctionDescriptor]

'expression' @ [133:55] ==> val expression: KtExpression defined in org.jetbrains.kotlin.idea.slicer.AbstractSlicerTest.doTest[LocalVariableDescriptor]

'analysisParams' @ [133:67] ==> val analysisParams: SliceAnalysisParams defined in org.jetbrains.kotlin.idea.slicer.AbstractSlicerTest.doTest[LocalVariableDescriptor]

'assertEqualsToFile' @ [134:25] ==> public open fun assertEqualsToFile(@NotNull p0: File, @NotNull p1: String): Unit defined in org.jetbrains.kotlin.test.KotlinTestUtils[JavaMethodDescriptor]

'File' @ [134:44] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'path' @ [134:49] ==> value-parameter path: String defined in org.jetbrains.kotlin.idea.slicer.AbstractSlicerTest.doTest[ValueParameterDescriptorImpl]

'replace' @ [134:54] ==> public fun String.replace(oldValue: String, newValue: String, ignoreCase: Boolean = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'buildTreeRepresentation' @ [134:87] ==> private final fun buildTreeRepresentation(rootUsage: KotlinSliceUsage): String defined in org.jetbrains.kotlin.idea.slicer.AbstractSlicerTest[SimpleFunctionDescriptorImpl]

'rootUsage' @ [134:111] ==> val rootUsage: KotlinSliceUsage defined in org.jetbrains.kotlin.idea.slicer.AbstractSlicerTest.doTest[LocalVariableDescriptor]

