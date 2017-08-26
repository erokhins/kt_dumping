'Suppress' @ [45:1] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'Deprecated' @ [46:1] ==> public constructor Deprecated(message: String, replaceWith: ReplaceWith = ..., level: DeprecationLevel = ...) defined in kotlin.Deprecated[DeserializedClassConstructorDescriptor]

'AbstractKotlinInspection' @ [50:5] ==> public constructor AbstractKotlinInspection() defined in org.jetbrains.kotlin.idea.inspections.AbstractKotlinInspection[ClassConstructorDescriptorImpl]

'this' @ [55:9] ==> public constructor IntentionBasedInspection<TElement : PsiElement>(intentionInfos: List<IntentionBasedInspection.IntentionData<TElement>>, problemText: String?) defined in org.jetbrains.kotlin.idea.inspections.IntentionBasedInspection[ClassConstructorDescriptorImpl]
Inferred types:
    <TElement : PsiElement> -> TElement

'listOf' @ [55:14] ==> public fun <T> listOf(element: IntentionBasedInspection.IntentionData<TElement>): List<IntentionBasedInspection.IntentionData<TElement>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IntentionData<TElement>

'IntentionData' @ [55:21] ==> public constructor IntentionData<TElement : PsiElement>(intention: KClass<out SelfTargetingRangeIntention<TElement>>, additionalChecker: (TElement, IntentionBasedInspection<TElement>) -> Boolean = ...) defined in org.jetbrains.kotlin.idea.inspections.IntentionBasedInspection.IntentionData[ClassConstructorDescriptorImpl]
Inferred types:
    <TElement : PsiElement> -> TElement

'intention' @ [55:35] ==> value-parameter intention: KClass<out SelfTargetingRangeIntention<TElement>> defined in org.jetbrains.kotlin.idea.inspections.IntentionBasedInspection.<init>[ValueParameterDescriptorImpl]

'problemText' @ [55:48] ==> value-parameter problemText: String? = ... defined in org.jetbrains.kotlin.idea.inspections.IntentionBasedInspection.<init>[ValueParameterDescriptorImpl]

'this' @ [61:9] ==> public constructor IntentionBasedInspection<TElement : PsiElement>(intentionInfos: List<IntentionBasedInspection.IntentionData<TElement>>, problemText: String?) defined in org.jetbrains.kotlin.idea.inspections.IntentionBasedInspection[ClassConstructorDescriptorImpl]
Inferred types:
    <TElement : PsiElement> -> TElement

'listOf' @ [61:14] ==> public fun <T> listOf(element: IntentionBasedInspection.IntentionData<TElement>): List<IntentionBasedInspection.IntentionData<TElement>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IntentionData<TElement>

'IntentionData' @ [61:21] ==> public constructor IntentionData<TElement : PsiElement>(intention: KClass<out SelfTargetingRangeIntention<TElement>>, additionalChecker: (TElement, IntentionBasedInspection<TElement>) -> Boolean = ...) defined in org.jetbrains.kotlin.idea.inspections.IntentionBasedInspection.IntentionData[ClassConstructorDescriptorImpl]
Inferred types:
    <TElement : PsiElement> -> TElement

'intention' @ [61:35] ==> value-parameter intention: KClass<out SelfTargetingRangeIntention<TElement>> defined in org.jetbrains.kotlin.idea.inspections.IntentionBasedInspection.<init>[ValueParameterDescriptorImpl]

'additionalChecker' @ [61:46] ==> value-parameter additionalChecker: (TElement, IntentionBasedInspection<TElement>) -> Boolean defined in org.jetbrains.kotlin.idea.inspections.IntentionBasedInspection.<init>[ValueParameterDescriptorImpl]

'problemText' @ [61:67] ==> value-parameter problemText: String? = ... defined in org.jetbrains.kotlin.idea.inspections.IntentionBasedInspection.<init>[ValueParameterDescriptorImpl]

'this' @ [67:9] ==> public constructor IntentionBasedInspection<TElement : PsiElement>(intentionInfos: List<IntentionBasedInspection.IntentionData<TElement>>, problemText: String?) defined in org.jetbrains.kotlin.idea.inspections.IntentionBasedInspection[ClassConstructorDescriptorImpl]
Inferred types:
    <TElement : PsiElement> -> TElement

'listOf' @ [67:14] ==> public fun <T> listOf(element: IntentionBasedInspection.IntentionData<TElement>): List<IntentionBasedInspection.IntentionData<TElement>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IntentionData<TElement>

'IntentionData' @ [67:21] ==> public constructor IntentionData<TElement : PsiElement>(intention: KClass<out SelfTargetingRangeIntention<TElement>>, additionalChecker: (TElement, IntentionBasedInspection<TElement>) -> Boolean = ...) defined in org.jetbrains.kotlin.idea.inspections.IntentionBasedInspection.IntentionData[ClassConstructorDescriptorImpl]
Inferred types:
    <TElement : PsiElement> -> TElement

'intention' @ [67:35] ==> value-parameter intention: KClass<out SelfTargetingRangeIntention<TElement>> defined in org.jetbrains.kotlin.idea.inspections.IntentionBasedInspection.<init>[ValueParameterDescriptorImpl]

'invoke' @ [67:62] ==> public abstract operator fun invoke(p1: TElement): Boolean defined in kotlin.Function1[FunctionInvokeDescriptor]

'element' @ [67:80] ==> value-parameter element: TElement defined in org.jetbrains.kotlin.idea.inspections.IntentionBasedInspection.<init>.<anonymous>[ValueParameterDescriptorImpl]

'problemText' @ [67:95] ==> value-parameter problemText: String? = ... defined in org.jetbrains.kotlin.idea.inspections.IntentionBasedInspection.<init>[ValueParameterDescriptorImpl]

'getStartOffsetIn' @ [81:21] ==> public fun PsiElement.getStartOffsetIn(ancestor: PsiElement): Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'baseElement' @ [81:38] ==> value-parameter baseElement: PsiElement defined in org.jetbrains.kotlin.idea.inspections.IntentionBasedInspection.toRange[ValueParameterDescriptorImpl]

'TextRange' @ [82:16] ==> public constructor TextRange(p0: Int, p1: Int) defined in com.intellij.openapi.util.TextRange[JavaClassConstructorDescriptor]

'start' @ [82:26] ==> val start: Int defined in org.jetbrains.kotlin.idea.inspections.IntentionBasedInspection.toRange[LocalVariableDescriptor]

'start' @ [82:33] ==> val start: Int defined in org.jetbrains.kotlin.idea.inspections.IntentionBasedInspection.toRange[LocalVariableDescriptor]

'endOffset' @ [82:41] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'startOffset' @ [82:53] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'intentionInfos' @ [87:37] ==> private final val intentionInfos: List<IntentionBasedInspection.IntentionData<TElement>> defined in org.jetbrains.kotlin.idea.inspections.IntentionBasedInspection[PropertyDescriptorImpl]

'map' @ [87:52] ==> public inline fun <T, R> Iterable<IntentionBasedInspection.IntentionData<TElement>>.map(transform: (IntentionBasedInspection.IntentionData<TElement>) -> Pair<SelfTargetingRangeIntention<TElement>, (TElement, IntentionBasedInspection<TElement>) -> Boolean>): List<Pair<SelfTargetingRangeIntention<TElement>, (TElement, IntentionBasedInspection<TElement>) -> Boolean>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IntentionData<TElement>
    <R> -> Pair<SelfTargetingRangeIntention<TElement>, Function2<TElement, IntentionBasedInspection<TElement>, Boolean>>

'it' @ [88:28] ==> value-parameter it: IntentionBasedInspection.IntentionData<TElement> defined in org.jetbrains.kotlin.idea.inspections.IntentionBasedInspection.buildVisitor.<anonymous>[ValueParameterDescriptorImpl]

'intention' @ [88:31] ==> public final val intention: KClass<out SelfTargetingRangeIntention<TElement>> defined in org.jetbrains.kotlin.idea.inspections.IntentionBasedInspection.IntentionData[PropertyDescriptorImpl]

'constructors' @ [88:41] ==> public abstract val constructors: Collection<KFunction<SelfTargetingRangeIntention<TElement>>> defined in kotlin.reflect.KClass[DeserializedPropertyDescriptor]

'single' @ [88:54] ==> public inline fun <T> Iterable<KFunction<SelfTargetingRangeIntention<TElement>>>.single(predicate: (KFunction<SelfTargetingRangeIntention<TElement>>) -> Boolean): KFunction<SelfTargetingRangeIntention<TElement>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KFunction<SelfTargetingRangeIntention<TElement>>

'it' @ [88:63] ==> value-parameter it: KFunction<SelfTargetingRangeIntention<TElement>> defined in org.jetbrains.kotlin.idea.inspections.IntentionBasedInspection.buildVisitor.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'parameters' @ [88:66] ==> public abstract val parameters: List<KParameter> defined in kotlin.reflect.KFunction[DeserializedPropertyDescriptor]

'isEmpty' @ [88:77] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'call' @ [88:90] ==> public abstract fun call(vararg args: Any?): SelfTargetingRangeIntention<TElement> defined in kotlin.reflect.KFunction[DeserializedSimpleFunctionDescriptor]

'instance' @ [89:13] ==> val instance: SelfTargetingRangeIntention<TElement> defined in org.jetbrains.kotlin.idea.inspections.IntentionBasedInspection.buildVisitor.<anonymous>[LocalVariableDescriptor]

'inspection' @ [89:22] ==> public final var inspection: IntentionBasedInspection<TElement>? defined in org.jetbrains.kotlin.idea.intentions.SelfTargetingRangeIntention[PropertyDescriptorImpl]

'this' @ [89:35] ==> <this> defined in org.jetbrains.kotlin.idea.inspections.IntentionBasedInspection[LazyClassReceiverParameterDescriptor]

'instance' @ [90:13] ==> val instance: SelfTargetingRangeIntention<TElement> defined in org.jetbrains.kotlin.idea.inspections.IntentionBasedInspection.buildVisitor.<anonymous>[LocalVariableDescriptor]

'it' @ [90:25] ==> value-parameter it: IntentionBasedInspection.IntentionData<TElement> defined in org.jetbrains.kotlin.idea.inspections.IntentionBasedInspection.buildVisitor.<anonymous>[ValueParameterDescriptorImpl]

'additionalChecker' @ [90:28] ==> public final val additionalChecker: (TElement, IntentionBasedInspection<TElement>) -> Boolean defined in org.jetbrains.kotlin.idea.inspections.IntentionBasedInspection.IntentionData[PropertyDescriptorImpl]

'intentionsAndCheckers' @ [92:27] ==> val intentionsAndCheckers: List<Pair<SelfTargetingRangeIntention<TElement>, (TElement, IntentionBasedInspection<TElement>) -> Boolean>> defined in org.jetbrains.kotlin.idea.inspections.IntentionBasedInspection.buildVisitor[LocalVariableDescriptor]

'map' @ [92:49] ==> public inline fun <T, R> Iterable<Pair<SelfTargetingRangeIntention<TElement>, (TElement, IntentionBasedInspection<TElement>) -> Boolean>>.map(transform: (Pair<SelfTargetingRangeIntention<TElement>, (TElement, IntentionBasedInspection<TElement>) -> Boolean>) -> Class<TElement>): List<Class<TElement>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<SelfTargetingRangeIntention<TElement>, Function2<TElement, IntentionBasedInspection<TElement>, Boolean>>
    <R> -> Class<TElement>

'it' @ [92:55] ==> value-parameter it: Pair<SelfTargetingRangeIntention<TElement>, (TElement, IntentionBasedInspection<TElement>) -> Boolean> defined in org.jetbrains.kotlin.idea.inspections.IntentionBasedInspection.buildVisitor.<anonymous>[ValueParameterDescriptorImpl]

'first' @ [92:58] ==> public final val first: SelfTargetingRangeIntention<TElement> defined in kotlin.Pair[DeserializedPropertyDescriptor]

'elementType' @ [92:64] ==> public final val elementType: Class<TElement> defined in org.jetbrains.kotlin.idea.intentions.SelfTargetingRangeIntention[PropertyDescriptorImpl]

'distinct' @ [92:78] ==> public fun <T> Iterable<Class<TElement>>.distinct(): List<Class<TElement>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Class<TElement>

'singleOrNull' @ [92:89] ==> public fun <T> List<Class<TElement>>.singleOrNull(): Class<TElement>? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Class<TElement>

'error' @ [93:30] ==> @InlineOnly public inline fun error(message: Any): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'intentionInfos' @ [93:38] ==> private final val intentionInfos: List<IntentionBasedInspection.IntentionData<TElement>> defined in org.jetbrains.kotlin.idea.inspections.IntentionBasedInspection[PropertyDescriptorImpl]

'PsiElementVisitor' @ [95:25] ==> public constructor PsiElementVisitor() defined in com.intellij.psi.PsiElementVisitor[JavaClassConstructorDescriptor]

'!' @ [97:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'elementType' @ [97:22] ==> val elementType: Class<TElement> defined in org.jetbrains.kotlin.idea.inspections.IntentionBasedInspection.buildVisitor[LocalVariableDescriptor]

'isInstance' @ [97:34] ==> public open fun isInstance(p0: (Any..Any?)): Boolean defined in java.lang.Class[JavaMethodDescriptor]

'element' @ [97:45] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.inspections.IntentionBasedInspection.buildVisitor.<no name provided>.visitElement[ValueParameterDescriptorImpl]

'element' @ [97:57] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.inspections.IntentionBasedInspection.buildVisitor.<no name provided>.visitElement[ValueParameterDescriptorImpl]

'textLength' @ [97:65] ==> public final val PsiElement.textLength: Int[MyPropertyDescriptor]

'Suppress' @ [99:17] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'element' @ [100:37] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.inspections.IntentionBasedInspection.buildVisitor.<no name provided>.visitElement[ValueParameterDescriptorImpl]

'component1' @ [105:23] ==> public final operator fun component1(): SelfTargetingRangeIntention<TElement> defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [105:34] ==> public final operator fun component2(): (TElement, IntentionBasedInspection<TElement>) -> Boolean defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'intentionsAndCheckers' @ [105:56] ==> val intentionsAndCheckers: List<Pair<SelfTargetingRangeIntention<TElement>, (TElement, IntentionBasedInspection<TElement>) -> Boolean>> defined in org.jetbrains.kotlin.idea.inspections.IntentionBasedInspection.buildVisitor[LocalVariableDescriptor]

'intention' @ [106:33] ==> val intention: SelfTargetingRangeIntention<TElement> defined in org.jetbrains.kotlin.idea.inspections.IntentionBasedInspection.buildVisitor.<no name provided>.visitElement[LocalVariableDescriptor]

'applicabilityRange' @ [106:43] ==> public abstract fun applicabilityRange(element: TElement): TextRange? defined in org.jetbrains.kotlin.idea.intentions.SelfTargetingRangeIntention[SimpleFunctionDescriptorImpl]

'targetElement' @ [106:62] ==> val targetElement: TElement defined in org.jetbrains.kotlin.idea.inspections.IntentionBasedInspection.buildVisitor.<no name provided>.visitElement[LocalVariableDescriptor]

'let' @ [106:78] ==> @InlineOnly public inline fun <T, R> TextRange.let(block: (TextRange) -> TextRange): TextRange defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TextRange
    <R> -> TextRange

'targetElement' @ [107:44] ==> val targetElement: TElement defined in org.jetbrains.kotlin.idea.inspections.IntentionBasedInspection.buildVisitor.<no name provided>.visitElement[LocalVariableDescriptor]

'textRange' @ [107:58] ==> public final val PsiElement.textRange: (TextRange..TextRange?)[MyPropertyDescriptor]

'assert' @ [108:25] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'range' @ [108:32] ==> value-parameter range: TextRange defined in org.jetbrains.kotlin.idea.inspections.IntentionBasedInspection.buildVisitor.<no name provided>.visitElement.<anonymous>[ValueParameterDescriptorImpl]

'elementRange' @ [108:41] ==> val elementRange: (TextRange..TextRange?) defined in org.jetbrains.kotlin.idea.inspections.IntentionBasedInspection.buildVisitor.<no name provided>.visitElement.<anonymous>[LocalVariableDescriptor]

'intention' @ [108:97] ==> val intention: SelfTargetingRangeIntention<TElement> defined in org.jetbrains.kotlin.idea.inspections.IntentionBasedInspection.buildVisitor.<no name provided>.visitElement[LocalVariableDescriptor]

'range' @ [109:25] ==> value-parameter range: TextRange defined in org.jetbrains.kotlin.idea.inspections.IntentionBasedInspection.buildVisitor.<no name provided>.visitElement.<anonymous>[ValueParameterDescriptorImpl]

'shiftRight' @ [109:31] ==> @NotNull public open fun shiftRight(p0: Int): TextRange defined in com.intellij.openapi.util.TextRange[JavaMethodDescriptor]

'-' @ [109:42] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'elementRange' @ [109:43] ==> val elementRange: (TextRange..TextRange?) defined in org.jetbrains.kotlin.idea.inspections.IntentionBasedInspection.buildVisitor.<no name provided>.visitElement.<anonymous>[LocalVariableDescriptor]

'startOffset' @ [109:56] ==> public final val TextRange.startOffset: Int[MyPropertyDescriptor]

'range' @ [112:25] ==> val range: TextRange? defined in org.jetbrains.kotlin.idea.inspections.IntentionBasedInspection.buildVisitor.<no name provided>.visitElement[LocalVariableDescriptor]

'invoke' @ [112:42] ==> public abstract operator fun invoke(p1: TElement, p2: IntentionBasedInspection<TElement>): Boolean defined in kotlin.Function2[FunctionInvokeDescriptor]

'targetElement' @ [112:60] ==> val targetElement: TElement defined in org.jetbrains.kotlin.idea.inspections.IntentionBasedInspection.buildVisitor.<no name provided>.visitElement[LocalVariableDescriptor]

'this@IntentionBasedInspection' @ [112:75] ==> <this> defined in org.jetbrains.kotlin.idea.inspections.IntentionBasedInspection[LazyClassReceiverParameterDescriptor]

'problemRange' @ [113:25] ==> var problemRange: TextRange? defined in org.jetbrains.kotlin.idea.inspections.IntentionBasedInspection.buildVisitor.<no name provided>.visitElement[LocalVariableDescriptor]

'problemRange' @ [113:40] ==> var problemRange: TextRange? defined in org.jetbrains.kotlin.idea.inspections.IntentionBasedInspection.buildVisitor.<no name provided>.visitElement[LocalVariableDescriptor]

'union' @ [113:54] ==> @NotNull public open fun union(@NotNull p0: TextRange): TextRange defined in com.intellij.openapi.util.TextRange[JavaMethodDescriptor]

'range' @ [113:60] ==> val range: TextRange? defined in org.jetbrains.kotlin.idea.inspections.IntentionBasedInspection.buildVisitor.<no name provided>.visitElement[LocalVariableDescriptor]

'range' @ [113:70] ==> val range: TextRange? defined in org.jetbrains.kotlin.idea.inspections.IntentionBasedInspection.buildVisitor.<no name provided>.visitElement[LocalVariableDescriptor]

'fixes' @ [114:29] ==> var fixes: SmartList<LocalQuickFix>? defined in org.jetbrains.kotlin.idea.inspections.IntentionBasedInspection.buildVisitor.<no name provided>.visitElement[LocalVariableDescriptor]

'fixes' @ [115:29] ==> var fixes: SmartList<LocalQuickFix>? defined in org.jetbrains.kotlin.idea.inspections.IntentionBasedInspection.buildVisitor.<no name provided>.visitElement[LocalVariableDescriptor]

'SmartList' @ [115:37] ==> public constructor SmartList<E : (Any..Any?)>() defined in com.intellij.util.SmartList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> LocalQuickFix

'fixes' @ [117:25] ==> var fixes: SmartList<LocalQuickFix>? defined in org.jetbrains.kotlin.idea.inspections.IntentionBasedInspection.buildVisitor.<no name provided>.visitElement[LocalVariableDescriptor]

'add' @ [117:31] ==> public open fun add(element: (LocalQuickFix..LocalQuickFix?)): Boolean defined in com.intellij.util.SmartList[JavaMethodDescriptor]

'createQuickFix' @ [117:35] ==> private final fun createQuickFix(intention: SelfTargetingRangeIntention<TElement>, additionalChecker: (TElement, IntentionBasedInspection<TElement>) -> Boolean, targetElement: TElement): IntentionBasedInspection<TElement>.IntentionBasedQuickFix defined in org.jetbrains.kotlin.idea.inspections.IntentionBasedInspection[SimpleFunctionDescriptorImpl]

'intention' @ [117:50] ==> val intention: SelfTargetingRangeIntention<TElement> defined in org.jetbrains.kotlin.idea.inspections.IntentionBasedInspection.buildVisitor.<no name provided>.visitElement[LocalVariableDescriptor]

'additionalChecker' @ [117:61] ==> val additionalChecker: (TElement, IntentionBasedInspection<TElement>) -> Boolean defined in org.jetbrains.kotlin.idea.inspections.IntentionBasedInspection.buildVisitor.<no name provided>.visitElement[LocalVariableDescriptor]

'targetElement' @ [117:80] ==> val targetElement: TElement defined in org.jetbrains.kotlin.idea.inspections.IntentionBasedInspection.buildVisitor.<no name provided>.visitElement[LocalVariableDescriptor]

'inspectionTarget' @ [121:29] ==> public open fun inspectionTarget(element: TElement): PsiElement? defined in org.jetbrains.kotlin.idea.inspections.IntentionBasedInspection[SimpleFunctionDescriptorImpl]

'targetElement' @ [121:46] ==> val targetElement: TElement defined in org.jetbrains.kotlin.idea.inspections.IntentionBasedInspection.buildVisitor.<no name provided>.visitElement[LocalVariableDescriptor]

'toRange' @ [121:62] ==> private final fun PsiElement.toRange(baseElement: PsiElement): TextRange defined in org.jetbrains.kotlin.idea.inspections.IntentionBasedInspection[SimpleFunctionDescriptorImpl]

'element' @ [121:70] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.inspections.IntentionBasedInspection.buildVisitor.<no name provided>.visitElement[ValueParameterDescriptorImpl]

'problemRange' @ [121:82] ==> var problemRange: TextRange? defined in org.jetbrains.kotlin.idea.inspections.IntentionBasedInspection.buildVisitor.<no name provided>.visitElement[LocalVariableDescriptor]

'range' @ [122:21] ==> val range: TextRange? defined in org.jetbrains.kotlin.idea.inspections.IntentionBasedInspection.buildVisitor.<no name provided>.visitElement[LocalVariableDescriptor]

'fixes' @ [123:36] ==> var fixes: SmartList<LocalQuickFix>? defined in org.jetbrains.kotlin.idea.inspections.IntentionBasedInspection.buildVisitor.<no name provided>.visitElement[LocalVariableDescriptor]

'SmartList' @ [123:45] ==> public constructor SmartList<E : (Any..Any?)>() defined in com.intellij.util.SmartList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> LocalQuickFix

'additionalFixes' @ [124:21] ==> public open fun additionalFixes(element: TElement): List<LocalQuickFix>? defined in org.jetbrains.kotlin.idea.inspections.IntentionBasedInspection[SimpleFunctionDescriptorImpl]

'targetElement' @ [124:37] ==> val targetElement: TElement defined in org.jetbrains.kotlin.idea.inspections.IntentionBasedInspection.buildVisitor.<no name provided>.visitElement[LocalVariableDescriptor]

'let' @ [124:53] ==> @InlineOnly public inline fun <T, R> List<LocalQuickFix>.let(block: (List<LocalQuickFix>) -> Boolean): Boolean defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> List<LocalQuickFix>
    <R> -> Boolean

'allFixes' @ [124:59] ==> val allFixes: SmartList<LocalQuickFix> defined in org.jetbrains.kotlin.idea.inspections.IntentionBasedInspection.buildVisitor.<no name provided>.visitElement[LocalVariableDescriptor]

'addAll' @ [124:68] ==> public open fun addAll(elements: Collection<(LocalQuickFix..LocalQuickFix?)>): Boolean defined in com.intellij.util.SmartList[JavaMethodDescriptor]

'it' @ [124:75] ==> value-parameter it: List<LocalQuickFix> defined in org.jetbrains.kotlin.idea.inspections.IntentionBasedInspection.buildVisitor.<no name provided>.visitElement.<anonymous>[ValueParameterDescriptorImpl]

'!' @ [125:25] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'allFixes' @ [125:26] ==> val allFixes: SmartList<LocalQuickFix> defined in org.jetbrains.kotlin.idea.inspections.IntentionBasedInspection.buildVisitor.<no name provided>.visitElement[LocalVariableDescriptor]

'isEmpty' @ [125:35] ==> public open fun isEmpty(): Boolean defined in com.intellij.util.SmartList[JavaMethodDescriptor]

'holder' @ [126:25] ==> value-parameter holder: ProblemsHolder defined in org.jetbrains.kotlin.idea.inspections.IntentionBasedInspection.buildVisitor[ValueParameterDescriptorImpl]

'registerProblem' @ [126:32] ==> public open fun registerProblem(@NotNull p0: PsiElement, @NotNull p1: String, @NotNull p2: ProblemHighlightType, @Nullable p3: TextRange?, @Nullable vararg p4: (LocalQuickFix..LocalQuickFix?)): Unit defined in com.intellij.codeInspection.ProblemsHolder[JavaMethodDescriptor]

'targetElement' @ [126:48] ==> val targetElement: TElement defined in org.jetbrains.kotlin.idea.inspections.IntentionBasedInspection.buildVisitor.<no name provided>.visitElement[LocalVariableDescriptor]

'problemText' @ [126:63] ==> protected open val problemText: String? defined in org.jetbrains.kotlin.idea.inspections.IntentionBasedInspection[PropertyDescriptorImpl]

'allFixes' @ [126:78] ==> val allFixes: SmartList<LocalQuickFix> defined in org.jetbrains.kotlin.idea.inspections.IntentionBasedInspection.buildVisitor.<no name provided>.visitElement[LocalVariableDescriptor]

'first' @ [126:87] ==> public fun <T> List<(LocalQuickFix..LocalQuickFix?)>.first(): (LocalQuickFix..LocalQuickFix?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.codeInspection.LocalQuickFix..com.intellij.codeInspection.LocalQuickFix?)

'name' @ [126:95] ==> public final val LocalQuickFix.name: String[MyPropertyDescriptor]

'problemHighlightType' @ [127:48] ==> protected open fun problemHighlightType(element: TElement): ProblemHighlightType defined in org.jetbrains.kotlin.idea.inspections.IntentionBasedInspection[SimpleFunctionDescriptorImpl]

'targetElement' @ [127:69] ==> val targetElement: TElement defined in org.jetbrains.kotlin.idea.inspections.IntentionBasedInspection.buildVisitor.<no name provided>.visitElement[LocalVariableDescriptor]

'range' @ [127:85] ==> val range: TextRange? defined in org.jetbrains.kotlin.idea.inspections.IntentionBasedInspection.buildVisitor.<no name provided>.visitElement[LocalVariableDescriptor]

'allFixes' @ [127:93] ==> val allFixes: SmartList<LocalQuickFix> defined in org.jetbrains.kotlin.idea.inspections.IntentionBasedInspection.buildVisitor.<no name provided>.visitElement[LocalVariableDescriptor]

'toTypedArray' @ [127:102] ==> public inline fun <reified T> Collection<(LocalQuickFix..LocalQuickFix?)>.toTypedArray(): Array<(LocalQuickFix..LocalQuickFix?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> (com.intellij.codeInspection.LocalQuickFix..com.intellij.codeInspection.LocalQuickFix?)

'GENERIC_ERROR_OR_WARNING' @ [135:34] ==> enum entry GENERIC_ERROR_OR_WARNING defined in com.intellij.codeInspection.ProblemHighlightType[FakeCallableDescriptorForObject]

'when (intention) {
            is LowPriorityAction -> LowPriorityIntentionBasedQuickFix(intention, additionalChecker, targetElement)
            is HighPriorityAction -> HighPriorityIntentionBasedQuickFix(intention, additionalChecker, targetElement)
            else -> IntentionBasedQuickFix(intention, additionalChecker, targetElement)
        }' @ [142:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: IntentionBasedInspection<TElement>.IntentionBasedQuickFix, entry1: IntentionBasedInspection<TElement>.IntentionBasedQuickFix, entry2: IntentionBasedInspection<TElement>.IntentionBasedQuickFix): IntentionBasedInspection<TElement>.IntentionBasedQuickFix[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> IntentionBasedQuickFix<TElement>

'intention' @ [142:22] ==> value-parameter intention: SelfTargetingRangeIntention<TElement> defined in org.jetbrains.kotlin.idea.inspections.IntentionBasedInspection.createQuickFix[ValueParameterDescriptorImpl]

'LowPriorityIntentionBasedQuickFix' @ [143:37] ==> public constructor LowPriorityIntentionBasedQuickFix(intention: SelfTargetingRangeIntention<TElement>, additionalChecker: (TElement, IntentionBasedInspection<TElement>) -> Boolean, targetElement: TElement) defined in org.jetbrains.kotlin.idea.inspections.IntentionBasedInspection.LowPriorityIntentionBasedQuickFix[ClassConstructorDescriptorImpl]

'intention' @ [143:71] ==> value-parameter intention: SelfTargetingRangeIntention<TElement> defined in org.jetbrains.kotlin.idea.inspections.IntentionBasedInspection.createQuickFix[ValueParameterDescriptorImpl]

'additionalChecker' @ [143:82] ==> value-parameter additionalChecker: (TElement, IntentionBasedInspection<TElement>) -> Boolean defined in org.jetbrains.kotlin.idea.inspections.IntentionBasedInspection.createQuickFix[ValueParameterDescriptorImpl]

'targetElement' @ [143:101] ==> value-parameter targetElement: TElement defined in org.jetbrains.kotlin.idea.inspections.IntentionBasedInspection.createQuickFix[ValueParameterDescriptorImpl]

'HighPriorityIntentionBasedQuickFix' @ [144:38] ==> public constructor HighPriorityIntentionBasedQuickFix(intention: SelfTargetingRangeIntention<TElement>, additionalChecker: (TElement, IntentionBasedInspection<TElement>) -> Boolean, targetElement: TElement) defined in org.jetbrains.kotlin.idea.inspections.IntentionBasedInspection.HighPriorityIntentionBasedQuickFix[ClassConstructorDescriptorImpl]

'intention' @ [144:73] ==> value-parameter intention: SelfTargetingRangeIntention<TElement> defined in org.jetbrains.kotlin.idea.inspections.IntentionBasedInspection.createQuickFix[ValueParameterDescriptorImpl]

'additionalChecker' @ [144:84] ==> value-parameter additionalChecker: (TElement, IntentionBasedInspection<TElement>) -> Boolean defined in org.jetbrains.kotlin.idea.inspections.IntentionBasedInspection.createQuickFix[ValueParameterDescriptorImpl]

'targetElement' @ [144:103] ==> value-parameter targetElement: TElement defined in org.jetbrains.kotlin.idea.inspections.IntentionBasedInspection.createQuickFix[ValueParameterDescriptorImpl]

'IntentionBasedQuickFix' @ [145:21] ==> public constructor IntentionBasedQuickFix(intention: SelfTargetingRangeIntention<TElement>, additionalChecker: (TElement, IntentionBasedInspection<TElement>) -> Boolean, targetElement: TElement) defined in org.jetbrains.kotlin.idea.inspections.IntentionBasedInspection.IntentionBasedQuickFix[ClassConstructorDescriptorImpl]

'intention' @ [145:44] ==> value-parameter intention: SelfTargetingRangeIntention<TElement> defined in org.jetbrains.kotlin.idea.inspections.IntentionBasedInspection.createQuickFix[ValueParameterDescriptorImpl]

'additionalChecker' @ [145:55] ==> value-parameter additionalChecker: (TElement, IntentionBasedInspection<TElement>) -> Boolean defined in org.jetbrains.kotlin.idea.inspections.IntentionBasedInspection.createQuickFix[ValueParameterDescriptorImpl]

'targetElement' @ [145:74] ==> value-parameter targetElement: TElement defined in org.jetbrains.kotlin.idea.inspections.IntentionBasedInspection.createQuickFix[ValueParameterDescriptorImpl]

'LocalQuickFixOnPsiElement' @ [154:9] ==> protected/*protected and package*/ constructor LocalQuickFixOnPsiElement(@NotNull p0: PsiElement) defined in com.intellij.codeInspection.LocalQuickFixOnPsiElement[JavaClassConstructorDescriptor]

'targetElement' @ [154:35] ==> value-parameter targetElement: TElement defined in org.jetbrains.kotlin.idea.inspections.IntentionBasedInspection.IntentionBasedQuickFix.<init>[ValueParameterDescriptorImpl]

'intention' @ [156:28] ==> public final val intention: SelfTargetingRangeIntention<TElement> defined in org.jetbrains.kotlin.idea.inspections.IntentionBasedInspection.IntentionBasedQuickFix[PropertyDescriptorImpl]

'text' @ [156:38] ==> public final var <TElement : PsiElement> SelfTargetingRangeIntention<TElement>.text: String[MyPropertyDescriptor]
Inferred types:
    <TElement : PsiElement> -> TElement

'intention' @ [159:40] ==> public final val intention: SelfTargetingRangeIntention<TElement> defined in org.jetbrains.kotlin.idea.inspections.IntentionBasedInspection.IntentionBasedQuickFix[PropertyDescriptorImpl]

'familyName' @ [159:50] ==> public final val <TElement : PsiElement> SelfTargetingRangeIntention<TElement>.familyName: String[MyPropertyDescriptor]
Inferred types:
    <TElement : PsiElement> -> TElement

'text' @ [161:42] ==> private final val text: String defined in org.jetbrains.kotlin.idea.inspections.IntentionBasedInspection.IntentionBasedQuickFix[PropertyDescriptorImpl]

'intention' @ [163:45] ==> public final val intention: SelfTargetingRangeIntention<TElement> defined in org.jetbrains.kotlin.idea.inspections.IntentionBasedInspection.IntentionBasedQuickFix[PropertyDescriptorImpl]

'startInWriteAction' @ [163:55] ==> public open fun startInWriteAction(): Boolean defined in org.jetbrains.kotlin.idea.intentions.SelfTargetingRangeIntention[SimpleFunctionDescriptorImpl]

'isAvailable' @ [165:87] ==> protected/*protected and package*/ open fun isAvailable(): Boolean defined in org.jetbrains.kotlin.idea.inspections.IntentionBasedInspection.IntentionBasedQuickFix[JavaMethodDescriptor]

'assert' @ [168:13] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'startElement' @ [168:20] ==> value-parameter startElement: PsiElement defined in org.jetbrains.kotlin.idea.inspections.IntentionBasedInspection.IntentionBasedQuickFix.isAvailable[ValueParameterDescriptorImpl]

'endElement' @ [168:36] ==> value-parameter endElement: PsiElement defined in org.jetbrains.kotlin.idea.inspections.IntentionBasedInspection.IntentionBasedQuickFix.isAvailable[ValueParameterDescriptorImpl]

'intention' @ [169:20] ==> public final val intention: SelfTargetingRangeIntention<TElement> defined in org.jetbrains.kotlin.idea.inspections.IntentionBasedInspection.IntentionBasedQuickFix[PropertyDescriptorImpl]

'applicabilityRange' @ [169:30] ==> public abstract fun applicabilityRange(element: TElement): TextRange? defined in org.jetbrains.kotlin.idea.intentions.SelfTargetingRangeIntention[SimpleFunctionDescriptorImpl]

'startElement' @ [169:49] ==> value-parameter startElement: PsiElement defined in org.jetbrains.kotlin.idea.inspections.IntentionBasedInspection.IntentionBasedQuickFix.isAvailable[ValueParameterDescriptorImpl]

'invoke' @ [169:86] ==> public abstract operator fun invoke(p1: TElement, p2: IntentionBasedInspection<TElement>): Boolean defined in kotlin.Function2[FunctionInvokeDescriptor]

'startElement' @ [169:104] ==> value-parameter startElement: PsiElement defined in org.jetbrains.kotlin.idea.inspections.IntentionBasedInspection.IntentionBasedQuickFix.isAvailable[ValueParameterDescriptorImpl]

'this@IntentionBasedInspection' @ [169:118] ==> <this> defined in org.jetbrains.kotlin.idea.inspections.IntentionBasedInspection[LazyClassReceiverParameterDescriptor]

'getInstance' @ [173:32] ==> public open fun getInstance(@NotNull p0: Project): (PsiDocumentManager..PsiDocumentManager?) defined in com.intellij.psi.PsiDocumentManager[JavaMethodDescriptor]

'project' @ [173:44] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.inspections.IntentionBasedInspection.IntentionBasedQuickFix.invoke[ValueParameterDescriptorImpl]

'commitAllDocuments' @ [173:53] ==> public abstract fun commitAllDocuments(): Unit defined in com.intellij.psi.PsiDocumentManager[JavaMethodDescriptor]

'applyFix' @ [174:13] ==> public open fun applyFix(): Unit defined in org.jetbrains.kotlin.idea.inspections.IntentionBasedInspection.IntentionBasedQuickFix[JavaMethodDescriptor]

'assert' @ [178:13] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'startElement' @ [178:20] ==> value-parameter startElement: PsiElement defined in org.jetbrains.kotlin.idea.inspections.IntentionBasedInspection.IntentionBasedQuickFix.invoke[ValueParameterDescriptorImpl]

'endElement' @ [178:36] ==> value-parameter endElement: PsiElement defined in org.jetbrains.kotlin.idea.inspections.IntentionBasedInspection.IntentionBasedQuickFix.invoke[ValueParameterDescriptorImpl]

'!' @ [179:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isAvailable' @ [179:18] ==> public open fun isAvailable(project: Project, file: PsiFile, startElement: PsiElement, endElement: PsiElement): Boolean defined in org.jetbrains.kotlin.idea.inspections.IntentionBasedInspection.IntentionBasedQuickFix[SimpleFunctionDescriptorImpl]

'project' @ [179:30] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.inspections.IntentionBasedInspection.IntentionBasedQuickFix.invoke[ValueParameterDescriptorImpl]

'file' @ [179:39] ==> value-parameter file: PsiFile defined in org.jetbrains.kotlin.idea.inspections.IntentionBasedInspection.IntentionBasedQuickFix.invoke[ValueParameterDescriptorImpl]

'startElement' @ [179:45] ==> value-parameter startElement: PsiElement defined in org.jetbrains.kotlin.idea.inspections.IntentionBasedInspection.IntentionBasedQuickFix.invoke[ValueParameterDescriptorImpl]

'endElement' @ [179:59] ==> value-parameter endElement: PsiElement defined in org.jetbrains.kotlin.idea.inspections.IntentionBasedInspection.IntentionBasedQuickFix.invoke[ValueParameterDescriptorImpl]

'!' @ [180:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'getInstance' @ [180:42] ==> public open fun getInstance(): (FileModificationService..FileModificationService?) defined in com.intellij.codeInsight.FileModificationService[JavaMethodDescriptor]

'prepareFileForWrite' @ [180:56] ==> public abstract fun prepareFileForWrite(@Nullable p0: PsiFile?): Boolean defined in com.intellij.codeInsight.FileModificationService[JavaMethodDescriptor]

'file' @ [180:76] ==> value-parameter file: PsiFile defined in org.jetbrains.kotlin.idea.inspections.IntentionBasedInspection.IntentionBasedQuickFix.invoke[ValueParameterDescriptorImpl]

'startElement' @ [182:26] ==> value-parameter startElement: PsiElement defined in org.jetbrains.kotlin.idea.inspections.IntentionBasedInspection.IntentionBasedQuickFix.invoke[ValueParameterDescriptorImpl]

'findExistingEditor' @ [182:39] ==> public fun PsiElement.findExistingEditor(): Editor? defined in org.jetbrains.kotlin.idea.inspections in file IntentionBasedInspection.kt[SimpleFunctionDescriptorImpl]

'editor' @ [183:13] ==> val editor: Editor? defined in org.jetbrains.kotlin.idea.inspections.IntentionBasedInspection.IntentionBasedQuickFix.invoke[LocalVariableDescriptor]

'caretModel' @ [183:21] ==> public final val Editor.caretModel: CaretModel[MyPropertyDescriptor]

'moveToOffset' @ [183:33] ==> public abstract fun moveToOffset(p0: Int): Unit defined in com.intellij.openapi.editor.CaretModel[JavaMethodDescriptor]

'startElement' @ [183:46] ==> value-parameter startElement: PsiElement defined in org.jetbrains.kotlin.idea.inspections.IntentionBasedInspection.IntentionBasedQuickFix.invoke[ValueParameterDescriptorImpl]

'textOffset' @ [183:59] ==> public final val PsiElement.textOffset: Int[MyPropertyDescriptor]

'intention' @ [184:13] ==> public final val intention: SelfTargetingRangeIntention<TElement> defined in org.jetbrains.kotlin.idea.inspections.IntentionBasedInspection.IntentionBasedQuickFix[PropertyDescriptorImpl]

'applyTo' @ [184:23] ==> public abstract fun applyTo(element: TElement, editor: Editor?): Unit defined in org.jetbrains.kotlin.idea.intentions.SelfTargetingRangeIntention[SimpleFunctionDescriptorImpl]

'startElement' @ [184:31] ==> value-parameter startElement: PsiElement defined in org.jetbrains.kotlin.idea.inspections.IntentionBasedInspection.IntentionBasedQuickFix.invoke[ValueParameterDescriptorImpl]

'editor' @ [184:57] ==> val editor: Editor? defined in org.jetbrains.kotlin.idea.inspections.IntentionBasedInspection.IntentionBasedQuickFix.invoke[LocalVariableDescriptor]

'IntentionBasedQuickFix' @ [192:9] ==> public constructor IntentionBasedQuickFix(intention: SelfTargetingRangeIntention<TElement>, additionalChecker: (TElement, IntentionBasedInspection<TElement>) -> Boolean, targetElement: TElement) defined in org.jetbrains.kotlin.idea.inspections.IntentionBasedInspection.IntentionBasedQuickFix[ClassConstructorDescriptorImpl]

'intention' @ [192:32] ==> value-parameter intention: SelfTargetingRangeIntention<TElement> defined in org.jetbrains.kotlin.idea.inspections.IntentionBasedInspection.LowPriorityIntentionBasedQuickFix.<init>[ValueParameterDescriptorImpl]

'additionalChecker' @ [192:43] ==> value-parameter additionalChecker: (TElement, IntentionBasedInspection<TElement>) -> Boolean defined in org.jetbrains.kotlin.idea.inspections.IntentionBasedInspection.LowPriorityIntentionBasedQuickFix.<init>[ValueParameterDescriptorImpl]

'targetElement' @ [192:62] ==> value-parameter targetElement: TElement defined in org.jetbrains.kotlin.idea.inspections.IntentionBasedInspection.LowPriorityIntentionBasedQuickFix.<init>[ValueParameterDescriptorImpl]

'IntentionBasedQuickFix' @ [198:9] ==> public constructor IntentionBasedQuickFix(intention: SelfTargetingRangeIntention<TElement>, additionalChecker: (TElement, IntentionBasedInspection<TElement>) -> Boolean, targetElement: TElement) defined in org.jetbrains.kotlin.idea.inspections.IntentionBasedInspection.IntentionBasedQuickFix[ClassConstructorDescriptorImpl]

'intention' @ [198:32] ==> value-parameter intention: SelfTargetingRangeIntention<TElement> defined in org.jetbrains.kotlin.idea.inspections.IntentionBasedInspection.HighPriorityIntentionBasedQuickFix.<init>[ValueParameterDescriptorImpl]

'additionalChecker' @ [198:43] ==> value-parameter additionalChecker: (TElement, IntentionBasedInspection<TElement>) -> Boolean defined in org.jetbrains.kotlin.idea.inspections.IntentionBasedInspection.HighPriorityIntentionBasedQuickFix.<init>[ValueParameterDescriptorImpl]

'targetElement' @ [198:62] ==> value-parameter targetElement: TElement defined in org.jetbrains.kotlin.idea.inspections.IntentionBasedInspection.HighPriorityIntentionBasedQuickFix.<init>[ValueParameterDescriptorImpl]

'containingFile' @ [202:16] ==> public final val PsiElement.containingFile: (PsiFile..PsiFile?)[MyPropertyDescriptor]

'virtualFile' @ [202:32] ==> public final val PsiFile.virtualFile: (VirtualFile..VirtualFile?)[MyPropertyDescriptor]

'?:' @ [203:20] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: Document?, right: Document): Document[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> Document

'getInstance' @ [203:40] ==> @NotNull public open fun getInstance(): FileDocumentManager defined in com.intellij.openapi.fileEditor.FileDocumentManager[JavaMethodDescriptor]

'getDocument' @ [203:54] ==> @Nullable public abstract fun getDocument(@NotNull p0: VirtualFile): Document? defined in com.intellij.openapi.fileEditor.FileDocumentManager[JavaMethodDescriptor]

'file' @ [203:66] ==> val file: VirtualFile defined in org.jetbrains.kotlin.idea.inspections.findExistingEditor[LocalVariableDescriptor]

'getInstance' @ [205:39] ==> public open fun getInstance(): (EditorFactory..EditorFactory?) defined in com.intellij.openapi.editor.EditorFactory[JavaMethodDescriptor]

'editorFactory' @ [207:19] ==> val editorFactory: (EditorFactory..EditorFactory?) defined in org.jetbrains.kotlin.idea.inspections.findExistingEditor[LocalVariableDescriptor]

'getEditors' @ [207:33] ==> @NotNull public abstract fun getEditors(@NotNull p0: Document): (Array<(Editor..Editor?)>..Array<out (Editor..Editor?)>) defined in com.intellij.openapi.editor.EditorFactory[JavaMethodDescriptor]

'document' @ [207:44] ==> val document: Document defined in org.jetbrains.kotlin.idea.inspections.findExistingEditor[LocalVariableDescriptor]

'if (editors.isEmpty()) null else editors[0]' @ [208:12] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Editor?, elseBranch: Editor?): Editor?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Editor?

'editors' @ [208:16] ==> val editors: (Array<(Editor..Editor?)>..Array<out (Editor..Editor?)>) defined in org.jetbrains.kotlin.idea.inspections.findExistingEditor[LocalVariableDescriptor]

'isEmpty' @ [208:24] ==> @InlineOnly public inline fun <T> Array<out (Editor..Editor?)>.isEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.openapi.editor.Editor..com.intellij.openapi.editor.Editor?)

'editors' @ [208:45] ==> val editors: (Array<(Editor..Editor?)>..Array<out (Editor..Editor?)>) defined in org.jetbrains.kotlin.idea.inspections.findExistingEditor[LocalVariableDescriptor]

