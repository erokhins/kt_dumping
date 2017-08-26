'SelfTargetingRangeIntention<KtForExpression>' @ [34:36] ==> public constructor SelfTargetingRangeIntention<TElement : PsiElement>(elementType: Class<KtForExpression>, text: String, familyName: String = ...) defined in org.jetbrains.kotlin.idea.intentions.SelfTargetingRangeIntention[DeserializedClassConstructorDescriptor]
Inferred types:
    <TElement : PsiElement> -> KtForExpression

'KtForExpression' @ [34:81] ==> public constructor KtForExpression(@NotNull p0: ASTNode) defined in org.jetbrains.kotlin.psi.KtForExpression[JavaClassConstructorDescriptor]

'java' @ [34:104] ==> public val <T> KClass<KtForExpression>.java: Class<KtForExpression> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtForExpression

'listOf' @ [36:39] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'map' @ [36:92] ==> public inline fun <T, R> Iterable<String>.map(transform: (String) -> String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> String

'it' @ [36:107] ==> value-parameter it: String defined in org.jetbrains.kotlin.idea.intentions.AddForLoopIndicesIntention.WITH_INDEX_FQ_NAMES.<anonymous>[ValueParameterDescriptorImpl]

'WITH_INDEX_NAME' @ [36:111] ==> private final val WITH_INDEX_NAME: String defined in org.jetbrains.kotlin.idea.intentions.AddForLoopIndicesIntention[PropertyDescriptorImpl]

'toSet' @ [36:130] ==> public fun <T> Iterable<String>.toSet(): Set<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'element' @ [39:13] ==> value-parameter element: KtForExpression defined in org.jetbrains.kotlin.idea.intentions.AddForLoopIndicesIntention.applicabilityRange[ValueParameterDescriptorImpl]

'loopParameter' @ [39:21] ==> public final val KtForExpression.loopParameter: KtParameter?[MyPropertyDescriptor]

'element' @ [40:25] ==> value-parameter element: KtForExpression defined in org.jetbrains.kotlin.idea.intentions.AddForLoopIndicesIntention.applicabilityRange[ValueParameterDescriptorImpl]

'loopRange' @ [40:33] ==> public final val KtForExpression.loopRange: KtExpression?[MyPropertyDescriptor]

'element' @ [42:30] ==> value-parameter element: KtForExpression defined in org.jetbrains.kotlin.idea.intentions.AddForLoopIndicesIntention.applicabilityRange[ValueParameterDescriptorImpl]

'analyze' @ [42:38] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'PARTIAL' @ [42:62] ==> enum entry PARTIAL defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'loopRange' @ [44:28] ==> val loopRange: KtExpression defined in org.jetbrains.kotlin.idea.intentions.AddForLoopIndicesIntention.applicabilityRange[LocalVariableDescriptor]

'getResolvedCall' @ [44:38] ==> public fun KtElement?.getResolvedCall(context: BindingContext): ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.resolve.calls.callUtil[DeserializedSimpleFunctionDescriptor]

'bindingContext' @ [44:54] ==> val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.intentions.AddForLoopIndicesIntention.applicabilityRange[LocalVariableDescriptor]

'resolvedCall' @ [45:13] ==> val resolvedCall: ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.idea.intentions.AddForLoopIndicesIntention.applicabilityRange[LocalVariableDescriptor]

'resultingDescriptor' @ [45:27] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.resultingDescriptor: CallableDescriptor[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> CallableDescriptor

'fqNameUnsafe' @ [45:48] ==> public val DeclarationDescriptor.fqNameUnsafe: FqNameUnsafe defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedPropertyDescriptor]

'asString' @ [45:62] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqNameUnsafe[JavaMethodDescriptor]

'WITH_INDEX_FQ_NAMES' @ [45:76] ==> private final val WITH_INDEX_FQ_NAMES: Set<String> defined in org.jetbrains.kotlin.idea.intentions.AddForLoopIndicesIntention[PropertyDescriptorImpl]

'createWithIndexExpression' @ [47:35] ==> private final fun createWithIndexExpression(originalExpression: KtExpression): KtExpression defined in org.jetbrains.kotlin.idea.intentions.AddForLoopIndicesIntention[SimpleFunctionDescriptorImpl]

'loopRange' @ [47:61] ==> val loopRange: KtExpression defined in org.jetbrains.kotlin.idea.intentions.AddForLoopIndicesIntention.applicabilityRange[LocalVariableDescriptor]

'potentialExpression' @ [49:33] ==> val potentialExpression: KtExpression defined in org.jetbrains.kotlin.idea.intentions.AddForLoopIndicesIntention.applicabilityRange[LocalVariableDescriptor]

'analyzeAsReplacement' @ [49:53] ==> @JvmOverloads public fun KtExpression.analyzeAsReplacement(expressionToBeReplaced: KtExpression, bindingContext: BindingContext, resolutionFacade: ResolutionFacade = ..., trace: BindingTrace = ..., contextDependency: ContextDependency = ...): BindingContext defined in org.jetbrains.kotlin.idea.analysis[DeserializedSimpleFunctionDescriptor]

'loopRange' @ [49:74] ==> val loopRange: KtExpression defined in org.jetbrains.kotlin.idea.intentions.AddForLoopIndicesIntention.applicabilityRange[LocalVariableDescriptor]

'bindingContext' @ [49:85] ==> val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.intentions.AddForLoopIndicesIntention.applicabilityRange[LocalVariableDescriptor]

'potentialExpression' @ [50:31] ==> val potentialExpression: KtExpression defined in org.jetbrains.kotlin.idea.intentions.AddForLoopIndicesIntention.applicabilityRange[LocalVariableDescriptor]

'getResolvedCall' @ [50:51] ==> public fun KtElement?.getResolvedCall(context: BindingContext): ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.resolve.calls.callUtil[DeserializedSimpleFunctionDescriptor]

'newBindingContext' @ [50:67] ==> val newBindingContext: BindingContext defined in org.jetbrains.kotlin.idea.intentions.AddForLoopIndicesIntention.applicabilityRange[LocalVariableDescriptor]

'newResolvedCall' @ [51:13] ==> val newResolvedCall: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.idea.intentions.AddForLoopIndicesIntention.applicabilityRange[LocalVariableDescriptor]

'resultingDescriptor' @ [51:29] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.resultingDescriptor: CallableDescriptor[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> CallableDescriptor

'fqNameUnsafe' @ [51:49] ==> public val DeclarationDescriptor.fqNameUnsafe: FqNameUnsafe defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedPropertyDescriptor]

'asString' @ [51:62] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqNameUnsafe[JavaMethodDescriptor]

'WITH_INDEX_FQ_NAMES' @ [51:77] ==> private final val WITH_INDEX_FQ_NAMES: Set<String> defined in org.jetbrains.kotlin.idea.intentions.AddForLoopIndicesIntention[PropertyDescriptorImpl]

'TextRange' @ [53:16] ==> public constructor TextRange(p0: Int, p1: Int) defined in com.intellij.openapi.util.TextRange[JavaClassConstructorDescriptor]

'element' @ [53:26] ==> value-parameter element: KtForExpression defined in org.jetbrains.kotlin.idea.intentions.AddForLoopIndicesIntention.applicabilityRange[ValueParameterDescriptorImpl]

'startOffset' @ [53:34] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'element' @ [53:47] ==> value-parameter element: KtForExpression defined in org.jetbrains.kotlin.idea.intentions.AddForLoopIndicesIntention.applicabilityRange[ValueParameterDescriptorImpl]

'body' @ [53:55] ==> public final val KtForExpression.body: KtExpression?[MyPropertyDescriptor]

'startOffset' @ [53:61] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'element' @ [53:76] ==> value-parameter element: KtForExpression defined in org.jetbrains.kotlin.idea.intentions.AddForLoopIndicesIntention.applicabilityRange[ValueParameterDescriptorImpl]

'endOffset' @ [53:84] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'editor' @ [57:13] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.intentions.AddForLoopIndicesIntention.applyTo[ValueParameterDescriptorImpl]

'IllegalArgumentException' @ [57:35] ==> public final fun <init>(p0: (String..String?)): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.IllegalArgumentException[TypeAliasConstructorDescriptorImpl]

'element' @ [58:25] ==> value-parameter element: KtForExpression defined in org.jetbrains.kotlin.idea.intentions.AddForLoopIndicesIntention.applyTo[ValueParameterDescriptorImpl]

'loopRange' @ [58:33] ==> public final val KtForExpression.loopRange: KtExpression?[MyPropertyDescriptor]

'element' @ [59:29] ==> value-parameter element: KtForExpression defined in org.jetbrains.kotlin.idea.intentions.AddForLoopIndicesIntention.applyTo[ValueParameterDescriptorImpl]

'loopParameter' @ [59:37] ==> public final val KtForExpression.loopParameter: KtParameter?[MyPropertyDescriptor]

'KtPsiFactory' @ [60:26] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'element' @ [60:39] ==> value-parameter element: KtForExpression defined in org.jetbrains.kotlin.idea.intentions.AddForLoopIndicesIntention.applyTo[ValueParameterDescriptorImpl]

'loopRange' @ [62:9] ==> val loopRange: KtExpression defined in org.jetbrains.kotlin.idea.intentions.AddForLoopIndicesIntention.applyTo[LocalVariableDescriptor]

'replace' @ [62:19] ==> public abstract fun replace(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtExpression[JavaMethodDescriptor]

'createWithIndexExpression' @ [62:27] ==> private final fun createWithIndexExpression(originalExpression: KtExpression): KtExpression defined in org.jetbrains.kotlin.idea.intentions.AddForLoopIndicesIntention[SimpleFunctionDescriptorImpl]

'loopRange' @ [62:53] ==> val loopRange: KtExpression defined in org.jetbrains.kotlin.idea.intentions.AddForLoopIndicesIntention.applyTo[LocalVariableDescriptor]

'!!' @ [64:30] ==> public final fun <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-EXCLEXCL-RESOLVE>`(baseExpr: KtDestructuringDeclaration?): KtDestructuringDeclaration[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> -> KtDestructuringDeclaration

'psiFactory' @ [64:31] ==> val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.intentions.AddForLoopIndicesIntention.applyTo[LocalVariableDescriptor]

'createExpressionByPattern' @ [64:42] ==> public fun KtPsiFactory.createExpressionByPattern(pattern: String, vararg args: Any, reformat: Boolean = ...): KtExpression defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'loopParameter' @ [64:95] ==> val loopParameter: KtParameter defined in org.jetbrains.kotlin.idea.intentions.AddForLoopIndicesIntention.applyTo[LocalVariableDescriptor]

'text' @ [64:109] ==> public final val KtParameter.text: (String..String?)[MyPropertyDescriptor]

'destructuringDeclaration' @ [64:135] ==> public final val KtForExpression.destructuringDeclaration: KtDestructuringDeclaration?[MyPropertyDescriptor]

'multiParameter' @ [66:9] ==> var multiParameter: KtDestructuringDeclaration defined in org.jetbrains.kotlin.idea.intentions.AddForLoopIndicesIntention.applyTo[LocalVariableDescriptor]

'loopParameter' @ [66:26] ==> val loopParameter: KtParameter defined in org.jetbrains.kotlin.idea.intentions.AddForLoopIndicesIntention.applyTo[LocalVariableDescriptor]

'replaced' @ [66:40] ==> public inline fun <reified T : PsiElement> PsiElement.replaced(newElement: KtDestructuringDeclaration): KtDestructuringDeclaration defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtDestructuringDeclaration

'multiParameter' @ [66:49] ==> var multiParameter: KtDestructuringDeclaration defined in org.jetbrains.kotlin.idea.intentions.AddForLoopIndicesIntention.applyTo[LocalVariableDescriptor]

'multiParameter' @ [68:29] ==> var multiParameter: KtDestructuringDeclaration defined in org.jetbrains.kotlin.idea.intentions.AddForLoopIndicesIntention.applyTo[LocalVariableDescriptor]

'entries' @ [68:44] ==> public final val KtDestructuringDeclaration.entries: (MutableList<(KtDestructuringDeclarationEntry..KtDestructuringDeclarationEntry?)>..List<(KtDestructuringDeclarationEntry..KtDestructuringDeclarationEntry?)>)[MyPropertyDescriptor]

'editor' @ [69:9] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.intentions.AddForLoopIndicesIntention.applyTo[ValueParameterDescriptorImpl]

'caretModel' @ [69:16] ==> public final val Editor.caretModel: CaretModel[MyPropertyDescriptor]

'moveToOffset' @ [69:27] ==> public abstract fun moveToOffset(p0: Int): Unit defined in com.intellij.openapi.editor.CaretModel[JavaMethodDescriptor]

'indexVariable' @ [69:40] ==> val indexVariable: (KtDestructuringDeclarationEntry..KtDestructuringDeclarationEntry?) defined in org.jetbrains.kotlin.idea.intentions.AddForLoopIndicesIntention.applyTo[LocalVariableDescriptor]

'startOffset' @ [69:54] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'runTemplate' @ [71:9] ==> private final fun runTemplate(editor: Editor, forExpression: KtForExpression, indexVariable: KtDestructuringDeclarationEntry): Unit defined in org.jetbrains.kotlin.idea.intentions.AddForLoopIndicesIntention[SimpleFunctionDescriptorImpl]

'editor' @ [71:21] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.intentions.AddForLoopIndicesIntention.applyTo[ValueParameterDescriptorImpl]

'element' @ [71:29] ==> value-parameter element: KtForExpression defined in org.jetbrains.kotlin.idea.intentions.AddForLoopIndicesIntention.applyTo[ValueParameterDescriptorImpl]

'indexVariable' @ [71:38] ==> val indexVariable: (KtDestructuringDeclarationEntry..KtDestructuringDeclarationEntry?) defined in org.jetbrains.kotlin.idea.intentions.AddForLoopIndicesIntention.applyTo[LocalVariableDescriptor]

'getInstance' @ [75:28] ==> public open fun getInstance(@NotNull p0: Project): (PsiDocumentManager..PsiDocumentManager?) defined in com.intellij.psi.PsiDocumentManager[JavaMethodDescriptor]

'forExpression' @ [75:40] ==> value-parameter forExpression: KtForExpression defined in org.jetbrains.kotlin.idea.intentions.AddForLoopIndicesIntention.runTemplate[ValueParameterDescriptorImpl]

'project' @ [75:54] ==> public final val KtForExpression.project: Project[MyPropertyDescriptor]

'doPostponedOperationsAndUnblockDocument' @ [75:63] ==> public abstract fun doPostponedOperationsAndUnblockDocument(@NotNull p0: Document): Unit defined in com.intellij.psi.PsiDocumentManager[JavaMethodDescriptor]

'editor' @ [75:103] ==> value-parameter editor: Editor defined in org.jetbrains.kotlin.idea.intentions.AddForLoopIndicesIntention.runTemplate[ValueParameterDescriptorImpl]

'document' @ [75:110] ==> public final val Editor.document: Document[MyPropertyDescriptor]

'TemplateBuilderImpl' @ [77:31] ==> public constructor TemplateBuilderImpl(@NotNull p0: PsiElement) defined in com.intellij.codeInsight.template.TemplateBuilderImpl[JavaClassConstructorDescriptor]

'forExpression' @ [77:51] ==> value-parameter forExpression: KtForExpression defined in org.jetbrains.kotlin.idea.intentions.AddForLoopIndicesIntention.runTemplate[ValueParameterDescriptorImpl]

'templateBuilder' @ [78:9] ==> val templateBuilder: TemplateBuilderImpl defined in org.jetbrains.kotlin.idea.intentions.AddForLoopIndicesIntention.runTemplate[LocalVariableDescriptor]

'replaceElement' @ [78:25] ==> public open fun replaceElement(@NotNull p0: PsiElement, p1: (Expression..Expression?)): Unit defined in com.intellij.codeInsight.template.TemplateBuilderImpl[JavaMethodDescriptor]

'indexVariable' @ [78:40] ==> value-parameter indexVariable: KtDestructuringDeclarationEntry defined in org.jetbrains.kotlin.idea.intentions.AddForLoopIndicesIntention.runTemplate[ValueParameterDescriptorImpl]

'ChooseStringExpression' @ [78:55] ==> public constructor ChooseStringExpression(suggestions: Collection<String>, default: String = ..., advertisementText: String? = ...) defined in org.jetbrains.kotlin.idea.intentions.ChooseStringExpression[ClassConstructorDescriptorImpl]

'listOf' @ [78:78] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'forExpression' @ [80:20] ==> value-parameter forExpression: KtForExpression defined in org.jetbrains.kotlin.idea.intentions.AddForLoopIndicesIntention.runTemplate[ValueParameterDescriptorImpl]

'body' @ [80:34] ==> public final val KtForExpression.body: KtExpression?[MyPropertyDescriptor]

'when (body) {
            is KtBlockExpression -> {
                val statement = body.statements.firstOrNull()
                if (statement != null) {
                    templateBuilder.setEndVariableBefore(statement)
                }
                else {
                    templateBuilder.setEndVariableAfter(body.lBrace)
                }
            }

            null -> forExpression.rightParenthesis.let { templateBuilder.setEndVariableAfter(it) }

            else -> templateBuilder.setEndVariableBefore(body)
        }' @ [81:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'body' @ [81:15] ==> val body: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.AddForLoopIndicesIntention.runTemplate[LocalVariableDescriptor]

'body' @ [83:33] ==> val body: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.AddForLoopIndicesIntention.runTemplate[LocalVariableDescriptor]

'statements' @ [83:38] ==> public final val KtBlockExpression.statements: List<(KtExpression..KtExpression?)>[MyPropertyDescriptor]

'firstOrNull' @ [83:49] ==> public fun <T> List<(KtExpression..KtExpression?)>.firstOrNull(): KtExpression? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtExpression..org.jetbrains.kotlin.psi.KtExpression?)

'if (statement != null) {
                    templateBuilder.setEndVariableBefore(statement)
                }
                else {
                    templateBuilder.setEndVariableAfter(body.lBrace)
                }' @ [84:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'statement' @ [84:21] ==> val statement: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.AddForLoopIndicesIntention.runTemplate[LocalVariableDescriptor]

'templateBuilder' @ [85:21] ==> val templateBuilder: TemplateBuilderImpl defined in org.jetbrains.kotlin.idea.intentions.AddForLoopIndicesIntention.runTemplate[LocalVariableDescriptor]

'setEndVariableBefore' @ [85:37] ==> public open fun setEndVariableBefore(p0: (PsiElement..PsiElement?)): Unit defined in com.intellij.codeInsight.template.TemplateBuilderImpl[JavaMethodDescriptor]

'statement' @ [85:58] ==> val statement: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.AddForLoopIndicesIntention.runTemplate[LocalVariableDescriptor]

'templateBuilder' @ [88:21] ==> val templateBuilder: TemplateBuilderImpl defined in org.jetbrains.kotlin.idea.intentions.AddForLoopIndicesIntention.runTemplate[LocalVariableDescriptor]

'setEndVariableAfter' @ [88:37] ==> public open fun setEndVariableAfter(p0: (PsiElement..PsiElement?)): Unit defined in com.intellij.codeInsight.template.TemplateBuilderImpl[JavaMethodDescriptor]

'body' @ [88:57] ==> val body: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.AddForLoopIndicesIntention.runTemplate[LocalVariableDescriptor]

'lBrace' @ [88:62] ==> public final val KtBlockExpression.lBrace: PsiElement?[MyPropertyDescriptor]

'forExpression' @ [92:21] ==> value-parameter forExpression: KtForExpression defined in org.jetbrains.kotlin.idea.intentions.AddForLoopIndicesIntention.runTemplate[ValueParameterDescriptorImpl]

'rightParenthesis' @ [92:35] ==> public final val KtForExpression.rightParenthesis: PsiElement?[MyPropertyDescriptor]

'let' @ [92:52] ==> @InlineOnly public inline fun <T, R> PsiElement?.let(block: (PsiElement?) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement?
    <R> -> Unit

'templateBuilder' @ [92:58] ==> val templateBuilder: TemplateBuilderImpl defined in org.jetbrains.kotlin.idea.intentions.AddForLoopIndicesIntention.runTemplate[LocalVariableDescriptor]

'setEndVariableAfter' @ [92:74] ==> public open fun setEndVariableAfter(p0: (PsiElement..PsiElement?)): Unit defined in com.intellij.codeInsight.template.TemplateBuilderImpl[JavaMethodDescriptor]

'it' @ [92:94] ==> value-parameter it: PsiElement? defined in org.jetbrains.kotlin.idea.intentions.AddForLoopIndicesIntention.runTemplate.<anonymous>[ValueParameterDescriptorImpl]

'templateBuilder' @ [94:21] ==> val templateBuilder: TemplateBuilderImpl defined in org.jetbrains.kotlin.idea.intentions.AddForLoopIndicesIntention.runTemplate[LocalVariableDescriptor]

'setEndVariableBefore' @ [94:37] ==> public open fun setEndVariableBefore(p0: (PsiElement..PsiElement?)): Unit defined in com.intellij.codeInsight.template.TemplateBuilderImpl[JavaMethodDescriptor]

'body' @ [94:58] ==> val body: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.AddForLoopIndicesIntention.runTemplate[LocalVariableDescriptor]

'templateBuilder' @ [97:9] ==> val templateBuilder: TemplateBuilderImpl defined in org.jetbrains.kotlin.idea.intentions.AddForLoopIndicesIntention.runTemplate[LocalVariableDescriptor]

'run' @ [97:25] ==> public open fun run(@NotNull p0: Editor, p1: Boolean): Unit defined in com.intellij.codeInsight.template.TemplateBuilderImpl[JavaMethodDescriptor]

'editor' @ [97:29] ==> value-parameter editor: Editor defined in org.jetbrains.kotlin.idea.intentions.AddForLoopIndicesIntention.runTemplate[ValueParameterDescriptorImpl]

'KtPsiFactory' @ [101:16] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'originalExpression' @ [101:29] ==> value-parameter originalExpression: KtExpression defined in org.jetbrains.kotlin.idea.intentions.AddForLoopIndicesIntention.createWithIndexExpression[ValueParameterDescriptorImpl]

'createExpressionByPattern' @ [101:49] ==> public fun KtPsiFactory.createExpressionByPattern(pattern: String, vararg args: Any, reformat: Boolean = ...): KtExpression defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'WITH_INDEX_NAME' @ [101:80] ==> private final val WITH_INDEX_NAME: String defined in org.jetbrains.kotlin.idea.intentions.AddForLoopIndicesIntention[PropertyDescriptorImpl]

'originalExpression' @ [101:100] ==> value-parameter originalExpression: KtExpression defined in org.jetbrains.kotlin.idea.intentions.AddForLoopIndicesIntention.createWithIndexExpression[ValueParameterDescriptorImpl]

