'StatementGeneratorExtension' @ [32:73] ==> public constructor StatementGeneratorExtension(statementGenerator: StatementGenerator) defined in org.jetbrains.kotlin.psi2ir.generators.StatementGeneratorExtension[ClassConstructorDescriptorImpl]

'statementGenerator' @ [32:101] ==> value-parameter statementGenerator: StatementGenerator defined in org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator.<init>[ValueParameterDescriptorImpl]

'IrWhileLoopImpl' @ [34:22] ==> public constructor IrWhileLoopImpl(startOffset: Int, endOffset: Int, type: KotlinType, origin: IrStatementOrigin?) defined in org.jetbrains.kotlin.ir.expressions.impl.IrWhileLoopImpl[DeserializedClassConstructorDescriptor]

'ktWhile' @ [34:38] ==> value-parameter ktWhile: KtWhileExpression defined in org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator.generateWhileLoop[ValueParameterDescriptorImpl]

'startOffset' @ [34:46] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'ktWhile' @ [34:59] ==> value-parameter ktWhile: KtWhileExpression defined in org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator.generateWhileLoop[ValueParameterDescriptorImpl]

'endOffset' @ [34:67] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'context' @ [35:38] ==> public open val context: GeneratorContext defined in org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator[PropertyDescriptorImpl]

'builtIns' @ [35:46] ==> public final val builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.psi2ir.generators.GeneratorContext[DeserializedPropertyDescriptor]

'unitType' @ [35:55] ==> public final val KotlinBuiltIns.unitType: SimpleType[MyPropertyDescriptor]

'WHILE_LOOP' @ [35:83] ==> public object WHILE_LOOP : IrStatementOriginImpl defined in org.jetbrains.kotlin.ir.expressions.IrStatementOrigin[FakeCallableDescriptorForObject]

'irLoop' @ [37:9] ==> val irLoop: IrWhileLoopImpl defined in org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator.generateWhileLoop[LocalVariableDescriptor]

'condition' @ [37:16] ==> public open lateinit var condition: IrExpression defined in org.jetbrains.kotlin.ir.expressions.impl.IrWhileLoopImpl[DeserializedPropertyDescriptor]

'statementGenerator' @ [37:28] ==> public final val statementGenerator: StatementGenerator defined in org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator[PropertyDescriptorImpl]

'generateExpression' @ [37:47] ==> public final fun generateExpression(ktExpression: KtExpression): IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator[SimpleFunctionDescriptorImpl]

'ktWhile' @ [37:66] ==> value-parameter ktWhile: KtWhileExpression defined in org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator.generateWhileLoop[ValueParameterDescriptorImpl]

'condition' @ [37:74] ==> public final val KtWhileExpression.condition: KtExpression?[MyPropertyDescriptor]

'statementGenerator' @ [39:9] ==> public final val statementGenerator: StatementGenerator defined in org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator[PropertyDescriptorImpl]

'bodyGenerator' @ [39:28] ==> public final val bodyGenerator: BodyGenerator defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator[PropertyDescriptorImpl]

'putLoop' @ [39:42] ==> public final fun putLoop(expression: KtLoopExpression, irLoop: IrLoop): Unit defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator[SimpleFunctionDescriptorImpl]

'ktWhile' @ [39:50] ==> value-parameter ktWhile: KtWhileExpression defined in org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator.generateWhileLoop[ValueParameterDescriptorImpl]

'irLoop' @ [39:59] ==> val irLoop: IrWhileLoopImpl defined in org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator.generateWhileLoop[LocalVariableDescriptor]

'irLoop' @ [41:9] ==> val irLoop: IrWhileLoopImpl defined in org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator.generateWhileLoop[LocalVariableDescriptor]

'body' @ [41:16] ==> public open var body: IrExpression? defined in org.jetbrains.kotlin.ir.expressions.impl.IrWhileLoopImpl[DeserializedPropertyDescriptor]

'ktWhile' @ [41:23] ==> value-parameter ktWhile: KtWhileExpression defined in org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator.generateWhileLoop[ValueParameterDescriptorImpl]

'body' @ [41:31] ==> public final val KtWhileExpression.body: KtExpression?[MyPropertyDescriptor]

'let' @ [41:37] ==> @InlineOnly public inline fun <T, R> KtExpression.let(block: (KtExpression) -> IrExpression): IrExpression defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression
    <R> -> IrExpression

'if (ktLoopBody is KtBlockExpression)
                generateWhileLoopBody(ktLoopBody)
            else
                statementGenerator.generateExpression(ktLoopBody)' @ [42:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: IrExpression, elseBranch: IrExpression): IrExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> IrExpression

'ktLoopBody' @ [42:17] ==> value-parameter ktLoopBody: KtExpression defined in org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator.generateWhileLoop.<anonymous>[ValueParameterDescriptorImpl]

'generateWhileLoopBody' @ [43:17] ==> private final fun generateWhileLoopBody(ktLoopBody: KtBlockExpression): IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator[SimpleFunctionDescriptorImpl]

'ktLoopBody' @ [43:39] ==> value-parameter ktLoopBody: KtExpression defined in org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator.generateWhileLoop.<anonymous>[ValueParameterDescriptorImpl]

'statementGenerator' @ [45:17] ==> public final val statementGenerator: StatementGenerator defined in org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator[PropertyDescriptorImpl]

'generateExpression' @ [45:36] ==> public final fun generateExpression(ktExpression: KtExpression): IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator[SimpleFunctionDescriptorImpl]

'ktLoopBody' @ [45:55] ==> value-parameter ktLoopBody: KtExpression defined in org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator.generateWhileLoop.<anonymous>[ValueParameterDescriptorImpl]

'irLoop' @ [48:9] ==> val irLoop: IrWhileLoopImpl defined in org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator.generateWhileLoop[LocalVariableDescriptor]

'label' @ [48:16] ==> public open var label: String? defined in org.jetbrains.kotlin.ir.expressions.impl.IrWhileLoopImpl[DeserializedPropertyDescriptor]

'getLoopLabel' @ [48:24] ==> private final fun getLoopLabel(ktLoop: KtLoopExpression): String? defined in org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator[SimpleFunctionDescriptorImpl]

'ktWhile' @ [48:37] ==> value-parameter ktWhile: KtWhileExpression defined in org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator.generateWhileLoop[ValueParameterDescriptorImpl]

'irLoop' @ [50:16] ==> val irLoop: IrWhileLoopImpl defined in org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator.generateWhileLoop[LocalVariableDescriptor]

'IrDoWhileLoopImpl' @ [54:22] ==> public constructor IrDoWhileLoopImpl(startOffset: Int, endOffset: Int, type: KotlinType, origin: IrStatementOrigin?) defined in org.jetbrains.kotlin.ir.expressions.impl.IrDoWhileLoopImpl[DeserializedClassConstructorDescriptor]

'ktDoWhile' @ [54:40] ==> value-parameter ktDoWhile: KtDoWhileExpression defined in org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator.generateDoWhileLoop[ValueParameterDescriptorImpl]

'startOffset' @ [54:50] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'ktDoWhile' @ [54:63] ==> value-parameter ktDoWhile: KtDoWhileExpression defined in org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator.generateDoWhileLoop[ValueParameterDescriptorImpl]

'endOffset' @ [54:73] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'context' @ [55:40] ==> public open val context: GeneratorContext defined in org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator[PropertyDescriptorImpl]

'builtIns' @ [55:48] ==> public final val builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.psi2ir.generators.GeneratorContext[DeserializedPropertyDescriptor]

'unitType' @ [55:57] ==> public final val KotlinBuiltIns.unitType: SimpleType[MyPropertyDescriptor]

'DO_WHILE_LOOP' @ [55:85] ==> public object DO_WHILE_LOOP : IrStatementOriginImpl defined in org.jetbrains.kotlin.ir.expressions.IrStatementOrigin[FakeCallableDescriptorForObject]

'statementGenerator' @ [57:9] ==> public final val statementGenerator: StatementGenerator defined in org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator[PropertyDescriptorImpl]

'bodyGenerator' @ [57:28] ==> public final val bodyGenerator: BodyGenerator defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator[PropertyDescriptorImpl]

'putLoop' @ [57:42] ==> public final fun putLoop(expression: KtLoopExpression, irLoop: IrLoop): Unit defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator[SimpleFunctionDescriptorImpl]

'ktDoWhile' @ [57:50] ==> value-parameter ktDoWhile: KtDoWhileExpression defined in org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator.generateDoWhileLoop[ValueParameterDescriptorImpl]

'irLoop' @ [57:61] ==> val irLoop: IrDoWhileLoopImpl defined in org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator.generateDoWhileLoop[LocalVariableDescriptor]

'irLoop' @ [59:9] ==> val irLoop: IrDoWhileLoopImpl defined in org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator.generateDoWhileLoop[LocalVariableDescriptor]

'body' @ [59:16] ==> public open var body: IrExpression? defined in org.jetbrains.kotlin.ir.expressions.impl.IrDoWhileLoopImpl[DeserializedPropertyDescriptor]

'ktDoWhile' @ [59:23] ==> value-parameter ktDoWhile: KtDoWhileExpression defined in org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator.generateDoWhileLoop[ValueParameterDescriptorImpl]

'body' @ [59:33] ==> public final val KtDoWhileExpression.body: KtExpression?[MyPropertyDescriptor]

'let' @ [59:39] ==> @InlineOnly public inline fun <T, R> KtExpression.let(block: (KtExpression) -> IrExpression): IrExpression defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression
    <R> -> IrExpression

'if (ktLoopBody is KtBlockExpression)
                generateDoWhileLoopBody(ktLoopBody)
            else
                statementGenerator.generateExpression(ktLoopBody)' @ [60:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: IrExpression, elseBranch: IrExpression): IrExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> IrExpression

'ktLoopBody' @ [60:17] ==> value-parameter ktLoopBody: KtExpression defined in org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator.generateDoWhileLoop.<anonymous>[ValueParameterDescriptorImpl]

'generateDoWhileLoopBody' @ [61:17] ==> private final fun generateDoWhileLoopBody(ktLoopBody: KtBlockExpression): IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator[SimpleFunctionDescriptorImpl]

'ktLoopBody' @ [61:41] ==> value-parameter ktLoopBody: KtExpression defined in org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator.generateDoWhileLoop.<anonymous>[ValueParameterDescriptorImpl]

'statementGenerator' @ [63:17] ==> public final val statementGenerator: StatementGenerator defined in org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator[PropertyDescriptorImpl]

'generateExpression' @ [63:36] ==> public final fun generateExpression(ktExpression: KtExpression): IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator[SimpleFunctionDescriptorImpl]

'ktLoopBody' @ [63:55] ==> value-parameter ktLoopBody: KtExpression defined in org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator.generateDoWhileLoop.<anonymous>[ValueParameterDescriptorImpl]

'irLoop' @ [66:9] ==> val irLoop: IrDoWhileLoopImpl defined in org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator.generateDoWhileLoop[LocalVariableDescriptor]

'condition' @ [66:16] ==> public open lateinit var condition: IrExpression defined in org.jetbrains.kotlin.ir.expressions.impl.IrDoWhileLoopImpl[DeserializedPropertyDescriptor]

'statementGenerator' @ [66:28] ==> public final val statementGenerator: StatementGenerator defined in org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator[PropertyDescriptorImpl]

'generateExpression' @ [66:47] ==> public final fun generateExpression(ktExpression: KtExpression): IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator[SimpleFunctionDescriptorImpl]

'ktDoWhile' @ [66:66] ==> value-parameter ktDoWhile: KtDoWhileExpression defined in org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator.generateDoWhileLoop[ValueParameterDescriptorImpl]

'condition' @ [66:76] ==> public final val KtDoWhileExpression.condition: KtExpression?[MyPropertyDescriptor]

'irLoop' @ [68:9] ==> val irLoop: IrDoWhileLoopImpl defined in org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator.generateDoWhileLoop[LocalVariableDescriptor]

'label' @ [68:16] ==> public open var label: String? defined in org.jetbrains.kotlin.ir.expressions.impl.IrDoWhileLoopImpl[DeserializedPropertyDescriptor]

'getLoopLabel' @ [68:24] ==> private final fun getLoopLabel(ktLoop: KtLoopExpression): String? defined in org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator[SimpleFunctionDescriptorImpl]

'ktDoWhile' @ [68:37] ==> value-parameter ktDoWhile: KtDoWhileExpression defined in org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator.generateDoWhileLoop[ValueParameterDescriptorImpl]

'IrBlockImpl' @ [70:16] ==> public constructor IrBlockImpl(startOffset: Int, endOffset: Int, type: KotlinType, origin: IrStatementOrigin? = ...) defined in org.jetbrains.kotlin.ir.expressions.impl.IrBlockImpl[DeserializedClassConstructorDescriptor]

'ktDoWhile' @ [70:28] ==> value-parameter ktDoWhile: KtDoWhileExpression defined in org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator.generateDoWhileLoop[ValueParameterDescriptorImpl]

'startOffset' @ [70:38] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'ktDoWhile' @ [70:51] ==> value-parameter ktDoWhile: KtDoWhileExpression defined in org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator.generateDoWhileLoop[ValueParameterDescriptorImpl]

'endOffset' @ [70:61] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'context' @ [70:72] ==> public open val context: GeneratorContext defined in org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator[PropertyDescriptorImpl]

'builtIns' @ [70:80] ==> public final val builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.psi2ir.generators.GeneratorContext[DeserializedPropertyDescriptor]

'unitType' @ [70:89] ==> public final val KotlinBuiltIns.unitType: SimpleType[MyPropertyDescriptor]

'apply' @ [70:99] ==> @InlineOnly public inline fun <T> IrBlockImpl.apply(block: IrBlockImpl.() -> Unit): IrBlockImpl defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrBlockImpl

'statements' @ [71:13] ==> public open val statements: MutableList<IrStatement> defined in org.jetbrains.kotlin.ir.expressions.impl.IrBlockImpl[DeserializedPropertyDescriptor]

'add' @ [71:24] ==> public abstract fun add(element: IrStatement): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'irLoop' @ [71:28] ==> val irLoop: IrDoWhileLoopImpl defined in org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator.generateDoWhileLoop[LocalVariableDescriptor]

'IrBlockImpl' @ [76:13] ==> public constructor IrBlockImpl(startOffset: Int, endOffset: Int, type: KotlinType, origin: IrStatementOrigin?, statements: List<IrStatement>) defined in org.jetbrains.kotlin.ir.expressions.impl.IrBlockImpl[DeserializedClassConstructorDescriptor]

'ktLoopBody' @ [77:21] ==> value-parameter ktLoopBody: KtBlockExpression defined in org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator.generateWhileLoopBody[ValueParameterDescriptorImpl]

'startOffset' @ [77:32] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'ktLoopBody' @ [77:45] ==> value-parameter ktLoopBody: KtBlockExpression defined in org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator.generateWhileLoopBody[ValueParameterDescriptorImpl]

'endOffset' @ [77:56] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'context' @ [77:67] ==> public open val context: GeneratorContext defined in org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator[PropertyDescriptorImpl]

'builtIns' @ [77:75] ==> public final val builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.psi2ir.generators.GeneratorContext[DeserializedPropertyDescriptor]

'unitType' @ [77:84] ==> public final val KotlinBuiltIns.unitType: SimpleType[MyPropertyDescriptor]

'ktLoopBody' @ [78:21] ==> value-parameter ktLoopBody: KtBlockExpression defined in org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator.generateWhileLoopBody[ValueParameterDescriptorImpl]

'statements' @ [78:32] ==> public final val KtBlockExpression.statements: List<(KtExpression..KtExpression?)>[MyPropertyDescriptor]

'map' @ [78:43] ==> public inline fun <T, R> Iterable<(KtExpression..KtExpression?)>.map(transform: ((KtExpression..KtExpression?)) -> IrStatement): List<IrStatement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtExpression..org.jetbrains.kotlin.psi.KtExpression?)
    <R> -> IrStatement

'statementGenerator' @ [78:49] ==> public final val statementGenerator: StatementGenerator defined in org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator[PropertyDescriptorImpl]

'generateStatement' @ [78:68] ==> public final fun generateStatement(ktElement: KtElement): IrStatement defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator[SimpleFunctionDescriptorImpl]

'it' @ [78:86] ==> value-parameter it: (KtExpression..KtExpression?) defined in org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator.generateWhileLoopBody.<anonymous>[ValueParameterDescriptorImpl]

'IrCompositeImpl' @ [83:13] ==> public constructor IrCompositeImpl(startOffset: Int, endOffset: Int, type: KotlinType, origin: IrStatementOrigin?, statements: List<IrStatement>) defined in org.jetbrains.kotlin.ir.expressions.impl.IrCompositeImpl[DeserializedClassConstructorDescriptor]

'ktLoopBody' @ [84:21] ==> value-parameter ktLoopBody: KtBlockExpression defined in org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator.generateDoWhileLoopBody[ValueParameterDescriptorImpl]

'startOffset' @ [84:32] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'ktLoopBody' @ [84:45] ==> value-parameter ktLoopBody: KtBlockExpression defined in org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator.generateDoWhileLoopBody[ValueParameterDescriptorImpl]

'endOffset' @ [84:56] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'context' @ [84:67] ==> public open val context: GeneratorContext defined in org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator[PropertyDescriptorImpl]

'builtIns' @ [84:75] ==> public final val builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.psi2ir.generators.GeneratorContext[DeserializedPropertyDescriptor]

'unitType' @ [84:84] ==> public final val KotlinBuiltIns.unitType: SimpleType[MyPropertyDescriptor]

'ktLoopBody' @ [85:21] ==> value-parameter ktLoopBody: KtBlockExpression defined in org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator.generateDoWhileLoopBody[ValueParameterDescriptorImpl]

'statements' @ [85:32] ==> public final val KtBlockExpression.statements: List<(KtExpression..KtExpression?)>[MyPropertyDescriptor]

'map' @ [85:43] ==> public inline fun <T, R> Iterable<(KtExpression..KtExpression?)>.map(transform: ((KtExpression..KtExpression?)) -> IrStatement): List<IrStatement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtExpression..org.jetbrains.kotlin.psi.KtExpression?)
    <R> -> IrStatement

'statementGenerator' @ [85:49] ==> public final val statementGenerator: StatementGenerator defined in org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator[PropertyDescriptorImpl]

'generateStatement' @ [85:68] ==> public final fun generateStatement(ktElement: KtElement): IrStatement defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator[SimpleFunctionDescriptorImpl]

'it' @ [85:86] ==> value-parameter it: (KtExpression..KtExpression?) defined in org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator.generateDoWhileLoopBody.<anonymous>[ValueParameterDescriptorImpl]

'findParentLoop' @ [89:26] ==> private final fun findParentLoop(ktWithLabel: KtExpressionWithLabel): IrLoop? defined in org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator[SimpleFunctionDescriptorImpl]

'ktBreak' @ [89:41] ==> value-parameter ktBreak: KtBreakExpression defined in org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator.generateBreak[ValueParameterDescriptorImpl]

'ErrorExpressionGenerator' @ [90:33] ==> public constructor ErrorExpressionGenerator(statementGenerator: StatementGenerator) defined in org.jetbrains.kotlin.psi2ir.generators.ErrorExpressionGenerator[ClassConstructorDescriptorImpl]

'statementGenerator' @ [90:58] ==> public final val statementGenerator: StatementGenerator defined in org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator[PropertyDescriptorImpl]

'generateErrorExpression' @ [90:78] ==> public final fun generateErrorExpression(ktElement: KtElement, e: Exception /* = Exception */): IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.ErrorExpressionGenerator[SimpleFunctionDescriptorImpl]

'ktBreak' @ [91:34] ==> value-parameter ktBreak: KtBreakExpression defined in org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator.generateBreak[ValueParameterDescriptorImpl]

'RuntimeException' @ [91:43] ==> public final fun <init>(p0: (String..String?)): RuntimeException /* = RuntimeException */ defined in kotlin.RuntimeException[TypeAliasConstructorDescriptorImpl]

'ktBreak' @ [91:100] ==> value-parameter ktBreak: KtBreakExpression defined in org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator.generateBreak[ValueParameterDescriptorImpl]

'text' @ [91:108] ==> public final val KtBreakExpression.text: (String..String?)[MyPropertyDescriptor]

'IrBreakImpl' @ [92:16] ==> public constructor IrBreakImpl(startOffset: Int, endOffset: Int, type: KotlinType, loop: IrLoop) defined in org.jetbrains.kotlin.ir.expressions.impl.IrBreakImpl[DeserializedClassConstructorDescriptor]

'ktBreak' @ [92:28] ==> value-parameter ktBreak: KtBreakExpression defined in org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator.generateBreak[ValueParameterDescriptorImpl]

'startOffset' @ [92:36] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'ktBreak' @ [92:49] ==> value-parameter ktBreak: KtBreakExpression defined in org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator.generateBreak[ValueParameterDescriptorImpl]

'endOffset' @ [92:57] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'context' @ [92:68] ==> public open val context: GeneratorContext defined in org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator[PropertyDescriptorImpl]

'builtIns' @ [92:76] ==> public final val builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.psi2ir.generators.GeneratorContext[DeserializedPropertyDescriptor]

'nothingType' @ [92:85] ==> public final val KotlinBuiltIns.nothingType: SimpleType[MyPropertyDescriptor]

'parentLoop' @ [92:98] ==> val parentLoop: IrLoop defined in org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator.generateBreak[LocalVariableDescriptor]

'apply' @ [92:110] ==> @InlineOnly public inline fun <T> IrBreakImpl.apply(block: IrBreakImpl.() -> Unit): IrBreakImpl defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrBreakImpl

'label' @ [93:13] ==> public open var label: String? defined in org.jetbrains.kotlin.ir.expressions.impl.IrBreakImpl[DeserializedPropertyDescriptor]

'ktBreak' @ [93:21] ==> value-parameter ktBreak: KtBreakExpression defined in org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator.generateBreak[ValueParameterDescriptorImpl]

'getLabelName' @ [93:29] ==> public final fun getLabelName(): String? defined in org.jetbrains.kotlin.psi.KtBreakExpression[DeserializedSimpleFunctionDescriptor]

'findParentLoop' @ [98:26] ==> private final fun findParentLoop(ktWithLabel: KtExpressionWithLabel): IrLoop? defined in org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator[SimpleFunctionDescriptorImpl]

'ktContinue' @ [98:41] ==> value-parameter ktContinue: KtContinueExpression defined in org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator.generateContinue[ValueParameterDescriptorImpl]

'ErrorExpressionGenerator' @ [99:33] ==> public constructor ErrorExpressionGenerator(statementGenerator: StatementGenerator) defined in org.jetbrains.kotlin.psi2ir.generators.ErrorExpressionGenerator[ClassConstructorDescriptorImpl]

'statementGenerator' @ [99:58] ==> public final val statementGenerator: StatementGenerator defined in org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator[PropertyDescriptorImpl]

'generateErrorExpression' @ [99:78] ==> public final fun generateErrorExpression(ktElement: KtElement, e: Exception /* = Exception */): IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.ErrorExpressionGenerator[SimpleFunctionDescriptorImpl]

'ktContinue' @ [100:34] ==> value-parameter ktContinue: KtContinueExpression defined in org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator.generateContinue[ValueParameterDescriptorImpl]

'RuntimeException' @ [100:46] ==> public final fun <init>(p0: (String..String?)): RuntimeException /* = RuntimeException */ defined in kotlin.RuntimeException[TypeAliasConstructorDescriptorImpl]

'ktContinue' @ [100:106] ==> value-parameter ktContinue: KtContinueExpression defined in org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator.generateContinue[ValueParameterDescriptorImpl]

'text' @ [100:117] ==> public final val KtContinueExpression.text: (String..String?)[MyPropertyDescriptor]

'IrContinueImpl' @ [101:16] ==> public constructor IrContinueImpl(startOffset: Int, endOffset: Int, type: KotlinType, loop: IrLoop) defined in org.jetbrains.kotlin.ir.expressions.impl.IrContinueImpl[DeserializedClassConstructorDescriptor]

'ktContinue' @ [101:31] ==> value-parameter ktContinue: KtContinueExpression defined in org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator.generateContinue[ValueParameterDescriptorImpl]

'startOffset' @ [101:42] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'ktContinue' @ [101:55] ==> value-parameter ktContinue: KtContinueExpression defined in org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator.generateContinue[ValueParameterDescriptorImpl]

'endOffset' @ [101:66] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'context' @ [101:77] ==> public open val context: GeneratorContext defined in org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator[PropertyDescriptorImpl]

'builtIns' @ [101:85] ==> public final val builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.psi2ir.generators.GeneratorContext[DeserializedPropertyDescriptor]

'nothingType' @ [101:94] ==> public final val KotlinBuiltIns.nothingType: SimpleType[MyPropertyDescriptor]

'parentLoop' @ [101:107] ==> val parentLoop: IrLoop defined in org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator.generateContinue[LocalVariableDescriptor]

'apply' @ [101:119] ==> @InlineOnly public inline fun <T> IrContinueImpl.apply(block: IrContinueImpl.() -> Unit): IrContinueImpl defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrContinueImpl

'label' @ [102:13] ==> public open var label: String? defined in org.jetbrains.kotlin.ir.expressions.impl.IrContinueImpl[DeserializedPropertyDescriptor]

'ktContinue' @ [102:21] ==> value-parameter ktContinue: KtContinueExpression defined in org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator.generateContinue[ValueParameterDescriptorImpl]

'getLabelName' @ [102:32] ==> public final fun getLabelName(): String? defined in org.jetbrains.kotlin.psi.KtContinueExpression[DeserializedSimpleFunctionDescriptor]

'ktLoop' @ [107:14] ==> value-parameter ktLoop: KtLoopExpression defined in org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator.getLoopLabel[ValueParameterDescriptorImpl]

'parent' @ [107:21] ==> public final val KtLoopExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'getLabelName' @ [107:54] ==> public final fun getLabelName(): String? defined in org.jetbrains.kotlin.psi.KtLabeledExpression[DeserializedSimpleFunctionDescriptor]

'findParentLoop' @ [110:13] ==> private final fun findParentLoop(ktExpression: KtExpression, targetLabel: String?): IrLoop? defined in org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator[SimpleFunctionDescriptorImpl]

'ktWithLabel' @ [110:28] ==> value-parameter ktWithLabel: KtExpressionWithLabel defined in org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator.findParentLoop[ValueParameterDescriptorImpl]

'ktWithLabel' @ [110:41] ==> value-parameter ktWithLabel: KtExpressionWithLabel defined in org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator.findParentLoop[ValueParameterDescriptorImpl]

'getLabelName' @ [110:53] ==> public final fun getLabelName(): String? defined in org.jetbrains.kotlin.psi.KtExpressionWithLabel[DeserializedSimpleFunctionDescriptor]

'ktExpression' @ [113:37] ==> value-parameter ktExpression: KtExpression defined in org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator.findParentLoop[ValueParameterDescriptorImpl]

'finger' @ [114:16] ==> var finger: KtExpression? defined in org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator.findParentLoop[LocalVariableDescriptor]

'finger' @ [115:13] ==> var finger: KtExpression? defined in org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator.findParentLoop[LocalVariableDescriptor]

'finger' @ [115:22] ==> var finger: KtExpression? defined in org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator.findParentLoop[LocalVariableDescriptor]

'getParentOfType' @ [115:29] ==> public inline fun <reified T : PsiElement> PsiElement.getParentOfType(strict: Boolean): KtLoopExpression? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtLoopExpression

'finger' @ [116:17] ==> var finger: KtExpression? defined in org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator.findParentLoop[LocalVariableDescriptor]

'if (targetLabel == null) {
                return getLoop(finger) ?: continue
            }
            else {
                val parent = finger.parent
                if (parent is KtLabeledExpression) {
                    val label = parent.getLabelName()!!
                    if (targetLabel == label) {
                        return getLoop(finger) ?: continue
                    }
                }
            }' @ [119:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'targetLabel' @ [119:17] ==> value-parameter targetLabel: String? defined in org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator.findParentLoop[ValueParameterDescriptorImpl]

'getLoop' @ [120:24] ==> private final fun getLoop(ktLoop: KtLoopExpression): IrLoop? defined in org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator[SimpleFunctionDescriptorImpl]

'finger' @ [120:32] ==> var finger: KtExpression? defined in org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator.findParentLoop[LocalVariableDescriptor]

'finger' @ [123:30] ==> var finger: KtExpression? defined in org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator.findParentLoop[LocalVariableDescriptor]

'parent' @ [123:37] ==> public final val KtLoopExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'parent' @ [124:21] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator.findParentLoop[LocalVariableDescriptor]

'parent' @ [125:33] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator.findParentLoop[LocalVariableDescriptor]

'getLabelName' @ [125:40] ==> public final fun getLabelName(): String? defined in org.jetbrains.kotlin.psi.KtLabeledExpression[DeserializedSimpleFunctionDescriptor]

'targetLabel' @ [126:25] ==> value-parameter targetLabel: String? defined in org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator.findParentLoop[ValueParameterDescriptorImpl]

'label' @ [126:40] ==> val label: String defined in org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator.findParentLoop[LocalVariableDescriptor]

'getLoop' @ [127:32] ==> private final fun getLoop(ktLoop: KtLoopExpression): IrLoop? defined in org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator[SimpleFunctionDescriptorImpl]

'finger' @ [127:40] ==> var finger: KtExpression? defined in org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator.findParentLoop[LocalVariableDescriptor]

'statementGenerator' @ [136:16] ==> public final val statementGenerator: StatementGenerator defined in org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator[PropertyDescriptorImpl]

'bodyGenerator' @ [136:35] ==> public final val bodyGenerator: BodyGenerator defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator[PropertyDescriptorImpl]

'getLoop' @ [136:49] ==> public final fun getLoop(expression: KtExpression): IrLoop? defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator[SimpleFunctionDescriptorImpl]

'ktLoop' @ [136:57] ==> value-parameter ktLoop: KtLoopExpression defined in org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator.getLoop[ValueParameterDescriptorImpl]

'ktFor' @ [140:31] ==> value-parameter ktFor: KtForExpression defined in org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator.generateForLoop[ValueParameterDescriptorImpl]

'loopParameter' @ [140:37] ==> public final val KtForExpression.loopParameter: KtParameter?[MyPropertyDescriptor]

'ktFor' @ [141:46] ==> value-parameter ktFor: KtForExpression defined in org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator.generateForLoop[ValueParameterDescriptorImpl]

'destructuringDeclaration' @ [141:52] ==> public final val KtForExpression.destructuringDeclaration: KtDestructuringDeclaration?[MyPropertyDescriptor]

'ktLoopParameter' @ [142:13] ==> val ktLoopParameter: KtParameter? defined in org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator.generateForLoop[LocalVariableDescriptor]

'ktLoopDestructuringDeclaration' @ [142:40] ==> val ktLoopDestructuringDeclaration: KtDestructuringDeclaration? defined in org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator.generateForLoop[LocalVariableDescriptor]

'AssertionError' @ [143:19] ==> public final fun <init>(p0: (Any..Any?)): AssertionError /* = AssertionError */ defined in kotlin.AssertionError[TypeAliasConstructorDescriptorImpl]

'ktFor' @ [143:104] ==> value-parameter ktFor: KtForExpression defined in org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator.generateForLoop[ValueParameterDescriptorImpl]

'text' @ [143:110] ==> public final val KtForExpression.text: (String..String?)[MyPropertyDescriptor]

'ktFor' @ [146:27] ==> value-parameter ktFor: KtForExpression defined in org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator.generateForLoop[ValueParameterDescriptorImpl]

'loopRange' @ [146:33] ==> public final val KtForExpression.loopRange: KtExpression?[MyPropertyDescriptor]

'ktFor' @ [147:25] ==> value-parameter ktFor: KtForExpression defined in org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator.generateForLoop[ValueParameterDescriptorImpl]

'body' @ [147:31] ==> public final val KtForExpression.body: KtExpression?[MyPropertyDescriptor]

'getOrFail' @ [148:36] ==> public fun <K, V : Any> Generator.getOrFail(slice: ReadOnlySlice<(KtExpression..KtExpression?), (ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>..ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>?)>, key: (KtExpression..KtExpression?)): (ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>..ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>?) defined in org.jetbrains.kotlin.psi2ir.generators[SimpleFunctionDescriptorImpl]
Inferred types:
    <K> -> (org.jetbrains.kotlin.psi.KtExpression..org.jetbrains.kotlin.psi.KtExpression?)
    <V : Any> -> (org.jetbrains.kotlin.resolve.calls.model.ResolvedCall<(org.jetbrains.kotlin.descriptors.FunctionDescriptor..org.jetbrains.kotlin.descriptors.FunctionDescriptor?)>..org.jetbrains.kotlin.resolve.calls.model.ResolvedCall<(org.jetbrains.kotlin.descriptors.FunctionDescriptor..org.jetbrains.kotlin.descriptors.FunctionDescriptor?)>?)

'LOOP_RANGE_ITERATOR_RESOLVED_CALL' @ [148:61] ==> public final val LOOP_RANGE_ITERATOR_RESOLVED_CALL: (WritableSlice<(KtExpression..KtExpression?), (ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>..ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>?)>..WritableSlice<(KtExpression..KtExpression?), (ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>..ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'ktLoopRange' @ [148:96] ==> val ktLoopRange: KtExpression defined in org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator.generateForLoop[LocalVariableDescriptor]

'getOrFail' @ [149:35] ==> public fun <K, V : Any> Generator.getOrFail(slice: ReadOnlySlice<(KtExpression..KtExpression?), (ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>..ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>?)>, key: (KtExpression..KtExpression?)): (ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>..ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>?) defined in org.jetbrains.kotlin.psi2ir.generators[SimpleFunctionDescriptorImpl]
Inferred types:
    <K> -> (org.jetbrains.kotlin.psi.KtExpression..org.jetbrains.kotlin.psi.KtExpression?)
    <V : Any> -> (org.jetbrains.kotlin.resolve.calls.model.ResolvedCall<(org.jetbrains.kotlin.descriptors.FunctionDescriptor..org.jetbrains.kotlin.descriptors.FunctionDescriptor?)>..org.jetbrains.kotlin.resolve.calls.model.ResolvedCall<(org.jetbrains.kotlin.descriptors.FunctionDescriptor..org.jetbrains.kotlin.descriptors.FunctionDescriptor?)>?)

'LOOP_RANGE_HAS_NEXT_RESOLVED_CALL' @ [149:60] ==> public final val LOOP_RANGE_HAS_NEXT_RESOLVED_CALL: (WritableSlice<(KtExpression..KtExpression?), (ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>..ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>?)>..WritableSlice<(KtExpression..KtExpression?), (ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>..ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'ktLoopRange' @ [149:95] ==> val ktLoopRange: KtExpression defined in org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator.generateForLoop[LocalVariableDescriptor]

'getOrFail' @ [150:32] ==> public fun <K, V : Any> Generator.getOrFail(slice: ReadOnlySlice<(KtExpression..KtExpression?), (ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>..ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>?)>, key: (KtExpression..KtExpression?)): (ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>..ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>?) defined in org.jetbrains.kotlin.psi2ir.generators[SimpleFunctionDescriptorImpl]
Inferred types:
    <K> -> (org.jetbrains.kotlin.psi.KtExpression..org.jetbrains.kotlin.psi.KtExpression?)
    <V : Any> -> (org.jetbrains.kotlin.resolve.calls.model.ResolvedCall<(org.jetbrains.kotlin.descriptors.FunctionDescriptor..org.jetbrains.kotlin.descriptors.FunctionDescriptor?)>..org.jetbrains.kotlin.resolve.calls.model.ResolvedCall<(org.jetbrains.kotlin.descriptors.FunctionDescriptor..org.jetbrains.kotlin.descriptors.FunctionDescriptor?)>?)

'LOOP_RANGE_NEXT_RESOLVED_CALL' @ [150:57] ==> public final val LOOP_RANGE_NEXT_RESOLVED_CALL: (WritableSlice<(KtExpression..KtExpression?), (ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>..ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>?)>..WritableSlice<(KtExpression..KtExpression?), (ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>..ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'ktLoopRange' @ [150:88] ==> val ktLoopRange: KtExpression defined in org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator.generateForLoop[LocalVariableDescriptor]

'CallGenerator' @ [152:29] ==> public constructor CallGenerator(statementGenerator: StatementGenerator) defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator[ClassConstructorDescriptorImpl]

'statementGenerator' @ [152:43] ==> public final val statementGenerator: StatementGenerator defined in org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator[PropertyDescriptorImpl]

'IrBlockImpl' @ [154:26] ==> public constructor IrBlockImpl(startOffset: Int, endOffset: Int, type: KotlinType, origin: IrStatementOrigin? = ...) defined in org.jetbrains.kotlin.ir.expressions.impl.IrBlockImpl[DeserializedClassConstructorDescriptor]

'ktFor' @ [154:38] ==> value-parameter ktFor: KtForExpression defined in org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator.generateForLoop[ValueParameterDescriptorImpl]

'startOffset' @ [154:44] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'ktFor' @ [154:57] ==> value-parameter ktFor: KtForExpression defined in org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator.generateForLoop[ValueParameterDescriptorImpl]

'endOffset' @ [154:63] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'context' @ [154:74] ==> public open val context: GeneratorContext defined in org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator[PropertyDescriptorImpl]

'builtIns' @ [154:82] ==> public final val builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.psi2ir.generators.GeneratorContext[DeserializedPropertyDescriptor]

'unitType' @ [154:91] ==> public final val KotlinBuiltIns.unitType: SimpleType[MyPropertyDescriptor]

'FOR_LOOP' @ [154:119] ==> public object FOR_LOOP : IrStatementOriginImpl defined in org.jetbrains.kotlin.ir.expressions.IrStatementOrigin[FakeCallableDescriptorForObject]

'statementGenerator' @ [156:28] ==> public final val statementGenerator: StatementGenerator defined in org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator[PropertyDescriptorImpl]

'pregenerateCall' @ [156:47] ==> public fun StatementGenerator.pregenerateCall(resolvedCall: ResolvedCall<*>): CallBuilder defined in org.jetbrains.kotlin.psi2ir.generators in file ArgumentsGenerationUtils.kt[SimpleFunctionDescriptorImpl]

'iteratorResolvedCall' @ [156:63] ==> val iteratorResolvedCall: (ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>..ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>?) defined in org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator.generateForLoop[LocalVariableDescriptor]

'callGenerator' @ [157:30] ==> val callGenerator: CallGenerator defined in org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator.generateForLoop[LocalVariableDescriptor]

'generateCall' @ [157:44] ==> public fun CallGenerator.generateCall(ktElement: KtElement, call: CallBuilder, origin: IrStatementOrigin? = ...): IrExpression defined in org.jetbrains.kotlin.psi2ir.generators[SimpleFunctionDescriptorImpl]

'ktLoopRange' @ [157:57] ==> val ktLoopRange: KtExpression defined in org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator.generateForLoop[LocalVariableDescriptor]

'iteratorCall' @ [157:70] ==> val iteratorCall: CallBuilder defined in org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator.generateForLoop[LocalVariableDescriptor]

'FOR_LOOP_ITERATOR' @ [157:102] ==> public object FOR_LOOP_ITERATOR : IrStatementOriginImpl defined in org.jetbrains.kotlin.ir.expressions.IrStatementOrigin[FakeCallableDescriptorForObject]

'scope' @ [158:26] ==> public open val scope: Scope defined in org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator[PropertyDescriptorImpl]

'createTemporaryVariable' @ [158:32] ==> public final fun createTemporaryVariable(irExpression: IrExpression, nameHint: String? = ..., isMutable: Boolean = ..., origin: IrDeclarationOrigin = ...): IrVariable defined in org.jetbrains.kotlin.ir.builders.Scope[DeserializedSimpleFunctionDescriptor]

'irIteratorCall' @ [158:56] ==> val irIteratorCall: IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator.generateForLoop[LocalVariableDescriptor]

'FOR_LOOP_ITERATOR' @ [158:113] ==> public object FOR_LOOP_ITERATOR : IrDeclarationOriginImpl defined in org.jetbrains.kotlin.ir.declarations.IrDeclarationOrigin[FakeCallableDescriptorForObject]

'VariableLValue' @ [159:29] ==> public constructor VariableLValue(irVariable: IrVariable, origin: IrStatementOrigin? = ...) defined in org.jetbrains.kotlin.psi2ir.intermediate.VariableLValue[ClassConstructorDescriptorImpl]

'irIterator' @ [159:44] ==> val irIterator: IrVariable defined in org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator.generateForLoop[LocalVariableDescriptor]

'irForBlock' @ [160:9] ==> val irForBlock: IrBlockImpl defined in org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator.generateForLoop[LocalVariableDescriptor]

'statements' @ [160:20] ==> public open val statements: MutableList<IrStatement> defined in org.jetbrains.kotlin.ir.expressions.impl.IrBlockImpl[DeserializedPropertyDescriptor]

'add' @ [160:31] ==> public abstract fun add(element: IrStatement): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'irIterator' @ [160:35] ==> val irIterator: IrVariable defined in org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator.generateForLoop[LocalVariableDescriptor]

'IrWhileLoopImpl' @ [162:28] ==> public constructor IrWhileLoopImpl(startOffset: Int, endOffset: Int, type: KotlinType, origin: IrStatementOrigin?) defined in org.jetbrains.kotlin.ir.expressions.impl.IrWhileLoopImpl[DeserializedClassConstructorDescriptor]

'ktFor' @ [162:44] ==> value-parameter ktFor: KtForExpression defined in org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator.generateForLoop[ValueParameterDescriptorImpl]

'startOffset' @ [162:50] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'ktFor' @ [162:63] ==> value-parameter ktFor: KtForExpression defined in org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator.generateForLoop[ValueParameterDescriptorImpl]

'endOffset' @ [162:69] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'context' @ [162:80] ==> public open val context: GeneratorContext defined in org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator[PropertyDescriptorImpl]

'builtIns' @ [162:88] ==> public final val builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.psi2ir.generators.GeneratorContext[DeserializedPropertyDescriptor]

'unitType' @ [162:97] ==> public final val KotlinBuiltIns.unitType: SimpleType[MyPropertyDescriptor]

'FOR_LOOP_INNER_WHILE' @ [162:125] ==> public object FOR_LOOP_INNER_WHILE : IrStatementOriginImpl defined in org.jetbrains.kotlin.ir.expressions.IrStatementOrigin[FakeCallableDescriptorForObject]

'irInnerWhile' @ [163:9] ==> val irInnerWhile: IrWhileLoopImpl defined in org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator.generateForLoop[LocalVariableDescriptor]

'label' @ [163:22] ==> public open var label: String? defined in org.jetbrains.kotlin.ir.expressions.impl.IrWhileLoopImpl[DeserializedPropertyDescriptor]

'getLoopLabel' @ [163:30] ==> private final fun getLoopLabel(ktLoop: KtLoopExpression): String? defined in org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator[SimpleFunctionDescriptorImpl]

'ktFor' @ [163:43] ==> value-parameter ktFor: KtForExpression defined in org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator.generateForLoop[ValueParameterDescriptorImpl]

'statementGenerator' @ [164:9] ==> public final val statementGenerator: StatementGenerator defined in org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator[PropertyDescriptorImpl]

'bodyGenerator' @ [164:28] ==> public final val bodyGenerator: BodyGenerator defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator[PropertyDescriptorImpl]

'putLoop' @ [164:42] ==> public final fun putLoop(expression: KtLoopExpression, irLoop: IrLoop): Unit defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator[SimpleFunctionDescriptorImpl]

'ktFor' @ [164:50] ==> value-parameter ktFor: KtForExpression defined in org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator.generateForLoop[ValueParameterDescriptorImpl]

'irInnerWhile' @ [164:57] ==> val irInnerWhile: IrWhileLoopImpl defined in org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator.generateForLoop[LocalVariableDescriptor]

'irForBlock' @ [165:9] ==> val irForBlock: IrBlockImpl defined in org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator.generateForLoop[LocalVariableDescriptor]

'statements' @ [165:20] ==> public open val statements: MutableList<IrStatement> defined in org.jetbrains.kotlin.ir.expressions.impl.IrBlockImpl[DeserializedPropertyDescriptor]

'add' @ [165:31] ==> public abstract fun add(element: IrStatement): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'irInnerWhile' @ [165:35] ==> val irInnerWhile: IrWhileLoopImpl defined in org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator.generateForLoop[LocalVariableDescriptor]

'statementGenerator' @ [167:27] ==> public final val statementGenerator: StatementGenerator defined in org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator[PropertyDescriptorImpl]

'pregenerateCall' @ [167:46] ==> public fun StatementGenerator.pregenerateCall(resolvedCall: ResolvedCall<*>): CallBuilder defined in org.jetbrains.kotlin.psi2ir.generators in file ArgumentsGenerationUtils.kt[SimpleFunctionDescriptorImpl]

'hasNextResolvedCall' @ [167:62] ==> val hasNextResolvedCall: (ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>..ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>?) defined in org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator.generateForLoop[LocalVariableDescriptor]

'hasNextCall' @ [168:9] ==> val hasNextCall: CallBuilder defined in org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator.generateForLoop[LocalVariableDescriptor]

'setExplicitReceiverValue' @ [168:21] ==> public fun CallBuilder.setExplicitReceiverValue(explicitReceiverValue: IntermediateValue): Unit defined in org.jetbrains.kotlin.psi2ir.intermediate in file CallBuilder.kt[SimpleFunctionDescriptorImpl]

'iteratorValue' @ [168:46] ==> val iteratorValue: VariableLValue defined in org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator.generateForLoop[LocalVariableDescriptor]

'callGenerator' @ [169:29] ==> val callGenerator: CallGenerator defined in org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator.generateForLoop[LocalVariableDescriptor]

'generateCall' @ [169:43] ==> public fun CallGenerator.generateCall(ktElement: KtElement, call: CallBuilder, origin: IrStatementOrigin? = ...): IrExpression defined in org.jetbrains.kotlin.psi2ir.generators[SimpleFunctionDescriptorImpl]

'ktLoopRange' @ [169:56] ==> val ktLoopRange: KtExpression defined in org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator.generateForLoop[LocalVariableDescriptor]

'hasNextCall' @ [169:69] ==> val hasNextCall: CallBuilder defined in org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator.generateForLoop[LocalVariableDescriptor]

'FOR_LOOP_HAS_NEXT' @ [169:100] ==> public object FOR_LOOP_HAS_NEXT : IrStatementOriginImpl defined in org.jetbrains.kotlin.ir.expressions.IrStatementOrigin[FakeCallableDescriptorForObject]

'irInnerWhile' @ [170:9] ==> val irInnerWhile: IrWhileLoopImpl defined in org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator.generateForLoop[LocalVariableDescriptor]

'condition' @ [170:22] ==> public open lateinit var condition: IrExpression defined in org.jetbrains.kotlin.ir.expressions.impl.IrWhileLoopImpl[DeserializedPropertyDescriptor]

'irHasNextCall' @ [170:34] ==> val irHasNextCall: IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator.generateForLoop[LocalVariableDescriptor]

'IrBlockImpl' @ [172:27] ==> public constructor IrBlockImpl(startOffset: Int, endOffset: Int, type: KotlinType, origin: IrStatementOrigin? = ...) defined in org.jetbrains.kotlin.ir.expressions.impl.IrBlockImpl[DeserializedClassConstructorDescriptor]

'ktFor' @ [172:39] ==> value-parameter ktFor: KtForExpression defined in org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator.generateForLoop[ValueParameterDescriptorImpl]

'startOffset' @ [172:45] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'ktFor' @ [172:58] ==> value-parameter ktFor: KtForExpression defined in org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator.generateForLoop[ValueParameterDescriptorImpl]

'endOffset' @ [172:64] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'context' @ [172:75] ==> public open val context: GeneratorContext defined in org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator[PropertyDescriptorImpl]

'builtIns' @ [172:83] ==> public final val builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.psi2ir.generators.GeneratorContext[DeserializedPropertyDescriptor]

'unitType' @ [172:92] ==> public final val KotlinBuiltIns.unitType: SimpleType[MyPropertyDescriptor]

'FOR_LOOP_INNER_WHILE' @ [172:120] ==> public object FOR_LOOP_INNER_WHILE : IrStatementOriginImpl defined in org.jetbrains.kotlin.ir.expressions.IrStatementOrigin[FakeCallableDescriptorForObject]

'irInnerWhile' @ [173:9] ==> val irInnerWhile: IrWhileLoopImpl defined in org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator.generateForLoop[LocalVariableDescriptor]

'body' @ [173:22] ==> public open var body: IrExpression? defined in org.jetbrains.kotlin.ir.expressions.impl.IrWhileLoopImpl[DeserializedPropertyDescriptor]

'irInnerBody' @ [173:29] ==> val irInnerBody: IrBlockImpl defined in org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator.generateForLoop[LocalVariableDescriptor]

'statementGenerator' @ [175:24] ==> public final val statementGenerator: StatementGenerator defined in org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator[PropertyDescriptorImpl]

'pregenerateCall' @ [175:43] ==> public fun StatementGenerator.pregenerateCall(resolvedCall: ResolvedCall<*>): CallBuilder defined in org.jetbrains.kotlin.psi2ir.generators in file ArgumentsGenerationUtils.kt[SimpleFunctionDescriptorImpl]

'nextResolvedCall' @ [175:59] ==> val nextResolvedCall: (ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>..ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>?) defined in org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator.generateForLoop[LocalVariableDescriptor]

'nextCall' @ [176:9] ==> val nextCall: CallBuilder defined in org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator.generateForLoop[LocalVariableDescriptor]

'setExplicitReceiverValue' @ [176:18] ==> public fun CallBuilder.setExplicitReceiverValue(explicitReceiverValue: IntermediateValue): Unit defined in org.jetbrains.kotlin.psi2ir.intermediate in file CallBuilder.kt[SimpleFunctionDescriptorImpl]

'iteratorValue' @ [176:43] ==> val iteratorValue: VariableLValue defined in org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator.generateForLoop[LocalVariableDescriptor]

'callGenerator' @ [177:26] ==> val callGenerator: CallGenerator defined in org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator.generateForLoop[LocalVariableDescriptor]

'generateCall' @ [177:40] ==> public fun CallGenerator.generateCall(ktElement: KtElement, call: CallBuilder, origin: IrStatementOrigin? = ...): IrExpression defined in org.jetbrains.kotlin.psi2ir.generators[SimpleFunctionDescriptorImpl]

'ktLoopRange' @ [177:53] ==> val ktLoopRange: KtExpression defined in org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator.generateForLoop[LocalVariableDescriptor]

'nextCall' @ [177:66] ==> val nextCall: CallBuilder defined in org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator.generateForLoop[LocalVariableDescriptor]

'FOR_LOOP_NEXT' @ [177:94] ==> public object FOR_LOOP_NEXT : IrStatementOriginImpl defined in org.jetbrains.kotlin.ir.expressions.IrStatementOrigin[FakeCallableDescriptorForObject]

'if (ktLoopParameter != null && ktLoopDestructuringDeclaration == null)
                    context.symbolTable.declareVariable(
                            ktLoopParameter.startOffset, ktLoopParameter.endOffset, IrDeclarationOrigin.FOR_LOOP_VARIABLE,
                            getOrFail(BindingContext.VALUE_PARAMETER, ktLoopParameter),
                            irNextCall
                    )
                else
                    scope.createTemporaryVariable(irNextCall, "loop_parameter", origin = IrDeclarationOrigin.FOR_LOOP_IMPLICIT_VARIABLE)' @ [179:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: IrVariable, elseBranch: IrVariable): IrVariable[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> IrVariable

'ktLoopParameter' @ [179:21] ==> val ktLoopParameter: KtParameter? defined in org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator.generateForLoop[LocalVariableDescriptor]

'ktLoopDestructuringDeclaration' @ [179:48] ==> val ktLoopDestructuringDeclaration: KtDestructuringDeclaration? defined in org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator.generateForLoop[LocalVariableDescriptor]

'context' @ [180:21] ==> public open val context: GeneratorContext defined in org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator[PropertyDescriptorImpl]

'symbolTable' @ [180:29] ==> public final val symbolTable: SymbolTable defined in org.jetbrains.kotlin.psi2ir.generators.GeneratorContext[PropertyDescriptorImpl]

'declareVariable' @ [180:41] ==> public final fun declareVariable(startOffset: Int, endOffset: Int, origin: IrDeclarationOrigin, descriptor: VariableDescriptor, irInitializerExpression: IrExpression?): IrVariable defined in org.jetbrains.kotlin.ir.util.SymbolTable[DeserializedSimpleFunctionDescriptor]

'ktLoopParameter' @ [181:29] ==> val ktLoopParameter: KtParameter? defined in org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator.generateForLoop[LocalVariableDescriptor]

'startOffset' @ [181:45] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'ktLoopParameter' @ [181:58] ==> val ktLoopParameter: KtParameter? defined in org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator.generateForLoop[LocalVariableDescriptor]

'endOffset' @ [181:74] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'FOR_LOOP_VARIABLE' @ [181:105] ==> public object FOR_LOOP_VARIABLE : IrDeclarationOriginImpl defined in org.jetbrains.kotlin.ir.declarations.IrDeclarationOrigin[FakeCallableDescriptorForObject]

'getOrFail' @ [182:29] ==> public fun <K, V : Any> Generator.getOrFail(slice: ReadOnlySlice<(KtParameter..KtParameter?), (VariableDescriptor..VariableDescriptor?)>, key: (KtParameter..KtParameter?)): (VariableDescriptor..VariableDescriptor?) defined in org.jetbrains.kotlin.psi2ir.generators[SimpleFunctionDescriptorImpl]
Inferred types:
    <K> -> (org.jetbrains.kotlin.psi.KtParameter..org.jetbrains.kotlin.psi.KtParameter?)
    <V : Any> -> (org.jetbrains.kotlin.descriptors.VariableDescriptor..org.jetbrains.kotlin.descriptors.VariableDescriptor?)

'VALUE_PARAMETER' @ [182:54] ==> public final val VALUE_PARAMETER: (WritableSlice<(KtParameter..KtParameter?), (VariableDescriptor..VariableDescriptor?)>..WritableSlice<(KtParameter..KtParameter?), (VariableDescriptor..VariableDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'ktLoopParameter' @ [182:71] ==> val ktLoopParameter: KtParameter? defined in org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator.generateForLoop[LocalVariableDescriptor]

'irNextCall' @ [183:29] ==> val irNextCall: IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator.generateForLoop[LocalVariableDescriptor]

'scope' @ [186:21] ==> public open val scope: Scope defined in org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator[PropertyDescriptorImpl]

'createTemporaryVariable' @ [186:27] ==> public final fun createTemporaryVariable(irExpression: IrExpression, nameHint: String? = ..., isMutable: Boolean = ..., origin: IrDeclarationOrigin = ...): IrVariable defined in org.jetbrains.kotlin.ir.builders.Scope[DeserializedSimpleFunctionDescriptor]

'irNextCall' @ [186:51] ==> val irNextCall: IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator.generateForLoop[LocalVariableDescriptor]

'FOR_LOOP_IMPLICIT_VARIABLE' @ [186:110] ==> public object FOR_LOOP_IMPLICIT_VARIABLE : IrDeclarationOriginImpl defined in org.jetbrains.kotlin.ir.declarations.IrDeclarationOrigin[FakeCallableDescriptorForObject]

'irInnerBody' @ [187:9] ==> val irInnerBody: IrBlockImpl defined in org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator.generateForLoop[LocalVariableDescriptor]

'statements' @ [187:21] ==> public open val statements: MutableList<IrStatement> defined in org.jetbrains.kotlin.ir.expressions.impl.IrBlockImpl[DeserializedPropertyDescriptor]

'add' @ [187:32] ==> public abstract fun add(element: IrStatement): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'irLoopParameter' @ [187:36] ==> val irLoopParameter: IrVariable defined in org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator.generateForLoop[LocalVariableDescriptor]

'ktLoopDestructuringDeclaration' @ [189:13] ==> val ktLoopDestructuringDeclaration: KtDestructuringDeclaration? defined in org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator.generateForLoop[LocalVariableDescriptor]

'statementGenerator' @ [190:13] ==> public final val statementGenerator: StatementGenerator defined in org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator[PropertyDescriptorImpl]

'declareComponentVariablesInBlock' @ [190:32] ==> public final fun declareComponentVariablesInBlock(multiDeclaration: KtDestructuringDeclaration, irBlock: IrStatementContainer, containerValue: IntermediateValue): Unit defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator[SimpleFunctionDescriptorImpl]

'ktLoopDestructuringDeclaration' @ [190:65] ==> val ktLoopDestructuringDeclaration: KtDestructuringDeclaration? defined in org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator.generateForLoop[LocalVariableDescriptor]

'irInnerBody' @ [190:97] ==> val irInnerBody: IrBlockImpl defined in org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator.generateForLoop[LocalVariableDescriptor]

'VariableLValue' @ [190:110] ==> public constructor VariableLValue(irVariable: IrVariable, origin: IrStatementOrigin? = ...) defined in org.jetbrains.kotlin.psi2ir.intermediate.VariableLValue[ClassConstructorDescriptorImpl]

'irLoopParameter' @ [190:125] ==> val irLoopParameter: IrVariable defined in org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator.generateForLoop[LocalVariableDescriptor]

'ktForBody' @ [193:13] ==> val ktForBody: KtExpression? defined in org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator.generateForLoop[LocalVariableDescriptor]

'irInnerBody' @ [194:13] ==> val irInnerBody: IrBlockImpl defined in org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator.generateForLoop[LocalVariableDescriptor]

'statements' @ [194:25] ==> public open val statements: MutableList<IrStatement> defined in org.jetbrains.kotlin.ir.expressions.impl.IrBlockImpl[DeserializedPropertyDescriptor]

'add' @ [194:36] ==> public abstract fun add(element: IrStatement): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'statementGenerator' @ [194:40] ==> public final val statementGenerator: StatementGenerator defined in org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator[PropertyDescriptorImpl]

'generateExpression' @ [194:59] ==> public final fun generateExpression(ktExpression: KtExpression): IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator[SimpleFunctionDescriptorImpl]

'ktForBody' @ [194:78] ==> val ktForBody: KtExpression? defined in org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator.generateForLoop[LocalVariableDescriptor]

'irForBlock' @ [197:16] ==> val irForBlock: IrBlockImpl defined in org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator.generateForLoop[LocalVariableDescriptor]

