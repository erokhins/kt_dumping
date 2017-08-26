'AbstractReceiverValue' @ [30:12] ==> public constructor AbstractReceiverValue(@NotNull p0: KotlinType) defined in org.jetbrains.kotlin.resolve.scopes.receivers.AbstractReceiverValue[JavaClassConstructorDescriptor]

'type' @ [30:34] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.resolve.scopes.receivers.ExpressionReceiver.Companion.ExpressionReceiverImpl.<init>[ValueParameterDescriptorImpl]

'ExpressionReceiverImpl' @ [31:61] ==> public constructor ExpressionReceiverImpl(expression: KtExpression, type: KotlinType) defined in org.jetbrains.kotlin.resolve.scopes.receivers.ExpressionReceiver.Companion.ExpressionReceiverImpl[ClassConstructorDescriptorImpl]

'expression' @ [31:84] ==> public open val expression: KtExpression defined in org.jetbrains.kotlin.resolve.scopes.receivers.ExpressionReceiver.Companion.ExpressionReceiverImpl[PropertyDescriptorImpl]

'newType' @ [31:96] ==> value-parameter newType: KotlinType defined in org.jetbrains.kotlin.resolve.scopes.receivers.ExpressionReceiver.Companion.ExpressionReceiverImpl.replaceType[ValueParameterDescriptorImpl]

'type' @ [33:41] ==> public final val ExpressionReceiver.Companion.ExpressionReceiverImpl.type: KotlinType[MyPropertyDescriptor]

'expression' @ [33:48] ==> public open val expression: KtExpression defined in org.jetbrains.kotlin.resolve.scopes.receivers.ExpressionReceiver.Companion.ExpressionReceiverImpl[PropertyDescriptorImpl]

'expression' @ [33:62] ==> public open val expression: KtExpression defined in org.jetbrains.kotlin.resolve.scopes.receivers.ExpressionReceiver.Companion.ExpressionReceiverImpl[PropertyDescriptorImpl]

'text' @ [33:73] ==> public final val KtExpression.text: (String..String?)[MyPropertyDescriptor]

'ExpressionReceiverImpl' @ [40:13] ==> public constructor ExpressionReceiverImpl(expression: KtExpression, type: KotlinType) defined in org.jetbrains.kotlin.resolve.scopes.receivers.ExpressionReceiver.Companion.ExpressionReceiverImpl[ClassConstructorDescriptorImpl]

'expression' @ [40:36] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.resolve.scopes.receivers.ExpressionReceiver.Companion.ThisExpressionClassReceiver.<init>[ValueParameterDescriptorImpl]

'type' @ [40:48] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.resolve.scopes.receivers.ExpressionReceiver.Companion.ThisExpressionClassReceiver.<init>[ValueParameterDescriptorImpl]

'ThisExpressionClassReceiver' @ [41:61] ==> public constructor ThisExpressionClassReceiver(classDescriptor: ClassDescriptor, expression: KtExpression, type: KotlinType) defined in org.jetbrains.kotlin.resolve.scopes.receivers.ExpressionReceiver.Companion.ThisExpressionClassReceiver[ClassConstructorDescriptorImpl]

'classDescriptor' @ [41:89] ==> public open val classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.resolve.scopes.receivers.ExpressionReceiver.Companion.ThisExpressionClassReceiver[PropertyDescriptorImpl]

'expression' @ [41:106] ==> public open val expression: KtExpression defined in org.jetbrains.kotlin.resolve.scopes.receivers.ExpressionReceiver.Companion.ThisExpressionClassReceiver[PropertyDescriptorImpl]

'newType' @ [41:118] ==> value-parameter newType: KotlinType defined in org.jetbrains.kotlin.resolve.scopes.receivers.ExpressionReceiver.Companion.ThisExpressionClassReceiver.replaceType[ValueParameterDescriptorImpl]

'ExpressionReceiverImpl' @ [48:13] ==> public constructor ExpressionReceiverImpl(expression: KtExpression, type: KotlinType) defined in org.jetbrains.kotlin.resolve.scopes.receivers.ExpressionReceiver.Companion.ExpressionReceiverImpl[ClassConstructorDescriptorImpl]

'expression' @ [48:36] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.resolve.scopes.receivers.ExpressionReceiver.Companion.SuperExpressionReceiver.<init>[ValueParameterDescriptorImpl]

'type' @ [48:48] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.resolve.scopes.receivers.ExpressionReceiver.Companion.SuperExpressionReceiver.<init>[ValueParameterDescriptorImpl]

'SuperExpressionReceiver' @ [49:61] ==> public constructor SuperExpressionReceiver(thisType: KotlinType, expression: KtExpression, type: KotlinType) defined in org.jetbrains.kotlin.resolve.scopes.receivers.ExpressionReceiver.Companion.SuperExpressionReceiver[ClassConstructorDescriptorImpl]

'thisType' @ [49:85] ==> public open val thisType: KotlinType defined in org.jetbrains.kotlin.resolve.scopes.receivers.ExpressionReceiver.Companion.SuperExpressionReceiver[PropertyDescriptorImpl]

'expression' @ [49:95] ==> public open val expression: KtExpression defined in org.jetbrains.kotlin.resolve.scopes.receivers.ExpressionReceiver.Companion.SuperExpressionReceiver[PropertyDescriptorImpl]

'newType' @ [49:107] ==> value-parameter newType: KotlinType defined in org.jetbrains.kotlin.resolve.scopes.receivers.ExpressionReceiver.Companion.SuperExpressionReceiver.replaceType[ValueParameterDescriptorImpl]

'if (expression is KtThisExpression) {
                referenceExpression = expression.instanceReference
            }
            else if (expression is KtConstructorDelegationReferenceExpression) { // todo check this
                referenceExpression = expression
            }' @ [58:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'expression' @ [58:17] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.resolve.scopes.receivers.ExpressionReceiver.Companion.create[ValueParameterDescriptorImpl]

'referenceExpression' @ [59:17] ==> var referenceExpression: KtReferenceExpression? defined in org.jetbrains.kotlin.resolve.scopes.receivers.ExpressionReceiver.Companion.create[LocalVariableDescriptor]

'expression' @ [59:39] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.resolve.scopes.receivers.ExpressionReceiver.Companion.create[ValueParameterDescriptorImpl]

'instanceReference' @ [59:50] ==> public final val KtThisExpression.instanceReference: KtReferenceExpression[MyPropertyDescriptor]

'expression' @ [61:22] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.resolve.scopes.receivers.ExpressionReceiver.Companion.create[ValueParameterDescriptorImpl]

'referenceExpression' @ [62:17] ==> var referenceExpression: KtReferenceExpression? defined in org.jetbrains.kotlin.resolve.scopes.receivers.ExpressionReceiver.Companion.create[LocalVariableDescriptor]

'expression' @ [62:39] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.resolve.scopes.receivers.ExpressionReceiver.Companion.create[ValueParameterDescriptorImpl]

'if (referenceExpression != null) {
                val descriptor = bindingContext.get(BindingContext.REFERENCE_TARGET, referenceExpression)
                if (descriptor is ClassDescriptor) {
                    return ThisExpressionClassReceiver(descriptor.original, expression, type)
                }
            }
            else if (expression is KtSuperExpression) {
                // if there is no THIS_TYPE_FOR_SUPER_EXPRESSION in binding context, we fall through into more restrictive option
                // i.e. just return common ExpressionReceiverImpl
                bindingContext[BindingContext.THIS_TYPE_FOR_SUPER_EXPRESSION, expression]?.let {
                    thisType -> return SuperExpressionReceiver(thisType, expression, type)
                }
            }' @ [65:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'referenceExpression' @ [65:17] ==> var referenceExpression: KtReferenceExpression? defined in org.jetbrains.kotlin.resolve.scopes.receivers.ExpressionReceiver.Companion.create[LocalVariableDescriptor]

'bindingContext' @ [66:34] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.resolve.scopes.receivers.ExpressionReceiver.Companion.create[ValueParameterDescriptorImpl]

'get' @ [66:49] ==> @Nullable public abstract operator fun <K : (Any..Any?), V : (Any..Any?)> get(slice: (ReadOnlySlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>..ReadOnlySlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>?), key: (KtReferenceExpression..KtReferenceExpression?)): DeclarationDescriptor? defined in org.jetbrains.kotlin.resolve.BindingContext[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> (org.jetbrains.kotlin.psi.KtReferenceExpression..org.jetbrains.kotlin.psi.KtReferenceExpression?)
    <V : (Any..Any?)> -> (org.jetbrains.kotlin.descriptors.DeclarationDescriptor..org.jetbrains.kotlin.descriptors.DeclarationDescriptor?)

'REFERENCE_TARGET' @ [66:68] ==> public final val REFERENCE_TARGET: (WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>..WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'referenceExpression' @ [66:86] ==> var referenceExpression: KtReferenceExpression? defined in org.jetbrains.kotlin.resolve.scopes.receivers.ExpressionReceiver.Companion.create[LocalVariableDescriptor]

'descriptor' @ [67:21] ==> val descriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.resolve.scopes.receivers.ExpressionReceiver.Companion.create[LocalVariableDescriptor]

'ThisExpressionClassReceiver' @ [68:28] ==> public constructor ThisExpressionClassReceiver(classDescriptor: ClassDescriptor, expression: KtExpression, type: KotlinType) defined in org.jetbrains.kotlin.resolve.scopes.receivers.ExpressionReceiver.Companion.ThisExpressionClassReceiver[ClassConstructorDescriptorImpl]

'descriptor' @ [68:56] ==> val descriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.resolve.scopes.receivers.ExpressionReceiver.Companion.create[LocalVariableDescriptor]

'original' @ [68:67] ==> public final val ClassDescriptor.original: ClassDescriptor[MyPropertyDescriptor]

'expression' @ [68:77] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.resolve.scopes.receivers.ExpressionReceiver.Companion.create[ValueParameterDescriptorImpl]

'type' @ [68:89] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.resolve.scopes.receivers.ExpressionReceiver.Companion.create[ValueParameterDescriptorImpl]

'expression' @ [71:22] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.resolve.scopes.receivers.ExpressionReceiver.Companion.create[ValueParameterDescriptorImpl]

'bindingContext' @ [74:17] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.resolve.scopes.receivers.ExpressionReceiver.Companion.create[ValueParameterDescriptorImpl]

'THIS_TYPE_FOR_SUPER_EXPRESSION' @ [74:47] ==> public final val THIS_TYPE_FOR_SUPER_EXPRESSION: (WritableSlice<(KtSuperExpression..KtSuperExpression?), (KotlinType..KotlinType?)>..WritableSlice<(KtSuperExpression..KtSuperExpression?), (KotlinType..KotlinType?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'expression' @ [74:79] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.resolve.scopes.receivers.ExpressionReceiver.Companion.create[ValueParameterDescriptorImpl]

'let' @ [74:92] ==> @InlineOnly public inline fun <T, R> KotlinType.let(block: (KotlinType) -> Nothing): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType
    <R> -> Nothing

'SuperExpressionReceiver' @ [75:40] ==> public constructor SuperExpressionReceiver(thisType: KotlinType, expression: KtExpression, type: KotlinType) defined in org.jetbrains.kotlin.resolve.scopes.receivers.ExpressionReceiver.Companion.SuperExpressionReceiver[ClassConstructorDescriptorImpl]

'thisType' @ [75:64] ==> value-parameter thisType: KotlinType defined in org.jetbrains.kotlin.resolve.scopes.receivers.ExpressionReceiver.Companion.create.<anonymous>[ValueParameterDescriptorImpl]

'expression' @ [75:74] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.resolve.scopes.receivers.ExpressionReceiver.Companion.create[ValueParameterDescriptorImpl]

'type' @ [75:86] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.resolve.scopes.receivers.ExpressionReceiver.Companion.create[ValueParameterDescriptorImpl]

'ExpressionReceiverImpl' @ [79:20] ==> public constructor ExpressionReceiverImpl(expression: KtExpression, type: KotlinType) defined in org.jetbrains.kotlin.resolve.scopes.receivers.ExpressionReceiver.Companion.ExpressionReceiverImpl[ClassConstructorDescriptorImpl]

'expression' @ [79:43] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.resolve.scopes.receivers.ExpressionReceiver.Companion.create[ValueParameterDescriptorImpl]

'type' @ [79:55] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.resolve.scopes.receivers.ExpressionReceiver.Companion.create[ValueParameterDescriptorImpl]

