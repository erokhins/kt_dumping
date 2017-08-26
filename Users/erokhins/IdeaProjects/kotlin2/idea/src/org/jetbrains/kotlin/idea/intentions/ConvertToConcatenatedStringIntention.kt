'SelfTargetingOffsetIndependentIntention<KtStringTemplateExpression>' @ [26:46] ==> public constructor SelfTargetingOffsetIndependentIntention<TElement : KtElement>(elementType: Class<KtStringTemplateExpression>, text: String, familyName: String = ...) defined in org.jetbrains.kotlin.idea.intentions.SelfTargetingOffsetIndependentIntention[DeserializedClassConstructorDescriptor]
Inferred types:
    <TElement : KtElement> -> KtStringTemplateExpression

'KtStringTemplateExpression' @ [26:114] ==> public constructor KtStringTemplateExpression(@NotNull p0: ASTNode) defined in org.jetbrains.kotlin.psi.KtStringTemplateExpression[JavaClassConstructorDescriptor]

'java' @ [26:148] ==> public val <T> KClass<KtStringTemplateExpression>.java: Class<KtStringTemplateExpression> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtStringTemplateExpression

'element' @ [28:13] ==> value-parameter element: KtStringTemplateExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertToConcatenatedStringIntention.isApplicableTo[ValueParameterDescriptorImpl]

'lastChild' @ [28:21] ==> public final val KtStringTemplateExpression.lastChild: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'node' @ [28:31] ==> public final val PsiElement.node: (ASTNode..ASTNode?)[MyPropertyDescriptor]

'elementType' @ [28:36] ==> public final val ASTNode.elementType: IElementType[MyPropertyDescriptor]

'CLOSING_QUOTE' @ [28:60] ==> public final val CLOSING_QUOTE: (KtToken..KtToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'element' @ [29:16] ==> value-parameter element: KtStringTemplateExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertToConcatenatedStringIntention.isApplicableTo[ValueParameterDescriptorImpl]

'entries' @ [29:24] ==> public final val KtStringTemplateExpression.entries: (Array<(KtStringTemplateEntry..KtStringTemplateEntry?)>..Array<out (KtStringTemplateEntry..KtStringTemplateEntry?)>)[MyPropertyDescriptor]

'any' @ [29:32] ==> public inline fun <T> Array<out (KtStringTemplateEntry..KtStringTemplateEntry?)>.any(predicate: ((KtStringTemplateEntry..KtStringTemplateEntry?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtStringTemplateEntry..org.jetbrains.kotlin.psi.KtStringTemplateEntry?)

'it' @ [29:38] ==> value-parameter it: (KtStringTemplateEntry..KtStringTemplateEntry?) defined in org.jetbrains.kotlin.idea.intentions.ConvertToConcatenatedStringIntention.isApplicableTo.<anonymous>[ValueParameterDescriptorImpl]

'isTripleQuoted' @ [33:28] ==> private final fun isTripleQuoted(str: String): Boolean defined in org.jetbrains.kotlin.idea.intentions.ConvertToConcatenatedStringIntention[SimpleFunctionDescriptorImpl]

'element' @ [33:43] ==> value-parameter element: KtStringTemplateExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertToConcatenatedStringIntention.applyTo[ValueParameterDescriptorImpl]

'text' @ [33:51] ==> public final val KtStringTemplateExpression.text: (String..String?)[MyPropertyDescriptor]

'if (tripleQuoted) "\"\"\"" else "\""' @ [34:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'tripleQuoted' @ [34:25] ==> val tripleQuoted: Boolean defined in org.jetbrains.kotlin.idea.intentions.ConvertToConcatenatedStringIntention.applyTo[LocalVariableDescriptor]

'element' @ [35:23] ==> value-parameter element: KtStringTemplateExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertToConcatenatedStringIntention.applyTo[ValueParameterDescriptorImpl]

'entries' @ [35:31] ==> public final val KtStringTemplateExpression.entries: (Array<(KtStringTemplateEntry..KtStringTemplateEntry?)>..Array<out (KtStringTemplateEntry..KtStringTemplateEntry?)>)[MyPropertyDescriptor]

'entries' @ [37:20] ==> val entries: (Array<(KtStringTemplateEntry..KtStringTemplateEntry?)>..Array<out (KtStringTemplateEntry..KtStringTemplateEntry?)>) defined in org.jetbrains.kotlin.idea.intentions.ConvertToConcatenatedStringIntention.applyTo[LocalVariableDescriptor]

'filterNot' @ [38:18] ==> public inline fun <T> Array<out (KtStringTemplateEntry..KtStringTemplateEntry?)>.filterNot(predicate: ((KtStringTemplateEntry..KtStringTemplateEntry?)) -> Boolean): List<(KtStringTemplateEntry..KtStringTemplateEntry?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtStringTemplateEntry..org.jetbrains.kotlin.psi.KtStringTemplateEntry?)

'it' @ [38:30] ==> value-parameter it: (KtStringTemplateEntry..KtStringTemplateEntry?) defined in org.jetbrains.kotlin.idea.intentions.ConvertToConcatenatedStringIntention.applyTo.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [38:75] ==> value-parameter it: (KtStringTemplateEntry..KtStringTemplateEntry?) defined in org.jetbrains.kotlin.idea.intentions.ConvertToConcatenatedStringIntention.applyTo.<anonymous>[ValueParameterDescriptorImpl]

'expression' @ [38:78] ==> public final val KtStringTemplateEntryWithExpression.expression: KtExpression?[MyPropertyDescriptor]

'mapIndexed' @ [39:18] ==> public inline fun <T, R> Iterable<(KtStringTemplateEntry..KtStringTemplateEntry?)>.mapIndexed(transform: (index: Int, (KtStringTemplateEntry..KtStringTemplateEntry?)) -> String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtStringTemplateEntry..org.jetbrains.kotlin.psi.KtStringTemplateEntry?)
    <R> -> String

'entry' @ [40:21] ==> value-parameter entry: (KtStringTemplateEntry..KtStringTemplateEntry?) defined in org.jetbrains.kotlin.idea.intentions.ConvertToConcatenatedStringIntention.applyTo.<anonymous>[ValueParameterDescriptorImpl]

'toSeparateString' @ [40:27] ==> private final fun KtStringTemplateEntry.toSeparateString(quote: String, convertExplicitly: Boolean, isFinalEntry: Boolean): String defined in org.jetbrains.kotlin.idea.intentions.ConvertToConcatenatedStringIntention[SimpleFunctionDescriptorImpl]

'quote' @ [40:44] ==> val quote: String defined in org.jetbrains.kotlin.idea.intentions.ConvertToConcatenatedStringIntention.applyTo[LocalVariableDescriptor]

'index' @ [40:72] ==> value-parameter index: Int defined in org.jetbrains.kotlin.idea.intentions.ConvertToConcatenatedStringIntention.applyTo.<anonymous>[ValueParameterDescriptorImpl]

'index' @ [40:101] ==> value-parameter index: Int defined in org.jetbrains.kotlin.idea.intentions.ConvertToConcatenatedStringIntention.applyTo.<anonymous>[ValueParameterDescriptorImpl]

'entries' @ [40:110] ==> val entries: (Array<(KtStringTemplateEntry..KtStringTemplateEntry?)>..Array<out (KtStringTemplateEntry..KtStringTemplateEntry?)>) defined in org.jetbrains.kotlin.idea.intentions.ConvertToConcatenatedStringIntention.applyTo[LocalVariableDescriptor]

'lastIndex' @ [40:118] ==> public val <T> Array<out (KtStringTemplateEntry..KtStringTemplateEntry?)>.lastIndex: Int defined in kotlin.collections[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtStringTemplateEntry..org.jetbrains.kotlin.psi.KtStringTemplateEntry?)

'joinToString' @ [42:18] ==> public fun <T> Iterable<String>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((String) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'replace' @ [43:18] ==> public fun String.replace(oldValue: String, newValue: String, ignoreCase: Boolean = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'quote' @ [43:30] ==> val quote: String defined in org.jetbrains.kotlin.idea.intentions.ConvertToConcatenatedStringIntention.applyTo[LocalVariableDescriptor]

'quote' @ [43:37] ==> val quote: String defined in org.jetbrains.kotlin.idea.intentions.ConvertToConcatenatedStringIntention.applyTo[LocalVariableDescriptor]

'KtPsiFactory' @ [45:27] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'element' @ [45:40] ==> value-parameter element: KtStringTemplateExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertToConcatenatedStringIntention.applyTo[ValueParameterDescriptorImpl]

'createExpression' @ [45:49] ==> public final fun createExpression(text: String): KtExpression defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'text' @ [45:66] ==> val text: String defined in org.jetbrains.kotlin.idea.intentions.ConvertToConcatenatedStringIntention.applyTo[LocalVariableDescriptor]

'element' @ [46:9] ==> value-parameter element: KtStringTemplateExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertToConcatenatedStringIntention.applyTo[ValueParameterDescriptorImpl]

'replace' @ [46:17] ==> public open fun replace(newElement: PsiElement): PsiElement defined in org.jetbrains.kotlin.psi.KtStringTemplateExpression[DeserializedSimpleFunctionDescriptor]

'replacement' @ [46:25] ==> val replacement: KtExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertToConcatenatedStringIntention.applyTo[LocalVariableDescriptor]

'str' @ [49:47] ==> value-parameter str: String defined in org.jetbrains.kotlin.idea.intentions.ConvertToConcatenatedStringIntention.isTripleQuoted[ValueParameterDescriptorImpl]

'startsWith' @ [49:51] ==> public fun String.startsWith(prefix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'str' @ [49:75] ==> value-parameter str: String defined in org.jetbrains.kotlin.idea.intentions.ConvertToConcatenatedStringIntention.isTripleQuoted[ValueParameterDescriptorImpl]

'endsWith' @ [49:79] ==> public fun String.endsWith(suffix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'this' @ [52:13] ==> <this> defined in org.jetbrains.kotlin.idea.intentions.ConvertToConcatenatedStringIntention.toSeparateString[ReceiverParameterDescriptorImpl]

'text' @ [53:20] ==> public final val KtStringTemplateEntry.text: (String..String?)[MyPropertyDescriptor]

'quote' @ [53:25] ==> private final fun String.quote(quote: String): String defined in org.jetbrains.kotlin.idea.intentions.ConvertToConcatenatedStringIntention[SimpleFunctionDescriptorImpl]

'quote' @ [53:31] ==> value-parameter quote: String defined in org.jetbrains.kotlin.idea.intentions.ConvertToConcatenatedStringIntention.toSeparateString[ValueParameterDescriptorImpl]

'expression' @ [56:26] ==> public final val KtStringTemplateEntryWithExpression.expression: KtExpression?[MyPropertyDescriptor]

'if (needsParenthesis(expression, isFinalEntry))
            "(" + expression.text + ")"
        else
            expression.text' @ [58:20] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (String..String?), elseBranch: (String..String?)): (String..String?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (kotlin.String..kotlin.String?)

'needsParenthesis' @ [58:24] ==> private final fun needsParenthesis(expression: KtExpression, isFinalEntry: Boolean): Boolean defined in org.jetbrains.kotlin.idea.intentions.ConvertToConcatenatedStringIntention[SimpleFunctionDescriptorImpl]

'expression' @ [58:41] ==> val expression: KtExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertToConcatenatedStringIntention.toSeparateString[LocalVariableDescriptor]

'isFinalEntry' @ [58:53] ==> value-parameter isFinalEntry: Boolean defined in org.jetbrains.kotlin.idea.intentions.ConvertToConcatenatedStringIntention.toSeparateString[ValueParameterDescriptorImpl]

'+' @ [59:13] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'expression' @ [59:19] ==> val expression: KtExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertToConcatenatedStringIntention.toSeparateString[LocalVariableDescriptor]

'text' @ [59:30] ==> public final val KtExpression.text: (String..String?)[MyPropertyDescriptor]

'expression' @ [61:13] ==> val expression: KtExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertToConcatenatedStringIntention.toSeparateString[LocalVariableDescriptor]

'text' @ [61:24] ==> public final val KtExpression.text: (String..String?)[MyPropertyDescriptor]

'if (convertExplicitly && !expression.isStringExpression())
            text + ".toString()"
        else
            text' @ [63:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'convertExplicitly' @ [63:20] ==> value-parameter convertExplicitly: Boolean defined in org.jetbrains.kotlin.idea.intentions.ConvertToConcatenatedStringIntention.toSeparateString[ValueParameterDescriptorImpl]

'!' @ [63:41] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'expression' @ [63:42] ==> val expression: KtExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertToConcatenatedStringIntention.toSeparateString[LocalVariableDescriptor]

'isStringExpression' @ [63:53] ==> private final fun KtExpression.isStringExpression(): Boolean defined in org.jetbrains.kotlin.idea.intentions.ConvertToConcatenatedStringIntention[SimpleFunctionDescriptorImpl]

'text' @ [64:13] ==> val text: (String..String?) defined in org.jetbrains.kotlin.idea.intentions.ConvertToConcatenatedStringIntention.toSeparateString[LocalVariableDescriptor]

'text' @ [66:13] ==> val text: (String..String?) defined in org.jetbrains.kotlin.idea.intentions.ConvertToConcatenatedStringIntention.toSeparateString[LocalVariableDescriptor]

'when (expression) {
            is KtBinaryExpression -> true
            is KtIfExpression -> expression.`else` !is KtBlockExpression && !isFinalEntry
            else -> false
        }' @ [70:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean, entry2: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'expression' @ [70:22] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertToConcatenatedStringIntention.needsParenthesis[ValueParameterDescriptorImpl]

'expression' @ [72:34] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertToConcatenatedStringIntention.needsParenthesis[ValueParameterDescriptorImpl]

'`else`' @ [72:45] ==> public final val KtIfExpression.`else`: KtExpression?[MyPropertyDescriptor]

'!' @ [72:77] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isFinalEntry' @ [72:78] ==> value-parameter isFinalEntry: Boolean defined in org.jetbrains.kotlin.idea.intentions.ConvertToConcatenatedStringIntention.needsParenthesis[ValueParameterDescriptorImpl]

'quote' @ [77:47] ==> value-parameter quote: String defined in org.jetbrains.kotlin.idea.intentions.ConvertToConcatenatedStringIntention.quote[ValueParameterDescriptorImpl]

'this' @ [77:55] ==> <this> defined in org.jetbrains.kotlin.idea.intentions.ConvertToConcatenatedStringIntention.quote[ReceiverParameterDescriptorImpl]

'quote' @ [77:62] ==> value-parameter quote: String defined in org.jetbrains.kotlin.idea.intentions.ConvertToConcatenatedStringIntention.quote[ValueParameterDescriptorImpl]

'isString' @ [79:68] ==> public open fun isString(@Nullable p0: KotlinType?): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'analyze' @ [79:77] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'getType' @ [79:87] ==> @Nullable public abstract fun getType(@NotNull p0: KtExpression): KotlinType? defined in org.jetbrains.kotlin.resolve.BindingContext[JavaMethodDescriptor]

'this' @ [79:95] ==> <this> defined in org.jetbrains.kotlin.idea.intentions.ConvertToConcatenatedStringIntention.isStringExpression[ReceiverParameterDescriptorImpl]

