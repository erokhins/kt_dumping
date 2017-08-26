'field' @ [27:25] ==> value-parameter field: JavaField defined in org.jetbrains.kotlin.load.java.components.JavaPropertyInitializerEvaluatorImpl.getInitializerConstant[ValueParameterDescriptorImpl]

'initializerValue' @ [27:31] ==> public abstract val initializerValue: Any? defined in org.jetbrains.kotlin.load.java.structure.JavaField[DeserializedPropertyDescriptor]

'ConstantValueFactory' @ [29:23] ==> public constructor ConstantValueFactory(builtins: KotlinBuiltIns) defined in org.jetbrains.kotlin.resolve.constants.ConstantValueFactory[DeserializedClassConstructorDescriptor]

'descriptor' @ [29:44] ==> value-parameter descriptor: PropertyDescriptor defined in org.jetbrains.kotlin.load.java.components.JavaPropertyInitializerEvaluatorImpl.getInitializerConstant[ValueParameterDescriptorImpl]

'builtIns' @ [29:55] ==> public val DeclarationDescriptor.builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedPropertyDescriptor]

'when (evaluated) {
        //Note: evaluated expression may be of class that does not match field type in some cases
        // tested for Int, left other checks just in case
            is Byte, is Short, is Int, is Long -> {
                factory.createIntegerConstantValue((evaluated as Number).toLong(), descriptor.type)
            }
            else -> {
                factory.createConstantValue(evaluated)
            }
        }' @ [30:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: ConstantValue<*>?, entry1: ConstantValue<*>?): ConstantValue<*>?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> ConstantValue<*>?

'evaluated' @ [30:22] ==> val evaluated: Any defined in org.jetbrains.kotlin.load.java.components.JavaPropertyInitializerEvaluatorImpl.getInitializerConstant[LocalVariableDescriptor]

'factory' @ [34:17] ==> val factory: ConstantValueFactory defined in org.jetbrains.kotlin.load.java.components.JavaPropertyInitializerEvaluatorImpl.getInitializerConstant[LocalVariableDescriptor]

'createIntegerConstantValue' @ [34:25] ==> public final fun createIntegerConstantValue(value: Long, expectedType: KotlinType): ConstantValue<*>? defined in org.jetbrains.kotlin.resolve.constants.ConstantValueFactory[DeserializedSimpleFunctionDescriptor]

'evaluated' @ [34:53] ==> val evaluated: Any defined in org.jetbrains.kotlin.load.java.components.JavaPropertyInitializerEvaluatorImpl.getInitializerConstant[LocalVariableDescriptor]

'toLong' @ [34:74] ==> public abstract fun toLong(): Long defined in kotlin.Number[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [34:84] ==> value-parameter descriptor: PropertyDescriptor defined in org.jetbrains.kotlin.load.java.components.JavaPropertyInitializerEvaluatorImpl.getInitializerConstant[ValueParameterDescriptorImpl]

'type' @ [34:95] ==> public final val PropertyDescriptor.type: KotlinType[MyPropertyDescriptor]

'factory' @ [37:17] ==> val factory: ConstantValueFactory defined in org.jetbrains.kotlin.load.java.components.JavaPropertyInitializerEvaluatorImpl.getInitializerConstant[LocalVariableDescriptor]

'createConstantValue' @ [37:25] ==> public final fun createConstantValue(value: Any?): ConstantValue<*>? defined in org.jetbrains.kotlin.resolve.constants.ConstantValueFactory[DeserializedSimpleFunctionDescriptor]

'evaluated' @ [37:45] ==> val evaluated: Any defined in org.jetbrains.kotlin.load.java.components.JavaPropertyInitializerEvaluatorImpl.getInitializerConstant[LocalVariableDescriptor]

