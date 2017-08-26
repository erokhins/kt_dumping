'IrElementTransformerVoid' @ [38:44] ==> public constructor IrElementTransformerVoid() defined in org.jetbrains.kotlin.ir.visitors.IrElementTransformerVoid[DeserializedClassConstructorDescriptor]

'irFile' @ [40:9] ==> value-parameter irFile: IrFile defined in org.jetbrains.kotlin.backend.jvm.lower.ConstAndJvmFieldPropertiesLowering.lower[ValueParameterDescriptorImpl]

'transformChildrenVoid' @ [40:16] ==> public fun IrElement.transformChildrenVoid(transformer: IrElementTransformerVoid): Unit defined in org.jetbrains.kotlin.ir.visitors[DeserializedSimpleFunctionDescriptor]

'this' @ [40:38] ==> <this> defined in org.jetbrains.kotlin.backend.jvm.lower.ConstAndJvmFieldPropertiesLowering[LazyClassReceiverParameterDescriptor]

'super' @ [44:16] ==> <this> defined in org.jetbrains.kotlin.backend.jvm.lower.ConstAndJvmFieldPropertiesLowering[LazyClassReceiverParameterDescriptor]

'visitDeclaration' @ [44:22] ==> public open fun visitDeclaration(declaration: IrDeclaration): IrStatement defined in org.jetbrains.kotlin.ir.visitors.IrElementTransformerVoid[DeserializedSimpleFunctionDescriptor]

'declaration' @ [44:39] ==> value-parameter declaration: IrDeclaration defined in org.jetbrains.kotlin.backend.jvm.lower.ConstAndJvmFieldPropertiesLowering.visitDeclaration[ValueParameterDescriptorImpl]

'isConstOrHasJvmFieldAnnotation' @ [48:28] ==> public open fun isConstOrHasJvmFieldAnnotation(@NotNull p0: PropertyDescriptor): Boolean defined in org.jetbrains.kotlin.codegen.JvmCodegenUtil[JavaMethodDescriptor]

'declaration' @ [48:59] ==> value-parameter declaration: IrProperty defined in org.jetbrains.kotlin.backend.jvm.lower.ConstAndJvmFieldPropertiesLowering.visitProperty[ValueParameterDescriptorImpl]

'descriptor' @ [48:71] ==> public abstract val descriptor: PropertyDescriptor defined in org.jetbrains.kotlin.ir.declarations.IrProperty[DeserializedPropertyDescriptor]

'declaration' @ [50:13] ==> value-parameter declaration: IrProperty defined in org.jetbrains.kotlin.backend.jvm.lower.ConstAndJvmFieldPropertiesLowering.visitProperty[ValueParameterDescriptorImpl]

'getter' @ [50:25] ==> public abstract var getter: IrFunction? defined in org.jetbrains.kotlin.ir.declarations.IrProperty[DeserializedPropertyDescriptor]

'declaration' @ [51:13] ==> value-parameter declaration: IrProperty defined in org.jetbrains.kotlin.backend.jvm.lower.ConstAndJvmFieldPropertiesLowering.visitProperty[ValueParameterDescriptorImpl]

'setter' @ [51:25] ==> public abstract var setter: IrFunction? defined in org.jetbrains.kotlin.ir.declarations.IrProperty[DeserializedPropertyDescriptor]

'super' @ [53:16] ==> <this> defined in org.jetbrains.kotlin.backend.jvm.lower.ConstAndJvmFieldPropertiesLowering[LazyClassReceiverParameterDescriptor]

'visitProperty' @ [53:22] ==> public open fun visitProperty(declaration: IrProperty): IrStatement defined in org.jetbrains.kotlin.ir.visitors.IrElementTransformerVoid[DeserializedSimpleFunctionDescriptor]

'declaration' @ [53:36] ==> value-parameter declaration: IrProperty defined in org.jetbrains.kotlin.backend.jvm.lower.ConstAndJvmFieldPropertiesLowering.visitProperty[ValueParameterDescriptorImpl]

'super' @ [57:16] ==> <this> defined in org.jetbrains.kotlin.backend.jvm.lower.ConstAndJvmFieldPropertiesLowering[LazyClassReceiverParameterDescriptor]

'visitMemberAccess' @ [57:22] ==> public open fun visitMemberAccess(expression: IrMemberAccessExpression): IrExpression defined in org.jetbrains.kotlin.ir.visitors.IrElementTransformerVoid[DeserializedSimpleFunctionDescriptor]

'expression' @ [57:40] ==> value-parameter expression: IrMemberAccessExpression defined in org.jetbrains.kotlin.backend.jvm.lower.ConstAndJvmFieldPropertiesLowering.visitMemberAccess[ValueParameterDescriptorImpl]

'expression' @ [61:26] ==> value-parameter expression: IrCall defined in org.jetbrains.kotlin.backend.jvm.lower.ConstAndJvmFieldPropertiesLowering.visitCall[ValueParameterDescriptorImpl]

'descriptor' @ [61:37] ==> public abstract val descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.ir.expressions.IrCall[DeserializedPropertyDescriptor]

'descriptor' @ [62:13] ==> val descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.backend.jvm.lower.ConstAndJvmFieldPropertiesLowering.visitCall[LocalVariableDescriptor]

'super' @ [63:20] ==> <this> defined in org.jetbrains.kotlin.backend.jvm.lower.ConstAndJvmFieldPropertiesLowering[LazyClassReceiverParameterDescriptor]

'visitCall' @ [63:26] ==> public open fun visitCall(expression: IrCall): IrExpression defined in org.jetbrains.kotlin.ir.visitors.IrElementTransformerVoid[DeserializedSimpleFunctionDescriptor]

'expression' @ [63:36] ==> value-parameter expression: IrCall defined in org.jetbrains.kotlin.backend.jvm.lower.ConstAndJvmFieldPropertiesLowering.visitCall[ValueParameterDescriptorImpl]

'descriptor' @ [66:24] ==> val descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.backend.jvm.lower.ConstAndJvmFieldPropertiesLowering.visitCall[LocalVariableDescriptor]

'correspondingProperty' @ [66:35] ==> public final val PropertyAccessorDescriptor.correspondingProperty: PropertyDescriptor[MyPropertyDescriptor]

'if (JvmCodegenUtil.isConstOrHasJvmFieldAnnotation(property)) {
            return if (descriptor is PropertyGetterDescriptor) {
                substituteGetter(descriptor, expression)
            }
            else {
                substituteSetter(descriptor, expression)
            }
        }
        else if (property is SyntheticJavaPropertyDescriptor) {
            expression.dispatchReceiver = expression.extensionReceiver
            expression.extensionReceiver = null
        }' @ [67:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'isConstOrHasJvmFieldAnnotation' @ [67:28] ==> public open fun isConstOrHasJvmFieldAnnotation(@NotNull p0: PropertyDescriptor): Boolean defined in org.jetbrains.kotlin.codegen.JvmCodegenUtil[JavaMethodDescriptor]

'property' @ [67:59] ==> val property: PropertyDescriptor defined in org.jetbrains.kotlin.backend.jvm.lower.ConstAndJvmFieldPropertiesLowering.visitCall[LocalVariableDescriptor]

'if (descriptor is PropertyGetterDescriptor) {
                substituteGetter(descriptor, expression)
            }
            else {
                substituteSetter(descriptor, expression)
            }' @ [68:20] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: IrExpression, elseBranch: IrExpression): IrExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> IrExpression

'descriptor' @ [68:24] ==> val descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.backend.jvm.lower.ConstAndJvmFieldPropertiesLowering.visitCall[LocalVariableDescriptor]

'substituteGetter' @ [69:17] ==> private final fun substituteGetter(descriptor: PropertyGetterDescriptor, expression: IrCall): IrGetFieldImpl defined in org.jetbrains.kotlin.backend.jvm.lower.ConstAndJvmFieldPropertiesLowering[SimpleFunctionDescriptorImpl]

'descriptor' @ [69:34] ==> val descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.backend.jvm.lower.ConstAndJvmFieldPropertiesLowering.visitCall[LocalVariableDescriptor]

'expression' @ [69:46] ==> value-parameter expression: IrCall defined in org.jetbrains.kotlin.backend.jvm.lower.ConstAndJvmFieldPropertiesLowering.visitCall[ValueParameterDescriptorImpl]

'substituteSetter' @ [72:17] ==> private final fun substituteSetter(descriptor: PropertyAccessorDescriptor, expression: IrCall): IrSetFieldImpl defined in org.jetbrains.kotlin.backend.jvm.lower.ConstAndJvmFieldPropertiesLowering[SimpleFunctionDescriptorImpl]

'descriptor' @ [72:34] ==> val descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.backend.jvm.lower.ConstAndJvmFieldPropertiesLowering.visitCall[LocalVariableDescriptor]

'expression' @ [72:46] ==> value-parameter expression: IrCall defined in org.jetbrains.kotlin.backend.jvm.lower.ConstAndJvmFieldPropertiesLowering.visitCall[ValueParameterDescriptorImpl]

'property' @ [75:18] ==> val property: PropertyDescriptor defined in org.jetbrains.kotlin.backend.jvm.lower.ConstAndJvmFieldPropertiesLowering.visitCall[LocalVariableDescriptor]

'expression' @ [76:13] ==> value-parameter expression: IrCall defined in org.jetbrains.kotlin.backend.jvm.lower.ConstAndJvmFieldPropertiesLowering.visitCall[ValueParameterDescriptorImpl]

'dispatchReceiver' @ [76:24] ==> public abstract var dispatchReceiver: IrExpression? defined in org.jetbrains.kotlin.ir.expressions.IrCall[DeserializedPropertyDescriptor]

'expression' @ [76:43] ==> value-parameter expression: IrCall defined in org.jetbrains.kotlin.backend.jvm.lower.ConstAndJvmFieldPropertiesLowering.visitCall[ValueParameterDescriptorImpl]

'extensionReceiver' @ [76:54] ==> public abstract var extensionReceiver: IrExpression? defined in org.jetbrains.kotlin.ir.expressions.IrCall[DeserializedPropertyDescriptor]

'expression' @ [77:13] ==> value-parameter expression: IrCall defined in org.jetbrains.kotlin.backend.jvm.lower.ConstAndJvmFieldPropertiesLowering.visitCall[ValueParameterDescriptorImpl]

'extensionReceiver' @ [77:24] ==> public abstract var extensionReceiver: IrExpression? defined in org.jetbrains.kotlin.ir.expressions.IrCall[DeserializedPropertyDescriptor]

'super' @ [79:16] ==> <this> defined in org.jetbrains.kotlin.backend.jvm.lower.ConstAndJvmFieldPropertiesLowering[LazyClassReceiverParameterDescriptor]

'visitCall' @ [79:22] ==> public open fun visitCall(expression: IrCall): IrExpression defined in org.jetbrains.kotlin.ir.visitors.IrElementTransformerVoid[DeserializedSimpleFunctionDescriptor]

'expression' @ [79:32] ==> value-parameter expression: IrCall defined in org.jetbrains.kotlin.backend.jvm.lower.ConstAndJvmFieldPropertiesLowering.visitCall[ValueParameterDescriptorImpl]

'IrSetFieldImpl' @ [83:16] ==> @Deprecated public constructor IrSetFieldImpl(startOffset: Int, endOffset: Int, propertyDescriptor: PropertyDescriptor, receiver: IrExpression?, value: IrExpression, origin: IrStatementOrigin? = ..., superQualifier: ClassDescriptor? = ...) defined in org.jetbrains.kotlin.ir.expressions.impl.IrSetFieldImpl[DeserializedClassConstructorDescriptor]

'expression' @ [84:17] ==> value-parameter expression: IrCall defined in org.jetbrains.kotlin.backend.jvm.lower.ConstAndJvmFieldPropertiesLowering.substituteSetter[ValueParameterDescriptorImpl]

'startOffset' @ [84:28] ==> public abstract val startOffset: Int defined in org.jetbrains.kotlin.ir.expressions.IrCall[DeserializedPropertyDescriptor]

'expression' @ [85:17] ==> value-parameter expression: IrCall defined in org.jetbrains.kotlin.backend.jvm.lower.ConstAndJvmFieldPropertiesLowering.substituteSetter[ValueParameterDescriptorImpl]

'endOffset' @ [85:28] ==> public abstract val endOffset: Int defined in org.jetbrains.kotlin.ir.expressions.IrCall[DeserializedPropertyDescriptor]

'descriptor' @ [86:17] ==> value-parameter descriptor: PropertyAccessorDescriptor defined in org.jetbrains.kotlin.backend.jvm.lower.ConstAndJvmFieldPropertiesLowering.substituteSetter[ValueParameterDescriptorImpl]

'correspondingProperty' @ [86:28] ==> public final val PropertyAccessorDescriptor.correspondingProperty: PropertyDescriptor[MyPropertyDescriptor]

'expression' @ [87:17] ==> value-parameter expression: IrCall defined in org.jetbrains.kotlin.backend.jvm.lower.ConstAndJvmFieldPropertiesLowering.substituteSetter[ValueParameterDescriptorImpl]

'dispatchReceiver' @ [87:28] ==> public abstract var dispatchReceiver: IrExpression? defined in org.jetbrains.kotlin.ir.expressions.IrCall[DeserializedPropertyDescriptor]

'expression' @ [88:17] ==> value-parameter expression: IrCall defined in org.jetbrains.kotlin.backend.jvm.lower.ConstAndJvmFieldPropertiesLowering.substituteSetter[ValueParameterDescriptorImpl]

'getValueArgument' @ [88:28] ==> public abstract fun getValueArgument(index: Int): IrExpression? defined in org.jetbrains.kotlin.ir.expressions.IrCall[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [88:45] ==> value-parameter descriptor: PropertyAccessorDescriptor defined in org.jetbrains.kotlin.backend.jvm.lower.ConstAndJvmFieldPropertiesLowering.substituteSetter[ValueParameterDescriptorImpl]

'valueParameters' @ [88:56] ==> public final val PropertyAccessorDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'lastIndex' @ [88:72] ==> public val <T> List<(ValueParameterDescriptor..ValueParameterDescriptor?)>.lastIndex: Int defined in kotlin.collections[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.ValueParameterDescriptor..org.jetbrains.kotlin.descriptors.ValueParameterDescriptor?)

'expression' @ [89:17] ==> value-parameter expression: IrCall defined in org.jetbrains.kotlin.backend.jvm.lower.ConstAndJvmFieldPropertiesLowering.substituteSetter[ValueParameterDescriptorImpl]

'origin' @ [89:28] ==> public abstract val origin: IrStatementOrigin? defined in org.jetbrains.kotlin.ir.expressions.IrCall[DeserializedPropertyDescriptor]

'expression' @ [90:17] ==> value-parameter expression: IrCall defined in org.jetbrains.kotlin.backend.jvm.lower.ConstAndJvmFieldPropertiesLowering.substituteSetter[ValueParameterDescriptorImpl]

'superQualifier' @ [90:28] ==> public abstract val superQualifier: ClassDescriptor? defined in org.jetbrains.kotlin.ir.expressions.IrCall[DeserializedPropertyDescriptor]

'IrGetFieldImpl' @ [95:16] ==> @Deprecated public constructor IrGetFieldImpl(startOffset: Int, endOffset: Int, propertyDescriptor: PropertyDescriptor, receiver: IrExpression?, origin: IrStatementOrigin? = ..., superQualifier: ClassDescriptor? = ...) defined in org.jetbrains.kotlin.ir.expressions.impl.IrGetFieldImpl[DeserializedClassConstructorDescriptor]

'expression' @ [96:17] ==> value-parameter expression: IrCall defined in org.jetbrains.kotlin.backend.jvm.lower.ConstAndJvmFieldPropertiesLowering.substituteGetter[ValueParameterDescriptorImpl]

'startOffset' @ [96:28] ==> public abstract val startOffset: Int defined in org.jetbrains.kotlin.ir.expressions.IrCall[DeserializedPropertyDescriptor]

'expression' @ [97:17] ==> value-parameter expression: IrCall defined in org.jetbrains.kotlin.backend.jvm.lower.ConstAndJvmFieldPropertiesLowering.substituteGetter[ValueParameterDescriptorImpl]

'endOffset' @ [97:28] ==> public abstract val endOffset: Int defined in org.jetbrains.kotlin.ir.expressions.IrCall[DeserializedPropertyDescriptor]

'descriptor' @ [98:17] ==> value-parameter descriptor: PropertyGetterDescriptor defined in org.jetbrains.kotlin.backend.jvm.lower.ConstAndJvmFieldPropertiesLowering.substituteGetter[ValueParameterDescriptorImpl]

'correspondingProperty' @ [98:28] ==> public final val PropertyGetterDescriptor.correspondingProperty: PropertyDescriptor[MyPropertyDescriptor]

'expression' @ [99:17] ==> value-parameter expression: IrCall defined in org.jetbrains.kotlin.backend.jvm.lower.ConstAndJvmFieldPropertiesLowering.substituteGetter[ValueParameterDescriptorImpl]

'dispatchReceiver' @ [99:28] ==> public abstract var dispatchReceiver: IrExpression? defined in org.jetbrains.kotlin.ir.expressions.IrCall[DeserializedPropertyDescriptor]

'expression' @ [100:17] ==> value-parameter expression: IrCall defined in org.jetbrains.kotlin.backend.jvm.lower.ConstAndJvmFieldPropertiesLowering.substituteGetter[ValueParameterDescriptorImpl]

'origin' @ [100:28] ==> public abstract val origin: IrStatementOrigin? defined in org.jetbrains.kotlin.ir.expressions.IrCall[DeserializedPropertyDescriptor]

'expression' @ [101:17] ==> value-parameter expression: IrCall defined in org.jetbrains.kotlin.backend.jvm.lower.ConstAndJvmFieldPropertiesLowering.substituteGetter[ValueParameterDescriptorImpl]

'superQualifier' @ [101:28] ==> public abstract val superQualifier: ClassDescriptor? defined in org.jetbrains.kotlin.ir.expressions.IrCall[DeserializedPropertyDescriptor]

