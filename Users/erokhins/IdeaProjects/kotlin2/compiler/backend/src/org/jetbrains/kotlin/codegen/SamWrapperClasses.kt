'hashMapOf' @ [28:46] ==> @SinceKotlin @InlineOnly public inline fun <K, V> hashMapOf(): HashMap<SamWrapperClasses.WrapperKey, Type> /* = HashMap<SamWrapperClasses.WrapperKey, Type> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> WrapperKey
    <V> -> Type

'isInlineOrContainingInline' @ [31:41] ==> public open fun isInlineOrContainingInline(@Nullable p0: DeclarationDescriptor?): Boolean defined in org.jetbrains.kotlin.resolve.inline.InlineUtil[JavaMethodDescriptor]

'expressionCodegen' @ [31:68] ==> value-parameter expressionCodegen: ExpressionCodegen defined in org.jetbrains.kotlin.codegen.SamWrapperClasses.getSamWrapperClass[ValueParameterDescriptorImpl]

'context' @ [31:86] ==> public final val context: (MethodContext..MethodContext?) defined in org.jetbrains.kotlin.codegen.ExpressionCodegen[JavaPropertyDescriptor]

'contextDescriptor' @ [31:94] ==> public final val MethodContext.contextDescriptor: CallableMemberDescriptor[MyPropertyDescriptor]

'samInterfaceToWrapperClass' @ [32:16] ==> private final val samInterfaceToWrapperClass: HashMap<SamWrapperClasses.WrapperKey, Type> /* = HashMap<SamWrapperClasses.WrapperKey, Type> */ defined in org.jetbrains.kotlin.codegen.SamWrapperClasses[PropertyDescriptorImpl]

'getOrPut' @ [32:43] ==> public inline fun <K, V> MutableMap<SamWrapperClasses.WrapperKey, Type>.getOrPut(key: SamWrapperClasses.WrapperKey, defaultValue: () -> Type): Type defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> WrapperKey
    <V> -> Type

'WrapperKey' @ [32:52] ==> public constructor WrapperKey(samType: SamType, file: KtFile, insideInline: Boolean) defined in org.jetbrains.kotlin.codegen.SamWrapperClasses.WrapperKey[ClassConstructorDescriptorImpl]

'samType' @ [32:63] ==> value-parameter samType: SamType defined in org.jetbrains.kotlin.codegen.SamWrapperClasses.getSamWrapperClass[ValueParameterDescriptorImpl]

'file' @ [32:72] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.codegen.SamWrapperClasses.getSamWrapperClass[ValueParameterDescriptorImpl]

'isInsideInline' @ [32:78] ==> val isInsideInline: Boolean defined in org.jetbrains.kotlin.codegen.SamWrapperClasses.getSamWrapperClass[LocalVariableDescriptor]

'SamWrapperCodegen' @ [33:13] ==> public constructor SamWrapperCodegen(@NotNull state: GenerationState, @NotNull samType: SamType, @NotNull parentCodegen: MemberCodegen<*>, isInsideInline: Boolean) defined in org.jetbrains.kotlin.codegen.SamWrapperCodegen[JavaClassConstructorDescriptor]

'state' @ [33:31] ==> private final val state: GenerationState defined in org.jetbrains.kotlin.codegen.SamWrapperClasses[PropertyDescriptorImpl]

'samType' @ [33:38] ==> value-parameter samType: SamType defined in org.jetbrains.kotlin.codegen.SamWrapperClasses.getSamWrapperClass[ValueParameterDescriptorImpl]

'expressionCodegen' @ [33:47] ==> value-parameter expressionCodegen: ExpressionCodegen defined in org.jetbrains.kotlin.codegen.SamWrapperClasses.getSamWrapperClass[ValueParameterDescriptorImpl]

'parentCodegen' @ [33:65] ==> public final val ExpressionCodegen.parentCodegen: MemberCodegen<*>[MyPropertyDescriptor]

'isInsideInline' @ [33:80] ==> val isInsideInline: Boolean defined in org.jetbrains.kotlin.codegen.SamWrapperClasses.getSamWrapperClass[LocalVariableDescriptor]

'genWrapper' @ [33:96] ==> @NotNull public open fun genWrapper(@NotNull file: KtFile): Type defined in org.jetbrains.kotlin.codegen.SamWrapperCodegen[JavaMethodDescriptor]

'file' @ [33:107] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.codegen.SamWrapperClasses.getSamWrapperClass[ValueParameterDescriptorImpl]

