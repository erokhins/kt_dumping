'StatementGeneratorExtension' @ [34:78] ==> public constructor StatementGeneratorExtension(statementGenerator: StatementGenerator) defined in org.jetbrains.kotlin.psi2ir.generators.StatementGeneratorExtension[ClassConstructorDescriptorImpl]

'statementGenerator' @ [34:106] ==> value-parameter statementGenerator: StatementGenerator defined in org.jetbrains.kotlin.psi2ir.generators.BranchingExpressionGenerator.<init>[ValueParameterDescriptorImpl]

'getInferredTypeWithImplicitCastsOrFail' @ [36:26] ==> public fun Generator.getInferredTypeWithImplicitCastsOrFail(key: KtExpression): KotlinType defined in org.jetbrains.kotlin.psi2ir.generators in file Generator.kt[SimpleFunctionDescriptorImpl]

'expression' @ [36:65] ==> value-parameter expression: KtIfExpression defined in org.jetbrains.kotlin.psi2ir.generators.BranchingExpressionGenerator.generateIfExpression[ValueParameterDescriptorImpl]

'expression' @ [38:40] ==> value-parameter expression: KtIfExpression defined in org.jetbrains.kotlin.psi2ir.generators.BranchingExpressionGenerator.generateIfExpression[ValueParameterDescriptorImpl]

'SmartList' @ [39:26] ==> public constructor SmartList<E : (Any..Any?)>() defined in org.jetbrains.kotlin.utils.SmartList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> IrBranch

'statementGenerator' @ [43:31] ==> public final val statementGenerator: StatementGenerator defined in org.jetbrains.kotlin.psi2ir.generators.BranchingExpressionGenerator[PropertyDescriptorImpl]

'generateExpression' @ [43:50] ==> public final fun generateExpression(ktExpression: KtExpression): IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator[SimpleFunctionDescriptorImpl]

'ktLastIf' @ [43:69] ==> var ktLastIf: KtIfExpression defined in org.jetbrains.kotlin.psi2ir.generators.BranchingExpressionGenerator.generateIfExpression[LocalVariableDescriptor]

'condition' @ [43:78] ==> public final val KtIfExpression.condition: KtExpression?[MyPropertyDescriptor]

'statementGenerator' @ [44:32] ==> public final val statementGenerator: StatementGenerator defined in org.jetbrains.kotlin.psi2ir.generators.BranchingExpressionGenerator[PropertyDescriptorImpl]

'generateExpression' @ [44:51] ==> public final fun generateExpression(ktExpression: KtExpression): IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator[SimpleFunctionDescriptorImpl]

'ktLastIf' @ [44:70] ==> var ktLastIf: KtIfExpression defined in org.jetbrains.kotlin.psi2ir.generators.BranchingExpressionGenerator.generateIfExpression[LocalVariableDescriptor]

'then' @ [44:79] ==> public final val KtIfExpression.then: KtExpression?[MyPropertyDescriptor]

'irBranches' @ [45:13] ==> val irBranches: SmartList<IrBranch> defined in org.jetbrains.kotlin.psi2ir.generators.BranchingExpressionGenerator.generateIfExpression[LocalVariableDescriptor]

'add' @ [45:24] ==> public open fun add(element: (IrBranch..IrBranch?)): Boolean defined in org.jetbrains.kotlin.utils.SmartList[JavaMethodDescriptor]

'IrBranchImpl' @ [45:28] ==> public constructor IrBranchImpl(condition: IrExpression, result: IrExpression) defined in org.jetbrains.kotlin.ir.expressions.impl.IrBranchImpl[DeserializedClassConstructorDescriptor]

'irCondition' @ [45:41] ==> val irCondition: IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.BranchingExpressionGenerator.generateIfExpression[LocalVariableDescriptor]

'irThenBranch' @ [45:54] ==> val irThenBranch: IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.BranchingExpressionGenerator.generateIfExpression[LocalVariableDescriptor]

'ktLastIf' @ [47:26] ==> var ktLastIf: KtIfExpression defined in org.jetbrains.kotlin.psi2ir.generators.BranchingExpressionGenerator.generateIfExpression[LocalVariableDescriptor]

'`else`' @ [47:35] ==> public final val KtIfExpression.`else`: KtExpression?[MyPropertyDescriptor]

'deparenthesize' @ [47:43] ==> public fun KtElement.deparenthesize(): KtElement defined in org.jetbrains.kotlin.psi2ir in file KotlinUtils.kt[SimpleFunctionDescriptorImpl]

'when (ktElse) {
                null -> break@whenBranches
                is KtIfExpression -> ktLastIf = ktElse
                is KtExpression -> {
                    irElseBranch = statementGenerator.generateExpression(ktElse)
                    break@whenBranches
                }
                else -> throw AssertionError("Unexpected else expression: ${ktElse.text}")
            }' @ [48:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit, entry3: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'ktElse' @ [48:19] ==> val ktElse: KtElement? defined in org.jetbrains.kotlin.psi2ir.generators.BranchingExpressionGenerator.generateIfExpression[LocalVariableDescriptor]

'ktLastIf' @ [50:38] ==> var ktLastIf: KtIfExpression defined in org.jetbrains.kotlin.psi2ir.generators.BranchingExpressionGenerator.generateIfExpression[LocalVariableDescriptor]

'ktElse' @ [50:49] ==> val ktElse: KtElement? defined in org.jetbrains.kotlin.psi2ir.generators.BranchingExpressionGenerator.generateIfExpression[LocalVariableDescriptor]

'irElseBranch' @ [52:21] ==> var irElseBranch: IrExpression? defined in org.jetbrains.kotlin.psi2ir.generators.BranchingExpressionGenerator.generateIfExpression[LocalVariableDescriptor]

'statementGenerator' @ [52:36] ==> public final val statementGenerator: StatementGenerator defined in org.jetbrains.kotlin.psi2ir.generators.BranchingExpressionGenerator[PropertyDescriptorImpl]

'generateExpression' @ [52:55] ==> public final fun generateExpression(ktExpression: KtExpression): IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator[SimpleFunctionDescriptorImpl]

'ktElse' @ [52:74] ==> val ktElse: KtElement? defined in org.jetbrains.kotlin.psi2ir.generators.BranchingExpressionGenerator.generateIfExpression[LocalVariableDescriptor]

'AssertionError' @ [55:31] ==> public final fun <init>(p0: (Any..Any?)): AssertionError /* = AssertionError */ defined in kotlin.AssertionError[TypeAliasConstructorDescriptorImpl]

'ktElse' @ [55:77] ==> val ktElse: KtElement? defined in org.jetbrains.kotlin.psi2ir.generators.BranchingExpressionGenerator.generateIfExpression[LocalVariableDescriptor]

'text' @ [55:84] ==> public final val KtElement.text: (String..String?)[MyPropertyDescriptor]

'createIrWhen' @ [59:16] ==> private final fun createIrWhen(ktIf: KtIfExpression, irBranches: List<IrBranch>, irElseResult: IrExpression?, resultType: KotlinType): IrWhen defined in org.jetbrains.kotlin.psi2ir.generators.BranchingExpressionGenerator[SimpleFunctionDescriptorImpl]

'expression' @ [59:29] ==> value-parameter expression: KtIfExpression defined in org.jetbrains.kotlin.psi2ir.generators.BranchingExpressionGenerator.generateIfExpression[ValueParameterDescriptorImpl]

'irBranches' @ [59:41] ==> val irBranches: SmartList<IrBranch> defined in org.jetbrains.kotlin.psi2ir.generators.BranchingExpressionGenerator.generateIfExpression[LocalVariableDescriptor]

'irElseBranch' @ [59:53] ==> var irElseBranch: IrExpression? defined in org.jetbrains.kotlin.psi2ir.generators.BranchingExpressionGenerator.generateIfExpression[LocalVariableDescriptor]

'resultType' @ [59:67] ==> val resultType: KotlinType defined in org.jetbrains.kotlin.psi2ir.generators.BranchingExpressionGenerator.generateIfExpression[LocalVariableDescriptor]

'irBranches' @ [68:13] ==> value-parameter irBranches: List<IrBranch> defined in org.jetbrains.kotlin.psi2ir.generators.BranchingExpressionGenerator.createIrWhen[ValueParameterDescriptorImpl]

'size' @ [68:24] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'IrIfThenElseImpl' @ [69:20] ==> public constructor IrIfThenElseImpl(startOffset: Int, endOffset: Int, type: KotlinType, condition: IrExpression, thenBranch: IrExpression, elseBranch: IrExpression? = ..., origin: IrStatementOrigin? = ...) defined in org.jetbrains.kotlin.ir.expressions.impl.IrIfThenElseImpl[DeserializedClassConstructorDescriptor]

'ktIf' @ [69:37] ==> value-parameter ktIf: KtIfExpression defined in org.jetbrains.kotlin.psi2ir.generators.BranchingExpressionGenerator.createIrWhen[ValueParameterDescriptorImpl]

'startOffset' @ [69:42] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'ktIf' @ [69:55] ==> value-parameter ktIf: KtIfExpression defined in org.jetbrains.kotlin.psi2ir.generators.BranchingExpressionGenerator.createIrWhen[ValueParameterDescriptorImpl]

'endOffset' @ [69:60] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'resultType' @ [69:71] ==> value-parameter resultType: KotlinType defined in org.jetbrains.kotlin.psi2ir.generators.BranchingExpressionGenerator.createIrWhen[ValueParameterDescriptorImpl]

'irBranches' @ [70:37] ==> value-parameter irBranches: List<IrBranch> defined in org.jetbrains.kotlin.psi2ir.generators.BranchingExpressionGenerator.createIrWhen[ValueParameterDescriptorImpl]

'condition' @ [70:51] ==> public abstract var condition: IrExpression defined in org.jetbrains.kotlin.ir.expressions.IrBranch[DeserializedPropertyDescriptor]

'irBranches' @ [70:62] ==> value-parameter irBranches: List<IrBranch> defined in org.jetbrains.kotlin.psi2ir.generators.BranchingExpressionGenerator.createIrWhen[ValueParameterDescriptorImpl]

'result' @ [70:76] ==> public abstract var result: IrExpression defined in org.jetbrains.kotlin.ir.expressions.IrBranch[DeserializedPropertyDescriptor]

'irElseResult' @ [70:84] ==> value-parameter irElseResult: IrExpression? defined in org.jetbrains.kotlin.psi2ir.generators.BranchingExpressionGenerator.createIrWhen[ValueParameterDescriptorImpl]

'IrWhenImpl' @ [73:22] ==> public constructor IrWhenImpl(startOffset: Int, endOffset: Int, type: KotlinType, origin: IrStatementOrigin? = ...) defined in org.jetbrains.kotlin.ir.expressions.impl.IrWhenImpl[DeserializedClassConstructorDescriptor]

'ktIf' @ [73:33] ==> value-parameter ktIf: KtIfExpression defined in org.jetbrains.kotlin.psi2ir.generators.BranchingExpressionGenerator.createIrWhen[ValueParameterDescriptorImpl]

'startOffset' @ [73:38] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'ktIf' @ [73:51] ==> value-parameter ktIf: KtIfExpression defined in org.jetbrains.kotlin.psi2ir.generators.BranchingExpressionGenerator.createIrWhen[ValueParameterDescriptorImpl]

'endOffset' @ [73:56] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'resultType' @ [73:67] ==> value-parameter resultType: KotlinType defined in org.jetbrains.kotlin.psi2ir.generators.BranchingExpressionGenerator.createIrWhen[ValueParameterDescriptorImpl]

'WHEN' @ [73:97] ==> public object WHEN : IrStatementOriginImpl defined in org.jetbrains.kotlin.ir.expressions.IrStatementOrigin[FakeCallableDescriptorForObject]

'irWhen' @ [75:9] ==> val irWhen: IrWhenImpl defined in org.jetbrains.kotlin.psi2ir.generators.BranchingExpressionGenerator.createIrWhen[LocalVariableDescriptor]

'branches' @ [75:16] ==> public open val branches: MutableList<IrBranch> defined in org.jetbrains.kotlin.ir.expressions.impl.IrWhenImpl[DeserializedPropertyDescriptor]

'addAll' @ [75:25] ==> public abstract fun addAll(elements: Collection<IrBranch>): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'irBranches' @ [75:32] ==> value-parameter irBranches: List<IrBranch> defined in org.jetbrains.kotlin.psi2ir.generators.BranchingExpressionGenerator.createIrWhen[ValueParameterDescriptorImpl]

'irElseResult' @ [77:9] ==> value-parameter irElseResult: IrExpression? defined in org.jetbrains.kotlin.psi2ir.generators.BranchingExpressionGenerator.createIrWhen[ValueParameterDescriptorImpl]

'let' @ [77:23] ==> @InlineOnly public inline fun <T, R> IrExpression.let(block: (IrExpression) -> Boolean): Boolean defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrExpression
    <R> -> Boolean

'irWhen' @ [78:13] ==> val irWhen: IrWhenImpl defined in org.jetbrains.kotlin.psi2ir.generators.BranchingExpressionGenerator.createIrWhen[LocalVariableDescriptor]

'branches' @ [78:20] ==> public open val branches: MutableList<IrBranch> defined in org.jetbrains.kotlin.ir.expressions.impl.IrWhenImpl[DeserializedPropertyDescriptor]

'add' @ [78:29] ==> public abstract fun add(element: IrBranch): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'IrBranchImpl' @ [78:33] ==> public companion object defined in org.jetbrains.kotlin.ir.expressions.impl.IrBranchImpl[FakeCallableDescriptorForObject]

'elseBranch' @ [78:46] ==> public final fun elseBranch(result: IrExpression): IrElseBranchImpl defined in org.jetbrains.kotlin.ir.expressions.impl.IrBranchImpl.Companion[DeserializedSimpleFunctionDescriptor]

'it' @ [78:57] ==> value-parameter it: IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.BranchingExpressionGenerator.createIrWhen.<anonymous>[ValueParameterDescriptorImpl]

'irWhen' @ [81:16] ==> val irWhen: IrWhenImpl defined in org.jetbrains.kotlin.psi2ir.generators.BranchingExpressionGenerator.createIrWhen[LocalVariableDescriptor]

'expression' @ [85:25] ==> value-parameter expression: KtWhenExpression defined in org.jetbrains.kotlin.psi2ir.generators.BranchingExpressionGenerator.generateWhenExpression[ValueParameterDescriptorImpl]

'subjectExpression' @ [85:36] ==> public final val KtWhenExpression.subjectExpression: KtExpression?[MyPropertyDescriptor]

'let' @ [85:55] ==> @InlineOnly public inline fun <T, R> KtExpression.let(block: (KtExpression) -> IrVariable): IrVariable defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression
    <R> -> IrVariable

'scope' @ [86:13] ==> public open val scope: Scope defined in org.jetbrains.kotlin.psi2ir.generators.BranchingExpressionGenerator[PropertyDescriptorImpl]

'createTemporaryVariable' @ [86:19] ==> public final fun createTemporaryVariable(irExpression: IrExpression, nameHint: String? = ..., isMutable: Boolean = ..., origin: IrDeclarationOrigin = ...): IrVariable defined in org.jetbrains.kotlin.ir.builders.Scope[DeserializedSimpleFunctionDescriptor]

'statementGenerator' @ [86:43] ==> public final val statementGenerator: StatementGenerator defined in org.jetbrains.kotlin.psi2ir.generators.BranchingExpressionGenerator[PropertyDescriptorImpl]

'generateExpression' @ [86:62] ==> public final fun generateExpression(ktExpression: KtExpression): IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator[SimpleFunctionDescriptorImpl]

'it' @ [86:81] ==> value-parameter it: KtExpression defined in org.jetbrains.kotlin.psi2ir.generators.BranchingExpressionGenerator.generateWhenExpression.<anonymous>[ValueParameterDescriptorImpl]

'getInferredTypeWithImplicitCastsOrFail' @ [90:28] ==> public fun Generator.getInferredTypeWithImplicitCastsOrFail(key: KtExpression): KotlinType defined in org.jetbrains.kotlin.psi2ir.generators in file Generator.kt[SimpleFunctionDescriptorImpl]

'expression' @ [90:67] ==> value-parameter expression: KtWhenExpression defined in org.jetbrains.kotlin.psi2ir.generators.BranchingExpressionGenerator.generateWhenExpression[ValueParameterDescriptorImpl]

'context' @ [93:34] ==> public open val context: GeneratorContext defined in org.jetbrains.kotlin.psi2ir.generators.BranchingExpressionGenerator[PropertyDescriptorImpl]

'bindingContext' @ [93:42] ==> public final val bindingContext: BindingContext defined in org.jetbrains.kotlin.psi2ir.generators.GeneratorContext[PropertyDescriptorImpl]

'USED_AS_EXPRESSION' @ [93:72] ==> public final val USED_AS_EXPRESSION: (WritableSlice<(KtElement..KtElement?), (Boolean..Boolean?)>..WritableSlice<(KtElement..KtElement?), (Boolean..Boolean?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'expression' @ [93:92] ==> value-parameter expression: KtWhenExpression defined in org.jetbrains.kotlin.psi2ir.generators.BranchingExpressionGenerator.generateWhenExpression[ValueParameterDescriptorImpl]

'when {
            isUsedAsExpression -> inferredType
            KotlinBuiltIns.isNothing(inferredType) -> inferredType
            else -> context.builtIns.unitType
        }' @ [95:26] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: KotlinType, entry1: KotlinType, entry2: KotlinType): KotlinType[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> KotlinType

'isUsedAsExpression' @ [96:13] ==> val isUsedAsExpression: Boolean defined in org.jetbrains.kotlin.psi2ir.generators.BranchingExpressionGenerator.generateWhenExpression[LocalVariableDescriptor]

'inferredType' @ [96:35] ==> val inferredType: KotlinType defined in org.jetbrains.kotlin.psi2ir.generators.BranchingExpressionGenerator.generateWhenExpression[LocalVariableDescriptor]

'isNothing' @ [97:28] ==> public open fun isNothing(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'inferredType' @ [97:38] ==> val inferredType: KotlinType defined in org.jetbrains.kotlin.psi2ir.generators.BranchingExpressionGenerator.generateWhenExpression[LocalVariableDescriptor]

'inferredType' @ [97:55] ==> val inferredType: KotlinType defined in org.jetbrains.kotlin.psi2ir.generators.BranchingExpressionGenerator.generateWhenExpression[LocalVariableDescriptor]

'context' @ [98:21] ==> public open val context: GeneratorContext defined in org.jetbrains.kotlin.psi2ir.generators.BranchingExpressionGenerator[PropertyDescriptorImpl]

'builtIns' @ [98:29] ==> public final val builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.psi2ir.generators.GeneratorContext[DeserializedPropertyDescriptor]

'unitType' @ [98:38] ==> public final val KotlinBuiltIns.unitType: SimpleType[MyPropertyDescriptor]

'IrWhenImpl' @ [101:22] ==> public constructor IrWhenImpl(startOffset: Int, endOffset: Int, type: KotlinType, origin: IrStatementOrigin? = ...) defined in org.jetbrains.kotlin.ir.expressions.impl.IrWhenImpl[DeserializedClassConstructorDescriptor]

'expression' @ [101:33] ==> value-parameter expression: KtWhenExpression defined in org.jetbrains.kotlin.psi2ir.generators.BranchingExpressionGenerator.generateWhenExpression[ValueParameterDescriptorImpl]

'startOffset' @ [101:44] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'expression' @ [101:57] ==> value-parameter expression: KtWhenExpression defined in org.jetbrains.kotlin.psi2ir.generators.BranchingExpressionGenerator.generateWhenExpression[ValueParameterDescriptorImpl]

'endOffset' @ [101:68] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'resultType' @ [101:79] ==> val resultType: KotlinType defined in org.jetbrains.kotlin.psi2ir.generators.BranchingExpressionGenerator.generateWhenExpression[LocalVariableDescriptor]

'WHEN' @ [101:109] ==> public object WHEN : IrStatementOriginImpl defined in org.jetbrains.kotlin.ir.expressions.IrStatementOrigin[FakeCallableDescriptorForObject]

'expression' @ [103:25] ==> value-parameter expression: KtWhenExpression defined in org.jetbrains.kotlin.psi2ir.generators.BranchingExpressionGenerator.generateWhenExpression[ValueParameterDescriptorImpl]

'entries' @ [103:36] ==> public final val KtWhenExpression.entries: (MutableList<(KtWhenEntry..KtWhenEntry?)>..List<(KtWhenEntry..KtWhenEntry?)>)[MyPropertyDescriptor]

'ktEntry' @ [104:17] ==> val ktEntry: (KtWhenEntry..KtWhenEntry?) defined in org.jetbrains.kotlin.psi2ir.generators.BranchingExpressionGenerator.generateWhenExpression[LocalVariableDescriptor]

'isElse' @ [104:25] ==> public final val KtWhenEntry.isElse: Boolean[MyPropertyDescriptor]

'statementGenerator' @ [105:36] ==> public final val statementGenerator: StatementGenerator defined in org.jetbrains.kotlin.psi2ir.generators.BranchingExpressionGenerator[PropertyDescriptorImpl]

'generateExpression' @ [105:55] ==> public final fun generateExpression(ktExpression: KtExpression): IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator[SimpleFunctionDescriptorImpl]

'ktEntry' @ [105:74] ==> val ktEntry: (KtWhenEntry..KtWhenEntry?) defined in org.jetbrains.kotlin.psi2ir.generators.BranchingExpressionGenerator.generateWhenExpression[LocalVariableDescriptor]

'expression' @ [105:82] ==> public final val KtWhenEntry.expression: KtExpression?[MyPropertyDescriptor]

'irWhen' @ [106:17] ==> val irWhen: IrWhenImpl defined in org.jetbrains.kotlin.psi2ir.generators.BranchingExpressionGenerator.generateWhenExpression[LocalVariableDescriptor]

'branches' @ [106:24] ==> public open val branches: MutableList<IrBranch> defined in org.jetbrains.kotlin.ir.expressions.impl.IrWhenImpl[DeserializedPropertyDescriptor]

'add' @ [106:33] ==> public abstract fun add(element: IrBranch): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'IrBranchImpl' @ [106:37] ==> public companion object defined in org.jetbrains.kotlin.ir.expressions.impl.IrBranchImpl[FakeCallableDescriptorForObject]

'elseBranch' @ [106:50] ==> public final fun elseBranch(result: IrExpression): IrElseBranchImpl defined in org.jetbrains.kotlin.ir.expressions.impl.IrBranchImpl.Companion[DeserializedSimpleFunctionDescriptor]

'irElseResult' @ [106:61] ==> val irElseResult: IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.BranchingExpressionGenerator.generateWhenExpression[LocalVariableDescriptor]

'ktEntry' @ [111:33] ==> val ktEntry: (KtWhenEntry..KtWhenEntry?) defined in org.jetbrains.kotlin.psi2ir.generators.BranchingExpressionGenerator.generateWhenExpression[LocalVariableDescriptor]

'conditions' @ [111:41] ==> public final val KtWhenEntry.conditions: (Array<(KtWhenCondition..KtWhenCondition?)>..Array<out (KtWhenCondition..KtWhenCondition?)>)[MyPropertyDescriptor]

'if (irSubject != null)
                            generateWhenConditionWithSubject(ktCondition, irSubject)
                        else
                            generateWhenConditionNoSubject(ktCondition)' @ [113:25] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: IrExpression, elseBranch: IrExpression): IrExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> IrExpression

'irSubject' @ [113:29] ==> val irSubject: IrVariable? defined in org.jetbrains.kotlin.psi2ir.generators.BranchingExpressionGenerator.generateWhenExpression[LocalVariableDescriptor]

'generateWhenConditionWithSubject' @ [114:29] ==> private final fun generateWhenConditionWithSubject(ktCondition: KtWhenCondition, irSubject: IrVariable): IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.BranchingExpressionGenerator[SimpleFunctionDescriptorImpl]

'ktCondition' @ [114:62] ==> val ktCondition: (KtWhenCondition..KtWhenCondition?) defined in org.jetbrains.kotlin.psi2ir.generators.BranchingExpressionGenerator.generateWhenExpression[LocalVariableDescriptor]

'irSubject' @ [114:75] ==> val irSubject: IrVariable? defined in org.jetbrains.kotlin.psi2ir.generators.BranchingExpressionGenerator.generateWhenExpression[LocalVariableDescriptor]

'generateWhenConditionNoSubject' @ [116:29] ==> private final fun generateWhenConditionNoSubject(ktCondition: KtWhenCondition): IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.BranchingExpressionGenerator[SimpleFunctionDescriptorImpl]

'ktCondition' @ [116:60] ==> val ktCondition: (KtWhenCondition..KtWhenCondition?) defined in org.jetbrains.kotlin.psi2ir.generators.BranchingExpressionGenerator.generateWhenExpression[LocalVariableDescriptor]

'irBranchCondition' @ [117:17] ==> var irBranchCondition: IrExpression? defined in org.jetbrains.kotlin.psi2ir.generators.BranchingExpressionGenerator.generateWhenExpression[LocalVariableDescriptor]

'irBranchCondition' @ [117:37] ==> var irBranchCondition: IrExpression? defined in org.jetbrains.kotlin.psi2ir.generators.BranchingExpressionGenerator.generateWhenExpression[LocalVariableDescriptor]

'let' @ [117:56] ==> @InlineOnly public inline fun <T, R> IrExpression.let(block: (IrExpression) -> IrWhen): IrWhen defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrExpression
    <R> -> IrWhen

'context' @ [117:62] ==> public open val context: GeneratorContext defined in org.jetbrains.kotlin.psi2ir.generators.BranchingExpressionGenerator[PropertyDescriptorImpl]

'whenComma' @ [117:70] ==> public fun IrGeneratorContext.whenComma(a: IrExpression, b: IrExpression): IrWhen defined in org.jetbrains.kotlin.ir.builders[DeserializedSimpleFunctionDescriptor]

'it' @ [117:80] ==> value-parameter it: IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.BranchingExpressionGenerator.generateWhenExpression.<anonymous>[ValueParameterDescriptorImpl]

'irCondition' @ [117:84] ==> val irCondition: IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.BranchingExpressionGenerator.generateWhenExpression[LocalVariableDescriptor]

'irCondition' @ [117:102] ==> val irCondition: IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.BranchingExpressionGenerator.generateWhenExpression[LocalVariableDescriptor]

'statementGenerator' @ [121:34] ==> public final val statementGenerator: StatementGenerator defined in org.jetbrains.kotlin.psi2ir.generators.BranchingExpressionGenerator[PropertyDescriptorImpl]

'generateExpression' @ [121:53] ==> public final fun generateExpression(ktExpression: KtExpression): IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator[SimpleFunctionDescriptorImpl]

'ktEntry' @ [121:72] ==> val ktEntry: (KtWhenEntry..KtWhenEntry?) defined in org.jetbrains.kotlin.psi2ir.generators.BranchingExpressionGenerator.generateWhenExpression[LocalVariableDescriptor]

'expression' @ [121:80] ==> public final val KtWhenEntry.expression: KtExpression?[MyPropertyDescriptor]

'irWhen' @ [122:13] ==> val irWhen: IrWhenImpl defined in org.jetbrains.kotlin.psi2ir.generators.BranchingExpressionGenerator.generateWhenExpression[LocalVariableDescriptor]

'branches' @ [122:20] ==> public open val branches: MutableList<IrBranch> defined in org.jetbrains.kotlin.ir.expressions.impl.IrWhenImpl[DeserializedPropertyDescriptor]

'add' @ [122:29] ==> public abstract fun add(element: IrBranch): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'IrBranchImpl' @ [122:33] ==> public constructor IrBranchImpl(condition: IrExpression, result: IrExpression) defined in org.jetbrains.kotlin.ir.expressions.impl.IrBranchImpl[DeserializedClassConstructorDescriptor]

'irBranchCondition' @ [122:46] ==> var irBranchCondition: IrExpression? defined in org.jetbrains.kotlin.psi2ir.generators.BranchingExpressionGenerator.generateWhenExpression[LocalVariableDescriptor]

'irBranchResult' @ [122:67] ==> val irBranchResult: IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.BranchingExpressionGenerator.generateWhenExpression[LocalVariableDescriptor]

'addElseBranchForExhaustiveWhenIfNeeded' @ [124:9] ==> private final fun addElseBranchForExhaustiveWhenIfNeeded(irWhen: IrWhen, whenExpression: KtWhenExpression): Unit defined in org.jetbrains.kotlin.psi2ir.generators.BranchingExpressionGenerator[SimpleFunctionDescriptorImpl]

'irWhen' @ [124:48] ==> val irWhen: IrWhenImpl defined in org.jetbrains.kotlin.psi2ir.generators.BranchingExpressionGenerator.generateWhenExpression[LocalVariableDescriptor]

'expression' @ [124:56] ==> value-parameter expression: KtWhenExpression defined in org.jetbrains.kotlin.psi2ir.generators.BranchingExpressionGenerator.generateWhenExpression[ValueParameterDescriptorImpl]

'generateWhenBody' @ [126:16] ==> private final fun generateWhenBody(expression: KtWhenExpression, irSubject: IrVariable?, irWhen: IrWhen): IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.BranchingExpressionGenerator[SimpleFunctionDescriptorImpl]

'expression' @ [126:33] ==> value-parameter expression: KtWhenExpression defined in org.jetbrains.kotlin.psi2ir.generators.BranchingExpressionGenerator.generateWhenExpression[ValueParameterDescriptorImpl]

'irSubject' @ [126:45] ==> val irSubject: IrVariable? defined in org.jetbrains.kotlin.psi2ir.generators.BranchingExpressionGenerator.generateWhenExpression[LocalVariableDescriptor]

'irWhen' @ [126:56] ==> val irWhen: IrWhenImpl defined in org.jetbrains.kotlin.psi2ir.generators.BranchingExpressionGenerator.generateWhenExpression[LocalVariableDescriptor]

'irWhen' @ [130:13] ==> value-parameter irWhen: IrWhen defined in org.jetbrains.kotlin.psi2ir.generators.BranchingExpressionGenerator.addElseBranchForExhaustiveWhenIfNeeded[ValueParameterDescriptorImpl]

'branches' @ [130:20] ==> public abstract val branches: MutableList<IrBranch> defined in org.jetbrains.kotlin.ir.expressions.IrWhen[DeserializedPropertyDescriptor]

'filterIsInstance' @ [130:29] ==> public inline fun <reified R> Iterable<*>.filterIsInstance(): List<IrElseBranch> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> IrElseBranch

'isEmpty' @ [130:62] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'context' @ [131:34] ==> public open val context: GeneratorContext defined in org.jetbrains.kotlin.psi2ir.generators.BranchingExpressionGenerator[PropertyDescriptorImpl]

'bindingContext' @ [131:42] ==> public final val bindingContext: BindingContext defined in org.jetbrains.kotlin.psi2ir.generators.GeneratorContext[PropertyDescriptorImpl]

'==' @ [133:32] ==> public open fun equals(other: Any?): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'TRUE' @ [133:50] ==> public final val TRUE: (Boolean..Boolean?) defined in java.lang.Boolean[JavaPropertyDescriptor]

'bindingContext' @ [133:58] ==> val bindingContext: BindingContext defined in org.jetbrains.kotlin.psi2ir.generators.BranchingExpressionGenerator.addElseBranchForExhaustiveWhenIfNeeded[LocalVariableDescriptor]

'get' @ [133:73] ==> @Nullable public abstract operator fun <K : (Any..Any?), V : (Any..Any?)> get(p0: (ReadOnlySlice<(KtWhenExpression..KtWhenExpression?), (Boolean..Boolean?)>..ReadOnlySlice<(KtWhenExpression..KtWhenExpression?), (Boolean..Boolean?)>?), p1: (KtWhenExpression..KtWhenExpression?)): Boolean? defined in org.jetbrains.kotlin.resolve.BindingContext[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> KtWhenExpression
    <V : (Any..Any?)> -> Boolean

'IMPLICIT_EXHAUSTIVE_WHEN' @ [133:92] ==> public final val IMPLICIT_EXHAUSTIVE_WHEN: (WritableSlice<(KtWhenExpression..KtWhenExpression?), (Boolean..Boolean?)>..WritableSlice<(KtWhenExpression..KtWhenExpression?), (Boolean..Boolean?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'whenExpression' @ [133:118] ==> value-parameter whenExpression: KtWhenExpression defined in org.jetbrains.kotlin.psi2ir.generators.BranchingExpressionGenerator.addElseBranchForExhaustiveWhenIfNeeded[ValueParameterDescriptorImpl]

'==' @ [134:32] ==> public open fun equals(other: Any?): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'TRUE' @ [134:50] ==> public final val TRUE: (Boolean..Boolean?) defined in java.lang.Boolean[JavaPropertyDescriptor]

'bindingContext' @ [134:58] ==> val bindingContext: BindingContext defined in org.jetbrains.kotlin.psi2ir.generators.BranchingExpressionGenerator.addElseBranchForExhaustiveWhenIfNeeded[LocalVariableDescriptor]

'get' @ [134:73] ==> @Nullable public abstract operator fun <K : (Any..Any?), V : (Any..Any?)> get(p0: (ReadOnlySlice<(KtWhenExpression..KtWhenExpression?), (Boolean..Boolean?)>..ReadOnlySlice<(KtWhenExpression..KtWhenExpression?), (Boolean..Boolean?)>?), p1: (KtWhenExpression..KtWhenExpression?)): Boolean? defined in org.jetbrains.kotlin.resolve.BindingContext[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> KtWhenExpression
    <V : (Any..Any?)> -> Boolean

'EXHAUSTIVE_WHEN' @ [134:92] ==> public final val EXHAUSTIVE_WHEN: (WritableSlice<(KtWhenExpression..KtWhenExpression?), (Boolean..Boolean?)>..WritableSlice<(KtWhenExpression..KtWhenExpression?), (Boolean..Boolean?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'whenExpression' @ [134:109] ==> value-parameter whenExpression: KtWhenExpression defined in org.jetbrains.kotlin.psi2ir.generators.BranchingExpressionGenerator.addElseBranchForExhaustiveWhenIfNeeded[ValueParameterDescriptorImpl]

'isExhaustive' @ [136:17] ==> val isExhaustive: Boolean defined in org.jetbrains.kotlin.psi2ir.generators.BranchingExpressionGenerator.addElseBranchForExhaustiveWhenIfNeeded[LocalVariableDescriptor]

'IrCallImpl' @ [137:28] ==> public constructor IrCallImpl(startOffset: Int, endOffset: Int, symbol: IrFunctionSymbol) defined in org.jetbrains.kotlin.ir.expressions.impl.IrCallImpl[DeserializedClassConstructorDescriptor]

'UNDEFINED_OFFSET' @ [137:39] ==> public const val UNDEFINED_OFFSET: Int defined in org.jetbrains.kotlin.ir[DeserializedPropertyDescriptor]

'UNDEFINED_OFFSET' @ [137:57] ==> public const val UNDEFINED_OFFSET: Int defined in org.jetbrains.kotlin.ir[DeserializedPropertyDescriptor]

'context' @ [137:75] ==> public open val context: GeneratorContext defined in org.jetbrains.kotlin.psi2ir.generators.BranchingExpressionGenerator[PropertyDescriptorImpl]

'irBuiltIns' @ [137:83] ==> public final val irBuiltIns: IrBuiltIns defined in org.jetbrains.kotlin.psi2ir.generators.GeneratorContext[DeserializedPropertyDescriptor]

'noWhenBranchMatchedExceptionSymbol' @ [137:94] ==> public final val noWhenBranchMatchedExceptionSymbol: IrSimpleFunctionSymbol defined in org.jetbrains.kotlin.ir.descriptors.IrBuiltIns[DeserializedPropertyDescriptor]

'irWhen' @ [138:17] ==> value-parameter irWhen: IrWhen defined in org.jetbrains.kotlin.psi2ir.generators.BranchingExpressionGenerator.addElseBranchForExhaustiveWhenIfNeeded[ValueParameterDescriptorImpl]

'branches' @ [138:24] ==> public abstract val branches: MutableList<IrBranch> defined in org.jetbrains.kotlin.ir.expressions.IrWhen[DeserializedPropertyDescriptor]

'add' @ [138:33] ==> public abstract fun add(element: IrBranch): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'IrBranchImpl' @ [138:37] ==> public companion object defined in org.jetbrains.kotlin.ir.expressions.impl.IrBranchImpl[FakeCallableDescriptorForObject]

'elseBranch' @ [138:50] ==> public final fun elseBranch(result: IrExpression): IrElseBranchImpl defined in org.jetbrains.kotlin.ir.expressions.impl.IrBranchImpl.Companion[DeserializedSimpleFunctionDescriptor]

'call' @ [138:61] ==> val call: IrCallImpl defined in org.jetbrains.kotlin.psi2ir.generators.BranchingExpressionGenerator.addElseBranchForExhaustiveWhenIfNeeded[LocalVariableDescriptor]

'if (irSubject == null) {
            if (irWhen.branches.isEmpty())
                IrBlockImpl(expression.startOffset, expression.endOffset, context.builtIns.unitType, IrStatementOrigin.WHEN)
            else
                irWhen
        }
        else {
            if (irWhen.branches.isEmpty()) {
                val irBlock = IrBlockImpl(expression.startOffset, expression.endOffset, context.builtIns.unitType, IrStatementOrigin.WHEN)
                irBlock.statements.add(irSubject)
                irBlock
            }
            else {
                val irBlock = IrBlockImpl(expression.startOffset, expression.endOffset, irWhen.type, IrStatementOrigin.WHEN)
                irBlock.statements.add(irSubject)
                irBlock.statements.add(irWhen)
                irBlock
            }
        }' @ [144:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: IrExpression, elseBranch: IrExpression): IrExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> IrExpression

'irSubject' @ [144:20] ==> value-parameter irSubject: IrVariable? defined in org.jetbrains.kotlin.psi2ir.generators.BranchingExpressionGenerator.generateWhenBody[ValueParameterDescriptorImpl]

'if (irWhen.branches.isEmpty())
                IrBlockImpl(expression.startOffset, expression.endOffset, context.builtIns.unitType, IrStatementOrigin.WHEN)
            else
                irWhen' @ [145:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: IrExpression, elseBranch: IrExpression): IrExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> IrExpression

'irWhen' @ [145:17] ==> value-parameter irWhen: IrWhen defined in org.jetbrains.kotlin.psi2ir.generators.BranchingExpressionGenerator.generateWhenBody[ValueParameterDescriptorImpl]

'branches' @ [145:24] ==> public abstract val branches: MutableList<IrBranch> defined in org.jetbrains.kotlin.ir.expressions.IrWhen[DeserializedPropertyDescriptor]

'isEmpty' @ [145:33] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'IrBlockImpl' @ [146:17] ==> public constructor IrBlockImpl(startOffset: Int, endOffset: Int, type: KotlinType, origin: IrStatementOrigin? = ...) defined in org.jetbrains.kotlin.ir.expressions.impl.IrBlockImpl[DeserializedClassConstructorDescriptor]

'expression' @ [146:29] ==> value-parameter expression: KtWhenExpression defined in org.jetbrains.kotlin.psi2ir.generators.BranchingExpressionGenerator.generateWhenBody[ValueParameterDescriptorImpl]

'startOffset' @ [146:40] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'expression' @ [146:53] ==> value-parameter expression: KtWhenExpression defined in org.jetbrains.kotlin.psi2ir.generators.BranchingExpressionGenerator.generateWhenBody[ValueParameterDescriptorImpl]

'endOffset' @ [146:64] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'context' @ [146:75] ==> public open val context: GeneratorContext defined in org.jetbrains.kotlin.psi2ir.generators.BranchingExpressionGenerator[PropertyDescriptorImpl]

'builtIns' @ [146:83] ==> public final val builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.psi2ir.generators.GeneratorContext[DeserializedPropertyDescriptor]

'unitType' @ [146:92] ==> public final val KotlinBuiltIns.unitType: SimpleType[MyPropertyDescriptor]

'WHEN' @ [146:120] ==> public object WHEN : IrStatementOriginImpl defined in org.jetbrains.kotlin.ir.expressions.IrStatementOrigin[FakeCallableDescriptorForObject]

'irWhen' @ [148:17] ==> value-parameter irWhen: IrWhen defined in org.jetbrains.kotlin.psi2ir.generators.BranchingExpressionGenerator.generateWhenBody[ValueParameterDescriptorImpl]

'if (irWhen.branches.isEmpty()) {
                val irBlock = IrBlockImpl(expression.startOffset, expression.endOffset, context.builtIns.unitType, IrStatementOrigin.WHEN)
                irBlock.statements.add(irSubject)
                irBlock
            }
            else {
                val irBlock = IrBlockImpl(expression.startOffset, expression.endOffset, irWhen.type, IrStatementOrigin.WHEN)
                irBlock.statements.add(irSubject)
                irBlock.statements.add(irWhen)
                irBlock
            }' @ [151:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: IrBlockImpl, elseBranch: IrBlockImpl): IrBlockImpl[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> IrBlockImpl

'irWhen' @ [151:17] ==> value-parameter irWhen: IrWhen defined in org.jetbrains.kotlin.psi2ir.generators.BranchingExpressionGenerator.generateWhenBody[ValueParameterDescriptorImpl]

'branches' @ [151:24] ==> public abstract val branches: MutableList<IrBranch> defined in org.jetbrains.kotlin.ir.expressions.IrWhen[DeserializedPropertyDescriptor]

'isEmpty' @ [151:33] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'IrBlockImpl' @ [152:31] ==> public constructor IrBlockImpl(startOffset: Int, endOffset: Int, type: KotlinType, origin: IrStatementOrigin? = ...) defined in org.jetbrains.kotlin.ir.expressions.impl.IrBlockImpl[DeserializedClassConstructorDescriptor]

'expression' @ [152:43] ==> value-parameter expression: KtWhenExpression defined in org.jetbrains.kotlin.psi2ir.generators.BranchingExpressionGenerator.generateWhenBody[ValueParameterDescriptorImpl]

'startOffset' @ [152:54] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'expression' @ [152:67] ==> value-parameter expression: KtWhenExpression defined in org.jetbrains.kotlin.psi2ir.generators.BranchingExpressionGenerator.generateWhenBody[ValueParameterDescriptorImpl]

'endOffset' @ [152:78] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'context' @ [152:89] ==> public open val context: GeneratorContext defined in org.jetbrains.kotlin.psi2ir.generators.BranchingExpressionGenerator[PropertyDescriptorImpl]

'builtIns' @ [152:97] ==> public final val builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.psi2ir.generators.GeneratorContext[DeserializedPropertyDescriptor]

'unitType' @ [152:106] ==> public final val KotlinBuiltIns.unitType: SimpleType[MyPropertyDescriptor]

'WHEN' @ [152:134] ==> public object WHEN : IrStatementOriginImpl defined in org.jetbrains.kotlin.ir.expressions.IrStatementOrigin[FakeCallableDescriptorForObject]

'irBlock' @ [153:17] ==> val irBlock: IrBlockImpl defined in org.jetbrains.kotlin.psi2ir.generators.BranchingExpressionGenerator.generateWhenBody[LocalVariableDescriptor]

'statements' @ [153:25] ==> public open val statements: MutableList<IrStatement> defined in org.jetbrains.kotlin.ir.expressions.impl.IrBlockImpl[DeserializedPropertyDescriptor]

'add' @ [153:36] ==> public abstract fun add(element: IrStatement): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'irSubject' @ [153:40] ==> value-parameter irSubject: IrVariable? defined in org.jetbrains.kotlin.psi2ir.generators.BranchingExpressionGenerator.generateWhenBody[ValueParameterDescriptorImpl]

'irBlock' @ [154:17] ==> val irBlock: IrBlockImpl defined in org.jetbrains.kotlin.psi2ir.generators.BranchingExpressionGenerator.generateWhenBody[LocalVariableDescriptor]

'IrBlockImpl' @ [157:31] ==> public constructor IrBlockImpl(startOffset: Int, endOffset: Int, type: KotlinType, origin: IrStatementOrigin? = ...) defined in org.jetbrains.kotlin.ir.expressions.impl.IrBlockImpl[DeserializedClassConstructorDescriptor]

'expression' @ [157:43] ==> value-parameter expression: KtWhenExpression defined in org.jetbrains.kotlin.psi2ir.generators.BranchingExpressionGenerator.generateWhenBody[ValueParameterDescriptorImpl]

'startOffset' @ [157:54] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'expression' @ [157:67] ==> value-parameter expression: KtWhenExpression defined in org.jetbrains.kotlin.psi2ir.generators.BranchingExpressionGenerator.generateWhenBody[ValueParameterDescriptorImpl]

'endOffset' @ [157:78] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'irWhen' @ [157:89] ==> value-parameter irWhen: IrWhen defined in org.jetbrains.kotlin.psi2ir.generators.BranchingExpressionGenerator.generateWhenBody[ValueParameterDescriptorImpl]

'type' @ [157:96] ==> public abstract val type: KotlinType defined in org.jetbrains.kotlin.ir.expressions.IrWhen[DeserializedPropertyDescriptor]

'WHEN' @ [157:120] ==> public object WHEN : IrStatementOriginImpl defined in org.jetbrains.kotlin.ir.expressions.IrStatementOrigin[FakeCallableDescriptorForObject]

'irBlock' @ [158:17] ==> val irBlock: IrBlockImpl defined in org.jetbrains.kotlin.psi2ir.generators.BranchingExpressionGenerator.generateWhenBody[LocalVariableDescriptor]

'statements' @ [158:25] ==> public open val statements: MutableList<IrStatement> defined in org.jetbrains.kotlin.ir.expressions.impl.IrBlockImpl[DeserializedPropertyDescriptor]

'add' @ [158:36] ==> public abstract fun add(element: IrStatement): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'irSubject' @ [158:40] ==> value-parameter irSubject: IrVariable? defined in org.jetbrains.kotlin.psi2ir.generators.BranchingExpressionGenerator.generateWhenBody[ValueParameterDescriptorImpl]

'irBlock' @ [159:17] ==> val irBlock: IrBlockImpl defined in org.jetbrains.kotlin.psi2ir.generators.BranchingExpressionGenerator.generateWhenBody[LocalVariableDescriptor]

'statements' @ [159:25] ==> public open val statements: MutableList<IrStatement> defined in org.jetbrains.kotlin.ir.expressions.impl.IrBlockImpl[DeserializedPropertyDescriptor]

'add' @ [159:36] ==> public abstract fun add(element: IrStatement): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'irWhen' @ [159:40] ==> value-parameter irWhen: IrWhen defined in org.jetbrains.kotlin.psi2ir.generators.BranchingExpressionGenerator.generateWhenBody[ValueParameterDescriptorImpl]

'irBlock' @ [160:17] ==> val irBlock: IrBlockImpl defined in org.jetbrains.kotlin.psi2ir.generators.BranchingExpressionGenerator.generateWhenBody[LocalVariableDescriptor]

'statementGenerator' @ [166:13] ==> public final val statementGenerator: StatementGenerator defined in org.jetbrains.kotlin.psi2ir.generators.BranchingExpressionGenerator[PropertyDescriptorImpl]

'generateExpression' @ [166:32] ==> public final fun generateExpression(ktExpression: KtExpression): IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator[SimpleFunctionDescriptorImpl]

'!!' @ [166:51] ==> public final fun <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-EXCLEXCL-RESOLVE>`(baseExpr: KtExpression?): KtExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> -> KtExpression

'ktCondition' @ [166:52] ==> value-parameter ktCondition: KtWhenCondition defined in org.jetbrains.kotlin.psi2ir.generators.BranchingExpressionGenerator.generateWhenConditionNoSubject[ValueParameterDescriptorImpl]

'expression' @ [166:98] ==> public final val KtWhenConditionWithExpression.expression: KtExpression?[MyPropertyDescriptor]

'when (ktCondition) {
            is KtWhenConditionWithExpression ->
                generateEqualsCondition(irSubject, ktCondition)
            is KtWhenConditionInRange ->
                generateInRangeCondition(irSubject, ktCondition)
            is KtWhenConditionIsPattern ->
                generateIsPatternCondition(irSubject, ktCondition)
            else ->
                throw AssertionError("Unexpected 'when' condition: ${ktCondition.text}")
        }' @ [169:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: IrExpression, entry1: IrExpression, entry2: IrExpression, entry3: IrExpression): IrExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> IrExpression

'ktCondition' @ [169:22] ==> value-parameter ktCondition: KtWhenCondition defined in org.jetbrains.kotlin.psi2ir.generators.BranchingExpressionGenerator.generateWhenConditionWithSubject[ValueParameterDescriptorImpl]

'generateEqualsCondition' @ [171:17] ==> private final fun generateEqualsCondition(irSubject: IrVariable, ktCondition: KtWhenConditionWithExpression): IrBinaryPrimitiveImpl defined in org.jetbrains.kotlin.psi2ir.generators.BranchingExpressionGenerator[SimpleFunctionDescriptorImpl]

'irSubject' @ [171:41] ==> value-parameter irSubject: IrVariable defined in org.jetbrains.kotlin.psi2ir.generators.BranchingExpressionGenerator.generateWhenConditionWithSubject[ValueParameterDescriptorImpl]

'ktCondition' @ [171:52] ==> value-parameter ktCondition: KtWhenCondition defined in org.jetbrains.kotlin.psi2ir.generators.BranchingExpressionGenerator.generateWhenConditionWithSubject[ValueParameterDescriptorImpl]

'generateInRangeCondition' @ [173:17] ==> private final fun generateInRangeCondition(irSubject: IrVariable, ktCondition: KtWhenConditionInRange): IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.BranchingExpressionGenerator[SimpleFunctionDescriptorImpl]

'irSubject' @ [173:42] ==> value-parameter irSubject: IrVariable defined in org.jetbrains.kotlin.psi2ir.generators.BranchingExpressionGenerator.generateWhenConditionWithSubject[ValueParameterDescriptorImpl]

'ktCondition' @ [173:53] ==> value-parameter ktCondition: KtWhenCondition defined in org.jetbrains.kotlin.psi2ir.generators.BranchingExpressionGenerator.generateWhenConditionWithSubject[ValueParameterDescriptorImpl]

'generateIsPatternCondition' @ [175:17] ==> private final fun generateIsPatternCondition(irSubject: IrVariable, ktCondition: KtWhenConditionIsPattern): IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.BranchingExpressionGenerator[SimpleFunctionDescriptorImpl]

'irSubject' @ [175:44] ==> value-parameter irSubject: IrVariable defined in org.jetbrains.kotlin.psi2ir.generators.BranchingExpressionGenerator.generateWhenConditionWithSubject[ValueParameterDescriptorImpl]

'ktCondition' @ [175:55] ==> value-parameter ktCondition: KtWhenCondition defined in org.jetbrains.kotlin.psi2ir.generators.BranchingExpressionGenerator.generateWhenConditionWithSubject[ValueParameterDescriptorImpl]

'AssertionError' @ [177:23] ==> public final fun <init>(p0: (Any..Any?)): AssertionError /* = AssertionError */ defined in kotlin.AssertionError[TypeAliasConstructorDescriptorImpl]

'ktCondition' @ [177:70] ==> value-parameter ktCondition: KtWhenCondition defined in org.jetbrains.kotlin.psi2ir.generators.BranchingExpressionGenerator.generateWhenConditionWithSubject[ValueParameterDescriptorImpl]

'text' @ [177:82] ==> public final val KtWhenCondition.text: (String..String?)[MyPropertyDescriptor]

'getOrFail' @ [182:22] ==> public fun <K, V : Any> Generator.getOrFail(slice: ReadOnlySlice<(KtTypeReference..KtTypeReference?), (KotlinType..KotlinType?)>, key: (KtTypeReference..KtTypeReference?)): (KotlinType..KotlinType?) defined in org.jetbrains.kotlin.psi2ir.generators[SimpleFunctionDescriptorImpl]
Inferred types:
    <K> -> (org.jetbrains.kotlin.psi.KtTypeReference..org.jetbrains.kotlin.psi.KtTypeReference?)
    <V : Any> -> (org.jetbrains.kotlin.types.KotlinType..org.jetbrains.kotlin.types.KotlinType?)

'TYPE' @ [182:47] ==> public final val TYPE: (WritableSlice<(KtTypeReference..KtTypeReference?), (KotlinType..KotlinType?)>..WritableSlice<(KtTypeReference..KtTypeReference?), (KotlinType..KotlinType?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'ktCondition' @ [182:53] ==> value-parameter ktCondition: KtWhenConditionIsPattern defined in org.jetbrains.kotlin.psi2ir.generators.BranchingExpressionGenerator.generateIsPatternCondition[ValueParameterDescriptorImpl]

'typeReference' @ [182:65] ==> public final val KtWhenConditionIsPattern.typeReference: KtTypeReference?[MyPropertyDescriptor]

'IrTypeOperatorCallImpl' @ [183:16] ==> public constructor IrTypeOperatorCallImpl(startOffset: Int, endOffset: Int, type: KotlinType, operator: IrTypeOperator, typeOperand: KotlinType, argument: IrExpression) defined in org.jetbrains.kotlin.ir.expressions.impl.IrTypeOperatorCallImpl[DeserializedClassConstructorDescriptor]

'ktCondition' @ [184:17] ==> value-parameter ktCondition: KtWhenConditionIsPattern defined in org.jetbrains.kotlin.psi2ir.generators.BranchingExpressionGenerator.generateIsPatternCondition[ValueParameterDescriptorImpl]

'startOffset' @ [184:29] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'ktCondition' @ [184:42] ==> value-parameter ktCondition: KtWhenConditionIsPattern defined in org.jetbrains.kotlin.psi2ir.generators.BranchingExpressionGenerator.generateIsPatternCondition[ValueParameterDescriptorImpl]

'endOffset' @ [184:54] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'context' @ [184:65] ==> public open val context: GeneratorContext defined in org.jetbrains.kotlin.psi2ir.generators.BranchingExpressionGenerator[PropertyDescriptorImpl]

'builtIns' @ [184:73] ==> public final val builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.psi2ir.generators.GeneratorContext[DeserializedPropertyDescriptor]

'booleanType' @ [184:82] ==> public final val KotlinBuiltIns.booleanType: SimpleType[MyPropertyDescriptor]

'INSTANCEOF' @ [185:32] ==> enum entry INSTANCEOF defined in org.jetbrains.kotlin.ir.expressions.IrTypeOperator[FakeCallableDescriptorForObject]

'isType' @ [185:44] ==> val isType: (KotlinType..KotlinType?) defined in org.jetbrains.kotlin.psi2ir.generators.BranchingExpressionGenerator.generateIsPatternCondition[LocalVariableDescriptor]

'irSubject' @ [185:52] ==> value-parameter irSubject: IrVariable defined in org.jetbrains.kotlin.psi2ir.generators.BranchingExpressionGenerator.generateIsPatternCondition[ValueParameterDescriptorImpl]

'defaultLoad' @ [185:62] ==> public fun IrVariable.defaultLoad(): IrExpression defined in org.jetbrains.kotlin.psi2ir in file IrUtils.kt[SimpleFunctionDescriptorImpl]

'statementGenerator' @ [190:22] ==> public final val statementGenerator: StatementGenerator defined in org.jetbrains.kotlin.psi2ir.generators.BranchingExpressionGenerator[PropertyDescriptorImpl]

'pregenerateCall' @ [190:41] ==> public fun StatementGenerator.pregenerateCall(resolvedCall: ResolvedCall<*>): CallBuilder defined in org.jetbrains.kotlin.psi2ir.generators in file ArgumentsGenerationUtils.kt[SimpleFunctionDescriptorImpl]

'getResolvedCall' @ [190:57] ==> public fun Generator.getResolvedCall(key: KtElement): ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.psi2ir.generators[SimpleFunctionDescriptorImpl]

'ktCondition' @ [190:73] ==> value-parameter ktCondition: KtWhenConditionInRange defined in org.jetbrains.kotlin.psi2ir.generators.BranchingExpressionGenerator.generateInRangeCondition[ValueParameterDescriptorImpl]

'operationReference' @ [190:85] ==> public final val KtWhenConditionInRange.operationReference: KtOperationReferenceExpression[MyPropertyDescriptor]

'inCall' @ [191:9] ==> val inCall: CallBuilder defined in org.jetbrains.kotlin.psi2ir.generators.BranchingExpressionGenerator.generateInRangeCondition[LocalVariableDescriptor]

'irValueArgumentsByIndex' @ [191:16] ==> public final val irValueArgumentsByIndex: Array<IrExpression?> defined in org.jetbrains.kotlin.psi2ir.intermediate.CallBuilder[PropertyDescriptorImpl]

'irSubject' @ [191:45] ==> value-parameter irSubject: IrVariable defined in org.jetbrains.kotlin.psi2ir.generators.BranchingExpressionGenerator.generateInRangeCondition[ValueParameterDescriptorImpl]

'defaultLoad' @ [191:55] ==> public fun IrVariable.defaultLoad(): IrExpression defined in org.jetbrains.kotlin.psi2ir in file IrUtils.kt[SimpleFunctionDescriptorImpl]

'getInfixOperator' @ [192:26] ==> public fun getInfixOperator(ktOperator: IElementType): IrStatementOrigin? defined in org.jetbrains.kotlin.psi2ir.generators in file OperatorConventions.kt[SimpleFunctionDescriptorImpl]

'ktCondition' @ [192:43] ==> value-parameter ktCondition: KtWhenConditionInRange defined in org.jetbrains.kotlin.psi2ir.generators.BranchingExpressionGenerator.generateInRangeCondition[ValueParameterDescriptorImpl]

'operationReference' @ [192:55] ==> public final val KtWhenConditionInRange.operationReference: KtOperationReferenceExpression[MyPropertyDescriptor]

'getReferencedNameElementType' @ [192:74] ==> public open fun getReferencedNameElementType(): IElementType defined in org.jetbrains.kotlin.psi.KtOperationReferenceExpression[DeserializedSimpleFunctionDescriptor]

'CallGenerator' @ [193:24] ==> public constructor CallGenerator(statementGenerator: StatementGenerator) defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator[ClassConstructorDescriptorImpl]

'statementGenerator' @ [193:38] ==> public final val statementGenerator: StatementGenerator defined in org.jetbrains.kotlin.psi2ir.generators.BranchingExpressionGenerator[PropertyDescriptorImpl]

'generateCall' @ [193:58] ==> public fun CallGenerator.generateCall(ktElement: KtElement, call: CallBuilder, origin: IrStatementOrigin? = ...): IrExpression defined in org.jetbrains.kotlin.psi2ir.generators[SimpleFunctionDescriptorImpl]

'ktCondition' @ [193:71] ==> value-parameter ktCondition: KtWhenConditionInRange defined in org.jetbrains.kotlin.psi2ir.generators.BranchingExpressionGenerator.generateInRangeCondition[ValueParameterDescriptorImpl]

'inCall' @ [193:84] ==> val inCall: CallBuilder defined in org.jetbrains.kotlin.psi2ir.generators.BranchingExpressionGenerator.generateInRangeCondition[LocalVariableDescriptor]

'inOperator' @ [193:92] ==> val inOperator: IrStatementOrigin? defined in org.jetbrains.kotlin.psi2ir.generators.BranchingExpressionGenerator.generateInRangeCondition[LocalVariableDescriptor]

'when (inOperator) {
            IrStatementOrigin.IN ->
                irInCall
            IrStatementOrigin.NOT_IN ->
                IrUnaryPrimitiveImpl(
                        ktCondition.startOffset, ktCondition.endOffset,
                        IrStatementOrigin.EXCL, context.irBuiltIns.booleanNotSymbol,
                        irInCall
                )
            else -> throw AssertionError("Expected 'in' or '!in', got $inOperator")
        }' @ [194:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: IrExpression, entry1: IrExpression, entry2: IrExpression): IrExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> IrExpression

'inOperator' @ [194:22] ==> val inOperator: IrStatementOrigin? defined in org.jetbrains.kotlin.psi2ir.generators.BranchingExpressionGenerator.generateInRangeCondition[LocalVariableDescriptor]

'IN' @ [195:31] ==> public object IN : IrStatementOriginImpl defined in org.jetbrains.kotlin.ir.expressions.IrStatementOrigin[FakeCallableDescriptorForObject]

'irInCall' @ [196:17] ==> val irInCall: IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.BranchingExpressionGenerator.generateInRangeCondition[LocalVariableDescriptor]

'NOT_IN' @ [197:31] ==> public object NOT_IN : IrStatementOriginImpl defined in org.jetbrains.kotlin.ir.expressions.IrStatementOrigin[FakeCallableDescriptorForObject]

'IrUnaryPrimitiveImpl' @ [198:17] ==> public constructor IrUnaryPrimitiveImpl(startOffset: Int, endOffset: Int, origin: IrStatementOrigin?, symbol: IrFunctionSymbol, argument: IrExpression) defined in org.jetbrains.kotlin.ir.expressions.impl.IrUnaryPrimitiveImpl[DeserializedClassConstructorDescriptor]

'ktCondition' @ [199:25] ==> value-parameter ktCondition: KtWhenConditionInRange defined in org.jetbrains.kotlin.psi2ir.generators.BranchingExpressionGenerator.generateInRangeCondition[ValueParameterDescriptorImpl]

'startOffset' @ [199:37] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'ktCondition' @ [199:50] ==> value-parameter ktCondition: KtWhenConditionInRange defined in org.jetbrains.kotlin.psi2ir.generators.BranchingExpressionGenerator.generateInRangeCondition[ValueParameterDescriptorImpl]

'endOffset' @ [199:62] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'EXCL' @ [200:43] ==> public object EXCL : IrStatementOriginImpl defined in org.jetbrains.kotlin.ir.expressions.IrStatementOrigin[FakeCallableDescriptorForObject]

'context' @ [200:49] ==> public open val context: GeneratorContext defined in org.jetbrains.kotlin.psi2ir.generators.BranchingExpressionGenerator[PropertyDescriptorImpl]

'irBuiltIns' @ [200:57] ==> public final val irBuiltIns: IrBuiltIns defined in org.jetbrains.kotlin.psi2ir.generators.GeneratorContext[DeserializedPropertyDescriptor]

'booleanNotSymbol' @ [200:68] ==> public final val booleanNotSymbol: IrSimpleFunctionSymbol defined in org.jetbrains.kotlin.ir.descriptors.IrBuiltIns[DeserializedPropertyDescriptor]

'irInCall' @ [201:25] ==> val irInCall: IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.BranchingExpressionGenerator.generateInRangeCondition[LocalVariableDescriptor]

'AssertionError' @ [203:27] ==> public final fun <init>(p0: (Any..Any?)): AssertionError /* = AssertionError */ defined in kotlin.AssertionError[TypeAliasConstructorDescriptorImpl]

'inOperator' @ [203:72] ==> val inOperator: IrStatementOrigin? defined in org.jetbrains.kotlin.psi2ir.generators.BranchingExpressionGenerator.generateInRangeCondition[LocalVariableDescriptor]

'IrBinaryPrimitiveImpl' @ [208:13] ==> public constructor IrBinaryPrimitiveImpl(startOffset: Int, endOffset: Int, origin: IrStatementOrigin?, symbol: IrFunctionSymbol, argument0: IrExpression, argument1: IrExpression) defined in org.jetbrains.kotlin.ir.expressions.impl.IrBinaryPrimitiveImpl[DeserializedClassConstructorDescriptor]

'ktCondition' @ [209:21] ==> value-parameter ktCondition: KtWhenConditionWithExpression defined in org.jetbrains.kotlin.psi2ir.generators.BranchingExpressionGenerator.generateEqualsCondition[ValueParameterDescriptorImpl]

'startOffset' @ [209:33] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'ktCondition' @ [209:46] ==> value-parameter ktCondition: KtWhenConditionWithExpression defined in org.jetbrains.kotlin.psi2ir.generators.BranchingExpressionGenerator.generateEqualsCondition[ValueParameterDescriptorImpl]

'endOffset' @ [209:58] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'EQEQ' @ [210:39] ==> public object EQEQ : IrStatementOriginImpl defined in org.jetbrains.kotlin.ir.expressions.IrStatementOrigin[FakeCallableDescriptorForObject]

'context' @ [210:45] ==> public open val context: GeneratorContext defined in org.jetbrains.kotlin.psi2ir.generators.BranchingExpressionGenerator[PropertyDescriptorImpl]

'irBuiltIns' @ [210:53] ==> public final val irBuiltIns: IrBuiltIns defined in org.jetbrains.kotlin.psi2ir.generators.GeneratorContext[DeserializedPropertyDescriptor]

'eqeqSymbol' @ [210:64] ==> public final val eqeqSymbol: IrSimpleFunctionSymbol defined in org.jetbrains.kotlin.ir.descriptors.IrBuiltIns[DeserializedPropertyDescriptor]

'irSubject' @ [211:21] ==> value-parameter irSubject: IrVariable defined in org.jetbrains.kotlin.psi2ir.generators.BranchingExpressionGenerator.generateEqualsCondition[ValueParameterDescriptorImpl]

'defaultLoad' @ [211:31] ==> public fun IrVariable.defaultLoad(): IrExpression defined in org.jetbrains.kotlin.psi2ir in file IrUtils.kt[SimpleFunctionDescriptorImpl]

'statementGenerator' @ [211:46] ==> public final val statementGenerator: StatementGenerator defined in org.jetbrains.kotlin.psi2ir.generators.BranchingExpressionGenerator[PropertyDescriptorImpl]

'generateExpression' @ [211:65] ==> public final fun generateExpression(ktExpression: KtExpression): IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator[SimpleFunctionDescriptorImpl]

'ktCondition' @ [211:84] ==> value-parameter ktCondition: KtWhenConditionWithExpression defined in org.jetbrains.kotlin.psi2ir.generators.BranchingExpressionGenerator.generateEqualsCondition[ValueParameterDescriptorImpl]

'expression' @ [211:96] ==> public final val KtWhenConditionWithExpression.expression: KtExpression?[MyPropertyDescriptor]

