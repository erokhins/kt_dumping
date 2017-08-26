'lambda' @ [41:20] ==> private final val lambda: KtFunction defined in org.jetbrains.kotlin.idea.debugger.stepping.KotlinLambdaMethodFilter[PropertyDescriptorImpl]

'bodyExpression' @ [41:27] ==> public final val KtFunction.bodyExpression: KtExpression?[MyPropertyDescriptor]

'if (body != null && lambda.isMultiLine()) {
            var firstStatementPosition: SourcePosition? = null
            var lastStatementPosition: SourcePosition? = null
            val statements = (body as? KtBlockExpression)?.statements ?: listOf(body)
            if (statements.isNotEmpty()) {
                firstStatementPosition = SourcePosition.createFromElement(statements.first())
                if (firstStatementPosition != null) {
                    val lastStatement = statements.last()
                    lastStatementPosition = SourcePosition.createFromOffset(firstStatementPosition.file, lastStatement.textRange.endOffset)
                }
            }
            myFirstStatementPosition = firstStatementPosition
            myLastStatementLine = if (lastStatementPosition != null) lastStatementPosition.line else -1
        }
        else {
            myFirstStatementPosition = SourcePosition.createFromElement(lambda)
            myLastStatementLine = myFirstStatementPosition!!.line
        }' @ [42:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'body' @ [42:13] ==> val body: KtExpression? defined in org.jetbrains.kotlin.idea.debugger.stepping.KotlinLambdaMethodFilter.<init>[LocalVariableDescriptor]

'lambda' @ [42:29] ==> private final val lambda: KtFunction defined in org.jetbrains.kotlin.idea.debugger.stepping.KotlinLambdaMethodFilter[PropertyDescriptorImpl]

'isMultiLine' @ [42:36] ==> public fun PsiElement.isMultiLine(): Boolean defined in org.jetbrains.kotlin.idea.refactoring in file kotlinRefactoringUtil.kt[SimpleFunctionDescriptorImpl]

'?:' @ [45:30] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: List<(KtExpression..KtExpression?)>?, right: List<(KtExpression..KtExpression?)>): List<(KtExpression..KtExpression?)>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> List<(org.jetbrains.kotlin.psi.KtExpression..org.jetbrains.kotlin.psi.KtExpression?)>

'body' @ [45:31] ==> val body: KtExpression? defined in org.jetbrains.kotlin.idea.debugger.stepping.KotlinLambdaMethodFilter.<init>[LocalVariableDescriptor]

'statements' @ [45:60] ==> public final val KtBlockExpression.statements: List<(KtExpression..KtExpression?)>[MyPropertyDescriptor]

'listOf' @ [45:74] ==> public fun <T> listOf(element: KtExpression): List<KtExpression> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression

'body' @ [45:81] ==> val body: KtExpression? defined in org.jetbrains.kotlin.idea.debugger.stepping.KotlinLambdaMethodFilter.<init>[LocalVariableDescriptor]

'statements' @ [46:17] ==> val statements: List<(KtExpression..KtExpression?)> defined in org.jetbrains.kotlin.idea.debugger.stepping.KotlinLambdaMethodFilter.<init>[LocalVariableDescriptor]

'isNotEmpty' @ [46:28] ==> @InlineOnly public inline fun <T> Collection<(KtExpression..KtExpression?)>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtExpression..org.jetbrains.kotlin.psi.KtExpression?)

'firstStatementPosition' @ [47:17] ==> var firstStatementPosition: SourcePosition? defined in org.jetbrains.kotlin.idea.debugger.stepping.KotlinLambdaMethodFilter.<init>[LocalVariableDescriptor]

'createFromElement' @ [47:57] ==> @Nullable public open fun createFromElement(@NotNull p0: PsiElement): SourcePosition? defined in com.intellij.debugger.SourcePosition[JavaMethodDescriptor]

'statements' @ [47:75] ==> val statements: List<(KtExpression..KtExpression?)> defined in org.jetbrains.kotlin.idea.debugger.stepping.KotlinLambdaMethodFilter.<init>[LocalVariableDescriptor]

'first' @ [47:86] ==> public fun <T> List<(KtExpression..KtExpression?)>.first(): (KtExpression..KtExpression?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtExpression..org.jetbrains.kotlin.psi.KtExpression?)

'firstStatementPosition' @ [48:21] ==> var firstStatementPosition: SourcePosition? defined in org.jetbrains.kotlin.idea.debugger.stepping.KotlinLambdaMethodFilter.<init>[LocalVariableDescriptor]

'statements' @ [49:41] ==> val statements: List<(KtExpression..KtExpression?)> defined in org.jetbrains.kotlin.idea.debugger.stepping.KotlinLambdaMethodFilter.<init>[LocalVariableDescriptor]

'last' @ [49:52] ==> public fun <T> List<(KtExpression..KtExpression?)>.last(): (KtExpression..KtExpression?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtExpression..org.jetbrains.kotlin.psi.KtExpression?)

'lastStatementPosition' @ [50:21] ==> var lastStatementPosition: SourcePosition? defined in org.jetbrains.kotlin.idea.debugger.stepping.KotlinLambdaMethodFilter.<init>[LocalVariableDescriptor]

'createFromOffset' @ [50:60] ==> public open fun createFromOffset(@NotNull p0: PsiFile, p1: Int): (SourcePosition..SourcePosition?) defined in com.intellij.debugger.SourcePosition[JavaMethodDescriptor]

'firstStatementPosition' @ [50:77] ==> var firstStatementPosition: SourcePosition? defined in org.jetbrains.kotlin.idea.debugger.stepping.KotlinLambdaMethodFilter.<init>[LocalVariableDescriptor]

'file' @ [50:100] ==> public final val SourcePosition.file: PsiFile[MyPropertyDescriptor]

'lastStatement' @ [50:106] ==> val lastStatement: (KtExpression..KtExpression?) defined in org.jetbrains.kotlin.idea.debugger.stepping.KotlinLambdaMethodFilter.<init>[LocalVariableDescriptor]

'textRange' @ [50:120] ==> public final val KtExpression.textRange: (TextRange..TextRange?)[MyPropertyDescriptor]

'endOffset' @ [50:130] ==> public final val TextRange.endOffset: Int[MyPropertyDescriptor]

'myFirstStatementPosition' @ [53:13] ==> private final val myFirstStatementPosition: SourcePosition? defined in org.jetbrains.kotlin.idea.debugger.stepping.KotlinLambdaMethodFilter[PropertyDescriptorImpl]

'firstStatementPosition' @ [53:40] ==> var firstStatementPosition: SourcePosition? defined in org.jetbrains.kotlin.idea.debugger.stepping.KotlinLambdaMethodFilter.<init>[LocalVariableDescriptor]

'myLastStatementLine' @ [54:13] ==> private final val myLastStatementLine: Int defined in org.jetbrains.kotlin.idea.debugger.stepping.KotlinLambdaMethodFilter[PropertyDescriptorImpl]

'if (lastStatementPosition != null) lastStatementPosition.line else -1' @ [54:35] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Int, elseBranch: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Int

'lastStatementPosition' @ [54:39] ==> var lastStatementPosition: SourcePosition? defined in org.jetbrains.kotlin.idea.debugger.stepping.KotlinLambdaMethodFilter.<init>[LocalVariableDescriptor]

'lastStatementPosition' @ [54:70] ==> var lastStatementPosition: SourcePosition? defined in org.jetbrains.kotlin.idea.debugger.stepping.KotlinLambdaMethodFilter.<init>[LocalVariableDescriptor]

'line' @ [54:92] ==> public final val SourcePosition.line: Int[MyPropertyDescriptor]

'-' @ [54:102] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'myFirstStatementPosition' @ [57:13] ==> private final val myFirstStatementPosition: SourcePosition? defined in org.jetbrains.kotlin.idea.debugger.stepping.KotlinLambdaMethodFilter[PropertyDescriptorImpl]

'createFromElement' @ [57:55] ==> @Nullable public open fun createFromElement(@NotNull p0: PsiElement): SourcePosition? defined in com.intellij.debugger.SourcePosition[JavaMethodDescriptor]

'lambda' @ [57:73] ==> private final val lambda: KtFunction defined in org.jetbrains.kotlin.idea.debugger.stepping.KotlinLambdaMethodFilter[PropertyDescriptorImpl]

'myLastStatementLine' @ [58:13] ==> private final val myLastStatementLine: Int defined in org.jetbrains.kotlin.idea.debugger.stepping.KotlinLambdaMethodFilter[PropertyDescriptorImpl]

'myFirstStatementPosition' @ [58:35] ==> private final val myFirstStatementPosition: SourcePosition? defined in org.jetbrains.kotlin.idea.debugger.stepping.KotlinLambdaMethodFilter[PropertyDescriptorImpl]

'line' @ [58:62] ==> public final val SourcePosition.line: Int[MyPropertyDescriptor]

'myFirstStatementPosition' @ [62:44] ==> private final val myFirstStatementPosition: SourcePosition? defined in org.jetbrains.kotlin.idea.debugger.stepping.KotlinLambdaMethodFilter[PropertyDescriptorImpl]

'myLastStatementLine' @ [63:43] ==> private final val myLastStatementLine: Int defined in org.jetbrains.kotlin.idea.debugger.stepping.KotlinLambdaMethodFilter[PropertyDescriptorImpl]

'location' @ [66:22] ==> value-parameter location: Location defined in org.jetbrains.kotlin.idea.debugger.stepping.KotlinLambdaMethodFilter.locationMatches[ValueParameterDescriptorImpl]

'method' @ [66:31] ==> public abstract fun method(): (Method..Method?) defined in com.sun.jdi.Location[JavaMethodDescriptor]

'isInline' @ [68:13] ==> private final val isInline: Boolean defined in org.jetbrains.kotlin.idea.debugger.stepping.KotlinLambdaMethodFilter[PropertyDescriptorImpl]

'isInsideInlineArgument' @ [69:20] ==> public fun isInsideInlineArgument(inlineArgument: KtFunction, location: Location, debugProcess: DebugProcessImpl): Boolean defined in org.jetbrains.kotlin.idea.debugger in file debuggerUtil.kt[SimpleFunctionDescriptorImpl]

'lambda' @ [69:43] ==> private final val lambda: KtFunction defined in org.jetbrains.kotlin.idea.debugger.stepping.KotlinLambdaMethodFilter[PropertyDescriptorImpl]

'location' @ [69:51] ==> value-parameter location: Location defined in org.jetbrains.kotlin.idea.debugger.stepping.KotlinLambdaMethodFilter.locationMatches[ValueParameterDescriptorImpl]

'process' @ [69:61] ==> value-parameter process: DebugProcessImpl defined in org.jetbrains.kotlin.idea.debugger.stepping.KotlinLambdaMethodFilter.locationMatches[ValueParameterDescriptorImpl]

'isLambdaName' @ [72:16] ==> private final fun isLambdaName(name: String?): Boolean defined in org.jetbrains.kotlin.idea.debugger.stepping.KotlinLambdaMethodFilter[SimpleFunctionDescriptorImpl]

'method' @ [72:29] ==> val method: (Method..Method?) defined in org.jetbrains.kotlin.idea.debugger.stepping.KotlinLambdaMethodFilter.locationMatches[LocalVariableDescriptor]

'name' @ [72:36] ==> public abstract fun name(): (String..String?) defined in com.sun.jdi.Method[JavaMethodDescriptor]

'if (isInline) Range(0, 999) else myCallingExpressionLines' @ [75:48] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Range<Int>, elseBranch: Range<Int>): Range<Int>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Range<Int>

'isInline' @ [75:52] ==> private final val isInline: Boolean defined in org.jetbrains.kotlin.idea.debugger.stepping.KotlinLambdaMethodFilter[PropertyDescriptorImpl]

'Range' @ [75:62] ==> public constructor Range<T : (Comparable<(Int..Int?)>..Comparable<(Int..Int?)>?)>(@NotNull p0: Int, @NotNull p1: Int) defined in com.intellij.util.Range[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Comparable<(T..T?)>..Comparable<(T..T?)>?)> -> Int

'myCallingExpressionLines' @ [75:81] ==> private final val myCallingExpressionLines: Range<Int> defined in org.jetbrains.kotlin.idea.debugger.stepping.KotlinLambdaMethodFilter[PropertyDescriptorImpl]

'isSuspend' @ [78:13] ==> private final val isSuspend: Boolean defined in org.jetbrains.kotlin.idea.debugger.stepping.KotlinLambdaMethodFilter[PropertyDescriptorImpl]

'name' @ [79:20] ==> value-parameter name: String? defined in org.jetbrains.kotlin.idea.debugger.stepping.KotlinLambdaMethodFilter.isLambdaName[ValueParameterDescriptorImpl]

'DO_RESUME_METHOD_NAME' @ [79:28] ==> public const val DO_RESUME_METHOD_NAME: String defined in org.jetbrains.kotlin.codegen.coroutines[DeserializedPropertyDescriptor]

'name' @ [82:16] ==> value-parameter name: String? defined in org.jetbrains.kotlin.idea.debugger.stepping.KotlinLambdaMethodFilter.isLambdaName[ValueParameterDescriptorImpl]

'INVOKE' @ [82:48] ==> @field:JvmField public final val INVOKE: Name defined in org.jetbrains.kotlin.util.OperatorNameConventions[DeserializedPropertyDescriptor]

'asString' @ [82:55] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

