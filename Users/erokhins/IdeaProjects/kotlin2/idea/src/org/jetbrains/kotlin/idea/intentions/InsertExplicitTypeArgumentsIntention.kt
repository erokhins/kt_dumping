'SelfTargetingRangeIntention<KtCallExpression>' @ [34:46] ==> public constructor SelfTargetingRangeIntention<TElement : PsiElement>(elementType: Class<KtCallExpression>, text: String, familyName: String = ...) defined in org.jetbrains.kotlin.idea.intentions.SelfTargetingRangeIntention[DeserializedClassConstructorDescriptor]
Inferred types:
    <TElement : PsiElement> -> KtCallExpression

'KtCallExpression' @ [34:92] ==> public constructor KtCallExpression(@NotNull p0: ASTNode) defined in org.jetbrains.kotlin.psi.KtCallExpression[JavaClassConstructorDescriptor]

'java' @ [34:116] ==> public val <T> KClass<KtCallExpression>.java: Class<KtCallExpression> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtCallExpression

'if (isApplicableTo(element, element.analyze())) element.calleeExpression!!.textRange else null' @ [36:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: TextRange?, elseBranch: TextRange?): TextRange?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> TextRange?

'isApplicableTo' @ [36:20] ==> public final fun isApplicableTo(element: KtCallElement, bindingContext: BindingContext = ...): Boolean defined in org.jetbrains.kotlin.idea.intentions.InsertExplicitTypeArgumentsIntention.Companion[SimpleFunctionDescriptorImpl]

'element' @ [36:35] ==> value-parameter element: KtCallExpression defined in org.jetbrains.kotlin.idea.intentions.InsertExplicitTypeArgumentsIntention.applicabilityRange[ValueParameterDescriptorImpl]

'element' @ [36:44] ==> value-parameter element: KtCallExpression defined in org.jetbrains.kotlin.idea.intentions.InsertExplicitTypeArgumentsIntention.applicabilityRange[ValueParameterDescriptorImpl]

'analyze' @ [36:52] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'element' @ [36:64] ==> value-parameter element: KtCallExpression defined in org.jetbrains.kotlin.idea.intentions.InsertExplicitTypeArgumentsIntention.applicabilityRange[ValueParameterDescriptorImpl]

'calleeExpression' @ [36:72] ==> public final val KtCallExpression.calleeExpression: KtExpression?[MyPropertyDescriptor]

'textRange' @ [36:91] ==> public final val KtExpression.textRange: (TextRange..TextRange?)[MyPropertyDescriptor]

'applyTo' @ [39:72] ==> public final fun applyTo(element: KtCallElement, shortenReferences: Boolean = ...): Unit defined in org.jetbrains.kotlin.idea.intentions.InsertExplicitTypeArgumentsIntention.Companion[SimpleFunctionDescriptorImpl]

'element' @ [39:80] ==> value-parameter element: KtCallExpression defined in org.jetbrains.kotlin.idea.intentions.InsertExplicitTypeArgumentsIntention.applyTo[ValueParameterDescriptorImpl]

'element' @ [42:85] ==> value-parameter element: KtCallElement defined in org.jetbrains.kotlin.idea.intentions.InsertExplicitTypeArgumentsIntention.Companion.isApplicableTo[ValueParameterDescriptorImpl]

'analyze' @ [42:93] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'PARTIAL' @ [42:117] ==> enum entry PARTIAL defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'!' @ [43:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'element' @ [43:18] ==> value-parameter element: KtCallElement defined in org.jetbrains.kotlin.idea.intentions.InsertExplicitTypeArgumentsIntention.Companion.isApplicableTo[ValueParameterDescriptorImpl]

'typeArguments' @ [43:26] ==> public final val KtCallElement.typeArguments: (MutableList<(KtTypeProjection..KtTypeProjection?)>..List<(KtTypeProjection..KtTypeProjection?)>)[MyPropertyDescriptor]

'isEmpty' @ [43:40] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'element' @ [44:17] ==> value-parameter element: KtCallElement defined in org.jetbrains.kotlin.idea.intentions.InsertExplicitTypeArgumentsIntention.Companion.isApplicableTo[ValueParameterDescriptorImpl]

'calleeExpression' @ [44:25] ==> public final val KtCallElement.calleeExpression: KtExpression?[MyPropertyDescriptor]

'element' @ [46:32] ==> value-parameter element: KtCallElement defined in org.jetbrains.kotlin.idea.intentions.InsertExplicitTypeArgumentsIntention.Companion.isApplicableTo[ValueParameterDescriptorImpl]

'getResolvedCall' @ [46:40] ==> public fun KtElement?.getResolvedCall(context: BindingContext): ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.resolve.calls.callUtil[DeserializedSimpleFunctionDescriptor]

'bindingContext' @ [46:56] ==> value-parameter bindingContext: BindingContext = ... defined in org.jetbrains.kotlin.idea.intentions.InsertExplicitTypeArgumentsIntention.Companion.isApplicableTo[ValueParameterDescriptorImpl]

'resolvedCall' @ [47:28] ==> val resolvedCall: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.idea.intentions.InsertExplicitTypeArgumentsIntention.Companion.isApplicableTo[LocalVariableDescriptor]

'typeArguments' @ [47:41] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.typeArguments: (MutableMap<(TypeParameterDescriptor..TypeParameterDescriptor?), (KotlinType..KotlinType?)>..Map<(TypeParameterDescriptor..TypeParameterDescriptor?), (KotlinType..KotlinType?)>)[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> Captured(out CallableDescriptor)

'typeArgs' @ [48:20] ==> val typeArgs: (MutableMap<(TypeParameterDescriptor..TypeParameterDescriptor?), (KotlinType..KotlinType?)>..Map<(TypeParameterDescriptor..TypeParameterDescriptor?), (KotlinType..KotlinType?)>) defined in org.jetbrains.kotlin.idea.intentions.InsertExplicitTypeArgumentsIntention.Companion.isApplicableTo[LocalVariableDescriptor]

'isNotEmpty' @ [48:29] ==> @InlineOnly public inline fun <K, V> Map<out (TypeParameterDescriptor..TypeParameterDescriptor?), (KotlinType..KotlinType?)>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> (org.jetbrains.kotlin.descriptors.TypeParameterDescriptor..org.jetbrains.kotlin.descriptors.TypeParameterDescriptor?)
    <V> -> (org.jetbrains.kotlin.types.KotlinType..org.jetbrains.kotlin.types.KotlinType?)

'typeArgs' @ [48:45] ==> val typeArgs: (MutableMap<(TypeParameterDescriptor..TypeParameterDescriptor?), (KotlinType..KotlinType?)>..Map<(TypeParameterDescriptor..TypeParameterDescriptor?), (KotlinType..KotlinType?)>) defined in org.jetbrains.kotlin.idea.intentions.InsertExplicitTypeArgumentsIntention.Companion.isApplicableTo[LocalVariableDescriptor]

'values' @ [48:54] ==> public abstract val values: MutableCollection<(KotlinType..KotlinType?)> defined in kotlin.collections.MutableMap[DeserializedPropertyDescriptor]

'none' @ [48:61] ==> public inline fun <T> Iterable<(KotlinType..KotlinType?)>.none(predicate: ((KotlinType..KotlinType?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.types.KotlinType..org.jetbrains.kotlin.types.KotlinType?)

'containsErrorType' @ [48:79] ==> public open fun containsErrorType(@Nullable p0: KotlinType?): Boolean defined in org.jetbrains.kotlin.types.ErrorUtils[JavaMethodDescriptor]

'it' @ [48:97] ==> value-parameter it: (KotlinType..KotlinType?) defined in org.jetbrains.kotlin.idea.intentions.InsertExplicitTypeArgumentsIntention.Companion.isApplicableTo.<anonymous>[ValueParameterDescriptorImpl]

'createTypeArguments' @ [52:32] ==> public final fun createTypeArguments(element: KtCallElement, bindingContext: BindingContext): KtTypeArgumentList? defined in org.jetbrains.kotlin.idea.intentions.InsertExplicitTypeArgumentsIntention.Companion[SimpleFunctionDescriptorImpl]

'element' @ [52:52] ==> value-parameter element: KtCallElement defined in org.jetbrains.kotlin.idea.intentions.InsertExplicitTypeArgumentsIntention.Companion.applyTo[ValueParameterDescriptorImpl]

'element' @ [52:61] ==> value-parameter element: KtCallElement defined in org.jetbrains.kotlin.idea.intentions.InsertExplicitTypeArgumentsIntention.Companion.applyTo[ValueParameterDescriptorImpl]

'analyze' @ [52:69] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'element' @ [54:26] ==> value-parameter element: KtCallElement defined in org.jetbrains.kotlin.idea.intentions.InsertExplicitTypeArgumentsIntention.Companion.applyTo[ValueParameterDescriptorImpl]

'calleeExpression' @ [54:34] ==> public final val KtCallElement.calleeExpression: KtExpression?[MyPropertyDescriptor]

'element' @ [55:35] ==> value-parameter element: KtCallElement defined in org.jetbrains.kotlin.idea.intentions.InsertExplicitTypeArgumentsIntention.Companion.applyTo[ValueParameterDescriptorImpl]

'addAfter' @ [55:43] ==> public abstract fun addAfter(@NotNull p0: PsiElement, @Nullable p1: PsiElement?): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtCallElement[JavaMethodDescriptor]

'argumentList' @ [55:52] ==> val argumentList: KtTypeArgumentList defined in org.jetbrains.kotlin.idea.intentions.InsertExplicitTypeArgumentsIntention.Companion.applyTo[LocalVariableDescriptor]

'callee' @ [55:66] ==> val callee: KtExpression defined in org.jetbrains.kotlin.idea.intentions.InsertExplicitTypeArgumentsIntention.Companion.applyTo[LocalVariableDescriptor]

'shortenReferences' @ [57:17] ==> value-parameter shortenReferences: Boolean = ... defined in org.jetbrains.kotlin.idea.intentions.InsertExplicitTypeArgumentsIntention.Companion.applyTo[ValueParameterDescriptorImpl]

'ShortenReferences' @ [58:17] ==> public companion object defined in org.jetbrains.kotlin.idea.core.ShortenReferences[FakeCallableDescriptorForObject]

'DEFAULT' @ [58:35] ==> @field:JvmField public final val DEFAULT: ShortenReferences defined in org.jetbrains.kotlin.idea.core.ShortenReferences.Companion[DeserializedPropertyDescriptor]

'process' @ [58:43] ==> @JvmOverloads public final fun process(element: KtElement, elementFilter: (PsiElement) -> ShortenReferences.FilterResult = ...): KtElement defined in org.jetbrains.kotlin.idea.core.ShortenReferences[DeserializedSimpleFunctionDescriptor]

'newArgumentList' @ [58:51] ==> val newArgumentList: KtTypeArgumentList defined in org.jetbrains.kotlin.idea.intentions.InsertExplicitTypeArgumentsIntention.Companion.applyTo[LocalVariableDescriptor]

'element' @ [63:32] ==> value-parameter element: KtCallElement defined in org.jetbrains.kotlin.idea.intentions.InsertExplicitTypeArgumentsIntention.Companion.createTypeArguments[ValueParameterDescriptorImpl]

'getResolvedCall' @ [63:40] ==> public fun KtElement?.getResolvedCall(context: BindingContext): ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.resolve.calls.callUtil[DeserializedSimpleFunctionDescriptor]

'bindingContext' @ [63:56] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.intentions.InsertExplicitTypeArgumentsIntention.Companion.createTypeArguments[ValueParameterDescriptorImpl]

'resolvedCall' @ [65:24] ==> val resolvedCall: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.idea.intentions.InsertExplicitTypeArgumentsIntention.Companion.createTypeArguments[LocalVariableDescriptor]

'typeArguments' @ [65:37] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.typeArguments: (MutableMap<(TypeParameterDescriptor..TypeParameterDescriptor?), (KotlinType..KotlinType?)>..Map<(TypeParameterDescriptor..TypeParameterDescriptor?), (KotlinType..KotlinType?)>)[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> Captured(out CallableDescriptor)

'resolvedCall' @ [66:25] ==> val resolvedCall: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.idea.intentions.InsertExplicitTypeArgumentsIntention.Companion.createTypeArguments[LocalVariableDescriptor]

'candidateDescriptor' @ [66:38] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.candidateDescriptor: CallableDescriptor[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> Captured(out CallableDescriptor)

'typeParameters' @ [66:58] ==> public final val CallableDescriptor.typeParameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)>[MyPropertyDescriptor]

'types' @ [68:24] ==> val types: List<(TypeParameterDescriptor..TypeParameterDescriptor?)> defined in org.jetbrains.kotlin.idea.intentions.InsertExplicitTypeArgumentsIntention.Companion.createTypeArguments[LocalVariableDescriptor]

'joinToString' @ [68:30] ==> public fun <T> Iterable<(TypeParameterDescriptor..TypeParameterDescriptor?)>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: (((TypeParameterDescriptor..TypeParameterDescriptor?)) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.TypeParameterDescriptor..org.jetbrains.kotlin.descriptors.TypeParameterDescriptor?)

'IdeDescriptorRenderers' @ [68:61] ==> public object IdeDescriptorRenderers defined in org.jetbrains.kotlin.idea.util[FakeCallableDescriptorForObject]

'SOURCE_CODE' @ [68:84] ==> @field:JvmField public final val SOURCE_CODE: DescriptorRenderer defined in org.jetbrains.kotlin.idea.util.IdeDescriptorRenderers[DeserializedPropertyDescriptor]

'renderType' @ [68:96] ==> public abstract fun renderType(type: KotlinType): String defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[DeserializedSimpleFunctionDescriptor]

'args' @ [68:107] ==> val args: (MutableMap<(TypeParameterDescriptor..TypeParameterDescriptor?), (KotlinType..KotlinType?)>..Map<(TypeParameterDescriptor..TypeParameterDescriptor?), (KotlinType..KotlinType?)>) defined in org.jetbrains.kotlin.idea.intentions.InsertExplicitTypeArgumentsIntention.Companion.createTypeArguments[LocalVariableDescriptor]

'it' @ [68:112] ==> value-parameter it: (TypeParameterDescriptor..TypeParameterDescriptor?) defined in org.jetbrains.kotlin.idea.intentions.InsertExplicitTypeArgumentsIntention.Companion.createTypeArguments.<anonymous>[ValueParameterDescriptorImpl]

'KtPsiFactory' @ [70:20] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'element' @ [70:33] ==> value-parameter element: KtCallElement defined in org.jetbrains.kotlin.idea.intentions.InsertExplicitTypeArgumentsIntention.Companion.createTypeArguments[ValueParameterDescriptorImpl]

'createTypeArguments' @ [70:42] ==> public final fun createTypeArguments(text: String): KtTypeArgumentList defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'text' @ [70:62] ==> val text: String defined in org.jetbrains.kotlin.idea.intentions.InsertExplicitTypeArgumentsIntention.Companion.createTypeArguments[LocalVariableDescriptor]

