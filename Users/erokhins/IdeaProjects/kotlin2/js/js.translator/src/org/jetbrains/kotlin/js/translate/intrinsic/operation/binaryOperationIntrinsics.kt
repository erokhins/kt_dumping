'mutableMapOf' @ [37:34] ==> @SinceKotlin @InlineOnly public inline fun <K, V> mutableMapOf(): MutableMap<IntrinsicKey, BinaryOperationIntrinsic> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> IntrinsicKey
    <V> -> BinaryOperationIntrinsic

'listOf' @ [39:29] ==> public fun <T> listOf(vararg elements: BinaryOperationIntrinsicFactory): List<BinaryOperationIntrinsicFactory> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> BinaryOperationIntrinsicFactory

'LongCompareToBOIF' @ [39:36] ==> public object LongCompareToBOIF : BinaryOperationIntrinsicFactory defined in org.jetbrains.kotlin.js.translate.intrinsic.operation in file LongCompareToBOIF.kt[FakeCallableDescriptorForObject]

'EqualsBOIF' @ [39:55] ==> public object EqualsBOIF : BinaryOperationIntrinsicFactory defined in org.jetbrains.kotlin.js.translate.intrinsic.operation in file EqualsBOIF.kt[FakeCallableDescriptorForObject]

'CompareToBOIF' @ [39:67] ==> public object CompareToBOIF : BinaryOperationIntrinsicFactory defined in org.jetbrains.kotlin.js.translate.intrinsic.operation in file CompareToBOIF.kt[FakeCallableDescriptorForObject]

'AssignmentBOIF' @ [39:82] ==> public object AssignmentBOIF : BinaryOperationIntrinsicFactory defined in org.jetbrains.kotlin.js.translate.intrinsic.operation in file AssignmentBOIF.kt[FakeCallableDescriptorForObject]

'getOperationToken' @ [42:21] ==> @NotNull public open fun getOperationToken(@NotNull expression: KtOperationExpression): KtToken defined in org.jetbrains.kotlin.js.translate.utils.PsiUtils[JavaMethodDescriptor]

'expression' @ [42:39] ==> value-parameter expression: KtBinaryExpression defined in org.jetbrains.kotlin.js.translate.intrinsic.operation.BinaryOperationIntrinsics.getIntrinsic[ValueParameterDescriptorImpl]

'getCallableDescriptorForOperationExpression' @ [43:26] ==> @Nullable public open fun getCallableDescriptorForOperationExpression(@NotNull context: BindingContext, @NotNull expression: KtOperationExpression): CallableDescriptor? defined in org.jetbrains.kotlin.js.translate.utils.BindingUtils[JavaMethodDescriptor]

'context' @ [43:70] ==> value-parameter context: TranslationContext defined in org.jetbrains.kotlin.js.translate.intrinsic.operation.BinaryOperationIntrinsics.getIntrinsic[ValueParameterDescriptorImpl]

'bindingContext' @ [43:78] ==> @NotNull public open fun bindingContext(): BindingContext defined in org.jetbrains.kotlin.js.translate.context.TranslationContext[JavaMethodDescriptor]

'expression' @ [43:96] ==> value-parameter expression: KtBinaryExpression defined in org.jetbrains.kotlin.js.translate.intrinsic.operation.BinaryOperationIntrinsics.getIntrinsic[ValueParameterDescriptorImpl]

'descriptor' @ [44:13] ==> val descriptor: CallableDescriptor? defined in org.jetbrains.kotlin.js.translate.intrinsic.operation.BinaryOperationIntrinsics.getIntrinsic[LocalVariableDescriptor]

'descriptor' @ [44:35] ==> val descriptor: CallableDescriptor? defined in org.jetbrains.kotlin.js.translate.intrinsic.operation.BinaryOperationIntrinsics.getIntrinsic[LocalVariableDescriptor]

'NO_INTRINSIC' @ [45:20] ==> public object NO_INTRINSIC : AbstractBinaryOperationIntrinsic defined in org.jetbrains.kotlin.js.translate.intrinsic.operation in file binaryOperationIntrinsics.kt[FakeCallableDescriptorForObject]

'expression' @ [48:24] ==> value-parameter expression: KtBinaryExpression defined in org.jetbrains.kotlin.js.translate.intrinsic.operation.BinaryOperationIntrinsics.getIntrinsic[ValueParameterDescriptorImpl]

'left' @ [48:35] ==> public final val KtBinaryExpression.left: KtExpression?[MyPropertyDescriptor]

'let' @ [48:41] ==> @InlineOnly public inline fun <T, R> KtExpression.let(block: (KtExpression) -> KotlinType?): KotlinType? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression
    <R> -> KotlinType?

'context' @ [48:47] ==> value-parameter context: TranslationContext defined in org.jetbrains.kotlin.js.translate.intrinsic.operation.BinaryOperationIntrinsics.getIntrinsic[ValueParameterDescriptorImpl]

'bindingContext' @ [48:55] ==> @NotNull public open fun bindingContext(): BindingContext defined in org.jetbrains.kotlin.js.translate.context.TranslationContext[JavaMethodDescriptor]

'getType' @ [48:72] ==> @Nullable public abstract fun getType(@NotNull p0: KtExpression): KotlinType? defined in org.jetbrains.kotlin.resolve.BindingContext[JavaMethodDescriptor]

'it' @ [48:80] ==> value-parameter it: KtExpression defined in org.jetbrains.kotlin.js.translate.intrinsic.operation.BinaryOperationIntrinsics.getIntrinsic.<anonymous>[ValueParameterDescriptorImpl]

'expression' @ [49:25] ==> value-parameter expression: KtBinaryExpression defined in org.jetbrains.kotlin.js.translate.intrinsic.operation.BinaryOperationIntrinsics.getIntrinsic[ValueParameterDescriptorImpl]

'right' @ [49:36] ==> public final val KtBinaryExpression.right: KtExpression?[MyPropertyDescriptor]

'let' @ [49:43] ==> @InlineOnly public inline fun <T, R> KtExpression.let(block: (KtExpression) -> KotlinType?): KotlinType? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression
    <R> -> KotlinType?

'context' @ [49:49] ==> value-parameter context: TranslationContext defined in org.jetbrains.kotlin.js.translate.intrinsic.operation.BinaryOperationIntrinsics.getIntrinsic[ValueParameterDescriptorImpl]

'bindingContext' @ [49:57] ==> @NotNull public open fun bindingContext(): BindingContext defined in org.jetbrains.kotlin.js.translate.context.TranslationContext[JavaMethodDescriptor]

'getType' @ [49:74] ==> @Nullable public abstract fun getType(@NotNull p0: KtExpression): KotlinType? defined in org.jetbrains.kotlin.resolve.BindingContext[JavaMethodDescriptor]

'it' @ [49:82] ==> value-parameter it: KtExpression defined in org.jetbrains.kotlin.js.translate.intrinsic.operation.BinaryOperationIntrinsics.getIntrinsic.<anonymous>[ValueParameterDescriptorImpl]

'IntrinsicKey' @ [51:19] ==> public constructor IntrinsicKey(token: KtToken, function: FunctionDescriptor, leftType: KotlinType?, rightType: KotlinType?) defined in org.jetbrains.kotlin.js.translate.intrinsic.operation.IntrinsicKey[ClassConstructorDescriptorImpl]

'token' @ [51:32] ==> val token: KtToken defined in org.jetbrains.kotlin.js.translate.intrinsic.operation.BinaryOperationIntrinsics.getIntrinsic[LocalVariableDescriptor]

'descriptor' @ [51:39] ==> val descriptor: CallableDescriptor? defined in org.jetbrains.kotlin.js.translate.intrinsic.operation.BinaryOperationIntrinsics.getIntrinsic[LocalVariableDescriptor]

'leftType' @ [51:51] ==> val leftType: KotlinType? defined in org.jetbrains.kotlin.js.translate.intrinsic.operation.BinaryOperationIntrinsics.getIntrinsic[LocalVariableDescriptor]

'rightType' @ [51:61] ==> val rightType: KotlinType? defined in org.jetbrains.kotlin.js.translate.intrinsic.operation.BinaryOperationIntrinsics.getIntrinsic[LocalVariableDescriptor]

'intrinsicCache' @ [52:16] ==> private final val intrinsicCache: MutableMap<IntrinsicKey, BinaryOperationIntrinsic> defined in org.jetbrains.kotlin.js.translate.intrinsic.operation.BinaryOperationIntrinsics[PropertyDescriptorImpl]

'getOrPut' @ [52:31] ==> public inline fun <K, V> MutableMap<IntrinsicKey, BinaryOperationIntrinsic>.getOrPut(key: IntrinsicKey, defaultValue: () -> BinaryOperationIntrinsic): BinaryOperationIntrinsic defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> IntrinsicKey
    <V> -> BinaryOperationIntrinsic

'key' @ [52:40] ==> val key: IntrinsicKey defined in org.jetbrains.kotlin.js.translate.intrinsic.operation.BinaryOperationIntrinsics.getIntrinsic[LocalVariableDescriptor]

'computeIntrinsic' @ [52:47] ==> private final fun computeIntrinsic(token: KtToken, descriptor: FunctionDescriptor, leftType: KotlinType?, rightType: KotlinType?): BinaryOperationIntrinsic defined in org.jetbrains.kotlin.js.translate.intrinsic.operation.BinaryOperationIntrinsics[SimpleFunctionDescriptorImpl]

'token' @ [52:64] ==> val token: KtToken defined in org.jetbrains.kotlin.js.translate.intrinsic.operation.BinaryOperationIntrinsics.getIntrinsic[LocalVariableDescriptor]

'descriptor' @ [52:71] ==> val descriptor: CallableDescriptor? defined in org.jetbrains.kotlin.js.translate.intrinsic.operation.BinaryOperationIntrinsics.getIntrinsic[LocalVariableDescriptor]

'leftType' @ [52:83] ==> val leftType: KotlinType? defined in org.jetbrains.kotlin.js.translate.intrinsic.operation.BinaryOperationIntrinsics.getIntrinsic[LocalVariableDescriptor]

'rightType' @ [52:93] ==> val rightType: KotlinType? defined in org.jetbrains.kotlin.js.translate.intrinsic.operation.BinaryOperationIntrinsics.getIntrinsic[LocalVariableDescriptor]

'factories' @ [59:25] ==> private final val factories: List<BinaryOperationIntrinsicFactory> defined in org.jetbrains.kotlin.js.translate.intrinsic.operation.BinaryOperationIntrinsics[PropertyDescriptorImpl]

'factory' @ [60:17] ==> val factory: BinaryOperationIntrinsicFactory defined in org.jetbrains.kotlin.js.translate.intrinsic.operation.BinaryOperationIntrinsics.computeIntrinsic[LocalVariableDescriptor]

'getSupportTokens' @ [60:25] ==> public abstract fun getSupportTokens(): Set<KtToken> defined in org.jetbrains.kotlin.js.translate.intrinsic.operation.BinaryOperationIntrinsicFactory[SimpleFunctionDescriptorImpl]

'contains' @ [60:44] ==> public abstract fun contains(element: KtToken): Boolean defined in kotlin.collections.Set[DeserializedSimpleFunctionDescriptor]

'token' @ [60:53] ==> value-parameter token: KtToken defined in org.jetbrains.kotlin.js.translate.intrinsic.operation.BinaryOperationIntrinsics.computeIntrinsic[ValueParameterDescriptorImpl]

'factory' @ [61:33] ==> val factory: BinaryOperationIntrinsicFactory defined in org.jetbrains.kotlin.js.translate.intrinsic.operation.BinaryOperationIntrinsics.computeIntrinsic[LocalVariableDescriptor]

'getIntrinsic' @ [61:41] ==> public abstract fun getIntrinsic(descriptor: FunctionDescriptor, leftType: KotlinType?, rightType: KotlinType?): BinaryOperationIntrinsic? defined in org.jetbrains.kotlin.js.translate.intrinsic.operation.BinaryOperationIntrinsicFactory[SimpleFunctionDescriptorImpl]

'descriptor' @ [61:54] ==> value-parameter descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.js.translate.intrinsic.operation.BinaryOperationIntrinsics.computeIntrinsic[ValueParameterDescriptorImpl]

'leftType' @ [61:66] ==> value-parameter leftType: KotlinType? defined in org.jetbrains.kotlin.js.translate.intrinsic.operation.BinaryOperationIntrinsics.computeIntrinsic[ValueParameterDescriptorImpl]

'rightType' @ [61:76] ==> value-parameter rightType: KotlinType? defined in org.jetbrains.kotlin.js.translate.intrinsic.operation.BinaryOperationIntrinsics.computeIntrinsic[ValueParameterDescriptorImpl]

'intrinsic' @ [62:21] ==> val intrinsic: BinaryOperationIntrinsic? defined in org.jetbrains.kotlin.js.translate.intrinsic.operation.BinaryOperationIntrinsics.computeIntrinsic[LocalVariableDescriptor]

'intrinsic' @ [63:28] ==> val intrinsic: BinaryOperationIntrinsic? defined in org.jetbrains.kotlin.js.translate.intrinsic.operation.BinaryOperationIntrinsics.computeIntrinsic[LocalVariableDescriptor]

'NO_INTRINSIC' @ [67:16] ==> public object NO_INTRINSIC : AbstractBinaryOperationIntrinsic defined in org.jetbrains.kotlin.js.translate.intrinsic.operation in file binaryOperationIntrinsics.kt[FakeCallableDescriptorForObject]

'AbstractBinaryOperationIntrinsic' @ [90:23] ==> public constructor AbstractBinaryOperationIntrinsic() defined in org.jetbrains.kotlin.js.translate.intrinsic.operation.AbstractBinaryOperationIntrinsic[ClassConstructorDescriptorImpl]

'UnsupportedOperationException' @ [94:19] ==> public final fun <init>(p0: (String..String?)): UnsupportedOperationException /* = UnsupportedOperationException */ defined in kotlin.UnsupportedOperationException[TypeAliasConstructorDescriptorImpl]

