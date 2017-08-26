'AbstractTranslator' @ [38:5] ==> protected/*protected and package*/ constructor AbstractTranslator(@NotNull context: TranslationContext) defined in org.jetbrains.kotlin.js.translate.general.AbstractTranslator[JavaClassConstructorDescriptor]

'context' @ [38:24] ==> value-parameter context: TranslationContext defined in org.jetbrains.kotlin.js.translate.expression.CatchTranslator.<init>[ValueParameterDescriptorImpl]

'catches' @ [69:13] ==> public final val catches: List<KtCatchClause> defined in org.jetbrains.kotlin.js.translate.expression.CatchTranslator[PropertyDescriptorImpl]

'isEmpty' @ [69:21] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'catches' @ [71:26] ==> public final val catches: List<KtCatchClause> defined in org.jetbrains.kotlin.js.translate.expression.CatchTranslator[PropertyDescriptorImpl]

'first' @ [71:34] ==> public fun <T> List<KtCatchClause>.first(): KtCatchClause defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtCatchClause

'firstCatch' @ [72:30] ==> val firstCatch: KtCatchClause defined in org.jetbrains.kotlin.js.translate.expression.CatchTranslator.translate[LocalVariableDescriptor]

'catchParameter' @ [72:41] ==> public final val KtCatchClause.catchParameter: KtParameter?[MyPropertyDescriptor]

'getDescriptorForElement' @ [73:48] ==> @NotNull public open fun getDescriptorForElement(@NotNull context: BindingContext, @NotNull element: PsiElement): DeclarationDescriptor defined in org.jetbrains.kotlin.js.translate.utils.BindingUtils[JavaMethodDescriptor]

'bindingContext' @ [73:72] ==> @NotNull protected/*protected and package*/ open fun bindingContext(): BindingContext defined in org.jetbrains.kotlin.js.translate.expression.CatchTranslator[JavaMethodDescriptor]

'catchParameter' @ [73:90] ==> val catchParameter: KtParameter? defined in org.jetbrains.kotlin.js.translate.expression.CatchTranslator.translate[LocalVariableDescriptor]

'context' @ [74:29] ==> @NotNull protected/*protected and package*/ open fun context(): TranslationContext defined in org.jetbrains.kotlin.js.translate.expression.CatchTranslator[JavaMethodDescriptor]

'getNameForDescriptor' @ [74:39] ==> @NotNull public open fun getNameForDescriptor(@NotNull descriptor: DeclarationDescriptor): JsName defined in org.jetbrains.kotlin.js.translate.context.TranslationContext[JavaMethodDescriptor]

'parameterDescriptor' @ [74:60] ==> val parameterDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.js.translate.expression.CatchTranslator.translate[LocalVariableDescriptor]

'ident' @ [74:81] ==> public final val JsName.ident: String[MyPropertyDescriptor]

'JsCatch' @ [76:23] ==> public constructor JsCatch(p0: (JsScope..JsScope?), @NotNull p1: String) defined in org.jetbrains.kotlin.js.backend.ast.JsCatch[JavaClassConstructorDescriptor]

'context' @ [76:31] ==> @NotNull protected/*protected and package*/ open fun context(): TranslationContext defined in org.jetbrains.kotlin.js.translate.expression.CatchTranslator[JavaMethodDescriptor]

'scope' @ [76:41] ==> @NotNull public open fun scope(): JsScope defined in org.jetbrains.kotlin.js.translate.context.TranslationContext[JavaMethodDescriptor]

'parameterName' @ [76:50] ==> val parameterName: String defined in org.jetbrains.kotlin.js.translate.expression.CatchTranslator.translate[LocalVariableDescriptor]

'jsCatch' @ [77:28] ==> val jsCatch: JsCatch defined in org.jetbrains.kotlin.js.translate.expression.CatchTranslator.translate[LocalVariableDescriptor]

'parameter' @ [77:36] ==> public final val JsCatch.parameter: (JsParameter..JsParameter?)[MyPropertyDescriptor]

'name' @ [77:46] ==> public final var JsParameter.name: JsName[MyPropertyDescriptor]

'makeRef' @ [77:51] ==> @NotNull public open fun makeRef(): JsNameRef defined in org.jetbrains.kotlin.js.backend.ast.JsName[JavaMethodDescriptor]

'context' @ [78:28] ==> @NotNull protected/*protected and package*/ open fun context(): TranslationContext defined in org.jetbrains.kotlin.js.translate.expression.CatchTranslator[JavaMethodDescriptor]

'innerContextWithAliased' @ [78:38] ==> @NotNull public open fun innerContextWithAliased(@NotNull correspondingDescriptor: DeclarationDescriptor, @NotNull alias: JsExpression): TranslationContext defined in org.jetbrains.kotlin.js.translate.context.TranslationContext[JavaMethodDescriptor]

'parameterDescriptor' @ [78:62] ==> val parameterDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.js.translate.expression.CatchTranslator.translate[LocalVariableDescriptor]

'parameterRef' @ [78:83] ==> val parameterRef: JsNameRef defined in org.jetbrains.kotlin.js.translate.expression.CatchTranslator.translate[LocalVariableDescriptor]

'jsCatch' @ [80:9] ==> val jsCatch: JsCatch defined in org.jetbrains.kotlin.js.translate.expression.CatchTranslator.translate[LocalVariableDescriptor]

'body' @ [80:17] ==> public final var JsCatch.body: (JsBlock..JsBlock?)[MyPropertyDescriptor]

'JsBlock' @ [80:24] ==> public constructor JsBlock(p0: (JsStatement..JsStatement?)) defined in org.jetbrains.kotlin.js.backend.ast.JsBlock[JavaClassConstructorDescriptor]

'translateCatches' @ [80:32] ==> private final fun translateCatches(context: TranslationContext, initialCatchParameterRef: JsNameRef, catches: Iterator<KtCatchClause>): JsStatement defined in org.jetbrains.kotlin.js.translate.expression.CatchTranslator[SimpleFunctionDescriptorImpl]

'catchContext' @ [80:49] ==> val catchContext: TranslationContext defined in org.jetbrains.kotlin.js.translate.expression.CatchTranslator.translate[LocalVariableDescriptor]

'parameterRef' @ [80:63] ==> val parameterRef: JsNameRef defined in org.jetbrains.kotlin.js.translate.expression.CatchTranslator.translate[LocalVariableDescriptor]

'catches' @ [80:77] ==> public final val catches: List<KtCatchClause> defined in org.jetbrains.kotlin.js.translate.expression.CatchTranslator[PropertyDescriptorImpl]

'iterator' @ [80:85] ==> public abstract fun iterator(): Iterator<KtCatchClause> defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'jsCatch' @ [82:16] ==> val jsCatch: JsCatch defined in org.jetbrains.kotlin.js.translate.expression.CatchTranslator.translate[LocalVariableDescriptor]

'!' @ [90:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'catches' @ [90:14] ==> value-parameter catches: Iterator<KtCatchClause> defined in org.jetbrains.kotlin.js.translate.expression.CatchTranslator.translateCatches[ValueParameterDescriptorImpl]

'hasNext' @ [90:22] ==> public abstract operator fun hasNext(): Boolean defined in kotlin.collections.Iterator[DeserializedSimpleFunctionDescriptor]

'JsThrow' @ [91:20] ==> public constructor JsThrow(p0: (JsExpression..JsExpression?)) defined in org.jetbrains.kotlin.js.backend.ast.JsThrow[JavaClassConstructorDescriptor]

'initialCatchParameterRef' @ [91:28] ==> value-parameter initialCatchParameterRef: JsNameRef defined in org.jetbrains.kotlin.js.translate.expression.CatchTranslator.translateCatches[ValueParameterDescriptorImpl]

'apply' @ [91:54] ==> @InlineOnly public inline fun <T> JsThrow.apply(block: JsThrow.() -> Unit): JsThrow defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsThrow

'source' @ [91:62] ==> public final var JsThrow.source: (Any..Any?)[MyPropertyDescriptor]

'psi' @ [91:71] ==> public final val psi: PsiElement defined in org.jetbrains.kotlin.js.translate.expression.CatchTranslator[PropertyDescriptorImpl]

'context' @ [94:27] ==> value-parameter context: TranslationContext defined in org.jetbrains.kotlin.js.translate.expression.CatchTranslator.translateCatches[ValueParameterDescriptorImpl]

'catches' @ [96:21] ==> value-parameter catches: Iterator<KtCatchClause> defined in org.jetbrains.kotlin.js.translate.expression.CatchTranslator.translateCatches[ValueParameterDescriptorImpl]

'next' @ [96:29] ==> public abstract operator fun next(): KtCatchClause defined in kotlin.collections.Iterator[DeserializedSimpleFunctionDescriptor]

'catch' @ [97:21] ==> val catch: KtCatchClause defined in org.jetbrains.kotlin.js.translate.expression.CatchTranslator.translateCatches[LocalVariableDescriptor]

'catchParameter' @ [97:27] ==> public final val KtCatchClause.catchParameter: KtParameter?[MyPropertyDescriptor]

'getDescriptorForElement' @ [98:48] ==> @NotNull public open fun getDescriptorForElement(@NotNull context: BindingContext, @NotNull element: PsiElement): DeclarationDescriptor defined in org.jetbrains.kotlin.js.translate.utils.BindingUtils[JavaMethodDescriptor]

'bindingContext' @ [98:72] ==> @NotNull protected/*protected and package*/ open fun bindingContext(): BindingContext defined in org.jetbrains.kotlin.js.translate.expression.CatchTranslator[JavaMethodDescriptor]

'catch' @ [98:90] ==> val catch: KtCatchClause defined in org.jetbrains.kotlin.js.translate.expression.CatchTranslator.translateCatches[LocalVariableDescriptor]

'catchParameter' @ [98:96] ==> public final val KtCatchClause.catchParameter: KtParameter?[MyPropertyDescriptor]

'context' @ [99:29] ==> @NotNull protected/*protected and package*/ open fun context(): TranslationContext defined in org.jetbrains.kotlin.js.translate.expression.CatchTranslator[JavaMethodDescriptor]

'getNameForDescriptor' @ [99:39] ==> @NotNull public open fun getNameForDescriptor(@NotNull descriptor: DeclarationDescriptor): JsName defined in org.jetbrains.kotlin.js.translate.context.TranslationContext[JavaMethodDescriptor]

'parameterDescriptor' @ [99:60] ==> val parameterDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.js.translate.expression.CatchTranslator.translateCatches[LocalVariableDescriptor]

'param' @ [100:25] ==> val param: KtParameter defined in org.jetbrains.kotlin.js.translate.expression.CatchTranslator.translateCatches[LocalVariableDescriptor]

'typeReference' @ [100:31] ==> public final var KtParameter.typeReference: KtTypeReference?[MyPropertyDescriptor]

'mutableListOf' @ [102:36] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableListOf(): MutableList<JsStatement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsStatement

'if (parameterName.ident != initialCatchParameterRef.ident) {
            val parameterAlias = JsScope.declareTemporaryName(parameterName.ident)
            additionalStatements += JsAstUtils.newVar(parameterAlias, initialCatchParameterRef)
            val ref = JsAstUtils.pureFqn(parameterAlias, null)
            ref
        }
        else {
            initialCatchParameterRef
        }' @ [103:28] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: JsNameRef, elseBranch: JsNameRef): JsNameRef[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> JsNameRef

'parameterName' @ [103:32] ==> val parameterName: JsName defined in org.jetbrains.kotlin.js.translate.expression.CatchTranslator.translateCatches[LocalVariableDescriptor]

'ident' @ [103:46] ==> public final val JsName.ident: String[MyPropertyDescriptor]

'initialCatchParameterRef' @ [103:55] ==> value-parameter initialCatchParameterRef: JsNameRef defined in org.jetbrains.kotlin.js.translate.expression.CatchTranslator.translateCatches[ValueParameterDescriptorImpl]

'ident' @ [103:80] ==> public final val JsNameRef.ident: String[MyPropertyDescriptor]

'declareTemporaryName' @ [104:42] ==> @NotNull public open fun declareTemporaryName(@NotNull p0: String): JsName defined in org.jetbrains.kotlin.js.backend.ast.JsScope[JavaMethodDescriptor]

'parameterName' @ [104:63] ==> val parameterName: JsName defined in org.jetbrains.kotlin.js.translate.expression.CatchTranslator.translateCatches[LocalVariableDescriptor]

'ident' @ [104:77] ==> public final val JsName.ident: String[MyPropertyDescriptor]

'additionalStatements' @ [105:13] ==> val additionalStatements: MutableList<JsStatement> defined in org.jetbrains.kotlin.js.translate.expression.CatchTranslator.translateCatches[LocalVariableDescriptor]

'newVar' @ [105:48] ==> @NotNull public open fun newVar(@NotNull name: JsName, @Nullable expr: JsExpression?): JsVars defined in org.jetbrains.kotlin.js.translate.utils.JsAstUtils[JavaMethodDescriptor]

'parameterAlias' @ [105:55] ==> val parameterAlias: JsName defined in org.jetbrains.kotlin.js.translate.expression.CatchTranslator.translateCatches[LocalVariableDescriptor]

'initialCatchParameterRef' @ [105:71] ==> value-parameter initialCatchParameterRef: JsNameRef defined in org.jetbrains.kotlin.js.translate.expression.CatchTranslator.translateCatches[ValueParameterDescriptorImpl]

'pureFqn' @ [106:34] ==> @NotNull public open fun pureFqn(@NotNull identifier: JsName, @Nullable qualifier: JsExpression?): JsNameRef defined in org.jetbrains.kotlin.js.translate.utils.JsAstUtils[JavaMethodDescriptor]

'parameterAlias' @ [106:42] ==> val parameterAlias: JsName defined in org.jetbrains.kotlin.js.translate.expression.CatchTranslator.translateCatches[LocalVariableDescriptor]

'ref' @ [107:13] ==> val ref: JsNameRef defined in org.jetbrains.kotlin.js.translate.expression.CatchTranslator.translateCatches[LocalVariableDescriptor]

'initialCatchParameterRef' @ [110:13] ==> value-parameter initialCatchParameterRef: JsNameRef defined in org.jetbrains.kotlin.js.translate.expression.CatchTranslator.translateCatches[ValueParameterDescriptorImpl]

'nextContext' @ [112:9] ==> var nextContext: TranslationContext defined in org.jetbrains.kotlin.js.translate.expression.CatchTranslator.translateCatches[LocalVariableDescriptor]

'nextContext' @ [112:23] ==> var nextContext: TranslationContext defined in org.jetbrains.kotlin.js.translate.expression.CatchTranslator.translateCatches[LocalVariableDescriptor]

'innerContextWithAliased' @ [112:35] ==> @NotNull public open fun innerContextWithAliased(@NotNull correspondingDescriptor: DeclarationDescriptor, @NotNull alias: JsExpression): TranslationContext defined in org.jetbrains.kotlin.js.translate.context.TranslationContext[JavaMethodDescriptor]

'parameterDescriptor' @ [112:59] ==> val parameterDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.js.translate.expression.CatchTranslator.translateCatches[LocalVariableDescriptor]

'parameterRef' @ [112:80] ==> val parameterRef: JsNameRef defined in org.jetbrains.kotlin.js.translate.expression.CatchTranslator.translateCatches[LocalVariableDescriptor]

'translateCatchBody' @ [113:25] ==> private final fun translateCatchBody(context: TranslationContext, catchClause: KtCatchClause): JsBlock defined in org.jetbrains.kotlin.js.translate.expression.CatchTranslator[SimpleFunctionDescriptorImpl]

'nextContext' @ [113:44] ==> var nextContext: TranslationContext defined in org.jetbrains.kotlin.js.translate.expression.CatchTranslator.translateCatches[LocalVariableDescriptor]

'catch' @ [113:57] ==> val catch: KtCatchClause defined in org.jetbrains.kotlin.js.translate.expression.CatchTranslator.translateCatches[LocalVariableDescriptor]

'thenBlock' @ [114:9] ==> val thenBlock: JsBlock defined in org.jetbrains.kotlin.js.translate.expression.CatchTranslator.translateCatches[LocalVariableDescriptor]

'statements' @ [114:19] ==> public final val JsBlock.statements: (MutableList<(JsStatement..JsStatement?)>..List<(JsStatement..JsStatement?)>)[MyPropertyDescriptor]

'addAll' @ [114:30] ==> public abstract fun addAll(index: Int, elements: Collection<(JsStatement..JsStatement?)>): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'additionalStatements' @ [114:40] ==> val additionalStatements: MutableList<JsStatement> defined in org.jetbrains.kotlin.js.translate.expression.CatchTranslator.translateCatches[LocalVariableDescriptor]

'paramType' @ [116:13] ==> val paramType: KtTypeReference defined in org.jetbrains.kotlin.js.translate.expression.CatchTranslator.translateCatches[LocalVariableDescriptor]

'isDynamic' @ [116:23] ==> private final val KtTypeReference.isDynamic: Boolean defined in org.jetbrains.kotlin.js.translate.expression.CatchTranslator[PropertyDescriptorImpl]

'thenBlock' @ [116:41] ==> val thenBlock: JsBlock defined in org.jetbrains.kotlin.js.translate.expression.CatchTranslator.translateCatches[LocalVariableDescriptor]

'with' @ [119:25] ==> @InlineOnly public inline fun <T, R> with(receiver: PatternTranslator, block: (PatternTranslator).() -> JsExpression?): JsExpression? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PatternTranslator
    <R> -> JsExpression?

'patternTranslator' @ [119:31] ==> @NotNull public open fun patternTranslator(@NotNull context: TranslationContext): PatternTranslator defined in org.jetbrains.kotlin.js.translate.general.Translation[JavaMethodDescriptor]

'nextContext' @ [119:49] ==> var nextContext: TranslationContext defined in org.jetbrains.kotlin.js.translate.expression.CatchTranslator.translateCatches[LocalVariableDescriptor]

'translateIsCheck' @ [120:13] ==> @Nullable public open fun translateIsCheck(@NotNull subject: JsExpression, @NotNull targetTypeReference: KtTypeReference): JsExpression? defined in org.jetbrains.kotlin.js.translate.expression.PatternTranslator[JavaMethodDescriptor]

'initialCatchParameterRef' @ [120:30] ==> value-parameter initialCatchParameterRef: JsNameRef defined in org.jetbrains.kotlin.js.translate.expression.CatchTranslator.translateCatches[ValueParameterDescriptorImpl]

'paramType' @ [120:56] ==> val paramType: KtTypeReference defined in org.jetbrains.kotlin.js.translate.expression.CatchTranslator.translateCatches[LocalVariableDescriptor]

'translateCatches' @ [123:25] ==> private final fun translateCatches(context: TranslationContext, initialCatchParameterRef: JsNameRef, catches: Iterator<KtCatchClause>): JsStatement defined in org.jetbrains.kotlin.js.translate.expression.CatchTranslator[SimpleFunctionDescriptorImpl]

'context' @ [123:42] ==> value-parameter context: TranslationContext defined in org.jetbrains.kotlin.js.translate.expression.CatchTranslator.translateCatches[ValueParameterDescriptorImpl]

'initialCatchParameterRef' @ [123:51] ==> value-parameter initialCatchParameterRef: JsNameRef defined in org.jetbrains.kotlin.js.translate.expression.CatchTranslator.translateCatches[ValueParameterDescriptorImpl]

'catches' @ [123:77] ==> value-parameter catches: Iterator<KtCatchClause> defined in org.jetbrains.kotlin.js.translate.expression.CatchTranslator.translateCatches[ValueParameterDescriptorImpl]

'JsIf' @ [124:16] ==> public constructor JsIf(@NotNull p0: JsExpression, @NotNull p1: JsStatement, @Nullable p2: JsStatement?) defined in org.jetbrains.kotlin.js.backend.ast.JsIf[JavaClassConstructorDescriptor]

'typeCheck' @ [124:21] ==> val typeCheck: JsExpression defined in org.jetbrains.kotlin.js.translate.expression.CatchTranslator.translateCatches[LocalVariableDescriptor]

'source' @ [124:31] ==> public open fun source(p0: (Any..Any?)): (JsExpression..JsExpression?) defined in org.jetbrains.kotlin.js.backend.ast.JsExpression[JavaMethodDescriptor]

'catch' @ [124:38] ==> val catch: KtCatchClause defined in org.jetbrains.kotlin.js.translate.expression.CatchTranslator.translateCatches[LocalVariableDescriptor]

'thenBlock' @ [124:46] ==> val thenBlock: JsBlock defined in org.jetbrains.kotlin.js.translate.expression.CatchTranslator.translateCatches[LocalVariableDescriptor]

'elseBlock' @ [124:57] ==> val elseBlock: JsStatement defined in org.jetbrains.kotlin.js.translate.expression.CatchTranslator.translateCatches[LocalVariableDescriptor]

'apply' @ [124:68] ==> @InlineOnly public inline fun <T> JsIf.apply(block: JsIf.() -> Unit): JsIf defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsIf

'source' @ [124:76] ==> public final var JsIf.source: (Any..Any?)[MyPropertyDescriptor]

'catch' @ [124:85] ==> val catch: KtCatchClause defined in org.jetbrains.kotlin.js.translate.expression.CatchTranslator.translateCatches[LocalVariableDescriptor]

'catchClause' @ [128:25] ==> value-parameter catchClause: KtCatchClause defined in org.jetbrains.kotlin.js.translate.expression.CatchTranslator.translateCatchBody[ValueParameterDescriptorImpl]

'catchBody' @ [128:37] ==> public final val KtCatchClause.catchBody: KtExpression?[MyPropertyDescriptor]

'if (catchBody != null) {
            translateAsStatementAndMergeInBlockIfNeeded(catchBody, context)
        }
        else {
            JsAstUtils.asSyntheticStatement(JsNullLiteral())
        }' @ [129:27] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (JsStatement..JsStatement?), elseBranch: (JsStatement..JsStatement?)): (JsStatement..JsStatement?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (org.jetbrains.kotlin.js.backend.ast.JsStatement..org.jetbrains.kotlin.js.backend.ast.JsStatement?)

'catchBody' @ [129:31] ==> val catchBody: KtExpression? defined in org.jetbrains.kotlin.js.translate.expression.CatchTranslator.translateCatchBody[LocalVariableDescriptor]

'translateAsStatementAndMergeInBlockIfNeeded' @ [130:13] ==> @NotNull public open fun translateAsStatementAndMergeInBlockIfNeeded(@NotNull expression: KtExpression, @NotNull context: TranslationContext): JsStatement defined in org.jetbrains.kotlin.js.translate.general.Translation[JavaMethodDescriptor]

'catchBody' @ [130:57] ==> val catchBody: KtExpression? defined in org.jetbrains.kotlin.js.translate.expression.CatchTranslator.translateCatchBody[LocalVariableDescriptor]

'context' @ [130:68] ==> value-parameter context: TranslationContext defined in org.jetbrains.kotlin.js.translate.expression.CatchTranslator.translateCatchBody[ValueParameterDescriptorImpl]

'asSyntheticStatement' @ [133:24] ==> public open fun asSyntheticStatement(@NotNull expression: JsExpression): (JsStatement..JsStatement?) defined in org.jetbrains.kotlin.js.translate.utils.JsAstUtils[JavaMethodDescriptor]

'JsNullLiteral' @ [133:45] ==> public constructor JsNullLiteral() defined in org.jetbrains.kotlin.js.backend.ast.JsNullLiteral[JavaClassConstructorDescriptor]

'convertToBlock' @ [136:16] ==> @NotNull public open fun convertToBlock(@NotNull jsNode: JsNode): JsBlock defined in org.jetbrains.kotlin.js.translate.utils.JsAstUtils[JavaMethodDescriptor]

'jsCatchBody' @ [136:31] ==> val jsCatchBody: (JsStatement..JsStatement?) defined in org.jetbrains.kotlin.js.translate.expression.CatchTranslator.translateCatchBody[LocalVariableDescriptor]

'getNotNull' @ [140:17] ==> @NotNull public open fun <K : (Any..Any?), V : (Any..Any?)> getNotNull(@NotNull p0: BindingContext, @NotNull p1: ReadOnlySlice<(KtTypeReference..KtTypeReference?), (KotlinType..KotlinType?)>, @NotNull p2: KtTypeReference): KotlinType defined in org.jetbrains.kotlin.resolve.BindingContextUtils[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> KtTypeReference
    <V : (Any..Any?)> -> KotlinType

'bindingContext' @ [140:28] ==> @NotNull protected/*protected and package*/ open fun bindingContext(): BindingContext defined in org.jetbrains.kotlin.js.translate.expression.CatchTranslator[JavaMethodDescriptor]

'TYPE' @ [140:61] ==> public final val TYPE: (WritableSlice<(KtTypeReference..KtTypeReference?), (KotlinType..KotlinType?)>..WritableSlice<(KtTypeReference..KtTypeReference?), (KotlinType..KotlinType?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'this' @ [140:67] ==> <this> defined in org.jetbrains.kotlin.js.translate.expression.CatchTranslator.isDynamic[ReceiverParameterDescriptorImpl]

'isDynamic' @ [140:73] ==> public fun KotlinType.isDynamic(): Boolean defined in org.jetbrains.kotlin.types[DeserializedSimpleFunctionDescriptor]

