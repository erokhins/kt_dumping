'getResolvedCall' @ [25:53] ==> public fun KtElement?.getResolvedCall(context: BindingContext): ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.resolve.calls.callUtil[DeserializedSimpleFunctionDescriptor]

'analyze' @ [25:69] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'resultingDescriptor' @ [25:81] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.resultingDescriptor: CallableDescriptor[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> CallableDescriptor

'when (this) {
    is KtBinaryExpression -> this.left to this.right
    is KtDotQualifiedExpression -> this.receiverExpression to this.callExpression?.valueArguments?.singleOrNull()?.getArgumentExpression()
    else -> null
}' @ [27:44] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Pair<KtExpression?, KtExpression?>?, entry1: Pair<KtExpression?, KtExpression?>?, entry2: Pair<KtExpression?, KtExpression?>?): Pair<KtExpression?, KtExpression?>?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Pair<KtExpression?, KtExpression?>?

'this' @ [27:50] ==> <this> defined in org.jetbrains.kotlin.idea.intentions.getArguments[ReceiverParameterDescriptorImpl]

'this' @ [28:30] ==> <this> defined in org.jetbrains.kotlin.idea.intentions.getArguments[ReceiverParameterDescriptorImpl]

'left' @ [28:35] ==> public final val KtBinaryExpression.left: KtExpression?[MyPropertyDescriptor]

'this' @ [28:43] ==> <this> defined in org.jetbrains.kotlin.idea.intentions.getArguments[ReceiverParameterDescriptorImpl]

'right' @ [28:48] ==> public final val KtBinaryExpression.right: KtExpression?[MyPropertyDescriptor]

'this' @ [29:36] ==> <this> defined in org.jetbrains.kotlin.idea.intentions.getArguments[ReceiverParameterDescriptorImpl]

'receiverExpression' @ [29:41] ==> public open val receiverExpression: KtExpression defined in org.jetbrains.kotlin.psi.KtDotQualifiedExpression[DeserializedPropertyDescriptor]

'this' @ [29:63] ==> <this> defined in org.jetbrains.kotlin.idea.intentions.getArguments[ReceiverParameterDescriptorImpl]

'callExpression' @ [29:68] ==> public val KtQualifiedExpression.callExpression: KtCallExpression? defined in org.jetbrains.kotlin.idea.intentions in file Utils.kt[PropertyDescriptorImpl]

'valueArguments' @ [29:84] ==> public final val KtCallExpression.valueArguments: (MutableList<(KtValueArgument..KtValueArgument?)>..List<(KtValueArgument..KtValueArgument?)>)[MyPropertyDescriptor]

'singleOrNull' @ [29:100] ==> public fun <T> List<(KtValueArgument..KtValueArgument?)>.singleOrNull(): KtValueArgument? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtValueArgument..org.jetbrains.kotlin.psi.KtValueArgument?)

'getArgumentExpression' @ [29:116] ==> @IfNotParsed @Nullable public open fun getArgumentExpression(): KtExpression? defined in org.jetbrains.kotlin.psi.KtValueArgument[JavaMethodDescriptor]

'SelfTargetingIntention<KtExpression>' @ [33:42] ==> public constructor SelfTargetingIntention<TElement : PsiElement>(elementType: Class<KtExpression>, text: String, familyName: String = ...) defined in org.jetbrains.kotlin.idea.intentions.SelfTargetingIntention[DeserializedClassConstructorDescriptor]
Inferred types:
    <TElement : PsiElement> -> KtExpression

'java' @ [33:99] ==> public val <T> KClass<KtExpression>.java: Class<KtExpression> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtExpression

'element' @ [35:13] ==> value-parameter element: KtExpression defined in org.jetbrains.kotlin.idea.intentions.ReplaceUntilWithRangeToIntention.isApplicableTo[ValueParameterDescriptorImpl]

'element' @ [35:47] ==> value-parameter element: KtExpression defined in org.jetbrains.kotlin.idea.intentions.ReplaceUntilWithRangeToIntention.isApplicableTo[ValueParameterDescriptorImpl]

'element' @ [36:22] ==> value-parameter element: KtExpression defined in org.jetbrains.kotlin.idea.intentions.ReplaceUntilWithRangeToIntention.isApplicableTo[ValueParameterDescriptorImpl]

'getCallableDescriptor' @ [36:30] ==> internal fun KtExpression.getCallableDescriptor(): CallableDescriptor? defined in org.jetbrains.kotlin.idea.intentions[SimpleFunctionDescriptorImpl]

'fqNameUnsafe' @ [36:55] ==> public val DeclarationDescriptor.fqNameUnsafe: FqNameUnsafe defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedPropertyDescriptor]

'asString' @ [36:69] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqNameUnsafe[JavaMethodDescriptor]

'fqName' @ [37:16] ==> val fqName: String defined in org.jetbrains.kotlin.idea.intentions.ReplaceUntilWithRangeToIntention.isApplicableTo[LocalVariableDescriptor]

'element' @ [41:20] ==> value-parameter element: KtExpression defined in org.jetbrains.kotlin.idea.intentions.ReplaceUntilWithRangeToIntention.applyTo[ValueParameterDescriptorImpl]

'getArguments' @ [41:28] ==> internal fun KtExpression.getArguments(): Pair<KtExpression?, KtExpression?>? defined in org.jetbrains.kotlin.idea.intentions[SimpleFunctionDescriptorImpl]

'element' @ [42:9] ==> value-parameter element: KtExpression defined in org.jetbrains.kotlin.idea.intentions.ReplaceUntilWithRangeToIntention.applyTo[ValueParameterDescriptorImpl]

'replace' @ [42:17] ==> public abstract fun replace(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtExpression[JavaMethodDescriptor]

'KtPsiFactory' @ [42:25] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'element' @ [42:38] ==> value-parameter element: KtExpression defined in org.jetbrains.kotlin.idea.intentions.ReplaceUntilWithRangeToIntention.applyTo[ValueParameterDescriptorImpl]

'createExpressionByPattern' @ [42:47] ==> public fun KtPsiFactory.createExpressionByPattern(pattern: String, vararg args: Any, reformat: Boolean = ...): KtExpression defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'args' @ [42:87] ==> val args: Pair<KtExpression?, KtExpression?> defined in org.jetbrains.kotlin.idea.intentions.ReplaceUntilWithRangeToIntention.applyTo[LocalVariableDescriptor]

'first' @ [42:92] ==> public final val first: KtExpression? defined in kotlin.Pair[DeserializedPropertyDescriptor]

'args' @ [42:109] ==> val args: Pair<KtExpression?, KtExpression?> defined in org.jetbrains.kotlin.idea.intentions.ReplaceUntilWithRangeToIntention.applyTo[LocalVariableDescriptor]

'second' @ [42:114] ==> public final val second: KtExpression? defined in kotlin.Pair[DeserializedPropertyDescriptor]

