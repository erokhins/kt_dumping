'AbstractTranslator' @ [31:5] ==> protected/*protected and package*/ constructor AbstractTranslator(@NotNull context: TranslationContext) defined in org.jetbrains.kotlin.js.translate.general.AbstractTranslator[JavaClassConstructorDescriptor]

'context' @ [31:24] ==> value-parameter context: TranslationContext defined in org.jetbrains.kotlin.js.translate.expression.TryTranslator.<init>[ValueParameterDescriptorImpl]

'translateAsBlock' @ [33:24] ==> private final fun translateAsBlock(expression: KtExpression?): JsBlock? defined in org.jetbrains.kotlin.js.translate.expression.TryTranslator[SimpleFunctionDescriptorImpl]

'expression' @ [33:41] ==> public final val expression: KtTryExpression defined in org.jetbrains.kotlin.js.translate.expression.TryTranslator[PropertyDescriptorImpl]

'tryBlock' @ [33:52] ==> public final val KtTryExpression.tryBlock: KtBlockExpression[MyPropertyDescriptor]

'CatchTranslator' @ [35:31] ==> public constructor CatchTranslator(catches: List<KtCatchClause>, psi: PsiElement, context: TranslationContext) defined in org.jetbrains.kotlin.js.translate.expression.CatchTranslator[ClassConstructorDescriptorImpl]

'expression' @ [35:47] ==> public final val expression: KtTryExpression defined in org.jetbrains.kotlin.js.translate.expression.TryTranslator[PropertyDescriptorImpl]

'catchClauses' @ [35:58] ==> public final val KtTryExpression.catchClauses: (MutableList<(KtCatchClause..KtCatchClause?)>..List<(KtCatchClause..KtCatchClause?)>)[MyPropertyDescriptor]

'expression' @ [35:72] ==> public final val expression: KtTryExpression defined in org.jetbrains.kotlin.js.translate.expression.TryTranslator[PropertyDescriptorImpl]

'context' @ [35:84] ==> @NotNull protected/*protected and package*/ open fun context(): TranslationContext defined in org.jetbrains.kotlin.js.translate.expression.TryTranslator[JavaMethodDescriptor]

'catchTranslator' @ [36:26] ==> val catchTranslator: CatchTranslator defined in org.jetbrains.kotlin.js.translate.expression.TryTranslator.translate[LocalVariableDescriptor]

'translate' @ [36:42] ==> public final fun translate(): JsCatch? defined in org.jetbrains.kotlin.js.translate.expression.CatchTranslator[SimpleFunctionDescriptorImpl]

'expression' @ [38:33] ==> public final val expression: KtTryExpression defined in org.jetbrains.kotlin.js.translate.expression.TryTranslator[PropertyDescriptorImpl]

'finallyBlock' @ [38:44] ==> public final val KtTryExpression.finallyBlock: KtFinallySection?[MyPropertyDescriptor]

'finalExpression' @ [38:58] ==> public final val KtFinallySection.finalExpression: (KtBlockExpression..KtBlockExpression?)[MyPropertyDescriptor]

'translateAsBlock' @ [39:28] ==> private final fun translateAsBlock(expression: KtExpression?): JsBlock? defined in org.jetbrains.kotlin.js.translate.expression.TryTranslator[SimpleFunctionDescriptorImpl]

'finallyExpression' @ [39:45] ==> val finallyExpression: KtBlockExpression? defined in org.jetbrains.kotlin.js.translate.expression.TryTranslator.translate[LocalVariableDescriptor]

'JsTry' @ [41:16] ==> public constructor JsTry(p0: (JsBlock..JsBlock?), @Nullable p1: JsCatch?, @Nullable p2: JsBlock?) defined in org.jetbrains.kotlin.js.backend.ast.JsTry[JavaClassConstructorDescriptor]

'tryBlock' @ [41:22] ==> val tryBlock: JsBlock? defined in org.jetbrains.kotlin.js.translate.expression.TryTranslator.translate[LocalVariableDescriptor]

'catchBlock' @ [41:32] ==> val catchBlock: JsCatch? defined in org.jetbrains.kotlin.js.translate.expression.TryTranslator.translate[LocalVariableDescriptor]

'finallyBlock' @ [41:44] ==> val finallyBlock: JsBlock? defined in org.jetbrains.kotlin.js.translate.expression.TryTranslator.translate[LocalVariableDescriptor]

'expression' @ [45:13] ==> value-parameter expression: KtExpression? defined in org.jetbrains.kotlin.js.translate.expression.TryTranslator.translateAsBlock[ValueParameterDescriptorImpl]

'translateAsStatementAndMergeInBlockIfNeeded' @ [47:25] ==> @NotNull public open fun translateAsStatementAndMergeInBlockIfNeeded(@NotNull expression: KtExpression, @NotNull context: TranslationContext): JsStatement defined in org.jetbrains.kotlin.js.translate.general.Translation[JavaMethodDescriptor]

'expression' @ [47:69] ==> value-parameter expression: KtExpression? defined in org.jetbrains.kotlin.js.translate.expression.TryTranslator.translateAsBlock[ValueParameterDescriptorImpl]

'context' @ [47:81] ==> @NotNull protected/*protected and package*/ open fun context(): TranslationContext defined in org.jetbrains.kotlin.js.translate.expression.TryTranslator[JavaMethodDescriptor]

'convertToBlock' @ [48:16] ==> @NotNull public open fun convertToBlock(@NotNull jsNode: JsNode): JsBlock defined in org.jetbrains.kotlin.js.translate.utils.JsAstUtils[JavaMethodDescriptor]

'statement' @ [48:31] ==> val statement: JsStatement defined in org.jetbrains.kotlin.js.translate.expression.TryTranslator.translateAsBlock[LocalVariableDescriptor]

