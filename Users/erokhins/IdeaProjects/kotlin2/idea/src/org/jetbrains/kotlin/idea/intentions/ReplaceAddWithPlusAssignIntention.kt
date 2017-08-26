'SelfTargetingOffsetIndependentIntention<KtDotQualifiedExpression>' @ [32:43] ==> public constructor SelfTargetingOffsetIndependentIntention<TElement : KtElement>(elementType: Class<KtDotQualifiedExpression>, text: String, familyName: String = ...) defined in org.jetbrains.kotlin.idea.intentions.SelfTargetingOffsetIndependentIntention[DeserializedClassConstructorDescriptor]
Inferred types:
    <TElement : KtElement> -> KtDotQualifiedExpression

'KtDotQualifiedExpression' @ [32:109] ==> public companion object defined in org.jetbrains.kotlin.psi.KtDotQualifiedExpression[FakeCallableDescriptorForObject]

'java' @ [32:141] ==> public val <T> KClass<KtDotQualifiedExpression>.java: Class<KtDotQualifiedExpression> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtDotQualifiedExpression

'element' @ [34:13] ==> value-parameter element: KtDotQualifiedExpression defined in org.jetbrains.kotlin.idea.intentions.ReplaceAddWithPlusAssignIntention.isApplicableTo[ValueParameterDescriptorImpl]

'callExpression' @ [34:21] ==> public val KtQualifiedExpression.callExpression: KtCallExpression? defined in org.jetbrains.kotlin.idea.intentions in file Utils.kt[PropertyDescriptorImpl]

'valueArguments' @ [34:37] ==> public final val KtCallExpression.valueArguments: (MutableList<(KtValueArgument..KtValueArgument?)>..List<(KtValueArgument..KtValueArgument?)>)[MyPropertyDescriptor]

'size' @ [34:53] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'when (element.calleeName) {
            "add" -> text = "Replace 'add()' with '+='"
            "addAll" -> text = "Replace 'addAll()' with '+='"
            else -> return false
        }' @ [36:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'element' @ [36:15] ==> value-parameter element: KtDotQualifiedExpression defined in org.jetbrains.kotlin.idea.intentions.ReplaceAddWithPlusAssignIntention.isApplicableTo[ValueParameterDescriptorImpl]

'calleeName' @ [36:23] ==> public val KtQualifiedExpression.calleeName: String? defined in org.jetbrains.kotlin.idea.intentions in file Utils.kt[PropertyDescriptorImpl]

'text' @ [37:22] ==> public final var ReplaceAddWithPlusAssignIntention.text: String[MyPropertyDescriptor]

'text' @ [38:25] ==> public final var ReplaceAddWithPlusAssignIntention.text: String[MyPropertyDescriptor]

'element' @ [42:23] ==> value-parameter element: KtDotQualifiedExpression defined in org.jetbrains.kotlin.idea.intentions.ReplaceAddWithPlusAssignIntention.isApplicableTo[ValueParameterDescriptorImpl]

'analyze' @ [42:31] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'PARTIAL' @ [42:55] ==> enum entry PARTIAL defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'?:' @ [43:9] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: Unit?, right: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> Unit

'extractVariableDescriptorFromReference' @ [43:29] ==> @Nullable public open fun extractVariableDescriptorFromReference(@NotNull p0: BindingContext, @Nullable p1: KtElement?): VariableDescriptor? defined in org.jetbrains.kotlin.resolve.BindingContextUtils[JavaMethodDescriptor]

'context' @ [43:68] ==> val context: BindingContext defined in org.jetbrains.kotlin.idea.intentions.ReplaceAddWithPlusAssignIntention.isApplicableTo[LocalVariableDescriptor]

'element' @ [43:77] ==> value-parameter element: KtDotQualifiedExpression defined in org.jetbrains.kotlin.idea.intentions.ReplaceAddWithPlusAssignIntention.isApplicableTo[ValueParameterDescriptorImpl]

'receiverExpression' @ [43:85] ==> public open val receiverExpression: KtExpression defined in org.jetbrains.kotlin.psi.KtDotQualifiedExpression[DeserializedPropertyDescriptor]

'let' @ [43:106] ==> @InlineOnly public inline fun <T, R> VariableDescriptor.let(block: (VariableDescriptor) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> VariableDescriptor
    <R> -> Unit

'it' @ [44:17] ==> value-parameter it: VariableDescriptor defined in org.jetbrains.kotlin.idea.intentions.ReplaceAddWithPlusAssignIntention.isApplicableTo.<anonymous>[ValueParameterDescriptorImpl]

'isVar' @ [44:20] ==> public final val VariableDescriptor.isVar: Boolean[MyPropertyDescriptor]

'element' @ [47:28] ==> value-parameter element: KtDotQualifiedExpression defined in org.jetbrains.kotlin.idea.intentions.ReplaceAddWithPlusAssignIntention.isApplicableTo[ValueParameterDescriptorImpl]

'getResolvedCall' @ [47:36] ==> public fun KtElement?.getResolvedCall(context: BindingContext): ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.resolve.calls.callUtil[DeserializedSimpleFunctionDescriptor]

'context' @ [47:52] ==> val context: BindingContext defined in org.jetbrains.kotlin.idea.intentions.ReplaceAddWithPlusAssignIntention.isApplicableTo[LocalVariableDescriptor]

'getClassDescriptorForType' @ [48:45] ==> @NotNull public open fun getClassDescriptorForType(@NotNull p0: KotlinType): ClassDescriptor defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'resolvedCall' @ [48:71] ==> val resolvedCall: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.idea.intentions.ReplaceAddWithPlusAssignIntention.isApplicableTo[LocalVariableDescriptor]

'getExplicitReceiverValue' @ [48:84] ==> public fun ResolvedCall<*>.getExplicitReceiverValue(): ReceiverValue? defined in org.jetbrains.kotlin.resolve.calls.resolvedCallUtil[DeserializedSimpleFunctionDescriptor]

'type' @ [48:112] ==> public final val ReceiverValue.type: KotlinType[MyPropertyDescriptor]

'receiverClass' @ [49:16] ==> val receiverClass: ClassDescriptor defined in org.jetbrains.kotlin.idea.intentions.ReplaceAddWithPlusAssignIntention.isApplicableTo[LocalVariableDescriptor]

'isSubclassOf' @ [49:30] ==> public fun ClassDescriptor.isSubclassOf(superclass: ClassDescriptor): Boolean defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedSimpleFunctionDescriptor]

'Instance' @ [49:59] ==> @JvmStatic public final val Instance: DefaultBuiltIns defined in org.jetbrains.kotlin.builtins.DefaultBuiltIns.Companion[DeserializedPropertyDescriptor]

'mutableCollection' @ [49:68] ==> public final val DefaultBuiltIns.mutableCollection: ClassDescriptor[MyPropertyDescriptor]

'element' @ [53:9] ==> value-parameter element: KtDotQualifiedExpression defined in org.jetbrains.kotlin.idea.intentions.ReplaceAddWithPlusAssignIntention.applyTo[ValueParameterDescriptorImpl]

'replace' @ [53:17] ==> @NotNull public open fun replace(@NotNull p0: PsiElement): PsiElement defined in org.jetbrains.kotlin.psi.KtDotQualifiedExpression[JavaMethodDescriptor]

'KtPsiFactory' @ [53:25] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'element' @ [53:38] ==> value-parameter element: KtDotQualifiedExpression defined in org.jetbrains.kotlin.idea.intentions.ReplaceAddWithPlusAssignIntention.applyTo[ValueParameterDescriptorImpl]

'createExpressionByPattern' @ [53:47] ==> public fun KtPsiFactory.createExpressionByPattern(pattern: String, vararg args: Any, reformat: Boolean = ...): KtExpression defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'element' @ [53:85] ==> value-parameter element: KtDotQualifiedExpression defined in org.jetbrains.kotlin.idea.intentions.ReplaceAddWithPlusAssignIntention.applyTo[ValueParameterDescriptorImpl]

'receiverExpression' @ [53:93] ==> public open val receiverExpression: KtExpression defined in org.jetbrains.kotlin.psi.KtDotQualifiedExpression[DeserializedPropertyDescriptor]

'element' @ [54:73] ==> value-parameter element: KtDotQualifiedExpression defined in org.jetbrains.kotlin.idea.intentions.ReplaceAddWithPlusAssignIntention.applyTo[ValueParameterDescriptorImpl]

'callExpression' @ [54:81] ==> public val KtQualifiedExpression.callExpression: KtCallExpression? defined in org.jetbrains.kotlin.idea.intentions in file Utils.kt[PropertyDescriptorImpl]

'valueArguments' @ [54:97] ==> public final val KtCallExpression.valueArguments: (MutableList<(KtValueArgument..KtValueArgument?)>..List<(KtValueArgument..KtValueArgument?)>)[MyPropertyDescriptor]

'get' @ [54:113] ==> public abstract fun get(index: Int): (KtValueArgument..KtValueArgument?) defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'getArgumentExpression' @ [54:121] ==> @IfNotParsed @Nullable public open fun getArgumentExpression(): KtExpression? defined in org.jetbrains.kotlin.psi.KtValueArgument[JavaMethodDescriptor]

