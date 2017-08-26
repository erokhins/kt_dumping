'IntrinsicPropertyGetter' @ [27:28] ==> public constructor IntrinsicPropertyGetter() defined in org.jetbrains.kotlin.codegen.intrinsics.IntrinsicPropertyGetter[ClassConstructorDescriptorImpl]

'resolvedCall' @ [29:29] ==> value-parameter resolvedCall: ResolvedCall<*>? defined in org.jetbrains.kotlin.codegen.intrinsics.KClassJavaProperty.generate[ValueParameterDescriptorImpl]

'extensionReceiver' @ [29:44] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.extensionReceiver: ReceiverValue?[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> Captured(*)

'receiverValue' @ [30:38] ==> val receiverValue: ExpressionReceiver defined in org.jetbrains.kotlin.codegen.intrinsics.KClassJavaProperty.generate[LocalVariableDescriptor]

'expression' @ [30:52] ==> public abstract val expression: KtExpression defined in org.jetbrains.kotlin.resolve.scopes.receivers.ExpressionReceiver[DeserializedPropertyDescriptor]

'classLiteralExpression' @ [31:34] ==> val classLiteralExpression: KtClassLiteralExpression defined in org.jetbrains.kotlin.codegen.intrinsics.KClassJavaProperty.generate[LocalVariableDescriptor]

'receiverExpression' @ [31:57] ==> public final val receiverExpression: KtExpression? defined in org.jetbrains.kotlin.psi.KtClassLiteralExpression[DeserializedPropertyDescriptor]

'codegen' @ [32:19] ==> value-parameter codegen: ExpressionCodegen defined in org.jetbrains.kotlin.codegen.intrinsics.KClassJavaProperty.generate[ValueParameterDescriptorImpl]

'bindingContext' @ [32:27] ==> public final val ExpressionCodegen.bindingContext: BindingContext[MyPropertyDescriptor]

'get' @ [32:42] ==> @Nullable public abstract operator fun <K : (Any..Any?), V : (Any..Any?)> get(p0: (ReadOnlySlice<(KtExpression..KtExpression?), (DoubleColonLHS..DoubleColonLHS?)>..ReadOnlySlice<(KtExpression..KtExpression?), (DoubleColonLHS..DoubleColonLHS?)>?), p1: (KtExpression..KtExpression?)): DoubleColonLHS? defined in org.jetbrains.kotlin.resolve.BindingContext[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> (org.jetbrains.kotlin.psi.KtExpression..org.jetbrains.kotlin.psi.KtExpression?)
    <V : (Any..Any?)> -> (org.jetbrains.kotlin.types.expressions.DoubleColonLHS..org.jetbrains.kotlin.types.expressions.DoubleColonLHS?)

'DOUBLE_COLON_LHS' @ [32:46] ==> public final val DOUBLE_COLON_LHS: (WritableSlice<(KtExpression..KtExpression?), (DoubleColonLHS..DoubleColonLHS?)>..WritableSlice<(KtExpression..KtExpression?), (DoubleColonLHS..DoubleColonLHS?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'receiverExpression' @ [32:64] ==> val receiverExpression: KtExpression defined in org.jetbrains.kotlin.codegen.intrinsics.KClassJavaProperty.generate[LocalVariableDescriptor]

'codegen' @ [33:21] ==> value-parameter codegen: ExpressionCodegen defined in org.jetbrains.kotlin.codegen.intrinsics.KClassJavaProperty.generate[ValueParameterDescriptorImpl]

'generateClassLiteralReference' @ [33:29] ==> @NotNull public open fun generateClassLiteralReference(@NotNull lhs: DoubleColonLHS, @Nullable receiverExpression: KtExpression?, wrapIntoKClass: Boolean): StackValue defined in org.jetbrains.kotlin.codegen.ExpressionCodegen[JavaMethodDescriptor]

'lhs' @ [33:59] ==> val lhs: DoubleColonLHS defined in org.jetbrains.kotlin.codegen.intrinsics.KClassJavaProperty.generate[LocalVariableDescriptor]

'receiverExpression' @ [33:64] ==> val receiverExpression: KtExpression defined in org.jetbrains.kotlin.codegen.intrinsics.KClassJavaProperty.generate[LocalVariableDescriptor]

'coercion' @ [34:27] ==> public open fun coercion(@NotNull value: StackValue, @NotNull castType: Type): (StackValue..StackValue?) defined in org.jetbrains.kotlin.codegen.StackValue[JavaMethodDescriptor]

'value' @ [34:36] ==> val value: StackValue defined in org.jetbrains.kotlin.codegen.intrinsics.KClassJavaProperty.generate[LocalVariableDescriptor]

'returnType' @ [34:43] ==> value-parameter returnType: Type defined in org.jetbrains.kotlin.codegen.intrinsics.KClassJavaProperty.generate[ValueParameterDescriptorImpl]

