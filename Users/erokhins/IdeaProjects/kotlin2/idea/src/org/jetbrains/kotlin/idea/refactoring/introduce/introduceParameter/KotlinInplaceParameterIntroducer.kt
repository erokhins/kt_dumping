'AbstractKotlinInplaceIntroducer<KtParameter>' @ [55:4] ==> public constructor AbstractKotlinInplaceIntroducer<D : KtNamedDeclaration>(localVariable: KtParameter?, expression: KtExpression?, occurrences: Array<KtExpression>, title: String, project: Project, editor: Editor) defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractKotlinInplaceIntroducer[ClassConstructorDescriptorImpl]
Inferred types:
    <D : KtNamedDeclaration> -> KtParameter

'originalDescriptor' @ [57:9] ==> value-parameter originalDescriptor: IntroduceParameterDescriptor defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinInplaceParameterIntroducer.<init>[ValueParameterDescriptorImpl]

'originalRange' @ [57:28] ==> public final val originalRange: KotlinPsiRange defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.IntroduceParameterDescriptor[PropertyDescriptorImpl]

'elements' @ [57:42] ==> public abstract val elements: List<PsiElement> defined in org.jetbrains.kotlin.idea.util.psi.patternMatching.KotlinPsiRange[DeserializedPropertyDescriptor]

'single' @ [57:51] ==> public fun <T> List<PsiElement>.single(): PsiElement defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'originalDescriptor' @ [58:9] ==> value-parameter originalDescriptor: IntroduceParameterDescriptor defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinInplaceParameterIntroducer.<init>[ValueParameterDescriptorImpl]

'occurrencesToReplace' @ [58:28] ==> public final val occurrencesToReplace: List<KotlinPsiRange> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.IntroduceParameterDescriptor[PropertyDescriptorImpl]

'map' @ [59:18] ==> public inline fun <T, R> Iterable<KotlinPsiRange>.map(transform: (KotlinPsiRange) -> KtExpression): List<KtExpression> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinPsiRange
    <R> -> KtExpression

'it' @ [59:24] ==> value-parameter it: KotlinPsiRange defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinInplaceParameterIntroducer.<init>.<anonymous>[ValueParameterDescriptorImpl]

'elements' @ [59:27] ==> public abstract val elements: List<PsiElement> defined in org.jetbrains.kotlin.idea.util.psi.patternMatching.KotlinPsiRange[DeserializedPropertyDescriptor]

'single' @ [59:36] ==> public fun <T> List<PsiElement>.single(): PsiElement defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'toTypedArray' @ [60:18] ==> public inline fun <reified T> Collection<KtExpression>.toTypedArray(): Array<KtExpression> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> KtExpression

'INTRODUCE_PARAMETER' @ [61:9] ==> public val INTRODUCE_PARAMETER: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter in file KotlinIntroduceParameterHandler.kt[PropertyDescriptorImpl]

'project' @ [62:9] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinInplaceParameterIntroducer.<init>[ValueParameterDescriptorImpl]

'editor' @ [63:9] ==> value-parameter editor: Editor defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinInplaceParameterIntroducer.<init>[ValueParameterDescriptorImpl]

'getInstance' @ [66:34] ==> @NotNull public open fun getInstance(@NotNull p0: raw (Class<(Any..Any?)>..Class<*>)): Logger defined in com.intellij.openapi.diagnostic.Logger[JavaMethodDescriptor]

'KotlinInplaceParameterIntroducer' @ [66:46] ==> public companion object defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinInplaceParameterIntroducer[FakeCallableDescriptorForObject]

'java' @ [66:86] ==> public val <T> KClass<KotlinInplaceParameterIntroducer>.java: Class<KotlinInplaceParameterIntroducer> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KotlinInplaceParameterIntroducer

'' @ [70:16] ==> private constructor PreviewDecorator() defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinInplaceParameterIntroducer.PreviewDecorator[ClassConstructorDescriptorImpl]

'with' @ [71:59] ==> @InlineOnly public inline fun <T, R> with(receiver: TextAttributes, block: TextAttributes.() -> TextAttributes): TextAttributes defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TextAttributes
    <R> -> TextAttributes

'TextAttributes' @ [71:64] ==> public constructor TextAttributes() defined in com.intellij.openapi.editor.markup.TextAttributes[JavaClassConstructorDescriptor]

'effectType' @ [72:17] ==> public final var TextAttributes.effectType: (EffectType..EffectType?)[MyPropertyDescriptor]

'ROUNDED_BOX' @ [72:41] ==> enum entry ROUNDED_BOX defined in com.intellij.openapi.editor.markup.EffectType[FakeCallableDescriptorForObject]

'effectColor' @ [73:17] ==> public final var TextAttributes.effectColor: (Color..Color?)[MyPropertyDescriptor]

'RED' @ [73:39] ==> public final val RED: (JBColor..JBColor?) defined in com.intellij.ui.JBColor[JavaPropertyDescriptor]

'this' @ [74:17] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinInplaceParameterIntroducer.PreviewDecorator.FOR_ADD.textAttributes.<anonymous>[ReceiverParameterDescriptorImpl]

'' @ [78:20] ==> private constructor PreviewDecorator() defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinInplaceParameterIntroducer.PreviewDecorator[ClassConstructorDescriptorImpl]

'with' @ [79:59] ==> @InlineOnly public inline fun <T, R> with(receiver: TextAttributes, block: TextAttributes.() -> TextAttributes): TextAttributes defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TextAttributes
    <R> -> TextAttributes

'TextAttributes' @ [79:64] ==> public constructor TextAttributes() defined in com.intellij.openapi.editor.markup.TextAttributes[JavaClassConstructorDescriptor]

'effectType' @ [80:17] ==> public final var TextAttributes.effectType: (EffectType..EffectType?)[MyPropertyDescriptor]

'STRIKEOUT' @ [80:41] ==> enum entry STRIKEOUT defined in com.intellij.openapi.editor.markup.EffectType[FakeCallableDescriptorForObject]

'effectColor' @ [81:17] ==> public final var TextAttributes.effectColor: (Color..Color?)[MyPropertyDescriptor]

'BLACK' @ [81:37] ==> public final val BLACK: (Color..Color?) defined in java.awt.Color[JavaPropertyDescriptor]

'this' @ [82:17] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinInplaceParameterIntroducer.PreviewDecorator.FOR_REMOVAL.textAttributes.<anonymous>[ReceiverParameterDescriptorImpl]

'markupModel' @ [89:13] ==> value-parameter markupModel: MarkupModel defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinInplaceParameterIntroducer.PreviewDecorator.applyToRange[ValueParameterDescriptorImpl]

'addRangeHighlighter' @ [89:25] ==> @NotNull public abstract fun addRangeHighlighter(p0: Int, p1: Int, p2: Int, @Nullable p3: TextAttributes?, @NotNull p4: HighlighterTargetArea): RangeHighlighter defined in com.intellij.openapi.editor.markup.MarkupModel[JavaMethodDescriptor]

'range' @ [89:45] ==> value-parameter range: TextRange defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinInplaceParameterIntroducer.PreviewDecorator.applyToRange[ValueParameterDescriptorImpl]

'startOffset' @ [89:51] ==> public final val TextRange.startOffset: Int[MyPropertyDescriptor]

'range' @ [90:45] ==> value-parameter range: TextRange defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinInplaceParameterIntroducer.PreviewDecorator.applyToRange[ValueParameterDescriptorImpl]

'endOffset' @ [90:51] ==> public final val TextRange.endOffset: Int[MyPropertyDescriptor]

'textAttributes' @ [92:45] ==> protected abstract val textAttributes: TextAttributes defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinInplaceParameterIntroducer.PreviewDecorator[PropertyDescriptorImpl]

'EXACT_RANGE' @ [93:67] ==> enum entry EXACT_RANGE defined in com.intellij.openapi.editor.markup.HighlighterTargetArea[FakeCallableDescriptorForObject]

'ArrayList' @ [99:39] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> TextRange

'_rangesToRemove' @ [107:53] ==> private final val _rangesToRemove: ArrayList<TextRange> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinInplaceParameterIntroducer.Preview[PropertyDescriptorImpl]

'getTemplateState' @ [110:53] ==> @Nullable public open fun getTemplateState(@NotNull p0: Editor): TemplateState? defined in com.intellij.codeInsight.template.impl.TemplateManagerImpl[JavaMethodDescriptor]

'myEditor' @ [110:70] ==> protected/*protected and package*/ final val myEditor: (Editor..Editor?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinInplaceParameterIntroducer[JavaPropertyDescriptor]

'if (templateState?.template != null) {
                templateState
                        .getVariableValue(KotlinInplaceVariableIntroducer.TYPE_REFERENCE_VARIABLE_NAME)
                        ?.text
            } else null' @ [111:31] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String?, elseBranch: String?): String?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String?

'templateState' @ [111:35] ==> val templateState: TemplateState? defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinInplaceParameterIntroducer.Preview.<init>[LocalVariableDescriptor]

'template' @ [111:50] ==> public final val TemplateState.template: (TemplateImpl..TemplateImpl?)[MyPropertyDescriptor]

'templateState' @ [112:17] ==> val templateState: TemplateState? defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinInplaceParameterIntroducer.Preview.<init>[LocalVariableDescriptor]

'getVariableValue' @ [113:26] ==> @Nullable public open fun getVariableValue(@NotNull p0: String): TextResult? defined in com.intellij.codeInsight.template.impl.TemplateState[JavaMethodDescriptor]

'TYPE_REFERENCE_VARIABLE_NAME' @ [113:75] ==> public const final val TYPE_REFERENCE_VARIABLE_NAME: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinInplaceVariableIntroducer[JavaPropertyDescriptor]

'text' @ [114:27] ==> public final val TextResult.text: String[MyPropertyDescriptor]

'StringBuilder' @ [117:27] ==> public final fun <init>(): StringBuilder /* = StringBuilder */ defined in kotlin.text.StringBuilder[TypeAliasConstructorDescriptorImpl]

'with' @ [119:13] ==> @InlineOnly public inline fun <T, R> with(receiver: IntroduceParameterDescriptor, block: IntroduceParameterDescriptor.() -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IntroduceParameterDescriptor
    <R> -> Unit

'descriptor' @ [119:18] ==> private final var descriptor: IntroduceParameterDescriptor defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinInplaceParameterIntroducer[PropertyDescriptorImpl]

'callable' @ [120:18] ==> public final val callable: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.IntroduceParameterDescriptor[PropertyDescriptorImpl]

'receiverTypeReference' @ [120:44] ==> public final val KtFunction.receiverTypeReference: KtTypeReference?[MyPropertyDescriptor]

'let' @ [120:67] ==> @InlineOnly public inline fun <T, R> KtTypeReference.let(block: (KtTypeReference) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtTypeReference
    <R> -> Unit

'builder' @ [121:21] ==> val builder: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinInplaceParameterIntroducer.Preview.<init>[LocalVariableDescriptor]

'append' @ [121:29] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'receiverTypeRef' @ [121:36] ==> value-parameter receiverTypeRef: KtTypeReference defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinInplaceParameterIntroducer.Preview.<init>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'text' @ [121:52] ==> public final val KtTypeReference.text: (String..String?)[MyPropertyDescriptor]

'append' @ [121:58] ==> public open fun append(p0: Char): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'!' @ [122:25] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [122:26] ==> private final var descriptor: IntroduceParameterDescriptor defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinInplaceParameterIntroducer[PropertyDescriptorImpl]

'withDefaultValue' @ [122:37] ==> public final val withDefaultValue: Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.IntroduceParameterDescriptor[PropertyDescriptorImpl]

'receiverTypeRef' @ [122:57] ==> value-parameter receiverTypeRef: KtTypeReference defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinInplaceParameterIntroducer.Preview.<init>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'parametersToRemove' @ [122:76] ==> public final val parametersToRemove: List<KtElement> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.IntroduceParameterDescriptor[PropertyDescriptorImpl]

'_rangesToRemove' @ [123:25] ==> private final val _rangesToRemove: ArrayList<TextRange> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinInplaceParameterIntroducer.Preview[PropertyDescriptorImpl]

'add' @ [123:41] ==> public open fun add(element: TextRange): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'TextRange' @ [123:45] ==> public constructor TextRange(p0: Int, p1: Int) defined in com.intellij.openapi.util.TextRange[JavaClassConstructorDescriptor]

'builder' @ [123:58] ==> val builder: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinInplaceParameterIntroducer.Preview.<init>[LocalVariableDescriptor]

'length' @ [123:66] ==> public open val length: Int defined in java.lang.StringBuilder[JavaPropertyDescriptor]

'builder' @ [127:17] ==> val builder: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinInplaceParameterIntroducer.Preview.<init>[LocalVariableDescriptor]

'append' @ [127:25] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'callable' @ [127:32] ==> public final val callable: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.IntroduceParameterDescriptor[PropertyDescriptorImpl]

'name' @ [127:41] ==> public final val KtNamedDeclaration.name: String?[MyPropertyDescriptor]

'callable' @ [129:34] ==> public final val callable: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.IntroduceParameterDescriptor[PropertyDescriptorImpl]

'getValueParameters' @ [129:43] ==> public fun KtNamedDeclaration.getValueParameters(): List<KtParameter> defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'builder' @ [130:17] ==> val builder: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinInplaceParameterIntroducer.Preview.<init>[LocalVariableDescriptor]

'append' @ [130:25] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'parameters' @ [131:27] ==> val parameters: List<KtParameter> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinInplaceParameterIntroducer.Preview.<init>.<anonymous>[LocalVariableDescriptor]

'indices' @ [131:38] ==> public val Collection<*>.indices: IntRange defined in kotlin.collections[DeserializedPropertyDescriptor]

'parameters' @ [132:37] ==> val parameters: List<KtParameter> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinInplaceParameterIntroducer.Preview.<init>.<anonymous>[LocalVariableDescriptor]

'i' @ [132:48] ==> val i: Int defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinInplaceParameterIntroducer.Preview.<init>.<anonymous>[LocalVariableDescriptor]

'if (parameter == addedParameter){
                        val parameterName = currentName ?: parameter.name
                        val parameterType = currentType ?: parameter.typeReference!!.text
                        descriptor = descriptor.copy(newParameterName = parameterName!!, newParameterTypeText = parameterType)
                        val modifier = if (valVar != KotlinValVar.None) "${valVar.keywordName} " else ""
                        val defaultValue = if (withDefaultValue) {
                            " = ${if (newArgumentValue is KtProperty) newArgumentValue.name else newArgumentValue.text}"
                        } else ""

                        "$modifier$parameterName: $parameterType$defaultValue"
                    }
                    else parameter.text' @ [134:41] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (String..String?), elseBranch: (String..String?)): (String..String?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (kotlin.String..kotlin.String?)

'parameter' @ [134:45] ==> val parameter: KtParameter defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinInplaceParameterIntroducer.Preview.<init>.<anonymous>[LocalVariableDescriptor]

'addedParameter' @ [134:58] ==> value-parameter addedParameter: KtParameter? defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinInplaceParameterIntroducer.Preview.<init>[ValueParameterDescriptorImpl]

'currentName' @ [135:45] ==> value-parameter currentName: String? defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinInplaceParameterIntroducer.Preview.<init>[ValueParameterDescriptorImpl]

'parameter' @ [135:60] ==> val parameter: KtParameter defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinInplaceParameterIntroducer.Preview.<init>.<anonymous>[LocalVariableDescriptor]

'name' @ [135:70] ==> public final val KtParameter.name: String?[MyPropertyDescriptor]

'currentType' @ [136:45] ==> val currentType: String? defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinInplaceParameterIntroducer.Preview.<init>[LocalVariableDescriptor]

'parameter' @ [136:60] ==> val parameter: KtParameter defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinInplaceParameterIntroducer.Preview.<init>.<anonymous>[LocalVariableDescriptor]

'typeReference' @ [136:70] ==> public final var KtParameter.typeReference: KtTypeReference?[MyPropertyDescriptor]

'text' @ [136:86] ==> public final val KtTypeReference.text: (String..String?)[MyPropertyDescriptor]

'descriptor' @ [137:25] ==> private final var descriptor: IntroduceParameterDescriptor defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinInplaceParameterIntroducer[PropertyDescriptorImpl]

'descriptor' @ [137:38] ==> private final var descriptor: IntroduceParameterDescriptor defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinInplaceParameterIntroducer[PropertyDescriptorImpl]

'copy' @ [137:49] ==> public final fun copy(originalRange: KotlinPsiRange = ..., callable: KtNamedDeclaration = ..., callableDescriptor: FunctionDescriptor = ..., newParameterName: String = ..., newParameterTypeText: String = ..., argumentValue: KtExpression = ..., withDefaultValue: Boolean = ..., parametersUsages: MultiMap<KtElement, KtElement> = ..., occurrencesToReplace: List<KotlinPsiRange> = ..., parametersToRemove: List<KtElement> = ..., occurrenceReplacer: IntroduceParameterDescriptor.(KotlinPsiRange) -> Unit = ...): IntroduceParameterDescriptor defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.IntroduceParameterDescriptor[SimpleFunctionDescriptorImpl]

'parameterName' @ [137:73] ==> val parameterName: String? defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinInplaceParameterIntroducer.Preview.<init>.<anonymous>[LocalVariableDescriptor]

'parameterType' @ [137:113] ==> val parameterType: (String..String?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinInplaceParameterIntroducer.Preview.<init>.<anonymous>[LocalVariableDescriptor]

'if (valVar != KotlinValVar.None) "${valVar.keywordName} " else ""' @ [138:40] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'valVar' @ [138:44] ==> public final val valVar: KotlinValVar defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.IntroduceParameterDescriptor[PropertyDescriptorImpl]

'None' @ [138:67] ==> enum entry None defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinValVar[FakeCallableDescriptorForObject]

'valVar' @ [138:76] ==> public final val valVar: KotlinValVar defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.IntroduceParameterDescriptor[PropertyDescriptorImpl]

'keywordName' @ [138:83] ==> public final val keywordName: String defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinValVar[PropertyDescriptorImpl]

'if (withDefaultValue) {
                            " = ${if (newArgumentValue is KtProperty) newArgumentValue.name else newArgumentValue.text}"
                        } else ""' @ [139:44] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'withDefaultValue' @ [139:48] ==> public final val withDefaultValue: Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.IntroduceParameterDescriptor[PropertyDescriptorImpl]

'if (newArgumentValue is KtProperty) newArgumentValue.name else newArgumentValue.text' @ [140:35] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String?, elseBranch: String?): String?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String?

'newArgumentValue' @ [140:39] ==> public final val newArgumentValue: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.IntroduceParameterDescriptor[PropertyDescriptorImpl]

'newArgumentValue' @ [140:71] ==> public final val newArgumentValue: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.IntroduceParameterDescriptor[PropertyDescriptorImpl]

'name' @ [140:88] ==> public final val KtExpression.name: String?[MyPropertyDescriptor]

'newArgumentValue' @ [140:98] ==> public final val newArgumentValue: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.IntroduceParameterDescriptor[PropertyDescriptorImpl]

'text' @ [140:115] ==> public final val KtExpression.text: (String..String?)[MyPropertyDescriptor]

'modifier' @ [143:27] ==> val modifier: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinInplaceParameterIntroducer.Preview.<init>.<anonymous>[LocalVariableDescriptor]

'parameterName' @ [143:36] ==> val parameterName: String? defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinInplaceParameterIntroducer.Preview.<init>.<anonymous>[LocalVariableDescriptor]

'parameterType' @ [143:52] ==> val parameterType: (String..String?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinInplaceParameterIntroducer.Preview.<init>.<anonymous>[LocalVariableDescriptor]

'defaultValue' @ [143:66] ==> val defaultValue: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinInplaceParameterIntroducer.Preview.<init>.<anonymous>[LocalVariableDescriptor]

'parameter' @ [145:26] ==> val parameter: KtParameter defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinInplaceParameterIntroducer.Preview.<init>.<anonymous>[LocalVariableDescriptor]

'text' @ [145:36] ==> public final val KtParameter.text: (String..String?)[MyPropertyDescriptor]

'builder' @ [147:21] ==> val builder: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinInplaceParameterIntroducer.Preview.<init>[LocalVariableDescriptor]

'append' @ [147:29] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'parameterText' @ [147:36] ==> val parameterText: (String..String?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinInplaceParameterIntroducer.Preview.<init>.<anonymous>[LocalVariableDescriptor]

'TextRange' @ [149:33] ==> public constructor TextRange(p0: Int, p1: Int) defined in com.intellij.openapi.util.TextRange[JavaClassConstructorDescriptor]

'builder' @ [149:43] ==> val builder: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinInplaceParameterIntroducer.Preview.<init>[LocalVariableDescriptor]

'length' @ [149:51] ==> public open val length: Int defined in java.lang.StringBuilder[JavaPropertyDescriptor]

'parameterText' @ [149:60] ==> val parameterText: (String..String?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinInplaceParameterIntroducer.Preview.<init>.<anonymous>[LocalVariableDescriptor]

'length' @ [149:74] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'builder' @ [149:82] ==> val builder: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinInplaceParameterIntroducer.Preview.<init>[LocalVariableDescriptor]

'length' @ [149:90] ==> public open val length: Int defined in java.lang.StringBuilder[JavaPropertyDescriptor]

'if (parameter == addedParameter) {
                        addedRange = range
                    }
                    else if (!descriptor.withDefaultValue && parameter in parametersToRemove) {
                        _rangesToRemove.add(range)
                    }' @ [150:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'parameter' @ [150:25] ==> val parameter: KtParameter defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinInplaceParameterIntroducer.Preview.<init>.<anonymous>[LocalVariableDescriptor]

'addedParameter' @ [150:38] ==> value-parameter addedParameter: KtParameter? defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinInplaceParameterIntroducer.Preview.<init>[ValueParameterDescriptorImpl]

'addedRange' @ [151:25] ==> public final var addedRange: TextRange? defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinInplaceParameterIntroducer.Preview[PropertyDescriptorImpl]

'range' @ [151:38] ==> val range: TextRange defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinInplaceParameterIntroducer.Preview.<init>.<anonymous>[LocalVariableDescriptor]

'!' @ [153:30] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [153:31] ==> private final var descriptor: IntroduceParameterDescriptor defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinInplaceParameterIntroducer[PropertyDescriptorImpl]

'withDefaultValue' @ [153:42] ==> public final val withDefaultValue: Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.IntroduceParameterDescriptor[PropertyDescriptorImpl]

'parameter' @ [153:62] ==> val parameter: KtParameter defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinInplaceParameterIntroducer.Preview.<init>.<anonymous>[LocalVariableDescriptor]

'parametersToRemove' @ [153:75] ==> public final val parametersToRemove: List<KtElement> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.IntroduceParameterDescriptor[PropertyDescriptorImpl]

'_rangesToRemove' @ [154:25] ==> private final val _rangesToRemove: ArrayList<TextRange> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinInplaceParameterIntroducer.Preview[PropertyDescriptorImpl]

'add' @ [154:41] ==> public open fun add(element: TextRange): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'range' @ [154:45] ==> val range: TextRange defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinInplaceParameterIntroducer.Preview.<init>.<anonymous>[LocalVariableDescriptor]

'i' @ [157:25] ==> val i: Int defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinInplaceParameterIntroducer.Preview.<init>.<anonymous>[LocalVariableDescriptor]

'parameters' @ [157:29] ==> val parameters: List<KtParameter> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinInplaceParameterIntroducer.Preview.<init>.<anonymous>[LocalVariableDescriptor]

'lastIndex' @ [157:40] ==> public val <T> List<KtParameter>.lastIndex: Int defined in kotlin.collections[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtParameter

'builder' @ [158:25] ==> val builder: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinInplaceParameterIntroducer.Preview.<init>[LocalVariableDescriptor]

'append' @ [158:33] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'builder' @ [161:17] ==> val builder: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinInplaceParameterIntroducer.Preview.<init>[LocalVariableDescriptor]

'append' @ [161:25] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'addedRange' @ [163:21] ==> public final var addedRange: TextRange? defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinInplaceParameterIntroducer.Preview[PropertyDescriptorImpl]

'LOG' @ [164:21] ==> private final val LOG: Logger defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinInplaceParameterIntroducer.Companion[PropertyDescriptorImpl]

'error' @ [164:25] ==> public open fun error(@NonNls p0: (String..String?)): Unit defined in com.intellij.openapi.diagnostic.Logger[JavaMethodDescriptor]

'callable' @ [164:61] ==> public final val callable: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.IntroduceParameterDescriptor[PropertyDescriptorImpl]

'getElementTextWithContext' @ [164:70] ==> public fun PsiElement.getElementTextWithContext(): String defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'text' @ [168:13] ==> public final var text: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinInplaceParameterIntroducer.Preview[PropertyDescriptorImpl]

'builder' @ [168:20] ==> val builder: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinInplaceParameterIntroducer.Preview.<init>[LocalVariableDescriptor]

'toString' @ [168:28] ==> public open fun toString(): String defined in java.lang.StringBuilder[JavaMethodDescriptor]

'originalDescriptor' @ [172:30] ==> public final val originalDescriptor: IntroduceParameterDescriptor defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinInplaceParameterIntroducer[PropertyDescriptorImpl]

'initFormComponents' @ [176:9] ==> protected final fun initFormComponents(init: FormBuilder.() -> Unit): Unit defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinInplaceParameterIntroducer[SimpleFunctionDescriptorImpl]

'addComponent' @ [177:13] ==> public open fun addComponent(@NotNull p0: JComponent): (FormBuilder..FormBuilder?) defined in com.intellij.util.ui.FormBuilder[JavaMethodDescriptor]

'previewComponent' @ [177:26] ==> protected/*protected and package*/ for synthetic extension final val KotlinInplaceParameterIntroducer.previewComponent: (JComponent..JComponent?)[MyPropertyDescriptor]

'NonFocusableCheckBox' @ [179:40] ==> public constructor NonFocusableCheckBox(p0: (String..String?)) defined in com.intellij.ui.NonFocusableCheckBox[JavaClassConstructorDescriptor]

'defaultValueCheckBox' @ [180:13] ==> val defaultValueCheckBox: NonFocusableCheckBox defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinInplaceParameterIntroducer.<init>.<anonymous>[LocalVariableDescriptor]

'isSelected' @ [180:34] ==> public final var NonFocusableCheckBox.isSelected: Boolean[MyPropertyDescriptor]

'descriptor' @ [180:47] ==> private final var descriptor: IntroduceParameterDescriptor defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinInplaceParameterIntroducer[PropertyDescriptorImpl]

'withDefaultValue' @ [180:58] ==> public final val withDefaultValue: Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.IntroduceParameterDescriptor[PropertyDescriptorImpl]

'defaultValueCheckBox' @ [181:13] ==> val defaultValueCheckBox: NonFocusableCheckBox defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinInplaceParameterIntroducer.<init>.<anonymous>[LocalVariableDescriptor]

'setMnemonic' @ [181:34] ==> public open fun setMnemonic(p0: Char): Unit defined in com.intellij.ui.NonFocusableCheckBox[JavaMethodDescriptor]

'defaultValueCheckBox' @ [182:13] ==> val defaultValueCheckBox: NonFocusableCheckBox defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinInplaceParameterIntroducer.<init>.<anonymous>[LocalVariableDescriptor]

'addActionListener' @ [182:34] ==> public final fun addActionListener(p0: (((ActionEvent..ActionEvent?)) -> Unit..(((ActionEvent..ActionEvent?)) -> Unit)?)): Unit defined in com.intellij.ui.NonFocusableCheckBox[MyFunctionDescriptor]

'descriptor' @ [183:17] ==> private final var descriptor: IntroduceParameterDescriptor defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinInplaceParameterIntroducer[PropertyDescriptorImpl]

'descriptor' @ [183:30] ==> private final var descriptor: IntroduceParameterDescriptor defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinInplaceParameterIntroducer[PropertyDescriptorImpl]

'copy' @ [183:41] ==> public final fun copy(originalRange: KotlinPsiRange = ..., callable: KtNamedDeclaration = ..., callableDescriptor: FunctionDescriptor = ..., newParameterName: String = ..., newParameterTypeText: String = ..., argumentValue: KtExpression = ..., withDefaultValue: Boolean = ..., parametersUsages: MultiMap<KtElement, KtElement> = ..., occurrencesToReplace: List<KotlinPsiRange> = ..., parametersToRemove: List<KtElement> = ..., occurrenceReplacer: IntroduceParameterDescriptor.(KotlinPsiRange) -> Unit = ...): IntroduceParameterDescriptor defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.IntroduceParameterDescriptor[SimpleFunctionDescriptorImpl]

'defaultValueCheckBox' @ [183:65] ==> val defaultValueCheckBox: NonFocusableCheckBox defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinInplaceParameterIntroducer.<init>.<anonymous>[LocalVariableDescriptor]

'isSelected' @ [183:86] ==> public final var NonFocusableCheckBox.isSelected: Boolean[MyPropertyDescriptor]

'updateTitle' @ [184:17] ==> protected open fun updateTitle(declaration: KtParameter?): Unit defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinInplaceParameterIntroducer[SimpleFunctionDescriptorImpl]

'variable' @ [184:29] ==> protected for synthetic extension final val KotlinInplaceParameterIntroducer.variable: KtParameter?[MyPropertyDescriptor]

'addComponent' @ [186:13] ==> public open fun addComponent(@NotNull p0: JComponent): (FormBuilder..FormBuilder?) defined in com.intellij.util.ui.FormBuilder[JavaMethodDescriptor]

'defaultValueCheckBox' @ [186:26] ==> val defaultValueCheckBox: NonFocusableCheckBox defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinInplaceParameterIntroducer.<init>.<anonymous>[LocalVariableDescriptor]

'descriptor' @ [188:35] ==> private final var descriptor: IntroduceParameterDescriptor defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinInplaceParameterIntroducer[PropertyDescriptorImpl]

'occurrencesToReplace' @ [188:46] ==> public final val occurrencesToReplace: List<KotlinPsiRange> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.IntroduceParameterDescriptor[PropertyDescriptorImpl]

'size' @ [188:67] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'occurrenceCount' @ [189:17] ==> val occurrenceCount: Int defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinInplaceParameterIntroducer.<init>.<anonymous>[LocalVariableDescriptor]

'NonFocusableCheckBox' @ [190:42] ==> public constructor NonFocusableCheckBox(p0: (String..String?)) defined in com.intellij.ui.NonFocusableCheckBox[JavaClassConstructorDescriptor]

'occurrenceCount' @ [190:90] ==> val occurrenceCount: Int defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinInplaceParameterIntroducer.<init>.<anonymous>[LocalVariableDescriptor]

'replaceAllCheckBox' @ [191:17] ==> val replaceAllCheckBox: NonFocusableCheckBox defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinInplaceParameterIntroducer.<init>.<anonymous>[LocalVariableDescriptor]

'isSelected' @ [191:36] ==> public final var NonFocusableCheckBox.isSelected: Boolean[MyPropertyDescriptor]

'replaceAllCheckBox' @ [192:17] ==> val replaceAllCheckBox: NonFocusableCheckBox defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinInplaceParameterIntroducer.<init>.<anonymous>[LocalVariableDescriptor]

'setMnemonic' @ [192:36] ==> public open fun setMnemonic(p0: Char): Unit defined in com.intellij.ui.NonFocusableCheckBox[JavaMethodDescriptor]

'addComponent' @ [193:17] ==> public open fun addComponent(@NotNull p0: JComponent): (FormBuilder..FormBuilder?) defined in com.intellij.util.ui.FormBuilder[JavaMethodDescriptor]

'replaceAllCheckBox' @ [193:30] ==> val replaceAllCheckBox: NonFocusableCheckBox defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinInplaceParameterIntroducer.<init>.<anonymous>[LocalVariableDescriptor]

'this@KotlinInplaceParameterIntroducer' @ [194:17] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinInplaceParameterIntroducer[LazyClassReceiverParameterDescriptor]

'replaceAllCheckBox' @ [194:55] ==> private final var replaceAllCheckBox: JCheckBox? defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinInplaceParameterIntroducer[PropertyDescriptorImpl]

'replaceAllCheckBox' @ [194:76] ==> val replaceAllCheckBox: NonFocusableCheckBox defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinInplaceParameterIntroducer.<init>.<anonymous>[LocalVariableDescriptor]

'descriptor' @ [201:38] ==> private final var descriptor: IntroduceParameterDescriptor defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinInplaceParameterIntroducer[PropertyDescriptorImpl]

'callable' @ [201:49] ==> public final val callable: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.IntroduceParameterDescriptor[PropertyDescriptorImpl]

'originalDescriptor' @ [203:34] ==> public final val originalDescriptor: IntroduceParameterDescriptor defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinInplaceParameterIntroducer[PropertyDescriptorImpl]

'callable' @ [203:53] ==> public final val callable: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.IntroduceParameterDescriptor[PropertyDescriptorImpl]

'getValueParameters' @ [203:62] ==> public fun KtNamedDeclaration.getValueParameters(): List<KtParameter> defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'lastOrNull' @ [203:83] ==> public fun <T> List<KtParameter>.lastOrNull(): KtParameter? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtParameter

'suggestedNames' @ [205:78] ==> public final val suggestedNames: Array<out String> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinInplaceParameterIntroducer[PropertyDescriptorImpl]

'runWriteAction' @ [208:16] ==> public fun <T> runWriteAction(action: () -> KtParameter): KtParameter defined in org.jetbrains.kotlin.idea.util.application[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtParameter

'with' @ [209:13] ==> @InlineOnly public inline fun <T, R> with(receiver: IntroduceParameterDescriptor, block: IntroduceParameterDescriptor.() -> KtParameter): KtParameter defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IntroduceParameterDescriptor
    <R> -> KtParameter

'descriptor' @ [209:18] ==> private final var descriptor: IntroduceParameterDescriptor defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinInplaceParameterIntroducer[PropertyDescriptorImpl]

'callable' @ [210:37] ==> public final val callable: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.IntroduceParameterDescriptor[PropertyDescriptorImpl]

'getValueParameterList' @ [210:46] ==> public fun KtNamedDeclaration.getValueParameterList(): KtParameterList? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'callable' @ [211:41] ==> public final val callable: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.IntroduceParameterDescriptor[PropertyDescriptorImpl]

'createPrimaryConstructorParameterListIfAbsent' @ [211:62] ==> public fun KtClass.createPrimaryConstructorParameterListIfAbsent(): KtParameterList defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'KtPsiFactory' @ [212:33] ==> @JvmOverloads public constructor KtPsiFactory(project: Project, markGenerated: Boolean = ...) defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedClassConstructorDescriptor]

'myProject' @ [212:46] ==> protected/*protected and package*/ final val myProject: (Project..Project?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinInplaceParameterIntroducer[JavaPropertyDescriptor]

'createParameter' @ [212:57] ==> public final fun createParameter(text: String): KtParameter defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'newParameterName' @ [212:75] ==> public final val newParameterName: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.IntroduceParameterDescriptor[PropertyDescriptorImpl]

'newParameterTypeText' @ [212:94] ==> public final val newParameterTypeText: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.IntroduceParameterDescriptor[PropertyDescriptorImpl]

'parameterList' @ [213:17] ==> val parameterList: KtParameterList defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinInplaceParameterIntroducer.createFieldToStartTemplateOn.<anonymous>.<anonymous>[LocalVariableDescriptor]

'addParameter' @ [213:31] ==> @NotNull public open fun addParameter(@NotNull p0: KtParameter): KtParameter defined in org.jetbrains.kotlin.psi.KtParameterList[JavaMethodDescriptor]

'parameter' @ [213:44] ==> val parameter: KtParameter defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinInplaceParameterIntroducer.createFieldToStartTemplateOn.<anonymous>.<anonymous>[LocalVariableDescriptor]

'psiField' @ [219:13] ==> value-parameter psiField: KtParameter defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinInplaceParameterIntroducer.deleteTemplateField[ValueParameterDescriptorImpl]

'isValid' @ [219:22] ==> public final val KtParameter.isValid: Boolean[MyPropertyDescriptor]

'psiField' @ [220:14] ==> value-parameter psiField: KtParameter defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinInplaceParameterIntroducer.deleteTemplateField[ValueParameterDescriptorImpl]

'parent' @ [220:23] ==> public final val KtParameter.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'removeParameter' @ [220:52] ==> public open fun removeParameter(@NotNull p0: KtParameter): Unit defined in org.jetbrains.kotlin.psi.KtParameterList[JavaMethodDescriptor]

'psiField' @ [220:68] ==> value-parameter psiField: KtParameter defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinInplaceParameterIntroducer.deleteTemplateField[ValueParameterDescriptorImpl]

'replaceAllCheckBox' @ [224:46] ==> private final var replaceAllCheckBox: JCheckBox? defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinInplaceParameterIntroducer[PropertyDescriptorImpl]

'isSelected' @ [224:66] ==> public final var JCheckBox.isSelected: Boolean[MyPropertyDescriptor]

'replaceAllCheckBox' @ [227:9] ==> private final var replaceAllCheckBox: JCheckBox? defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinInplaceParameterIntroducer[PropertyDescriptorImpl]

'isSelected' @ [227:29] ==> public final var JCheckBox.isSelected: Boolean[MyPropertyDescriptor]

'allOccurrences' @ [227:42] ==> value-parameter allOccurrences: Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinInplaceParameterIntroducer.setReplaceAllOccurrences[ValueParameterDescriptorImpl]

'myWholePanel' @ [230:35] ==> protected/*protected and package*/ final val myWholePanel: (JPanel..JPanel?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinInplaceParameterIntroducer[JavaPropertyDescriptor]

'Preview' @ [233:23] ==> public constructor Preview(addedParameter: KtParameter?, currentName: String?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinInplaceParameterIntroducer.Preview[ClassConstructorDescriptorImpl]

'addedParameter' @ [233:31] ==> value-parameter addedParameter: KtParameter? defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinInplaceParameterIntroducer.updateTitle[ValueParameterDescriptorImpl]

'currentName' @ [233:47] ==> value-parameter currentName: String? defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinInplaceParameterIntroducer.updateTitle[ValueParameterDescriptorImpl]

'previewEditor' @ [235:24] ==> protected/*protected and package*/ for synthetic extension final val KotlinInplaceParameterIntroducer.previewEditor: (Editor..Editor?)[MyPropertyDescriptor]

'document' @ [235:38] ==> public final val Editor.document: Document[MyPropertyDescriptor]

'runWriteAction' @ [236:9] ==> public fun <T> runWriteAction(action: () -> Unit): Unit defined in org.jetbrains.kotlin.idea.util.application[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit

'document' @ [236:26] ==> val document: Document defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinInplaceParameterIntroducer.updateTitle[LocalVariableDescriptor]

'setText' @ [236:35] ==> public abstract fun setText(@NotNull p0: CharSequence): Unit defined in com.intellij.openapi.editor.Document[JavaMethodDescriptor]

'preview' @ [236:43] ==> val preview: KotlinInplaceParameterIntroducer.Preview defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinInplaceParameterIntroducer.updateTitle[LocalVariableDescriptor]

'text' @ [236:51] ==> public final var text: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinInplaceParameterIntroducer.Preview[PropertyDescriptorImpl]

'forDocument' @ [238:47] ==> public open fun forDocument(@NotNull p0: Document, @Nullable p1: Project?, p2: Boolean): (MarkupModel..MarkupModel?) defined in com.intellij.openapi.editor.impl.DocumentMarkupModel[JavaMethodDescriptor]

'document' @ [238:59] ==> val document: Document defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinInplaceParameterIntroducer.updateTitle[LocalVariableDescriptor]

'myProject' @ [238:69] ==> protected/*protected and package*/ final val myProject: (Project..Project?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinInplaceParameterIntroducer[JavaPropertyDescriptor]

'markupModel' @ [239:9] ==> val markupModel: (MarkupModel..MarkupModel?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinInplaceParameterIntroducer.updateTitle[LocalVariableDescriptor]

'removeAllHighlighters' @ [239:21] ==> public abstract fun removeAllHighlighters(): Unit defined in com.intellij.openapi.editor.markup.MarkupModel[JavaMethodDescriptor]

'preview' @ [240:9] ==> val preview: KotlinInplaceParameterIntroducer.Preview defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinInplaceParameterIntroducer.updateTitle[LocalVariableDescriptor]

'rangesToRemove' @ [240:17] ==> public final val rangesToRemove: List<TextRange> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinInplaceParameterIntroducer.Preview[PropertyDescriptorImpl]

'forEach' @ [240:32] ==> @HidesMembers public inline fun <T> Iterable<TextRange>.forEach(action: (TextRange) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TextRange

'applyToRange' @ [240:71] ==> public final fun applyToRange(range: TextRange, markupModel: MarkupModel): Unit defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinInplaceParameterIntroducer.PreviewDecorator[SimpleFunctionDescriptorImpl]

'it' @ [240:84] ==> value-parameter it: TextRange defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinInplaceParameterIntroducer.updateTitle.<anonymous>[ValueParameterDescriptorImpl]

'markupModel' @ [240:88] ==> val markupModel: (MarkupModel..MarkupModel?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinInplaceParameterIntroducer.updateTitle[LocalVariableDescriptor]

'preview' @ [241:9] ==> val preview: KotlinInplaceParameterIntroducer.Preview defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinInplaceParameterIntroducer.updateTitle[LocalVariableDescriptor]

'addedRange' @ [241:17] ==> public final var addedRange: TextRange? defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinInplaceParameterIntroducer.Preview[PropertyDescriptorImpl]

'let' @ [241:29] ==> @InlineOnly public inline fun <T, R> TextRange.let(block: (TextRange) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TextRange
    <R> -> Unit

'applyToRange' @ [241:60] ==> public final fun applyToRange(range: TextRange, markupModel: MarkupModel): Unit defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinInplaceParameterIntroducer.PreviewDecorator[SimpleFunctionDescriptorImpl]

'it' @ [241:73] ==> value-parameter it: TextRange defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinInplaceParameterIntroducer.updateTitle.<anonymous>[ValueParameterDescriptorImpl]

'markupModel' @ [241:77] ==> val markupModel: (MarkupModel..MarkupModel?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinInplaceParameterIntroducer.updateTitle[LocalVariableDescriptor]

'revalidate' @ [242:9] ==> protected/*protected and package*/ open fun revalidate(): Unit defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinInplaceParameterIntroducer[JavaMethodDescriptor]

'element' @ [246:13] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinInplaceParameterIntroducer.getRangeToRename[ValueParameterDescriptorImpl]

'element' @ [246:43] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinInplaceParameterIntroducer.getRangeToRename[ValueParameterDescriptorImpl]

'nameIdentifier' @ [246:51] ==> public final val KtProperty.nameIdentifier: PsiElement?[MyPropertyDescriptor]

'textRange' @ [246:68] ==> public final val PsiElement.textRange: (TextRange..TextRange?)[MyPropertyDescriptor]

'shiftRight' @ [246:78] ==> @NotNull public open fun shiftRight(p0: Int): TextRange defined in com.intellij.openapi.util.TextRange[JavaMethodDescriptor]

'-' @ [246:89] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'element' @ [246:90] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinInplaceParameterIntroducer.getRangeToRename[ValueParameterDescriptorImpl]

'startOffset' @ [246:98] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'super' @ [247:16] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinInplaceParameterIntroducer[LazyClassReceiverParameterDescriptor]

'getRangeToRename' @ [247:22] ==> @NotNull protected/*protected and package*/ open fun getRangeToRename(@NotNull p0: PsiElement): TextRange defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractKotlinInplaceIntroducer[JavaMethodDescriptor]

'element' @ [247:39] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinInplaceParameterIntroducer.getRangeToRename[ValueParameterDescriptorImpl]

'element' @ [251:13] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinInplaceParameterIntroducer.createMarker[ValueParameterDescriptorImpl]

'super' @ [251:43] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinInplaceParameterIntroducer[LazyClassReceiverParameterDescriptor]

'createMarker' @ [251:49] ==> protected/*protected and package*/ open fun createMarker(p0: (PsiElement..PsiElement?)): (RangeMarker..RangeMarker?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractKotlinInplaceIntroducer[JavaMethodDescriptor]

'element' @ [251:62] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinInplaceParameterIntroducer.createMarker[ValueParameterDescriptorImpl]

'nameIdentifier' @ [251:70] ==> public final val KtProperty.nameIdentifier: PsiElement?[MyPropertyDescriptor]

'super' @ [252:16] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinInplaceParameterIntroducer[LazyClassReceiverParameterDescriptor]

'createMarker' @ [252:22] ==> protected/*protected and package*/ open fun createMarker(p0: (PsiElement..PsiElement?)): (RangeMarker..RangeMarker?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractKotlinInplaceIntroducer[JavaMethodDescriptor]

'element' @ [252:35] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinInplaceParameterIntroducer.createMarker[ValueParameterDescriptorImpl]

'getDescriptorToRefactor' @ [256:9] ==> private final fun getDescriptorToRefactor(replaceAll: Boolean): IntroduceParameterDescriptor defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinInplaceParameterIntroducer[SimpleFunctionDescriptorImpl]

'isReplaceAllOccurrences' @ [256:33] ==> public final var KotlinInplaceParameterIntroducer.isReplaceAllOccurrences: Boolean[MyPropertyDescriptor]

'performRefactoring' @ [256:58] ==> public fun IntroduceParameterDescriptor.performRefactoring(): Unit defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter in file KotlinIntroduceParameterHandler.kt[SimpleFunctionDescriptorImpl]

'expr' @ [260:29] ==> public final val KotlinInplaceParameterIntroducer.expr: KtExpression?[MyPropertyDescriptor]

'toRange' @ [260:34] ==> public fun PsiElement?.toRange(): KotlinPsiRange defined in org.jetbrains.kotlin.idea.util.psi.patternMatching[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [261:16] ==> private final var descriptor: IntroduceParameterDescriptor defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinInplaceParameterIntroducer[PropertyDescriptorImpl]

'copy' @ [261:27] ==> public final fun copy(originalRange: KotlinPsiRange = ..., callable: KtNamedDeclaration = ..., callableDescriptor: FunctionDescriptor = ..., newParameterName: String = ..., newParameterTypeText: String = ..., argumentValue: KtExpression = ..., withDefaultValue: Boolean = ..., parametersUsages: MultiMap<KtElement, KtElement> = ..., occurrencesToReplace: List<KotlinPsiRange> = ..., parametersToRemove: List<KtElement> = ..., occurrenceReplacer: IntroduceParameterDescriptor.(KotlinPsiRange) -> Unit = ...): IntroduceParameterDescriptor defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.IntroduceParameterDescriptor[SimpleFunctionDescriptorImpl]

'originalRange' @ [262:33] ==> val originalRange: KotlinPsiRange defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinInplaceParameterIntroducer.getDescriptorToRefactor[LocalVariableDescriptor]

'if (replaceAll) occurrences.map { it.toRange() } else listOf(originalRange)' @ [263:40] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: List<KotlinPsiRange>, elseBranch: List<KotlinPsiRange>): List<KotlinPsiRange>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> List<KotlinPsiRange>

'replaceAll' @ [263:44] ==> value-parameter replaceAll: Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinInplaceParameterIntroducer.getDescriptorToRefactor[ValueParameterDescriptorImpl]

'occurrences' @ [263:56] ==> public final val KotlinInplaceParameterIntroducer.occurrences: (Array<(KtExpression..KtExpression?)>..Array<out (KtExpression..KtExpression?)>?)[MyPropertyDescriptor]

'map' @ [263:68] ==> public inline fun <T, R> Array<out (KtExpression..KtExpression?)>.map(transform: ((KtExpression..KtExpression?)) -> KotlinPsiRange): List<KotlinPsiRange> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtExpression..org.jetbrains.kotlin.psi.KtExpression?)
    <R> -> KotlinPsiRange

'it' @ [263:74] ==> value-parameter it: (KtExpression..KtExpression?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinInplaceParameterIntroducer.getDescriptorToRefactor.<anonymous>[ValueParameterDescriptorImpl]

'toRange' @ [263:77] ==> public fun PsiElement?.toRange(): KotlinPsiRange defined in org.jetbrains.kotlin.idea.util.psi.patternMatching[DeserializedSimpleFunctionDescriptor]

'listOf' @ [263:94] ==> public fun <T> listOf(element: KotlinPsiRange): List<KotlinPsiRange> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinPsiRange

'originalRange' @ [263:101] ==> val originalRange: KotlinPsiRange defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinInplaceParameterIntroducer.getDescriptorToRefactor[LocalVariableDescriptor]

'expr' @ [264:33] ==> public final val KotlinInplaceParameterIntroducer.expr: KtExpression?[MyPropertyDescriptor]

'stopIntroduce' @ [269:9] ==> public open fun stopIntroduce(p0: (Editor..Editor?)): Unit defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinInplaceParameterIntroducer[JavaMethodDescriptor]

'myEditor' @ [269:23] ==> protected/*protected and package*/ final val myEditor: (Editor..Editor?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinInplaceParameterIntroducer[JavaPropertyDescriptor]

'KotlinIntroduceParameterDialog' @ [270:9] ==> public constructor KotlinIntroduceParameterDialog(project: Project, editor: Editor, descriptor: IntroduceParameterDescriptor, nameSuggestions: Array<String>, typeSuggestions: List<KotlinType>, helper: KotlinIntroduceParameterHelper) defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterDialog[ClassConstructorDescriptorImpl]

'myProject' @ [270:40] ==> protected/*protected and package*/ final val myProject: (Project..Project?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinInplaceParameterIntroducer[JavaPropertyDescriptor]

'myEditor' @ [271:40] ==> protected/*protected and package*/ final val myEditor: (Editor..Editor?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinInplaceParameterIntroducer[JavaPropertyDescriptor]

'getDescriptorToRefactor' @ [272:40] ==> private final fun getDescriptorToRefactor(replaceAll: Boolean): IntroduceParameterDescriptor defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinInplaceParameterIntroducer[SimpleFunctionDescriptorImpl]

'myNameSuggestions' @ [273:40] ==> protected/*protected and package*/ final var myNameSuggestions: (LinkedHashSet<(String..String?)>..LinkedHashSet<(String..String?)>?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinInplaceParameterIntroducer[JavaPropertyDescriptor]

'toTypedArray' @ [273:58] ==> public inline fun <reified T> Collection<String>.toTypedArray(): Array<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> String

'listOf' @ [274:40] ==> public fun <T> listOf(element: KotlinType): List<KotlinType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType

'parameterType' @ [274:47] ==> public final val parameterType: KotlinType defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinInplaceParameterIntroducer[PropertyDescriptorImpl]

'parameterType' @ [274:64] ==> public final val parameterType: KotlinType defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinInplaceParameterIntroducer[PropertyDescriptorImpl]

'supertypes' @ [274:78] ==> public fun KotlinType.supertypes(): Collection<KotlinType> defined in org.jetbrains.kotlin.types.typeUtil[DeserializedSimpleFunctionDescriptor]

'Default' @ [275:71] ==> public object Default : KotlinIntroduceParameterHelper defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterHelper[FakeCallableDescriptorForObject]

'show' @ [275:80] ==> public open fun show(): Unit defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterDialog[JavaMethodDescriptor]

