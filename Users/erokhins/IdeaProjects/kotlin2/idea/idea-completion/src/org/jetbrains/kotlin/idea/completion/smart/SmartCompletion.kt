'when (callTypeAndReceiver) {
        is CallTypeAndReceiver.DEFAULT ->
            expression

        is CallTypeAndReceiver.DOT,
        is CallTypeAndReceiver.SAFE,
        is CallTypeAndReceiver.SUPER_MEMBERS,
        is CallTypeAndReceiver.INFIX,
        is CallTypeAndReceiver.CALLABLE_REFERENCE ->
            expression.parent as KtExpression

        else -> // actually no smart completion for such places
            expression
    }' @ [69:38] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: KtExpression, entry1: KtExpression, entry2: KtExpression): KtExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> KtExpression

'callTypeAndReceiver' @ [69:44] ==> private final val callTypeAndReceiver: CallTypeAndReceiver<*, *> defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion[PropertyDescriptorImpl]

'expression' @ [71:13] ==> private final val expression: KtExpression defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion[PropertyDescriptorImpl]

'expression' @ [78:13] ==> private final val expression: KtExpression defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion[PropertyDescriptorImpl]

'parent' @ [78:24] ==> public final val KtExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'expression' @ [81:13] ==> private final val expression: KtExpression defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion[PropertyDescriptorImpl]

'calcExpectedInfos' @ [84:51] ==> private final fun calcExpectedInfos(expression: KtExpression): Collection<ExpectedInfo> defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion[SimpleFunctionDescriptorImpl]

'expressionWithType' @ [84:69] ==> private final val expressionWithType: KtExpression defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion[PropertyDescriptorImpl]

'expectedInfos' @ [86:44] ==> public final val expectedInfos: Collection<ExpectedInfo> defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion[PropertyDescriptorImpl]

'filterCallableExpected' @ [86:58] ==> public fun Collection<ExpectedInfo>.filterCallableExpected(): List<ExpectedInfo> defined in org.jetbrains.kotlin.idea.completion.smart in file Utils.kt[SimpleFunctionDescriptorImpl]

'getValue' @ [88:53] ==> @InlineOnly public operator inline fun <T> Lazy<T>.getValue(thisRef: Any?, property: KProperty<*>): T defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'NONE' @ [88:79] ==> enum entry NONE defined in kotlin.LazyThreadSafetyMode[FakeCallableDescriptorForObject]

'SmartCastCalculator' @ [89:9] ==> public constructor SmartCastCalculator(bindingContext: BindingContext, containingDeclarationOrModule: DeclarationDescriptor, contextElement: PsiElement, receiver: KtExpression?, resolutionFacade: ResolutionFacade) defined in org.jetbrains.kotlin.idea.core.SmartCastCalculator[DeserializedClassConstructorDescriptor]

'bindingContext' @ [89:29] ==> private final val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion[PropertyDescriptorImpl]

'resolutionFacade' @ [89:45] ==> private final val resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion[PropertyDescriptorImpl]

'moduleDescriptor' @ [89:62] ==> public abstract val moduleDescriptor: ModuleDescriptor defined in org.jetbrains.kotlin.idea.resolve.ResolutionFacade[DeserializedPropertyDescriptor]

'expression' @ [89:80] ==> private final val expression: KtExpression defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion[PropertyDescriptorImpl]

'callTypeAndReceiver' @ [89:92] ==> private final val callTypeAndReceiver: CallTypeAndReceiver<*, *> defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion[PropertyDescriptorImpl]

'receiver' @ [89:112] ==> public final val receiver: KtElement? defined in org.jetbrains.kotlin.idea.util.CallTypeAndReceiver[DeserializedPropertyDescriptor]

'resolutionFacade' @ [89:139] ==> private final val resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion[PropertyDescriptorImpl]

'filterDescriptor' @ [94:17] ==> private final fun filterDescriptor(descriptor: DeclarationDescriptor, lookupElementFactory: AbstractLookupElementFactory): Collection<LookupElement> defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion[SimpleFunctionDescriptorImpl]

'descriptor' @ [94:34] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.descriptorFilter.<anonymous>[ValueParameterDescriptorImpl]

'factory' @ [94:46] ==> value-parameter factory: AbstractLookupElementFactory defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.descriptorFilter.<anonymous>[ValueParameterDescriptorImpl]

'map' @ [94:55] ==> public inline fun <T, R> Iterable<LookupElement>.map(transform: (LookupElement) -> LookupElement): List<LookupElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> LookupElement
    <R> -> LookupElement

'postProcess' @ [94:61] ==> private final fun postProcess(item: LookupElement): LookupElement defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion[SimpleFunctionDescriptorImpl]

'it' @ [94:73] ==> value-parameter it: LookupElement defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.descriptorFilter.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'takeIf' @ [95:15] ==> @InlineOnly @SinceKotlin public inline fun <T> ((DeclarationDescriptor, AbstractLookupElementFactory) -> List<LookupElement>).takeIf(predicate: ((DeclarationDescriptor, AbstractLookupElementFactory) -> List<LookupElement>) -> Boolean): ((DeclarationDescriptor, AbstractLookupElementFactory) -> List<LookupElement>)? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Function2<DeclarationDescriptor, AbstractLookupElementFactory, List<LookupElement>>

'expectedInfos' @ [95:24] ==> public final val expectedInfos: Collection<ExpectedInfo> defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion[PropertyDescriptorImpl]

'isNotEmpty' @ [95:38] ==> @InlineOnly public inline fun <T> Collection<ExpectedInfo>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ExpectedInfo

'component1' @ [98:14] ==> public final operator fun component1(): Collection<LookupElement> defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [98:21] ==> public final operator fun component2(): InheritanceItemsSearcher? defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'additionalItemsNoPostProcess' @ [98:44] ==> private final fun additionalItemsNoPostProcess(lookupElementFactory: LookupElementFactory): Pair<Collection<LookupElement>, InheritanceItemsSearcher?> defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion[SimpleFunctionDescriptorImpl]

'lookupElementFactory' @ [98:73] ==> value-parameter lookupElementFactory: LookupElementFactory defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.additionalItems[ValueParameterDescriptorImpl]

'items' @ [99:34] ==> val items: Collection<LookupElement> defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.additionalItems[LocalVariableDescriptor]

'map' @ [99:40] ==> public inline fun <T, R> Iterable<LookupElement>.map(transform: (LookupElement) -> LookupElement): List<LookupElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> LookupElement
    <R> -> LookupElement

'postProcess' @ [99:46] ==> private final fun postProcess(item: LookupElement): LookupElement defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion[SimpleFunctionDescriptorImpl]

'it' @ [99:58] ==> value-parameter it: LookupElement defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.additionalItems.<anonymous>[ValueParameterDescriptorImpl]

'if (inheritanceSearcher != null)
            object : InheritanceItemsSearcher {
                override fun search(nameFilter: (String) -> Boolean, consumer: (LookupElement) -> Unit) {
                    inheritanceSearcher.search(nameFilter, { consumer(postProcess(it)) })
                }
            }
        else
            null' @ [101:37] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: <no name provided>?, elseBranch: <no name provided>?): <no name provided>?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> <no name provided>?

'inheritanceSearcher' @ [101:41] ==> val inheritanceSearcher: InheritanceItemsSearcher? defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.additionalItems[LocalVariableDescriptor]

'inheritanceSearcher' @ [104:21] ==> val inheritanceSearcher: InheritanceItemsSearcher? defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.additionalItems[LocalVariableDescriptor]

'search' @ [104:41] ==> public abstract fun search(nameFilter: (String) -> Boolean, consumer: (LookupElement) -> Unit): Unit defined in org.jetbrains.kotlin.idea.completion.smart.InheritanceItemsSearcher[SimpleFunctionDescriptorImpl]

'nameFilter' @ [104:48] ==> value-parameter nameFilter: (String) -> Boolean defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.additionalItems.<no name provided>.search[ValueParameterDescriptorImpl]

'invoke' @ [104:62] ==> public abstract operator fun invoke(p1: LookupElement): Unit defined in kotlin.Function1[FunctionInvokeDescriptor]

'postProcess' @ [104:71] ==> private final fun postProcess(item: LookupElement): LookupElement defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion[SimpleFunctionDescriptorImpl]

'it' @ [104:83] ==> value-parameter it: LookupElement defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.additionalItems.<no name provided>.search.<anonymous>[ValueParameterDescriptorImpl]

'postProcessedItems' @ [109:16] ==> val postProcessedItems: List<LookupElement> defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.additionalItems[LocalVariableDescriptor]

'postProcessedSearcher' @ [109:38] ==> val postProcessedSearcher: <no name provided>? defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.additionalItems[LocalVariableDescriptor]

'lazy' @ [112:58] ==> public fun <T> lazy(initializer: () -> Set<DeclarationDescriptor>): Lazy<Set<DeclarationDescriptor>> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Set<DeclarationDescriptor>

'expressionWithType' @ [113:22] ==> private final val expressionWithType: KtExpression defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion[PropertyDescriptorImpl]

'parent' @ [113:41] ==> public final val KtExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'when (parent) {
            is KtBinaryExpression -> {
                if (parent.right == expressionWithType) {
                    val operationToken = parent.operationToken
                    if (operationToken == KtTokens.EQ || operationToken in COMPARISON_TOKENS) {
                        val left = parent.left
                        if (left is KtReferenceExpression) {
                            return@lazy bindingContext[BindingContext.REFERENCE_TARGET, left]?.let(::setOf).orEmpty()
                        }
                    }
                }
            }

            is KtWhenConditionWithExpression -> {
                val entry = parent.parent as KtWhenEntry
                val whenExpression = entry.parent as KtWhenExpression
                val subject = whenExpression.subjectExpression ?: return@lazy emptySet()

                val descriptorsToSkip = HashSet<DeclarationDescriptor>()

                if (subject is KtSimpleNameExpression) {
                    val variable = bindingContext[BindingContext.REFERENCE_TARGET, subject] as? VariableDescriptor
                    if (variable != null) {
                        descriptorsToSkip.add(variable)
                    }
                }

                val subjectType = bindingContext.getType(subject) ?: return@lazy emptySet()
                val classDescriptor = TypeUtils.getClassDescriptor(subjectType)
                if (classDescriptor != null && DescriptorUtils.isEnumClass(classDescriptor)) {
                    val conditions = whenExpression.entries
                            .flatMap { it.conditions.toList() }
                            .filterIsInstance<KtWhenConditionWithExpression>()
                    for (condition in conditions) {
                        val selectorExpr = (condition.expression as? KtDotQualifiedExpression)
                                                   ?.selectorExpression as? KtReferenceExpression ?: continue
                        val target = bindingContext[BindingContext.REFERENCE_TARGET, selectorExpr] as? ClassDescriptor ?: continue
                        if (DescriptorUtils.isEnumEntry(target)) {
                            descriptorsToSkip.add(target)
                        }
                    }
                }

                return@lazy descriptorsToSkip
            }
        }' @ [114:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'parent' @ [114:15] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.descriptorsToSkip.<anonymous>[LocalVariableDescriptor]

'parent' @ [116:21] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.descriptorsToSkip.<anonymous>[LocalVariableDescriptor]

'right' @ [116:28] ==> public final val KtBinaryExpression.right: KtExpression?[MyPropertyDescriptor]

'expressionWithType' @ [116:37] ==> private final val expressionWithType: KtExpression defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion[PropertyDescriptorImpl]

'parent' @ [117:42] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.descriptorsToSkip.<anonymous>[LocalVariableDescriptor]

'operationToken' @ [117:49] ==> public final val KtBinaryExpression.operationToken: IElementType[MyPropertyDescriptor]

'operationToken' @ [118:25] ==> val operationToken: IElementType defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.descriptorsToSkip.<anonymous>[LocalVariableDescriptor]

'EQ' @ [118:52] ==> public final val EQ: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'operationToken' @ [118:58] ==> val operationToken: IElementType defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.descriptorsToSkip.<anonymous>[LocalVariableDescriptor]

'COMPARISON_TOKENS' @ [118:76] ==> public val COMPARISON_TOKENS: Set<(KtSingleValueToken..KtSingleValueToken?)> defined in org.jetbrains.kotlin.idea.core[DeserializedPropertyDescriptor]

'parent' @ [119:36] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.descriptorsToSkip.<anonymous>[LocalVariableDescriptor]

'left' @ [119:43] ==> public final val KtBinaryExpression.left: KtExpression?[MyPropertyDescriptor]

'left' @ [120:29] ==> val left: KtExpression? defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.descriptorsToSkip.<anonymous>[LocalVariableDescriptor]

'bindingContext' @ [121:41] ==> private final val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion[PropertyDescriptorImpl]

'REFERENCE_TARGET' @ [121:71] ==> public final val REFERENCE_TARGET: (WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>..WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'left' @ [121:89] ==> val left: KtExpression? defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.descriptorsToSkip.<anonymous>[LocalVariableDescriptor]

'let' @ [121:96] ==> @InlineOnly public inline fun <T, R> DeclarationDescriptor.let(block: (DeclarationDescriptor) -> Set<DeclarationDescriptor>): Set<DeclarationDescriptor> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor
    <R> -> Set<DeclarationDescriptor>

'setOf' @ [121:102] ==> public fun <T> setOf(element: DeclarationDescriptor): Set<DeclarationDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'orEmpty' @ [121:109] ==> @InlineOnly public inline fun <T> Set<DeclarationDescriptor>?.orEmpty(): Set<DeclarationDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'parent' @ [128:29] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.descriptorsToSkip.<anonymous>[LocalVariableDescriptor]

'parent' @ [128:36] ==> public final val KtWhenConditionWithExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'entry' @ [129:38] ==> val entry: KtWhenEntry defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.descriptorsToSkip.<anonymous>[LocalVariableDescriptor]

'parent' @ [129:44] ==> public final val KtWhenEntry.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'whenExpression' @ [130:31] ==> val whenExpression: KtWhenExpression defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.descriptorsToSkip.<anonymous>[LocalVariableDescriptor]

'subjectExpression' @ [130:46] ==> public final val KtWhenExpression.subjectExpression: KtExpression?[MyPropertyDescriptor]

'emptySet' @ [130:79] ==> public fun <T> emptySet(): Set<DeclarationDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'HashSet' @ [132:41] ==> public constructor HashSet<E : (Any..Any?)>() defined in java.util.HashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> DeclarationDescriptor

'subject' @ [134:21] ==> val subject: KtExpression defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.descriptorsToSkip.<anonymous>[LocalVariableDescriptor]

'bindingContext' @ [135:36] ==> private final val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion[PropertyDescriptorImpl]

'REFERENCE_TARGET' @ [135:66] ==> public final val REFERENCE_TARGET: (WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>..WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'subject' @ [135:84] ==> val subject: KtExpression defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.descriptorsToSkip.<anonymous>[LocalVariableDescriptor]

'variable' @ [136:25] ==> val variable: VariableDescriptor? defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.descriptorsToSkip.<anonymous>[LocalVariableDescriptor]

'descriptorsToSkip' @ [137:25] ==> val descriptorsToSkip: HashSet<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.descriptorsToSkip.<anonymous>[LocalVariableDescriptor]

'add' @ [137:43] ==> public open fun add(element: DeclarationDescriptor): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'variable' @ [137:47] ==> val variable: VariableDescriptor? defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.descriptorsToSkip.<anonymous>[LocalVariableDescriptor]

'bindingContext' @ [141:35] ==> private final val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion[PropertyDescriptorImpl]

'getType' @ [141:50] ==> @Nullable public abstract fun getType(@NotNull p0: KtExpression): KotlinType? defined in org.jetbrains.kotlin.resolve.BindingContext[JavaMethodDescriptor]

'subject' @ [141:58] ==> val subject: KtExpression defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.descriptorsToSkip.<anonymous>[LocalVariableDescriptor]

'emptySet' @ [141:82] ==> public fun <T> emptySet(): Set<DeclarationDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'getClassDescriptor' @ [142:49] ==> @Nullable public open fun getClassDescriptor(@NotNull p0: KotlinType): ClassDescriptor? defined in org.jetbrains.kotlin.types.TypeUtils[JavaMethodDescriptor]

'subjectType' @ [142:68] ==> val subjectType: KotlinType defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.descriptorsToSkip.<anonymous>[LocalVariableDescriptor]

'classDescriptor' @ [143:21] ==> val classDescriptor: ClassDescriptor? defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.descriptorsToSkip.<anonymous>[LocalVariableDescriptor]

'isEnumClass' @ [143:64] ==> public open fun isEnumClass(@Nullable p0: DeclarationDescriptor?): Boolean defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'classDescriptor' @ [143:76] ==> val classDescriptor: ClassDescriptor? defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.descriptorsToSkip.<anonymous>[LocalVariableDescriptor]

'whenExpression' @ [144:38] ==> val whenExpression: KtWhenExpression defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.descriptorsToSkip.<anonymous>[LocalVariableDescriptor]

'entries' @ [144:53] ==> public final val KtWhenExpression.entries: (MutableList<(KtWhenEntry..KtWhenEntry?)>..List<(KtWhenEntry..KtWhenEntry?)>)[MyPropertyDescriptor]

'flatMap' @ [145:30] ==> public inline fun <T, R> Iterable<(KtWhenEntry..KtWhenEntry?)>.flatMap(transform: ((KtWhenEntry..KtWhenEntry?)) -> Iterable<(KtWhenCondition..KtWhenCondition?)>): List<(KtWhenCondition..KtWhenCondition?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtWhenEntry..org.jetbrains.kotlin.psi.KtWhenEntry?)
    <R> -> (org.jetbrains.kotlin.psi.KtWhenCondition..org.jetbrains.kotlin.psi.KtWhenCondition?)

'it' @ [145:40] ==> value-parameter it: (KtWhenEntry..KtWhenEntry?) defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.descriptorsToSkip.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'conditions' @ [145:43] ==> public final val KtWhenEntry.conditions: (Array<(KtWhenCondition..KtWhenCondition?)>..Array<out (KtWhenCondition..KtWhenCondition?)>)[MyPropertyDescriptor]

'toList' @ [145:54] ==> public fun <T> Array<out (KtWhenCondition..KtWhenCondition?)>.toList(): List<(KtWhenCondition..KtWhenCondition?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtWhenCondition..org.jetbrains.kotlin.psi.KtWhenCondition?)

'filterIsInstance' @ [146:30] ==> public inline fun <reified R> Iterable<*>.filterIsInstance(): List<KtWhenConditionWithExpression> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> KtWhenConditionWithExpression

'conditions' @ [147:39] ==> val conditions: List<KtWhenConditionWithExpression> defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.descriptorsToSkip.<anonymous>[LocalVariableDescriptor]

'?:' @ [148:44] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: KtReferenceExpression?, right: KtReferenceExpression): KtReferenceExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> KtReferenceExpression

'condition' @ [148:45] ==> val condition: KtWhenConditionWithExpression defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.descriptorsToSkip.<anonymous>[LocalVariableDescriptor]

'expression' @ [148:55] ==> public final val KtWhenConditionWithExpression.expression: KtExpression?[MyPropertyDescriptor]

'selectorExpression' @ [149:54] ==> public open val selectorExpression: KtExpression? defined in org.jetbrains.kotlin.psi.KtDotQualifiedExpression[DeserializedPropertyDescriptor]

'bindingContext' @ [150:38] ==> private final val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion[PropertyDescriptorImpl]

'REFERENCE_TARGET' @ [150:68] ==> public final val REFERENCE_TARGET: (WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>..WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'selectorExpr' @ [150:86] ==> val selectorExpr: KtReferenceExpression defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.descriptorsToSkip.<anonymous>[LocalVariableDescriptor]

'isEnumEntry' @ [151:45] ==> public open fun isEnumEntry(@NotNull p0: DeclarationDescriptor): Boolean defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'target' @ [151:57] ==> val target: ClassDescriptor defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.descriptorsToSkip.<anonymous>[LocalVariableDescriptor]

'descriptorsToSkip' @ [152:29] ==> val descriptorsToSkip: HashSet<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.descriptorsToSkip.<anonymous>[LocalVariableDescriptor]

'add' @ [152:47] ==> public open fun add(element: DeclarationDescriptor): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'target' @ [152:51] ==> val target: ClassDescriptor defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.descriptorsToSkip.<anonymous>[LocalVariableDescriptor]

'descriptorsToSkip' @ [157:29] ==> val descriptorsToSkip: HashSet<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.descriptorsToSkip.<anonymous>[LocalVariableDescriptor]

'emptySet' @ [160:21] ==> public fun <T> emptySet(): Set<DeclarationDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'checkCanceled' @ [164:25] ==> public open fun checkCanceled(): Unit defined in com.intellij.openapi.progress.ProgressManager[JavaMethodDescriptor]

'descriptor' @ [165:13] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.filterDescriptor[ValueParameterDescriptorImpl]

'descriptorsToSkip' @ [165:27] ==> public final val descriptorsToSkip: Set<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion[PropertyDescriptorImpl]

'emptyList' @ [165:53] ==> public fun <T> emptyList(): List<LookupElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> LookupElement

'SmartList' @ [167:22] ==> public constructor SmartList<E : (Any..Any?)>() defined in com.intellij.util.SmartList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> LookupElement

'descriptor' @ [168:21] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.filterDescriptor[ValueParameterDescriptorImpl]

'fuzzyTypesForSmartCompletion' @ [168:32] ==> public fun DeclarationDescriptor.fuzzyTypesForSmartCompletion(smartCastCalculator: SmartCastCalculator, callTypeAndReceiver: CallTypeAndReceiver<*, *>, resolutionFacade: ResolutionFacade, bindingContext: BindingContext): Collection<FuzzyType> defined in org.jetbrains.kotlin.idea.completion.smart in file Utils.kt[SimpleFunctionDescriptorImpl]

'smartCastCalculator' @ [168:61] ==> public final val smartCastCalculator: SmartCastCalculator defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion[PropertyDescriptorImpl]

'callTypeAndReceiver' @ [168:82] ==> private final val callTypeAndReceiver: CallTypeAndReceiver<*, *> defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion[PropertyDescriptorImpl]

'resolutionFacade' @ [168:103] ==> private final val resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion[PropertyDescriptorImpl]

'bindingContext' @ [168:121] ==> private final val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion[PropertyDescriptorImpl]

'types' @ [169:59] ==> val types: Collection<FuzzyType> defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.filterDescriptor[LocalVariableDescriptor]

'matchExpectedInfo' @ [169:65] ==> public fun Collection<FuzzyType>.matchExpectedInfo(expectedInfo: ExpectedInfo): ExpectedInfoMatch defined in org.jetbrains.kotlin.idea.completion.smart in file Utils.kt[SimpleFunctionDescriptorImpl]

'expectedInfo' @ [169:83] ==> value-parameter expectedInfo: ExpectedInfo defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.filterDescriptor.<anonymous>[ValueParameterDescriptorImpl]

'result' @ [171:9] ==> val result: SmartList<LookupElement> defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.filterDescriptor[LocalVariableDescriptor]

'addLookupElements' @ [171:16] ==> public fun <TDescriptor : DeclarationDescriptor?> MutableCollection<LookupElement>.addLookupElements(descriptor: DeclarationDescriptor, expectedInfos: Collection<ExpectedInfo>, infoMatcher: (ExpectedInfo) -> ExpectedInfoMatch, noNameSimilarityForReturnItself: Boolean = ..., lookupElementFactory: (DeclarationDescriptor) -> Collection<LookupElement>): Unit defined in org.jetbrains.kotlin.idea.completion.smart[SimpleFunctionDescriptorImpl]
Inferred types:
    <TDescriptor : DeclarationDescriptor?> -> DeclarationDescriptor

'descriptor' @ [171:34] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.filterDescriptor[ValueParameterDescriptorImpl]

'expectedInfos' @ [171:46] ==> public final val expectedInfos: Collection<ExpectedInfo> defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion[PropertyDescriptorImpl]

'infoMatcher' @ [171:61] ==> val infoMatcher: (ExpectedInfo) -> ExpectedInfoMatch defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.filterDescriptor[LocalVariableDescriptor]

'callTypeAndReceiver' @ [171:108] ==> private final val callTypeAndReceiver: CallTypeAndReceiver<*, *> defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion[PropertyDescriptorImpl]

'lookupElementFactory' @ [172:13] ==> value-parameter lookupElementFactory: AbstractLookupElementFactory defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.filterDescriptor[ValueParameterDescriptorImpl]

'createStandardLookupElementsForDescriptor' @ [172:34] ==> public abstract fun createStandardLookupElementsForDescriptor(descriptor: DeclarationDescriptor, useReceiverTypes: Boolean): Collection<LookupElement> defined in org.jetbrains.kotlin.idea.completion.AbstractLookupElementFactory[SimpleFunctionDescriptorImpl]

'descriptor' @ [172:76] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.filterDescriptor.<anonymous>[ValueParameterDescriptorImpl]

'callTypeAndReceiver' @ [175:13] ==> private final val callTypeAndReceiver: CallTypeAndReceiver<*, *> defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion[PropertyDescriptorImpl]

'result' @ [176:13] ==> val result: SmartList<LookupElement> defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.filterDescriptor[LocalVariableDescriptor]

'addCallableReferenceLookupElements' @ [176:20] ==> private final fun MutableCollection<LookupElement>.addCallableReferenceLookupElements(descriptor: DeclarationDescriptor, lookupElementFactory: AbstractLookupElementFactory): Unit defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion[SimpleFunctionDescriptorImpl]

'descriptor' @ [176:55] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.filterDescriptor[ValueParameterDescriptorImpl]

'lookupElementFactory' @ [176:67] ==> value-parameter lookupElementFactory: AbstractLookupElementFactory defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.filterDescriptor[ValueParameterDescriptorImpl]

'result' @ [179:16] ==> val result: SmartList<LookupElement> defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.filterDescriptor[LocalVariableDescriptor]

'buildForAsTypePosition' @ [183:35] ==> private final fun buildForAsTypePosition(lookupElementFactory: BasicLookupElementFactory): Collection<LookupElement>? defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion[SimpleFunctionDescriptorImpl]

'lookupElementFactory' @ [183:58] ==> value-parameter lookupElementFactory: LookupElementFactory defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.additionalItemsNoPostProcess[ValueParameterDescriptorImpl]

'basicFactory' @ [183:79] ==> public final val basicFactory: BasicLookupElementFactory defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory[PropertyDescriptorImpl]

'asTypePositionItems' @ [184:13] ==> val asTypePositionItems: Collection<LookupElement>? defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.additionalItemsNoPostProcess[LocalVariableDescriptor]

'assert' @ [185:13] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'expectedInfos' @ [185:20] ==> public final val expectedInfos: Collection<ExpectedInfo> defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion[PropertyDescriptorImpl]

'isEmpty' @ [185:34] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.Collection[DeserializedSimpleFunctionDescriptor]

'Pair' @ [186:20] ==> public constructor Pair<out A, out B>(first: Collection<LookupElement>, second: Nothing?) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> Collection<LookupElement>
    <out B> -> Nothing?

'asTypePositionItems' @ [186:25] ==> val asTypePositionItems: Collection<LookupElement>? defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.additionalItemsNoPostProcess[LocalVariableDescriptor]

'ArrayList' @ [189:21] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> LookupElement

'ArrayList' @ [190:36] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> InheritanceItemsSearcher

'!' @ [192:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'forBasicCompletion' @ [192:14] ==> private final val forBasicCompletion: Boolean defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion[PropertyDescriptorImpl]

'items' @ [195:21] ==> val items: ArrayList<LookupElement> defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.additionalItemsNoPostProcess[LocalVariableDescriptor]

'addLookupElements' @ [195:27] ==> public fun <TDescriptor : DeclarationDescriptor?> MutableCollection<LookupElement>.addLookupElements(descriptor: Nothing?, expectedInfos: Collection<ExpectedInfo>, infoMatcher: (ExpectedInfo) -> ExpectedInfoMatch, noNameSimilarityForReturnItself: Boolean = ..., lookupElementFactory: (Nothing?) -> Collection<LookupElement>): Unit defined in org.jetbrains.kotlin.idea.completion.smart[SimpleFunctionDescriptorImpl]
Inferred types:
    <TDescriptor : DeclarationDescriptor?> -> Nothing?

'expectedInfos' @ [195:51] ==> public final val expectedInfos: Collection<ExpectedInfo> defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion[PropertyDescriptorImpl]

'expectedInfoMatcher' @ [195:66] ==> value-parameter expectedInfoMatcher: (ExpectedInfo) -> ExpectedInfoMatch defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.additionalItemsNoPostProcess.<no name provided>.consume[ValueParameterDescriptorImpl]

'invoke' @ [196:45] ==> public abstract operator fun invoke(): LookupElement defined in kotlin.Function0[FunctionInvokeDescriptor]

'lookupElement' @ [197:25] ==> val lookupElement: LookupElement defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.additionalItemsNoPostProcess.<no name provided>.consume.<anonymous>[LocalVariableDescriptor]

'putUserData' @ [197:39] ==> public open fun <T : (Any..Any?)> putUserData(@NotNull p0: Key<(SmartCompletionItemPriority..SmartCompletionItemPriority?)>, @Nullable p1: SmartCompletionItemPriority?): Unit defined in com.intellij.codeInsight.lookup.LookupElement[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (org.jetbrains.kotlin.idea.completion.smart.SmartCompletionItemPriority..org.jetbrains.kotlin.idea.completion.smart.SmartCompletionItemPriority?)

'SMART_COMPLETION_ITEM_PRIORITY_KEY' @ [197:51] ==> public val SMART_COMPLETION_ITEM_PRIORITY_KEY: Key<SmartCompletionItemPriority> defined in org.jetbrains.kotlin.idea.completion.smart in file Utils.kt[PropertyDescriptorImpl]

'priority' @ [197:87] ==> value-parameter priority: SmartCompletionItemPriority defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.additionalItemsNoPostProcess.<no name provided>.consume[ValueParameterDescriptorImpl]

'listOf' @ [198:25] ==> public fun <T> listOf(element: LookupElement): List<LookupElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> LookupElement

'lookupElement' @ [198:32] ==> val lookupElement: LookupElement defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.additionalItemsNoPostProcess.<no name provided>.consume.<anonymous>[LocalVariableDescriptor]

'KeywordValues' @ [202:13] ==> public object KeywordValues defined in org.jetbrains.kotlin.idea.completion in file KeywordValues.kt[FakeCallableDescriptorForObject]

'process' @ [202:27] ==> public final fun process(consumer: KeywordValues.Consumer, callTypeAndReceiver: CallTypeAndReceiver<*, *>, bindingContext: BindingContext, resolutionFacade: ResolutionFacade, moduleDescriptor: ModuleDescriptor, isJvmModule: Boolean): Unit defined in org.jetbrains.kotlin.idea.completion.KeywordValues[SimpleFunctionDescriptorImpl]

'keywordValueConsumer' @ [202:35] ==> val keywordValueConsumer: <no name provided> defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.additionalItemsNoPostProcess[LocalVariableDescriptor]

'callTypeAndReceiver' @ [202:57] ==> private final val callTypeAndReceiver: CallTypeAndReceiver<*, *> defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion[PropertyDescriptorImpl]

'bindingContext' @ [202:78] ==> private final val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion[PropertyDescriptorImpl]

'resolutionFacade' @ [202:94] ==> private final val resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion[PropertyDescriptorImpl]

'moduleDescriptor' @ [202:112] ==> private final val moduleDescriptor: ModuleDescriptor defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion[PropertyDescriptorImpl]

'isJvmModule' @ [202:130] ==> private final val isJvmModule: Boolean defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion[PropertyDescriptorImpl]

'expectedInfos' @ [205:13] ==> public final val expectedInfos: Collection<ExpectedInfo> defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion[PropertyDescriptorImpl]

'isNotEmpty' @ [205:27] ==> @InlineOnly public inline fun <T> Collection<ExpectedInfo>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ExpectedInfo

'!' @ [206:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'forBasicCompletion' @ [206:18] ==> private final val forBasicCompletion: Boolean defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion[PropertyDescriptorImpl]

'callTypeAndReceiver' @ [206:41] ==> private final val callTypeAndReceiver: CallTypeAndReceiver<*, *> defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion[PropertyDescriptorImpl]

'callTypeAndReceiver' @ [206:95] ==> private final val callTypeAndReceiver: CallTypeAndReceiver<*, *> defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion[PropertyDescriptorImpl]

'items' @ [207:17] ==> val items: ArrayList<LookupElement> defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.additionalItemsNoPostProcess[LocalVariableDescriptor]

'addThisItems' @ [207:23] ==> private final fun MutableCollection<LookupElement>.addThisItems(place: KtExpression, expectedInfos: Collection<ExpectedInfo>, smartCastCalculator: SmartCastCalculator): Unit defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion[SimpleFunctionDescriptorImpl]

'expression' @ [207:36] ==> private final val expression: KtExpression defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion[PropertyDescriptorImpl]

'expectedInfos' @ [207:48] ==> public final val expectedInfos: Collection<ExpectedInfo> defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion[PropertyDescriptorImpl]

'smartCastCalculator' @ [207:63] ==> public final val smartCastCalculator: SmartCastCalculator defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion[PropertyDescriptorImpl]

'callTypeAndReceiver' @ [210:17] ==> private final val callTypeAndReceiver: CallTypeAndReceiver<*, *> defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion[PropertyDescriptorImpl]

'TypeInstantiationItems' @ [211:17] ==> public constructor TypeInstantiationItems(resolutionFacade: ResolutionFacade, bindingContext: BindingContext, visibilityFilter: (DeclarationDescriptor) -> Boolean, toFromOriginalFileMapper: ToFromOriginalFileMapper, inheritorSearchScope: GlobalSearchScope, lookupElementFactory: LookupElementFactory, forOrdinaryCompletion: Boolean, indicesHelper: KotlinIndicesHelper) defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems[ClassConstructorDescriptorImpl]

'resolutionFacade' @ [211:40] ==> private final val resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion[PropertyDescriptorImpl]

'bindingContext' @ [211:58] ==> private final val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion[PropertyDescriptorImpl]

'visibilityFilter' @ [211:74] ==> private final val visibilityFilter: (DeclarationDescriptor) -> Boolean defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion[PropertyDescriptorImpl]

'toFromOriginalFileMapper' @ [211:92] ==> private final val toFromOriginalFileMapper: ToFromOriginalFileMapper defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion[PropertyDescriptorImpl]

'inheritorSearchScope' @ [211:118] ==> private final val inheritorSearchScope: GlobalSearchScope defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion[PropertyDescriptorImpl]

'lookupElementFactory' @ [211:140] ==> value-parameter lookupElementFactory: LookupElementFactory defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.additionalItemsNoPostProcess[ValueParameterDescriptorImpl]

'forBasicCompletion' @ [211:162] ==> private final val forBasicCompletion: Boolean defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion[PropertyDescriptorImpl]

'indicesHelper' @ [211:182] ==> private final val indicesHelper: KotlinIndicesHelper defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion[PropertyDescriptorImpl]

'addTo' @ [212:26] ==> public final fun addTo(items: MutableCollection<LookupElement>, inheritanceSearchers: MutableCollection<InheritanceItemsSearcher>, expectedInfos: Collection<ExpectedInfo>): Unit defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems[SimpleFunctionDescriptorImpl]

'items' @ [212:32] ==> val items: ArrayList<LookupElement> defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.additionalItemsNoPostProcess[LocalVariableDescriptor]

'inheritanceSearchers' @ [212:39] ==> val inheritanceSearchers: ArrayList<InheritanceItemsSearcher> defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.additionalItemsNoPostProcess[LocalVariableDescriptor]

'expectedInfos' @ [212:61] ==> public final val expectedInfos: Collection<ExpectedInfo> defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion[PropertyDescriptorImpl]

'expression' @ [214:21] ==> private final val expression: KtExpression defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion[PropertyDescriptorImpl]

'StaticMembers' @ [215:21] ==> public constructor StaticMembers(bindingContext: BindingContext, lookupElementFactory: LookupElementFactory, resolutionFacade: ResolutionFacade, moduleDescriptor: ModuleDescriptor) defined in org.jetbrains.kotlin.idea.completion.smart.StaticMembers[ClassConstructorDescriptorImpl]

'bindingContext' @ [215:35] ==> private final val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion[PropertyDescriptorImpl]

'lookupElementFactory' @ [215:51] ==> value-parameter lookupElementFactory: LookupElementFactory defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.additionalItemsNoPostProcess[ValueParameterDescriptorImpl]

'resolutionFacade' @ [215:73] ==> private final val resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion[PropertyDescriptorImpl]

'moduleDescriptor' @ [215:91] ==> private final val moduleDescriptor: ModuleDescriptor defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion[PropertyDescriptorImpl]

'addToCollection' @ [216:30] ==> public final fun addToCollection(collection: MutableCollection<LookupElement>, expectedInfos: Collection<ExpectedInfo>, context: KtSimpleNameExpression, enumEntriesToSkip: Set<DeclarationDescriptor>): Unit defined in org.jetbrains.kotlin.idea.completion.smart.StaticMembers[SimpleFunctionDescriptorImpl]

'items' @ [216:46] ==> val items: ArrayList<LookupElement> defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.additionalItemsNoPostProcess[LocalVariableDescriptor]

'expectedInfos' @ [216:53] ==> public final val expectedInfos: Collection<ExpectedInfo> defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion[PropertyDescriptorImpl]

'expression' @ [216:68] ==> private final val expression: KtExpression defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion[PropertyDescriptorImpl]

'descriptorsToSkip' @ [216:80] ==> public final val descriptorsToSkip: Set<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion[PropertyDescriptorImpl]

'ClassLiteralItems' @ [219:17] ==> public object ClassLiteralItems defined in org.jetbrains.kotlin.idea.completion.smart in file ClassLiteralItems.kt[FakeCallableDescriptorForObject]

'addToCollection' @ [219:35] ==> public final fun addToCollection(collection: MutableCollection<LookupElement>, expectedInfos: Collection<ExpectedInfo>, lookupElementFactory: BasicLookupElementFactory, isJvmModule: Boolean): Unit defined in org.jetbrains.kotlin.idea.completion.smart.ClassLiteralItems[SimpleFunctionDescriptorImpl]

'items' @ [219:51] ==> val items: ArrayList<LookupElement> defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.additionalItemsNoPostProcess[LocalVariableDescriptor]

'expectedInfos' @ [219:58] ==> public final val expectedInfos: Collection<ExpectedInfo> defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion[PropertyDescriptorImpl]

'lookupElementFactory' @ [219:73] ==> value-parameter lookupElementFactory: LookupElementFactory defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.additionalItemsNoPostProcess[ValueParameterDescriptorImpl]

'basicFactory' @ [219:94] ==> public final val basicFactory: BasicLookupElementFactory defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory[PropertyDescriptorImpl]

'isJvmModule' @ [219:108] ==> private final val isJvmModule: Boolean defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion[PropertyDescriptorImpl]

'items' @ [221:17] ==> val items: ArrayList<LookupElement> defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.additionalItemsNoPostProcess[LocalVariableDescriptor]

'addNamedArgumentsWithLiteralValueItems' @ [221:23] ==> private final fun MutableCollection<LookupElement>.addNamedArgumentsWithLiteralValueItems(expectedInfos: Collection<ExpectedInfo>): Unit defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion[SimpleFunctionDescriptorImpl]

'expectedInfos' @ [221:62] ==> public final val expectedInfos: Collection<ExpectedInfo> defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion[PropertyDescriptorImpl]

'LambdaSignatureItems' @ [223:17] ==> public object LambdaSignatureItems defined in org.jetbrains.kotlin.idea.completion.smart in file LambdaSignatureItems.kt[FakeCallableDescriptorForObject]

'addToCollection' @ [223:38] ==> public final fun addToCollection(collection: MutableCollection<LookupElement>, position: KtExpression, bindingContext: BindingContext, resolutionFacade: ResolutionFacade): Unit defined in org.jetbrains.kotlin.idea.completion.smart.LambdaSignatureItems[SimpleFunctionDescriptorImpl]

'items' @ [223:54] ==> val items: ArrayList<LookupElement> defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.additionalItemsNoPostProcess[LocalVariableDescriptor]

'expressionWithType' @ [223:61] ==> private final val expressionWithType: KtExpression defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion[PropertyDescriptorImpl]

'bindingContext' @ [223:81] ==> private final val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion[PropertyDescriptorImpl]

'resolutionFacade' @ [223:97] ==> private final val resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion[PropertyDescriptorImpl]

'!' @ [225:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'forBasicCompletion' @ [225:22] ==> private final val forBasicCompletion: Boolean defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion[PropertyDescriptorImpl]

'LambdaItems' @ [226:21] ==> public object LambdaItems defined in org.jetbrains.kotlin.idea.completion.smart in file LambdaItems.kt[FakeCallableDescriptorForObject]

'addToCollection' @ [226:33] ==> public final fun addToCollection(collection: MutableCollection<LookupElement>, expectedInfos: Collection<ExpectedInfo>): Unit defined in org.jetbrains.kotlin.idea.completion.smart.LambdaItems[SimpleFunctionDescriptorImpl]

'items' @ [226:49] ==> val items: ArrayList<LookupElement> defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.additionalItemsNoPostProcess[LocalVariableDescriptor]

'expectedInfos' @ [226:56] ==> public final val expectedInfos: Collection<ExpectedInfo> defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion[PropertyDescriptorImpl]

'expressionWithType' @ [228:41] ==> private final val expressionWithType: KtExpression defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion[PropertyDescriptorImpl]

'parent' @ [228:60] ==> public final val KtExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'whenCondition' @ [229:25] ==> val whenCondition: KtWhenConditionWithExpression? defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.additionalItemsNoPostProcess[LocalVariableDescriptor]

'whenCondition' @ [230:37] ==> val whenCondition: KtWhenConditionWithExpression? defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.additionalItemsNoPostProcess[LocalVariableDescriptor]

'parent' @ [230:51] ==> public final val KtWhenConditionWithExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'entry' @ [231:46] ==> val entry: KtWhenEntry defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.additionalItemsNoPostProcess[LocalVariableDescriptor]

'parent' @ [231:52] ==> public final val KtWhenEntry.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'whenExpression' @ [232:39] ==> val whenExpression: KtWhenExpression defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.additionalItemsNoPostProcess[LocalVariableDescriptor]

'entries' @ [232:54] ==> public final val KtWhenExpression.entries: (MutableList<(KtWhenEntry..KtWhenEntry?)>..List<(KtWhenEntry..KtWhenEntry?)>)[MyPropertyDescriptor]

'whenExpression' @ [233:29] ==> val whenExpression: KtWhenExpression defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.additionalItemsNoPostProcess[LocalVariableDescriptor]

'elseExpression' @ [233:44] ==> public final val KtWhenExpression.elseExpression: KtExpression?[MyPropertyDescriptor]

'entry' @ [233:70] ==> val entry: KtWhenEntry defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.additionalItemsNoPostProcess[LocalVariableDescriptor]

'entries' @ [233:79] ==> val entries: (MutableList<(KtWhenEntry..KtWhenEntry?)>..List<(KtWhenEntry..KtWhenEntry?)>) defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.additionalItemsNoPostProcess[LocalVariableDescriptor]

'last' @ [233:87] ==> public fun <T> List<(KtWhenEntry..KtWhenEntry?)>.last(): (KtWhenEntry..KtWhenEntry?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtWhenEntry..org.jetbrains.kotlin.psi.KtWhenEntry?)

'entries' @ [233:97] ==> val entries: (MutableList<(KtWhenEntry..KtWhenEntry?)>..List<(KtWhenEntry..KtWhenEntry?)>) defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.additionalItemsNoPostProcess[LocalVariableDescriptor]

'size' @ [233:105] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'create' @ [234:70] ==> @NotNull public open fun create(@NotNull p0: String): LookupElementBuilder defined in com.intellij.codeInsight.lookup.LookupElementBuilder[JavaMethodDescriptor]

'bold' @ [234:85] ==> @Contract public open fun bold(): (LookupElementBuilder..LookupElementBuilder?) defined in com.intellij.codeInsight.lookup.LookupElementBuilder[JavaMethodDescriptor]

'withTailText' @ [234:92] ==> @Contract public open fun withTailText(@Nullable p0: String?): (LookupElementBuilder..LookupElementBuilder?) defined in com.intellij.codeInsight.lookup.LookupElementBuilder[JavaMethodDescriptor]

'items' @ [235:29] ==> val items: ArrayList<LookupElement> defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.additionalItemsNoPostProcess[LocalVariableDescriptor]

'add' @ [235:35] ==> public open fun add(element: LookupElement): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'LookupElementDecorator<LookupElement>' @ [235:47] ==> protected/*protected and package*/ constructor LookupElementDecorator<T : (LookupElement..LookupElement?)>(p0: (LookupElement..LookupElement?)) defined in com.intellij.codeInsight.lookup.LookupElementDecorator[JavaClassConstructorDescriptor]
Inferred types:
    <T : (LookupElement..LookupElement?)> -> LookupElement

'lookupElement' @ [235:85] ==> val lookupElement: (LookupElementBuilder..LookupElementBuilder?) defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.additionalItemsNoPostProcess[LocalVariableDescriptor]

'WithTailInsertHandler' @ [237:37] ==> public constructor WithTailInsertHandler(tailText: String, spaceBefore: Boolean, spaceAfter: Boolean, overwriteText: Boolean = ...) defined in org.jetbrains.kotlin.idea.completion.handlers.WithTailInsertHandler[ClassConstructorDescriptorImpl]

'handleInsert' @ [237:104] ==> public open fun handleInsert(context: InsertionContext, item: LookupElement): Unit defined in org.jetbrains.kotlin.idea.completion.handlers.WithTailInsertHandler[SimpleFunctionDescriptorImpl]

'context' @ [237:117] ==> value-parameter context: InsertionContext defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.additionalItemsNoPostProcess.<no name provided>.handleInsert[ValueParameterDescriptorImpl]

'delegate' @ [237:126] ==> public final val <no name provided>.delegate: (LookupElement..LookupElement?)[MyPropertyDescriptor]

'MultipleArgumentsItemProvider' @ [244:17] ==> public constructor MultipleArgumentsItemProvider(bindingContext: BindingContext, smartCastCalculator: SmartCastCalculator, resolutionFacade: ResolutionFacade) defined in org.jetbrains.kotlin.idea.completion.smart.MultipleArgumentsItemProvider[ClassConstructorDescriptorImpl]

'bindingContext' @ [244:47] ==> private final val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion[PropertyDescriptorImpl]

'smartCastCalculator' @ [244:63] ==> public final val smartCastCalculator: SmartCastCalculator defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion[PropertyDescriptorImpl]

'resolutionFacade' @ [244:84] ==> private final val resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion[PropertyDescriptorImpl]

'addToCollection' @ [245:26] ==> public final fun addToCollection(collection: MutableCollection<LookupElement>, expectedInfos: Collection<ExpectedInfo>, context: KtExpression): Unit defined in org.jetbrains.kotlin.idea.completion.smart.MultipleArgumentsItemProvider[SimpleFunctionDescriptorImpl]

'items' @ [245:42] ==> val items: ArrayList<LookupElement> defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.additionalItemsNoPostProcess[LocalVariableDescriptor]

'expectedInfos' @ [245:49] ==> public final val expectedInfos: Collection<ExpectedInfo> defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion[PropertyDescriptorImpl]

'expression' @ [245:64] ==> private final val expression: KtExpression defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion[PropertyDescriptorImpl]

'if (inheritanceSearchers.isNotEmpty())
            object : InheritanceItemsSearcher {
                override fun search(nameFilter: (String) -> Boolean, consumer: (LookupElement) -> Unit) {
                    inheritanceSearchers.forEach { it.search(nameFilter, consumer) }
                }
            }
        else
            null' @ [249:35] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: <no name provided>?, elseBranch: <no name provided>?): <no name provided>?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> <no name provided>?

'inheritanceSearchers' @ [249:39] ==> val inheritanceSearchers: ArrayList<InheritanceItemsSearcher> defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.additionalItemsNoPostProcess[LocalVariableDescriptor]

'isNotEmpty' @ [249:60] ==> @InlineOnly public inline fun <T> Collection<InheritanceItemsSearcher>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> InheritanceItemsSearcher

'inheritanceSearchers' @ [252:21] ==> val inheritanceSearchers: ArrayList<InheritanceItemsSearcher> defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.additionalItemsNoPostProcess[LocalVariableDescriptor]

'forEach' @ [252:42] ==> @HidesMembers public inline fun <T> Iterable<InheritanceItemsSearcher>.forEach(action: (InheritanceItemsSearcher) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> InheritanceItemsSearcher

'it' @ [252:52] ==> value-parameter it: InheritanceItemsSearcher defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.additionalItemsNoPostProcess.<no name provided>.search.<anonymous>[ValueParameterDescriptorImpl]

'search' @ [252:55] ==> public abstract fun search(nameFilter: (String) -> Boolean, consumer: (LookupElement) -> Unit): Unit defined in org.jetbrains.kotlin.idea.completion.smart.InheritanceItemsSearcher[SimpleFunctionDescriptorImpl]

'nameFilter' @ [252:62] ==> value-parameter nameFilter: (String) -> Boolean defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.additionalItemsNoPostProcess.<no name provided>.search[ValueParameterDescriptorImpl]

'consumer' @ [252:74] ==> value-parameter consumer: (LookupElement) -> Unit defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.additionalItemsNoPostProcess.<no name provided>.search[ValueParameterDescriptorImpl]

'Pair' @ [258:16] ==> public constructor Pair<out A, out B>(first: ArrayList<LookupElement>, second: <no name provided>?) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> ArrayList<LookupElement>
    <out B> -> <no name provided>?

'items' @ [258:21] ==> val items: ArrayList<LookupElement> defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.additionalItemsNoPostProcess[LocalVariableDescriptor]

'inheritanceSearcher' @ [258:28] ==> val inheritanceSearcher: <no name provided>? defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.additionalItemsNoPostProcess[LocalVariableDescriptor]

'forBasicCompletion' @ [262:13] ==> private final val forBasicCompletion: Boolean defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion[PropertyDescriptorImpl]

'item' @ [262:40] ==> value-parameter item: LookupElement defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.postProcess[ValueParameterDescriptorImpl]

'if (item.getUserData(KEEP_OLD_ARGUMENT_LIST_ON_TAB_KEY) == null) {
            object : LookupElementDecorator<LookupElement>(item) {
                override fun handleInsert(context: InsertionContext) {
                    if (context.completionChar == Lookup.REPLACE_SELECT_CHAR) {
                        val offset = context.offsetMap.tryGetOffset(OLD_ARGUMENTS_REPLACEMENT_OFFSET)
                        if (offset != null) {
                            context.document.deleteString(context.tailOffset, offset)
                        }
                    }

                    super.handleInsert(context)
                }
            }
        }
        else {
            item
        }' @ [264:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: LookupElement, elseBranch: LookupElement): LookupElement[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> LookupElement

'item' @ [264:20] ==> value-parameter item: LookupElement defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.postProcess[ValueParameterDescriptorImpl]

'getUserData' @ [264:25] ==> public open fun <T : (Any..Any?)> getUserData(@NotNull p0: Key<(Unit..Unit?)>): Unit? defined in com.intellij.codeInsight.lookup.LookupElement[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.Unit..kotlin.Unit?)

'KEEP_OLD_ARGUMENT_LIST_ON_TAB_KEY' @ [264:37] ==> public val KEEP_OLD_ARGUMENT_LIST_ON_TAB_KEY: Key<Unit> defined in org.jetbrains.kotlin.idea.completion in file CompletionUtils.kt[PropertyDescriptorImpl]

'LookupElementDecorator<LookupElement>' @ [265:22] ==> protected/*protected and package*/ constructor LookupElementDecorator<T : (LookupElement..LookupElement?)>(p0: (LookupElement..LookupElement?)) defined in com.intellij.codeInsight.lookup.LookupElementDecorator[JavaClassConstructorDescriptor]
Inferred types:
    <T : (LookupElement..LookupElement?)> -> LookupElement

'item' @ [265:60] ==> value-parameter item: LookupElement defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.postProcess[ValueParameterDescriptorImpl]

'context' @ [267:25] ==> value-parameter context: InsertionContext defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.postProcess.<no name provided>.handleInsert[ValueParameterDescriptorImpl]

'completionChar' @ [267:33] ==> public final val InsertionContext.completionChar: Char[MyPropertyDescriptor]

'REPLACE_SELECT_CHAR' @ [267:58] ==> public const final val REPLACE_SELECT_CHAR: Char defined in com.intellij.codeInsight.lookup.Lookup[JavaPropertyDescriptor]

'context' @ [268:38] ==> value-parameter context: InsertionContext defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.postProcess.<no name provided>.handleInsert[ValueParameterDescriptorImpl]

'offsetMap' @ [268:46] ==> public final val InsertionContext.offsetMap: (OffsetMap..OffsetMap?)[MyPropertyDescriptor]

'tryGetOffset' @ [268:56] ==> public fun OffsetMap.tryGetOffset(key: OffsetKey): Int? defined in org.jetbrains.kotlin.idea.completion in file CompletionUtils.kt[SimpleFunctionDescriptorImpl]

'OLD_ARGUMENTS_REPLACEMENT_OFFSET' @ [268:69] ==> public final val OLD_ARGUMENTS_REPLACEMENT_OFFSET: OffsetKey defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.Companion[PropertyDescriptorImpl]

'offset' @ [269:29] ==> val offset: Int? defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.postProcess.<no name provided>.handleInsert[LocalVariableDescriptor]

'context' @ [270:29] ==> value-parameter context: InsertionContext defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.postProcess.<no name provided>.handleInsert[ValueParameterDescriptorImpl]

'document' @ [270:37] ==> public final val InsertionContext.document: Document[MyPropertyDescriptor]

'deleteString' @ [270:46] ==> public abstract fun deleteString(p0: Int, p1: Int): Unit defined in com.intellij.openapi.editor.Document[JavaMethodDescriptor]

'context' @ [270:59] ==> value-parameter context: InsertionContext defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.postProcess.<no name provided>.handleInsert[ValueParameterDescriptorImpl]

'tailOffset' @ [270:67] ==> public final var InsertionContext.tailOffset: Int[MyPropertyDescriptor]

'offset' @ [270:79] ==> val offset: Int? defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.postProcess.<no name provided>.handleInsert[LocalVariableDescriptor]

'super' @ [274:21] ==> <this> defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.postProcess.<no name provided>[LazyClassReceiverParameterDescriptor]

'handleInsert' @ [274:27] ==> public open fun handleInsert(p0: (InsertionContext..InsertionContext?)): Unit defined in com.intellij.codeInsight.lookup.LookupElementDecorator[JavaMethodDescriptor]

'context' @ [274:40] ==> value-parameter context: InsertionContext defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.postProcess.<no name provided>.handleInsert[ValueParameterDescriptorImpl]

'item' @ [279:13] ==> value-parameter item: LookupElement defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.postProcess[ValueParameterDescriptorImpl]

'shouldCompleteThisItems' @ [284:13] ==> public fun shouldCompleteThisItems(prefixMatcher: PrefixMatcher): Boolean defined in org.jetbrains.kotlin.idea.completion in file CompletionUtils.kt[SimpleFunctionDescriptorImpl]

'prefixMatcher' @ [284:37] ==> private final val prefixMatcher: PrefixMatcher defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion[PropertyDescriptorImpl]

'thisExpressionItems' @ [285:25] ==> public fun thisExpressionItems(bindingContext: BindingContext, position: KtExpression, prefix: String, resolutionFacade: ResolutionFacade): Collection<ThisItemLookupObject> defined in org.jetbrains.kotlin.idea.completion in file CompletionUtils.kt[SimpleFunctionDescriptorImpl]

'bindingContext' @ [285:45] ==> private final val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion[PropertyDescriptorImpl]

'place' @ [285:61] ==> value-parameter place: KtExpression defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.addThisItems[ValueParameterDescriptorImpl]

'prefixMatcher' @ [285:68] ==> private final val prefixMatcher: PrefixMatcher defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion[PropertyDescriptorImpl]

'prefix' @ [285:82] ==> public final val PrefixMatcher.prefix: String[MyPropertyDescriptor]

'resolutionFacade' @ [285:90] ==> private final val resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion[PropertyDescriptorImpl]

'items' @ [286:26] ==> val items: Collection<ThisItemLookupObject> defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.addThisItems[LocalVariableDescriptor]

'smartCastCalculator' @ [287:29] ==> value-parameter smartCastCalculator: SmartCastCalculator defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.addThisItems[ValueParameterDescriptorImpl]

'types' @ [287:49] ==> public final fun types(thisReceiverParameter: ReceiverParameterDescriptor): Collection<KotlinType> defined in org.jetbrains.kotlin.idea.core.SmartCastCalculator[DeserializedSimpleFunctionDescriptor]

'item' @ [287:55] ==> val item: ThisItemLookupObject defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.addThisItems[LocalVariableDescriptor]

'receiverParameter' @ [287:60] ==> public final val receiverParameter: ReceiverParameterDescriptor defined in org.jetbrains.kotlin.idea.completion.ThisItemLookupObject[PropertyDescriptorImpl]

'map' @ [287:79] ==> public inline fun <T, R> Iterable<KotlinType>.map(transform: (KotlinType) -> FuzzyType): List<FuzzyType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType
    <R> -> FuzzyType

'it' @ [287:85] ==> value-parameter it: KotlinType defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.addThisItems.<anonymous>[ValueParameterDescriptorImpl]

'toFuzzyType' @ [287:88] ==> public fun KotlinType.toFuzzyType(freeParameters: Collection<TypeParameterDescriptor>): FuzzyType defined in org.jetbrains.kotlin.idea.util[DeserializedSimpleFunctionDescriptor]

'emptyList' @ [287:100] ==> public fun <T> emptyList(): List<TypeParameterDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeParameterDescriptor

'types' @ [288:63] ==> val types: List<FuzzyType> defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.addThisItems[LocalVariableDescriptor]

'matchExpectedInfo' @ [288:69] ==> public fun Collection<FuzzyType>.matchExpectedInfo(expectedInfo: ExpectedInfo): ExpectedInfoMatch defined in org.jetbrains.kotlin.idea.completion.smart in file Utils.kt[SimpleFunctionDescriptorImpl]

'expectedInfo' @ [288:87] ==> value-parameter expectedInfo: ExpectedInfo defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.addThisItems.<anonymous>[ValueParameterDescriptorImpl]

'addLookupElements' @ [289:17] ==> public fun <TDescriptor : DeclarationDescriptor?> MutableCollection<LookupElement>.addLookupElements(descriptor: Nothing?, expectedInfos: Collection<ExpectedInfo>, infoMatcher: (ExpectedInfo) -> ExpectedInfoMatch, noNameSimilarityForReturnItself: Boolean = ..., lookupElementFactory: (Nothing?) -> Collection<LookupElement>): Unit defined in org.jetbrains.kotlin.idea.completion.smart[SimpleFunctionDescriptorImpl]
Inferred types:
    <TDescriptor : DeclarationDescriptor?> -> Nothing?

'expectedInfos' @ [289:41] ==> value-parameter expectedInfos: Collection<ExpectedInfo> defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.addThisItems[ValueParameterDescriptorImpl]

'matcher' @ [289:56] ==> val matcher: (ExpectedInfo) -> ExpectedInfoMatch defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.addThisItems[LocalVariableDescriptor]

'listOf' @ [290:21] ==> public fun <T> listOf(element: LookupElement): List<LookupElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> LookupElement

'item' @ [290:28] ==> val item: ThisItemLookupObject defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.addThisItems[LocalVariableDescriptor]

'createLookupElement' @ [290:33] ==> public fun ThisItemLookupObject.createLookupElement(): (LookupElementBuilder..LookupElementBuilder?) defined in org.jetbrains.kotlin.idea.completion in file CompletionUtils.kt[SimpleFunctionDescriptorImpl]

'assignSmartCompletionPriority' @ [290:55] ==> public fun LookupElement.assignSmartCompletionPriority(priority: SmartCompletionItemPriority): LookupElement defined in org.jetbrains.kotlin.idea.completion.smart in file Utils.kt[SimpleFunctionDescriptorImpl]

'THIS' @ [290:113] ==> enum entry THIS defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionItemPriority[FakeCallableDescriptorForObject]

'HashMap' @ [299:29] ==> public constructor HashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.HashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> NameAndValue
    <V : (Any..Any?)> -> MutableList<ExpectedInfo>

'nameAndValues' @ [302:13] ==> val nameAndValues: HashMap<NameAndValue, MutableList<ExpectedInfo>> defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.addNamedArgumentsWithLiteralValueItems[LocalVariableDescriptor]

'getOrPut' @ [302:27] ==> public inline fun <K, V> MutableMap<NameAndValue, MutableList<ExpectedInfo>>.getOrPut(key: NameAndValue, defaultValue: () -> MutableList<ExpectedInfo>): MutableList<ExpectedInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> NameAndValue
    <V> -> MutableList<ExpectedInfo>

'NameAndValue' @ [302:36] ==> public constructor NameAndValue(name: Name, value: String, priority: SmartCompletionItemPriority) defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.addNamedArgumentsWithLiteralValueItems.NameAndValue[ClassConstructorDescriptorImpl]

'name' @ [302:49] ==> value-parameter name: Name defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.addNamedArgumentsWithLiteralValueItems.addNameAndValue[ValueParameterDescriptorImpl]

'value' @ [302:55] ==> value-parameter value: String defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.addNamedArgumentsWithLiteralValueItems.addNameAndValue[ValueParameterDescriptorImpl]

'priority' @ [302:62] ==> value-parameter priority: SmartCompletionItemPriority defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.addNamedArgumentsWithLiteralValueItems.addNameAndValue[ValueParameterDescriptorImpl]

'ArrayList' @ [302:75] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> ExpectedInfo

'add' @ [302:89] ==> public abstract fun add(element: ExpectedInfo): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'expectedInfo' @ [302:93] ==> value-parameter expectedInfo: ExpectedInfo defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.addNamedArgumentsWithLiteralValueItems.addNameAndValue[ValueParameterDescriptorImpl]

'expectedInfos' @ [305:30] ==> value-parameter expectedInfos: Collection<ExpectedInfo> defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.addNamedArgumentsWithLiteralValueItems[ValueParameterDescriptorImpl]

'expectedInfo' @ [306:32] ==> val expectedInfo: ExpectedInfo defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.addNamedArgumentsWithLiteralValueItems[LocalVariableDescriptor]

'additionalData' @ [306:45] ==> public final val additionalData: ExpectedInfo.AdditionalData? defined in org.jetbrains.kotlin.idea.core.ExpectedInfo[DeserializedPropertyDescriptor]

'argumentData' @ [307:17] ==> val argumentData: ArgumentPositionData.Positional defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.addNamedArgumentsWithLiteralValueItems[LocalVariableDescriptor]

'namedArgumentCandidates' @ [307:30] ==> public final val namedArgumentCandidates: Collection<ParameterDescriptor> defined in org.jetbrains.kotlin.idea.core.ArgumentPositionData.Positional[DeserializedPropertyDescriptor]

'isEmpty' @ [307:54] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.Collection[DeserializedSimpleFunctionDescriptor]

'argumentData' @ [308:30] ==> val argumentData: ArgumentPositionData.Positional defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.addNamedArgumentsWithLiteralValueItems[LocalVariableDescriptor]

'function' @ [308:43] ==> public final val function: FunctionDescriptor defined in org.jetbrains.kotlin.idea.core.ArgumentPositionData.Positional[DeserializedPropertyDescriptor]

'valueParameters' @ [308:52] ==> public final val FunctionDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'argumentData' @ [309:17] ==> val argumentData: ArgumentPositionData.Positional defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.addNamedArgumentsWithLiteralValueItems[LocalVariableDescriptor]

'argumentIndex' @ [309:30] ==> public final val argumentIndex: Int defined in org.jetbrains.kotlin.idea.core.ArgumentPositionData.Positional[DeserializedPropertyDescriptor]

'parameters' @ [309:47] ==> val parameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>) defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.addNamedArgumentsWithLiteralValueItems[LocalVariableDescriptor]

'size' @ [309:58] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'parameters' @ [310:33] ==> val parameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>) defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.addNamedArgumentsWithLiteralValueItems[LocalVariableDescriptor]

'argumentData' @ [310:44] ==> val argumentData: ArgumentPositionData.Positional defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.addNamedArgumentsWithLiteralValueItems[LocalVariableDescriptor]

'argumentIndex' @ [310:57] ==> public final val argumentIndex: Int defined in org.jetbrains.kotlin.idea.core.ArgumentPositionData.Positional[DeserializedPropertyDescriptor]

'name' @ [310:72] ==> public final val ValueParameterDescriptor.name: Name[MyPropertyDescriptor]

'expectedInfo' @ [312:17] ==> val expectedInfo: ExpectedInfo defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.addNamedArgumentsWithLiteralValueItems[LocalVariableDescriptor]

'fuzzyType' @ [312:30] ==> public val ExpectedInfo.fuzzyType: FuzzyType? defined in org.jetbrains.kotlin.idea.core[DeserializedPropertyDescriptor]

'type' @ [312:41] ==> public final val type: KotlinType defined in org.jetbrains.kotlin.idea.util.FuzzyType[DeserializedPropertyDescriptor]

'isBooleanOrNullableBoolean' @ [312:47] ==> public fun KotlinType.isBooleanOrNullableBoolean(): Boolean defined in org.jetbrains.kotlin.types.typeUtil[DeserializedSimpleFunctionDescriptor]

'addNameAndValue' @ [313:17] ==> local final fun addNameAndValue(name: Name, value: String, priority: SmartCompletionItemPriority, expectedInfo: ExpectedInfo): Unit defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.addNamedArgumentsWithLiteralValueItems[SimpleFunctionDescriptorImpl]

'parameterName' @ [313:33] ==> val parameterName: Name defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.addNamedArgumentsWithLiteralValueItems[LocalVariableDescriptor]

'NAMED_ARGUMENT_TRUE' @ [313:84] ==> enum entry NAMED_ARGUMENT_TRUE defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionItemPriority[FakeCallableDescriptorForObject]

'expectedInfo' @ [313:105] ==> val expectedInfo: ExpectedInfo defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.addNamedArgumentsWithLiteralValueItems[LocalVariableDescriptor]

'addNameAndValue' @ [314:17] ==> local final fun addNameAndValue(name: Name, value: String, priority: SmartCompletionItemPriority, expectedInfo: ExpectedInfo): Unit defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.addNamedArgumentsWithLiteralValueItems[SimpleFunctionDescriptorImpl]

'parameterName' @ [314:33] ==> val parameterName: Name defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.addNamedArgumentsWithLiteralValueItems[LocalVariableDescriptor]

'NAMED_ARGUMENT_FALSE' @ [314:85] ==> enum entry NAMED_ARGUMENT_FALSE defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionItemPriority[FakeCallableDescriptorForObject]

'expectedInfo' @ [314:107] ==> val expectedInfo: ExpectedInfo defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.addNamedArgumentsWithLiteralValueItems[LocalVariableDescriptor]

'expectedInfo' @ [316:17] ==> val expectedInfo: ExpectedInfo defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.addNamedArgumentsWithLiteralValueItems[LocalVariableDescriptor]

'fuzzyType' @ [316:30] ==> public val ExpectedInfo.fuzzyType: FuzzyType? defined in org.jetbrains.kotlin.idea.core[DeserializedPropertyDescriptor]

'type' @ [316:41] ==> public final val type: KotlinType defined in org.jetbrains.kotlin.idea.util.FuzzyType[DeserializedPropertyDescriptor]

'isMarkedNullable' @ [316:47] ==> public abstract val isMarkedNullable: Boolean defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'addNameAndValue' @ [317:17] ==> local final fun addNameAndValue(name: Name, value: String, priority: SmartCompletionItemPriority, expectedInfo: ExpectedInfo): Unit defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.addNamedArgumentsWithLiteralValueItems[SimpleFunctionDescriptorImpl]

'parameterName' @ [317:33] ==> val parameterName: Name defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.addNamedArgumentsWithLiteralValueItems[LocalVariableDescriptor]

'NAMED_ARGUMENT_NULL' @ [317:84] ==> enum entry NAMED_ARGUMENT_NULL defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionItemPriority[FakeCallableDescriptorForObject]

'expectedInfo' @ [317:105] ==> val expectedInfo: ExpectedInfo defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.addNamedArgumentsWithLiteralValueItems[LocalVariableDescriptor]

'component1' @ [321:15] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<NameAndValue, MutableList<ExpectedInfo>>.component1(): NameAndValue defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> NameAndValue
    <V> -> MutableList<ExpectedInfo>

'component2' @ [321:29] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<NameAndValue, MutableList<ExpectedInfo>>.component2(): MutableList<ExpectedInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> NameAndValue
    <V> -> MutableList<ExpectedInfo>

'nameAndValues' @ [321:39] ==> val nameAndValues: HashMap<NameAndValue, MutableList<ExpectedInfo>> defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.addNamedArgumentsWithLiteralValueItems[LocalVariableDescriptor]

'createNamedArgumentWithValueLookupElement' @ [322:33] ==> private final fun createNamedArgumentWithValueLookupElement(name: Name, value: String, priority: SmartCompletionItemPriority): LookupElement defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion[SimpleFunctionDescriptorImpl]

'nameAndValue' @ [322:75] ==> val nameAndValue: NameAndValue defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.addNamedArgumentsWithLiteralValueItems[LocalVariableDescriptor]

'name' @ [322:88] ==> public final val name: Name defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.addNamedArgumentsWithLiteralValueItems.NameAndValue[PropertyDescriptorImpl]

'nameAndValue' @ [322:94] ==> val nameAndValue: NameAndValue defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.addNamedArgumentsWithLiteralValueItems[LocalVariableDescriptor]

'value' @ [322:107] ==> public final val value: String defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.addNamedArgumentsWithLiteralValueItems.NameAndValue[PropertyDescriptorImpl]

'nameAndValue' @ [322:114] ==> val nameAndValue: NameAndValue defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.addNamedArgumentsWithLiteralValueItems[LocalVariableDescriptor]

'priority' @ [322:127] ==> public final val priority: SmartCompletionItemPriority defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.addNamedArgumentsWithLiteralValueItems.NameAndValue[PropertyDescriptorImpl]

'lookupElement' @ [323:13] ==> var lookupElement: LookupElement defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.addNamedArgumentsWithLiteralValueItems[LocalVariableDescriptor]

'lookupElement' @ [323:29] ==> var lookupElement: LookupElement defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.addNamedArgumentsWithLiteralValueItems[LocalVariableDescriptor]

'addTail' @ [323:43] ==> public fun LookupElement.addTail(tail: Tail?): LookupElement defined in org.jetbrains.kotlin.idea.completion.smart in file Utils.kt[SimpleFunctionDescriptorImpl]

'mergeTails' @ [323:51] ==> public fun mergeTails(tails: Collection<Tail?>): Tail? defined in org.jetbrains.kotlin.idea.completion.smart in file Utils.kt[SimpleFunctionDescriptorImpl]

'infos' @ [323:62] ==> val infos: MutableList<ExpectedInfo> defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.addNamedArgumentsWithLiteralValueItems[LocalVariableDescriptor]

'map' @ [323:68] ==> public inline fun <T, R> Iterable<ExpectedInfo>.map(transform: (ExpectedInfo) -> Tail?): List<Tail?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ExpectedInfo
    <R> -> Tail?

'it' @ [323:74] ==> value-parameter it: ExpectedInfo defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.addNamedArgumentsWithLiteralValueItems.<anonymous>[ValueParameterDescriptorImpl]

'tail' @ [323:77] ==> public final val tail: Tail? defined in org.jetbrains.kotlin.idea.core.ExpectedInfo[DeserializedPropertyDescriptor]

'add' @ [324:13] ==> public abstract fun add(element: LookupElement): Boolean defined in kotlin.collections.MutableCollection[DeserializedSimpleFunctionDescriptor]

'lookupElement' @ [324:17] ==> var lookupElement: LookupElement defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.addNamedArgumentsWithLiteralValueItems[LocalVariableDescriptor]

'create' @ [329:50] ==> @NotNull public open fun create(@NotNull p0: String): LookupElementBuilder defined in com.intellij.codeInsight.lookup.LookupElementBuilder[JavaMethodDescriptor]

'name' @ [329:60] ==> value-parameter name: Name defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.createNamedArgumentWithValueLookupElement[ValueParameterDescriptorImpl]

'asString' @ [329:65] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'value' @ [329:80] ==> value-parameter value: String defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.createNamedArgumentWithValueLookupElement[ValueParameterDescriptorImpl]

'withIcon' @ [330:18] ==> @Contract public open fun withIcon(@Nullable p0: Icon?): (LookupElementBuilder..LookupElementBuilder?) defined in com.intellij.codeInsight.lookup.LookupElementBuilder[JavaMethodDescriptor]

'PARAMETER' @ [330:39] ==> public final val PARAMETER: (Icon..Icon?) defined in org.jetbrains.kotlin.idea.KotlinIcons[JavaPropertyDescriptor]

'withInsertHandler' @ [331:18] ==> @Contract public final fun withInsertHandler(@Nullable p0: (((InsertionContext..InsertionContext?), (LookupElement..LookupElement?)) -> Unit)?): (LookupElementBuilder..LookupElementBuilder?) defined in com.intellij.codeInsight.lookup.LookupElementBuilder[MyFunctionDescriptor]

'context' @ [331:52] ==> value-parameter context: (InsertionContext..InsertionContext?) defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.createNamedArgumentWithValueLookupElement.<anonymous>[ValueParameterDescriptorImpl]

'document' @ [331:60] ==> public final val InsertionContext.document: Document[MyPropertyDescriptor]

'replaceString' @ [331:69] ==> public abstract fun replaceString(p0: Int, p1: Int, @NotNull p2: CharSequence): Unit defined in com.intellij.openapi.editor.Document[JavaMethodDescriptor]

'context' @ [331:83] ==> value-parameter context: (InsertionContext..InsertionContext?) defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.createNamedArgumentWithValueLookupElement.<anonymous>[ValueParameterDescriptorImpl]

'startOffset' @ [331:91] ==> public final val InsertionContext.startOffset: Int[MyPropertyDescriptor]

'context' @ [331:104] ==> value-parameter context: (InsertionContext..InsertionContext?) defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.createNamedArgumentWithValueLookupElement.<anonymous>[ValueParameterDescriptorImpl]

'tailOffset' @ [331:112] ==> public final var InsertionContext.tailOffset: Int[MyPropertyDescriptor]

'name' @ [331:127] ==> value-parameter name: Name defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.createNamedArgumentWithValueLookupElement[ValueParameterDescriptorImpl]

'render' @ [331:132] ==> public fun Name.render(): String defined in org.jetbrains.kotlin.renderer[DeserializedSimpleFunctionDescriptor]

'value' @ [331:145] ==> value-parameter value: String defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.createNamedArgumentWithValueLookupElement[ValueParameterDescriptorImpl]

'lookupElement' @ [332:9] ==> val lookupElement: (LookupElementBuilder..LookupElementBuilder?) defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.createNamedArgumentWithValueLookupElement[LocalVariableDescriptor]

'putUserData' @ [332:23] ==> public open fun <T : (Any..Any?)> putUserData(@NotNull p0: Key<(Unit..Unit?)>, @Nullable p1: Unit?): Unit defined in com.intellij.codeInsight.lookup.LookupElementBuilder[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.Unit..kotlin.Unit?)

'NAMED_ARGUMENT_KEY' @ [332:65] ==> public final val NAMED_ARGUMENT_KEY: Key<Unit> defined in org.jetbrains.kotlin.idea.completion.SmartCompletionInBasicWeigher.Companion[PropertyDescriptorImpl]

'Unit' @ [332:85] ==> public object Unit defined in kotlin[FakeCallableDescriptorForObject]

'lookupElement' @ [333:9] ==> val lookupElement: (LookupElementBuilder..LookupElementBuilder?) defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.createNamedArgumentWithValueLookupElement[LocalVariableDescriptor]

'assignSmartCompletionPriority' @ [333:23] ==> public fun LookupElement.assignSmartCompletionPriority(priority: SmartCompletionItemPriority): LookupElement defined in org.jetbrains.kotlin.idea.completion.smart in file Utils.kt[SimpleFunctionDescriptorImpl]

'priority' @ [333:53] ==> value-parameter priority: SmartCompletionItemPriority defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.createNamedArgumentWithValueLookupElement[ValueParameterDescriptorImpl]

'lookupElement' @ [334:16] ==> val lookupElement: (LookupElementBuilder..LookupElementBuilder?) defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.createNamedArgumentWithValueLookupElement[LocalVariableDescriptor]

'implicitlyTypedDeclarationFromInitializer' @ [339:27] ==> private final fun implicitlyTypedDeclarationFromInitializer(expression: KtExpression): KtDeclaration? defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion[SimpleFunctionDescriptorImpl]

'expression' @ [339:69] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.calcExpectedInfos[ValueParameterDescriptorImpl]

'declaration' @ [340:13] ==> val declaration: KtDeclaration? defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.calcExpectedInfos[LocalVariableDescriptor]

'toFromOriginalFileMapper' @ [341:39] ==> private final val toFromOriginalFileMapper: ToFromOriginalFileMapper defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion[PropertyDescriptorImpl]

'toOriginalFile' @ [341:64] ==> public final fun <TElement : PsiElement> toOriginalFile(element: KtDeclaration): KtDeclaration? defined in org.jetbrains.kotlin.idea.completion.ToFromOriginalFileMapper[SimpleFunctionDescriptorImpl]
Inferred types:
    <TElement : PsiElement> -> KtDeclaration

'declaration' @ [341:79] ==> val declaration: KtDeclaration? defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.calcExpectedInfos[LocalVariableDescriptor]

'originalDeclaration' @ [342:17] ==> val originalDeclaration: KtDeclaration? defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.calcExpectedInfos[LocalVariableDescriptor]

'originalDeclaration' @ [343:42] ==> val originalDeclaration: KtDeclaration? defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.calcExpectedInfos[LocalVariableDescriptor]

'resolveToDescriptor' @ [343:62] ==> public fun KtDeclaration.resolveToDescriptor(bodyResolveMode: BodyResolveMode = ...): DeclarationDescriptor defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'PARTIAL' @ [343:98] ==> enum entry PARTIAL defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'originalDescriptor' @ [344:34] ==> val originalDescriptor: CallableDescriptor? defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.calcExpectedInfos[LocalVariableDescriptor]

'returnType' @ [344:54] ==> public final val CallableDescriptor.returnType: KotlinType?[MyPropertyDescriptor]

'returnType' @ [345:21] ==> val returnType: KotlinType? defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.calcExpectedInfos[LocalVariableDescriptor]

'!' @ [345:43] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'returnType' @ [345:44] ==> val returnType: KotlinType? defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.calcExpectedInfos[LocalVariableDescriptor]

'isError' @ [345:55] ==> public val KotlinType.isError: Boolean defined in org.jetbrains.kotlin.types[DeserializedPropertyDescriptor]

'listOf' @ [346:28] ==> public fun <T> listOf(element: ExpectedInfo): List<ExpectedInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ExpectedInfo

'ExpectedInfo' @ [346:35] ==> public constructor ExpectedInfo(type: KotlinType, expectedName: String?, tail: Tail?, itemOptions: ItemOptions = ..., additionalData: ExpectedInfo.AdditionalData? = ...) defined in org.jetbrains.kotlin.idea.core.ExpectedInfo[DeserializedClassConstructorDescriptor]

'returnType' @ [346:48] ==> val returnType: KotlinType? defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.calcExpectedInfos[LocalVariableDescriptor]

'declaration' @ [346:60] ==> val declaration: KtDeclaration? defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.calcExpectedInfos[LocalVariableDescriptor]

'name' @ [346:72] ==> public final val KtDeclaration.name: String?[MyPropertyDescriptor]

'ExpectedInfos' @ [354:25] ==> public constructor ExpectedInfos(bindingContext: BindingContext, resolutionFacade: ResolutionFacade, indicesHelper: KotlinIndicesHelper?, useHeuristicSignatures: Boolean = ..., useOuterCallsExpectedTypeCount: Int = ...) defined in org.jetbrains.kotlin.idea.core.ExpectedInfos[DeserializedClassConstructorDescriptor]

'bindingContext' @ [354:39] ==> private final val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion[PropertyDescriptorImpl]

'resolutionFacade' @ [354:55] ==> private final val resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion[PropertyDescriptorImpl]

'indicesHelper' @ [354:73] ==> private final val indicesHelper: KotlinIndicesHelper defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion[PropertyDescriptorImpl]

'count' @ [354:121] ==> var count: Int defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.calcExpectedInfos[LocalVariableDescriptor]

'calculate' @ [355:22] ==> public final fun calculate(expressionWithType: KtExpression): Collection<ExpectedInfo> defined in org.jetbrains.kotlin.idea.core.ExpectedInfos[DeserializedSimpleFunctionDescriptor]

'expression' @ [355:32] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.calcExpectedInfos[ValueParameterDescriptorImpl]

'count' @ [356:17] ==> var count: Int defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.calcExpectedInfos[LocalVariableDescriptor]

'infos' @ [356:65] ==> val infos: Collection<ExpectedInfo> defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.calcExpectedInfos[LocalVariableDescriptor]

'none' @ [356:71] ==> public inline fun <T> Iterable<ExpectedInfo>.none(predicate: (ExpectedInfo) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ExpectedInfo

'it' @ [356:78] ==> value-parameter it: ExpectedInfo defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.calcExpectedInfos.<anonymous>[ValueParameterDescriptorImpl]

'fuzzyType' @ [356:81] ==> public val ExpectedInfo.fuzzyType: FuzzyType? defined in org.jetbrains.kotlin.idea.core[DeserializedPropertyDescriptor]

'isAlmostEverything' @ [356:92] ==> public fun FuzzyType.isAlmostEverything(): Boolean defined in org.jetbrains.kotlin.idea.util[DeserializedSimpleFunctionDescriptor]

'if (forBasicCompletion)
                    infos.map { it.copy(tail = null) }
                else
                    infos' @ [357:24] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Collection<ExpectedInfo>, elseBranch: Collection<ExpectedInfo>): Collection<ExpectedInfo>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Collection<ExpectedInfo>

'forBasicCompletion' @ [357:28] ==> private final val forBasicCompletion: Boolean defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion[PropertyDescriptorImpl]

'infos' @ [358:21] ==> val infos: Collection<ExpectedInfo> defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.calcExpectedInfos[LocalVariableDescriptor]

'map' @ [358:27] ==> public inline fun <T, R> Iterable<ExpectedInfo>.map(transform: (ExpectedInfo) -> ExpectedInfo): List<ExpectedInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ExpectedInfo
    <R> -> ExpectedInfo

'it' @ [358:33] ==> value-parameter it: ExpectedInfo defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.calcExpectedInfos.<anonymous>[ValueParameterDescriptorImpl]

'copy' @ [358:36] ==> public final fun copy(filter: ByTypeFilter = ..., expectedName: String? = ..., tail: Tail? = ..., itemOptions: ItemOptions = ..., additionalData: ExpectedInfo.AdditionalData? = ...): ExpectedInfo defined in org.jetbrains.kotlin.idea.core.ExpectedInfo[DeserializedSimpleFunctionDescriptor]

'infos' @ [360:21] ==> val infos: Collection<ExpectedInfo> defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.calcExpectedInfos[LocalVariableDescriptor]

'count' @ [362:13] ==> var count: Int defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.calcExpectedInfos[LocalVariableDescriptor]

'expression' @ [368:22] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.implicitlyTypedDeclarationFromInitializer[ValueParameterDescriptorImpl]

'parent' @ [368:33] ==> public final val KtExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'when (parent) {
            is KtVariableDeclaration -> if (expression == parent.initializer && parent.typeReference == null) return parent
            is KtNamedFunction -> if (expression == parent.initializer && parent.typeReference == null) return parent
        }' @ [369:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'parent' @ [369:15] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.implicitlyTypedDeclarationFromInitializer[LocalVariableDescriptor]

'expression' @ [370:45] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.implicitlyTypedDeclarationFromInitializer[ValueParameterDescriptorImpl]

'parent' @ [370:59] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.implicitlyTypedDeclarationFromInitializer[LocalVariableDescriptor]

'initializer' @ [370:66] ==> public final val KtVariableDeclaration.initializer: KtExpression?[MyPropertyDescriptor]

'parent' @ [370:81] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.implicitlyTypedDeclarationFromInitializer[LocalVariableDescriptor]

'typeReference' @ [370:88] ==> public final var KtVariableDeclaration.typeReference: KtTypeReference?[MyPropertyDescriptor]

'parent' @ [370:118] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.implicitlyTypedDeclarationFromInitializer[LocalVariableDescriptor]

'expression' @ [371:39] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.implicitlyTypedDeclarationFromInitializer[ValueParameterDescriptorImpl]

'parent' @ [371:53] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.implicitlyTypedDeclarationFromInitializer[LocalVariableDescriptor]

'initializer' @ [371:60] ==> public final val KtNamedFunction.initializer: KtExpression?[MyPropertyDescriptor]

'parent' @ [371:75] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.implicitlyTypedDeclarationFromInitializer[LocalVariableDescriptor]

'typeReference' @ [371:82] ==> public final var KtNamedFunction.typeReference: KtTypeReference?[MyPropertyDescriptor]

'parent' @ [371:112] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.implicitlyTypedDeclarationFromInitializer[LocalVariableDescriptor]

'callableTypeExpectedInfo' @ [377:13] ==> private final val callableTypeExpectedInfo: List<ExpectedInfo> defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion[PropertyDescriptorImpl]

'isEmpty' @ [377:38] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [380:41] ==> value-parameter descriptor: CallableDescriptor defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.addCallableReferenceLookupElements.toLookupElement[ValueParameterDescriptorImpl]

'callableReferenceType' @ [380:52] ==> public fun CallableDescriptor.callableReferenceType(resolutionFacade: ResolutionFacade, lhs: DoubleColonLHS?): FuzzyType? defined in org.jetbrains.kotlin.idea.completion.smart in file Utils.kt[SimpleFunctionDescriptorImpl]

'resolutionFacade' @ [380:74] ==> private final val resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion[PropertyDescriptorImpl]

'callableTypeExpectedInfo' @ [382:40] ==> private final val callableTypeExpectedInfo: List<ExpectedInfo> defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion[PropertyDescriptorImpl]

'filter' @ [382:65] ==> public inline fun <T> Iterable<ExpectedInfo>.filter(predicate: (ExpectedInfo) -> Boolean): List<ExpectedInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ExpectedInfo

'it' @ [382:74] ==> value-parameter it: ExpectedInfo defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.addCallableReferenceLookupElements.toLookupElement.<anonymous>[ValueParameterDescriptorImpl]

'matchingSubstitutor' @ [382:77] ==> public final fun matchingSubstitutor(descriptorType: FuzzyType): TypeSubstitutor? defined in org.jetbrains.kotlin.idea.core.ExpectedInfo[DeserializedSimpleFunctionDescriptor]

'callableReferenceType' @ [382:97] ==> val callableReferenceType: FuzzyType defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.addCallableReferenceLookupElements.toLookupElement[LocalVariableDescriptor]

'matchedExpectedInfos' @ [383:17] ==> val matchedExpectedInfos: List<ExpectedInfo> defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.addCallableReferenceLookupElements.toLookupElement[LocalVariableDescriptor]

'isEmpty' @ [383:38] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'lookupElementFactory' @ [385:33] ==> value-parameter lookupElementFactory: AbstractLookupElementFactory defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.addCallableReferenceLookupElements[ValueParameterDescriptorImpl]

'createLookupElement' @ [385:54] ==> public abstract fun createLookupElement(descriptor: DeclarationDescriptor, useReceiverTypes: Boolean, qualifyNestedClasses: Boolean = ..., includeClassTypeArguments: Boolean = ..., parametersAndTypeGrayed: Boolean = ...): LookupElement? defined in org.jetbrains.kotlin.idea.completion.AbstractLookupElementFactory[SimpleFunctionDescriptorImpl]

'descriptor' @ [385:74] ==> value-parameter descriptor: CallableDescriptor defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.addCallableReferenceLookupElements.toLookupElement[ValueParameterDescriptorImpl]

'lookupElement' @ [387:13] ==> var lookupElement: LookupElement defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.addCallableReferenceLookupElements.toLookupElement[LocalVariableDescriptor]

'LookupElementDecorator<LookupElement>' @ [387:37] ==> protected/*protected and package*/ constructor LookupElementDecorator<T : (LookupElement..LookupElement?)>(p0: (LookupElement..LookupElement?)) defined in com.intellij.codeInsight.lookup.LookupElementDecorator[JavaClassConstructorDescriptor]
Inferred types:
    <T : (LookupElement..LookupElement?)> -> LookupElement

'lookupElement' @ [387:75] ==> var lookupElement: LookupElement defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.addCallableReferenceLookupElements.toLookupElement[LocalVariableDescriptor]

'+' @ [388:50] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'delegate' @ [388:57] ==> public final val <no name provided>.delegate: (LookupElement..LookupElement?)[MyPropertyDescriptor]

'lookupString' @ [388:66] ==> public final val LookupElement.lookupString: String[MyPropertyDescriptor]

'setOf' @ [389:54] ==> public fun <T> setOf(element: String): Set<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'lookupString' @ [389:60] ==> public final val <no name provided>.lookupString: String[MyPropertyDescriptor]

'super' @ [392:21] ==> <this> defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.addCallableReferenceLookupElements.toLookupElement.<no name provided>[LazyClassReceiverParameterDescriptor]

'renderElement' @ [392:27] ==> public open fun renderElement(p0: (LookupElementPresentation..LookupElementPresentation?)): Unit defined in com.intellij.codeInsight.lookup.LookupElementDecorator[JavaMethodDescriptor]

'presentation' @ [392:41] ==> value-parameter presentation: LookupElementPresentation defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.addCallableReferenceLookupElements.toLookupElement.<no name provided>.renderElement[ValueParameterDescriptorImpl]

'presentation' @ [393:21] ==> value-parameter presentation: LookupElementPresentation defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.addCallableReferenceLookupElements.toLookupElement.<no name provided>.renderElement[ValueParameterDescriptorImpl]

'itemText' @ [393:34] ==> public final var LookupElementPresentation.itemText: String?[MyPropertyDescriptor]

'+' @ [393:45] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'presentation' @ [393:52] ==> value-parameter presentation: LookupElementPresentation defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.addCallableReferenceLookupElements.toLookupElement.<no name provided>.renderElement[ValueParameterDescriptorImpl]

'itemText' @ [393:65] ==> public final var LookupElementPresentation.itemText: String?[MyPropertyDescriptor]

'lookupElement' @ [400:20] ==> var lookupElement: LookupElement defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.addCallableReferenceLookupElements.toLookupElement[LocalVariableDescriptor]

'assignSmartCompletionPriority' @ [401:22] ==> public fun LookupElement.assignSmartCompletionPriority(priority: SmartCompletionItemPriority): LookupElement defined in org.jetbrains.kotlin.idea.completion.smart in file Utils.kt[SimpleFunctionDescriptorImpl]

'CALLABLE_REFERENCE' @ [401:80] ==> enum entry CALLABLE_REFERENCE defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionItemPriority[FakeCallableDescriptorForObject]

'addTailAndNameSimilarity' @ [402:22] ==> public fun LookupElement.addTailAndNameSimilarity(matchedExpectedInfos: Collection<ExpectedInfo>, nameSimilarityExpectedInfos: Collection<ExpectedInfo> = ...): LookupElement defined in org.jetbrains.kotlin.idea.completion.smart in file Utils.kt[SimpleFunctionDescriptorImpl]

'matchedExpectedInfos' @ [402:47] ==> val matchedExpectedInfos: List<ExpectedInfo> defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.addCallableReferenceLookupElements.toLookupElement[LocalVariableDescriptor]

'when (descriptor) {
            is CallableDescriptor -> {
                // members and extensions are not supported after "::" currently
                if (descriptor.dispatchReceiverParameter == null && descriptor.extensionReceiverParameter == null) {
                    addIfNotNull(toLookupElement(descriptor))
                }
            }

            is ClassDescriptor -> {
                if (descriptor.modality != Modality.ABSTRACT && !descriptor.isInner) {
                    descriptor.constructors
                            .filter(visibilityFilter)
                            .mapNotNullTo(this, ::toLookupElement)
                }
            }
        }' @ [405:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'descriptor' @ [405:15] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.addCallableReferenceLookupElements[ValueParameterDescriptorImpl]

'descriptor' @ [408:21] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.addCallableReferenceLookupElements[ValueParameterDescriptorImpl]

'dispatchReceiverParameter' @ [408:32] ==> public final val CallableDescriptor.dispatchReceiverParameter: ReceiverParameterDescriptor?[MyPropertyDescriptor]

'descriptor' @ [408:69] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.addCallableReferenceLookupElements[ValueParameterDescriptorImpl]

'extensionReceiverParameter' @ [408:80] ==> public final val CallableDescriptor.extensionReceiverParameter: ReceiverParameterDescriptor?[MyPropertyDescriptor]

'addIfNotNull' @ [409:21] ==> public fun <T : Any> MutableCollection<LookupElement>.addIfNotNull(t: LookupElement?): Unit defined in org.jetbrains.kotlin.utils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> LookupElement

'toLookupElement' @ [409:34] ==> local final fun toLookupElement(descriptor: CallableDescriptor): LookupElement? defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.addCallableReferenceLookupElements[SimpleFunctionDescriptorImpl]

'descriptor' @ [409:50] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.addCallableReferenceLookupElements[ValueParameterDescriptorImpl]

'descriptor' @ [414:21] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.addCallableReferenceLookupElements[ValueParameterDescriptorImpl]

'modality' @ [414:32] ==> public final val ClassDescriptor.modality: Modality[MyPropertyDescriptor]

'ABSTRACT' @ [414:53] ==> enum entry ABSTRACT defined in org.jetbrains.kotlin.descriptors.Modality[FakeCallableDescriptorForObject]

'!' @ [414:65] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [414:66] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.addCallableReferenceLookupElements[ValueParameterDescriptorImpl]

'isInner' @ [414:77] ==> public final val ClassDescriptor.isInner: Boolean[MyPropertyDescriptor]

'descriptor' @ [415:21] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.addCallableReferenceLookupElements[ValueParameterDescriptorImpl]

'constructors' @ [415:32] ==> public final val ClassDescriptor.constructors: Collection<(ClassConstructorDescriptor..ClassConstructorDescriptor?)>[MyPropertyDescriptor]

'filter' @ [416:30] ==> public inline fun <T> Iterable<(ClassConstructorDescriptor..ClassConstructorDescriptor?)>.filter(predicate: ((ClassConstructorDescriptor..ClassConstructorDescriptor?)) -> Boolean): List<(ClassConstructorDescriptor..ClassConstructorDescriptor?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.ClassConstructorDescriptor..org.jetbrains.kotlin.descriptors.ClassConstructorDescriptor?)

'visibilityFilter' @ [416:37] ==> private final val visibilityFilter: (DeclarationDescriptor) -> Boolean defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion[PropertyDescriptorImpl]

'mapNotNullTo' @ [417:30] ==> public inline fun <T, R : Any, C : MutableCollection<in LookupElement>> Iterable<(ClassConstructorDescriptor..ClassConstructorDescriptor?)>.mapNotNullTo(destination: MutableCollection<LookupElement>, transform: ((ClassConstructorDescriptor..ClassConstructorDescriptor?)) -> LookupElement?): MutableCollection<LookupElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.ClassConstructorDescriptor..org.jetbrains.kotlin.descriptors.ClassConstructorDescriptor?)
    <R : Any> -> LookupElement
    <C : MutableCollection<in R>> -> MutableCollection<LookupElement>

'this' @ [417:43] ==> <this> defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.addCallableReferenceLookupElements[ReceiverParameterDescriptorImpl]

'toLookupElement' @ [417:51] ==> local final fun toLookupElement(descriptor: CallableDescriptor): LookupElement? defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.addCallableReferenceLookupElements[SimpleFunctionDescriptorImpl]

'?:' @ [424:32] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: KtBinaryExpressionWithTypeRHS?, right: KtBinaryExpressionWithTypeRHS): KtBinaryExpressionWithTypeRHS[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> KtBinaryExpressionWithTypeRHS

'expression' @ [424:34] ==> private final val expression: KtExpression defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion[PropertyDescriptorImpl]

'parent' @ [424:45] ==> public final val KtExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'parent' @ [425:19] ==> public final val KtUserType.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'parent' @ [426:23] ==> public final val KtTypeReference.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'binaryExpression' @ [428:27] ==> val binaryExpression: KtBinaryExpressionWithTypeRHS defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.buildForAsTypePosition[LocalVariableDescriptor]

'operationReference' @ [428:44] ==> public final val KtBinaryExpressionWithTypeRHS.operationReference: KtSimpleNameExpression[MyPropertyDescriptor]

'getReferencedNameElementType' @ [428:63] ==> public abstract fun getReferencedNameElementType(): IElementType defined in org.jetbrains.kotlin.psi.KtSimpleNameExpression[DeserializedSimpleFunctionDescriptor]

'elementType' @ [429:13] ==> val elementType: IElementType defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.buildForAsTypePosition[LocalVariableDescriptor]

'AS_KEYWORD' @ [429:37] ==> public final val AS_KEYWORD: (KtKeywordToken..KtKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'elementType' @ [429:51] ==> val elementType: IElementType defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.buildForAsTypePosition[LocalVariableDescriptor]

'AS_SAFE' @ [429:75] ==> public final val AS_SAFE: (KtToken..KtToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'calcExpectedInfos' @ [430:29] ==> private final fun calcExpectedInfos(expression: KtExpression): Collection<ExpectedInfo> defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion[SimpleFunctionDescriptorImpl]

'binaryExpression' @ [430:47] ==> val binaryExpression: KtBinaryExpressionWithTypeRHS defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.buildForAsTypePosition[LocalVariableDescriptor]

'expectedInfos' @ [432:74] ==> val expectedInfos: Collection<ExpectedInfo> defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.buildForAsTypePosition[LocalVariableDescriptor]

'groupBy' @ [432:88] ==> public inline fun <T, K> Iterable<ExpectedInfo>.groupBy(keySelector: (ExpectedInfo) -> KotlinType?): Map<KotlinType?, List<ExpectedInfo>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ExpectedInfo
    <K> -> KotlinType?

'it' @ [432:98] ==> value-parameter it: ExpectedInfo defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.buildForAsTypePosition.<anonymous>[ValueParameterDescriptorImpl]

'fuzzyType' @ [432:101] ==> public val ExpectedInfo.fuzzyType: FuzzyType? defined in org.jetbrains.kotlin.idea.core[DeserializedPropertyDescriptor]

'type' @ [432:112] ==> public final val type: KotlinType defined in org.jetbrains.kotlin.idea.util.FuzzyType[DeserializedPropertyDescriptor]

'makeNotNullable' @ [432:118] ==> public fun KotlinType.makeNotNullable(): KotlinType defined in org.jetbrains.kotlin.types.typeUtil[DeserializedSimpleFunctionDescriptor]

'ArrayList' @ [434:21] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> LookupElement

'component1' @ [435:15] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<KotlinType?, List<ExpectedInfo>>.component1(): KotlinType? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> KotlinType?
    <V> -> List<ExpectedInfo>

'component2' @ [435:21] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<KotlinType?, List<ExpectedInfo>>.component2(): List<ExpectedInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> KotlinType?
    <V> -> List<ExpectedInfo>

'expectedInfosGrouped' @ [435:31] ==> val expectedInfosGrouped: Map<KotlinType?, List<ExpectedInfo>> defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.buildForAsTypePosition[LocalVariableDescriptor]

'type' @ [436:17] ==> val type: KotlinType? defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.buildForAsTypePosition[LocalVariableDescriptor]

'lookupElementFactory' @ [437:33] ==> value-parameter lookupElementFactory: BasicLookupElementFactory defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.buildForAsTypePosition[ValueParameterDescriptorImpl]

'createLookupElementForType' @ [437:54] ==> public fun BasicLookupElementFactory.createLookupElementForType(type: KotlinType): LookupElement? defined in org.jetbrains.kotlin.idea.completion in file CompletionUtils.kt[SimpleFunctionDescriptorImpl]

'type' @ [437:81] ==> val type: KotlinType? defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.buildForAsTypePosition[LocalVariableDescriptor]

'items' @ [438:13] ==> val items: ArrayList<LookupElement> defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.buildForAsTypePosition[LocalVariableDescriptor]

'add' @ [438:19] ==> public open fun add(element: LookupElement): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'lookupElement' @ [438:23] ==> val lookupElement: LookupElement defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.buildForAsTypePosition[LocalVariableDescriptor]

'addTailAndNameSimilarity' @ [438:37] ==> public fun LookupElement.addTailAndNameSimilarity(matchedExpectedInfos: Collection<ExpectedInfo>, nameSimilarityExpectedInfos: Collection<ExpectedInfo> = ...): LookupElement defined in org.jetbrains.kotlin.idea.completion.smart in file Utils.kt[SimpleFunctionDescriptorImpl]

'infos' @ [438:62] ==> val infos: List<ExpectedInfo> defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.buildForAsTypePosition[LocalVariableDescriptor]

'items' @ [440:16] ==> val items: ArrayList<LookupElement> defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion.buildForAsTypePosition[LocalVariableDescriptor]

'create' @ [444:69] ==> public open fun create(@NonNls p0: (String..String?)): (OffsetKey..OffsetKey?) defined in com.intellij.codeInsight.completion.OffsetKey[JavaMethodDescriptor]

'create' @ [445:74] ==> public open fun create(@NonNls p0: (String..String?)): (OffsetKey..OffsetKey?) defined in com.intellij.codeInsight.completion.OffsetKey[JavaMethodDescriptor]

