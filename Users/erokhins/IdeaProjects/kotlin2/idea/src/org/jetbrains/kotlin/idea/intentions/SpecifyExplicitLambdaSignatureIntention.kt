'SelfTargetingIntention<KtLambdaExpression>' @ [33:49] ==> public constructor SelfTargetingIntention<TElement : PsiElement>(elementType: Class<KtLambdaExpression>, text: String, familyName: String = ...) defined in org.jetbrains.kotlin.idea.intentions.SelfTargetingIntention[DeserializedClassConstructorDescriptor]
Inferred types:
    <TElement : PsiElement> -> KtLambdaExpression

'KtLambdaExpression' @ [33:92] ==> public constructor KtLambdaExpression(p0: (CharSequence..CharSequence?)) defined in org.jetbrains.kotlin.psi.KtLambdaExpression[JavaClassConstructorDescriptor]

'java' @ [33:118] ==> public val <T> KClass<KtLambdaExpression>.java: Class<KtLambdaExpression> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtLambdaExpression

'element' @ [36:21] ==> value-parameter element: KtLambdaExpression defined in org.jetbrains.kotlin.idea.intentions.SpecifyExplicitLambdaSignatureIntention.isApplicableTo[ValueParameterDescriptorImpl]

'functionLiteral' @ [36:29] ==> public final val KtLambdaExpression.functionLiteral: KtFunctionLiteral[MyPropertyDescriptor]

'arrow' @ [36:45] ==> public final val KtFunctionLiteral.arrow: PsiElement?[MyPropertyDescriptor]

'if (arrow != null) {
            if (caretOffset > arrow.endOffset) return false
            if (element.valueParameters.all { it.typeReference != null }) return false
        }
        else {
            if (!element.leftCurlyBrace.textRange.containsOffset(caretOffset)) return false
        }' @ [37:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'arrow' @ [37:13] ==> val arrow: PsiElement? defined in org.jetbrains.kotlin.idea.intentions.SpecifyExplicitLambdaSignatureIntention.isApplicableTo[LocalVariableDescriptor]

'caretOffset' @ [38:17] ==> value-parameter caretOffset: Int defined in org.jetbrains.kotlin.idea.intentions.SpecifyExplicitLambdaSignatureIntention.isApplicableTo[ValueParameterDescriptorImpl]

'arrow' @ [38:31] ==> val arrow: PsiElement? defined in org.jetbrains.kotlin.idea.intentions.SpecifyExplicitLambdaSignatureIntention.isApplicableTo[LocalVariableDescriptor]

'endOffset' @ [38:37] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'element' @ [39:17] ==> value-parameter element: KtLambdaExpression defined in org.jetbrains.kotlin.idea.intentions.SpecifyExplicitLambdaSignatureIntention.isApplicableTo[ValueParameterDescriptorImpl]

'valueParameters' @ [39:25] ==> public final val KtLambdaExpression.valueParameters: (MutableList<(KtParameter..KtParameter?)>..List<(KtParameter..KtParameter?)>)[MyPropertyDescriptor]

'all' @ [39:41] ==> public inline fun <T> Iterable<(KtParameter..KtParameter?)>.all(predicate: ((KtParameter..KtParameter?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtParameter..org.jetbrains.kotlin.psi.KtParameter?)

'it' @ [39:47] ==> value-parameter it: (KtParameter..KtParameter?) defined in org.jetbrains.kotlin.idea.intentions.SpecifyExplicitLambdaSignatureIntention.isApplicableTo.<anonymous>[ValueParameterDescriptorImpl]

'typeReference' @ [39:50] ==> public final var KtParameter.typeReference: KtTypeReference?[MyPropertyDescriptor]

'!' @ [42:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'element' @ [42:18] ==> value-parameter element: KtLambdaExpression defined in org.jetbrains.kotlin.idea.intentions.SpecifyExplicitLambdaSignatureIntention.isApplicableTo[ValueParameterDescriptorImpl]

'leftCurlyBrace' @ [42:26] ==> public final val KtLambdaExpression.leftCurlyBrace: ASTNode[MyPropertyDescriptor]

'textRange' @ [42:41] ==> public final val ASTNode.textRange: (TextRange..TextRange?)[MyPropertyDescriptor]

'containsOffset' @ [42:51] ==> public open fun containsOffset(p0: Int): Boolean defined in com.intellij.openapi.util.TextRange[JavaMethodDescriptor]

'caretOffset' @ [42:66] ==> value-parameter caretOffset: Int defined in org.jetbrains.kotlin.idea.intentions.SpecifyExplicitLambdaSignatureIntention.isApplicableTo[ValueParameterDescriptorImpl]

'element' @ [45:34] ==> value-parameter element: KtLambdaExpression defined in org.jetbrains.kotlin.idea.intentions.SpecifyExplicitLambdaSignatureIntention.isApplicableTo[ValueParameterDescriptorImpl]

'analyze' @ [45:42] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'PARTIAL' @ [45:66] ==> enum entry PARTIAL defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'FUNCTION' @ [45:90] ==> public final val FUNCTION: (WritableSlice<(PsiElement..PsiElement?), (SimpleFunctionDescriptor..SimpleFunctionDescriptor?)>..WritableSlice<(PsiElement..PsiElement?), (SimpleFunctionDescriptor..SimpleFunctionDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'element' @ [45:100] ==> value-parameter element: KtLambdaExpression defined in org.jetbrains.kotlin.idea.intentions.SpecifyExplicitLambdaSignatureIntention.isApplicableTo[ValueParameterDescriptorImpl]

'functionLiteral' @ [45:108] ==> public final val KtLambdaExpression.functionLiteral: KtFunctionLiteral[MyPropertyDescriptor]

'functionDescriptor' @ [46:16] ==> val functionDescriptor: SimpleFunctionDescriptor defined in org.jetbrains.kotlin.idea.intentions.SpecifyExplicitLambdaSignatureIntention.isApplicableTo[LocalVariableDescriptor]

'valueParameters' @ [46:35] ==> public final val SimpleFunctionDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'none' @ [46:51] ==> public inline fun <T> Iterable<(ValueParameterDescriptor..ValueParameterDescriptor?)>.none(predicate: ((ValueParameterDescriptor..ValueParameterDescriptor?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.ValueParameterDescriptor..org.jetbrains.kotlin.descriptors.ValueParameterDescriptor?)

'it' @ [46:58] ==> value-parameter it: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.idea.intentions.SpecifyExplicitLambdaSignatureIntention.isApplicableTo.<anonymous>[ValueParameterDescriptorImpl]

'type' @ [46:61] ==> public final val ValueParameterDescriptor.type: KotlinType[MyPropertyDescriptor]

'isError' @ [46:66] ==> public val KotlinType.isError: Boolean defined in org.jetbrains.kotlin.types[DeserializedPropertyDescriptor]

'IdeDescriptorRenderers' @ [49:77] ==> public object IdeDescriptorRenderers defined in org.jetbrains.kotlin.idea.util[FakeCallableDescriptorForObject]

'SOURCE_CODE' @ [49:100] ==> @field:JvmField public final val SOURCE_CODE: DescriptorRenderer defined in org.jetbrains.kotlin.idea.util.IdeDescriptorRenderers[DeserializedPropertyDescriptor]

'let' @ [49:112] ==> @InlineOnly public inline fun <T, R> DescriptorRenderer.let(block: (DescriptorRenderer) -> String): String defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DescriptorRenderer
    <R> -> String

'psiName' @ [50:12] ==> value-parameter psiName: String? defined in org.jetbrains.kotlin.idea.intentions.SpecifyExplicitLambdaSignatureIntention.render[ValueParameterDescriptorImpl]

'it' @ [50:23] ==> value-parameter it: DescriptorRenderer defined in org.jetbrains.kotlin.idea.intentions.SpecifyExplicitLambdaSignatureIntention.render.<anonymous>[ValueParameterDescriptorImpl]

'renderName' @ [50:26] ==> public abstract fun renderName(name: Name): String defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[DeserializedSimpleFunctionDescriptor]

'name' @ [50:37] ==> public final val ValueParameterDescriptor.name: Name[MyPropertyDescriptor]

'it' @ [50:47] ==> value-parameter it: DescriptorRenderer defined in org.jetbrains.kotlin.idea.intentions.SpecifyExplicitLambdaSignatureIntention.render.<anonymous>[ValueParameterDescriptorImpl]

'renderType' @ [50:50] ==> public abstract fun renderType(type: KotlinType): String defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[DeserializedSimpleFunctionDescriptor]

'type' @ [50:61] ==> public final val ValueParameterDescriptor.type: KotlinType[MyPropertyDescriptor]

'element' @ [54:31] ==> value-parameter element: KtLambdaExpression defined in org.jetbrains.kotlin.idea.intentions.SpecifyExplicitLambdaSignatureIntention.applyTo[ValueParameterDescriptorImpl]

'functionLiteral' @ [54:39] ==> public final val KtLambdaExpression.functionLiteral: KtFunctionLiteral[MyPropertyDescriptor]

'element' @ [55:34] ==> value-parameter element: KtLambdaExpression defined in org.jetbrains.kotlin.idea.intentions.SpecifyExplicitLambdaSignatureIntention.applyTo[ValueParameterDescriptorImpl]

'analyze' @ [55:42] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'PARTIAL' @ [55:66] ==> enum entry PARTIAL defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'FUNCTION' @ [55:90] ==> public final val FUNCTION: (WritableSlice<(PsiElement..PsiElement?), (SimpleFunctionDescriptor..SimpleFunctionDescriptor?)>..WritableSlice<(PsiElement..PsiElement?), (SimpleFunctionDescriptor..SimpleFunctionDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'functionLiteral' @ [55:100] ==> val functionLiteral: KtFunctionLiteral defined in org.jetbrains.kotlin.idea.intentions.SpecifyExplicitLambdaSignatureIntention.applyTo[LocalVariableDescriptor]

'functionDescriptor' @ [57:31] ==> val functionDescriptor: SimpleFunctionDescriptor defined in org.jetbrains.kotlin.idea.intentions.SpecifyExplicitLambdaSignatureIntention.applyTo[LocalVariableDescriptor]

'valueParameters' @ [57:50] ==> public final val SimpleFunctionDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'mapIndexed' @ [58:18] ==> public inline fun <T, R> Iterable<(ValueParameterDescriptor..ValueParameterDescriptor?)>.mapIndexed(transform: (index: Int, (ValueParameterDescriptor..ValueParameterDescriptor?)) -> String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.ValueParameterDescriptor..org.jetbrains.kotlin.descriptors.ValueParameterDescriptor?)
    <R> -> String

'parameterDescriptor' @ [59:21] ==> value-parameter parameterDescriptor: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.idea.intentions.SpecifyExplicitLambdaSignatureIntention.applyTo.<anonymous>[ValueParameterDescriptorImpl]

'render' @ [59:41] ==> private final fun ValueParameterDescriptor.render(psiName: String?): String defined in org.jetbrains.kotlin.idea.intentions.SpecifyExplicitLambdaSignatureIntention[SimpleFunctionDescriptorImpl]

'functionLiteral' @ [59:58] ==> val functionLiteral: KtFunctionLiteral defined in org.jetbrains.kotlin.idea.intentions.SpecifyExplicitLambdaSignatureIntention.applyTo[LocalVariableDescriptor]

'valueParameters' @ [59:74] ==> public final val KtFunctionLiteral.valueParameters: (MutableList<(KtParameter..KtParameter?)>..List<(KtParameter..KtParameter?)>)[MyPropertyDescriptor]

'getOrNull' @ [59:90] ==> public fun <T> List<(KtParameter..KtParameter?)>.getOrNull(index: Int): KtParameter? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtParameter..org.jetbrains.kotlin.psi.KtParameter?)

'index' @ [59:100] ==> value-parameter index: Int defined in org.jetbrains.kotlin.idea.intentions.SpecifyExplicitLambdaSignatureIntention.applyTo.<anonymous>[ValueParameterDescriptorImpl]

'let' @ [59:108] ==> @InlineOnly public inline fun <T, R> KtParameter.let(block: (KtParameter) -> String?): String? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtParameter
    <R> -> String?

'it' @ [60:25] ==> value-parameter it: KtParameter defined in org.jetbrains.kotlin.idea.intentions.SpecifyExplicitLambdaSignatureIntention.applyTo.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [60:28] ==> public final val KtParameter.name: String?[MyPropertyDescriptor]

'it' @ [60:36] ==> value-parameter it: KtParameter defined in org.jetbrains.kotlin.idea.intentions.SpecifyExplicitLambdaSignatureIntention.applyTo.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'destructuringDeclaration' @ [60:39] ==> public final val KtParameter.destructuringDeclaration: KtDestructuringDeclaration?[MyPropertyDescriptor]

'text' @ [60:65] ==> public final val KtDestructuringDeclaration.text: (String..String?)[MyPropertyDescriptor]

'joinToString' @ [63:18] ==> public fun <T> Iterable<String>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((String) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'applyWithParameters' @ [64:9] ==> public final fun applyWithParameters(element: KtLambdaExpression, parameterString: String): Unit defined in org.jetbrains.kotlin.idea.intentions.SpecifyExplicitLambdaSignatureIntention.Companion[SimpleFunctionDescriptorImpl]

'element' @ [64:29] ==> value-parameter element: KtLambdaExpression defined in org.jetbrains.kotlin.idea.intentions.SpecifyExplicitLambdaSignatureIntention.applyTo[ValueParameterDescriptorImpl]

'parameterString' @ [64:38] ==> val parameterString: String defined in org.jetbrains.kotlin.idea.intentions.SpecifyExplicitLambdaSignatureIntention.applyTo[LocalVariableDescriptor]

'KtPsiFactory' @ [69:30] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'element' @ [69:43] ==> value-parameter element: KtLambdaExpression defined in org.jetbrains.kotlin.idea.intentions.SpecifyExplicitLambdaSignatureIntention.Companion.applyWithParameters[ValueParameterDescriptorImpl]

'element' @ [70:35] ==> value-parameter element: KtLambdaExpression defined in org.jetbrains.kotlin.idea.intentions.SpecifyExplicitLambdaSignatureIntention.Companion.applyWithParameters[ValueParameterDescriptorImpl]

'functionLiteral' @ [70:43] ==> public final val KtLambdaExpression.functionLiteral: KtFunctionLiteral[MyPropertyDescriptor]

'psiFactory' @ [71:36] ==> val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.intentions.SpecifyExplicitLambdaSignatureIntention.Companion.applyWithParameters[LocalVariableDescriptor]

'createLambdaParameterListIfAny' @ [71:47] ==> public final fun createLambdaParameterListIfAny(text: String): KtParameterList? defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'parameterString' @ [71:78] ==> value-parameter parameterString: String defined in org.jetbrains.kotlin.idea.intentions.SpecifyExplicitLambdaSignatureIntention.Companion.applyWithParameters[ValueParameterDescriptorImpl]

'functionLiteral' @ [72:36] ==> val functionLiteral: KtFunctionLiteral defined in org.jetbrains.kotlin.idea.intentions.SpecifyExplicitLambdaSignatureIntention.Companion.applyWithParameters[LocalVariableDescriptor]

'valueParameterList' @ [72:52] ==> public final val KtFunctionLiteral.valueParameterList: KtParameterList?[MyPropertyDescriptor]

'if (oldParameterList != null && newParameterList != null) {
                oldParameterList.replace(newParameterList)
            }
            else {
                val openBraceElement = functionLiteral.lBrace
                val nextSibling = openBraceElement.nextSibling
                val addNewline = nextSibling is PsiWhiteSpace && nextSibling.text?.contains("\n") ?: false
                val (whitespace, arrow) = psiFactory.createWhitespaceAndArrow()
                functionLiteral.addRangeAfter(whitespace, arrow, openBraceElement)
                newParameterList?.let { functionLiteral.addAfter(it, openBraceElement) }
                if (addNewline) {
                    functionLiteral.addAfter(psiFactory.createNewLine(), openBraceElement)
                }
            }' @ [73:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (Any..Any?), elseBranch: (Any..Any?)): (Any..Any?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (kotlin.Any..kotlin.Any?)

'oldParameterList' @ [73:17] ==> val oldParameterList: KtParameterList? defined in org.jetbrains.kotlin.idea.intentions.SpecifyExplicitLambdaSignatureIntention.Companion.applyWithParameters[LocalVariableDescriptor]

'newParameterList' @ [73:45] ==> val newParameterList: KtParameterList? defined in org.jetbrains.kotlin.idea.intentions.SpecifyExplicitLambdaSignatureIntention.Companion.applyWithParameters[LocalVariableDescriptor]

'oldParameterList' @ [74:17] ==> val oldParameterList: KtParameterList? defined in org.jetbrains.kotlin.idea.intentions.SpecifyExplicitLambdaSignatureIntention.Companion.applyWithParameters[LocalVariableDescriptor]

'replace' @ [74:34] ==> public open fun replace(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtParameterList[JavaMethodDescriptor]

'newParameterList' @ [74:42] ==> val newParameterList: KtParameterList? defined in org.jetbrains.kotlin.idea.intentions.SpecifyExplicitLambdaSignatureIntention.Companion.applyWithParameters[LocalVariableDescriptor]

'functionLiteral' @ [77:40] ==> val functionLiteral: KtFunctionLiteral defined in org.jetbrains.kotlin.idea.intentions.SpecifyExplicitLambdaSignatureIntention.Companion.applyWithParameters[LocalVariableDescriptor]

'lBrace' @ [77:56] ==> public final val KtFunctionLiteral.lBrace: PsiElement[MyPropertyDescriptor]

'openBraceElement' @ [78:35] ==> val openBraceElement: PsiElement defined in org.jetbrains.kotlin.idea.intentions.SpecifyExplicitLambdaSignatureIntention.Companion.applyWithParameters[LocalVariableDescriptor]

'nextSibling' @ [78:52] ==> public final val PsiElement.nextSibling: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'nextSibling' @ [79:34] ==> val nextSibling: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.intentions.SpecifyExplicitLambdaSignatureIntention.Companion.applyWithParameters[LocalVariableDescriptor]

'nextSibling' @ [79:66] ==> val nextSibling: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.intentions.SpecifyExplicitLambdaSignatureIntention.Companion.applyWithParameters[LocalVariableDescriptor]

'text' @ [79:78] ==> public final val PsiWhiteSpace.text: (String..String?)[MyPropertyDescriptor]

'contains' @ [79:84] ==> public operator fun CharSequence.contains(other: CharSequence, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'component1' @ [80:22] ==> public final operator fun component1(): PsiElement defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [80:34] ==> public final operator fun component2(): PsiElement defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'psiFactory' @ [80:43] ==> val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.intentions.SpecifyExplicitLambdaSignatureIntention.Companion.applyWithParameters[LocalVariableDescriptor]

'createWhitespaceAndArrow' @ [80:54] ==> public final fun createWhitespaceAndArrow(): Pair<PsiElement, PsiElement> defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'functionLiteral' @ [81:17] ==> val functionLiteral: KtFunctionLiteral defined in org.jetbrains.kotlin.idea.intentions.SpecifyExplicitLambdaSignatureIntention.Companion.applyWithParameters[LocalVariableDescriptor]

'addRangeAfter' @ [81:33] ==> public open fun addRangeAfter(p0: (PsiElement..PsiElement?), p1: (PsiElement..PsiElement?), p2: (PsiElement..PsiElement?)): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtFunctionLiteral[JavaMethodDescriptor]

'whitespace' @ [81:47] ==> val whitespace: PsiElement defined in org.jetbrains.kotlin.idea.intentions.SpecifyExplicitLambdaSignatureIntention.Companion.applyWithParameters[LocalVariableDescriptor]

'arrow' @ [81:59] ==> val arrow: PsiElement defined in org.jetbrains.kotlin.idea.intentions.SpecifyExplicitLambdaSignatureIntention.Companion.applyWithParameters[LocalVariableDescriptor]

'openBraceElement' @ [81:66] ==> val openBraceElement: PsiElement defined in org.jetbrains.kotlin.idea.intentions.SpecifyExplicitLambdaSignatureIntention.Companion.applyWithParameters[LocalVariableDescriptor]

'newParameterList' @ [82:17] ==> val newParameterList: KtParameterList? defined in org.jetbrains.kotlin.idea.intentions.SpecifyExplicitLambdaSignatureIntention.Companion.applyWithParameters[LocalVariableDescriptor]

'let' @ [82:35] ==> @InlineOnly public inline fun <T, R> KtParameterList.let(block: (KtParameterList) -> (PsiElement..PsiElement?)): (PsiElement..PsiElement?) defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtParameterList
    <R> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)

'functionLiteral' @ [82:41] ==> val functionLiteral: KtFunctionLiteral defined in org.jetbrains.kotlin.idea.intentions.SpecifyExplicitLambdaSignatureIntention.Companion.applyWithParameters[LocalVariableDescriptor]

'addAfter' @ [82:57] ==> public open fun addAfter(@NotNull p0: PsiElement, p1: PsiElement?): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtFunctionLiteral[JavaMethodDescriptor]

'it' @ [82:66] ==> value-parameter it: KtParameterList defined in org.jetbrains.kotlin.idea.intentions.SpecifyExplicitLambdaSignatureIntention.Companion.applyWithParameters.<anonymous>[ValueParameterDescriptorImpl]

'openBraceElement' @ [82:70] ==> val openBraceElement: PsiElement defined in org.jetbrains.kotlin.idea.intentions.SpecifyExplicitLambdaSignatureIntention.Companion.applyWithParameters[LocalVariableDescriptor]

'addNewline' @ [83:21] ==> val addNewline: Boolean defined in org.jetbrains.kotlin.idea.intentions.SpecifyExplicitLambdaSignatureIntention.Companion.applyWithParameters[LocalVariableDescriptor]

'functionLiteral' @ [84:21] ==> val functionLiteral: KtFunctionLiteral defined in org.jetbrains.kotlin.idea.intentions.SpecifyExplicitLambdaSignatureIntention.Companion.applyWithParameters[LocalVariableDescriptor]

'addAfter' @ [84:37] ==> public open fun addAfter(@NotNull p0: PsiElement, p1: PsiElement?): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtFunctionLiteral[JavaMethodDescriptor]

'psiFactory' @ [84:46] ==> val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.intentions.SpecifyExplicitLambdaSignatureIntention.Companion.applyWithParameters[LocalVariableDescriptor]

'createNewLine' @ [84:57] ==> public final fun createNewLine(): PsiElement defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'openBraceElement' @ [84:74] ==> val openBraceElement: PsiElement defined in org.jetbrains.kotlin.idea.intentions.SpecifyExplicitLambdaSignatureIntention.Companion.applyWithParameters[LocalVariableDescriptor]

'ShortenReferences' @ [87:13] ==> public companion object defined in org.jetbrains.kotlin.idea.core.ShortenReferences[FakeCallableDescriptorForObject]

'DEFAULT' @ [87:31] ==> @field:JvmField public final val DEFAULT: ShortenReferences defined in org.jetbrains.kotlin.idea.core.ShortenReferences.Companion[DeserializedPropertyDescriptor]

'process' @ [87:39] ==> @JvmOverloads public final fun process(elements: Iterable<KtElement>, elementFilter: (PsiElement) -> ShortenReferences.FilterResult = ...): Collection<KtElement> defined in org.jetbrains.kotlin.idea.core.ShortenReferences[DeserializedSimpleFunctionDescriptor]

'element' @ [87:47] ==> value-parameter element: KtLambdaExpression defined in org.jetbrains.kotlin.idea.intentions.SpecifyExplicitLambdaSignatureIntention.Companion.applyWithParameters[ValueParameterDescriptorImpl]

'valueParameters' @ [87:55] ==> public final val KtLambdaExpression.valueParameters: (MutableList<(KtParameter..KtParameter?)>..List<(KtParameter..KtParameter?)>)[MyPropertyDescriptor]

