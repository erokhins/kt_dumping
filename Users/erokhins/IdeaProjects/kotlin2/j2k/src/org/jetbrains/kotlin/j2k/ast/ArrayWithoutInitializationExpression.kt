'Expression' @ [21:102] ==> public constructor Expression() defined in org.jetbrains.kotlin.j2k.ast.Expression[ClassConstructorDescriptorImpl]

'when (type.elementType) {
            is PrimitiveType -> builder.append(type.toNotNullType())

            is ArrayType ->
                if (hasInit) {
                    builder.append(type.toNotNullType())
                }
                else {
                    builder.append("arrayOfNulls<").append(type.elementType).append(">")
                }

            else -> builder.append("arrayOfNulls<").append(type.elementType).append(">")
        }' @ [23:85] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: CodeBuilder, entry1: CodeBuilder, entry2: CodeBuilder): CodeBuilder[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> CodeBuilder

'type' @ [23:91] ==> value-parameter type: ArrayType defined in org.jetbrains.kotlin.j2k.ast.ArrayWithoutInitializationExpression.generateCode.appendConstructorName[ValueParameterDescriptorImpl]

'elementType' @ [23:96] ==> public final val elementType: Type defined in org.jetbrains.kotlin.j2k.ast.ArrayType[PropertyDescriptorImpl]

'builder' @ [24:33] ==> value-parameter builder: CodeBuilder defined in org.jetbrains.kotlin.j2k.ast.ArrayWithoutInitializationExpression.generateCode[ValueParameterDescriptorImpl]

'append' @ [24:41] ==> public final infix fun append(element: Element): CodeBuilder defined in org.jetbrains.kotlin.j2k.CodeBuilder[SimpleFunctionDescriptorImpl]

'type' @ [24:48] ==> value-parameter type: ArrayType defined in org.jetbrains.kotlin.j2k.ast.ArrayWithoutInitializationExpression.generateCode.appendConstructorName[ValueParameterDescriptorImpl]

'toNotNullType' @ [24:53] ==> public open fun toNotNullType(): Type defined in org.jetbrains.kotlin.j2k.ast.ArrayType[SimpleFunctionDescriptorImpl]

'if (hasInit) {
                    builder.append(type.toNotNullType())
                }
                else {
                    builder.append("arrayOfNulls<").append(type.elementType).append(">")
                }' @ [27:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: CodeBuilder, elseBranch: CodeBuilder): CodeBuilder[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> CodeBuilder

'hasInit' @ [27:21] ==> value-parameter hasInit: Boolean defined in org.jetbrains.kotlin.j2k.ast.ArrayWithoutInitializationExpression.generateCode.appendConstructorName[ValueParameterDescriptorImpl]

'builder' @ [28:21] ==> value-parameter builder: CodeBuilder defined in org.jetbrains.kotlin.j2k.ast.ArrayWithoutInitializationExpression.generateCode[ValueParameterDescriptorImpl]

'append' @ [28:29] ==> public final infix fun append(element: Element): CodeBuilder defined in org.jetbrains.kotlin.j2k.CodeBuilder[SimpleFunctionDescriptorImpl]

'type' @ [28:36] ==> value-parameter type: ArrayType defined in org.jetbrains.kotlin.j2k.ast.ArrayWithoutInitializationExpression.generateCode.appendConstructorName[ValueParameterDescriptorImpl]

'toNotNullType' @ [28:41] ==> public open fun toNotNullType(): Type defined in org.jetbrains.kotlin.j2k.ast.ArrayType[SimpleFunctionDescriptorImpl]

'builder' @ [31:21] ==> value-parameter builder: CodeBuilder defined in org.jetbrains.kotlin.j2k.ast.ArrayWithoutInitializationExpression.generateCode[ValueParameterDescriptorImpl]

'append' @ [31:29] ==> public final infix fun append(text: String): CodeBuilder defined in org.jetbrains.kotlin.j2k.CodeBuilder[SimpleFunctionDescriptorImpl]

'append' @ [31:53] ==> public final infix fun append(element: Element): CodeBuilder defined in org.jetbrains.kotlin.j2k.CodeBuilder[SimpleFunctionDescriptorImpl]

'type' @ [31:60] ==> value-parameter type: ArrayType defined in org.jetbrains.kotlin.j2k.ast.ArrayWithoutInitializationExpression.generateCode.appendConstructorName[ValueParameterDescriptorImpl]

'elementType' @ [31:65] ==> public final val elementType: Type defined in org.jetbrains.kotlin.j2k.ast.ArrayType[PropertyDescriptorImpl]

'append' @ [31:78] ==> public final infix fun append(text: String): CodeBuilder defined in org.jetbrains.kotlin.j2k.CodeBuilder[SimpleFunctionDescriptorImpl]

'builder' @ [34:21] ==> value-parameter builder: CodeBuilder defined in org.jetbrains.kotlin.j2k.ast.ArrayWithoutInitializationExpression.generateCode[ValueParameterDescriptorImpl]

'append' @ [34:29] ==> public final infix fun append(text: String): CodeBuilder defined in org.jetbrains.kotlin.j2k.CodeBuilder[SimpleFunctionDescriptorImpl]

'append' @ [34:53] ==> public final infix fun append(element: Element): CodeBuilder defined in org.jetbrains.kotlin.j2k.CodeBuilder[SimpleFunctionDescriptorImpl]

'type' @ [34:60] ==> value-parameter type: ArrayType defined in org.jetbrains.kotlin.j2k.ast.ArrayWithoutInitializationExpression.generateCode.appendConstructorName[ValueParameterDescriptorImpl]

'elementType' @ [34:65] ==> public final val elementType: Type defined in org.jetbrains.kotlin.j2k.ast.ArrayType[PropertyDescriptorImpl]

'append' @ [34:78] ==> public final infix fun append(text: String): CodeBuilder defined in org.jetbrains.kotlin.j2k.CodeBuilder[SimpleFunctionDescriptorImpl]

'appendConstructorName' @ [38:13] ==> local final fun appendConstructorName(type: ArrayType, hasInit: Boolean): CodeBuilder defined in org.jetbrains.kotlin.j2k.ast.ArrayWithoutInitializationExpression.generateCode[SimpleFunctionDescriptorImpl]

'type' @ [38:35] ==> value-parameter type: ArrayType defined in org.jetbrains.kotlin.j2k.ast.ArrayWithoutInitializationExpression.generateCode.oneDim[ValueParameterDescriptorImpl]

'init' @ [38:41] ==> value-parameter init: (() -> Unit)? = ... defined in org.jetbrains.kotlin.j2k.ast.ArrayWithoutInitializationExpression.generateCode.oneDim[ValueParameterDescriptorImpl]

'append' @ [38:55] ==> public final infix fun append(text: String): CodeBuilder defined in org.jetbrains.kotlin.j2k.CodeBuilder[SimpleFunctionDescriptorImpl]

'append' @ [38:67] ==> public final infix fun append(element: Element): CodeBuilder defined in org.jetbrains.kotlin.j2k.CodeBuilder[SimpleFunctionDescriptorImpl]

'size' @ [38:74] ==> value-parameter size: Expression defined in org.jetbrains.kotlin.j2k.ast.ArrayWithoutInitializationExpression.generateCode.oneDim[ValueParameterDescriptorImpl]

'init' @ [39:17] ==> value-parameter init: (() -> Unit)? = ... defined in org.jetbrains.kotlin.j2k.ast.ArrayWithoutInitializationExpression.generateCode.oneDim[ValueParameterDescriptorImpl]

'builder' @ [40:17] ==> value-parameter builder: CodeBuilder defined in org.jetbrains.kotlin.j2k.ast.ArrayWithoutInitializationExpression.generateCode[ValueParameterDescriptorImpl]

'append' @ [40:25] ==> public final infix fun append(text: String): CodeBuilder defined in org.jetbrains.kotlin.j2k.CodeBuilder[SimpleFunctionDescriptorImpl]

'invoke' @ [41:17] ==> public abstract operator fun invoke(): Unit defined in kotlin.Function0[FunctionInvokeDescriptor]

'builder' @ [43:20] ==> value-parameter builder: CodeBuilder defined in org.jetbrains.kotlin.j2k.ast.ArrayWithoutInitializationExpression.generateCode[ValueParameterDescriptorImpl]

'append' @ [43:28] ==> public final infix fun append(text: String): CodeBuilder defined in org.jetbrains.kotlin.j2k.CodeBuilder[SimpleFunctionDescriptorImpl]

'expressions' @ [47:17] ==> value-parameter expressions: List<Expression> defined in org.jetbrains.kotlin.j2k.ast.ArrayWithoutInitializationExpression.generateCode.constructInnerType[ValueParameterDescriptorImpl]

'size' @ [47:29] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'oneDim' @ [48:24] ==> local final fun oneDim(type: ArrayType, size: Expression, init: (() -> Unit)? = ...): CodeBuilder defined in org.jetbrains.kotlin.j2k.ast.ArrayWithoutInitializationExpression.generateCode[SimpleFunctionDescriptorImpl]

'hostType' @ [48:31] ==> value-parameter hostType: ArrayType defined in org.jetbrains.kotlin.j2k.ast.ArrayWithoutInitializationExpression.generateCode.constructInnerType[ValueParameterDescriptorImpl]

'expressions' @ [48:41] ==> value-parameter expressions: List<Expression> defined in org.jetbrains.kotlin.j2k.ast.ArrayWithoutInitializationExpression.generateCode.constructInnerType[ValueParameterDescriptorImpl]

'hostType' @ [51:29] ==> value-parameter hostType: ArrayType defined in org.jetbrains.kotlin.j2k.ast.ArrayWithoutInitializationExpression.generateCode.constructInnerType[ValueParameterDescriptorImpl]

'elementType' @ [51:38] ==> public final val elementType: Type defined in org.jetbrains.kotlin.j2k.ast.ArrayType[PropertyDescriptorImpl]

'expressions' @ [52:17] ==> value-parameter expressions: List<Expression> defined in org.jetbrains.kotlin.j2k.ast.ArrayWithoutInitializationExpression.generateCode.constructInnerType[ValueParameterDescriptorImpl]

'size' @ [52:29] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'innerType' @ [52:41] ==> val innerType: Type defined in org.jetbrains.kotlin.j2k.ast.ArrayWithoutInitializationExpression.generateCode.constructInnerType[LocalVariableDescriptor]

'oneDim' @ [53:24] ==> local final fun oneDim(type: ArrayType, size: Expression, init: (() -> Unit)? = ...): CodeBuilder defined in org.jetbrains.kotlin.j2k.ast.ArrayWithoutInitializationExpression.generateCode[SimpleFunctionDescriptorImpl]

'hostType' @ [53:31] ==> value-parameter hostType: ArrayType defined in org.jetbrains.kotlin.j2k.ast.ArrayWithoutInitializationExpression.generateCode.constructInnerType[ValueParameterDescriptorImpl]

'expressions' @ [53:41] ==> value-parameter expressions: List<Expression> defined in org.jetbrains.kotlin.j2k.ast.ArrayWithoutInitializationExpression.generateCode.constructInnerType[ValueParameterDescriptorImpl]

'builder' @ [54:21] ==> value-parameter builder: CodeBuilder defined in org.jetbrains.kotlin.j2k.ast.ArrayWithoutInitializationExpression.generateCode[ValueParameterDescriptorImpl]

'append' @ [54:29] ==> public final infix fun append(text: String): CodeBuilder defined in org.jetbrains.kotlin.j2k.CodeBuilder[SimpleFunctionDescriptorImpl]

'constructInnerType' @ [55:21] ==> local final fun constructInnerType(hostType: ArrayType, expressions: List<Expression>): CodeBuilder defined in org.jetbrains.kotlin.j2k.ast.ArrayWithoutInitializationExpression.generateCode[SimpleFunctionDescriptorImpl]

'innerType' @ [55:40] ==> val innerType: Type defined in org.jetbrains.kotlin.j2k.ast.ArrayWithoutInitializationExpression.generateCode.constructInnerType[LocalVariableDescriptor]

'expressions' @ [55:51] ==> value-parameter expressions: List<Expression> defined in org.jetbrains.kotlin.j2k.ast.ArrayWithoutInitializationExpression.generateCode.constructInnerType[ValueParameterDescriptorImpl]

'subList' @ [55:63] ==> public abstract fun subList(fromIndex: Int, toIndex: Int): List<Expression> defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'expressions' @ [55:74] ==> value-parameter expressions: List<Expression> defined in org.jetbrains.kotlin.j2k.ast.ArrayWithoutInitializationExpression.generateCode.constructInnerType[ValueParameterDescriptorImpl]

'size' @ [55:86] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'builder' @ [56:21] ==> value-parameter builder: CodeBuilder defined in org.jetbrains.kotlin.j2k.ast.ArrayWithoutInitializationExpression.generateCode[ValueParameterDescriptorImpl]

'append' @ [56:29] ==> public final infix fun append(text: String): CodeBuilder defined in org.jetbrains.kotlin.j2k.CodeBuilder[SimpleFunctionDescriptorImpl]

'appendConstructorName' @ [60:20] ==> local final fun appendConstructorName(type: ArrayType, hasInit: Boolean): CodeBuilder defined in org.jetbrains.kotlin.j2k.ast.ArrayWithoutInitializationExpression.generateCode[SimpleFunctionDescriptorImpl]

'hostType' @ [60:42] ==> value-parameter hostType: ArrayType defined in org.jetbrains.kotlin.j2k.ast.ArrayWithoutInitializationExpression.generateCode.constructInnerType[ValueParameterDescriptorImpl]

'expressions' @ [60:52] ==> value-parameter expressions: List<Expression> defined in org.jetbrains.kotlin.j2k.ast.ArrayWithoutInitializationExpression.generateCode.constructInnerType[ValueParameterDescriptorImpl]

'isNotEmpty' @ [60:64] ==> @InlineOnly public inline fun <T> Collection<Expression>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Expression

'constructInnerType' @ [63:9] ==> local final fun constructInnerType(hostType: ArrayType, expressions: List<Expression>): CodeBuilder defined in org.jetbrains.kotlin.j2k.ast.ArrayWithoutInitializationExpression.generateCode[SimpleFunctionDescriptorImpl]

'type' @ [63:28] ==> public final val type: ArrayType defined in org.jetbrains.kotlin.j2k.ast.ArrayWithoutInitializationExpression[PropertyDescriptorImpl]

'expressions' @ [63:34] ==> public final val expressions: List<Expression> defined in org.jetbrains.kotlin.j2k.ast.ArrayWithoutInitializationExpression[PropertyDescriptorImpl]

