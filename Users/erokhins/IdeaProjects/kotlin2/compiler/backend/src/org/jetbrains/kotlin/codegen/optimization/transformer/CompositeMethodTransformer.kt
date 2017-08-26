'MethodTransformer' @ [21:93] ==> public constructor MethodTransformer() defined in org.jetbrains.kotlin.codegen.optimization.transformer.MethodTransformer[JavaClassConstructorDescriptor]

'transformers' @ [23:9] ==> private final val transformers: Array<out MethodTransformer> defined in org.jetbrains.kotlin.codegen.optimization.transformer.CompositeMethodTransformer[PropertyDescriptorImpl]

'forEach' @ [23:22] ==> public inline fun <T> Array<out MethodTransformer>.forEach(action: (MethodTransformer) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MethodTransformer

'it' @ [23:32] ==> value-parameter it: MethodTransformer defined in org.jetbrains.kotlin.codegen.optimization.transformer.CompositeMethodTransformer.transform.<anonymous>[ValueParameterDescriptorImpl]

'transform' @ [23:35] ==> public abstract fun transform(@NotNull internalClassName: String, @NotNull methodNode: MethodNode): Unit defined in org.jetbrains.kotlin.codegen.optimization.transformer.MethodTransformer[JavaMethodDescriptor]

'internalClassName' @ [23:45] ==> value-parameter internalClassName: String defined in org.jetbrains.kotlin.codegen.optimization.transformer.CompositeMethodTransformer.transform[ValueParameterDescriptorImpl]

'methodNode' @ [23:64] ==> value-parameter methodNode: MethodNode defined in org.jetbrains.kotlin.codegen.optimization.transformer.CompositeMethodTransformer.transform[ValueParameterDescriptorImpl]

