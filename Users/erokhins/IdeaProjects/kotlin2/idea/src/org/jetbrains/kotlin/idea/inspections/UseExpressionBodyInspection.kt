'AbstractKotlinInspection' @ [43:78] ==> public constructor AbstractKotlinInspection() defined in org.jetbrains.kotlin.idea.inspections.AbstractKotlinInspection[DeserializedClassConstructorDescriptor]

'this' @ [45:20] ==> public constructor UseExpressionBodyInspection(convertEmptyToUnit: Boolean) defined in org.jetbrains.kotlin.idea.inspections.UseExpressionBodyInspection[ClassConstructorDescriptorImpl]

'statusFor' @ [49:59] ==> private final fun statusFor(declaration: KtDeclarationWithBody): UseExpressionBodyInspection.Status? defined in org.jetbrains.kotlin.idea.inspections.UseExpressionBodyInspection[SimpleFunctionDescriptorImpl]

'declaration' @ [49:69] ==> value-parameter declaration: KtDeclarationWithBody defined in org.jetbrains.kotlin.idea.inspections.UseExpressionBodyInspection.isActiveFor[ValueParameterDescriptorImpl]

'declaration' @ [52:13] ==> value-parameter declaration: KtDeclarationWithBody defined in org.jetbrains.kotlin.idea.inspections.UseExpressionBodyInspection.statusFor[ValueParameterDescriptorImpl]

'declaration' @ [54:30] ==> value-parameter declaration: KtDeclarationWithBody defined in org.jetbrains.kotlin.idea.inspections.UseExpressionBodyInspection.statusFor[ValueParameterDescriptorImpl]

'findValueStatement' @ [54:42] ==> private final fun KtDeclarationWithBody.findValueStatement(): KtExpression? defined in org.jetbrains.kotlin.idea.inspections.UseExpressionBodyInspection[SimpleFunctionDescriptorImpl]

'valueStatement' @ [55:21] ==> val valueStatement: KtExpression defined in org.jetbrains.kotlin.idea.inspections.UseExpressionBodyInspection.statusFor[LocalVariableDescriptor]

'getValue' @ [55:36] ==> private final fun KtExpression.getValue(): KtExpression defined in org.jetbrains.kotlin.idea.inspections.UseExpressionBodyInspection[SimpleFunctionDescriptorImpl]

'value' @ [56:13] ==> val value: KtExpression defined in org.jetbrains.kotlin.idea.inspections.UseExpressionBodyInspection.statusFor[LocalVariableDescriptor]

'anyDescendantOfType' @ [56:19] ==> public inline fun <reified T : PsiElement> PsiElement.anyDescendantOfType(crossinline canGoInside: (PsiElement) -> Boolean, noinline predicate: (KtReturnExpression) -> Boolean = ...): Boolean defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtReturnExpression

'it' @ [57:33] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.inspections.UseExpressionBodyInspection.statusFor.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [57:61] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.inspections.UseExpressionBodyInspection.statusFor.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [57:87] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.inspections.UseExpressionBodyInspection.statusFor.<anonymous>[ValueParameterDescriptorImpl]

'valueStatement' @ [60:27] ==> val valueStatement: KtExpression defined in org.jetbrains.kotlin.idea.inspections.UseExpressionBodyInspection.statusFor[LocalVariableDescriptor]

'toHighlight' @ [60:42] ==> private final fun KtExpression.toHighlight(): PsiElement? defined in org.jetbrains.kotlin.idea.inspections.UseExpressionBodyInspection[SimpleFunctionDescriptorImpl]

'when {
            valueStatement !is KtReturnExpression -> Status(toHighlight, "block body", INFORMATION)
            valueStatement.returnedExpression is KtWhenExpression -> Status(toHighlight, "'return when'", GENERIC_ERROR_OR_WARNING)
            valueStatement.isOneLiner() -> Status(toHighlight, "one-line return", GENERIC_ERROR_OR_WARNING)
            else -> Status(toHighlight, "return", INFORMATION)
        }' @ [61:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: UseExpressionBodyInspection.Status?, entry1: UseExpressionBodyInspection.Status?, entry2: UseExpressionBodyInspection.Status?, entry3: UseExpressionBodyInspection.Status?): UseExpressionBodyInspection.Status?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Status?

'valueStatement' @ [62:13] ==> val valueStatement: KtExpression defined in org.jetbrains.kotlin.idea.inspections.UseExpressionBodyInspection.statusFor[LocalVariableDescriptor]

'Status' @ [62:54] ==> public constructor Status(toHighlight: PsiElement?, subject: String, highlightType: ProblemHighlightType) defined in org.jetbrains.kotlin.idea.inspections.UseExpressionBodyInspection.Status[ClassConstructorDescriptorImpl]

'toHighlight' @ [62:61] ==> val toHighlight: PsiElement? defined in org.jetbrains.kotlin.idea.inspections.UseExpressionBodyInspection.statusFor[LocalVariableDescriptor]

'INFORMATION' @ [62:88] ==> enum entry INFORMATION defined in com.intellij.codeInspection.ProblemHighlightType[FakeCallableDescriptorForObject]

'valueStatement' @ [63:13] ==> val valueStatement: KtExpression defined in org.jetbrains.kotlin.idea.inspections.UseExpressionBodyInspection.statusFor[LocalVariableDescriptor]

'returnedExpression' @ [63:28] ==> public final val KtReturnExpression.returnedExpression: KtExpression?[MyPropertyDescriptor]

'Status' @ [63:70] ==> public constructor Status(toHighlight: PsiElement?, subject: String, highlightType: ProblemHighlightType) defined in org.jetbrains.kotlin.idea.inspections.UseExpressionBodyInspection.Status[ClassConstructorDescriptorImpl]

'toHighlight' @ [63:77] ==> val toHighlight: PsiElement? defined in org.jetbrains.kotlin.idea.inspections.UseExpressionBodyInspection.statusFor[LocalVariableDescriptor]

'GENERIC_ERROR_OR_WARNING' @ [63:107] ==> enum entry GENERIC_ERROR_OR_WARNING defined in com.intellij.codeInspection.ProblemHighlightType[FakeCallableDescriptorForObject]

'valueStatement' @ [64:13] ==> val valueStatement: KtExpression defined in org.jetbrains.kotlin.idea.inspections.UseExpressionBodyInspection.statusFor[LocalVariableDescriptor]

'isOneLiner' @ [64:28] ==> internal fun KtExpression.isOneLiner(): Boolean defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations in file IfThenUtils.kt[SimpleFunctionDescriptorImpl]

'Status' @ [64:44] ==> public constructor Status(toHighlight: PsiElement?, subject: String, highlightType: ProblemHighlightType) defined in org.jetbrains.kotlin.idea.inspections.UseExpressionBodyInspection.Status[ClassConstructorDescriptorImpl]

'toHighlight' @ [64:51] ==> val toHighlight: PsiElement? defined in org.jetbrains.kotlin.idea.inspections.UseExpressionBodyInspection.statusFor[LocalVariableDescriptor]

'GENERIC_ERROR_OR_WARNING' @ [64:83] ==> enum entry GENERIC_ERROR_OR_WARNING defined in com.intellij.codeInspection.ProblemHighlightType[FakeCallableDescriptorForObject]

'Status' @ [65:21] ==> public constructor Status(toHighlight: PsiElement?, subject: String, highlightType: ProblemHighlightType) defined in org.jetbrains.kotlin.idea.inspections.UseExpressionBodyInspection.Status[ClassConstructorDescriptorImpl]

'toHighlight' @ [65:28] ==> val toHighlight: PsiElement? defined in org.jetbrains.kotlin.idea.inspections.UseExpressionBodyInspection.statusFor[LocalVariableDescriptor]

'INFORMATION' @ [65:51] ==> enum entry INFORMATION defined in com.intellij.codeInspection.ProblemHighlightType[FakeCallableDescriptorForObject]

'KtVisitorVoid' @ [70:22] ==> public constructor KtVisitorVoid() defined in org.jetbrains.kotlin.psi.KtVisitorVoid[JavaClassConstructorDescriptor]

'super' @ [72:21] ==> <this> defined in org.jetbrains.kotlin.idea.inspections.UseExpressionBodyInspection.buildVisitor.<no name provided>[LazyClassReceiverParameterDescriptor]

'visitDeclaration' @ [72:27] ==> public open fun visitDeclaration(@NotNull p0: KtDeclaration): Unit defined in org.jetbrains.kotlin.psi.KtVisitorVoid[JavaMethodDescriptor]

'declaration' @ [72:44] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.idea.inspections.UseExpressionBodyInspection.buildVisitor.<no name provided>.visitDeclaration[ValueParameterDescriptorImpl]

'declaration' @ [74:21] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.idea.inspections.UseExpressionBodyInspection.buildVisitor.<no name provided>.visitDeclaration[ValueParameterDescriptorImpl]

'component1' @ [75:26] ==> public final operator fun component1(): PsiElement? defined in org.jetbrains.kotlin.idea.inspections.UseExpressionBodyInspection.Status[SimpleFunctionDescriptorImpl]

'component2' @ [75:39] ==> public final operator fun component2(): String defined in org.jetbrains.kotlin.idea.inspections.UseExpressionBodyInspection.Status[SimpleFunctionDescriptorImpl]

'component3' @ [75:47] ==> public final operator fun component3(): ProblemHighlightType defined in org.jetbrains.kotlin.idea.inspections.UseExpressionBodyInspection.Status[SimpleFunctionDescriptorImpl]

'statusFor' @ [75:64] ==> private final fun statusFor(declaration: KtDeclarationWithBody): UseExpressionBodyInspection.Status? defined in org.jetbrains.kotlin.idea.inspections.UseExpressionBodyInspection[SimpleFunctionDescriptorImpl]

'declaration' @ [75:74] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.idea.inspections.UseExpressionBodyInspection.buildVisitor.<no name provided>.visitDeclaration[ValueParameterDescriptorImpl]

'holder' @ [77:45] ==> value-parameter holder: ProblemsHolder defined in org.jetbrains.kotlin.idea.inspections.UseExpressionBodyInspection.buildVisitor[ValueParameterDescriptorImpl]

'manager' @ [77:52] ==> public final val ProblemsHolder.manager: InspectionManager[MyPropertyDescriptor]

'createProblemDescriptor' @ [77:60] ==> @NotNull @Contract public abstract fun createProblemDescriptor(@NotNull p0: PsiElement, @Nullable p1: TextRange?, @NotNull @Nls p2: String, @NotNull p3: ProblemHighlightType, p4: Boolean, vararg p5: (LocalQuickFix..LocalQuickFix?)): ProblemDescriptor defined in com.intellij.codeInspection.InspectionManager[JavaMethodDescriptor]

'declaration' @ [78:29] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.idea.inspections.UseExpressionBodyInspection.buildVisitor.<no name provided>.visitDeclaration[ValueParameterDescriptorImpl]

'toHighlight' @ [79:29] ==> val toHighlight: PsiElement? defined in org.jetbrains.kotlin.idea.inspections.UseExpressionBodyInspection.buildVisitor.<no name provided>.visitDeclaration[LocalVariableDescriptor]

'textRange' @ [79:42] ==> public final val PsiElement.textRange: (TextRange..TextRange?)[MyPropertyDescriptor]

'shiftRight' @ [79:53] ==> @NotNull public open fun shiftRight(p0: Int): TextRange defined in com.intellij.openapi.util.TextRange[JavaMethodDescriptor]

'-' @ [79:64] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'declaration' @ [79:65] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.idea.inspections.UseExpressionBodyInspection.buildVisitor.<no name provided>.visitDeclaration[ValueParameterDescriptorImpl]

'startOffset' @ [79:77] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'suffix' @ [80:62] ==> val suffix: String defined in org.jetbrains.kotlin.idea.inspections.UseExpressionBodyInspection.buildVisitor.<no name provided>.visitDeclaration[LocalVariableDescriptor]

'highlightType' @ [81:29] ==> val highlightType: ProblemHighlightType defined in org.jetbrains.kotlin.idea.inspections.UseExpressionBodyInspection.buildVisitor.<no name provided>.visitDeclaration[LocalVariableDescriptor]

'isOnTheFly' @ [82:29] ==> value-parameter isOnTheFly: Boolean defined in org.jetbrains.kotlin.idea.inspections.UseExpressionBodyInspection.buildVisitor[ValueParameterDescriptorImpl]

'ConvertToExpressionBodyFix' @ [83:29] ==> public constructor ConvertToExpressionBodyFix() defined in org.jetbrains.kotlin.idea.inspections.UseExpressionBodyInspection.ConvertToExpressionBodyFix[ClassConstructorDescriptorImpl]

'holder' @ [85:21] ==> value-parameter holder: ProblemsHolder defined in org.jetbrains.kotlin.idea.inspections.UseExpressionBodyInspection.buildVisitor[ValueParameterDescriptorImpl]

'registerProblem' @ [85:28] ==> public open fun registerProblem(@NotNull p0: ProblemDescriptor): Unit defined in com.intellij.codeInspection.ProblemsHolder[JavaMethodDescriptor]

'problemDescriptor' @ [85:44] ==> val problemDescriptor: ProblemDescriptor defined in org.jetbrains.kotlin.idea.inspections.UseExpressionBodyInspection.buildVisitor.<no name provided>.visitDeclaration[LocalVariableDescriptor]

'blockExpression' @ [90:20] ==> private final fun KtDeclarationWithBody.blockExpression(): KtBlockExpression? defined in org.jetbrains.kotlin.idea.inspections.UseExpressionBodyInspection[SimpleFunctionDescriptorImpl]

'body' @ [91:16] ==> val body: KtBlockExpression defined in org.jetbrains.kotlin.idea.inspections.UseExpressionBodyInspection.findValueStatement[LocalVariableDescriptor]

'findValueStatement' @ [91:21] ==> private final fun KtBlockExpression.findValueStatement(): KtExpression? defined in org.jetbrains.kotlin.idea.inspections.UseExpressionBodyInspection[SimpleFunctionDescriptorImpl]

'when (this) {
        is KtFunctionLiteral -> null
        else -> if (!hasBlockBody()) null else bodyExpression as? KtBlockExpression
    }' @ [94:59] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: KtBlockExpression?, entry1: KtBlockExpression?): KtBlockExpression?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> KtBlockExpression?

'this' @ [94:65] ==> <this> defined in org.jetbrains.kotlin.idea.inspections.UseExpressionBodyInspection.blockExpression[ReceiverParameterDescriptorImpl]

'if (!hasBlockBody()) null else bodyExpression as? KtBlockExpression' @ [96:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KtBlockExpression?, elseBranch: KtBlockExpression?): KtBlockExpression?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KtBlockExpression?

'!' @ [96:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'hasBlockBody' @ [96:22] ==> public abstract fun hasBlockBody(): Boolean defined in org.jetbrains.kotlin.psi.KtDeclarationWithBody[JavaMethodDescriptor]

'bodyExpression' @ [96:48] ==> public final val KtDeclarationWithBody.bodyExpression: KtExpression?[MyPropertyDescriptor]

'statements' @ [100:30] ==> public final val KtBlockExpression.statements: List<(KtExpression..KtExpression?)>[MyPropertyDescriptor]

'bodyStatements' @ [101:13] ==> val bodyStatements: List<(KtExpression..KtExpression?)> defined in org.jetbrains.kotlin.idea.inspections.UseExpressionBodyInspection.findValueStatement[LocalVariableDescriptor]

'isEmpty' @ [101:28] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'if (convertEmptyToUnit) KtPsiFactory(this).createExpression("Unit") else null' @ [102:20] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KtExpression?, elseBranch: KtExpression?): KtExpression?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KtExpression?

'convertEmptyToUnit' @ [102:24] ==> private final val convertEmptyToUnit: Boolean defined in org.jetbrains.kotlin.idea.inspections.UseExpressionBodyInspection[PropertyDescriptorImpl]

'KtPsiFactory' @ [102:44] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'this' @ [102:57] ==> <this> defined in org.jetbrains.kotlin.idea.inspections.UseExpressionBodyInspection.findValueStatement[ReceiverParameterDescriptorImpl]

'createExpression' @ [102:63] ==> public final fun createExpression(text: String): KtExpression defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'bodyStatements' @ [104:25] ==> val bodyStatements: List<(KtExpression..KtExpression?)> defined in org.jetbrains.kotlin.idea.inspections.UseExpressionBodyInspection.findValueStatement[LocalVariableDescriptor]

'singleOrNull' @ [104:40] ==> public fun <T> List<(KtExpression..KtExpression?)>.singleOrNull(): KtExpression? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtExpression..org.jetbrains.kotlin.psi.KtExpression?)

'when (statement) {
            is KtReturnExpression -> {
                return statement
            }

        //TODO: IMO this is not good code, there should be a way to detect that KtExpression does not have value
            is KtDeclaration, is KtLoopExpression -> return null

            else -> {
                // assignment does not have value
                if (statement is KtBinaryExpression && statement.operationToken in KtTokens.ALL_ASSIGNMENTS) return null

                val context = statement.analyze()
                val expressionType = context.getType(statement) ?: return null
                val isUnit = KotlinBuiltIns.isUnit(expressionType)
                if (!isUnit && !KotlinBuiltIns.isNothing(expressionType)) return null
                if (isUnit) {
                    if (statement.hasResultingIfWithoutElse()) {
                        return null
                    }
                    val resultingWhens = statement.resultingWhens()
                    if (resultingWhens.any { it.elseExpression == null && context.get(BindingContext.EXHAUSTIVE_WHEN, it) != true }) {
                        return null
                    }
                }
                return statement
            }
        }' @ [105:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Nothing, entry1: Nothing, entry2: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Nothing

'statement' @ [105:15] ==> val statement: KtExpression defined in org.jetbrains.kotlin.idea.inspections.UseExpressionBodyInspection.findValueStatement[LocalVariableDescriptor]

'statement' @ [107:24] ==> val statement: KtExpression defined in org.jetbrains.kotlin.idea.inspections.UseExpressionBodyInspection.findValueStatement[LocalVariableDescriptor]

'statement' @ [115:21] ==> val statement: KtExpression defined in org.jetbrains.kotlin.idea.inspections.UseExpressionBodyInspection.findValueStatement[LocalVariableDescriptor]

'statement' @ [115:56] ==> val statement: KtExpression defined in org.jetbrains.kotlin.idea.inspections.UseExpressionBodyInspection.findValueStatement[LocalVariableDescriptor]

'operationToken' @ [115:66] ==> public final val KtBinaryExpression.operationToken: IElementType[MyPropertyDescriptor]

'ALL_ASSIGNMENTS' @ [115:93] ==> public final val ALL_ASSIGNMENTS: (TokenSet..TokenSet?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'statement' @ [117:31] ==> val statement: KtExpression defined in org.jetbrains.kotlin.idea.inspections.UseExpressionBodyInspection.findValueStatement[LocalVariableDescriptor]

'analyze' @ [117:41] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'context' @ [118:38] ==> val context: BindingContext defined in org.jetbrains.kotlin.idea.inspections.UseExpressionBodyInspection.findValueStatement[LocalVariableDescriptor]

'getType' @ [118:46] ==> @Nullable public abstract fun getType(@NotNull p0: KtExpression): KotlinType? defined in org.jetbrains.kotlin.resolve.BindingContext[JavaMethodDescriptor]

'statement' @ [118:54] ==> val statement: KtExpression defined in org.jetbrains.kotlin.idea.inspections.UseExpressionBodyInspection.findValueStatement[LocalVariableDescriptor]

'isUnit' @ [119:45] ==> public open fun isUnit(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'expressionType' @ [119:52] ==> val expressionType: KotlinType defined in org.jetbrains.kotlin.idea.inspections.UseExpressionBodyInspection.findValueStatement[LocalVariableDescriptor]

'!' @ [120:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isUnit' @ [120:22] ==> val isUnit: Boolean defined in org.jetbrains.kotlin.idea.inspections.UseExpressionBodyInspection.findValueStatement[LocalVariableDescriptor]

'!' @ [120:32] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isNothing' @ [120:48] ==> public open fun isNothing(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'expressionType' @ [120:58] ==> val expressionType: KotlinType defined in org.jetbrains.kotlin.idea.inspections.UseExpressionBodyInspection.findValueStatement[LocalVariableDescriptor]

'isUnit' @ [121:21] ==> val isUnit: Boolean defined in org.jetbrains.kotlin.idea.inspections.UseExpressionBodyInspection.findValueStatement[LocalVariableDescriptor]

'statement' @ [122:25] ==> val statement: KtExpression defined in org.jetbrains.kotlin.idea.inspections.UseExpressionBodyInspection.findValueStatement[LocalVariableDescriptor]

'hasResultingIfWithoutElse' @ [122:35] ==> public fun KtExpression?.hasResultingIfWithoutElse(): Boolean defined in org.jetbrains.kotlin.idea.intentions in file Utils.kt[SimpleFunctionDescriptorImpl]

'statement' @ [125:42] ==> val statement: KtExpression defined in org.jetbrains.kotlin.idea.inspections.UseExpressionBodyInspection.findValueStatement[LocalVariableDescriptor]

'resultingWhens' @ [125:52] ==> public fun KtExpression.resultingWhens(): List<KtWhenExpression> defined in org.jetbrains.kotlin.idea.intentions[SimpleFunctionDescriptorImpl]

'resultingWhens' @ [126:25] ==> val resultingWhens: List<KtWhenExpression> defined in org.jetbrains.kotlin.idea.inspections.UseExpressionBodyInspection.findValueStatement[LocalVariableDescriptor]

'any' @ [126:40] ==> public inline fun <T> Iterable<KtWhenExpression>.any(predicate: (KtWhenExpression) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtWhenExpression

'it' @ [126:46] ==> value-parameter it: KtWhenExpression defined in org.jetbrains.kotlin.idea.inspections.UseExpressionBodyInspection.findValueStatement.<anonymous>[ValueParameterDescriptorImpl]

'elseExpression' @ [126:49] ==> public final val KtWhenExpression.elseExpression: KtExpression?[MyPropertyDescriptor]

'context' @ [126:75] ==> val context: BindingContext defined in org.jetbrains.kotlin.idea.inspections.UseExpressionBodyInspection.findValueStatement[LocalVariableDescriptor]

'get' @ [126:83] ==> @Nullable public abstract operator fun <K : (Any..Any?), V : (Any..Any?)> get(p0: (ReadOnlySlice<(KtWhenExpression..KtWhenExpression?), (Boolean..Boolean?)>..ReadOnlySlice<(KtWhenExpression..KtWhenExpression?), (Boolean..Boolean?)>?), p1: (KtWhenExpression..KtWhenExpression?)): Boolean? defined in org.jetbrains.kotlin.resolve.BindingContext[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> KtWhenExpression
    <V : (Any..Any?)> -> Boolean

'EXHAUSTIVE_WHEN' @ [126:102] ==> public final val EXHAUSTIVE_WHEN: (WritableSlice<(KtWhenExpression..KtWhenExpression?), (Boolean..Boolean?)>..WritableSlice<(KtWhenExpression..KtWhenExpression?), (Boolean..Boolean?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'it' @ [126:119] ==> value-parameter it: KtWhenExpression defined in org.jetbrains.kotlin.idea.inspections.UseExpressionBodyInspection.findValueStatement.<anonymous>[ValueParameterDescriptorImpl]

'statement' @ [130:24] ==> val statement: KtExpression defined in org.jetbrains.kotlin.idea.inspections.UseExpressionBodyInspection.findValueStatement[LocalVariableDescriptor]

'when (this) {
        is KtReturnExpression -> returnedExpression
        else -> null
    }' @ [135:43] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: KtExpression?, entry1: KtExpression?): KtExpression?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> KtExpression?

'this' @ [135:49] ==> <this> defined in org.jetbrains.kotlin.idea.inspections.UseExpressionBodyInspection.getValue[ReceiverParameterDescriptorImpl]

'returnedExpression' @ [136:34] ==> public final val KtReturnExpression.returnedExpression: KtExpression?[MyPropertyDescriptor]

'this' @ [138:10] ==> <this> defined in org.jetbrains.kotlin.idea.inspections.UseExpressionBodyInspection.getValue[ReceiverParameterDescriptorImpl]

'when (this) {
        is KtReturnExpression -> returnKeyword
        is KtCallExpression -> calleeExpression
        is KtQualifiedExpression -> selectorExpression?.toHighlight()
        is KtObjectLiteralExpression -> objectDeclaration.getObjectKeyword()
        else -> null
    }' @ [140:59] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: PsiElement?, entry1: PsiElement?, entry2: PsiElement?, entry3: PsiElement?, entry4: PsiElement?): PsiElement?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> PsiElement?

'this' @ [140:65] ==> <this> defined in org.jetbrains.kotlin.idea.inspections.UseExpressionBodyInspection.toHighlight[ReceiverParameterDescriptorImpl]

'returnKeyword' @ [141:34] ==> public final val KtReturnExpression.returnKeyword: PsiElement[MyPropertyDescriptor]

'calleeExpression' @ [142:32] ==> public final val KtCallExpression.calleeExpression: KtExpression?[MyPropertyDescriptor]

'selectorExpression' @ [143:37] ==> public open val selectorExpression: KtExpression? defined in org.jetbrains.kotlin.psi.KtQualifiedExpression[DeserializedPropertyDescriptor]

'toHighlight' @ [143:57] ==> private final fun KtExpression.toHighlight(): PsiElement? defined in org.jetbrains.kotlin.idea.inspections.UseExpressionBodyInspection[SimpleFunctionDescriptorImpl]

'objectDeclaration' @ [144:41] ==> public final val KtObjectLiteralExpression.objectDeclaration: KtObjectDeclaration[MyPropertyDescriptor]

'getObjectKeyword' @ [144:59] ==> public final fun getObjectKeyword(): PsiElement? defined in org.jetbrains.kotlin.psi.KtObjectDeclaration[DeserializedSimpleFunctionDescriptor]

'it' @ [150:13] ==> value-parameter it: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.inspections.UseExpressionBodyInspection.simplify.<anonymous>[ValueParameterDescriptorImpl]

'deleteChildRange' @ [150:16] ==> public abstract fun deleteChildRange(p0: (PsiElement..PsiElement?), p1: (PsiElement..PsiElement?)): Unit defined in org.jetbrains.kotlin.psi.KtCallableDeclaration[JavaMethodDescriptor]

'it' @ [150:33] ==> value-parameter it: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.inspections.UseExpressionBodyInspection.simplify.<anonymous>[ValueParameterDescriptorImpl]

'colon' @ [150:36] ==> public final val KtCallableDeclaration.colon: PsiElement?[MyPropertyDescriptor]

'it' @ [150:45] ==> value-parameter it: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.inspections.UseExpressionBodyInspection.simplify.<anonymous>[ValueParameterDescriptorImpl]

'typeReference' @ [150:48] ==> public final var KtCallableDeclaration.typeReference: KtTypeReference?[MyPropertyDescriptor]

'simplify' @ [152:9] ==> private final fun simplify(declaration: KtDeclarationWithBody, deleteTypeHandler: ((KtCallableDeclaration) -> Unit)?): Unit defined in org.jetbrains.kotlin.idea.inspections.UseExpressionBodyInspection[SimpleFunctionDescriptorImpl]

'declaration' @ [152:18] ==> value-parameter declaration: KtDeclarationWithBody defined in org.jetbrains.kotlin.idea.inspections.UseExpressionBodyInspection.simplify[ValueParameterDescriptorImpl]

'deleteTypeHandler' @ [152:31] ==> val deleteTypeHandler: (KtCallableDeclaration) -> Unit defined in org.jetbrains.kotlin.idea.inspections.UseExpressionBodyInspection.simplify[LocalVariableDescriptor]

'takeIf' @ [152:49] ==> @InlineOnly @SinceKotlin public inline fun <T> ((KtCallableDeclaration) -> Unit).takeIf(predicate: ((KtCallableDeclaration) -> Unit) -> Boolean): ((KtCallableDeclaration) -> Unit)? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Function1<KtCallableDeclaration, Unit>

'canDeleteTypeRef' @ [152:58] ==> value-parameter canDeleteTypeRef: Boolean defined in org.jetbrains.kotlin.idea.inspections.UseExpressionBodyInspection.simplify[ValueParameterDescriptorImpl]

'declaration' @ [156:21] ==> value-parameter declaration: KtDeclarationWithBody defined in org.jetbrains.kotlin.idea.inspections.UseExpressionBodyInspection.simplify[ValueParameterDescriptorImpl]

'blockExpression' @ [156:33] ==> private final fun KtDeclarationWithBody.blockExpression(): KtBlockExpression? defined in org.jetbrains.kotlin.idea.inspections.UseExpressionBodyInspection[SimpleFunctionDescriptorImpl]

'block' @ [157:30] ==> val block: KtBlockExpression defined in org.jetbrains.kotlin.idea.inspections.UseExpressionBodyInspection.simplify[LocalVariableDescriptor]

'findValueStatement' @ [157:36] ==> private final fun KtBlockExpression.findValueStatement(): KtExpression? defined in org.jetbrains.kotlin.idea.inspections.UseExpressionBodyInspection[SimpleFunctionDescriptorImpl]

'valueStatement' @ [158:21] ==> val valueStatement: KtExpression defined in org.jetbrains.kotlin.idea.inspections.UseExpressionBodyInspection.simplify[LocalVariableDescriptor]

'getValue' @ [158:36] ==> private final fun KtExpression.getValue(): KtExpression defined in org.jetbrains.kotlin.idea.inspections.UseExpressionBodyInspection[SimpleFunctionDescriptorImpl]

'!' @ [160:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'declaration' @ [160:14] ==> value-parameter declaration: KtDeclarationWithBody defined in org.jetbrains.kotlin.idea.inspections.UseExpressionBodyInspection.simplify[ValueParameterDescriptorImpl]

'hasDeclaredReturnType' @ [160:26] ==> public abstract fun hasDeclaredReturnType(): Boolean defined in org.jetbrains.kotlin.psi.KtDeclarationWithBody[JavaMethodDescriptor]

'declaration' @ [160:53] ==> value-parameter declaration: KtDeclarationWithBody defined in org.jetbrains.kotlin.idea.inspections.UseExpressionBodyInspection.simplify[ValueParameterDescriptorImpl]

'block' @ [160:87] ==> val block: KtBlockExpression defined in org.jetbrains.kotlin.idea.inspections.UseExpressionBodyInspection.simplify[LocalVariableDescriptor]

'statements' @ [160:93] ==> public final val KtBlockExpression.statements: List<(KtExpression..KtExpression?)>[MyPropertyDescriptor]

'isNotEmpty' @ [160:104] ==> @InlineOnly public inline fun <T> Collection<(KtExpression..KtExpression?)>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtExpression..org.jetbrains.kotlin.psi.KtExpression?)

'value' @ [161:29] ==> val value: KtExpression defined in org.jetbrains.kotlin.idea.inspections.UseExpressionBodyInspection.simplify[LocalVariableDescriptor]

'analyze' @ [161:35] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'getType' @ [161:45] ==> @Nullable public abstract fun getType(@NotNull p0: KtExpression): KotlinType? defined in org.jetbrains.kotlin.resolve.BindingContext[JavaMethodDescriptor]

'value' @ [161:53] ==> val value: KtExpression defined in org.jetbrains.kotlin.idea.inspections.UseExpressionBodyInspection.simplify[LocalVariableDescriptor]

'valueType' @ [162:17] ==> val valueType: KotlinType? defined in org.jetbrains.kotlin.idea.inspections.UseExpressionBodyInspection.simplify[LocalVariableDescriptor]

'!' @ [162:38] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isUnit' @ [162:54] ==> public open fun isUnit(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'valueType' @ [162:61] ==> val valueType: KotlinType? defined in org.jetbrains.kotlin.idea.inspections.UseExpressionBodyInspection.simplify[LocalVariableDescriptor]

'declaration' @ [163:17] ==> value-parameter declaration: KtDeclarationWithBody defined in org.jetbrains.kotlin.idea.inspections.UseExpressionBodyInspection.simplify[ValueParameterDescriptorImpl]

'setType' @ [163:29] ==> public fun KtCallableDeclaration.setType(typeString: String, shortenReferences: Boolean = ...): Unit defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]

'FQ_NAMES' @ [163:52] ==> public final val FQ_NAMES: (KotlinBuiltIns.FqNames..KotlinBuiltIns.FqNames?) defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaPropertyDescriptor]

'unit' @ [163:61] ==> public final val unit: (FqNameUnsafe..FqNameUnsafe?) defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns.FqNames[JavaPropertyDescriptor]

'asString' @ [163:66] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqNameUnsafe[JavaMethodDescriptor]

'declaration' @ [167:20] ==> value-parameter declaration: KtDeclarationWithBody defined in org.jetbrains.kotlin.idea.inspections.UseExpressionBodyInspection.simplify[ValueParameterDescriptorImpl]

'bodyExpression' @ [167:32] ==> public final val KtDeclarationWithBody.bodyExpression: KtExpression?[MyPropertyDescriptor]

'CommentSaver' @ [169:28] ==> public constructor CommentSaver(originalElement: PsiElement, saveLineBreaks: Boolean = ...) defined in org.jetbrains.kotlin.idea.util.CommentSaver[DeserializedClassConstructorDescriptor]

'body' @ [169:41] ==> val body: KtExpression defined in org.jetbrains.kotlin.idea.inspections.UseExpressionBodyInspection.simplify[LocalVariableDescriptor]

'KtPsiFactory' @ [171:23] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'declaration' @ [171:36] ==> value-parameter declaration: KtDeclarationWithBody defined in org.jetbrains.kotlin.idea.inspections.UseExpressionBodyInspection.simplify[ValueParameterDescriptorImpl]

'declaration' @ [172:9] ==> value-parameter declaration: KtDeclarationWithBody defined in org.jetbrains.kotlin.idea.inspections.UseExpressionBodyInspection.simplify[ValueParameterDescriptorImpl]

'addBefore' @ [172:21] ==> public abstract fun addBefore(@NotNull p0: PsiElement, @Nullable p1: PsiElement?): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtDeclarationWithBody[JavaMethodDescriptor]

'factory' @ [172:31] ==> val factory: KtPsiFactory defined in org.jetbrains.kotlin.idea.inspections.UseExpressionBodyInspection.simplify[LocalVariableDescriptor]

'createEQ' @ [172:39] ==> public final fun createEQ(): PsiElement defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'body' @ [172:51] ==> val body: KtExpression defined in org.jetbrains.kotlin.idea.inspections.UseExpressionBodyInspection.simplify[LocalVariableDescriptor]

'body' @ [173:23] ==> val body: KtExpression defined in org.jetbrains.kotlin.idea.inspections.UseExpressionBodyInspection.simplify[LocalVariableDescriptor]

'replaced' @ [173:28] ==> public inline fun <reified T : PsiElement> PsiElement.replaced(newElement: KtExpression): KtExpression defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtExpression

'value' @ [173:37] ==> val value: KtExpression defined in org.jetbrains.kotlin.idea.inspections.UseExpressionBodyInspection.simplify[LocalVariableDescriptor]

'commentSaver' @ [175:9] ==> val commentSaver: CommentSaver defined in org.jetbrains.kotlin.idea.inspections.UseExpressionBodyInspection.simplify[LocalVariableDescriptor]

'restore' @ [175:22] ==> public final fun restore(resultElement: PsiElement, forceAdjustIndent: Boolean = ...): Unit defined in org.jetbrains.kotlin.idea.util.CommentSaver[DeserializedSimpleFunctionDescriptor]

'newBody' @ [175:30] ==> val newBody: KtExpression defined in org.jetbrains.kotlin.idea.inspections.UseExpressionBodyInspection.simplify[LocalVariableDescriptor]

'deleteTypeHandler' @ [177:13] ==> value-parameter deleteTypeHandler: ((KtCallableDeclaration) -> Unit)? defined in org.jetbrains.kotlin.idea.inspections.UseExpressionBodyInspection.simplify[ValueParameterDescriptorImpl]

'declaration' @ [177:42] ==> value-parameter declaration: KtDeclarationWithBody defined in org.jetbrains.kotlin.idea.inspections.UseExpressionBodyInspection.simplify[ValueParameterDescriptorImpl]

'declaration' @ [178:17] ==> value-parameter declaration: KtDeclarationWithBody defined in org.jetbrains.kotlin.idea.inspections.UseExpressionBodyInspection.simplify[ValueParameterDescriptorImpl]

'hasDeclaredReturnType' @ [178:29] ==> public abstract fun hasDeclaredReturnType(): Boolean defined in org.jetbrains.kotlin.psi.KtDeclarationWithBody[JavaMethodDescriptor]

'declaration' @ [178:56] ==> value-parameter declaration: KtDeclarationWithBody defined in org.jetbrains.kotlin.idea.inspections.UseExpressionBodyInspection.simplify[ValueParameterDescriptorImpl]

'canOmitDeclaredType' @ [178:68] ==> public fun KtCallableDeclaration.canOmitDeclaredType(initializerOrBodyExpression: KtExpression, canChangeTypeToSubtype: Boolean): Boolean defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]

'newBody' @ [178:88] ==> val newBody: KtExpression defined in org.jetbrains.kotlin.idea.inspections.UseExpressionBodyInspection.simplify[LocalVariableDescriptor]

'invoke' @ [179:17] ==> public abstract operator fun invoke(p1: KtCallableDeclaration): Unit defined in kotlin.Function1[FunctionInvokeDescriptor]

'declaration' @ [179:35] ==> value-parameter declaration: KtDeclarationWithBody defined in org.jetbrains.kotlin.idea.inspections.UseExpressionBodyInspection.simplify[ValueParameterDescriptorImpl]

'declaration' @ [183:22] ==> value-parameter declaration: KtDeclarationWithBody defined in org.jetbrains.kotlin.idea.inspections.UseExpressionBodyInspection.simplify[ValueParameterDescriptorImpl]

'findExistingEditor' @ [183:34] ==> public fun PsiElement.findExistingEditor(): Editor? defined in org.jetbrains.kotlin.idea.inspections[DeserializedSimpleFunctionDescriptor]

'editor' @ [184:13] ==> val editor: Editor? defined in org.jetbrains.kotlin.idea.inspections.UseExpressionBodyInspection.simplify[LocalVariableDescriptor]

'newBody' @ [185:31] ==> val newBody: KtExpression defined in org.jetbrains.kotlin.idea.inspections.UseExpressionBodyInspection.simplify[LocalVariableDescriptor]

'startOffset' @ [185:39] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'editor' @ [186:28] ==> val editor: Editor? defined in org.jetbrains.kotlin.idea.inspections.UseExpressionBodyInspection.simplify[LocalVariableDescriptor]

'document' @ [186:35] ==> public final val Editor.document: Document[MyPropertyDescriptor]

'document' @ [187:29] ==> val document: Document defined in org.jetbrains.kotlin.idea.inspections.UseExpressionBodyInspection.simplify[LocalVariableDescriptor]

'getLineNumber' @ [187:38] ==> @Contract public abstract fun getLineNumber(p0: Int): Int defined in com.intellij.openapi.editor.Document[JavaMethodDescriptor]

'startOffset' @ [187:52] ==> val startOffset: Int defined in org.jetbrains.kotlin.idea.inspections.UseExpressionBodyInspection.simplify[LocalVariableDescriptor]

'editor' @ [188:31] ==> val editor: Editor? defined in org.jetbrains.kotlin.idea.inspections.UseExpressionBodyInspection.simplify[LocalVariableDescriptor]

'settings' @ [188:38] ==> public final val Editor.settings: EditorSettings[MyPropertyDescriptor]

'getRightMargin' @ [188:47] ==> public abstract fun getRightMargin(p0: (Project..Project?)): Int defined in com.intellij.openapi.editor.EditorSettings[JavaMethodDescriptor]

'editor' @ [188:62] ==> val editor: Editor? defined in org.jetbrains.kotlin.idea.inspections.UseExpressionBodyInspection.simplify[LocalVariableDescriptor]

'project' @ [188:69] ==> public final val Editor.project: Project?[MyPropertyDescriptor]

'document' @ [189:17] ==> val document: Document defined in org.jetbrains.kotlin.idea.inspections.UseExpressionBodyInspection.simplify[LocalVariableDescriptor]

'getLineEndOffset' @ [189:26] ==> @Contract public abstract fun getLineEndOffset(p0: Int): Int defined in com.intellij.openapi.editor.Document[JavaMethodDescriptor]

'startLine' @ [189:43] ==> val startLine: Int defined in org.jetbrains.kotlin.idea.inspections.UseExpressionBodyInspection.simplify[LocalVariableDescriptor]

'document' @ [189:56] ==> val document: Document defined in org.jetbrains.kotlin.idea.inspections.UseExpressionBodyInspection.simplify[LocalVariableDescriptor]

'getLineStartOffset' @ [189:65] ==> @Contract public abstract fun getLineStartOffset(p0: Int): Int defined in com.intellij.openapi.editor.Document[JavaMethodDescriptor]

'startLine' @ [189:84] ==> val startLine: Int defined in org.jetbrains.kotlin.idea.inspections.UseExpressionBodyInspection.simplify[LocalVariableDescriptor]

'rightMargin' @ [189:98] ==> val rightMargin: Int defined in org.jetbrains.kotlin.idea.inspections.UseExpressionBodyInspection.simplify[LocalVariableDescriptor]

'declaration' @ [190:17] ==> value-parameter declaration: KtDeclarationWithBody defined in org.jetbrains.kotlin.idea.inspections.UseExpressionBodyInspection.simplify[ValueParameterDescriptorImpl]

'addBefore' @ [190:29] ==> public abstract fun addBefore(@NotNull p0: PsiElement, @Nullable p1: PsiElement?): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtDeclarationWithBody[JavaMethodDescriptor]

'factory' @ [190:39] ==> val factory: KtPsiFactory defined in org.jetbrains.kotlin.idea.inspections.UseExpressionBodyInspection.simplify[LocalVariableDescriptor]

'createNewLine' @ [190:47] ==> public final fun createNewLine(): PsiElement defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'newBody' @ [190:64] ==> val newBody: KtExpression defined in org.jetbrains.kotlin.idea.inspections.UseExpressionBodyInspection.simplify[LocalVariableDescriptor]

'name' @ [196:40] ==> public final val UseExpressionBodyInspection.ConvertToExpressionBodyFix.name: String[MyPropertyDescriptor]

'descriptor' @ [201:31] ==> value-parameter descriptor: ProblemDescriptor defined in org.jetbrains.kotlin.idea.inspections.UseExpressionBodyInspection.ConvertToExpressionBodyFix.applyFix[ValueParameterDescriptorImpl]

'psiElement' @ [201:42] ==> public final val ProblemDescriptor.psiElement: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'simplify' @ [202:13] ==> private final fun simplify(declaration: KtDeclarationWithBody, deleteTypeHandler: ((KtCallableDeclaration) -> Unit)?): Unit defined in org.jetbrains.kotlin.idea.inspections.UseExpressionBodyInspection[SimpleFunctionDescriptorImpl]

'declaration' @ [202:22] ==> val declaration: KtDeclarationWithBody defined in org.jetbrains.kotlin.idea.inspections.UseExpressionBodyInspection.ConvertToExpressionBodyFix.applyFix[LocalVariableDescriptor]

'it' @ [203:31] ==> value-parameter it: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.inspections.UseExpressionBodyInspection.ConvertToExpressionBodyFix.applyFix.<anonymous>[ValueParameterDescriptorImpl]

'typeReference' @ [203:34] ==> public final var KtCallableDeclaration.typeReference: KtTypeReference?[MyPropertyDescriptor]

'it' @ [204:29] ==> value-parameter it: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.inspections.UseExpressionBodyInspection.ConvertToExpressionBodyFix.applyFix.<anonymous>[ValueParameterDescriptorImpl]

'colon' @ [204:32] ==> public final val KtCallableDeclaration.colon: PsiElement?[MyPropertyDescriptor]

'it' @ [205:17] ==> value-parameter it: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.inspections.UseExpressionBodyInspection.ConvertToExpressionBodyFix.applyFix.<anonymous>[ValueParameterDescriptorImpl]

'findExistingEditor' @ [205:20] ==> public fun PsiElement.findExistingEditor(): Editor? defined in org.jetbrains.kotlin.idea.inspections[DeserializedSimpleFunctionDescriptor]

'apply' @ [205:42] ==> @InlineOnly public inline fun <T> Editor.apply(block: Editor.() -> Unit): Editor defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Editor

'selectionModel' @ [206:21] ==> public final val Editor.selectionModel: SelectionModel[MyPropertyDescriptor]

'setSelection' @ [206:36] ==> public abstract fun setSelection(p0: Int, p1: Int): Unit defined in com.intellij.openapi.editor.SelectionModel[JavaMethodDescriptor]

'colon' @ [206:49] ==> val colon: PsiElement defined in org.jetbrains.kotlin.idea.inspections.UseExpressionBodyInspection.ConvertToExpressionBodyFix.applyFix.<anonymous>[LocalVariableDescriptor]

'startOffset' @ [206:55] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'typeRef' @ [206:68] ==> val typeRef: KtTypeReference defined in org.jetbrains.kotlin.idea.inspections.UseExpressionBodyInspection.ConvertToExpressionBodyFix.applyFix.<anonymous>[LocalVariableDescriptor]

'endOffset' @ [206:76] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'caretModel' @ [207:21] ==> public final val Editor.caretModel: CaretModel[MyPropertyDescriptor]

'moveToOffset' @ [207:32] ==> public abstract fun moveToOffset(p0: Int): Unit defined in com.intellij.openapi.editor.CaretModel[JavaMethodDescriptor]

'typeRef' @ [207:45] ==> val typeRef: KtTypeReference defined in org.jetbrains.kotlin.idea.inspections.UseExpressionBodyInspection.ConvertToExpressionBodyFix.applyFix.<anonymous>[LocalVariableDescriptor]

'endOffset' @ [207:53] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

