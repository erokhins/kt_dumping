'IntrinsicPropertyGetter' @ [31:31] ==> public constructor IntrinsicPropertyGetter() defined in org.jetbrains.kotlin.codegen.intrinsics.IntrinsicPropertyGetter[ClassConstructorDescriptorImpl]

'resolvedCall' @ [33:34] ==> value-parameter resolvedCall: ResolvedCall<*>? defined in org.jetbrains.kotlin.codegen.intrinsics.KCallableNameProperty.generate[ValueParameterDescriptorImpl]

'dispatchReceiver' @ [33:49] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.dispatchReceiver: ReceiverValue?[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)

'expressionReceiver' @ [34:26] ==> val expressionReceiver: ExpressionReceiver defined in org.jetbrains.kotlin.codegen.intrinsics.KCallableNameProperty.generate[LocalVariableDescriptor]

'expression' @ [34:45] ==> public abstract val expression: KtExpression defined in org.jetbrains.kotlin.resolve.scopes.receivers.ExpressionReceiver[DeserializedPropertyDescriptor]

'expression' @ [36:34] ==> val expression: KtCallableReferenceExpression defined in org.jetbrains.kotlin.codegen.intrinsics.KCallableNameProperty.generate[LocalVariableDescriptor]

'receiverExpression' @ [36:45] ==> public final val receiverExpression: KtExpression? defined in org.jetbrains.kotlin.psi.KtCallableReferenceExpression[DeserializedPropertyDescriptor]

'receiverExpression' @ [37:19] ==> val receiverExpression: KtExpression? defined in org.jetbrains.kotlin.codegen.intrinsics.KCallableNameProperty.generate[LocalVariableDescriptor]

'let' @ [37:39] ==> @InlineOnly public inline fun <T, R> KtExpression.let(block: (KtExpression) -> DoubleColonLHS?): DoubleColonLHS? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression
    <R> -> DoubleColonLHS?

'codegen' @ [37:45] ==> value-parameter codegen: ExpressionCodegen defined in org.jetbrains.kotlin.codegen.intrinsics.KCallableNameProperty.generate[ValueParameterDescriptorImpl]

'bindingContext' @ [37:53] ==> public final val ExpressionCodegen.bindingContext: BindingContext[MyPropertyDescriptor]

'get' @ [37:68] ==> @Nullable public abstract operator fun <K : (Any..Any?), V : (Any..Any?)> get(p0: (ReadOnlySlice<(KtExpression..KtExpression?), (DoubleColonLHS..DoubleColonLHS?)>..ReadOnlySlice<(KtExpression..KtExpression?), (DoubleColonLHS..DoubleColonLHS?)>?), p1: (KtExpression..KtExpression?)): DoubleColonLHS? defined in org.jetbrains.kotlin.resolve.BindingContext[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> KtExpression
    <V : (Any..Any?)> -> DoubleColonLHS

'DOUBLE_COLON_LHS' @ [37:72] ==> public final val DOUBLE_COLON_LHS: (WritableSlice<(KtExpression..KtExpression?), (DoubleColonLHS..DoubleColonLHS?)>..WritableSlice<(KtExpression..KtExpression?), (DoubleColonLHS..DoubleColonLHS?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'it' @ [37:90] ==> value-parameter it: KtExpression defined in org.jetbrains.kotlin.codegen.intrinsics.KCallableNameProperty.generate.<anonymous>[ValueParameterDescriptorImpl]

'expression' @ [39:33] ==> val expression: KtCallableReferenceExpression defined in org.jetbrains.kotlin.codegen.intrinsics.KCallableNameProperty.generate[LocalVariableDescriptor]

'callableReference' @ [39:44] ==> public final val KtCallableReferenceExpression.callableReference: KtSimpleNameExpression[MyPropertyDescriptor]

'callableReference' @ [40:26] ==> val callableReference: KtSimpleNameExpression defined in org.jetbrains.kotlin.codegen.intrinsics.KCallableNameProperty.generate[LocalVariableDescriptor]

'getResolvedCall' @ [40:44] ==> public fun KtElement?.getResolvedCall(context: BindingContext): ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.resolve.calls.callUtil[DeserializedSimpleFunctionDescriptor]

'codegen' @ [40:60] ==> value-parameter codegen: ExpressionCodegen defined in org.jetbrains.kotlin.codegen.intrinsics.KCallableNameProperty.generate[ValueParameterDescriptorImpl]

'bindingContext' @ [40:68] ==> public final val ExpressionCodegen.bindingContext: BindingContext[MyPropertyDescriptor]

'resultingDescriptor' @ [40:85] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.resultingDescriptor: CallableDescriptor[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> CallableDescriptor

'operation' @ [42:27] ==> public open fun operation(type: (Type..Type?), lambda: (((InstructionAdapter..InstructionAdapter?)) -> (Unit..Unit?)..(((InstructionAdapter..InstructionAdapter?)) -> (Unit..Unit?))?)): (StackValue..StackValue?) defined in org.jetbrains.kotlin.codegen.StackValue[JavaMethodDescriptor]

'returnType' @ [42:37] ==> value-parameter returnType: Type defined in org.jetbrains.kotlin.codegen.intrinsics.KCallableNameProperty.generate[ValueParameterDescriptorImpl]

'lhs' @ [44:17] ==> val lhs: DoubleColonLHS? defined in org.jetbrains.kotlin.codegen.intrinsics.KCallableNameProperty.generate[LocalVariableDescriptor]

'codegen' @ [45:17] ==> value-parameter codegen: ExpressionCodegen defined in org.jetbrains.kotlin.codegen.intrinsics.KCallableNameProperty.generate[ValueParameterDescriptorImpl]

'gen' @ [45:25] ==> public open fun gen(expr: (KtElement..KtElement?), type: (Type..Type?)): Unit defined in org.jetbrains.kotlin.codegen.ExpressionCodegen[JavaMethodDescriptor]

'receiverExpression' @ [45:29] ==> val receiverExpression: KtExpression? defined in org.jetbrains.kotlin.codegen.intrinsics.KCallableNameProperty.generate[LocalVariableDescriptor]

'VOID_TYPE' @ [45:49] ==> public final val VOID_TYPE: (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'iv' @ [47:13] ==> value-parameter iv: (InstructionAdapter..InstructionAdapter?) defined in org.jetbrains.kotlin.codegen.intrinsics.KCallableNameProperty.generate.<anonymous>[ValueParameterDescriptorImpl]

'aconst' @ [47:16] ==> public open fun aconst(p0: (Any..Any?)): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'descriptor' @ [47:23] ==> val descriptor: CallableDescriptor defined in org.jetbrains.kotlin.codegen.intrinsics.KCallableNameProperty.generate[LocalVariableDescriptor]

'name' @ [47:34] ==> public final val CallableDescriptor.name: Name[MyPropertyDescriptor]

'asString' @ [47:39] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'coerce' @ [48:24] ==> public open fun coerce(@NotNull fromType: Type, @NotNull toType: Type, @NotNull v: InstructionAdapter): Unit defined in org.jetbrains.kotlin.codegen.StackValue[JavaMethodDescriptor]

'JAVA_STRING_TYPE' @ [48:31] ==> public final val JAVA_STRING_TYPE: (Type..Type?) defined in org.jetbrains.kotlin.resolve.jvm.AsmTypes[JavaPropertyDescriptor]

'returnType' @ [48:49] ==> value-parameter returnType: Type defined in org.jetbrains.kotlin.codegen.intrinsics.KCallableNameProperty.generate[ValueParameterDescriptorImpl]

'iv' @ [48:61] ==> value-parameter iv: (InstructionAdapter..InstructionAdapter?) defined in org.jetbrains.kotlin.codegen.intrinsics.KCallableNameProperty.generate.<anonymous>[ValueParameterDescriptorImpl]

