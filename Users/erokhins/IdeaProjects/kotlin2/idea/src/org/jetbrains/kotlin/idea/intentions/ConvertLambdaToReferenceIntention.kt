'IntentionBasedInspection<KtLambdaExpression>' @ [43:44] ==> public constructor IntentionBasedInspection<TElement : PsiElement>(intention: KClass<out SelfTargetingRangeIntention<KtLambdaExpression>>, problemText: String? = ...) defined in org.jetbrains.kotlin.idea.inspections.IntentionBasedInspection[DeserializedClassConstructorDescriptor]
Inferred types:
    <TElement : PsiElement> -> KtLambdaExpression

'ConvertLambdaToReferenceIntention' @ [43:89] ==> public companion object defined in org.jetbrains.kotlin.idea.intentions.ConvertLambdaToReferenceIntention[FakeCallableDescriptorForObject]

'SelfTargetingOffsetIndependentIntention<KtLambdaExpression>' @ [46:9] ==> public constructor SelfTargetingOffsetIndependentIntention<TElement : KtElement>(elementType: Class<KtLambdaExpression>, text: String, familyName: String = ...) defined in org.jetbrains.kotlin.idea.intentions.SelfTargetingOffsetIndependentIntention[DeserializedClassConstructorDescriptor]
Inferred types:
    <TElement : KtElement> -> KtLambdaExpression

'KtLambdaExpression' @ [46:69] ==> public constructor KtLambdaExpression(p0: (CharSequence..CharSequence?)) defined in org.jetbrains.kotlin.psi.KtLambdaExpression[JavaClassConstructorDescriptor]

'java' @ [46:95] ==> public val <T> KClass<KtLambdaExpression>.java: Class<KtLambdaExpression> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtLambdaExpression

'text' @ [46:101] ==> value-parameter text: String defined in org.jetbrains.kotlin.idea.intentions.ConvertLambdaToReferenceIntention.<init>[ValueParameterDescriptorImpl]

'Suppress' @ [48:5] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'this' @ [49:20] ==> public constructor ConvertLambdaToReferenceIntention(text: String) defined in org.jetbrains.kotlin.idea.intentions.ConvertLambdaToReferenceIntention[ClassConstructorDescriptorImpl]

'buildReferenceText' @ [51:64] ==> private final fun buildReferenceText(lambdaExpression: KtLambdaExpression, shortTypes: Boolean): String? defined in org.jetbrains.kotlin.idea.intentions.ConvertLambdaToReferenceIntention.Companion[SimpleFunctionDescriptorImpl]

'element' @ [51:102] ==> value-parameter element: KtLambdaExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertLambdaToReferenceIntention.buildReferenceText[ValueParameterDescriptorImpl]

'parent' @ [54:35] ==> public final val KtLambdaArgument.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'outerCallExpression' @ [55:23] ==> val outerCallExpression: KtCallExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertLambdaToReferenceIntention.outerCalleeDescriptor[LocalVariableDescriptor]

'analyze' @ [55:43] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'outerCallExpression' @ [56:27] ==> val outerCallExpression: KtCallExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertLambdaToReferenceIntention.outerCalleeDescriptor[LocalVariableDescriptor]

'calleeExpression' @ [56:47] ==> public final val KtCallExpression.calleeExpression: KtExpression?[MyPropertyDescriptor]

'context' @ [57:16] ==> val context: BindingContext defined in org.jetbrains.kotlin.idea.intentions.ConvertLambdaToReferenceIntention.outerCalleeDescriptor[LocalVariableDescriptor]

'REFERENCE_TARGET' @ [57:24] ==> public final val REFERENCE_TARGET: (WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>..WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'outerCallee' @ [57:42] ==> val outerCallee: KtReferenceExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertLambdaToReferenceIntention.outerCalleeDescriptor[LocalVariableDescriptor]

'callableExpression' @ [66:23] ==> value-parameter callableExpression: KtExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertLambdaToReferenceIntention.isConvertibleCallInLambda[ValueParameterDescriptorImpl]

'analyze' @ [66:42] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'when (callableExpression) {
            is KtCallExpression -> callableExpression.calleeExpression as? KtNameReferenceExpression ?: return false
            is KtNameReferenceExpression -> callableExpression
            else -> return false
        }' @ [67:41] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: KtNameReferenceExpression, entry1: KtNameReferenceExpression, entry2: KtNameReferenceExpression): KtNameReferenceExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> KtNameReferenceExpression

'callableExpression' @ [67:47] ==> value-parameter callableExpression: KtExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertLambdaToReferenceIntention.isConvertibleCallInLambda[ValueParameterDescriptorImpl]

'callableExpression' @ [68:36] ==> value-parameter callableExpression: KtExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertLambdaToReferenceIntention.isConvertibleCallInLambda[ValueParameterDescriptorImpl]

'calleeExpression' @ [68:55] ==> public final val KtCallExpression.calleeExpression: KtExpression?[MyPropertyDescriptor]

'callableExpression' @ [69:45] ==> value-parameter callableExpression: KtExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertLambdaToReferenceIntention.isConvertibleCallInLambda[ValueParameterDescriptorImpl]

'context' @ [72:32] ==> val context: BindingContext defined in org.jetbrains.kotlin.idea.intentions.ConvertLambdaToReferenceIntention.isConvertibleCallInLambda[LocalVariableDescriptor]

'REFERENCE_TARGET' @ [72:40] ==> public final val REFERENCE_TARGET: (WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>..WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'calleeReferenceExpression' @ [72:58] ==> val calleeReferenceExpression: KtNameReferenceExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertLambdaToReferenceIntention.isConvertibleCallInLambda[LocalVariableDescriptor]

'calleeDescriptor' @ [74:13] ==> val calleeDescriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.idea.intentions.ConvertLambdaToReferenceIntention.isConvertibleCallInLambda[LocalVariableDescriptor]

'typeParameters' @ [74:30] ==> public final val CallableMemberDescriptor.typeParameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)>[MyPropertyDescriptor]

'isNotEmpty' @ [74:45] ==> @InlineOnly public inline fun <T> Collection<(TypeParameterDescriptor..TypeParameterDescriptor?)>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.TypeParameterDescriptor..org.jetbrains.kotlin.descriptors.TypeParameterDescriptor?)

'calleeDescriptor' @ [76:13] ==> val calleeDescriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.idea.intentions.ConvertLambdaToReferenceIntention.isConvertibleCallInLambda[LocalVariableDescriptor]

'?:' @ [78:13] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: Boolean?, right: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> Boolean

'calleeDescriptor' @ [78:14] ==> val calleeDescriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.idea.intentions.ConvertLambdaToReferenceIntention.isConvertibleCallInLambda[LocalVariableDescriptor]

'isSuspend' @ [78:56] ==> public final val FunctionDescriptor.isSuspend: Boolean[MyPropertyDescriptor]

'with' @ [80:37] ==> @InlineOnly public inline fun <T, R> with(receiver: CallableMemberDescriptor, block: CallableMemberDescriptor.() -> Boolean): Boolean defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CallableMemberDescriptor
    <R> -> Boolean

'calleeDescriptor' @ [80:42] ==> val calleeDescriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.idea.intentions.ConvertLambdaToReferenceIntention.isConvertibleCallInLambda[LocalVariableDescriptor]

'dispatchReceiverParameter' @ [82:17] ==> public final val CallableMemberDescriptor.dispatchReceiverParameter: ReceiverParameterDescriptor?[MyPropertyDescriptor]

'extensionReceiverParameter' @ [82:54] ==> public final val CallableMemberDescriptor.extensionReceiverParameter: ReceiverParameterDescriptor?[MyPropertyDescriptor]

'dispatchReceiverParameter' @ [83:13] ==> public final val CallableMemberDescriptor.dispatchReceiverParameter: ReceiverParameterDescriptor?[MyPropertyDescriptor]

'extensionReceiverParameter' @ [83:50] ==> public final val CallableMemberDescriptor.extensionReceiverParameter: ReceiverParameterDescriptor?[MyPropertyDescriptor]

'!' @ [86:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'descriptorHasReceiver' @ [86:14] ==> val descriptorHasReceiver: Boolean defined in org.jetbrains.kotlin.idea.intentions.ConvertLambdaToReferenceIntention.isConvertibleCallInLambda[LocalVariableDescriptor]

'explicitReceiver' @ [86:39] ==> value-parameter explicitReceiver: KtExpression? = ... defined in org.jetbrains.kotlin.idea.intentions.ConvertLambdaToReferenceIntention.isConvertibleCallInLambda[ValueParameterDescriptorImpl]

'!' @ [87:33] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'callableExpression' @ [87:34] ==> value-parameter callableExpression: KtExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertLambdaToReferenceIntention.isConvertibleCallInLambda[ValueParameterDescriptorImpl]

'languageVersionSettings' @ [87:53] ==> public val KtElement.languageVersionSettings: LanguageVersionSettings defined in org.jetbrains.kotlin.idea.project[DeserializedPropertyDescriptor]

'supportsFeature' @ [87:77] ==> public open fun supportsFeature(feature: LanguageFeature): Boolean defined in org.jetbrains.kotlin.config.LanguageVersionSettings[DeserializedSimpleFunctionDescriptor]

'LanguageFeature' @ [87:93] ==> public companion object defined in org.jetbrains.kotlin.config.LanguageFeature[FakeCallableDescriptorForObject]

'BoundCallableReferences' @ [87:109] ==> enum entry BoundCallableReferences defined in org.jetbrains.kotlin.config.LanguageFeature[FakeCallableDescriptorForObject]

'noBoundReferences' @ [88:13] ==> val noBoundReferences: Boolean defined in org.jetbrains.kotlin.idea.intentions.ConvertLambdaToReferenceIntention.isConvertibleCallInLambda[LocalVariableDescriptor]

'descriptorHasReceiver' @ [88:34] ==> val descriptorHasReceiver: Boolean defined in org.jetbrains.kotlin.idea.intentions.ConvertLambdaToReferenceIntention.isConvertibleCallInLambda[LocalVariableDescriptor]

'explicitReceiver' @ [88:59] ==> value-parameter explicitReceiver: KtExpression? = ... defined in org.jetbrains.kotlin.idea.intentions.ConvertLambdaToReferenceIntention.isConvertibleCallInLambda[ValueParameterDescriptorImpl]

'?:' @ [90:38] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: Int?, right: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> Int

'callableExpression' @ [90:39] ==> value-parameter callableExpression: KtExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertLambdaToReferenceIntention.isConvertibleCallInLambda[ValueParameterDescriptorImpl]

'valueArguments' @ [90:81] ==> public final val KtCallExpression.valueArguments: (MutableList<(KtValueArgument..KtValueArgument?)>..List<(KtValueArgument..KtValueArgument?)>)[MyPropertyDescriptor]

'size' @ [90:97] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'calleeDescriptor' @ [91:13] ==> val calleeDescriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.idea.intentions.ConvertLambdaToReferenceIntention.isConvertibleCallInLambda[LocalVariableDescriptor]

'valueParameters' @ [91:30] ==> public final val CallableMemberDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'size' @ [91:46] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'callableArgumentsCount' @ [91:54] ==> val callableArgumentsCount: Int defined in org.jetbrains.kotlin.idea.intentions.ConvertLambdaToReferenceIntention.isConvertibleCallInLambda[LocalVariableDescriptor]

'lambdaMustReturnUnit' @ [92:13] ==> value-parameter lambdaMustReturnUnit: Boolean defined in org.jetbrains.kotlin.idea.intentions.ConvertLambdaToReferenceIntention.isConvertibleCallInLambda[ValueParameterDescriptorImpl]

'calleeDescriptor' @ [93:13] ==> val calleeDescriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.idea.intentions.ConvertLambdaToReferenceIntention.isConvertibleCallInLambda[LocalVariableDescriptor]

'returnType' @ [93:30] ==> public final val CallableMemberDescriptor.returnType: KotlinType?[MyPropertyDescriptor]

'let' @ [93:41] ==> @InlineOnly public inline fun <T, R> KotlinType?.let(block: (KotlinType?) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType?
    <R> -> Unit

'it' @ [95:21] ==> value-parameter it: KotlinType? defined in org.jetbrains.kotlin.idea.intentions.ConvertLambdaToReferenceIntention.isConvertibleCallInLambda.<anonymous>[ValueParameterDescriptorImpl]

'!' @ [95:35] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'it' @ [95:36] ==> value-parameter it: KotlinType? defined in org.jetbrains.kotlin.idea.intentions.ConvertLambdaToReferenceIntention.isConvertibleCallInLambda.<anonymous>[ValueParameterDescriptorImpl]

'isUnit' @ [95:39] ==> public fun KotlinType.isUnit(): Boolean defined in org.jetbrains.kotlin.types.typeUtil[DeserializedSimpleFunctionDescriptor]

'explicitReceiver' @ [100:18] ==> value-parameter explicitReceiver: KtExpression? = ... defined in org.jetbrains.kotlin.idea.intentions.ConvertLambdaToReferenceIntention.isConvertibleCallInLambda[ValueParameterDescriptorImpl]

'let' @ [100:67] ==> @InlineOnly public inline fun <T, R> KtNameReferenceExpression.let(block: (KtNameReferenceExpression) -> DeclarationDescriptor?): DeclarationDescriptor? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtNameReferenceExpression
    <R> -> DeclarationDescriptor?

'context' @ [101:21] ==> val context: BindingContext defined in org.jetbrains.kotlin.idea.intentions.ConvertLambdaToReferenceIntention.isConvertibleCallInLambda[LocalVariableDescriptor]

'REFERENCE_TARGET' @ [101:29] ==> public final val REFERENCE_TARGET: (WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>..WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'it' @ [101:47] ==> value-parameter it: KtNameReferenceExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertLambdaToReferenceIntention.isConvertibleCallInLambda.<anonymous>[ValueParameterDescriptorImpl]

'context' @ [103:47] ==> val context: BindingContext defined in org.jetbrains.kotlin.idea.intentions.ConvertLambdaToReferenceIntention.isConvertibleCallInLambda[LocalVariableDescriptor]

'FUNCTION' @ [103:55] ==> public final val FUNCTION: (WritableSlice<(PsiElement..PsiElement?), (SimpleFunctionDescriptor..SimpleFunctionDescriptor?)>..WritableSlice<(PsiElement..PsiElement?), (SimpleFunctionDescriptor..SimpleFunctionDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'lambdaExpression' @ [103:65] ==> value-parameter lambdaExpression: KtLambdaExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertLambdaToReferenceIntention.isConvertibleCallInLambda[ValueParameterDescriptorImpl]

'functionLiteral' @ [103:82] ==> public final val KtLambdaExpression.functionLiteral: KtFunctionLiteral[MyPropertyDescriptor]

'valueParameters' @ [103:100] ==> public final val SimpleFunctionDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'when (noBoundReferences) {
            true -> explicitReceiver != null
            false -> explicitReceiverDescriptor != null && explicitReceiverDescriptor == lambdaValueParameterDescriptors.firstOrNull()
        }' @ [104:49] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'noBoundReferences' @ [104:55] ==> val noBoundReferences: Boolean defined in org.jetbrains.kotlin.idea.intentions.ConvertLambdaToReferenceIntention.isConvertibleCallInLambda[LocalVariableDescriptor]

'explicitReceiver' @ [105:21] ==> value-parameter explicitReceiver: KtExpression? = ... defined in org.jetbrains.kotlin.idea.intentions.ConvertLambdaToReferenceIntention.isConvertibleCallInLambda[ValueParameterDescriptorImpl]

'explicitReceiverDescriptor' @ [106:22] ==> val explicitReceiverDescriptor: ValueDescriptor? defined in org.jetbrains.kotlin.idea.intentions.ConvertLambdaToReferenceIntention.isConvertibleCallInLambda[LocalVariableDescriptor]

'explicitReceiverDescriptor' @ [106:60] ==> val explicitReceiverDescriptor: ValueDescriptor? defined in org.jetbrains.kotlin.idea.intentions.ConvertLambdaToReferenceIntention.isConvertibleCallInLambda[LocalVariableDescriptor]

'lambdaValueParameterDescriptors' @ [106:90] ==> val lambdaValueParameterDescriptors: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>) defined in org.jetbrains.kotlin.idea.intentions.ConvertLambdaToReferenceIntention.isConvertibleCallInLambda[LocalVariableDescriptor]

'firstOrNull' @ [106:122] ==> public fun <T> List<(ValueParameterDescriptor..ValueParameterDescriptor?)>.firstOrNull(): ValueParameterDescriptor? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.ValueParameterDescriptor..org.jetbrains.kotlin.descriptors.ValueParameterDescriptor?)

'if (lambdaParameterAsExplicitReceiver) 1 else 0' @ [108:37] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Int, elseBranch: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Int

'lambdaParameterAsExplicitReceiver' @ [108:41] ==> val lambdaParameterAsExplicitReceiver: Boolean defined in org.jetbrains.kotlin.idea.intentions.ConvertLambdaToReferenceIntention.isConvertibleCallInLambda[LocalVariableDescriptor]

'lambdaValueParameterDescriptors' @ [110:37] ==> val lambdaValueParameterDescriptors: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>) defined in org.jetbrains.kotlin.idea.intentions.ConvertLambdaToReferenceIntention.isConvertibleCallInLambda[LocalVariableDescriptor]

'size' @ [110:69] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'lambdaParametersCount' @ [111:13] ==> val lambdaParametersCount: Int defined in org.jetbrains.kotlin.idea.intentions.ConvertLambdaToReferenceIntention.isConvertibleCallInLambda[LocalVariableDescriptor]

'callableArgumentsCount' @ [111:38] ==> val callableArgumentsCount: Int defined in org.jetbrains.kotlin.idea.intentions.ConvertLambdaToReferenceIntention.isConvertibleCallInLambda[LocalVariableDescriptor]

'explicitReceiverShift' @ [111:63] ==> val explicitReceiverShift: Int defined in org.jetbrains.kotlin.idea.intentions.ConvertLambdaToReferenceIntention.isConvertibleCallInLambda[LocalVariableDescriptor]

'explicitReceiver' @ [113:13] ==> value-parameter explicitReceiver: KtExpression? = ... defined in org.jetbrains.kotlin.idea.intentions.ConvertLambdaToReferenceIntention.isConvertibleCallInLambda[ValueParameterDescriptorImpl]

'explicitReceiverDescriptor' @ [113:41] ==> val explicitReceiverDescriptor: ValueDescriptor? defined in org.jetbrains.kotlin.idea.intentions.ConvertLambdaToReferenceIntention.isConvertibleCallInLambda[LocalVariableDescriptor]

'lambdaParameterAsExplicitReceiver' @ [113:79] ==> val lambdaParameterAsExplicitReceiver: Boolean defined in org.jetbrains.kotlin.idea.intentions.ConvertLambdaToReferenceIntention.isConvertibleCallInLambda[LocalVariableDescriptor]

'explicitReceiverDescriptor' @ [114:32] ==> val explicitReceiverDescriptor: ValueDescriptor? defined in org.jetbrains.kotlin.idea.intentions.ConvertLambdaToReferenceIntention.isConvertibleCallInLambda[LocalVariableDescriptor]

'type' @ [114:59] ==> public final val ValueDescriptor.type: KotlinType[MyPropertyDescriptor]

'receiverType' @ [116:17] ==> val receiverType: KotlinType defined in org.jetbrains.kotlin.idea.intentions.ConvertLambdaToReferenceIntention.isConvertibleCallInLambda[LocalVariableDescriptor]

'isTypeParameter' @ [116:30] ==> public fun KotlinType.isTypeParameter(): Boolean defined in org.jetbrains.kotlin.types.typeUtil[DeserializedSimpleFunctionDescriptor]

'receiverType' @ [116:51] ==> val receiverType: KotlinType defined in org.jetbrains.kotlin.idea.intentions.ConvertLambdaToReferenceIntention.isConvertibleCallInLambda[LocalVariableDescriptor]

'isError' @ [116:64] ==> public val KotlinType.isError: Boolean defined in org.jetbrains.kotlin.types[DeserializedPropertyDescriptor]

'receiverType' @ [116:75] ==> val receiverType: KotlinType defined in org.jetbrains.kotlin.idea.intentions.ConvertLambdaToReferenceIntention.isConvertibleCallInLambda[LocalVariableDescriptor]

'isDynamic' @ [116:88] ==> public fun KotlinType.isDynamic(): Boolean defined in org.jetbrains.kotlin.types[DeserializedSimpleFunctionDescriptor]

'!' @ [117:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'receiverType' @ [117:18] ==> val receiverType: KotlinType defined in org.jetbrains.kotlin.idea.intentions.ConvertLambdaToReferenceIntention.isConvertibleCallInLambda[LocalVariableDescriptor]

'constructor' @ [117:31] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'isDenotable' @ [117:43] ==> public final val TypeConstructor.isDenotable: Boolean[MyPropertyDescriptor]

'receiverType' @ [117:58] ==> val receiverType: KotlinType defined in org.jetbrains.kotlin.idea.intentions.ConvertLambdaToReferenceIntention.isConvertibleCallInLambda[LocalVariableDescriptor]

'isFunctionType' @ [117:71] ==> public val KotlinType.isFunctionType: Boolean defined in org.jetbrains.kotlin.builtins[DeserializedPropertyDescriptor]

'callableExpression' @ [121:13] ==> value-parameter callableExpression: KtExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertLambdaToReferenceIntention.isConvertibleCallInLambda[ValueParameterDescriptorImpl]

'lambdaValueParameterDescriptors' @ [122:17] ==> val lambdaValueParameterDescriptors: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>) defined in org.jetbrains.kotlin.idea.intentions.ConvertLambdaToReferenceIntention.isConvertibleCallInLambda[LocalVariableDescriptor]

'size' @ [122:49] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'explicitReceiverShift' @ [122:56] ==> val explicitReceiverShift: Int defined in org.jetbrains.kotlin.idea.intentions.ConvertLambdaToReferenceIntention.isConvertibleCallInLambda[LocalVariableDescriptor]

'callableExpression' @ [122:80] ==> value-parameter callableExpression: KtExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertLambdaToReferenceIntention.isConvertibleCallInLambda[ValueParameterDescriptorImpl]

'valueArguments' @ [122:99] ==> public final val KtCallExpression.valueArguments: (MutableList<(KtValueArgument..KtValueArgument?)>..List<(KtValueArgument..KtValueArgument?)>)[MyPropertyDescriptor]

'size' @ [122:114] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'callableExpression' @ [123:32] ==> value-parameter callableExpression: KtExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertLambdaToReferenceIntention.isConvertibleCallInLambda[ValueParameterDescriptorImpl]

'getResolvedCall' @ [123:51] ==> public fun KtElement?.getResolvedCall(context: BindingContext): ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.resolve.calls.callUtil[DeserializedSimpleFunctionDescriptor]

'context' @ [123:67] ==> val context: BindingContext defined in org.jetbrains.kotlin.idea.intentions.ConvertLambdaToReferenceIntention.isConvertibleCallInLambda[LocalVariableDescriptor]

'resolvedCall' @ [124:13] ==> val resolvedCall: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.idea.intentions.ConvertLambdaToReferenceIntention.isConvertibleCallInLambda[LocalVariableDescriptor]

'valueArguments' @ [124:26] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.valueArguments: (MutableMap<(ValueParameterDescriptor..ValueParameterDescriptor?), (ResolvedValueArgument..ResolvedValueArgument?)>..Map<(ValueParameterDescriptor..ValueParameterDescriptor?), (ResolvedValueArgument..ResolvedValueArgument?)>)[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> CallableDescriptor

'entries' @ [124:41] ==> public abstract val entries: MutableSet<MutableMap.MutableEntry<(ValueParameterDescriptor..ValueParameterDescriptor?), (ResolvedValueArgument..ResolvedValueArgument?)>> defined in kotlin.collections.MutableMap[DeserializedPropertyDescriptor]

'forEach' @ [124:49] ==> @HidesMembers public inline fun <T> Iterable<MutableMap.MutableEntry<(ValueParameterDescriptor..ValueParameterDescriptor?), (ResolvedValueArgument..ResolvedValueArgument?)>>.forEach(action: (MutableMap.MutableEntry<(ValueParameterDescriptor..ValueParameterDescriptor?), (ResolvedValueArgument..ResolvedValueArgument?)>) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MutableEntry<(org.jetbrains.kotlin.descriptors.ValueParameterDescriptor..org.jetbrains.kotlin.descriptors.ValueParameterDescriptor?), (org.jetbrains.kotlin.resolve.calls.model.ResolvedValueArgument..org.jetbrains.kotlin.resolve.calls.model.ResolvedValueArgument?)>

'component1' @ [124:60] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<(ValueParameterDescriptor..ValueParameterDescriptor?), (ResolvedValueArgument..ResolvedValueArgument?)>.component1(): (ValueParameterDescriptor..ValueParameterDescriptor?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> (org.jetbrains.kotlin.descriptors.ValueParameterDescriptor..org.jetbrains.kotlin.descriptors.ValueParameterDescriptor?)
    <V> -> (org.jetbrains.kotlin.resolve.calls.model.ResolvedValueArgument..org.jetbrains.kotlin.resolve.calls.model.ResolvedValueArgument?)

'component2' @ [124:76] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<(ValueParameterDescriptor..ValueParameterDescriptor?), (ResolvedValueArgument..ResolvedValueArgument?)>.component2(): (ResolvedValueArgument..ResolvedValueArgument?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> (org.jetbrains.kotlin.descriptors.ValueParameterDescriptor..org.jetbrains.kotlin.descriptors.ValueParameterDescriptor?)
    <V> -> (org.jetbrains.kotlin.resolve.calls.model.ResolvedValueArgument..org.jetbrains.kotlin.resolve.calls.model.ResolvedValueArgument?)

'resolvedArgument' @ [126:25] ==> val resolvedArgument: (ResolvedValueArgument..ResolvedValueArgument?) defined in org.jetbrains.kotlin.idea.intentions.ConvertLambdaToReferenceIntention.isConvertibleCallInLambda.<anonymous>[LocalVariableDescriptor]

'arguments' @ [126:42] ==> public final val ResolvedValueArgument.arguments: (MutableList<(ValueArgument..ValueArgument?)>..List<(ValueArgument..ValueArgument?)>)[MyPropertyDescriptor]

'singleOrNull' @ [126:52] ==> public fun <T> List<(ValueArgument..ValueArgument?)>.singleOrNull(): ValueArgument? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.ValueArgument..org.jetbrains.kotlin.psi.ValueArgument?)

'getArgumentExpression' @ [126:68] ==> @IfNotParsed public abstract fun getArgumentExpression(): KtExpression? defined in org.jetbrains.kotlin.psi.ValueArgument[DeserializedSimpleFunctionDescriptor]

'context' @ [128:38] ==> val context: BindingContext defined in org.jetbrains.kotlin.idea.intentions.ConvertLambdaToReferenceIntention.isConvertibleCallInLambda[LocalVariableDescriptor]

'REFERENCE_TARGET' @ [128:46] ==> public final val REFERENCE_TARGET: (WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>..WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'argumentExpression' @ [128:64] ==> val argumentExpression: KtNameReferenceExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertLambdaToReferenceIntention.isConvertibleCallInLambda.<anonymous>[LocalVariableDescriptor]

'argumentTarget' @ [129:21] ==> val argumentTarget: ValueParameterDescriptor defined in org.jetbrains.kotlin.idea.intentions.ConvertLambdaToReferenceIntention.isConvertibleCallInLambda.<anonymous>[LocalVariableDescriptor]

'lambdaValueParameterDescriptors' @ [129:39] ==> val lambdaValueParameterDescriptors: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>) defined in org.jetbrains.kotlin.idea.intentions.ConvertLambdaToReferenceIntention.isConvertibleCallInLambda[LocalVariableDescriptor]

'valueParameter' @ [129:71] ==> val valueParameter: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.idea.intentions.ConvertLambdaToReferenceIntention.isConvertibleCallInLambda.<anonymous>[LocalVariableDescriptor]

'index' @ [129:86] ==> public abstract val index: Int defined in org.jetbrains.kotlin.descriptors.ValueParameterDescriptor[DeserializedPropertyDescriptor]

'explicitReceiverShift' @ [129:94] ==> val explicitReceiverShift: Int defined in org.jetbrains.kotlin.idea.intentions.ConvertLambdaToReferenceIntention.isConvertibleCallInLambda[LocalVariableDescriptor]

'element' @ [136:31] ==> value-parameter element: KtLambdaExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertLambdaToReferenceIntention.isApplicableTo[ValueParameterDescriptorImpl]

'singleStatementOrNull' @ [136:39] ==> private final fun KtLambdaExpression.singleStatementOrNull(): KtExpression? defined in org.jetbrains.kotlin.idea.intentions.ConvertLambdaToReferenceIntention.Companion[SimpleFunctionDescriptorImpl]

'element' @ [137:28] ==> value-parameter element: KtLambdaExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertLambdaToReferenceIntention.isApplicableTo[ValueParameterDescriptorImpl]

'parent' @ [137:36] ==> public final val KtLambdaExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'lambdaParent' @ [139:13] ==> val lambdaParent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.intentions.ConvertLambdaToReferenceIntention.isApplicableTo[LocalVariableDescriptor]

'lambdaParent' @ [140:41] ==> val lambdaParent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.intentions.ConvertLambdaToReferenceIntention.isApplicableTo[LocalVariableDescriptor]

'outerCalleeDescriptor' @ [140:54] ==> private final fun KtLambdaArgument.outerCalleeDescriptor(): FunctionDescriptor? defined in org.jetbrains.kotlin.idea.intentions.ConvertLambdaToReferenceIntention[SimpleFunctionDescriptorImpl]

'outerCalleeDescriptor' @ [141:39] ==> val outerCalleeDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.idea.intentions.ConvertLambdaToReferenceIntention.isApplicableTo[LocalVariableDescriptor]

'valueParameters' @ [141:61] ==> public final val FunctionDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'lastOrNull' @ [141:77] ==> public fun <T> List<(ValueParameterDescriptor..ValueParameterDescriptor?)>.lastOrNull(): ValueParameterDescriptor? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.ValueParameterDescriptor..org.jetbrains.kotlin.descriptors.ValueParameterDescriptor?)

'type' @ [141:91] ==> public final val ValueParameterDescriptor.type: KotlinType[MyPropertyDescriptor]

'lambdaParameterType' @ [142:17] ==> val lambdaParameterType: KotlinType? defined in org.jetbrains.kotlin.idea.intentions.ConvertLambdaToReferenceIntention.isApplicableTo[LocalVariableDescriptor]

'lambdaParameterType' @ [142:48] ==> val lambdaParameterType: KotlinType? defined in org.jetbrains.kotlin.idea.intentions.ConvertLambdaToReferenceIntention.isApplicableTo[LocalVariableDescriptor]

'isFunctionType' @ [142:68] ==> public val KotlinType.isFunctionType: Boolean defined in org.jetbrains.kotlin.builtins[DeserializedPropertyDescriptor]

'lambdaParameterType' @ [144:21] ==> val lambdaParameterType: KotlinType? defined in org.jetbrains.kotlin.idea.intentions.ConvertLambdaToReferenceIntention.isApplicableTo[LocalVariableDescriptor]

'isExtensionFunctionType' @ [144:41] ==> public val KotlinType.isExtensionFunctionType: Boolean defined in org.jetbrains.kotlin.builtins[DeserializedPropertyDescriptor]

'lambdaMustReturnUnit' @ [146:17] ==> var lambdaMustReturnUnit: Boolean defined in org.jetbrains.kotlin.idea.intentions.ConvertLambdaToReferenceIntention.isApplicableTo[LocalVariableDescriptor]

'lambdaParameterType' @ [146:40] ==> val lambdaParameterType: KotlinType? defined in org.jetbrains.kotlin.idea.intentions.ConvertLambdaToReferenceIntention.isApplicableTo[LocalVariableDescriptor]

'getReturnTypeFromFunctionType' @ [146:60] ==> public fun KotlinType.getReturnTypeFromFunctionType(): KotlinType defined in org.jetbrains.kotlin.builtins[DeserializedSimpleFunctionDescriptor]

'isUnit' @ [146:92] ==> public fun KotlinType.isUnit(): Boolean defined in org.jetbrains.kotlin.types.typeUtil[DeserializedSimpleFunctionDescriptor]

'when (singleStatement) {
            is KtCallExpression -> {
                isConvertibleCallInLambda(callableExpression = singleStatement, lambdaExpression = element,
                                          lambdaMustReturnUnit = lambdaMustReturnUnit)
            }
            is KtNameReferenceExpression -> false // Global property reference is not possible (?!)
            is KtDotQualifiedExpression -> {
                val selector = singleStatement.selectorExpression ?: return false
                isConvertibleCallInLambda(callableExpression = selector, explicitReceiver = singleStatement.receiverExpression,
                                          lambdaExpression = element, lambdaMustReturnUnit = lambdaMustReturnUnit)
            }
            else -> false
        }' @ [150:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean, entry2: Boolean, entry3: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'singleStatement' @ [150:22] ==> val singleStatement: KtExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertLambdaToReferenceIntention.isApplicableTo[LocalVariableDescriptor]

'isConvertibleCallInLambda' @ [152:17] ==> private final fun isConvertibleCallInLambda(callableExpression: KtExpression, explicitReceiver: KtExpression? = ..., lambdaExpression: KtLambdaExpression, lambdaMustReturnUnit: Boolean): Boolean defined in org.jetbrains.kotlin.idea.intentions.ConvertLambdaToReferenceIntention[SimpleFunctionDescriptorImpl]

'singleStatement' @ [152:64] ==> val singleStatement: KtExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertLambdaToReferenceIntention.isApplicableTo[LocalVariableDescriptor]

'element' @ [152:100] ==> value-parameter element: KtLambdaExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertLambdaToReferenceIntention.isApplicableTo[ValueParameterDescriptorImpl]

'lambdaMustReturnUnit' @ [153:66] ==> var lambdaMustReturnUnit: Boolean defined in org.jetbrains.kotlin.idea.intentions.ConvertLambdaToReferenceIntention.isApplicableTo[LocalVariableDescriptor]

'singleStatement' @ [157:32] ==> val singleStatement: KtExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertLambdaToReferenceIntention.isApplicableTo[LocalVariableDescriptor]

'selectorExpression' @ [157:48] ==> public open val selectorExpression: KtExpression? defined in org.jetbrains.kotlin.psi.KtDotQualifiedExpression[DeserializedPropertyDescriptor]

'isConvertibleCallInLambda' @ [158:17] ==> private final fun isConvertibleCallInLambda(callableExpression: KtExpression, explicitReceiver: KtExpression? = ..., lambdaExpression: KtLambdaExpression, lambdaMustReturnUnit: Boolean): Boolean defined in org.jetbrains.kotlin.idea.intentions.ConvertLambdaToReferenceIntention[SimpleFunctionDescriptorImpl]

'selector' @ [158:64] ==> val selector: KtExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertLambdaToReferenceIntention.isApplicableTo[LocalVariableDescriptor]

'singleStatement' @ [158:93] ==> val singleStatement: KtExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertLambdaToReferenceIntention.isApplicableTo[LocalVariableDescriptor]

'receiverExpression' @ [158:109] ==> public open val receiverExpression: KtExpression defined in org.jetbrains.kotlin.psi.KtDotQualifiedExpression[DeserializedPropertyDescriptor]

'element' @ [159:62] ==> value-parameter element: KtLambdaExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertLambdaToReferenceIntention.isApplicableTo[ValueParameterDescriptorImpl]

'lambdaMustReturnUnit' @ [159:94] ==> var lambdaMustReturnUnit: Boolean defined in org.jetbrains.kotlin.idea.intentions.ConvertLambdaToReferenceIntention.isApplicableTo[LocalVariableDescriptor]

'buildReferenceText' @ [166:29] ==> public open fun buildReferenceText(element: KtLambdaExpression): String? defined in org.jetbrains.kotlin.idea.intentions.ConvertLambdaToReferenceIntention[SimpleFunctionDescriptorImpl]

'element' @ [166:48] ==> value-parameter element: KtLambdaExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertLambdaToReferenceIntention.applyTo[ValueParameterDescriptorImpl]

'KtPsiFactory' @ [167:23] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'element' @ [167:36] ==> value-parameter element: KtLambdaExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertLambdaToReferenceIntention.applyTo[ValueParameterDescriptorImpl]

'element' @ [168:30] ==> value-parameter element: KtLambdaExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertLambdaToReferenceIntention.applyTo[ValueParameterDescriptorImpl]

'parent' @ [168:38] ==> public final val KtLambdaExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'if (lambdaArgument == null) {
            // Without lambda argument syntax, just replace lambda with reference
            val callableReferenceExpr = factory.createCallableReferenceExpression(referenceName) ?: return
            (element.replace(callableReferenceExpr) as? KtElement)?.let { ShortenReferences.RETAIN_COMPANION.process(it) }
        }
        else {
            // Otherwise, replace the whole argument list for lambda argument-using call
            val outerCallExpression = lambdaArgument.parent as? KtCallExpression ?: return
            val outerCalleeDescriptor = lambdaArgument.outerCalleeDescriptor() ?: return
            // Parameters with default value
            val valueParameters = outerCalleeDescriptor.valueParameters
            val arguments = outerCallExpression.valueArguments.filter { it !is KtLambdaArgument }
            val useNamedArguments = valueParameters.any { it.hasDefaultValue() } || arguments.any { it.getArgumentName() != null }

            if (useNamedArguments && arguments.size > valueParameters.size) return
            val newArgumentList = factory.buildValueArgumentList {
                appendFixedText("(")
                arguments.forEachIndexed { i, argument ->
                    if (useNamedArguments) {
                        val argumentName = argument.getArgumentName()?.asName
                        val name = argumentName ?: valueParameters[i].name
                        appendName(name)
                        appendFixedText(" = ")
                    }
                    appendExpression(argument.getArgumentExpression())
                    appendFixedText(", ")
                }
                if (useNamedArguments) {
                    appendName(valueParameters.last().name)
                    appendFixedText(" = ")
                }
                appendFixedText(referenceName)
                appendFixedText(")")
            }
            val argumentList = outerCallExpression.valueArgumentList
            if (argumentList == null) {
                (lambdaArgument.replace(newArgumentList) as? KtElement)?.let { ShortenReferences.RETAIN_COMPANION.process(it) }
            }
            else {
                (argumentList.replace(newArgumentList) as? KtValueArgumentList)?.let {
                    ShortenReferences.RETAIN_COMPANION.process(it.arguments.last())
                }
                lambdaArgument.delete()
            }
        }' @ [169:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Any?, elseBranch: Any?): Any?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Any?

'lambdaArgument' @ [169:13] ==> val lambdaArgument: KtLambdaArgument? defined in org.jetbrains.kotlin.idea.intentions.ConvertLambdaToReferenceIntention.applyTo[LocalVariableDescriptor]

'factory' @ [171:41] ==> val factory: KtPsiFactory defined in org.jetbrains.kotlin.idea.intentions.ConvertLambdaToReferenceIntention.applyTo[LocalVariableDescriptor]

'createCallableReferenceExpression' @ [171:49] ==> public final fun createCallableReferenceExpression(text: String): KtCallableReferenceExpression? defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'referenceName' @ [171:83] ==> val referenceName: String defined in org.jetbrains.kotlin.idea.intentions.ConvertLambdaToReferenceIntention.applyTo[LocalVariableDescriptor]

'element' @ [172:14] ==> value-parameter element: KtLambdaExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertLambdaToReferenceIntention.applyTo[ValueParameterDescriptorImpl]

'replace' @ [172:22] ==> public open fun replace(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtLambdaExpression[JavaMethodDescriptor]

'callableReferenceExpr' @ [172:30] ==> val callableReferenceExpr: KtCallableReferenceExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertLambdaToReferenceIntention.applyTo[LocalVariableDescriptor]

'let' @ [172:69] ==> @InlineOnly public inline fun <T, R> KtElement.let(block: (KtElement) -> KtElement): KtElement defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtElement
    <R> -> KtElement

'ShortenReferences' @ [172:75] ==> public companion object defined in org.jetbrains.kotlin.idea.core.ShortenReferences[FakeCallableDescriptorForObject]

'RETAIN_COMPANION' @ [172:93] ==> public final val RETAIN_COMPANION: ShortenReferences defined in org.jetbrains.kotlin.idea.core.ShortenReferences.Companion[DeserializedPropertyDescriptor]

'process' @ [172:110] ==> @JvmOverloads public final fun process(element: KtElement, elementFilter: (PsiElement) -> ShortenReferences.FilterResult = ...): KtElement defined in org.jetbrains.kotlin.idea.core.ShortenReferences[DeserializedSimpleFunctionDescriptor]

'it' @ [172:118] ==> value-parameter it: KtElement defined in org.jetbrains.kotlin.idea.intentions.ConvertLambdaToReferenceIntention.applyTo.<anonymous>[ValueParameterDescriptorImpl]

'lambdaArgument' @ [176:39] ==> val lambdaArgument: KtLambdaArgument? defined in org.jetbrains.kotlin.idea.intentions.ConvertLambdaToReferenceIntention.applyTo[LocalVariableDescriptor]

'parent' @ [176:54] ==> public final val KtLambdaArgument.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'lambdaArgument' @ [177:41] ==> val lambdaArgument: KtLambdaArgument? defined in org.jetbrains.kotlin.idea.intentions.ConvertLambdaToReferenceIntention.applyTo[LocalVariableDescriptor]

'outerCalleeDescriptor' @ [177:56] ==> private final fun KtLambdaArgument.outerCalleeDescriptor(): FunctionDescriptor? defined in org.jetbrains.kotlin.idea.intentions.ConvertLambdaToReferenceIntention[SimpleFunctionDescriptorImpl]

'outerCalleeDescriptor' @ [179:35] ==> val outerCalleeDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.idea.intentions.ConvertLambdaToReferenceIntention.applyTo[LocalVariableDescriptor]

'valueParameters' @ [179:57] ==> public final val FunctionDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'outerCallExpression' @ [180:29] ==> val outerCallExpression: KtCallExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertLambdaToReferenceIntention.applyTo[LocalVariableDescriptor]

'valueArguments' @ [180:49] ==> public final val KtCallExpression.valueArguments: (MutableList<(KtValueArgument..KtValueArgument?)>..List<(KtValueArgument..KtValueArgument?)>)[MyPropertyDescriptor]

'filter' @ [180:64] ==> public inline fun <T> Iterable<(KtValueArgument..KtValueArgument?)>.filter(predicate: ((KtValueArgument..KtValueArgument?)) -> Boolean): List<(KtValueArgument..KtValueArgument?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtValueArgument..org.jetbrains.kotlin.psi.KtValueArgument?)

'it' @ [180:73] ==> value-parameter it: (KtValueArgument..KtValueArgument?) defined in org.jetbrains.kotlin.idea.intentions.ConvertLambdaToReferenceIntention.applyTo.<anonymous>[ValueParameterDescriptorImpl]

'valueParameters' @ [181:37] ==> val valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>) defined in org.jetbrains.kotlin.idea.intentions.ConvertLambdaToReferenceIntention.applyTo[LocalVariableDescriptor]

'any' @ [181:53] ==> public inline fun <T> Iterable<(ValueParameterDescriptor..ValueParameterDescriptor?)>.any(predicate: ((ValueParameterDescriptor..ValueParameterDescriptor?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.ValueParameterDescriptor..org.jetbrains.kotlin.descriptors.ValueParameterDescriptor?)

'it' @ [181:59] ==> value-parameter it: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.idea.intentions.ConvertLambdaToReferenceIntention.applyTo.<anonymous>[ValueParameterDescriptorImpl]

'hasDefaultValue' @ [181:62] ==> public fun ValueParameterDescriptor.hasDefaultValue(): Boolean defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedSimpleFunctionDescriptor]

'arguments' @ [181:85] ==> val arguments: List<(KtValueArgument..KtValueArgument?)> defined in org.jetbrains.kotlin.idea.intentions.ConvertLambdaToReferenceIntention.applyTo[LocalVariableDescriptor]

'any' @ [181:95] ==> public inline fun <T> Iterable<(KtValueArgument..KtValueArgument?)>.any(predicate: ((KtValueArgument..KtValueArgument?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtValueArgument..org.jetbrains.kotlin.psi.KtValueArgument?)

'it' @ [181:101] ==> value-parameter it: (KtValueArgument..KtValueArgument?) defined in org.jetbrains.kotlin.idea.intentions.ConvertLambdaToReferenceIntention.applyTo.<anonymous>[ValueParameterDescriptorImpl]

'getArgumentName' @ [181:104] ==> @Nullable public open fun getArgumentName(): KtValueArgumentName? defined in org.jetbrains.kotlin.psi.KtValueArgument[JavaMethodDescriptor]

'useNamedArguments' @ [183:17] ==> val useNamedArguments: Boolean defined in org.jetbrains.kotlin.idea.intentions.ConvertLambdaToReferenceIntention.applyTo[LocalVariableDescriptor]

'arguments' @ [183:38] ==> val arguments: List<(KtValueArgument..KtValueArgument?)> defined in org.jetbrains.kotlin.idea.intentions.ConvertLambdaToReferenceIntention.applyTo[LocalVariableDescriptor]

'size' @ [183:48] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'valueParameters' @ [183:55] ==> val valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>) defined in org.jetbrains.kotlin.idea.intentions.ConvertLambdaToReferenceIntention.applyTo[LocalVariableDescriptor]

'size' @ [183:71] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'factory' @ [184:35] ==> val factory: KtPsiFactory defined in org.jetbrains.kotlin.idea.intentions.ConvertLambdaToReferenceIntention.applyTo[LocalVariableDescriptor]

'buildValueArgumentList' @ [184:43] ==> public fun KtPsiFactory.buildValueArgumentList(build: BuilderByPattern<KtValueArgumentList>.() -> Unit): KtValueArgumentList defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'appendFixedText' @ [185:17] ==> public final fun appendFixedText(text: String): BuilderByPattern<KtValueArgumentList> defined in org.jetbrains.kotlin.psi.BuilderByPattern[DeserializedSimpleFunctionDescriptor]

'arguments' @ [186:17] ==> val arguments: List<(KtValueArgument..KtValueArgument?)> defined in org.jetbrains.kotlin.idea.intentions.ConvertLambdaToReferenceIntention.applyTo[LocalVariableDescriptor]

'forEachIndexed' @ [186:27] ==> public inline fun <T> Iterable<(KtValueArgument..KtValueArgument?)>.forEachIndexed(action: (index: Int, (KtValueArgument..KtValueArgument?)) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtValueArgument..org.jetbrains.kotlin.psi.KtValueArgument?)

'useNamedArguments' @ [187:25] ==> val useNamedArguments: Boolean defined in org.jetbrains.kotlin.idea.intentions.ConvertLambdaToReferenceIntention.applyTo[LocalVariableDescriptor]

'argument' @ [188:44] ==> value-parameter argument: (KtValueArgument..KtValueArgument?) defined in org.jetbrains.kotlin.idea.intentions.ConvertLambdaToReferenceIntention.applyTo.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'getArgumentName' @ [188:53] ==> @Nullable public open fun getArgumentName(): KtValueArgumentName? defined in org.jetbrains.kotlin.psi.KtValueArgument[JavaMethodDescriptor]

'asName' @ [188:72] ==> public open val asName: Name defined in org.jetbrains.kotlin.psi.KtValueArgumentName[JavaPropertyDescriptor]

'argumentName' @ [189:36] ==> val argumentName: Name? defined in org.jetbrains.kotlin.idea.intentions.ConvertLambdaToReferenceIntention.applyTo.<anonymous>.<anonymous>[LocalVariableDescriptor]

'valueParameters' @ [189:52] ==> val valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>) defined in org.jetbrains.kotlin.idea.intentions.ConvertLambdaToReferenceIntention.applyTo[LocalVariableDescriptor]

'i' @ [189:68] ==> value-parameter i: Int defined in org.jetbrains.kotlin.idea.intentions.ConvertLambdaToReferenceIntention.applyTo.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [189:71] ==> public final val ValueParameterDescriptor.name: Name[MyPropertyDescriptor]

'appendName' @ [190:25] ==> public final fun appendName(name: Name): BuilderByPattern<KtValueArgumentList> defined in org.jetbrains.kotlin.psi.BuilderByPattern[DeserializedSimpleFunctionDescriptor]

'name' @ [190:36] ==> val name: Name defined in org.jetbrains.kotlin.idea.intentions.ConvertLambdaToReferenceIntention.applyTo.<anonymous>.<anonymous>[LocalVariableDescriptor]

'appendFixedText' @ [191:25] ==> public final fun appendFixedText(text: String): BuilderByPattern<KtValueArgumentList> defined in org.jetbrains.kotlin.psi.BuilderByPattern[DeserializedSimpleFunctionDescriptor]

'appendExpression' @ [193:21] ==> public final fun appendExpression(expression: KtExpression?): BuilderByPattern<KtValueArgumentList> defined in org.jetbrains.kotlin.psi.BuilderByPattern[DeserializedSimpleFunctionDescriptor]

'argument' @ [193:38] ==> value-parameter argument: (KtValueArgument..KtValueArgument?) defined in org.jetbrains.kotlin.idea.intentions.ConvertLambdaToReferenceIntention.applyTo.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'getArgumentExpression' @ [193:47] ==> @IfNotParsed @Nullable public open fun getArgumentExpression(): KtExpression? defined in org.jetbrains.kotlin.psi.KtValueArgument[JavaMethodDescriptor]

'appendFixedText' @ [194:21] ==> public final fun appendFixedText(text: String): BuilderByPattern<KtValueArgumentList> defined in org.jetbrains.kotlin.psi.BuilderByPattern[DeserializedSimpleFunctionDescriptor]

'useNamedArguments' @ [196:21] ==> val useNamedArguments: Boolean defined in org.jetbrains.kotlin.idea.intentions.ConvertLambdaToReferenceIntention.applyTo[LocalVariableDescriptor]

'appendName' @ [197:21] ==> public final fun appendName(name: Name): BuilderByPattern<KtValueArgumentList> defined in org.jetbrains.kotlin.psi.BuilderByPattern[DeserializedSimpleFunctionDescriptor]

'valueParameters' @ [197:32] ==> val valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>) defined in org.jetbrains.kotlin.idea.intentions.ConvertLambdaToReferenceIntention.applyTo[LocalVariableDescriptor]

'last' @ [197:48] ==> public fun <T> List<(ValueParameterDescriptor..ValueParameterDescriptor?)>.last(): (ValueParameterDescriptor..ValueParameterDescriptor?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.ValueParameterDescriptor..org.jetbrains.kotlin.descriptors.ValueParameterDescriptor?)

'name' @ [197:55] ==> public final val ValueParameterDescriptor.name: Name[MyPropertyDescriptor]

'appendFixedText' @ [198:21] ==> public final fun appendFixedText(text: String): BuilderByPattern<KtValueArgumentList> defined in org.jetbrains.kotlin.psi.BuilderByPattern[DeserializedSimpleFunctionDescriptor]

'appendFixedText' @ [200:17] ==> public final fun appendFixedText(text: String): BuilderByPattern<KtValueArgumentList> defined in org.jetbrains.kotlin.psi.BuilderByPattern[DeserializedSimpleFunctionDescriptor]

'referenceName' @ [200:33] ==> val referenceName: String defined in org.jetbrains.kotlin.idea.intentions.ConvertLambdaToReferenceIntention.applyTo[LocalVariableDescriptor]

'appendFixedText' @ [201:17] ==> public final fun appendFixedText(text: String): BuilderByPattern<KtValueArgumentList> defined in org.jetbrains.kotlin.psi.BuilderByPattern[DeserializedSimpleFunctionDescriptor]

'outerCallExpression' @ [203:32] ==> val outerCallExpression: KtCallExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertLambdaToReferenceIntention.applyTo[LocalVariableDescriptor]

'valueArgumentList' @ [203:52] ==> public final val KtCallExpression.valueArgumentList: KtValueArgumentList?[MyPropertyDescriptor]

'if (argumentList == null) {
                (lambdaArgument.replace(newArgumentList) as? KtElement)?.let { ShortenReferences.RETAIN_COMPANION.process(it) }
            }
            else {
                (argumentList.replace(newArgumentList) as? KtValueArgumentList)?.let {
                    ShortenReferences.RETAIN_COMPANION.process(it.arguments.last())
                }
                lambdaArgument.delete()
            }' @ [204:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Any?, elseBranch: Any?): Any?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Any?

'argumentList' @ [204:17] ==> val argumentList: KtValueArgumentList? defined in org.jetbrains.kotlin.idea.intentions.ConvertLambdaToReferenceIntention.applyTo[LocalVariableDescriptor]

'lambdaArgument' @ [205:18] ==> val lambdaArgument: KtLambdaArgument? defined in org.jetbrains.kotlin.idea.intentions.ConvertLambdaToReferenceIntention.applyTo[LocalVariableDescriptor]

'replace' @ [205:33] ==> public open fun replace(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtLambdaArgument[JavaMethodDescriptor]

'newArgumentList' @ [205:41] ==> val newArgumentList: KtValueArgumentList defined in org.jetbrains.kotlin.idea.intentions.ConvertLambdaToReferenceIntention.applyTo[LocalVariableDescriptor]

'let' @ [205:74] ==> @InlineOnly public inline fun <T, R> KtElement.let(block: (KtElement) -> KtElement): KtElement defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtElement
    <R> -> KtElement

'ShortenReferences' @ [205:80] ==> public companion object defined in org.jetbrains.kotlin.idea.core.ShortenReferences[FakeCallableDescriptorForObject]

'RETAIN_COMPANION' @ [205:98] ==> public final val RETAIN_COMPANION: ShortenReferences defined in org.jetbrains.kotlin.idea.core.ShortenReferences.Companion[DeserializedPropertyDescriptor]

'process' @ [205:115] ==> @JvmOverloads public final fun process(element: KtElement, elementFilter: (PsiElement) -> ShortenReferences.FilterResult = ...): KtElement defined in org.jetbrains.kotlin.idea.core.ShortenReferences[DeserializedSimpleFunctionDescriptor]

'it' @ [205:123] ==> value-parameter it: KtElement defined in org.jetbrains.kotlin.idea.intentions.ConvertLambdaToReferenceIntention.applyTo.<anonymous>[ValueParameterDescriptorImpl]

'argumentList' @ [208:18] ==> val argumentList: KtValueArgumentList? defined in org.jetbrains.kotlin.idea.intentions.ConvertLambdaToReferenceIntention.applyTo[LocalVariableDescriptor]

'replace' @ [208:31] ==> public open fun replace(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtValueArgumentList[JavaMethodDescriptor]

'newArgumentList' @ [208:39] ==> val newArgumentList: KtValueArgumentList defined in org.jetbrains.kotlin.idea.intentions.ConvertLambdaToReferenceIntention.applyTo[LocalVariableDescriptor]

'let' @ [208:82] ==> @InlineOnly public inline fun <T, R> KtValueArgumentList.let(block: (KtValueArgumentList) -> KtElement): KtElement defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtValueArgumentList
    <R> -> KtElement

'ShortenReferences' @ [209:21] ==> public companion object defined in org.jetbrains.kotlin.idea.core.ShortenReferences[FakeCallableDescriptorForObject]

'RETAIN_COMPANION' @ [209:39] ==> public final val RETAIN_COMPANION: ShortenReferences defined in org.jetbrains.kotlin.idea.core.ShortenReferences.Companion[DeserializedPropertyDescriptor]

'process' @ [209:56] ==> @JvmOverloads public final fun process(element: KtElement, elementFilter: (PsiElement) -> ShortenReferences.FilterResult = ...): KtElement defined in org.jetbrains.kotlin.idea.core.ShortenReferences[DeserializedSimpleFunctionDescriptor]

'it' @ [209:64] ==> value-parameter it: KtValueArgumentList defined in org.jetbrains.kotlin.idea.intentions.ConvertLambdaToReferenceIntention.applyTo.<anonymous>[ValueParameterDescriptorImpl]

'arguments' @ [209:67] ==> public final val KtValueArgumentList.arguments: (MutableList<(KtValueArgument..KtValueArgument?)>..List<(KtValueArgument..KtValueArgument?)>)[MyPropertyDescriptor]

'last' @ [209:77] ==> public fun <T> List<(KtValueArgument..KtValueArgument?)>.last(): (KtValueArgument..KtValueArgument?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtValueArgument..org.jetbrains.kotlin.psi.KtValueArgument?)

'lambdaArgument' @ [211:17] ==> val lambdaArgument: KtLambdaArgument? defined in org.jetbrains.kotlin.idea.intentions.ConvertLambdaToReferenceIntention.applyTo[LocalVariableDescriptor]

'delete' @ [211:32] ==> public open fun delete(): Unit defined in org.jetbrains.kotlin.psi.KtLambdaArgument[JavaMethodDescriptor]

'lambdaExpression' @ [219:35] ==> value-parameter lambdaExpression: KtLambdaExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertLambdaToReferenceIntention.Companion.buildReferenceText[ValueParameterDescriptorImpl]

'singleStatementOrNull' @ [219:52] ==> private final fun KtLambdaExpression.singleStatementOrNull(): KtExpression? defined in org.jetbrains.kotlin.idea.intentions.ConvertLambdaToReferenceIntention.Companion[SimpleFunctionDescriptorImpl]

'when (singleStatement) {
                is KtCallExpression -> {
                    val calleeReferenceExpression = singleStatement.calleeExpression as? KtNameReferenceExpression ?: return null
                    val context = singleStatement.analyze()
                    val resolvedCall = calleeReferenceExpression.getResolvedCall(context) ?: return null
                    if (resolvedCall.dispatchReceiver != null || resolvedCall.extensionReceiver != null)
                        "this::${singleStatement.getCallReferencedName()}"
                    else
                        "::${singleStatement.getCallReferencedName()}"
                }
                is KtDotQualifiedExpression -> {
                    val selector = singleStatement.selectorExpression
                    val selectorReferenceName = when (selector) {
                        is KtCallExpression -> selector.getCallReferencedName() ?: return null
                        is KtNameReferenceExpression -> selector.getReferencedName()
                        else -> return null
                    }
                    val receiver = singleStatement.receiverExpression
                    val context = receiver.analyze()
                    when (receiver) {
                        is KtNameReferenceExpression -> {
                            val receiverDescriptor = context[REFERENCE_TARGET, receiver] ?: return null
                            val lambdaValueParameters = context[FUNCTION, lambdaExpression.functionLiteral]?.valueParameters ?: return null
                            if (receiverDescriptor is ParameterDescriptor && receiverDescriptor == lambdaValueParameters.firstOrNull()) {
                                val originalReceiverType = receiverDescriptor.type
                                val receiverType = originalReceiverType.approximateFlexibleTypes(preferNotNull = true)
                                if (shortTypes) {
                                    "${IdeDescriptorRenderers.SOURCE_CODE_SHORT_NAMES_IN_TYPES.renderType(receiverType)}::$selectorReferenceName"
                                }
                                else {
                                    "${IdeDescriptorRenderers.SOURCE_CODE.renderType(receiverType)}::$selectorReferenceName"
                                }
                            }
                            else {
                                val receiverName = receiverDescriptor.importableFqName ?: receiverDescriptor.name
                                "$receiverName::$selectorReferenceName"
                            }
                        }
                        is KtThisExpression -> {
                            "${receiver.text}::$selectorReferenceName"
                        }
                        else -> null
                    }
                }
                else -> null
            }' @ [220:20] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: String?, entry1: String?, entry2: String?): String?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> String?

'singleStatement' @ [220:26] ==> val singleStatement: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.ConvertLambdaToReferenceIntention.Companion.buildReferenceText[LocalVariableDescriptor]

'singleStatement' @ [222:53] ==> val singleStatement: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.ConvertLambdaToReferenceIntention.Companion.buildReferenceText[LocalVariableDescriptor]

'calleeExpression' @ [222:69] ==> public final val KtCallExpression.calleeExpression: KtExpression?[MyPropertyDescriptor]

'singleStatement' @ [223:35] ==> val singleStatement: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.ConvertLambdaToReferenceIntention.Companion.buildReferenceText[LocalVariableDescriptor]

'analyze' @ [223:51] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'calleeReferenceExpression' @ [224:40] ==> val calleeReferenceExpression: KtNameReferenceExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertLambdaToReferenceIntention.Companion.buildReferenceText[LocalVariableDescriptor]

'getResolvedCall' @ [224:66] ==> public fun KtElement?.getResolvedCall(context: BindingContext): ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.resolve.calls.callUtil[DeserializedSimpleFunctionDescriptor]

'context' @ [224:82] ==> val context: BindingContext defined in org.jetbrains.kotlin.idea.intentions.ConvertLambdaToReferenceIntention.Companion.buildReferenceText[LocalVariableDescriptor]

'if (resolvedCall.dispatchReceiver != null || resolvedCall.extensionReceiver != null)
                        "this::${singleStatement.getCallReferencedName()}"
                    else
                        "::${singleStatement.getCallReferencedName()}"' @ [225:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'resolvedCall' @ [225:25] ==> val resolvedCall: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.idea.intentions.ConvertLambdaToReferenceIntention.Companion.buildReferenceText[LocalVariableDescriptor]

'dispatchReceiver' @ [225:38] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.dispatchReceiver: ReceiverValue?[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> CallableDescriptor

'resolvedCall' @ [225:66] ==> val resolvedCall: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.idea.intentions.ConvertLambdaToReferenceIntention.Companion.buildReferenceText[LocalVariableDescriptor]

'extensionReceiver' @ [225:79] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.extensionReceiver: ReceiverValue?[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> CallableDescriptor

'singleStatement' @ [226:34] ==> val singleStatement: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.ConvertLambdaToReferenceIntention.Companion.buildReferenceText[LocalVariableDescriptor]

'getCallReferencedName' @ [226:50] ==> private final fun KtCallExpression.getCallReferencedName(): String? defined in org.jetbrains.kotlin.idea.intentions.ConvertLambdaToReferenceIntention.Companion[SimpleFunctionDescriptorImpl]

'singleStatement' @ [228:30] ==> val singleStatement: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.ConvertLambdaToReferenceIntention.Companion.buildReferenceText[LocalVariableDescriptor]

'getCallReferencedName' @ [228:46] ==> private final fun KtCallExpression.getCallReferencedName(): String? defined in org.jetbrains.kotlin.idea.intentions.ConvertLambdaToReferenceIntention.Companion[SimpleFunctionDescriptorImpl]

'singleStatement' @ [231:36] ==> val singleStatement: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.ConvertLambdaToReferenceIntention.Companion.buildReferenceText[LocalVariableDescriptor]

'selectorExpression' @ [231:52] ==> public open val selectorExpression: KtExpression? defined in org.jetbrains.kotlin.psi.KtDotQualifiedExpression[DeserializedPropertyDescriptor]

'when (selector) {
                        is KtCallExpression -> selector.getCallReferencedName() ?: return null
                        is KtNameReferenceExpression -> selector.getReferencedName()
                        else -> return null
                    }' @ [232:49] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: String, entry1: String, entry2: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> String

'selector' @ [232:55] ==> val selector: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.ConvertLambdaToReferenceIntention.Companion.buildReferenceText[LocalVariableDescriptor]

'selector' @ [233:48] ==> val selector: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.ConvertLambdaToReferenceIntention.Companion.buildReferenceText[LocalVariableDescriptor]

'getCallReferencedName' @ [233:57] ==> private final fun KtCallExpression.getCallReferencedName(): String? defined in org.jetbrains.kotlin.idea.intentions.ConvertLambdaToReferenceIntention.Companion[SimpleFunctionDescriptorImpl]

'selector' @ [234:57] ==> val selector: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.ConvertLambdaToReferenceIntention.Companion.buildReferenceText[LocalVariableDescriptor]

'getReferencedName' @ [234:66] ==> public open fun getReferencedName(): String defined in org.jetbrains.kotlin.psi.KtNameReferenceExpression[DeserializedSimpleFunctionDescriptor]

'singleStatement' @ [237:36] ==> val singleStatement: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.ConvertLambdaToReferenceIntention.Companion.buildReferenceText[LocalVariableDescriptor]

'receiverExpression' @ [237:52] ==> public open val receiverExpression: KtExpression defined in org.jetbrains.kotlin.psi.KtDotQualifiedExpression[DeserializedPropertyDescriptor]

'receiver' @ [238:35] ==> val receiver: KtExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertLambdaToReferenceIntention.Companion.buildReferenceText[LocalVariableDescriptor]

'analyze' @ [238:44] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'when (receiver) {
                        is KtNameReferenceExpression -> {
                            val receiverDescriptor = context[REFERENCE_TARGET, receiver] ?: return null
                            val lambdaValueParameters = context[FUNCTION, lambdaExpression.functionLiteral]?.valueParameters ?: return null
                            if (receiverDescriptor is ParameterDescriptor && receiverDescriptor == lambdaValueParameters.firstOrNull()) {
                                val originalReceiverType = receiverDescriptor.type
                                val receiverType = originalReceiverType.approximateFlexibleTypes(preferNotNull = true)
                                if (shortTypes) {
                                    "${IdeDescriptorRenderers.SOURCE_CODE_SHORT_NAMES_IN_TYPES.renderType(receiverType)}::$selectorReferenceName"
                                }
                                else {
                                    "${IdeDescriptorRenderers.SOURCE_CODE.renderType(receiverType)}::$selectorReferenceName"
                                }
                            }
                            else {
                                val receiverName = receiverDescriptor.importableFqName ?: receiverDescriptor.name
                                "$receiverName::$selectorReferenceName"
                            }
                        }
                        is KtThisExpression -> {
                            "${receiver.text}::$selectorReferenceName"
                        }
                        else -> null
                    }' @ [239:21] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: String?, entry1: String?, entry2: String?): String?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> String?

'receiver' @ [239:27] ==> val receiver: KtExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertLambdaToReferenceIntention.Companion.buildReferenceText[LocalVariableDescriptor]

'context' @ [241:54] ==> val context: BindingContext defined in org.jetbrains.kotlin.idea.intentions.ConvertLambdaToReferenceIntention.Companion.buildReferenceText[LocalVariableDescriptor]

'REFERENCE_TARGET' @ [241:62] ==> public final val REFERENCE_TARGET: (WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>..WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'receiver' @ [241:80] ==> val receiver: KtExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertLambdaToReferenceIntention.Companion.buildReferenceText[LocalVariableDescriptor]

'context' @ [242:57] ==> val context: BindingContext defined in org.jetbrains.kotlin.idea.intentions.ConvertLambdaToReferenceIntention.Companion.buildReferenceText[LocalVariableDescriptor]

'FUNCTION' @ [242:65] ==> public final val FUNCTION: (WritableSlice<(PsiElement..PsiElement?), (SimpleFunctionDescriptor..SimpleFunctionDescriptor?)>..WritableSlice<(PsiElement..PsiElement?), (SimpleFunctionDescriptor..SimpleFunctionDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'lambdaExpression' @ [242:75] ==> value-parameter lambdaExpression: KtLambdaExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertLambdaToReferenceIntention.Companion.buildReferenceText[ValueParameterDescriptorImpl]

'functionLiteral' @ [242:92] ==> public final val KtLambdaExpression.functionLiteral: KtFunctionLiteral[MyPropertyDescriptor]

'valueParameters' @ [242:110] ==> public final val SimpleFunctionDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'if (receiverDescriptor is ParameterDescriptor && receiverDescriptor == lambdaValueParameters.firstOrNull()) {
                                val originalReceiverType = receiverDescriptor.type
                                val receiverType = originalReceiverType.approximateFlexibleTypes(preferNotNull = true)
                                if (shortTypes) {
                                    "${IdeDescriptorRenderers.SOURCE_CODE_SHORT_NAMES_IN_TYPES.renderType(receiverType)}::$selectorReferenceName"
                                }
                                else {
                                    "${IdeDescriptorRenderers.SOURCE_CODE.renderType(receiverType)}::$selectorReferenceName"
                                }
                            }
                            else {
                                val receiverName = receiverDescriptor.importableFqName ?: receiverDescriptor.name
                                "$receiverName::$selectorReferenceName"
                            }' @ [243:29] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'receiverDescriptor' @ [243:33] ==> val receiverDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.intentions.ConvertLambdaToReferenceIntention.Companion.buildReferenceText[LocalVariableDescriptor]

'receiverDescriptor' @ [243:78] ==> val receiverDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.intentions.ConvertLambdaToReferenceIntention.Companion.buildReferenceText[LocalVariableDescriptor]

'lambdaValueParameters' @ [243:100] ==> val lambdaValueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>) defined in org.jetbrains.kotlin.idea.intentions.ConvertLambdaToReferenceIntention.Companion.buildReferenceText[LocalVariableDescriptor]

'firstOrNull' @ [243:122] ==> public fun <T> List<(ValueParameterDescriptor..ValueParameterDescriptor?)>.firstOrNull(): ValueParameterDescriptor? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.ValueParameterDescriptor..org.jetbrains.kotlin.descriptors.ValueParameterDescriptor?)

'receiverDescriptor' @ [244:60] ==> val receiverDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.intentions.ConvertLambdaToReferenceIntention.Companion.buildReferenceText[LocalVariableDescriptor]

'type' @ [244:79] ==> public final val ParameterDescriptor.type: KotlinType[MyPropertyDescriptor]

'originalReceiverType' @ [245:52] ==> val originalReceiverType: KotlinType defined in org.jetbrains.kotlin.idea.intentions.ConvertLambdaToReferenceIntention.Companion.buildReferenceText[LocalVariableDescriptor]

'approximateFlexibleTypes' @ [245:73] ==> public fun KotlinType.approximateFlexibleTypes(preferNotNull: Boolean = ..., preferStarForRaw: Boolean = ...): KotlinType defined in org.jetbrains.kotlin.idea.util[DeserializedSimpleFunctionDescriptor]

'if (shortTypes) {
                                    "${IdeDescriptorRenderers.SOURCE_CODE_SHORT_NAMES_IN_TYPES.renderType(receiverType)}::$selectorReferenceName"
                                }
                                else {
                                    "${IdeDescriptorRenderers.SOURCE_CODE.renderType(receiverType)}::$selectorReferenceName"
                                }' @ [246:33] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'shortTypes' @ [246:37] ==> value-parameter shortTypes: Boolean defined in org.jetbrains.kotlin.idea.intentions.ConvertLambdaToReferenceIntention.Companion.buildReferenceText[ValueParameterDescriptorImpl]

'IdeDescriptorRenderers' @ [247:40] ==> public object IdeDescriptorRenderers defined in org.jetbrains.kotlin.idea.util[FakeCallableDescriptorForObject]

'SOURCE_CODE_SHORT_NAMES_IN_TYPES' @ [247:63] ==> @field:JvmField public final val SOURCE_CODE_SHORT_NAMES_IN_TYPES: DescriptorRenderer defined in org.jetbrains.kotlin.idea.util.IdeDescriptorRenderers[DeserializedPropertyDescriptor]

'renderType' @ [247:96] ==> public abstract fun renderType(type: KotlinType): String defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[DeserializedSimpleFunctionDescriptor]

'receiverType' @ [247:107] ==> val receiverType: KotlinType defined in org.jetbrains.kotlin.idea.intentions.ConvertLambdaToReferenceIntention.Companion.buildReferenceText[LocalVariableDescriptor]

'selectorReferenceName' @ [247:124] ==> val selectorReferenceName: String defined in org.jetbrains.kotlin.idea.intentions.ConvertLambdaToReferenceIntention.Companion.buildReferenceText[LocalVariableDescriptor]

'IdeDescriptorRenderers' @ [250:40] ==> public object IdeDescriptorRenderers defined in org.jetbrains.kotlin.idea.util[FakeCallableDescriptorForObject]

'SOURCE_CODE' @ [250:63] ==> @field:JvmField public final val SOURCE_CODE: DescriptorRenderer defined in org.jetbrains.kotlin.idea.util.IdeDescriptorRenderers[DeserializedPropertyDescriptor]

'renderType' @ [250:75] ==> public abstract fun renderType(type: KotlinType): String defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[DeserializedSimpleFunctionDescriptor]

'receiverType' @ [250:86] ==> val receiverType: KotlinType defined in org.jetbrains.kotlin.idea.intentions.ConvertLambdaToReferenceIntention.Companion.buildReferenceText[LocalVariableDescriptor]

'selectorReferenceName' @ [250:103] ==> val selectorReferenceName: String defined in org.jetbrains.kotlin.idea.intentions.ConvertLambdaToReferenceIntention.Companion.buildReferenceText[LocalVariableDescriptor]

'receiverDescriptor' @ [254:52] ==> val receiverDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.intentions.ConvertLambdaToReferenceIntention.Companion.buildReferenceText[LocalVariableDescriptor]

'importableFqName' @ [254:71] ==> public val DeclarationDescriptor.importableFqName: FqName? defined in org.jetbrains.kotlin.idea.imports[DeserializedPropertyDescriptor]

'receiverDescriptor' @ [254:91] ==> val receiverDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.intentions.ConvertLambdaToReferenceIntention.Companion.buildReferenceText[LocalVariableDescriptor]

'name' @ [254:110] ==> public final val DeclarationDescriptor.name: Name[MyPropertyDescriptor]

'receiverName' @ [255:35] ==> val receiverName: Any defined in org.jetbrains.kotlin.idea.intentions.ConvertLambdaToReferenceIntention.Companion.buildReferenceText[LocalVariableDescriptor]

'selectorReferenceName' @ [255:50] ==> val selectorReferenceName: String defined in org.jetbrains.kotlin.idea.intentions.ConvertLambdaToReferenceIntention.Companion.buildReferenceText[LocalVariableDescriptor]

'receiver' @ [259:32] ==> val receiver: KtExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertLambdaToReferenceIntention.Companion.buildReferenceText[LocalVariableDescriptor]

'text' @ [259:41] ==> public final val KtThisExpression.text: (String..String?)[MyPropertyDescriptor]

'selectorReferenceName' @ [259:49] ==> val selectorReferenceName: String defined in org.jetbrains.kotlin.idea.intentions.ConvertLambdaToReferenceIntention.Companion.buildReferenceText[LocalVariableDescriptor]

'calleeExpression' @ [268:65] ==> public final val KtCallExpression.calleeExpression: KtExpression?[MyPropertyDescriptor]

'getReferencedName' @ [268:114] ==> public open fun getReferencedName(): String defined in org.jetbrains.kotlin.psi.KtNameReferenceExpression[DeserializedSimpleFunctionDescriptor]

'bodyExpression' @ [270:66] ==> public final val KtLambdaExpression.bodyExpression: KtBlockExpression?[MyPropertyDescriptor]

'statements' @ [270:82] ==> public final val KtBlockExpression.statements: List<(KtExpression..KtExpression?)>[MyPropertyDescriptor]

'singleOrNull' @ [270:94] ==> public fun <T> List<(KtExpression..KtExpression?)>.singleOrNull(): KtExpression? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtExpression..org.jetbrains.kotlin.psi.KtExpression?)

