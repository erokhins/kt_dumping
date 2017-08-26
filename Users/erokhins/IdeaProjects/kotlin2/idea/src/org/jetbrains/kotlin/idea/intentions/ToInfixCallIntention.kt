'SelfTargetingIntention<KtCallExpression>' @ [27:30] ==> public constructor SelfTargetingIntention<TElement : PsiElement>(elementType: Class<KtCallExpression>, text: String, familyName: String = ...) defined in org.jetbrains.kotlin.idea.intentions.SelfTargetingIntention[DeserializedClassConstructorDescriptor]
Inferred types:
    <TElement : PsiElement> -> KtCallExpression

'KtCallExpression' @ [27:71] ==> public constructor KtCallExpression(@NotNull p0: ASTNode) defined in org.jetbrains.kotlin.psi.KtCallExpression[JavaClassConstructorDescriptor]

'java' @ [27:95] ==> public val <T> KClass<KtCallExpression>.java: Class<KtCallExpression> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtCallExpression

'element' @ [29:26] ==> value-parameter element: KtCallExpression defined in org.jetbrains.kotlin.idea.intentions.ToInfixCallIntention.isApplicableTo[ValueParameterDescriptorImpl]

'calleeExpression' @ [29:34] ==> public final val KtCallExpression.calleeExpression: KtExpression?[MyPropertyDescriptor]

'!' @ [30:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'calleeExpr' @ [30:14] ==> val calleeExpr: KtNameReferenceExpression defined in org.jetbrains.kotlin.idea.intentions.ToInfixCallIntention.isApplicableTo[LocalVariableDescriptor]

'textRange' @ [30:25] ==> public final val KtNameReferenceExpression.textRange: (TextRange..TextRange?)[MyPropertyDescriptor]

'containsOffset' @ [30:35] ==> public open fun containsOffset(p0: Int): Boolean defined in com.intellij.openapi.util.TextRange[JavaMethodDescriptor]

'caretOffset' @ [30:50] ==> value-parameter caretOffset: Int defined in org.jetbrains.kotlin.idea.intentions.ToInfixCallIntention.isApplicableTo[ValueParameterDescriptorImpl]

'element' @ [32:28] ==> value-parameter element: KtCallExpression defined in org.jetbrains.kotlin.idea.intentions.ToInfixCallIntention.isApplicableTo[ValueParameterDescriptorImpl]

'getQualifiedExpressionForSelector' @ [32:36] ==> public fun KtElement.getQualifiedExpressionForSelector(): KtQualifiedExpression? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'element' @ [34:13] ==> value-parameter element: KtCallExpression defined in org.jetbrains.kotlin.idea.intentions.ToInfixCallIntention.isApplicableTo[ValueParameterDescriptorImpl]

'typeArgumentList' @ [34:21] ==> public final val KtCallExpression.typeArgumentList: KtTypeArgumentList?[MyPropertyDescriptor]

'element' @ [36:24] ==> value-parameter element: KtCallExpression defined in org.jetbrains.kotlin.idea.intentions.ToInfixCallIntention.isApplicableTo[ValueParameterDescriptorImpl]

'valueArguments' @ [36:32] ==> public final val KtCallExpression.valueArguments: (MutableList<(KtValueArgument..KtValueArgument?)>..List<(KtValueArgument..KtValueArgument?)>)[MyPropertyDescriptor]

'singleOrNull' @ [36:47] ==> public fun <T> List<(KtValueArgument..KtValueArgument?)>.singleOrNull(): KtValueArgument? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtValueArgument..org.jetbrains.kotlin.psi.KtValueArgument?)

'argument' @ [37:13] ==> val argument: KtValueArgument defined in org.jetbrains.kotlin.idea.intentions.ToInfixCallIntention.isApplicableTo[LocalVariableDescriptor]

'isNamed' @ [37:22] ==> public open fun isNamed(): Boolean defined in org.jetbrains.kotlin.psi.KtValueArgument[JavaMethodDescriptor]

'argument' @ [38:13] ==> val argument: KtValueArgument defined in org.jetbrains.kotlin.idea.intentions.ToInfixCallIntention.isApplicableTo[LocalVariableDescriptor]

'getArgumentExpression' @ [38:22] ==> @IfNotParsed @Nullable public open fun getArgumentExpression(): KtExpression? defined in org.jetbrains.kotlin.psi.KtValueArgument[JavaMethodDescriptor]

'element' @ [40:30] ==> value-parameter element: KtCallExpression defined in org.jetbrains.kotlin.idea.intentions.ToInfixCallIntention.isApplicableTo[ValueParameterDescriptorImpl]

'analyze' @ [40:38] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'PARTIAL' @ [40:62] ==> enum entry PARTIAL defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'element' @ [41:28] ==> value-parameter element: KtCallExpression defined in org.jetbrains.kotlin.idea.intentions.ToInfixCallIntention.isApplicableTo[ValueParameterDescriptorImpl]

'getResolvedCall' @ [41:36] ==> public fun KtElement?.getResolvedCall(context: BindingContext): ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.resolve.calls.callUtil[DeserializedSimpleFunctionDescriptor]

'bindingContext' @ [41:52] ==> val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.intentions.ToInfixCallIntention.isApplicableTo[LocalVariableDescriptor]

'resolvedCall' @ [42:24] ==> val resolvedCall: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.idea.intentions.ToInfixCallIntention.isApplicableTo[LocalVariableDescriptor]

'resultingDescriptor' @ [42:37] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.resultingDescriptor: CallableDescriptor[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> CallableDescriptor

'!' @ [43:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'function' @ [43:14] ==> val function: FunctionDescriptor defined in org.jetbrains.kotlin.idea.intentions.ToInfixCallIntention.isApplicableTo[LocalVariableDescriptor]

'isInfix' @ [43:23] ==> public final val FunctionDescriptor.isInfix: Boolean[MyPropertyDescriptor]

'bindingContext' @ [46:13] ==> val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.intentions.ToInfixCallIntention.isApplicableTo[LocalVariableDescriptor]

'getType' @ [46:28] ==> @Nullable public abstract fun getType(@NotNull p0: KtExpression): KotlinType? defined in org.jetbrains.kotlin.resolve.BindingContext[JavaMethodDescriptor]

'dotQualified' @ [46:36] ==> val dotQualified: KtQualifiedExpression defined in org.jetbrains.kotlin.idea.intentions.ToInfixCallIntention.isApplicableTo[LocalVariableDescriptor]

'receiverExpression' @ [46:49] ==> public open val receiverExpression: KtExpression defined in org.jetbrains.kotlin.psi.KtQualifiedExpression[DeserializedPropertyDescriptor]

'element' @ [52:28] ==> value-parameter element: KtCallExpression defined in org.jetbrains.kotlin.idea.intentions.ToInfixCallIntention.applyTo[ValueParameterDescriptorImpl]

'parent' @ [52:36] ==> public final val KtCallExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'dotQualified' @ [53:24] ==> val dotQualified: KtDotQualifiedExpression defined in org.jetbrains.kotlin.idea.intentions.ToInfixCallIntention.applyTo[LocalVariableDescriptor]

'receiverExpression' @ [53:37] ==> public open val receiverExpression: KtExpression defined in org.jetbrains.kotlin.psi.KtDotQualifiedExpression[DeserializedPropertyDescriptor]

'element' @ [54:24] ==> value-parameter element: KtCallExpression defined in org.jetbrains.kotlin.idea.intentions.ToInfixCallIntention.applyTo[ValueParameterDescriptorImpl]

'valueArguments' @ [54:32] ==> public final val KtCallExpression.valueArguments: (MutableList<(KtValueArgument..KtValueArgument?)>..List<(KtValueArgument..KtValueArgument?)>)[MyPropertyDescriptor]

'single' @ [54:47] ==> public fun <T> List<(KtValueArgument..KtValueArgument?)>.single(): (KtValueArgument..KtValueArgument?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtValueArgument..org.jetbrains.kotlin.psi.KtValueArgument?)

'getArgumentExpression' @ [54:56] ==> @IfNotParsed @Nullable public open fun getArgumentExpression(): KtExpression? defined in org.jetbrains.kotlin.psi.KtValueArgument[JavaMethodDescriptor]

'element' @ [55:20] ==> value-parameter element: KtCallExpression defined in org.jetbrains.kotlin.idea.intentions.ToInfixCallIntention.applyTo[ValueParameterDescriptorImpl]

'calleeExpression' @ [55:28] ==> public final val KtCallExpression.calleeExpression: KtExpression?[MyPropertyDescriptor]

'text' @ [55:47] ==> public final val KtExpression.text: (String..String?)[MyPropertyDescriptor]

'KtPsiFactory' @ [57:23] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'element' @ [57:36] ==> value-parameter element: KtCallExpression defined in org.jetbrains.kotlin.idea.intentions.ToInfixCallIntention.applyTo[ValueParameterDescriptorImpl]

'createExpressionByPattern' @ [57:45] ==> public fun KtPsiFactory.createExpressionByPattern(pattern: String, vararg args: Any, reformat: Boolean = ...): KtExpression defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'name' @ [57:76] ==> val name: (String..String?) defined in org.jetbrains.kotlin.idea.intentions.ToInfixCallIntention.applyTo[LocalVariableDescriptor]

'receiver' @ [57:86] ==> val receiver: KtExpression defined in org.jetbrains.kotlin.idea.intentions.ToInfixCallIntention.applyTo[LocalVariableDescriptor]

'argument' @ [57:96] ==> val argument: KtExpression defined in org.jetbrains.kotlin.idea.intentions.ToInfixCallIntention.applyTo[LocalVariableDescriptor]

'dotQualified' @ [58:9] ==> val dotQualified: KtDotQualifiedExpression defined in org.jetbrains.kotlin.idea.intentions.ToInfixCallIntention.applyTo[LocalVariableDescriptor]

'replace' @ [58:22] ==> @NotNull public open fun replace(@NotNull p0: PsiElement): PsiElement defined in org.jetbrains.kotlin.psi.KtDotQualifiedExpression[JavaMethodDescriptor]

'newCall' @ [58:30] ==> val newCall: KtExpression defined in org.jetbrains.kotlin.idea.intentions.ToInfixCallIntention.applyTo[LocalVariableDescriptor]

