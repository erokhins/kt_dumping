'StatementGeneratorExtension' @ [39:77] ==> public constructor StatementGeneratorExtension(statementGenerator: StatementGenerator) defined in org.jetbrains.kotlin.psi2ir.generators.StatementGeneratorExtension[ClassConstructorDescriptorImpl]

'statementGenerator' @ [39:105] ==> value-parameter statementGenerator: StatementGenerator defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator.<init>[ValueParameterDescriptorImpl]

'expression' @ [42:26] ==> value-parameter expression: KtPrefixExpression defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator.generatePrefixExpression[ValueParameterDescriptorImpl]

'operationReference' @ [42:37] ==> public final val KtPrefixExpression.operationReference: KtSimpleNameExpression[MyPropertyDescriptor]

'getReferencedNameElementType' @ [42:56] ==> public abstract fun getReferencedNameElementType(): IElementType defined in org.jetbrains.kotlin.psi.KtSimpleNameExpression[DeserializedSimpleFunctionDescriptor]

'getPrefixOperator' @ [43:26] ==> public fun getPrefixOperator(ktOperator: IElementType): IrStatementOrigin? defined in org.jetbrains.kotlin.psi2ir.generators in file OperatorConventions.kt[SimpleFunctionDescriptorImpl]

'ktOperator' @ [43:44] ==> val ktOperator: IElementType defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator.generatePrefixExpression[LocalVariableDescriptor]

'when (irOperator) {
            null -> throw AssertionError("Unexpected prefix operator: $ktOperator")
            in INCREMENT_DECREMENT_OPERATORS -> AssignmentGenerator(statementGenerator).generatePrefixIncrementDecrement(expression, irOperator)
            in OPERATORS_DESUGARED_TO_CALLS -> generatePrefixOperatorAsCall(expression, irOperator)
            else -> createDummyExpression(expression, ktOperator.toString())
        }' @ [45:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: IrExpression, entry1: IrExpression, entry2: IrExpression, entry3: IrExpression): IrExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> IrExpression

'irOperator' @ [45:22] ==> val irOperator: IrStatementOrigin? defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator.generatePrefixExpression[LocalVariableDescriptor]

'AssertionError' @ [46:27] ==> public constructor AssertionError(p0: (Any..Any?)) defined in java.lang.AssertionError[JavaClassConstructorDescriptor]

'ktOperator' @ [46:72] ==> val ktOperator: IElementType defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator.generatePrefixExpression[LocalVariableDescriptor]

'in' @ [47:13] ==> public operator fun <@OnlyInputTypes T> Iterable<IrStatementOrigin>.contains(element: IrStatementOrigin): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> IrStatementOrigin

'INCREMENT_DECREMENT_OPERATORS' @ [47:16] ==> public val INCREMENT_DECREMENT_OPERATORS: Set<IrStatementOriginImpl> defined in org.jetbrains.kotlin.psi2ir.generators in file OperatorConventions.kt[PropertyDescriptorImpl]

'AssignmentGenerator' @ [47:49] ==> public constructor AssignmentGenerator(statementGenerator: StatementGenerator) defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator[ClassConstructorDescriptorImpl]

'statementGenerator' @ [47:69] ==> public final val statementGenerator: StatementGenerator defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator[PropertyDescriptorImpl]

'generatePrefixIncrementDecrement' @ [47:89] ==> public final fun generatePrefixIncrementDecrement(expression: KtPrefixExpression, origin: IrStatementOrigin): IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator[SimpleFunctionDescriptorImpl]

'expression' @ [47:122] ==> value-parameter expression: KtPrefixExpression defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator.generatePrefixExpression[ValueParameterDescriptorImpl]

'irOperator' @ [47:134] ==> val irOperator: IrStatementOrigin? defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator.generatePrefixExpression[LocalVariableDescriptor]

'in' @ [48:13] ==> public operator fun <@OnlyInputTypes T> Iterable<IrStatementOrigin>.contains(element: IrStatementOrigin): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> IrStatementOrigin

'OPERATORS_DESUGARED_TO_CALLS' @ [48:16] ==> public val OPERATORS_DESUGARED_TO_CALLS: Set<IrStatementOriginImpl> defined in org.jetbrains.kotlin.psi2ir.generators in file OperatorConventions.kt[PropertyDescriptorImpl]

'generatePrefixOperatorAsCall' @ [48:48] ==> private final fun generatePrefixOperatorAsCall(expression: KtPrefixExpression, origin: IrStatementOrigin): IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator[SimpleFunctionDescriptorImpl]

'expression' @ [48:77] ==> value-parameter expression: KtPrefixExpression defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator.generatePrefixExpression[ValueParameterDescriptorImpl]

'irOperator' @ [48:89] ==> val irOperator: IrStatementOrigin? defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator.generatePrefixExpression[LocalVariableDescriptor]

'createDummyExpression' @ [49:21] ==> public fun Generator.createDummyExpression(ktExpression: KtExpression, description: String): IrErrorExpressionImpl defined in org.jetbrains.kotlin.psi2ir.generators in file Generator.kt[SimpleFunctionDescriptorImpl]

'expression' @ [49:43] ==> value-parameter expression: KtPrefixExpression defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator.generatePrefixExpression[ValueParameterDescriptorImpl]

'ktOperator' @ [49:55] ==> val ktOperator: IElementType defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator.generatePrefixExpression[LocalVariableDescriptor]

'toString' @ [49:66] ==> public open fun toString(): String defined in com.intellij.psi.tree.IElementType[JavaMethodDescriptor]

'expression' @ [54:26] ==> value-parameter expression: KtPostfixExpression defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator.generatePostfixExpression[ValueParameterDescriptorImpl]

'operationReference' @ [54:37] ==> public final val KtPostfixExpression.operationReference: KtSimpleNameExpression[MyPropertyDescriptor]

'getReferencedNameElementType' @ [54:56] ==> public abstract fun getReferencedNameElementType(): IElementType defined in org.jetbrains.kotlin.psi.KtSimpleNameExpression[DeserializedSimpleFunctionDescriptor]

'getPostfixOperator' @ [55:26] ==> public fun getPostfixOperator(ktOperator: IElementType): IrStatementOrigin? defined in org.jetbrains.kotlin.psi2ir.generators in file OperatorConventions.kt[SimpleFunctionDescriptorImpl]

'ktOperator' @ [55:45] ==> val ktOperator: IElementType defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator.generatePostfixExpression[LocalVariableDescriptor]

'when (irOperator) {
            null -> throw AssertionError("Unexpected postfix operator: $ktOperator")
            in INCREMENT_DECREMENT_OPERATORS -> AssignmentGenerator(statementGenerator).generatePostfixIncrementDecrement(expression, irOperator)
            IrStatementOrigin.EXCLEXCL -> generateExclExclOperator(expression, irOperator)
            else -> createDummyExpression(expression, ktOperator.toString())
        }' @ [57:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: IrExpression, entry1: IrExpression, entry2: IrExpression, entry3: IrExpression): IrExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> IrExpression

'irOperator' @ [57:22] ==> val irOperator: IrStatementOrigin? defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator.generatePostfixExpression[LocalVariableDescriptor]

'AssertionError' @ [58:27] ==> public constructor AssertionError(p0: (Any..Any?)) defined in java.lang.AssertionError[JavaClassConstructorDescriptor]

'ktOperator' @ [58:73] ==> val ktOperator: IElementType defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator.generatePostfixExpression[LocalVariableDescriptor]

'in' @ [59:13] ==> public operator fun <@OnlyInputTypes T> Iterable<IrStatementOrigin>.contains(element: IrStatementOrigin): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> IrStatementOrigin

'INCREMENT_DECREMENT_OPERATORS' @ [59:16] ==> public val INCREMENT_DECREMENT_OPERATORS: Set<IrStatementOriginImpl> defined in org.jetbrains.kotlin.psi2ir.generators in file OperatorConventions.kt[PropertyDescriptorImpl]

'AssignmentGenerator' @ [59:49] ==> public constructor AssignmentGenerator(statementGenerator: StatementGenerator) defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator[ClassConstructorDescriptorImpl]

'statementGenerator' @ [59:69] ==> public final val statementGenerator: StatementGenerator defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator[PropertyDescriptorImpl]

'generatePostfixIncrementDecrement' @ [59:89] ==> public final fun generatePostfixIncrementDecrement(expression: KtPostfixExpression, origin: IrStatementOrigin): IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator[SimpleFunctionDescriptorImpl]

'expression' @ [59:123] ==> value-parameter expression: KtPostfixExpression defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator.generatePostfixExpression[ValueParameterDescriptorImpl]

'irOperator' @ [59:135] ==> val irOperator: IrStatementOrigin? defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator.generatePostfixExpression[LocalVariableDescriptor]

'EXCLEXCL' @ [60:31] ==> public object EXCLEXCL : IrStatementOriginImpl defined in org.jetbrains.kotlin.ir.expressions.IrStatementOrigin[FakeCallableDescriptorForObject]

'generateExclExclOperator' @ [60:43] ==> private final fun generateExclExclOperator(expression: KtPostfixExpression, origin: IrStatementOrigin): IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator[SimpleFunctionDescriptorImpl]

'expression' @ [60:68] ==> value-parameter expression: KtPostfixExpression defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator.generatePostfixExpression[ValueParameterDescriptorImpl]

'irOperator' @ [60:80] ==> val irOperator: IrStatementOrigin? defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator.generatePostfixExpression[LocalVariableDescriptor]

'createDummyExpression' @ [61:21] ==> public fun Generator.createDummyExpression(ktExpression: KtExpression, description: String): IrErrorExpressionImpl defined in org.jetbrains.kotlin.psi2ir.generators in file Generator.kt[SimpleFunctionDescriptorImpl]

'expression' @ [61:43] ==> value-parameter expression: KtPostfixExpression defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator.generatePostfixExpression[ValueParameterDescriptorImpl]

'ktOperator' @ [61:55] ==> val ktOperator: IElementType defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator.generatePostfixExpression[LocalVariableDescriptor]

'toString' @ [61:66] ==> public open fun toString(): String defined in com.intellij.psi.tree.IElementType[JavaMethodDescriptor]

'expression' @ [66:26] ==> value-parameter expression: KtBinaryExpressionWithTypeRHS defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator.generateCastExpression[ValueParameterDescriptorImpl]

'operationReference' @ [66:37] ==> public final val KtBinaryExpressionWithTypeRHS.operationReference: KtSimpleNameExpression[MyPropertyDescriptor]

'getReferencedNameElementType' @ [66:56] ==> public abstract fun getReferencedNameElementType(): IElementType defined in org.jetbrains.kotlin.psi.KtSimpleNameExpression[DeserializedSimpleFunctionDescriptor]

'getIrTypeOperator' @ [67:26] ==> public fun getIrTypeOperator(ktOperator: IElementType): IrTypeOperator? defined in org.jetbrains.kotlin.psi2ir.generators in file OperatorConventions.kt[SimpleFunctionDescriptorImpl]

'ktOperator' @ [67:44] ==> val ktOperator: IElementType defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator.generateCastExpression[LocalVariableDescriptor]

'getOrFail' @ [68:23] ==> public fun <K, V : Any> Generator.getOrFail(slice: ReadOnlySlice<(KtTypeReference..KtTypeReference?), (KotlinType..KotlinType?)>, key: (KtTypeReference..KtTypeReference?)): (KotlinType..KotlinType?) defined in org.jetbrains.kotlin.psi2ir.generators[SimpleFunctionDescriptorImpl]
Inferred types:
    <K> -> (org.jetbrains.kotlin.psi.KtTypeReference..org.jetbrains.kotlin.psi.KtTypeReference?)
    <V : Any> -> (org.jetbrains.kotlin.types.KotlinType..org.jetbrains.kotlin.types.KotlinType?)

'TYPE' @ [68:48] ==> public final val TYPE: (WritableSlice<(KtTypeReference..KtTypeReference?), (KotlinType..KotlinType?)>..WritableSlice<(KtTypeReference..KtTypeReference?), (KotlinType..KotlinType?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'expression' @ [68:54] ==> value-parameter expression: KtBinaryExpressionWithTypeRHS defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator.generateCastExpression[ValueParameterDescriptorImpl]

'right' @ [68:65] ==> public final val KtBinaryExpressionWithTypeRHS.right: KtTypeReference?[MyPropertyDescriptor]

'when (irOperator) {
            IrTypeOperator.CAST ->
                rhsType
            IrTypeOperator.SAFE_CAST ->
                rhsType.makeNullable()
            else ->
                throw AssertionError("Unexpected IrTypeOperator: $irOperator")
        }' @ [70:26] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: (KotlinType..KotlinType?), entry1: (KotlinType..KotlinType?), entry2: (KotlinType..KotlinType?)): (KotlinType..KotlinType?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> (org.jetbrains.kotlin.types.KotlinType..org.jetbrains.kotlin.types.KotlinType?)

'irOperator' @ [70:32] ==> val irOperator: IrTypeOperator? defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator.generateCastExpression[LocalVariableDescriptor]

'CAST' @ [71:28] ==> enum entry CAST defined in org.jetbrains.kotlin.ir.expressions.IrTypeOperator[FakeCallableDescriptorForObject]

'rhsType' @ [72:17] ==> val rhsType: (KotlinType..KotlinType?) defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator.generateCastExpression[LocalVariableDescriptor]

'SAFE_CAST' @ [73:28] ==> enum entry SAFE_CAST defined in org.jetbrains.kotlin.ir.expressions.IrTypeOperator[FakeCallableDescriptorForObject]

'rhsType' @ [74:17] ==> val rhsType: (KotlinType..KotlinType?) defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator.generateCastExpression[LocalVariableDescriptor]

'makeNullable' @ [74:25] ==> public fun KotlinType.makeNullable(): KotlinType defined in org.jetbrains.kotlin.types.typeUtil[DeserializedSimpleFunctionDescriptor]

'AssertionError' @ [76:23] ==> public constructor AssertionError(p0: (Any..Any?)) defined in java.lang.AssertionError[JavaClassConstructorDescriptor]

'irOperator' @ [76:67] ==> val irOperator: IrTypeOperator? defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator.generateCastExpression[LocalVariableDescriptor]

'IrTypeOperatorCallImpl' @ [79:16] ==> public constructor IrTypeOperatorCallImpl(startOffset: Int, endOffset: Int, type: KotlinType, operator: IrTypeOperator, typeOperand: KotlinType, argument: IrExpression) defined in org.jetbrains.kotlin.ir.expressions.impl.IrTypeOperatorCallImpl[DeserializedClassConstructorDescriptor]

'expression' @ [79:39] ==> value-parameter expression: KtBinaryExpressionWithTypeRHS defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator.generateCastExpression[ValueParameterDescriptorImpl]

'startOffset' @ [79:50] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'expression' @ [79:63] ==> value-parameter expression: KtBinaryExpressionWithTypeRHS defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator.generateCastExpression[ValueParameterDescriptorImpl]

'endOffset' @ [79:74] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'resultType' @ [79:85] ==> val resultType: (KotlinType..KotlinType?) defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator.generateCastExpression[LocalVariableDescriptor]

'irOperator' @ [79:97] ==> val irOperator: IrTypeOperator? defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator.generateCastExpression[LocalVariableDescriptor]

'rhsType' @ [79:109] ==> val rhsType: (KotlinType..KotlinType?) defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator.generateCastExpression[LocalVariableDescriptor]

'statementGenerator' @ [80:75] ==> public final val statementGenerator: StatementGenerator defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator[PropertyDescriptorImpl]

'generateExpression' @ [80:94] ==> public final fun generateExpression(ktExpression: KtExpression): IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator[SimpleFunctionDescriptorImpl]

'expression' @ [80:113] ==> value-parameter expression: KtBinaryExpressionWithTypeRHS defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator.generateCastExpression[ValueParameterDescriptorImpl]

'left' @ [80:124] ==> public final val KtBinaryExpressionWithTypeRHS.left: KtExpression[MyPropertyDescriptor]

'expression' @ [84:26] ==> value-parameter expression: KtIsExpression defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator.generateInstanceOfExpression[ValueParameterDescriptorImpl]

'operationReference' @ [84:37] ==> public final val KtIsExpression.operationReference: KtSimpleNameExpression[MyPropertyDescriptor]

'getReferencedNameElementType' @ [84:56] ==> public abstract fun getReferencedNameElementType(): IElementType defined in org.jetbrains.kotlin.psi.KtSimpleNameExpression[DeserializedSimpleFunctionDescriptor]

'getIrTypeOperator' @ [85:26] ==> public fun getIrTypeOperator(ktOperator: IElementType): IrTypeOperator? defined in org.jetbrains.kotlin.psi2ir.generators in file OperatorConventions.kt[SimpleFunctionDescriptorImpl]

'ktOperator' @ [85:44] ==> val ktOperator: IElementType defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator.generateInstanceOfExpression[LocalVariableDescriptor]

'getOrFail' @ [86:27] ==> public fun <K, V : Any> Generator.getOrFail(slice: ReadOnlySlice<(KtTypeReference..KtTypeReference?), (KotlinType..KotlinType?)>, key: (KtTypeReference..KtTypeReference?)): (KotlinType..KotlinType?) defined in org.jetbrains.kotlin.psi2ir.generators[SimpleFunctionDescriptorImpl]
Inferred types:
    <K> -> (org.jetbrains.kotlin.psi.KtTypeReference..org.jetbrains.kotlin.psi.KtTypeReference?)
    <V : Any> -> (org.jetbrains.kotlin.types.KotlinType..org.jetbrains.kotlin.types.KotlinType?)

'TYPE' @ [86:52] ==> public final val TYPE: (WritableSlice<(KtTypeReference..KtTypeReference?), (KotlinType..KotlinType?)>..WritableSlice<(KtTypeReference..KtTypeReference?), (KotlinType..KotlinType?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'expression' @ [86:58] ==> value-parameter expression: KtIsExpression defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator.generateInstanceOfExpression[ValueParameterDescriptorImpl]

'typeReference' @ [86:69] ==> public final val KtIsExpression.typeReference: KtTypeReference?[MyPropertyDescriptor]

'IrTypeOperatorCallImpl' @ [88:16] ==> public constructor IrTypeOperatorCallImpl(startOffset: Int, endOffset: Int, type: KotlinType, operator: IrTypeOperator, typeOperand: KotlinType, argument: IrExpression) defined in org.jetbrains.kotlin.ir.expressions.impl.IrTypeOperatorCallImpl[DeserializedClassConstructorDescriptor]

'expression' @ [88:39] ==> value-parameter expression: KtIsExpression defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator.generateInstanceOfExpression[ValueParameterDescriptorImpl]

'startOffset' @ [88:50] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'expression' @ [88:63] ==> value-parameter expression: KtIsExpression defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator.generateInstanceOfExpression[ValueParameterDescriptorImpl]

'endOffset' @ [88:74] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'context' @ [88:85] ==> public open val context: GeneratorContext defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator[PropertyDescriptorImpl]

'builtIns' @ [88:93] ==> public final val builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.psi2ir.generators.GeneratorContext[DeserializedPropertyDescriptor]

'booleanType' @ [88:102] ==> public final val KotlinBuiltIns.booleanType: SimpleType[MyPropertyDescriptor]

'irOperator' @ [88:115] ==> val irOperator: IrTypeOperator defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator.generateInstanceOfExpression[LocalVariableDescriptor]

'againstType' @ [89:75] ==> val againstType: (KotlinType..KotlinType?) defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator.generateInstanceOfExpression[LocalVariableDescriptor]

'statementGenerator' @ [89:88] ==> public final val statementGenerator: StatementGenerator defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator[PropertyDescriptorImpl]

'generateExpression' @ [89:107] ==> public final fun generateExpression(ktExpression: KtExpression): IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator[SimpleFunctionDescriptorImpl]

'expression' @ [89:126] ==> value-parameter expression: KtIsExpression defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator.generateInstanceOfExpression[ValueParameterDescriptorImpl]

'leftHandSide' @ [89:137] ==> public final val KtIsExpression.leftHandSide: KtExpression[MyPropertyDescriptor]

'expression' @ [93:26] ==> value-parameter expression: KtBinaryExpression defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator.generateBinaryExpression[ValueParameterDescriptorImpl]

'operationReference' @ [93:37] ==> public final val KtBinaryExpression.operationReference: KtOperationReferenceExpression[MyPropertyDescriptor]

'getReferencedNameElementType' @ [93:56] ==> public open fun getReferencedNameElementType(): IElementType defined in org.jetbrains.kotlin.psi.KtOperationReferenceExpression[DeserializedSimpleFunctionDescriptor]

'ktOperator' @ [94:13] ==> val ktOperator: IElementType defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator.generateBinaryExpression[LocalVariableDescriptor]

'IDENTIFIER' @ [94:36] ==> public final val IDENTIFIER: (KtToken..KtToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'generateBinaryOperatorAsCall' @ [95:20] ==> private final fun generateBinaryOperatorAsCall(expression: KtBinaryExpression, origin: IrStatementOrigin?): IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator[SimpleFunctionDescriptorImpl]

'expression' @ [95:49] ==> value-parameter expression: KtBinaryExpression defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator.generateBinaryExpression[ValueParameterDescriptorImpl]

'getInfixOperator' @ [98:26] ==> public fun getInfixOperator(ktOperator: IElementType): IrStatementOrigin? defined in org.jetbrains.kotlin.psi2ir.generators in file OperatorConventions.kt[SimpleFunctionDescriptorImpl]

'ktOperator' @ [98:43] ==> val ktOperator: IElementType defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator.generateBinaryExpression[LocalVariableDescriptor]

'when (irOperator) {
            null -> throw AssertionError("Unexpected infix operator: $ktOperator")
            IrStatementOrigin.EQ -> AssignmentGenerator(statementGenerator).generateAssignment(expression)
            in AUGMENTED_ASSIGNMENTS -> AssignmentGenerator(statementGenerator).generateAugmentedAssignment(expression, irOperator)
            IrStatementOrigin.ELVIS -> generateElvis(expression)
            in OPERATORS_DESUGARED_TO_CALLS -> generateBinaryOperatorAsCall(expression, irOperator)
            in COMPARISON_OPERATORS -> generateComparisonOperator(expression, irOperator)
            in EQUALITY_OPERATORS -> generateEqualityOperator(expression, irOperator)
            in IDENTITY_OPERATORS -> generateIdentityOperator(expression, irOperator)
            in IN_OPERATORS -> generateInOperator(expression, irOperator)
            in BINARY_BOOLEAN_OPERATORS -> generateBinaryBooleanOperator(expression, irOperator)
            else -> createDummyExpression(expression, ktOperator.toString())
        }' @ [100:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: IrExpression, entry1: IrExpression, entry2: IrExpression, entry3: IrExpression, entry4: IrExpression, entry5: IrExpression, entry6: IrExpression, entry7: IrExpression, entry8: IrExpression, entry9: IrExpression, entry10: IrExpression): IrExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> IrExpression

'irOperator' @ [100:22] ==> val irOperator: IrStatementOrigin? defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator.generateBinaryExpression[LocalVariableDescriptor]

'AssertionError' @ [101:27] ==> public constructor AssertionError(p0: (Any..Any?)) defined in java.lang.AssertionError[JavaClassConstructorDescriptor]

'ktOperator' @ [101:71] ==> val ktOperator: IElementType defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator.generateBinaryExpression[LocalVariableDescriptor]

'EQ' @ [102:31] ==> public object EQ : IrStatementOriginImpl defined in org.jetbrains.kotlin.ir.expressions.IrStatementOrigin[FakeCallableDescriptorForObject]

'AssignmentGenerator' @ [102:37] ==> public constructor AssignmentGenerator(statementGenerator: StatementGenerator) defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator[ClassConstructorDescriptorImpl]

'statementGenerator' @ [102:57] ==> public final val statementGenerator: StatementGenerator defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator[PropertyDescriptorImpl]

'generateAssignment' @ [102:77] ==> public final fun generateAssignment(expression: KtBinaryExpression): IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator[SimpleFunctionDescriptorImpl]

'expression' @ [102:96] ==> value-parameter expression: KtBinaryExpression defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator.generateBinaryExpression[ValueParameterDescriptorImpl]

'in' @ [103:13] ==> public operator fun <@OnlyInputTypes T> Iterable<IrStatementOrigin>.contains(element: IrStatementOrigin): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> IrStatementOrigin

'AUGMENTED_ASSIGNMENTS' @ [103:16] ==> public val AUGMENTED_ASSIGNMENTS: Set<IrStatementOriginImpl> defined in org.jetbrains.kotlin.psi2ir.generators in file OperatorConventions.kt[PropertyDescriptorImpl]

'AssignmentGenerator' @ [103:41] ==> public constructor AssignmentGenerator(statementGenerator: StatementGenerator) defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator[ClassConstructorDescriptorImpl]

'statementGenerator' @ [103:61] ==> public final val statementGenerator: StatementGenerator defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator[PropertyDescriptorImpl]

'generateAugmentedAssignment' @ [103:81] ==> public final fun generateAugmentedAssignment(expression: KtBinaryExpression, origin: IrStatementOrigin): IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator[SimpleFunctionDescriptorImpl]

'expression' @ [103:109] ==> value-parameter expression: KtBinaryExpression defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator.generateBinaryExpression[ValueParameterDescriptorImpl]

'irOperator' @ [103:121] ==> val irOperator: IrStatementOrigin? defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator.generateBinaryExpression[LocalVariableDescriptor]

'ELVIS' @ [104:31] ==> public object ELVIS : IrStatementOriginImpl defined in org.jetbrains.kotlin.ir.expressions.IrStatementOrigin[FakeCallableDescriptorForObject]

'generateElvis' @ [104:40] ==> private final fun generateElvis(expression: KtBinaryExpression): IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator[SimpleFunctionDescriptorImpl]

'expression' @ [104:54] ==> value-parameter expression: KtBinaryExpression defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator.generateBinaryExpression[ValueParameterDescriptorImpl]

'in' @ [105:13] ==> public operator fun <@OnlyInputTypes T> Iterable<IrStatementOrigin>.contains(element: IrStatementOrigin): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> IrStatementOrigin

'OPERATORS_DESUGARED_TO_CALLS' @ [105:16] ==> public val OPERATORS_DESUGARED_TO_CALLS: Set<IrStatementOriginImpl> defined in org.jetbrains.kotlin.psi2ir.generators in file OperatorConventions.kt[PropertyDescriptorImpl]

'generateBinaryOperatorAsCall' @ [105:48] ==> private final fun generateBinaryOperatorAsCall(expression: KtBinaryExpression, origin: IrStatementOrigin?): IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator[SimpleFunctionDescriptorImpl]

'expression' @ [105:77] ==> value-parameter expression: KtBinaryExpression defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator.generateBinaryExpression[ValueParameterDescriptorImpl]

'irOperator' @ [105:89] ==> val irOperator: IrStatementOrigin? defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator.generateBinaryExpression[LocalVariableDescriptor]

'in' @ [106:13] ==> public operator fun <@OnlyInputTypes T> Iterable<IrStatementOrigin>.contains(element: IrStatementOrigin): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> IrStatementOrigin

'COMPARISON_OPERATORS' @ [106:16] ==> public val COMPARISON_OPERATORS: Set<IrStatementOriginImpl> defined in org.jetbrains.kotlin.psi2ir.generators in file OperatorConventions.kt[PropertyDescriptorImpl]

'generateComparisonOperator' @ [106:40] ==> private final fun generateComparisonOperator(expression: KtBinaryExpression, origin: IrStatementOrigin): IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator[SimpleFunctionDescriptorImpl]

'expression' @ [106:67] ==> value-parameter expression: KtBinaryExpression defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator.generateBinaryExpression[ValueParameterDescriptorImpl]

'irOperator' @ [106:79] ==> val irOperator: IrStatementOrigin? defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator.generateBinaryExpression[LocalVariableDescriptor]

'in' @ [107:13] ==> public operator fun <@OnlyInputTypes T> Iterable<IrStatementOrigin>.contains(element: IrStatementOrigin): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> IrStatementOrigin

'EQUALITY_OPERATORS' @ [107:16] ==> public val EQUALITY_OPERATORS: Set<IrStatementOriginImpl> defined in org.jetbrains.kotlin.psi2ir.generators in file OperatorConventions.kt[PropertyDescriptorImpl]

'generateEqualityOperator' @ [107:38] ==> private final fun generateEqualityOperator(expression: KtBinaryExpression, irOperator: IrStatementOrigin): IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator[SimpleFunctionDescriptorImpl]

'expression' @ [107:63] ==> value-parameter expression: KtBinaryExpression defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator.generateBinaryExpression[ValueParameterDescriptorImpl]

'irOperator' @ [107:75] ==> val irOperator: IrStatementOrigin? defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator.generateBinaryExpression[LocalVariableDescriptor]

'in' @ [108:13] ==> public operator fun <@OnlyInputTypes T> Iterable<IrStatementOrigin>.contains(element: IrStatementOrigin): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> IrStatementOrigin

'IDENTITY_OPERATORS' @ [108:16] ==> public val IDENTITY_OPERATORS: Set<IrStatementOriginImpl> defined in org.jetbrains.kotlin.psi2ir.generators in file OperatorConventions.kt[PropertyDescriptorImpl]

'generateIdentityOperator' @ [108:38] ==> private final fun generateIdentityOperator(expression: KtBinaryExpression, irOperator: IrStatementOrigin): IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator[SimpleFunctionDescriptorImpl]

'expression' @ [108:63] ==> value-parameter expression: KtBinaryExpression defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator.generateBinaryExpression[ValueParameterDescriptorImpl]

'irOperator' @ [108:75] ==> val irOperator: IrStatementOrigin? defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator.generateBinaryExpression[LocalVariableDescriptor]

'in' @ [109:13] ==> public operator fun <@OnlyInputTypes T> Iterable<IrStatementOrigin>.contains(element: IrStatementOrigin): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> IrStatementOrigin

'IN_OPERATORS' @ [109:16] ==> public val IN_OPERATORS: Set<IrStatementOriginImpl> defined in org.jetbrains.kotlin.psi2ir.generators in file OperatorConventions.kt[PropertyDescriptorImpl]

'generateInOperator' @ [109:32] ==> private final fun generateInOperator(expression: KtBinaryExpression, irOperator: IrStatementOrigin): IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator[SimpleFunctionDescriptorImpl]

'expression' @ [109:51] ==> value-parameter expression: KtBinaryExpression defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator.generateBinaryExpression[ValueParameterDescriptorImpl]

'irOperator' @ [109:63] ==> val irOperator: IrStatementOrigin? defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator.generateBinaryExpression[LocalVariableDescriptor]

'in' @ [110:13] ==> public operator fun <@OnlyInputTypes T> Iterable<IrStatementOrigin>.contains(element: IrStatementOrigin): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> IrStatementOrigin

'BINARY_BOOLEAN_OPERATORS' @ [110:16] ==> public val BINARY_BOOLEAN_OPERATORS: Set<IrStatementOriginImpl> defined in org.jetbrains.kotlin.psi2ir.generators in file OperatorConventions.kt[PropertyDescriptorImpl]

'generateBinaryBooleanOperator' @ [110:44] ==> private final fun generateBinaryBooleanOperator(expression: KtBinaryExpression, irOperator: IrStatementOrigin): IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator[SimpleFunctionDescriptorImpl]

'expression' @ [110:74] ==> value-parameter expression: KtBinaryExpression defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator.generateBinaryExpression[ValueParameterDescriptorImpl]

'irOperator' @ [110:86] ==> val irOperator: IrStatementOrigin? defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator.generateBinaryExpression[LocalVariableDescriptor]

'createDummyExpression' @ [111:21] ==> public fun Generator.createDummyExpression(ktExpression: KtExpression, description: String): IrErrorExpressionImpl defined in org.jetbrains.kotlin.psi2ir.generators in file Generator.kt[SimpleFunctionDescriptorImpl]

'expression' @ [111:43] ==> value-parameter expression: KtBinaryExpression defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator.generateBinaryExpression[ValueParameterDescriptorImpl]

'ktOperator' @ [111:55] ==> val ktOperator: IElementType defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator.generateBinaryExpression[LocalVariableDescriptor]

'toString' @ [111:66] ==> public open fun toString(): String defined in com.intellij.psi.tree.IElementType[JavaMethodDescriptor]

'getResolvedCall' @ [116:35] ==> public fun Generator.getResolvedCall(key: KtElement): ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.psi2ir.generators in file Generator.kt[SimpleFunctionDescriptorImpl]

'expression' @ [116:51] ==> value-parameter expression: KtBinaryExpression defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator.generateElvis[ValueParameterDescriptorImpl]

'specialCallForElvis' @ [117:26] ==> val specialCallForElvis: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator.generateElvis[LocalVariableDescriptor]

'resultingDescriptor' @ [117:46] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.resultingDescriptor: CallableDescriptor[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> Captured(out CallableDescriptor)

'returnType' @ [117:66] ==> public final val CallableDescriptor.returnType: KotlinType?[MyPropertyDescriptor]

'statementGenerator' @ [118:27] ==> public final val statementGenerator: StatementGenerator defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator[PropertyDescriptorImpl]

'generateExpression' @ [118:46] ==> public final fun generateExpression(ktExpression: KtExpression): IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator[SimpleFunctionDescriptorImpl]

'expression' @ [118:65] ==> value-parameter expression: KtBinaryExpression defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator.generateElvis[ValueParameterDescriptorImpl]

'left' @ [118:76] ==> public final val KtBinaryExpression.left: KtExpression?[MyPropertyDescriptor]

'statementGenerator' @ [119:27] ==> public final val statementGenerator: StatementGenerator defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator[PropertyDescriptorImpl]

'generateExpression' @ [119:46] ==> public final fun generateExpression(ktExpression: KtExpression): IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator[SimpleFunctionDescriptorImpl]

'expression' @ [119:65] ==> value-parameter expression: KtBinaryExpression defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator.generateElvis[ValueParameterDescriptorImpl]

'right' @ [119:76] ==> public final val KtBinaryExpression.right: KtExpression?[MyPropertyDescriptor]

'irBlock' @ [121:16] ==> public inline fun GeneratorWithScope.irBlock(ktElement: KtElement?, origin: IrStatementOrigin? = ..., resultType: KotlinType? = ..., body: IrBlockBuilder.() -> Unit): IrExpression defined in org.jetbrains.kotlin.psi2ir.generators in file Generator.kt[SimpleFunctionDescriptorImpl]

'expression' @ [121:24] ==> value-parameter expression: KtBinaryExpression defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator.generateElvis[ValueParameterDescriptorImpl]

'ELVIS' @ [121:54] ==> public object ELVIS : IrStatementOriginImpl defined in org.jetbrains.kotlin.ir.expressions.IrStatementOrigin[FakeCallableDescriptorForObject]

'resultType' @ [121:61] ==> val resultType: KotlinType defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator.generateElvis[LocalVariableDescriptor]

'irTemporary' @ [122:29] ==> public fun <T : IrElement> IrStatementsBuilder<IrBlock>.irTemporary(value: IrExpression, nameHint: String? = ...): IrVariable defined in org.jetbrains.kotlin.ir.builders[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : IrElement> -> IrBlock

'irArgument0' @ [122:41] ==> val irArgument0: IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator.generateElvis[LocalVariableDescriptor]

'+' @ [123:13] ==> public final fun IrStatement.unaryPlus(): Unit defined in org.jetbrains.kotlin.ir.builders.IrBlockBuilder[DeserializedSimpleFunctionDescriptor]

'irIfNull' @ [123:14] ==> public fun IrBuilderWithScope.irIfNull(type: KotlinType, subject: IrExpression, thenPart: IrExpression, elsePart: IrExpression): IrIfThenElseImpl defined in org.jetbrains.kotlin.ir.builders[DeserializedSimpleFunctionDescriptor]

'resultType' @ [123:23] ==> val resultType: KotlinType defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator.generateElvis[LocalVariableDescriptor]

'irGet' @ [123:35] ==> public fun IrBuilderWithScope.irGet(variable: IrValueSymbol): IrGetValueImpl defined in org.jetbrains.kotlin.ir.builders[DeserializedSimpleFunctionDescriptor]

'temporary' @ [123:41] ==> val temporary: IrVariable defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator.generateElvis.<anonymous>[LocalVariableDescriptor]

'symbol' @ [123:51] ==> public abstract val symbol: IrVariableSymbol defined in org.jetbrains.kotlin.ir.declarations.IrVariable[DeserializedPropertyDescriptor]

'irArgument1' @ [123:60] ==> val irArgument1: IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator.generateElvis[LocalVariableDescriptor]

'irGet' @ [123:73] ==> public fun IrBuilderWithScope.irGet(variable: IrValueSymbol): IrGetValueImpl defined in org.jetbrains.kotlin.ir.builders[DeserializedSimpleFunctionDescriptor]

'temporary' @ [123:79] ==> val temporary: IrVariable defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator.generateElvis.<anonymous>[LocalVariableDescriptor]

'symbol' @ [123:89] ==> public abstract val symbol: IrVariableSymbol defined in org.jetbrains.kotlin.ir.declarations.IrVariable[DeserializedPropertyDescriptor]

'statementGenerator' @ [128:27] ==> public final val statementGenerator: StatementGenerator defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator[PropertyDescriptorImpl]

'generateExpression' @ [128:46] ==> public final fun generateExpression(ktExpression: KtExpression): IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator[SimpleFunctionDescriptorImpl]

'expression' @ [128:65] ==> value-parameter expression: KtBinaryExpression defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator.generateBinaryBooleanOperator[ValueParameterDescriptorImpl]

'left' @ [128:76] ==> public final val KtBinaryExpression.left: KtExpression?[MyPropertyDescriptor]

'statementGenerator' @ [129:27] ==> public final val statementGenerator: StatementGenerator defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator[PropertyDescriptorImpl]

'generateExpression' @ [129:46] ==> public final fun generateExpression(ktExpression: KtExpression): IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator[SimpleFunctionDescriptorImpl]

'expression' @ [129:65] ==> value-parameter expression: KtBinaryExpression defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator.generateBinaryBooleanOperator[ValueParameterDescriptorImpl]

'right' @ [129:76] ==> public final val KtBinaryExpression.right: KtExpression?[MyPropertyDescriptor]

'when (irOperator) {
            IrStatementOrigin.OROR ->
                context.oror(expression.startOffset, expression.endOffset, irArgument0, irArgument1)
            IrStatementOrigin.ANDAND ->
                context.andand(expression.startOffset, expression.endOffset, irArgument0, irArgument1)
            else ->
                throw AssertionError("Unexpected binary boolean operator $irOperator")
        }' @ [130:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: IrExpression, entry1: IrExpression, entry2: IrExpression): IrExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> IrExpression

'irOperator' @ [130:22] ==> value-parameter irOperator: IrStatementOrigin defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator.generateBinaryBooleanOperator[ValueParameterDescriptorImpl]

'OROR' @ [131:31] ==> public object OROR : IrStatementOriginImpl defined in org.jetbrains.kotlin.ir.expressions.IrStatementOrigin[FakeCallableDescriptorForObject]

'context' @ [132:17] ==> public open val context: GeneratorContext defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator[PropertyDescriptorImpl]

'oror' @ [132:25] ==> public fun IrGeneratorContext.oror(startOffset: Int, endOffset: Int, a: IrExpression, b: IrExpression, origin: IrStatementOrigin = ...): IrWhen defined in org.jetbrains.kotlin.ir.builders[DeserializedSimpleFunctionDescriptor]

'expression' @ [132:30] ==> value-parameter expression: KtBinaryExpression defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator.generateBinaryBooleanOperator[ValueParameterDescriptorImpl]

'startOffset' @ [132:41] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'expression' @ [132:54] ==> value-parameter expression: KtBinaryExpression defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator.generateBinaryBooleanOperator[ValueParameterDescriptorImpl]

'endOffset' @ [132:65] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'irArgument0' @ [132:76] ==> val irArgument0: IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator.generateBinaryBooleanOperator[LocalVariableDescriptor]

'irArgument1' @ [132:89] ==> val irArgument1: IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator.generateBinaryBooleanOperator[LocalVariableDescriptor]

'ANDAND' @ [133:31] ==> public object ANDAND : IrStatementOriginImpl defined in org.jetbrains.kotlin.ir.expressions.IrStatementOrigin[FakeCallableDescriptorForObject]

'context' @ [134:17] ==> public open val context: GeneratorContext defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator[PropertyDescriptorImpl]

'andand' @ [134:25] ==> public fun IrGeneratorContext.andand(startOffset: Int, endOffset: Int, a: IrExpression, b: IrExpression, origin: IrStatementOrigin = ...): IrWhen defined in org.jetbrains.kotlin.ir.builders[DeserializedSimpleFunctionDescriptor]

'expression' @ [134:32] ==> value-parameter expression: KtBinaryExpression defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator.generateBinaryBooleanOperator[ValueParameterDescriptorImpl]

'startOffset' @ [134:43] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'expression' @ [134:56] ==> value-parameter expression: KtBinaryExpression defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator.generateBinaryBooleanOperator[ValueParameterDescriptorImpl]

'endOffset' @ [134:67] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'irArgument0' @ [134:78] ==> val irArgument0: IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator.generateBinaryBooleanOperator[LocalVariableDescriptor]

'irArgument1' @ [134:91] ==> val irArgument1: IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator.generateBinaryBooleanOperator[LocalVariableDescriptor]

'AssertionError' @ [136:23] ==> public constructor AssertionError(p0: (Any..Any?)) defined in java.lang.AssertionError[JavaClassConstructorDescriptor]

'irOperator' @ [136:75] ==> value-parameter irOperator: IrStatementOrigin defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator.generateBinaryBooleanOperator[ValueParameterDescriptorImpl]

'getResolvedCall' @ [141:28] ==> public fun Generator.getResolvedCall(key: KtElement): ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.psi2ir.generators in file Generator.kt[SimpleFunctionDescriptorImpl]

'expression' @ [141:44] ==> value-parameter expression: KtBinaryExpression defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator.generateInOperator[ValueParameterDescriptorImpl]

'CallGenerator' @ [143:30] ==> public constructor CallGenerator(statementGenerator: StatementGenerator) defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator[ClassConstructorDescriptorImpl]

'statementGenerator' @ [143:44] ==> public final val statementGenerator: StatementGenerator defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator[PropertyDescriptorImpl]

'generateCall' @ [143:64] ==> public fun CallGenerator.generateCall(ktElement: KtElement, call: CallBuilder, origin: IrStatementOrigin? = ...): IrExpression defined in org.jetbrains.kotlin.psi2ir.generators in file CallGenerator.kt[SimpleFunctionDescriptorImpl]

'expression' @ [143:77] ==> value-parameter expression: KtBinaryExpression defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator.generateInOperator[ValueParameterDescriptorImpl]

'statementGenerator' @ [143:89] ==> public final val statementGenerator: StatementGenerator defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator[PropertyDescriptorImpl]

'pregenerateCall' @ [143:108] ==> public fun StatementGenerator.pregenerateCall(resolvedCall: ResolvedCall<*>): CallBuilder defined in org.jetbrains.kotlin.psi2ir.generators in file ArgumentsGenerationUtils.kt[SimpleFunctionDescriptorImpl]

'containsCall' @ [143:124] ==> val containsCall: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator.generateInOperator[LocalVariableDescriptor]

'irOperator' @ [143:139] ==> value-parameter irOperator: IrStatementOrigin defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator.generateInOperator[ValueParameterDescriptorImpl]

'when (irOperator) {
            IrStatementOrigin.IN ->
                irContainsCall
            IrStatementOrigin.NOT_IN ->
                IrUnaryPrimitiveImpl(expression.startOffset, expression.endOffset, IrStatementOrigin.NOT_IN,
                                     context.irBuiltIns.booleanNotSymbol,
                                     irContainsCall)
            else ->
                throw AssertionError("Unexpected in-operator $irOperator")
        }' @ [145:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: IrExpression, entry1: IrExpression, entry2: IrExpression): IrExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> IrExpression

'irOperator' @ [145:22] ==> value-parameter irOperator: IrStatementOrigin defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator.generateInOperator[ValueParameterDescriptorImpl]

'IN' @ [146:31] ==> public object IN : IrStatementOriginImpl defined in org.jetbrains.kotlin.ir.expressions.IrStatementOrigin[FakeCallableDescriptorForObject]

'irContainsCall' @ [147:17] ==> val irContainsCall: IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator.generateInOperator[LocalVariableDescriptor]

'NOT_IN' @ [148:31] ==> public object NOT_IN : IrStatementOriginImpl defined in org.jetbrains.kotlin.ir.expressions.IrStatementOrigin[FakeCallableDescriptorForObject]

'IrUnaryPrimitiveImpl' @ [149:17] ==> public constructor IrUnaryPrimitiveImpl(startOffset: Int, endOffset: Int, origin: IrStatementOrigin?, symbol: IrFunctionSymbol, argument: IrExpression) defined in org.jetbrains.kotlin.ir.expressions.impl.IrUnaryPrimitiveImpl[DeserializedClassConstructorDescriptor]

'expression' @ [149:38] ==> value-parameter expression: KtBinaryExpression defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator.generateInOperator[ValueParameterDescriptorImpl]

'startOffset' @ [149:49] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'expression' @ [149:62] ==> value-parameter expression: KtBinaryExpression defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator.generateInOperator[ValueParameterDescriptorImpl]

'endOffset' @ [149:73] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'NOT_IN' @ [149:102] ==> public object NOT_IN : IrStatementOriginImpl defined in org.jetbrains.kotlin.ir.expressions.IrStatementOrigin[FakeCallableDescriptorForObject]

'context' @ [150:38] ==> public open val context: GeneratorContext defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator[PropertyDescriptorImpl]

'irBuiltIns' @ [150:46] ==> public final val irBuiltIns: IrBuiltIns defined in org.jetbrains.kotlin.psi2ir.generators.GeneratorContext[DeserializedPropertyDescriptor]

'booleanNotSymbol' @ [150:57] ==> public final val booleanNotSymbol: IrSimpleFunctionSymbol defined in org.jetbrains.kotlin.ir.descriptors.IrBuiltIns[DeserializedPropertyDescriptor]

'irContainsCall' @ [151:38] ==> val irContainsCall: IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator.generateInOperator[LocalVariableDescriptor]

'AssertionError' @ [153:23] ==> public constructor AssertionError(p0: (Any..Any?)) defined in java.lang.AssertionError[JavaClassConstructorDescriptor]

'irOperator' @ [153:63] ==> value-parameter irOperator: IrStatementOrigin defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator.generateInOperator[ValueParameterDescriptorImpl]

'statementGenerator' @ [159:27] ==> public final val statementGenerator: StatementGenerator defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator[PropertyDescriptorImpl]

'generateExpression' @ [159:46] ==> public final fun generateExpression(ktExpression: KtExpression): IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator[SimpleFunctionDescriptorImpl]

'expression' @ [159:65] ==> value-parameter expression: KtBinaryExpression defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator.generateIdentityOperator[ValueParameterDescriptorImpl]

'left' @ [159:76] ==> public final val KtBinaryExpression.left: KtExpression?[MyPropertyDescriptor]

'statementGenerator' @ [160:27] ==> public final val statementGenerator: StatementGenerator defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator[PropertyDescriptorImpl]

'generateExpression' @ [160:46] ==> public final fun generateExpression(ktExpression: KtExpression): IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator[SimpleFunctionDescriptorImpl]

'expression' @ [160:65] ==> value-parameter expression: KtBinaryExpression defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator.generateIdentityOperator[ValueParameterDescriptorImpl]

'right' @ [160:76] ==> public final val KtBinaryExpression.right: KtExpression?[MyPropertyDescriptor]

'IrBinaryPrimitiveImpl' @ [163:32] ==> public constructor IrBinaryPrimitiveImpl(startOffset: Int, endOffset: Int, origin: IrStatementOrigin?, symbol: IrFunctionSymbol, argument0: IrExpression, argument1: IrExpression) defined in org.jetbrains.kotlin.ir.expressions.impl.IrBinaryPrimitiveImpl[DeserializedClassConstructorDescriptor]

'expression' @ [163:54] ==> value-parameter expression: KtBinaryExpression defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator.generateIdentityOperator[ValueParameterDescriptorImpl]

'startOffset' @ [163:65] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'expression' @ [163:78] ==> value-parameter expression: KtBinaryExpression defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator.generateIdentityOperator[ValueParameterDescriptorImpl]

'endOffset' @ [163:89] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'irOperator' @ [163:100] ==> value-parameter irOperator: IrStatementOrigin defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator.generateIdentityOperator[ValueParameterDescriptorImpl]

'context' @ [164:54] ==> public open val context: GeneratorContext defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator[PropertyDescriptorImpl]

'irBuiltIns' @ [164:62] ==> public final val irBuiltIns: IrBuiltIns defined in org.jetbrains.kotlin.psi2ir.generators.GeneratorContext[DeserializedPropertyDescriptor]

'eqeqeqSymbol' @ [164:73] ==> public final val eqeqeqSymbol: IrSimpleFunctionSymbol defined in org.jetbrains.kotlin.ir.descriptors.IrBuiltIns[DeserializedPropertyDescriptor]

'irArgument0' @ [165:54] ==> val irArgument0: IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator.generateIdentityOperator[LocalVariableDescriptor]

'irArgument1' @ [165:67] ==> val irArgument1: IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator.generateIdentityOperator[LocalVariableDescriptor]

'when (irOperator) {
            IrStatementOrigin.EQEQEQ ->
                irIdentityEquals
            IrStatementOrigin.EXCLEQEQ ->
                IrUnaryPrimitiveImpl(expression.startOffset, expression.endOffset, IrStatementOrigin.EXCLEQEQ,
                                     context.irBuiltIns.booleanNotSymbol,
                                     irIdentityEquals)
            else ->
                throw AssertionError("Unexpected identity operator $irOperator")
        }' @ [167:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: IrExpression, entry1: IrExpression, entry2: IrExpression): IrExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> IrExpression

'irOperator' @ [167:22] ==> value-parameter irOperator: IrStatementOrigin defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator.generateIdentityOperator[ValueParameterDescriptorImpl]

'EQEQEQ' @ [168:31] ==> public object EQEQEQ : IrStatementOriginImpl defined in org.jetbrains.kotlin.ir.expressions.IrStatementOrigin[FakeCallableDescriptorForObject]

'irIdentityEquals' @ [169:17] ==> val irIdentityEquals: IrBinaryPrimitiveImpl defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator.generateIdentityOperator[LocalVariableDescriptor]

'EXCLEQEQ' @ [170:31] ==> public object EXCLEQEQ : IrStatementOriginImpl defined in org.jetbrains.kotlin.ir.expressions.IrStatementOrigin[FakeCallableDescriptorForObject]

'IrUnaryPrimitiveImpl' @ [171:17] ==> public constructor IrUnaryPrimitiveImpl(startOffset: Int, endOffset: Int, origin: IrStatementOrigin?, symbol: IrFunctionSymbol, argument: IrExpression) defined in org.jetbrains.kotlin.ir.expressions.impl.IrUnaryPrimitiveImpl[DeserializedClassConstructorDescriptor]

'expression' @ [171:38] ==> value-parameter expression: KtBinaryExpression defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator.generateIdentityOperator[ValueParameterDescriptorImpl]

'startOffset' @ [171:49] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'expression' @ [171:62] ==> value-parameter expression: KtBinaryExpression defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator.generateIdentityOperator[ValueParameterDescriptorImpl]

'endOffset' @ [171:73] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'EXCLEQEQ' @ [171:102] ==> public object EXCLEQEQ : IrStatementOriginImpl defined in org.jetbrains.kotlin.ir.expressions.IrStatementOrigin[FakeCallableDescriptorForObject]

'context' @ [172:38] ==> public open val context: GeneratorContext defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator[PropertyDescriptorImpl]

'irBuiltIns' @ [172:46] ==> public final val irBuiltIns: IrBuiltIns defined in org.jetbrains.kotlin.psi2ir.generators.GeneratorContext[DeserializedPropertyDescriptor]

'booleanNotSymbol' @ [172:57] ==> public final val booleanNotSymbol: IrSimpleFunctionSymbol defined in org.jetbrains.kotlin.ir.descriptors.IrBuiltIns[DeserializedPropertyDescriptor]

'irIdentityEquals' @ [173:38] ==> val irIdentityEquals: IrBinaryPrimitiveImpl defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator.generateIdentityOperator[LocalVariableDescriptor]

'AssertionError' @ [175:23] ==> public constructor AssertionError(p0: (Any..Any?)) defined in java.lang.AssertionError[JavaClassConstructorDescriptor]

'irOperator' @ [175:69] ==> value-parameter irOperator: IrStatementOrigin defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator.generateIdentityOperator[ValueParameterDescriptorImpl]

'statementGenerator' @ [181:27] ==> public final val statementGenerator: StatementGenerator defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator[PropertyDescriptorImpl]

'generateExpression' @ [181:46] ==> public final fun generateExpression(ktExpression: KtExpression): IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator[SimpleFunctionDescriptorImpl]

'expression' @ [181:65] ==> value-parameter expression: KtBinaryExpression defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator.generateEqualityOperator[ValueParameterDescriptorImpl]

'left' @ [181:76] ==> public final val KtBinaryExpression.left: KtExpression?[MyPropertyDescriptor]

'statementGenerator' @ [182:27] ==> public final val statementGenerator: StatementGenerator defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator[PropertyDescriptorImpl]

'generateExpression' @ [182:46] ==> public final fun generateExpression(ktExpression: KtExpression): IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator[SimpleFunctionDescriptorImpl]

'expression' @ [182:65] ==> value-parameter expression: KtBinaryExpression defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator.generateEqualityOperator[ValueParameterDescriptorImpl]

'right' @ [182:76] ==> public final val KtBinaryExpression.right: KtExpression?[MyPropertyDescriptor]

'IrBinaryPrimitiveImpl' @ [184:24] ==> public constructor IrBinaryPrimitiveImpl(startOffset: Int, endOffset: Int, origin: IrStatementOrigin?, symbol: IrFunctionSymbol, argument0: IrExpression, argument1: IrExpression) defined in org.jetbrains.kotlin.ir.expressions.impl.IrBinaryPrimitiveImpl[DeserializedClassConstructorDescriptor]

'expression' @ [184:46] ==> value-parameter expression: KtBinaryExpression defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator.generateEqualityOperator[ValueParameterDescriptorImpl]

'startOffset' @ [184:57] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'expression' @ [184:70] ==> value-parameter expression: KtBinaryExpression defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator.generateEqualityOperator[ValueParameterDescriptorImpl]

'endOffset' @ [184:81] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'irOperator' @ [185:46] ==> value-parameter irOperator: IrStatementOrigin defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator.generateEqualityOperator[ValueParameterDescriptorImpl]

'context' @ [186:46] ==> public open val context: GeneratorContext defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator[PropertyDescriptorImpl]

'irBuiltIns' @ [186:54] ==> public final val irBuiltIns: IrBuiltIns defined in org.jetbrains.kotlin.psi2ir.generators.GeneratorContext[DeserializedPropertyDescriptor]

'eqeqSymbol' @ [186:65] ==> public final val eqeqSymbol: IrSimpleFunctionSymbol defined in org.jetbrains.kotlin.ir.descriptors.IrBuiltIns[DeserializedPropertyDescriptor]

'irArgument0' @ [187:46] ==> val irArgument0: IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator.generateEqualityOperator[LocalVariableDescriptor]

'irArgument1' @ [187:59] ==> val irArgument1: IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator.generateEqualityOperator[LocalVariableDescriptor]

'when (irOperator) {
            IrStatementOrigin.EQEQ ->
                irEquals
            IrStatementOrigin.EXCLEQ ->
                IrUnaryPrimitiveImpl(expression.startOffset, expression.endOffset, IrStatementOrigin.EXCLEQ,
                                     context.irBuiltIns.booleanNotSymbol,
                                     irEquals)
            else ->
                throw AssertionError("Unexpected equality operator $irOperator")
        }' @ [189:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: IrExpression, entry1: IrExpression, entry2: IrExpression): IrExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> IrExpression

'irOperator' @ [189:22] ==> value-parameter irOperator: IrStatementOrigin defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator.generateEqualityOperator[ValueParameterDescriptorImpl]

'EQEQ' @ [190:31] ==> public object EQEQ : IrStatementOriginImpl defined in org.jetbrains.kotlin.ir.expressions.IrStatementOrigin[FakeCallableDescriptorForObject]

'irEquals' @ [191:17] ==> val irEquals: IrBinaryPrimitiveImpl defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator.generateEqualityOperator[LocalVariableDescriptor]

'EXCLEQ' @ [192:31] ==> public object EXCLEQ : IrStatementOriginImpl defined in org.jetbrains.kotlin.ir.expressions.IrStatementOrigin[FakeCallableDescriptorForObject]

'IrUnaryPrimitiveImpl' @ [193:17] ==> public constructor IrUnaryPrimitiveImpl(startOffset: Int, endOffset: Int, origin: IrStatementOrigin?, symbol: IrFunctionSymbol, argument: IrExpression) defined in org.jetbrains.kotlin.ir.expressions.impl.IrUnaryPrimitiveImpl[DeserializedClassConstructorDescriptor]

'expression' @ [193:38] ==> value-parameter expression: KtBinaryExpression defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator.generateEqualityOperator[ValueParameterDescriptorImpl]

'startOffset' @ [193:49] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'expression' @ [193:62] ==> value-parameter expression: KtBinaryExpression defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator.generateEqualityOperator[ValueParameterDescriptorImpl]

'endOffset' @ [193:73] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'EXCLEQ' @ [193:102] ==> public object EXCLEQ : IrStatementOriginImpl defined in org.jetbrains.kotlin.ir.expressions.IrStatementOrigin[FakeCallableDescriptorForObject]

'context' @ [194:38] ==> public open val context: GeneratorContext defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator[PropertyDescriptorImpl]

'irBuiltIns' @ [194:46] ==> public final val irBuiltIns: IrBuiltIns defined in org.jetbrains.kotlin.psi2ir.generators.GeneratorContext[DeserializedPropertyDescriptor]

'booleanNotSymbol' @ [194:57] ==> public final val booleanNotSymbol: IrSimpleFunctionSymbol defined in org.jetbrains.kotlin.ir.descriptors.IrBuiltIns[DeserializedPropertyDescriptor]

'irEquals' @ [195:38] ==> val irEquals: IrBinaryPrimitiveImpl defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator.generateEqualityOperator[LocalVariableDescriptor]

'AssertionError' @ [197:23] ==> public constructor AssertionError(p0: (Any..Any?)) defined in java.lang.AssertionError[JavaClassConstructorDescriptor]

'irOperator' @ [197:69] ==> value-parameter irOperator: IrStatementOrigin defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator.generateEqualityOperator[ValueParameterDescriptorImpl]

'getResolvedCall' @ [203:29] ==> public fun Generator.getResolvedCall(key: KtElement): ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.psi2ir.generators in file Generator.kt[SimpleFunctionDescriptorImpl]

'expression' @ [203:45] ==> value-parameter expression: KtBinaryExpression defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator.generateComparisonOperator[ValueParameterDescriptorImpl]

'CallGenerator' @ [205:31] ==> public constructor CallGenerator(statementGenerator: StatementGenerator) defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator[ClassConstructorDescriptorImpl]

'statementGenerator' @ [205:45] ==> public final val statementGenerator: StatementGenerator defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator[PropertyDescriptorImpl]

'generateCall' @ [205:65] ==> public fun CallGenerator.generateCall(ktElement: KtElement, call: CallBuilder, origin: IrStatementOrigin? = ...): IrExpression defined in org.jetbrains.kotlin.psi2ir.generators in file CallGenerator.kt[SimpleFunctionDescriptorImpl]

'expression' @ [205:78] ==> value-parameter expression: KtBinaryExpression defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator.generateComparisonOperator[ValueParameterDescriptorImpl]

'statementGenerator' @ [205:90] ==> public final val statementGenerator: StatementGenerator defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator[PropertyDescriptorImpl]

'pregenerateCall' @ [205:109] ==> public fun StatementGenerator.pregenerateCall(resolvedCall: ResolvedCall<*>): CallBuilder defined in org.jetbrains.kotlin.psi2ir.generators in file ArgumentsGenerationUtils.kt[SimpleFunctionDescriptorImpl]

'compareToCall' @ [205:125] ==> val compareToCall: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator.generateComparisonOperator[LocalVariableDescriptor]

'origin' @ [205:141] ==> value-parameter origin: IrStatementOrigin defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator.generateComparisonOperator[ValueParameterDescriptorImpl]

'when (origin) {
            IrStatementOrigin.LT -> context.irBuiltIns.lt0Symbol
            IrStatementOrigin.LTEQ -> context.irBuiltIns.lteq0Symbol
            IrStatementOrigin.GT -> context.irBuiltIns.gt0Symbol
            IrStatementOrigin.GTEQ -> context.irBuiltIns.gteq0Symbol
            else -> throw AssertionError("Unexpected comparison operator: $origin")
        }' @ [207:35] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: IrSimpleFunctionSymbol, entry1: IrSimpleFunctionSymbol, entry2: IrSimpleFunctionSymbol, entry3: IrSimpleFunctionSymbol, entry4: IrSimpleFunctionSymbol): IrSimpleFunctionSymbol[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> IrSimpleFunctionSymbol

'origin' @ [207:41] ==> value-parameter origin: IrStatementOrigin defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator.generateComparisonOperator[ValueParameterDescriptorImpl]

'LT' @ [208:31] ==> public object LT : IrStatementOriginImpl defined in org.jetbrains.kotlin.ir.expressions.IrStatementOrigin[FakeCallableDescriptorForObject]

'context' @ [208:37] ==> public open val context: GeneratorContext defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator[PropertyDescriptorImpl]

'irBuiltIns' @ [208:45] ==> public final val irBuiltIns: IrBuiltIns defined in org.jetbrains.kotlin.psi2ir.generators.GeneratorContext[DeserializedPropertyDescriptor]

'lt0Symbol' @ [208:56] ==> public final val lt0Symbol: IrSimpleFunctionSymbol defined in org.jetbrains.kotlin.ir.descriptors.IrBuiltIns[DeserializedPropertyDescriptor]

'LTEQ' @ [209:31] ==> public object LTEQ : IrStatementOriginImpl defined in org.jetbrains.kotlin.ir.expressions.IrStatementOrigin[FakeCallableDescriptorForObject]

'context' @ [209:39] ==> public open val context: GeneratorContext defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator[PropertyDescriptorImpl]

'irBuiltIns' @ [209:47] ==> public final val irBuiltIns: IrBuiltIns defined in org.jetbrains.kotlin.psi2ir.generators.GeneratorContext[DeserializedPropertyDescriptor]

'lteq0Symbol' @ [209:58] ==> public final val lteq0Symbol: IrSimpleFunctionSymbol defined in org.jetbrains.kotlin.ir.descriptors.IrBuiltIns[DeserializedPropertyDescriptor]

'GT' @ [210:31] ==> public object GT : IrStatementOriginImpl defined in org.jetbrains.kotlin.ir.expressions.IrStatementOrigin[FakeCallableDescriptorForObject]

'context' @ [210:37] ==> public open val context: GeneratorContext defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator[PropertyDescriptorImpl]

'irBuiltIns' @ [210:45] ==> public final val irBuiltIns: IrBuiltIns defined in org.jetbrains.kotlin.psi2ir.generators.GeneratorContext[DeserializedPropertyDescriptor]

'gt0Symbol' @ [210:56] ==> public final val gt0Symbol: IrSimpleFunctionSymbol defined in org.jetbrains.kotlin.ir.descriptors.IrBuiltIns[DeserializedPropertyDescriptor]

'GTEQ' @ [211:31] ==> public object GTEQ : IrStatementOriginImpl defined in org.jetbrains.kotlin.ir.expressions.IrStatementOrigin[FakeCallableDescriptorForObject]

'context' @ [211:39] ==> public open val context: GeneratorContext defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator[PropertyDescriptorImpl]

'irBuiltIns' @ [211:47] ==> public final val irBuiltIns: IrBuiltIns defined in org.jetbrains.kotlin.psi2ir.generators.GeneratorContext[DeserializedPropertyDescriptor]

'gteq0Symbol' @ [211:58] ==> public final val gteq0Symbol: IrSimpleFunctionSymbol defined in org.jetbrains.kotlin.ir.descriptors.IrBuiltIns[DeserializedPropertyDescriptor]

'AssertionError' @ [212:27] ==> public constructor AssertionError(p0: (Any..Any?)) defined in java.lang.AssertionError[JavaClassConstructorDescriptor]

'origin' @ [212:76] ==> value-parameter origin: IrStatementOrigin defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator.generateComparisonOperator[ValueParameterDescriptorImpl]

'IrUnaryPrimitiveImpl' @ [215:16] ==> public constructor IrUnaryPrimitiveImpl(startOffset: Int, endOffset: Int, origin: IrStatementOrigin?, symbol: IrFunctionSymbol, argument: IrExpression) defined in org.jetbrains.kotlin.ir.expressions.impl.IrUnaryPrimitiveImpl[DeserializedClassConstructorDescriptor]

'expression' @ [215:37] ==> value-parameter expression: KtBinaryExpression defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator.generateComparisonOperator[ValueParameterDescriptorImpl]

'startOffset' @ [215:48] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'expression' @ [215:61] ==> value-parameter expression: KtBinaryExpression defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator.generateComparisonOperator[ValueParameterDescriptorImpl]

'endOffset' @ [215:72] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'origin' @ [215:83] ==> value-parameter origin: IrStatementOrigin defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator.generateComparisonOperator[ValueParameterDescriptorImpl]

'compareToZeroSymbol' @ [215:91] ==> val compareToZeroSymbol: IrSimpleFunctionSymbol defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator.generateComparisonOperator[LocalVariableDescriptor]

'irCompareToCall' @ [215:112] ==> val irCompareToCall: IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator.generateComparisonOperator[LocalVariableDescriptor]

'expression' @ [219:26] ==> value-parameter expression: KtPostfixExpression defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator.generateExclExclOperator[ValueParameterDescriptorImpl]

'baseExpression' @ [219:37] ==> public final val KtPostfixExpression.baseExpression: KtExpression?[MyPropertyDescriptor]

'statementGenerator' @ [220:26] ==> public final val statementGenerator: StatementGenerator defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator[PropertyDescriptorImpl]

'generateExpression' @ [220:45] ==> public final fun generateExpression(ktExpression: KtExpression): IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator[SimpleFunctionDescriptorImpl]

'ktArgument' @ [220:64] ==> val ktArgument: KtExpression defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator.generateExclExclOperator[LocalVariableDescriptor]

'expression' @ [221:26] ==> value-parameter expression: KtPostfixExpression defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator.generateExclExclOperator[ValueParameterDescriptorImpl]

'operationReference' @ [221:37] ==> public final val KtPostfixExpression.operationReference: KtSimpleNameExpression[MyPropertyDescriptor]

'irArgument' @ [223:26] ==> val irArgument: IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator.generateExclExclOperator[LocalVariableDescriptor]

'type' @ [223:37] ==> public abstract val type: KotlinType defined in org.jetbrains.kotlin.ir.expressions.IrExpression[DeserializedPropertyDescriptor]

'makeNotNullable' @ [223:42] ==> public fun KotlinType.makeNotNullable(): KotlinType defined in org.jetbrains.kotlin.types.typeUtil[DeserializedSimpleFunctionDescriptor]

'irBlock' @ [225:16] ==> public inline fun GeneratorWithScope.irBlock(ktElement: KtElement?, origin: IrStatementOrigin? = ..., resultType: KotlinType? = ..., body: IrBlockBuilder.() -> Unit): IrExpression defined in org.jetbrains.kotlin.psi2ir.generators in file Generator.kt[SimpleFunctionDescriptorImpl]

'ktOperator' @ [225:24] ==> val ktOperator: KtSimpleNameExpression defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator.generateExclExclOperator[LocalVariableDescriptor]

'origin' @ [225:36] ==> value-parameter origin: IrStatementOrigin defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator.generateExclExclOperator[ValueParameterDescriptorImpl]

'resultType' @ [225:44] ==> val resultType: KotlinType defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator.generateExclExclOperator[LocalVariableDescriptor]

'irTemporary' @ [226:29] ==> public fun <T : IrElement> IrStatementsBuilder<IrBlock>.irTemporary(value: IrExpression, nameHint: String? = ...): IrVariable defined in org.jetbrains.kotlin.ir.builders[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : IrElement> -> IrBlock

'irArgument' @ [226:41] ==> val irArgument: IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator.generateExclExclOperator[LocalVariableDescriptor]

'+' @ [227:13] ==> public final fun IrStatement.unaryPlus(): Unit defined in org.jetbrains.kotlin.ir.builders.IrBlockBuilder[DeserializedSimpleFunctionDescriptor]

'irIfNull' @ [227:14] ==> public fun IrBuilderWithScope.irIfNull(type: KotlinType, subject: IrExpression, thenPart: IrExpression, elsePart: IrExpression): IrIfThenElseImpl defined in org.jetbrains.kotlin.ir.builders[DeserializedSimpleFunctionDescriptor]

'resultType' @ [227:23] ==> val resultType: KotlinType defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator.generateExclExclOperator[LocalVariableDescriptor]

'irGet' @ [227:35] ==> public fun IrBuilderWithScope.irGet(variable: IrValueSymbol): IrGetValueImpl defined in org.jetbrains.kotlin.ir.builders[DeserializedSimpleFunctionDescriptor]

'temporary' @ [227:41] ==> val temporary: IrVariable defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator.generateExclExclOperator.<anonymous>[LocalVariableDescriptor]

'symbol' @ [227:51] ==> public abstract val symbol: IrVariableSymbol defined in org.jetbrains.kotlin.ir.declarations.IrVariable[DeserializedPropertyDescriptor]

'irThrowNpe' @ [227:60] ==> public fun IrBuilderWithScope.irThrowNpe(origin: IrStatementOrigin): IrNullaryPrimitiveImpl defined in org.jetbrains.kotlin.ir.builders[DeserializedSimpleFunctionDescriptor]

'origin' @ [227:71] ==> value-parameter origin: IrStatementOrigin defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator.generateExclExclOperator[ValueParameterDescriptorImpl]

'irGet' @ [227:80] ==> public fun IrBuilderWithScope.irGet(variable: IrValueSymbol): IrGetValueImpl defined in org.jetbrains.kotlin.ir.builders[DeserializedSimpleFunctionDescriptor]

'temporary' @ [227:86] ==> val temporary: IrVariable defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator.generateExclExclOperator.<anonymous>[LocalVariableDescriptor]

'symbol' @ [227:96] ==> public abstract val symbol: IrVariableSymbol defined in org.jetbrains.kotlin.ir.declarations.IrVariable[DeserializedPropertyDescriptor]

'getResolvedCall' @ [232:28] ==> public fun Generator.getResolvedCall(key: KtElement): ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.psi2ir.generators in file Generator.kt[SimpleFunctionDescriptorImpl]

'expression' @ [232:44] ==> value-parameter expression: KtBinaryExpression defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator.generateBinaryOperatorAsCall[ValueParameterDescriptorImpl]

'CallGenerator' @ [233:16] ==> public constructor CallGenerator(statementGenerator: StatementGenerator) defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator[ClassConstructorDescriptorImpl]

'statementGenerator' @ [233:30] ==> public final val statementGenerator: StatementGenerator defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator[PropertyDescriptorImpl]

'generateCall' @ [233:50] ==> public fun CallGenerator.generateCall(ktElement: KtElement, call: CallBuilder, origin: IrStatementOrigin? = ...): IrExpression defined in org.jetbrains.kotlin.psi2ir.generators in file CallGenerator.kt[SimpleFunctionDescriptorImpl]

'expression' @ [233:63] ==> value-parameter expression: KtBinaryExpression defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator.generateBinaryOperatorAsCall[ValueParameterDescriptorImpl]

'statementGenerator' @ [233:75] ==> public final val statementGenerator: StatementGenerator defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator[PropertyDescriptorImpl]

'pregenerateCall' @ [233:94] ==> public fun StatementGenerator.pregenerateCall(resolvedCall: ResolvedCall<*>): CallBuilder defined in org.jetbrains.kotlin.psi2ir.generators in file ArgumentsGenerationUtils.kt[SimpleFunctionDescriptorImpl]

'operatorCall' @ [233:110] ==> val operatorCall: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator.generateBinaryOperatorAsCall[LocalVariableDescriptor]

'origin' @ [233:125] ==> value-parameter origin: IrStatementOrigin? defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator.generateBinaryOperatorAsCall[ValueParameterDescriptorImpl]

'getResolvedCall' @ [237:28] ==> public fun Generator.getResolvedCall(key: KtElement): ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.psi2ir.generators in file Generator.kt[SimpleFunctionDescriptorImpl]

'expression' @ [237:44] ==> value-parameter expression: KtPrefixExpression defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator.generatePrefixOperatorAsCall[ValueParameterDescriptorImpl]

'expression' @ [239:13] ==> value-parameter expression: KtPrefixExpression defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator.generatePrefixOperatorAsCall[ValueParameterDescriptorImpl]

'baseExpression' @ [239:24] ==> public final val KtPrefixExpression.baseExpression: KtExpression?[MyPropertyDescriptor]

'ConstantExpressionEvaluator' @ [240:13] ==> public companion object defined in org.jetbrains.kotlin.resolve.constants.evaluate.ConstantExpressionEvaluator[FakeCallableDescriptorForObject]

'getConstant' @ [240:41] ==> @JvmStatic public final fun getConstant(expression: KtExpression, bindingContext: BindingContext): CompileTimeConstant<*>? defined in org.jetbrains.kotlin.resolve.constants.evaluate.ConstantExpressionEvaluator.Companion[DeserializedSimpleFunctionDescriptor]

'expression' @ [240:53] ==> value-parameter expression: KtPrefixExpression defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator.generatePrefixOperatorAsCall[ValueParameterDescriptorImpl]

'context' @ [240:65] ==> public open val context: GeneratorContext defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator[PropertyDescriptorImpl]

'bindingContext' @ [240:73] ==> public final val bindingContext: BindingContext defined in org.jetbrains.kotlin.psi2ir.generators.GeneratorContext[PropertyDescriptorImpl]

'let' @ [240:90] ==> @InlineOnly public inline fun <T, R> CompileTimeConstant<*>.let(block: (CompileTimeConstant<*>) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CompileTimeConstant<*>
    <R> -> Unit

'resolvedCall' @ [241:36] ==> val resolvedCall: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator.generatePrefixOperatorAsCall[LocalVariableDescriptor]

'dispatchReceiver' @ [241:49] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.dispatchReceiver: ReceiverValue?[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> Captured(out CallableDescriptor)

'type' @ [241:67] ==> public final val ReceiverValue.type: KotlinType[MyPropertyDescriptor]

'receiverType' @ [242:21] ==> val receiverType: KotlinType? defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator.generatePrefixOperatorAsCall.<anonymous>[LocalVariableDescriptor]

'isPrimitiveType' @ [242:60] ==> public open fun isPrimitiveType(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'receiverType' @ [242:76] ==> val receiverType: KotlinType? defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator.generatePrefixOperatorAsCall.<anonymous>[LocalVariableDescriptor]

'statementGenerator' @ [243:28] ==> public final val statementGenerator: StatementGenerator defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator[PropertyDescriptorImpl]

'generateConstantExpression' @ [243:47] ==> public final fun generateConstantExpression(expression: KtExpression, constant: CompileTimeConstant<*>): IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator[SimpleFunctionDescriptorImpl]

'expression' @ [243:74] ==> value-parameter expression: KtPrefixExpression defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator.generatePrefixOperatorAsCall[ValueParameterDescriptorImpl]

'constant' @ [243:86] ==> value-parameter constant: CompileTimeConstant<*> defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator.generatePrefixOperatorAsCall.<anonymous>[ValueParameterDescriptorImpl]

'CallGenerator' @ [248:16] ==> public constructor CallGenerator(statementGenerator: StatementGenerator) defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator[ClassConstructorDescriptorImpl]

'statementGenerator' @ [248:30] ==> public final val statementGenerator: StatementGenerator defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator[PropertyDescriptorImpl]

'generateCall' @ [248:50] ==> public fun CallGenerator.generateCall(ktElement: KtElement, call: CallBuilder, origin: IrStatementOrigin? = ...): IrExpression defined in org.jetbrains.kotlin.psi2ir.generators in file CallGenerator.kt[SimpleFunctionDescriptorImpl]

'expression' @ [248:63] ==> value-parameter expression: KtPrefixExpression defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator.generatePrefixOperatorAsCall[ValueParameterDescriptorImpl]

'statementGenerator' @ [248:75] ==> public final val statementGenerator: StatementGenerator defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator[PropertyDescriptorImpl]

'pregenerateCall' @ [248:94] ==> public fun StatementGenerator.pregenerateCall(resolvedCall: ResolvedCall<*>): CallBuilder defined in org.jetbrains.kotlin.psi2ir.generators in file ArgumentsGenerationUtils.kt[SimpleFunctionDescriptorImpl]

'resolvedCall' @ [248:110] ==> val resolvedCall: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator.generatePrefixOperatorAsCall[LocalVariableDescriptor]

'origin' @ [248:125] ==> value-parameter origin: IrStatementOrigin defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator.generatePrefixOperatorAsCall[ValueParameterDescriptorImpl]

