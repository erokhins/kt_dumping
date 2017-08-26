'IntentionBasedInspection<KtDotQualifiedExpression>' @ [44:35] ==> public constructor IntentionBasedInspection<TElement : PsiElement>(intention: KClass<out SelfTargetingRangeIntention<KtDotQualifiedExpression>>, additionalChecker: (KtDotQualifiedExpression) -> Boolean, problemText: String? = ...) defined in org.jetbrains.kotlin.idea.inspections.IntentionBasedInspection[DeserializedClassConstructorDescriptor]
Inferred types:
    <TElement : PsiElement> -> KtDotQualifiedExpression

'ReplaceGetOrSetIntention' @ [45:9] ==> public constructor ReplaceGetOrSetIntention() defined in org.jetbrains.kotlin.idea.intentions.conventionNameCalls.ReplaceGetOrSetIntention[ClassConstructorDescriptorImpl]

'ReplaceGetOrSetInspection' @ [45:42] ==> public companion object defined in org.jetbrains.kotlin.idea.intentions.conventionNameCalls.ReplaceGetOrSetInspection[FakeCallableDescriptorForObject]

'additionalChecker' @ [45:68] ==> public final val additionalChecker: (KtDotQualifiedExpression) -> Boolean defined in org.jetbrains.kotlin.idea.intentions.conventionNameCalls.ReplaceGetOrSetInspection.Companion[PropertyDescriptorImpl]

'expression' @ [50:14] ==> value-parameter expression: KtDotQualifiedExpression defined in org.jetbrains.kotlin.idea.intentions.conventionNameCalls.ReplaceGetOrSetInspection.Companion.additionalChecker.<anonymous>[ValueParameterDescriptorImpl]

'toResolvedCall' @ [50:25] ==> public fun KtQualifiedExpression.toResolvedCall(bodyResolveMode: BodyResolveMode): ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.idea.intentions[SimpleFunctionDescriptorImpl]

'PARTIAL' @ [50:56] ==> enum entry PARTIAL defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'resultingDescriptor' @ [50:67] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.resultingDescriptor: CallableDescriptor[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> CallableDescriptor

'isExplicitOperator' @ [50:110] ==> private fun FunctionDescriptor.isExplicitOperator(): Boolean defined in org.jetbrains.kotlin.idea.intentions.conventionNameCalls in file ReplaceGetOrSetIntention.kt[SimpleFunctionDescriptorImpl]

'if (overriddenDescriptors.isEmpty())
        containingDeclaration !is JavaClassDescriptor && isOperator
    else
        overriddenDescriptors.any { it.isExplicitOperator() }' @ [56:12] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Boolean, elseBranch: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Boolean

'overriddenDescriptors' @ [56:16] ==> public final var FunctionDescriptor.overriddenDescriptors: (MutableCollection<out (FunctionDescriptor..FunctionDescriptor?)>..Collection<(FunctionDescriptor..FunctionDescriptor?)>)[MyPropertyDescriptor]

'isEmpty' @ [56:38] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.MutableCollection[DeserializedSimpleFunctionDescriptor]

'containingDeclaration' @ [57:9] ==> public final val FunctionDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'isOperator' @ [57:58] ==> public final val FunctionDescriptor.isOperator: Boolean[MyPropertyDescriptor]

'overriddenDescriptors' @ [59:9] ==> public final var FunctionDescriptor.overriddenDescriptors: (MutableCollection<out (FunctionDescriptor..FunctionDescriptor?)>..Collection<(FunctionDescriptor..FunctionDescriptor?)>)[MyPropertyDescriptor]

'any' @ [59:31] ==> public inline fun <T> Iterable<(FunctionDescriptor..FunctionDescriptor?)>.any(predicate: ((FunctionDescriptor..FunctionDescriptor?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.FunctionDescriptor..org.jetbrains.kotlin.descriptors.FunctionDescriptor?)

'it' @ [59:37] ==> value-parameter it: (FunctionDescriptor..FunctionDescriptor?) defined in org.jetbrains.kotlin.idea.intentions.conventionNameCalls.isExplicitOperator.<anonymous>[ValueParameterDescriptorImpl]

'isExplicitOperator' @ [59:40] ==> private fun FunctionDescriptor.isExplicitOperator(): Boolean defined in org.jetbrains.kotlin.idea.intentions.conventionNameCalls in file ReplaceGetOrSetIntention.kt[SimpleFunctionDescriptorImpl]

'SelfTargetingRangeIntention<KtDotQualifiedExpression>' @ [62:34] ==> public constructor SelfTargetingRangeIntention<TElement : PsiElement>(elementType: Class<KtDotQualifiedExpression>, text: String, familyName: String = ...) defined in org.jetbrains.kotlin.idea.intentions.SelfTargetingRangeIntention[DeserializedClassConstructorDescriptor]
Inferred types:
    <TElement : PsiElement> -> KtDotQualifiedExpression

'KtDotQualifiedExpression' @ [63:9] ==> public companion object defined in org.jetbrains.kotlin.psi.KtDotQualifiedExpression[FakeCallableDescriptorForObject]

'java' @ [63:41] ==> public val <T> KClass<KtDotQualifiedExpression>.java: Class<KtDotQualifiedExpression> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtDotQualifiedExpression

'setOf' @ [67:33] ==> public fun <T> setOf(vararg elements: Name): Set<Name> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Name

'OperatorNameConventions' @ [67:39] ==> public object OperatorNameConventions defined in org.jetbrains.kotlin.util[FakeCallableDescriptorForObject]

'GET' @ [67:63] ==> @field:JvmField public final val GET: Name defined in org.jetbrains.kotlin.util.OperatorNameConventions[DeserializedPropertyDescriptor]

'OperatorNameConventions' @ [67:68] ==> public object OperatorNameConventions defined in org.jetbrains.kotlin.util[FakeCallableDescriptorForObject]

'SET' @ [67:92] ==> @field:JvmField public final val SET: Name defined in org.jetbrains.kotlin.util.OperatorNameConventions[DeserializedPropertyDescriptor]

'element' @ [70:30] ==> value-parameter element: KtDotQualifiedExpression defined in org.jetbrains.kotlin.idea.intentions.conventionNameCalls.ReplaceGetOrSetIntention.applicabilityRange[ValueParameterDescriptorImpl]

'callExpression' @ [70:38] ==> public val KtQualifiedExpression.callExpression: KtCallExpression? defined in org.jetbrains.kotlin.idea.intentions in file Utils.kt[PropertyDescriptorImpl]

'callExpression' @ [71:30] ==> val callExpression: KtCallExpression defined in org.jetbrains.kotlin.idea.intentions.conventionNameCalls.ReplaceGetOrSetIntention.applicabilityRange[LocalVariableDescriptor]

'analyze' @ [71:45] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'PARTIAL' @ [71:69] ==> enum entry PARTIAL defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'callExpression' @ [72:28] ==> val callExpression: KtCallExpression defined in org.jetbrains.kotlin.idea.intentions.conventionNameCalls.ReplaceGetOrSetIntention.applicabilityRange[LocalVariableDescriptor]

'getResolvedCall' @ [72:43] ==> public fun KtElement?.getResolvedCall(context: BindingContext): ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.resolve.calls.callUtil[DeserializedSimpleFunctionDescriptor]

'bindingContext' @ [72:59] ==> val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.intentions.conventionNameCalls.ReplaceGetOrSetIntention.applicabilityRange[LocalVariableDescriptor]

'!' @ [73:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'resolvedCall' @ [73:14] ==> val resolvedCall: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.idea.intentions.conventionNameCalls.ReplaceGetOrSetIntention.applicabilityRange[LocalVariableDescriptor]

'isReallySuccess' @ [73:27] ==> public fun ResolvedCall<*>.isReallySuccess(): Boolean defined in org.jetbrains.kotlin.resolve.calls.model[DeserializedSimpleFunctionDescriptor]

'resolvedCall' @ [75:22] ==> val resolvedCall: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.idea.intentions.conventionNameCalls.ReplaceGetOrSetIntention.applicabilityRange[LocalVariableDescriptor]

'resultingDescriptor' @ [75:35] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.resultingDescriptor: CallableDescriptor[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> CallableDescriptor

'!' @ [76:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'target' @ [76:14] ==> val target: FunctionDescriptor defined in org.jetbrains.kotlin.idea.intentions.conventionNameCalls.ReplaceGetOrSetIntention.applicabilityRange[LocalVariableDescriptor]

'isValidOperator' @ [76:21] ==> public fun FunctionDescriptor.isValidOperator(): Boolean defined in org.jetbrains.kotlin.util[DeserializedSimpleFunctionDescriptor]

'target' @ [76:42] ==> val target: FunctionDescriptor defined in org.jetbrains.kotlin.idea.intentions.conventionNameCalls.ReplaceGetOrSetIntention.applicabilityRange[LocalVariableDescriptor]

'name' @ [76:49] ==> public final val FunctionDescriptor.name: Name[MyPropertyDescriptor]

'operatorNames' @ [76:58] ==> private final val operatorNames: Set<Name> defined in org.jetbrains.kotlin.idea.intentions.conventionNameCalls.ReplaceGetOrSetIntention[PropertyDescriptorImpl]

'callExpression' @ [78:13] ==> val callExpression: KtCallExpression defined in org.jetbrains.kotlin.idea.intentions.conventionNameCalls.ReplaceGetOrSetIntention.applicabilityRange[LocalVariableDescriptor]

'typeArgumentList' @ [78:28] ==> public final val KtCallExpression.typeArgumentList: KtTypeArgumentList?[MyPropertyDescriptor]

'callExpression' @ [80:25] ==> val callExpression: KtCallExpression defined in org.jetbrains.kotlin.idea.intentions.conventionNameCalls.ReplaceGetOrSetIntention.applicabilityRange[LocalVariableDescriptor]

'valueArguments' @ [80:40] ==> public final val KtCallExpression.valueArguments: (MutableList<(KtValueArgument..KtValueArgument?)>..List<(KtValueArgument..KtValueArgument?)>)[MyPropertyDescriptor]

'arguments' @ [81:13] ==> val arguments: (MutableList<(KtValueArgument..KtValueArgument?)>..List<(KtValueArgument..KtValueArgument?)>) defined in org.jetbrains.kotlin.idea.intentions.conventionNameCalls.ReplaceGetOrSetIntention.applicabilityRange[LocalVariableDescriptor]

'isEmpty' @ [81:23] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'arguments' @ [82:13] ==> val arguments: (MutableList<(KtValueArgument..KtValueArgument?)>..List<(KtValueArgument..KtValueArgument?)>) defined in org.jetbrains.kotlin.idea.intentions.conventionNameCalls.ReplaceGetOrSetIntention.applicabilityRange[LocalVariableDescriptor]

'any' @ [82:23] ==> public inline fun <T> Iterable<(KtValueArgument..KtValueArgument?)>.any(predicate: ((KtValueArgument..KtValueArgument?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtValueArgument..org.jetbrains.kotlin.psi.KtValueArgument?)

'it' @ [82:29] ==> value-parameter it: (KtValueArgument..KtValueArgument?) defined in org.jetbrains.kotlin.idea.intentions.conventionNameCalls.ReplaceGetOrSetIntention.applicabilityRange.<anonymous>[ValueParameterDescriptorImpl]

'isNamed' @ [82:32] ==> public open fun isNamed(): Boolean defined in org.jetbrains.kotlin.psi.KtValueArgument[JavaMethodDescriptor]

'!' @ [84:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'element' @ [84:14] ==> value-parameter element: KtDotQualifiedExpression defined in org.jetbrains.kotlin.idea.intentions.conventionNameCalls.ReplaceGetOrSetIntention.applicabilityRange[ValueParameterDescriptorImpl]

'isReceiverExpressionWithValue' @ [84:22] ==> public fun KtQualifiedExpression.isReceiverExpressionWithValue(): Boolean defined in org.jetbrains.kotlin.idea.intentions in file Utils.kt[SimpleFunctionDescriptorImpl]

'target' @ [86:13] ==> val target: FunctionDescriptor defined in org.jetbrains.kotlin.idea.intentions.conventionNameCalls.ReplaceGetOrSetIntention.applicabilityRange[LocalVariableDescriptor]

'name' @ [86:20] ==> public final val FunctionDescriptor.name: Name[MyPropertyDescriptor]

'OperatorNameConventions' @ [86:28] ==> public object OperatorNameConventions defined in org.jetbrains.kotlin.util[FakeCallableDescriptorForObject]

'SET' @ [86:52] ==> @field:JvmField public final val SET: Name defined in org.jetbrains.kotlin.util.OperatorNameConventions[DeserializedPropertyDescriptor]

'element' @ [86:59] ==> value-parameter element: KtDotQualifiedExpression defined in org.jetbrains.kotlin.idea.intentions.conventionNameCalls.ReplaceGetOrSetIntention.applicabilityRange[ValueParameterDescriptorImpl]

'isUsedAsExpression' @ [86:67] ==> public fun KtExpression.isUsedAsExpression(context: BindingContext): Boolean defined in org.jetbrains.kotlin.resolve.bindingContextUtil[DeserializedSimpleFunctionDescriptor]

'bindingContext' @ [86:86] ==> val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.intentions.conventionNameCalls.ReplaceGetOrSetIntention.applicabilityRange[LocalVariableDescriptor]

'text' @ [88:9] ==> public final var ReplaceGetOrSetIntention.text: String[MyPropertyDescriptor]

'target' @ [88:28] ==> val target: FunctionDescriptor defined in org.jetbrains.kotlin.idea.intentions.conventionNameCalls.ReplaceGetOrSetIntention.applicabilityRange[LocalVariableDescriptor]

'name' @ [88:35] ==> public final val FunctionDescriptor.name: Name[MyPropertyDescriptor]

'asString' @ [88:40] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'callExpression' @ [90:16] ==> val callExpression: KtCallExpression defined in org.jetbrains.kotlin.idea.intentions.conventionNameCalls.ReplaceGetOrSetIntention.applicabilityRange[LocalVariableDescriptor]

'calleeExpression' @ [90:31] ==> public final val KtCallExpression.calleeExpression: KtExpression?[MyPropertyDescriptor]

'textRange' @ [90:50] ==> public final val KtExpression.textRange: (TextRange..TextRange?)[MyPropertyDescriptor]

'element' @ [94:21] ==> value-parameter element: KtDotQualifiedExpression defined in org.jetbrains.kotlin.idea.intentions.conventionNameCalls.ReplaceGetOrSetIntention.applyTo[ValueParameterDescriptorImpl]

'toResolvedCall' @ [94:29] ==> public fun KtQualifiedExpression.toResolvedCall(bodyResolveMode: BodyResolveMode): ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.idea.intentions[SimpleFunctionDescriptorImpl]

'PARTIAL' @ [94:60] ==> enum entry PARTIAL defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'resultingDescriptor' @ [94:71] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.resultingDescriptor: CallableDescriptor[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> CallableDescriptor

'name' @ [94:91] ==> public final val CallableDescriptor.name: Name[MyPropertyDescriptor]

'OperatorNameConventions' @ [94:99] ==> public object OperatorNameConventions defined in org.jetbrains.kotlin.util[FakeCallableDescriptorForObject]

'SET' @ [94:123] ==> @field:JvmField public final val SET: Name defined in org.jetbrains.kotlin.util.OperatorNameConventions[DeserializedPropertyDescriptor]

'element' @ [95:28] ==> value-parameter element: KtDotQualifiedExpression defined in org.jetbrains.kotlin.idea.intentions.conventionNameCalls.ReplaceGetOrSetIntention.applyTo[ValueParameterDescriptorImpl]

'callExpression' @ [95:36] ==> public val KtQualifiedExpression.callExpression: KtCallExpression? defined in org.jetbrains.kotlin.idea.intentions in file Utils.kt[PropertyDescriptorImpl]

'valueArguments' @ [95:53] ==> public final val KtCallExpression.valueArguments: (MutableList<(KtValueArgument..KtValueArgument?)>..List<(KtValueArgument..KtValueArgument?)>)[MyPropertyDescriptor]

'assert' @ [96:9] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'allArguments' @ [96:16] ==> val allArguments: (MutableList<(KtValueArgument..KtValueArgument?)>..List<(KtValueArgument..KtValueArgument?)>) defined in org.jetbrains.kotlin.idea.intentions.conventionNameCalls.ReplaceGetOrSetIntention.applyTo[LocalVariableDescriptor]

'isNotEmpty' @ [96:29] ==> @InlineOnly public inline fun <T> Collection<(KtValueArgument..KtValueArgument?)>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtValueArgument..org.jetbrains.kotlin.psi.KtValueArgument?)

'KtPsiFactory' @ [98:26] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'element' @ [98:39] ==> value-parameter element: KtDotQualifiedExpression defined in org.jetbrains.kotlin.idea.intentions.conventionNameCalls.ReplaceGetOrSetIntention.applyTo[ValueParameterDescriptorImpl]

'buildExpression' @ [98:48] ==> public fun KtPsiFactory.buildExpression(build: BuilderByPattern<KtExpression>.() -> Unit): KtExpression defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'appendExpression' @ [99:13] ==> public final fun appendExpression(expression: KtExpression?): BuilderByPattern<KtExpression> defined in org.jetbrains.kotlin.psi.BuilderByPattern[DeserializedSimpleFunctionDescriptor]

'element' @ [99:30] ==> value-parameter element: KtDotQualifiedExpression defined in org.jetbrains.kotlin.idea.intentions.conventionNameCalls.ReplaceGetOrSetIntention.applyTo[ValueParameterDescriptorImpl]

'receiverExpression' @ [99:38] ==> public open val receiverExpression: KtExpression defined in org.jetbrains.kotlin.psi.KtDotQualifiedExpression[DeserializedPropertyDescriptor]

'appendFixedText' @ [101:13] ==> public final fun appendFixedText(text: String): BuilderByPattern<KtExpression> defined in org.jetbrains.kotlin.psi.BuilderByPattern[DeserializedSimpleFunctionDescriptor]

'if (isSet) allArguments.dropLast(1) else allArguments' @ [103:29] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: List<(KtValueArgument..KtValueArgument?)>, elseBranch: List<(KtValueArgument..KtValueArgument?)>): List<(KtValueArgument..KtValueArgument?)>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> List<(org.jetbrains.kotlin.psi.KtValueArgument..org.jetbrains.kotlin.psi.KtValueArgument?)>

'isSet' @ [103:33] ==> val isSet: Boolean defined in org.jetbrains.kotlin.idea.intentions.conventionNameCalls.ReplaceGetOrSetIntention.applyTo[LocalVariableDescriptor]

'allArguments' @ [103:40] ==> val allArguments: (MutableList<(KtValueArgument..KtValueArgument?)>..List<(KtValueArgument..KtValueArgument?)>) defined in org.jetbrains.kotlin.idea.intentions.conventionNameCalls.ReplaceGetOrSetIntention.applyTo[LocalVariableDescriptor]

'dropLast' @ [103:53] ==> public fun <T> List<(KtValueArgument..KtValueArgument?)>.dropLast(n: Int): List<(KtValueArgument..KtValueArgument?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtValueArgument..org.jetbrains.kotlin.psi.KtValueArgument?)

'allArguments' @ [103:70] ==> val allArguments: (MutableList<(KtValueArgument..KtValueArgument?)>..List<(KtValueArgument..KtValueArgument?)>) defined in org.jetbrains.kotlin.idea.intentions.conventionNameCalls.ReplaceGetOrSetIntention.applyTo[LocalVariableDescriptor]

'appendExpressions' @ [104:13] ==> public final fun appendExpressions(expressions: Iterable<KtExpression?>, separator: String = ...): BuilderByPattern<KtExpression> defined in org.jetbrains.kotlin.psi.BuilderByPattern[DeserializedSimpleFunctionDescriptor]

'arguments' @ [104:31] ==> val arguments: List<(KtValueArgument..KtValueArgument?)> defined in org.jetbrains.kotlin.idea.intentions.conventionNameCalls.ReplaceGetOrSetIntention.applyTo.<anonymous>[LocalVariableDescriptor]

'map' @ [104:41] ==> public inline fun <T, R> Iterable<(KtValueArgument..KtValueArgument?)>.map(transform: ((KtValueArgument..KtValueArgument?)) -> KtExpression?): List<KtExpression?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtValueArgument..org.jetbrains.kotlin.psi.KtValueArgument?)
    <R> -> KtExpression?

'it' @ [104:47] ==> value-parameter it: (KtValueArgument..KtValueArgument?) defined in org.jetbrains.kotlin.idea.intentions.conventionNameCalls.ReplaceGetOrSetIntention.applyTo.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'getArgumentExpression' @ [104:50] ==> @IfNotParsed @Nullable public open fun getArgumentExpression(): KtExpression? defined in org.jetbrains.kotlin.psi.KtValueArgument[JavaMethodDescriptor]

'appendFixedText' @ [106:13] ==> public final fun appendFixedText(text: String): BuilderByPattern<KtExpression> defined in org.jetbrains.kotlin.psi.BuilderByPattern[DeserializedSimpleFunctionDescriptor]

'isSet' @ [108:17] ==> val isSet: Boolean defined in org.jetbrains.kotlin.idea.intentions.conventionNameCalls.ReplaceGetOrSetIntention.applyTo[LocalVariableDescriptor]

'appendFixedText' @ [109:17] ==> public final fun appendFixedText(text: String): BuilderByPattern<KtExpression> defined in org.jetbrains.kotlin.psi.BuilderByPattern[DeserializedSimpleFunctionDescriptor]

'appendExpression' @ [110:17] ==> public final fun appendExpression(expression: KtExpression?): BuilderByPattern<KtExpression> defined in org.jetbrains.kotlin.psi.BuilderByPattern[DeserializedSimpleFunctionDescriptor]

'allArguments' @ [110:34] ==> val allArguments: (MutableList<(KtValueArgument..KtValueArgument?)>..List<(KtValueArgument..KtValueArgument?)>) defined in org.jetbrains.kotlin.idea.intentions.conventionNameCalls.ReplaceGetOrSetIntention.applyTo[LocalVariableDescriptor]

'last' @ [110:47] ==> public fun <T> List<(KtValueArgument..KtValueArgument?)>.last(): (KtValueArgument..KtValueArgument?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtValueArgument..org.jetbrains.kotlin.psi.KtValueArgument?)

'getArgumentExpression' @ [110:54] ==> @IfNotParsed @Nullable public open fun getArgumentExpression(): KtExpression? defined in org.jetbrains.kotlin.psi.KtValueArgument[JavaMethodDescriptor]

'element' @ [114:26] ==> value-parameter element: KtDotQualifiedExpression defined in org.jetbrains.kotlin.idea.intentions.conventionNameCalls.ReplaceGetOrSetIntention.applyTo[ValueParameterDescriptorImpl]

'replace' @ [114:34] ==> @NotNull public open fun replace(@NotNull p0: PsiElement): PsiElement defined in org.jetbrains.kotlin.psi.KtDotQualifiedExpression[JavaMethodDescriptor]

'expression' @ [114:42] ==> val expression: KtExpression defined in org.jetbrains.kotlin.idea.intentions.conventionNameCalls.ReplaceGetOrSetIntention.applyTo[LocalVariableDescriptor]

'editor' @ [116:13] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.intentions.conventionNameCalls.ReplaceGetOrSetIntention.applyTo[ValueParameterDescriptorImpl]

'moveCaret' @ [117:13] ==> private final fun moveCaret(editor: Editor, isSet: Boolean, newElement: PsiElement): Unit defined in org.jetbrains.kotlin.idea.intentions.conventionNameCalls.ReplaceGetOrSetIntention[SimpleFunctionDescriptorImpl]

'editor' @ [117:23] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.intentions.conventionNameCalls.ReplaceGetOrSetIntention.applyTo[ValueParameterDescriptorImpl]

'isSet' @ [117:31] ==> val isSet: Boolean defined in org.jetbrains.kotlin.idea.intentions.conventionNameCalls.ReplaceGetOrSetIntention.applyTo[LocalVariableDescriptor]

'newElement' @ [117:38] ==> val newElement: PsiElement defined in org.jetbrains.kotlin.idea.intentions.conventionNameCalls.ReplaceGetOrSetIntention.applyTo[LocalVariableDescriptor]

'if (isSet) {
            newElement.getChildOfType<KtArrayAccessExpression>()!!
        }
        else {
            newElement as KtArrayAccessExpression
        }' @ [122:37] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KtArrayAccessExpression, elseBranch: KtArrayAccessExpression): KtArrayAccessExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KtArrayAccessExpression

'isSet' @ [122:41] ==> value-parameter isSet: Boolean defined in org.jetbrains.kotlin.idea.intentions.conventionNameCalls.ReplaceGetOrSetIntention.moveCaret[ValueParameterDescriptorImpl]

'newElement' @ [123:13] ==> value-parameter newElement: PsiElement defined in org.jetbrains.kotlin.idea.intentions.conventionNameCalls.ReplaceGetOrSetIntention.moveCaret[ValueParameterDescriptorImpl]

'getChildOfType' @ [123:24] ==> public inline fun <reified T : PsiElement> PsiElement.getChildOfType(): KtArrayAccessExpression? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtArrayAccessExpression

'newElement' @ [126:13] ==> value-parameter newElement: PsiElement defined in org.jetbrains.kotlin.idea.intentions.conventionNameCalls.ReplaceGetOrSetIntention.moveCaret[ValueParameterDescriptorImpl]

'editor' @ [129:9] ==> value-parameter editor: Editor defined in org.jetbrains.kotlin.idea.intentions.conventionNameCalls.ReplaceGetOrSetIntention.moveCaret[ValueParameterDescriptorImpl]

'caretModel' @ [129:16] ==> public final val Editor.caretModel: CaretModel[MyPropertyDescriptor]

'moveToOffset' @ [129:27] ==> public abstract fun moveToOffset(p0: Int): Unit defined in com.intellij.openapi.editor.CaretModel[JavaMethodDescriptor]

'arrayAccessExpression' @ [129:40] ==> val arrayAccessExpression: KtArrayAccessExpression defined in org.jetbrains.kotlin.idea.intentions.conventionNameCalls.ReplaceGetOrSetIntention.moveCaret[LocalVariableDescriptor]

'leftBracket' @ [129:62] ==> public final val KtArrayAccessExpression.leftBracket: PsiElement?[MyPropertyDescriptor]

'startOffset' @ [129:76] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

