'message' @ [77:54] ==> @NotNull public open fun message(@NonNls @PropertyKey key: (String..String?), vararg params: (Any..Any?)): String defined in org.jetbrains.kotlin.idea.refactoring.KotlinRefactoringBundle[JavaMethodDescriptor]

'create' @ [79:38] ==> @NotNull public open fun <T : (Any..Any?)> create(@NotNull @NonNls p0: String): Key<(Boolean..Boolean?)> defined in com.intellij.openapi.util.Key[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Boolean

'create' @ [80:35] ==> @NotNull public open fun <T : (Any..Any?)> create(@NotNull @NonNls p0: String): Key<(Boolean..Boolean?)> defined in com.intellij.openapi.util.Key[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Boolean

'create' @ [81:41] ==> @NotNull public open fun <T : (Any..Any?)> create(@NotNull @NonNls p0: String): Key<(Boolean..Boolean?)> defined in com.intellij.openapi.util.Key[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Boolean

'getValue' @ [83:55] ==> public final operator fun getValue(thisRef: R, property: KProperty<*>): T defined in org.jetbrains.kotlin.psi.NotNullableCopyableUserDataProperty[DeserializedSimpleFunctionDescriptor]

'create' @ [83:95] ==> @NotNull public open fun <T : (Any..Any?)> create(@NotNull @NonNls p0: String): Key<(Boolean..Boolean?)> defined in com.intellij.openapi.util.Key[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.Boolean..kotlin.Boolean?)

'KtPsiFactory' @ [98:34] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'expression' @ [98:47] ==> private final val expression: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext[PropertyDescriptorImpl]

'ArrayList' @ [102:26] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> KtExpression

'newContainer' @ [105:20] ==> value-parameter newContainer: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext.findElementByOffsetAndText[ValueParameterDescriptorImpl]

'findElementAt' @ [105:33] ==> @Nullable @Contract public abstract fun findElementAt(p0: Int): PsiElement? defined in com.intellij.psi.PsiElement[JavaMethodDescriptor]

'offset' @ [105:47] ==> value-parameter offset: Int defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext.findElementByOffsetAndText[ValueParameterDescriptorImpl]

'parentsWithSelf' @ [105:56] ==> public val PsiElement.parentsWithSelf: Sequence<PsiElement> defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'firstOrNull' @ [105:73] ==> public inline fun <T> Sequence<PsiElement>.firstOrNull(predicate: (PsiElement) -> Boolean): PsiElement? defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'==' @ [105:87] ==> public open fun equals(other: Any?): Boolean defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'it' @ [105:88] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext.findElementByOffsetAndText.<anonymous>[ValueParameterDescriptorImpl]

'text' @ [105:110] ==> public final val KtExpression.text: (String..String?)[MyPropertyDescriptor]

'text' @ [105:118] ==> value-parameter text: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext.findElementByOffsetAndText[ValueParameterDescriptorImpl]

'expression' @ [109:38] ==> private final val expression: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext[PropertyDescriptorImpl]

'expressionToReplace' @ [109:52] ==> value-parameter expressionToReplace: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext.replaceExpression[ValueParameterDescriptorImpl]

'psiFactory' @ [111:31] ==> private final val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext[PropertyDescriptorImpl]

'createExpression' @ [111:42] ==> public final fun createExpression(text: String): KtExpression defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'nameSuggestions' @ [111:59] ==> private final val nameSuggestions: List<Collection<String>> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext[PropertyDescriptorImpl]

'single' @ [111:75] ==> public fun <T> List<Collection<String>>.single(): Collection<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Collection<String>

'first' @ [111:84] ==> public fun <T> Iterable<String>.first(): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'expressionToReplace' @ [112:33] ==> value-parameter expressionToReplace: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext.replaceExpression[ValueParameterDescriptorImpl]

'extractableSubstringInfo' @ [112:53] ==> public var KtExpression.extractableSubstringInfo: ExtractableSubstringInfo? defined in org.jetbrains.kotlin.idea.refactoring.introduce[DeserializedPropertyDescriptor]

'when {
                expressionToReplace.isLambdaOutsideParentheses() -> {
                    val functionLiteralArgument = expressionToReplace.getStrictParentOfType<KtLambdaArgument>()!!
                    val newCallExpression = functionLiteralArgument.moveInsideParenthesesAndReplaceWith(replacement, bindingContext)
                    newCallExpression.valueArguments.last().getArgumentExpression()!!
                }
                substringInfo != null -> substringInfo.replaceWith(replacement)
                else -> expressionToReplace.replace(replacement) as KtExpression
            }' @ [113:26] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: KtExpression, entry1: KtExpression, entry2: KtExpression): KtExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> KtExpression

'expressionToReplace' @ [114:17] ==> value-parameter expressionToReplace: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext.replaceExpression[ValueParameterDescriptorImpl]

'isLambdaOutsideParentheses' @ [114:37] ==> public fun KtExpression.isLambdaOutsideParentheses(): Boolean defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'expressionToReplace' @ [115:51] ==> value-parameter expressionToReplace: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext.replaceExpression[ValueParameterDescriptorImpl]

'getStrictParentOfType' @ [115:71] ==> public inline fun <reified T : PsiElement> PsiElement.getStrictParentOfType(): KtLambdaArgument? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtLambdaArgument

'functionLiteralArgument' @ [116:45] ==> val functionLiteralArgument: KtLambdaArgument defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext.replaceExpression[LocalVariableDescriptor]

'moveInsideParenthesesAndReplaceWith' @ [116:69] ==> public fun KtLambdaArgument.moveInsideParenthesesAndReplaceWith(replacement: KtExpression, bindingContext: BindingContext): KtCallExpression defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]

'replacement' @ [116:105] ==> val replacement: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext.replaceExpression[LocalVariableDescriptor]

'bindingContext' @ [116:118] ==> private final val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext[PropertyDescriptorImpl]

'newCallExpression' @ [117:21] ==> val newCallExpression: KtCallExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext.replaceExpression[LocalVariableDescriptor]

'valueArguments' @ [117:39] ==> public final val KtCallExpression.valueArguments: (MutableList<(KtValueArgument..KtValueArgument?)>..List<(KtValueArgument..KtValueArgument?)>)[MyPropertyDescriptor]

'last' @ [117:54] ==> public fun <T> List<(KtValueArgument..KtValueArgument?)>.last(): (KtValueArgument..KtValueArgument?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtValueArgument..org.jetbrains.kotlin.psi.KtValueArgument?)

'getArgumentExpression' @ [117:61] ==> @IfNotParsed @Nullable public open fun getArgumentExpression(): KtExpression? defined in org.jetbrains.kotlin.psi.KtValueArgument[JavaMethodDescriptor]

'substringInfo' @ [119:17] ==> val substringInfo: ExtractableSubstringInfo? defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext.replaceExpression[LocalVariableDescriptor]

'substringInfo' @ [119:42] ==> val substringInfo: ExtractableSubstringInfo? defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext.replaceExpression[LocalVariableDescriptor]

'replaceWith' @ [119:56] ==> public fun ExtractableSubstringInfo.replaceWith(replacement: KtExpression): KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce in file introduceUtil.kt[SimpleFunctionDescriptorImpl]

'replacement' @ [119:68] ==> val replacement: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext.replaceExpression[LocalVariableDescriptor]

'expressionToReplace' @ [120:25] ==> value-parameter expressionToReplace: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext.replaceExpression[ValueParameterDescriptorImpl]

'replace' @ [120:45] ==> public abstract fun replace(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtExpression[JavaMethodDescriptor]

'replacement' @ [120:53] ==> val replacement: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext.replaceExpression[LocalVariableDescriptor]

'result' @ [123:13] ==> var result: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext.replaceExpression[LocalVariableDescriptor]

'result' @ [123:22] ==> var result: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext.replaceExpression[LocalVariableDescriptor]

'removeTemplateEntryBracesIfPossible' @ [123:29] ==> public fun KtExpression.removeTemplateEntryBracesIfPossible(): KtExpression defined in org.jetbrains.kotlin.idea.refactoring in file kotlinRefactoringUtil.kt[SimpleFunctionDescriptorImpl]

'addToReferences' @ [125:17] ==> value-parameter addToReferences: Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext.replaceExpression[ValueParameterDescriptorImpl]

'references' @ [125:34] ==> public final val references: ArrayList<KtExpression> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext[PropertyDescriptorImpl]

'addIfNotNull' @ [125:45] ==> public fun <T : Any> MutableCollection<KtExpression>.addIfNotNull(t: KtExpression?): Unit defined in org.jetbrains.kotlin.utils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> KtExpression

'result' @ [125:58] ==> var result: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext.replaceExpression[LocalVariableDescriptor]

'isActualExpression' @ [127:17] ==> val isActualExpression: Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext.replaceExpression[LocalVariableDescriptor]

'reference' @ [127:37] ==> public final var reference: KtExpression? defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext[PropertyDescriptorImpl]

'result' @ [127:49] ==> var result: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext.replaceExpression[LocalVariableDescriptor]

'result' @ [129:20] ==> var result: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext.replaceExpression[LocalVariableDescriptor]

'?:' @ [139:31] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: KtExpression?, right: KtExpression): KtExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> KtExpression

'expression' @ [139:32] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext.runRefactoring[ValueParameterDescriptorImpl]

'expression' @ [139:75] ==> public final val KtParenthesizedExpression.expression: KtExpression?[MyPropertyDescriptor]

'expression' @ [139:89] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext.runRefactoring[ValueParameterDescriptorImpl]

'if (initializer.mustBeParenthesizedInInitializerPosition()) "(${initializer.text})" else initializer.text' @ [140:35] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (String..String?), elseBranch: (String..String?)): (String..String?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (kotlin.String..kotlin.String?)

'initializer' @ [140:39] ==> val initializer: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext.runRefactoring[LocalVariableDescriptor]

'mustBeParenthesizedInInitializerPosition' @ [140:51] ==> public fun KtExpression.mustBeParenthesizedInInitializerPosition(): Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce in file introduceUtil.kt[SimpleFunctionDescriptorImpl]

'initializer' @ [140:99] ==> val initializer: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext.runRefactoring[LocalVariableDescriptor]

'text' @ [140:111] ==> public final val KtExpression.text: (String..String?)[MyPropertyDescriptor]

'initializer' @ [140:124] ==> val initializer: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext.runRefactoring[LocalVariableDescriptor]

'text' @ [140:136] ==> public final val KtExpression.text: (String..String?)[MyPropertyDescriptor]

'if (isVar) "var" else "val"' @ [142:28] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'isVar' @ [142:32] ==> value-parameter isVar: Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext.runRefactoring[ValueParameterDescriptorImpl]

'if (componentFunctions.isNotEmpty()) {
                buildString {
                    componentFunctions.indices.joinTo(this, prefix = "$varOvVal (", postfix = ")") { nameSuggestions[it].first() }
                    append(" = ")
                    append(initializerText)
                }.let { psiFactory.createDestructuringDeclaration(it) }
            }
            else {
                buildString {
                    append("$varOvVal ")
                    append(nameSuggestions.single().first())
                    if (noTypeInference) {
                        val typeToRender = expressionType ?: resolutionFacade.moduleDescriptor.builtIns.anyType
                        append(": ").append(IdeDescriptorRenderers.SOURCE_CODE.renderType(typeToRender))
                    }
                    append(" = ")
                    append(initializerText)
                }.let { psiFactory.createProperty(it) }
            }' @ [144:43] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KtDeclaration, elseBranch: KtDeclaration): KtDeclaration[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KtDeclaration

'componentFunctions' @ [144:47] ==> private final val componentFunctions: List<FunctionDescriptor> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext[PropertyDescriptorImpl]

'isNotEmpty' @ [144:66] ==> @InlineOnly public inline fun <T> Collection<FunctionDescriptor>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FunctionDescriptor

'buildString' @ [145:17] ==> @InlineOnly public inline fun buildString(builderAction: StringBuilder /* = StringBuilder */.() -> Unit): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'componentFunctions' @ [146:21] ==> private final val componentFunctions: List<FunctionDescriptor> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext[PropertyDescriptorImpl]

'indices' @ [146:40] ==> public val Collection<*>.indices: IntRange defined in kotlin.collections[DeserializedPropertyDescriptor]

'joinTo' @ [146:48] ==> public fun <T, A : Appendable /* = Appendable */> Iterable<Int>.joinTo(buffer: StringBuilder /* = StringBuilder */, separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((Int) -> CharSequence)? = ...): StringBuilder /* = StringBuilder */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int
    <A : Appendable /* = Appendable */> -> StringBuilder

'this' @ [146:55] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext.runRefactoring.<anonymous>[ReceiverParameterDescriptorImpl]

'varOvVal' @ [146:72] ==> val varOvVal: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext.runRefactoring[LocalVariableDescriptor]

'nameSuggestions' @ [146:102] ==> private final val nameSuggestions: List<Collection<String>> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext[PropertyDescriptorImpl]

'it' @ [146:118] ==> value-parameter it: Int defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext.runRefactoring.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'first' @ [146:122] ==> public fun <T> Iterable<String>.first(): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'append' @ [147:21] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'append' @ [148:21] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'initializerText' @ [148:28] ==> val initializerText: (String..String?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext.runRefactoring[LocalVariableDescriptor]

'let' @ [149:19] ==> @InlineOnly public inline fun <T, R> String.let(block: (String) -> KtDestructuringDeclaration): KtDestructuringDeclaration defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> KtDestructuringDeclaration

'psiFactory' @ [149:25] ==> private final val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext[PropertyDescriptorImpl]

'createDestructuringDeclaration' @ [149:36] ==> public final fun createDestructuringDeclaration(text: String): KtDestructuringDeclaration defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'it' @ [149:67] ==> value-parameter it: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext.runRefactoring.<anonymous>[ValueParameterDescriptorImpl]

'buildString' @ [152:17] ==> @InlineOnly public inline fun buildString(builderAction: StringBuilder /* = StringBuilder */.() -> Unit): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'append' @ [153:21] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'varOvVal' @ [153:30] ==> val varOvVal: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext.runRefactoring[LocalVariableDescriptor]

'append' @ [154:21] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'nameSuggestions' @ [154:28] ==> private final val nameSuggestions: List<Collection<String>> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext[PropertyDescriptorImpl]

'single' @ [154:44] ==> public fun <T> List<Collection<String>>.single(): Collection<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Collection<String>

'first' @ [154:53] ==> public fun <T> Iterable<String>.first(): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'noTypeInference' @ [155:25] ==> private final val noTypeInference: Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext[PropertyDescriptorImpl]

'expressionType' @ [156:44] ==> private final val expressionType: KotlinType? defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext[PropertyDescriptorImpl]

'resolutionFacade' @ [156:62] ==> private final val resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext[PropertyDescriptorImpl]

'moduleDescriptor' @ [156:79] ==> public abstract val moduleDescriptor: ModuleDescriptor defined in org.jetbrains.kotlin.idea.resolve.ResolutionFacade[DeserializedPropertyDescriptor]

'builtIns' @ [156:96] ==> public abstract val builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.descriptors.ModuleDescriptor[DeserializedPropertyDescriptor]

'anyType' @ [156:105] ==> public final val KotlinBuiltIns.anyType: SimpleType[MyPropertyDescriptor]

'append' @ [157:25] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'append' @ [157:38] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'SOURCE_CODE' @ [157:68] ==> @field:JvmField public final val SOURCE_CODE: DescriptorRenderer defined in org.jetbrains.kotlin.idea.util.IdeDescriptorRenderers[DeserializedPropertyDescriptor]

'renderType' @ [157:80] ==> public abstract fun renderType(type: KotlinType): String defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[DeserializedSimpleFunctionDescriptor]

'typeToRender' @ [157:91] ==> val typeToRender: KotlinType defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext.runRefactoring.<anonymous>[LocalVariableDescriptor]

'append' @ [159:21] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'append' @ [160:21] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'initializerText' @ [160:28] ==> val initializerText: (String..String?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext.runRefactoring[LocalVariableDescriptor]

'let' @ [161:19] ==> @InlineOnly public inline fun <T, R> String.let(block: (String) -> KtProperty): KtProperty defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> KtProperty

'psiFactory' @ [161:25] ==> private final val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext[PropertyDescriptorImpl]

'createProperty' @ [161:36] ==> public final fun createProperty(text: String): KtProperty defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'it' @ [161:51] ==> value-parameter it: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext.runRefactoring.<anonymous>[ValueParameterDescriptorImpl]

'calculateAnchor' @ [164:26] ==> private final fun calculateAnchor(commonParent: PsiElement, commonContainer: PsiElement, allReplaces: List<KtExpression>): PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler[SimpleFunctionDescriptorImpl]

'commonParent' @ [164:42] ==> value-parameter commonParent: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext.runRefactoring[ValueParameterDescriptorImpl]

'commonContainer' @ [164:56] ==> value-parameter commonContainer: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext.runRefactoring[ValueParameterDescriptorImpl]

'allReplaces' @ [164:73] ==> value-parameter allReplaces: List<KtExpression> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext.runRefactoring[ValueParameterDescriptorImpl]

'commonContainer' @ [165:30] ==> value-parameter commonContainer: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext.runRefactoring[ValueParameterDescriptorImpl]

'commonContainer' @ [165:71] ==> value-parameter commonContainer: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext.runRefactoring[ValueParameterDescriptorImpl]

'commonContainer' @ [165:106] ==> value-parameter commonContainer: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext.runRefactoring[ValueParameterDescriptorImpl]

'if (!needBraces) {
                property = commonContainer.addBefore(property, anchor) as KtDeclaration
                commonContainer.addBefore(psiFactory.createNewLine(), anchor)
            }
            else {
                var emptyBody: KtExpression = psiFactory.createEmptyBody()
                val firstChild = emptyBody.firstChild
                emptyBody.addAfter(psiFactory.createNewLine(), firstChild)

                if (replaceOccurrence) {
                    for (replace in allReplaces) {
                        val exprAfterReplace = replaceExpression(replace, false)
                        exprAfterReplace.isOccurrence = true
                        if (anchor == replace) {
                            anchor = exprAfterReplace
                        }
                    }

                    var oldElement: PsiElement = commonContainer
                    if (commonContainer is KtWhenEntry) {
                        val body = commonContainer.expression
                        if (body != null) {
                            oldElement = body
                        }
                    }
                    else if (commonContainer is KtContainerNode) {
                        val children = commonContainer.children
                        for (child in children) {
                            if (child is KtExpression) {
                                oldElement = child
                            }
                        }
                    }
                    //ugly logic to make sure we are working with right actual expression
                    var actualExpression = reference!!
                    var diff = actualExpression.textRange.startOffset - oldElement.textRange.startOffset
                    var actualExpressionText = actualExpression.text
                    val newElement = emptyBody.addAfter(oldElement, firstChild)
                    var elem: PsiElement? = findElementByOffsetAndText(diff, actualExpressionText, newElement)
                    if (elem != null) {
                        reference = elem as KtExpression
                    }
                    emptyBody.addAfter(psiFactory.createNewLine(), firstChild)
                    property = emptyBody.addAfter(property, firstChild) as KtProperty
                    emptyBody.addAfter(psiFactory.createNewLine(), firstChild)
                    actualExpression = reference!!
                    diff = actualExpression.textRange.startOffset - emptyBody.textRange.startOffset
                    actualExpressionText = actualExpression.text
                    emptyBody = anchor.replace(emptyBody) as KtBlockExpression
                    elem = findElementByOffsetAndText(diff, actualExpressionText, emptyBody)
                    if (elem != null) {
                        reference = elem as KtExpression
                    }

                    emptyBody.accept(
                            object : KtTreeVisitorVoid() {
                                override fun visitSimpleNameExpression(expression: KtSimpleNameExpression) {
                                    if (!expression.isOccurrence) return

                                    expression.isOccurrence = false
                                    references.add(expression)
                                }
                            })
                }
                else {
                    val parent = anchor.parent
                    val copyTo = parent.lastChild
                    val copyFrom = anchor.nextSibling

                    property = emptyBody.addAfter(property, firstChild) as KtProperty
                    emptyBody.addAfter(psiFactory.createNewLine(), firstChild)
                    if (copyFrom != null && copyTo != null) {
                        emptyBody.addRangeAfter(copyFrom, copyTo, property)
                        parent.deleteChildRange(copyFrom, copyTo)
                    }
                    emptyBody = anchor.replace(emptyBody) as KtBlockExpression
                }
                for (child in emptyBody.children) {
                    if (child is KtProperty) {
                        property = child
                    }
                }
                if (commonContainer is KtContainerNode) {
                    if (commonContainer.parent is KtIfExpression) {
                        val next = commonContainer.nextSibling
                        if (next != null) {
                            val nextnext = next.nextSibling
                            if (nextnext != null && nextnext.node.elementType == KtTokens.ELSE_KEYWORD) {
                                if (next is PsiWhiteSpace) {
                                    next.replace(psiFactory.createWhiteSpace())
                                }
                            }
                        }
                    }
                }
            }' @ [166:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (Any..Any?), elseBranch: (Any..Any?)): (Any..Any?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (kotlin.Any..kotlin.Any?)

'!' @ [166:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'needBraces' @ [166:18] ==> val needBraces: Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext.runRefactoring[LocalVariableDescriptor]

'property' @ [167:17] ==> var property: KtDeclaration defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext.runRefactoring[LocalVariableDescriptor]

'commonContainer' @ [167:28] ==> value-parameter commonContainer: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext.runRefactoring[ValueParameterDescriptorImpl]

'addBefore' @ [167:44] ==> public abstract fun addBefore(@NotNull p0: PsiElement, @Nullable p1: PsiElement?): (PsiElement..PsiElement?) defined in com.intellij.psi.PsiElement[JavaMethodDescriptor]

'property' @ [167:54] ==> var property: KtDeclaration defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext.runRefactoring[LocalVariableDescriptor]

'anchor' @ [167:64] ==> var anchor: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext.runRefactoring[LocalVariableDescriptor]

'commonContainer' @ [168:17] ==> value-parameter commonContainer: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext.runRefactoring[ValueParameterDescriptorImpl]

'addBefore' @ [168:33] ==> public abstract fun addBefore(@NotNull p0: PsiElement, @Nullable p1: PsiElement?): (PsiElement..PsiElement?) defined in com.intellij.psi.PsiElement[JavaMethodDescriptor]

'psiFactory' @ [168:43] ==> private final val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext[PropertyDescriptorImpl]

'createNewLine' @ [168:54] ==> public final fun createNewLine(): PsiElement defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'anchor' @ [168:71] ==> var anchor: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext.runRefactoring[LocalVariableDescriptor]

'psiFactory' @ [171:47] ==> private final val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext[PropertyDescriptorImpl]

'createEmptyBody' @ [171:58] ==> public final fun createEmptyBody(): KtBlockExpression defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'emptyBody' @ [172:34] ==> var emptyBody: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext.runRefactoring[LocalVariableDescriptor]

'firstChild' @ [172:44] ==> public final val KtExpression.firstChild: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'emptyBody' @ [173:17] ==> var emptyBody: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext.runRefactoring[LocalVariableDescriptor]

'addAfter' @ [173:27] ==> public abstract fun addAfter(@NotNull p0: PsiElement, @Nullable p1: PsiElement?): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtExpression[JavaMethodDescriptor]

'psiFactory' @ [173:36] ==> private final val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext[PropertyDescriptorImpl]

'createNewLine' @ [173:47] ==> public final fun createNewLine(): PsiElement defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'firstChild' @ [173:64] ==> val firstChild: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext.runRefactoring[LocalVariableDescriptor]

'if (replaceOccurrence) {
                    for (replace in allReplaces) {
                        val exprAfterReplace = replaceExpression(replace, false)
                        exprAfterReplace.isOccurrence = true
                        if (anchor == replace) {
                            anchor = exprAfterReplace
                        }
                    }

                    var oldElement: PsiElement = commonContainer
                    if (commonContainer is KtWhenEntry) {
                        val body = commonContainer.expression
                        if (body != null) {
                            oldElement = body
                        }
                    }
                    else if (commonContainer is KtContainerNode) {
                        val children = commonContainer.children
                        for (child in children) {
                            if (child is KtExpression) {
                                oldElement = child
                            }
                        }
                    }
                    //ugly logic to make sure we are working with right actual expression
                    var actualExpression = reference!!
                    var diff = actualExpression.textRange.startOffset - oldElement.textRange.startOffset
                    var actualExpressionText = actualExpression.text
                    val newElement = emptyBody.addAfter(oldElement, firstChild)
                    var elem: PsiElement? = findElementByOffsetAndText(diff, actualExpressionText, newElement)
                    if (elem != null) {
                        reference = elem as KtExpression
                    }
                    emptyBody.addAfter(psiFactory.createNewLine(), firstChild)
                    property = emptyBody.addAfter(property, firstChild) as KtProperty
                    emptyBody.addAfter(psiFactory.createNewLine(), firstChild)
                    actualExpression = reference!!
                    diff = actualExpression.textRange.startOffset - emptyBody.textRange.startOffset
                    actualExpressionText = actualExpression.text
                    emptyBody = anchor.replace(emptyBody) as KtBlockExpression
                    elem = findElementByOffsetAndText(diff, actualExpressionText, emptyBody)
                    if (elem != null) {
                        reference = elem as KtExpression
                    }

                    emptyBody.accept(
                            object : KtTreeVisitorVoid() {
                                override fun visitSimpleNameExpression(expression: KtSimpleNameExpression) {
                                    if (!expression.isOccurrence) return

                                    expression.isOccurrence = false
                                    references.add(expression)
                                }
                            })
                }
                else {
                    val parent = anchor.parent
                    val copyTo = parent.lastChild
                    val copyFrom = anchor.nextSibling

                    property = emptyBody.addAfter(property, firstChild) as KtProperty
                    emptyBody.addAfter(psiFactory.createNewLine(), firstChild)
                    if (copyFrom != null && copyTo != null) {
                        emptyBody.addRangeAfter(copyFrom, copyTo, property)
                        parent.deleteChildRange(copyFrom, copyTo)
                    }
                    emptyBody = anchor.replace(emptyBody) as KtBlockExpression
                }' @ [175:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'replaceOccurrence' @ [175:21] ==> private final val replaceOccurrence: Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext[PropertyDescriptorImpl]

'allReplaces' @ [176:37] ==> value-parameter allReplaces: List<KtExpression> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext.runRefactoring[ValueParameterDescriptorImpl]

'replaceExpression' @ [177:48] ==> private final fun replaceExpression(expressionToReplace: KtExpression, addToReferences: Boolean): KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext[SimpleFunctionDescriptorImpl]

'replace' @ [177:66] ==> val replace: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext.runRefactoring[LocalVariableDescriptor]

'exprAfterReplace' @ [178:25] ==> val exprAfterReplace: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext.runRefactoring[LocalVariableDescriptor]

'isOccurrence' @ [178:42] ==> private final var KtExpression.isOccurrence: Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler[PropertyDescriptorImpl]

'anchor' @ [179:29] ==> var anchor: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext.runRefactoring[LocalVariableDescriptor]

'replace' @ [179:39] ==> val replace: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext.runRefactoring[LocalVariableDescriptor]

'anchor' @ [180:29] ==> var anchor: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext.runRefactoring[LocalVariableDescriptor]

'exprAfterReplace' @ [180:38] ==> val exprAfterReplace: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext.runRefactoring[LocalVariableDescriptor]

'commonContainer' @ [184:50] ==> value-parameter commonContainer: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext.runRefactoring[ValueParameterDescriptorImpl]

'if (commonContainer is KtWhenEntry) {
                        val body = commonContainer.expression
                        if (body != null) {
                            oldElement = body
                        }
                    }
                    else if (commonContainer is KtContainerNode) {
                        val children = commonContainer.children
                        for (child in children) {
                            if (child is KtExpression) {
                                oldElement = child
                            }
                        }
                    }' @ [185:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'commonContainer' @ [185:25] ==> value-parameter commonContainer: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext.runRefactoring[ValueParameterDescriptorImpl]

'commonContainer' @ [186:36] ==> value-parameter commonContainer: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext.runRefactoring[ValueParameterDescriptorImpl]

'expression' @ [186:52] ==> public final val KtWhenEntry.expression: KtExpression?[MyPropertyDescriptor]

'body' @ [187:29] ==> val body: KtExpression? defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext.runRefactoring[LocalVariableDescriptor]

'oldElement' @ [188:29] ==> var oldElement: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext.runRefactoring[LocalVariableDescriptor]

'body' @ [188:42] ==> val body: KtExpression? defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext.runRefactoring[LocalVariableDescriptor]

'commonContainer' @ [191:30] ==> value-parameter commonContainer: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext.runRefactoring[ValueParameterDescriptorImpl]

'commonContainer' @ [192:40] ==> value-parameter commonContainer: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext.runRefactoring[ValueParameterDescriptorImpl]

'children' @ [192:56] ==> public final val KtContainerNode.children: (Array<(PsiElement..PsiElement?)>..Array<out (PsiElement..PsiElement?)>)[MyPropertyDescriptor]

'children' @ [193:39] ==> val children: (Array<(PsiElement..PsiElement?)>..Array<out (PsiElement..PsiElement?)>) defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext.runRefactoring[LocalVariableDescriptor]

'child' @ [194:33] ==> val child: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext.runRefactoring[LocalVariableDescriptor]

'oldElement' @ [195:33] ==> var oldElement: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext.runRefactoring[LocalVariableDescriptor]

'child' @ [195:46] ==> val child: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext.runRefactoring[LocalVariableDescriptor]

'reference' @ [200:44] ==> public final var reference: KtExpression? defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext[PropertyDescriptorImpl]

'actualExpression' @ [201:32] ==> var actualExpression: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext.runRefactoring[LocalVariableDescriptor]

'textRange' @ [201:49] ==> public final val KtExpression.textRange: (TextRange..TextRange?)[MyPropertyDescriptor]

'startOffset' @ [201:59] ==> public final val TextRange.startOffset: Int[MyPropertyDescriptor]

'oldElement' @ [201:73] ==> var oldElement: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext.runRefactoring[LocalVariableDescriptor]

'textRange' @ [201:84] ==> public final val PsiElement.textRange: (TextRange..TextRange?)[MyPropertyDescriptor]

'startOffset' @ [201:94] ==> public final val TextRange.startOffset: Int[MyPropertyDescriptor]

'actualExpression' @ [202:48] ==> var actualExpression: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext.runRefactoring[LocalVariableDescriptor]

'text' @ [202:65] ==> public final val KtExpression.text: (String..String?)[MyPropertyDescriptor]

'emptyBody' @ [203:38] ==> var emptyBody: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext.runRefactoring[LocalVariableDescriptor]

'addAfter' @ [203:48] ==> public abstract fun addAfter(@NotNull p0: PsiElement, @Nullable p1: PsiElement?): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtExpression[JavaMethodDescriptor]

'oldElement' @ [203:57] ==> var oldElement: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext.runRefactoring[LocalVariableDescriptor]

'firstChild' @ [203:69] ==> val firstChild: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext.runRefactoring[LocalVariableDescriptor]

'findElementByOffsetAndText' @ [204:45] ==> private final fun findElementByOffsetAndText(offset: Int, text: String, newContainer: PsiElement): PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext[SimpleFunctionDescriptorImpl]

'diff' @ [204:72] ==> var diff: Int defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext.runRefactoring[LocalVariableDescriptor]

'actualExpressionText' @ [204:78] ==> var actualExpressionText: (String..String?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext.runRefactoring[LocalVariableDescriptor]

'newElement' @ [204:100] ==> val newElement: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext.runRefactoring[LocalVariableDescriptor]

'elem' @ [205:25] ==> var elem: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext.runRefactoring[LocalVariableDescriptor]

'reference' @ [206:25] ==> public final var reference: KtExpression? defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext[PropertyDescriptorImpl]

'elem' @ [206:37] ==> var elem: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext.runRefactoring[LocalVariableDescriptor]

'emptyBody' @ [208:21] ==> var emptyBody: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext.runRefactoring[LocalVariableDescriptor]

'addAfter' @ [208:31] ==> public abstract fun addAfter(@NotNull p0: PsiElement, @Nullable p1: PsiElement?): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtExpression[JavaMethodDescriptor]

'psiFactory' @ [208:40] ==> private final val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext[PropertyDescriptorImpl]

'createNewLine' @ [208:51] ==> public final fun createNewLine(): PsiElement defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'firstChild' @ [208:68] ==> val firstChild: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext.runRefactoring[LocalVariableDescriptor]

'property' @ [209:21] ==> var property: KtDeclaration defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext.runRefactoring[LocalVariableDescriptor]

'emptyBody' @ [209:32] ==> var emptyBody: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext.runRefactoring[LocalVariableDescriptor]

'addAfter' @ [209:42] ==> public abstract fun addAfter(@NotNull p0: PsiElement, @Nullable p1: PsiElement?): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtExpression[JavaMethodDescriptor]

'property' @ [209:51] ==> var property: KtDeclaration defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext.runRefactoring[LocalVariableDescriptor]

'firstChild' @ [209:61] ==> val firstChild: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext.runRefactoring[LocalVariableDescriptor]

'emptyBody' @ [210:21] ==> var emptyBody: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext.runRefactoring[LocalVariableDescriptor]

'addAfter' @ [210:31] ==> public abstract fun addAfter(@NotNull p0: PsiElement, @Nullable p1: PsiElement?): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtExpression[JavaMethodDescriptor]

'psiFactory' @ [210:40] ==> private final val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext[PropertyDescriptorImpl]

'createNewLine' @ [210:51] ==> public final fun createNewLine(): PsiElement defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'firstChild' @ [210:68] ==> val firstChild: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext.runRefactoring[LocalVariableDescriptor]

'actualExpression' @ [211:21] ==> var actualExpression: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext.runRefactoring[LocalVariableDescriptor]

'reference' @ [211:40] ==> public final var reference: KtExpression? defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext[PropertyDescriptorImpl]

'diff' @ [212:21] ==> var diff: Int defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext.runRefactoring[LocalVariableDescriptor]

'actualExpression' @ [212:28] ==> var actualExpression: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext.runRefactoring[LocalVariableDescriptor]

'textRange' @ [212:45] ==> public final val KtExpression.textRange: (TextRange..TextRange?)[MyPropertyDescriptor]

'startOffset' @ [212:55] ==> public final val TextRange.startOffset: Int[MyPropertyDescriptor]

'emptyBody' @ [212:69] ==> var emptyBody: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext.runRefactoring[LocalVariableDescriptor]

'textRange' @ [212:79] ==> public final val KtExpression.textRange: (TextRange..TextRange?)[MyPropertyDescriptor]

'startOffset' @ [212:89] ==> public final val TextRange.startOffset: Int[MyPropertyDescriptor]

'actualExpressionText' @ [213:21] ==> var actualExpressionText: (String..String?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext.runRefactoring[LocalVariableDescriptor]

'actualExpression' @ [213:44] ==> var actualExpression: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext.runRefactoring[LocalVariableDescriptor]

'text' @ [213:61] ==> public final val KtExpression.text: (String..String?)[MyPropertyDescriptor]

'emptyBody' @ [214:21] ==> var emptyBody: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext.runRefactoring[LocalVariableDescriptor]

'anchor' @ [214:33] ==> var anchor: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext.runRefactoring[LocalVariableDescriptor]

'replace' @ [214:40] ==> public abstract fun replace(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in com.intellij.psi.PsiElement[JavaMethodDescriptor]

'emptyBody' @ [214:48] ==> var emptyBody: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext.runRefactoring[LocalVariableDescriptor]

'elem' @ [215:21] ==> var elem: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext.runRefactoring[LocalVariableDescriptor]

'findElementByOffsetAndText' @ [215:28] ==> private final fun findElementByOffsetAndText(offset: Int, text: String, newContainer: PsiElement): PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext[SimpleFunctionDescriptorImpl]

'diff' @ [215:55] ==> var diff: Int defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext.runRefactoring[LocalVariableDescriptor]

'actualExpressionText' @ [215:61] ==> var actualExpressionText: (String..String?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext.runRefactoring[LocalVariableDescriptor]

'emptyBody' @ [215:83] ==> var emptyBody: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext.runRefactoring[LocalVariableDescriptor]

'elem' @ [216:25] ==> var elem: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext.runRefactoring[LocalVariableDescriptor]

'reference' @ [217:25] ==> public final var reference: KtExpression? defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext[PropertyDescriptorImpl]

'elem' @ [217:37] ==> var elem: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext.runRefactoring[LocalVariableDescriptor]

'emptyBody' @ [220:21] ==> var emptyBody: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext.runRefactoring[LocalVariableDescriptor]

'accept' @ [220:31] ==> public abstract fun accept(@NotNull p0: PsiElementVisitor): Unit defined in org.jetbrains.kotlin.psi.KtExpression[JavaMethodDescriptor]

'KtTreeVisitorVoid' @ [221:38] ==> public constructor KtTreeVisitorVoid() defined in org.jetbrains.kotlin.psi.KtTreeVisitorVoid[JavaClassConstructorDescriptor]

'!' @ [223:41] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'expression' @ [223:42] ==> value-parameter expression: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext.runRefactoring.<no name provided>.visitSimpleNameExpression[ValueParameterDescriptorImpl]

'isOccurrence' @ [223:53] ==> private final var KtExpression.isOccurrence: Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler[PropertyDescriptorImpl]

'expression' @ [225:37] ==> value-parameter expression: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext.runRefactoring.<no name provided>.visitSimpleNameExpression[ValueParameterDescriptorImpl]

'isOccurrence' @ [225:48] ==> private final var KtExpression.isOccurrence: Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler[PropertyDescriptorImpl]

'references' @ [226:37] ==> public final val references: ArrayList<KtExpression> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext[PropertyDescriptorImpl]

'add' @ [226:48] ==> public open fun add(element: KtExpression): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'expression' @ [226:52] ==> value-parameter expression: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext.runRefactoring.<no name provided>.visitSimpleNameExpression[ValueParameterDescriptorImpl]

'anchor' @ [231:34] ==> var anchor: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext.runRefactoring[LocalVariableDescriptor]

'parent' @ [231:41] ==> public final val PsiElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'parent' @ [232:34] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext.runRefactoring[LocalVariableDescriptor]

'lastChild' @ [232:41] ==> public final val PsiElement.lastChild: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'anchor' @ [233:36] ==> var anchor: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext.runRefactoring[LocalVariableDescriptor]

'nextSibling' @ [233:43] ==> public final val PsiElement.nextSibling: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'property' @ [235:21] ==> var property: KtDeclaration defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext.runRefactoring[LocalVariableDescriptor]

'emptyBody' @ [235:32] ==> var emptyBody: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext.runRefactoring[LocalVariableDescriptor]

'addAfter' @ [235:42] ==> public abstract fun addAfter(@NotNull p0: PsiElement, @Nullable p1: PsiElement?): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtExpression[JavaMethodDescriptor]

'property' @ [235:51] ==> var property: KtDeclaration defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext.runRefactoring[LocalVariableDescriptor]

'firstChild' @ [235:61] ==> val firstChild: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext.runRefactoring[LocalVariableDescriptor]

'emptyBody' @ [236:21] ==> var emptyBody: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext.runRefactoring[LocalVariableDescriptor]

'addAfter' @ [236:31] ==> public abstract fun addAfter(@NotNull p0: PsiElement, @Nullable p1: PsiElement?): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtExpression[JavaMethodDescriptor]

'psiFactory' @ [236:40] ==> private final val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext[PropertyDescriptorImpl]

'createNewLine' @ [236:51] ==> public final fun createNewLine(): PsiElement defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'firstChild' @ [236:68] ==> val firstChild: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext.runRefactoring[LocalVariableDescriptor]

'copyFrom' @ [237:25] ==> val copyFrom: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext.runRefactoring[LocalVariableDescriptor]

'copyTo' @ [237:45] ==> val copyTo: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext.runRefactoring[LocalVariableDescriptor]

'emptyBody' @ [238:25] ==> var emptyBody: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext.runRefactoring[LocalVariableDescriptor]

'addRangeAfter' @ [238:35] ==> public abstract fun addRangeAfter(p0: (PsiElement..PsiElement?), p1: (PsiElement..PsiElement?), p2: (PsiElement..PsiElement?)): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtExpression[JavaMethodDescriptor]

'copyFrom' @ [238:49] ==> val copyFrom: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext.runRefactoring[LocalVariableDescriptor]

'copyTo' @ [238:59] ==> val copyTo: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext.runRefactoring[LocalVariableDescriptor]

'property' @ [238:67] ==> var property: KtDeclaration defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext.runRefactoring[LocalVariableDescriptor]

'parent' @ [239:25] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext.runRefactoring[LocalVariableDescriptor]

'deleteChildRange' @ [239:32] ==> public abstract fun deleteChildRange(p0: (PsiElement..PsiElement?), p1: (PsiElement..PsiElement?)): Unit defined in com.intellij.psi.PsiElement[JavaMethodDescriptor]

'copyFrom' @ [239:49] ==> val copyFrom: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext.runRefactoring[LocalVariableDescriptor]

'copyTo' @ [239:59] ==> val copyTo: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext.runRefactoring[LocalVariableDescriptor]

'emptyBody' @ [241:21] ==> var emptyBody: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext.runRefactoring[LocalVariableDescriptor]

'anchor' @ [241:33] ==> var anchor: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext.runRefactoring[LocalVariableDescriptor]

'replace' @ [241:40] ==> public abstract fun replace(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in com.intellij.psi.PsiElement[JavaMethodDescriptor]

'emptyBody' @ [241:48] ==> var emptyBody: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext.runRefactoring[LocalVariableDescriptor]

'emptyBody' @ [243:31] ==> var emptyBody: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext.runRefactoring[LocalVariableDescriptor]

'children' @ [243:41] ==> public final val KtBlockExpression.children: (Array<(PsiElement..PsiElement?)>..Array<out (PsiElement..PsiElement?)>)[MyPropertyDescriptor]

'child' @ [244:25] ==> val child: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext.runRefactoring[LocalVariableDescriptor]

'property' @ [245:25] ==> var property: KtDeclaration defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext.runRefactoring[LocalVariableDescriptor]

'child' @ [245:36] ==> val child: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext.runRefactoring[LocalVariableDescriptor]

'commonContainer' @ [248:21] ==> value-parameter commonContainer: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext.runRefactoring[ValueParameterDescriptorImpl]

'commonContainer' @ [249:25] ==> value-parameter commonContainer: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext.runRefactoring[ValueParameterDescriptorImpl]

'parent' @ [249:41] ==> public final val KtContainerNode.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'commonContainer' @ [250:36] ==> value-parameter commonContainer: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext.runRefactoring[ValueParameterDescriptorImpl]

'nextSibling' @ [250:52] ==> public final val KtContainerNode.nextSibling: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'next' @ [251:29] ==> val next: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext.runRefactoring[LocalVariableDescriptor]

'next' @ [252:44] ==> val next: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext.runRefactoring[LocalVariableDescriptor]

'nextSibling' @ [252:49] ==> public final val PsiElement.nextSibling: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'nextnext' @ [253:33] ==> val nextnext: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext.runRefactoring[LocalVariableDescriptor]

'nextnext' @ [253:53] ==> val nextnext: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext.runRefactoring[LocalVariableDescriptor]

'node' @ [253:62] ==> public final val PsiElement.node: (ASTNode..ASTNode?)[MyPropertyDescriptor]

'elementType' @ [253:67] ==> public final val ASTNode.elementType: IElementType[MyPropertyDescriptor]

'ELSE_KEYWORD' @ [253:91] ==> public final val ELSE_KEYWORD: (KtKeywordToken..KtKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'next' @ [254:37] ==> val next: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext.runRefactoring[LocalVariableDescriptor]

'next' @ [255:37] ==> val next: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext.runRefactoring[LocalVariableDescriptor]

'replace' @ [255:42] ==> public abstract fun replace(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in com.intellij.psi.PsiElement[JavaMethodDescriptor]

'psiFactory' @ [255:50] ==> private final val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext[PropertyDescriptorImpl]

'createWhiteSpace' @ [255:61] ==> public final fun createWhiteSpace(): PsiElement defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'!' @ [262:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'needBraces' @ [262:18] ==> val needBraces: Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext.runRefactoring[LocalVariableDescriptor]

'allReplaces' @ [263:27] ==> value-parameter allReplaces: List<KtExpression> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext.runRefactoring[ValueParameterDescriptorImpl]

'indices' @ [263:39] ==> public val Collection<*>.indices: IntRange defined in kotlin.collections[DeserializedPropertyDescriptor]

'allReplaces' @ [264:35] ==> value-parameter allReplaces: List<KtExpression> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext.runRefactoring[ValueParameterDescriptorImpl]

'i' @ [264:47] ==> val i: Int defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext.runRefactoring[LocalVariableDescriptor]

'if (if (i != 0) replaceOccurrence else replace.shouldReplaceOccurrence(bindingContext, commonContainer)) {
                        replaceExpression(replace, true)
                    }
                    else {
                        val sibling = PsiTreeUtil.skipSiblingsBackward(replace, PsiWhiteSpace::class.java)
                        if (sibling == property) {
                            replace.parent.deleteChildRange(property.nextSibling, replace)
                        }
                        else {
                            replace.delete()
                        }
                    }' @ [266:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Any, elseBranch: Any): Any[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Any

'if (i != 0) replaceOccurrence else replace.shouldReplaceOccurrence(bindingContext, commonContainer)' @ [266:25] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Boolean, elseBranch: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Boolean

'i' @ [266:29] ==> val i: Int defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext.runRefactoring[LocalVariableDescriptor]

'replaceOccurrence' @ [266:37] ==> private final val replaceOccurrence: Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext[PropertyDescriptorImpl]

'replace' @ [266:60] ==> val replace: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext.runRefactoring[LocalVariableDescriptor]

'shouldReplaceOccurrence' @ [266:68] ==> private final fun KtExpression.shouldReplaceOccurrence(bindingContext: BindingContext, container: PsiElement?): Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler[SimpleFunctionDescriptorImpl]

'bindingContext' @ [266:92] ==> private final val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext[PropertyDescriptorImpl]

'commonContainer' @ [266:108] ==> value-parameter commonContainer: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext.runRefactoring[ValueParameterDescriptorImpl]

'replaceExpression' @ [267:25] ==> private final fun replaceExpression(expressionToReplace: KtExpression, addToReferences: Boolean): KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext[SimpleFunctionDescriptorImpl]

'replace' @ [267:43] ==> val replace: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext.runRefactoring[LocalVariableDescriptor]

'skipSiblingsBackward' @ [270:51] ==> @Nullable @Contract public open fun skipSiblingsBackward(@Nullable p0: PsiElement?, @NotNull vararg p1: raw (Class<(Any..Any?)>..Class<*>?)): PsiElement? defined in com.intellij.psi.util.PsiTreeUtil[JavaMethodDescriptor]

'replace' @ [270:72] ==> val replace: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext.runRefactoring[LocalVariableDescriptor]

'java' @ [270:102] ==> public val <T> KClass<PsiWhiteSpace>.java: Class<PsiWhiteSpace> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> PsiWhiteSpace

'if (sibling == property) {
                            replace.parent.deleteChildRange(property.nextSibling, replace)
                        }
                        else {
                            replace.delete()
                        }' @ [271:25] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'sibling' @ [271:29] ==> val sibling: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext.runRefactoring[LocalVariableDescriptor]

'property' @ [271:40] ==> var property: KtDeclaration defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext.runRefactoring[LocalVariableDescriptor]

'replace' @ [272:29] ==> val replace: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext.runRefactoring[LocalVariableDescriptor]

'parent' @ [272:37] ==> public final val KtExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'deleteChildRange' @ [272:44] ==> public abstract fun deleteChildRange(p0: (PsiElement..PsiElement?), p1: (PsiElement..PsiElement?)): Unit defined in com.intellij.psi.PsiElement[JavaMethodDescriptor]

'property' @ [272:61] ==> var property: KtDeclaration defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext.runRefactoring[LocalVariableDescriptor]

'nextSibling' @ [272:70] ==> public final val KtDeclaration.nextSibling: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'replace' @ [272:83] ==> val replace: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext.runRefactoring[LocalVariableDescriptor]

'replace' @ [275:29] ==> val replace: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext.runRefactoring[LocalVariableDescriptor]

'delete' @ [275:37] ==> public abstract fun delete(): Unit defined in org.jetbrains.kotlin.psi.KtExpression[JavaMethodDescriptor]

'propertyRef' @ [280:13] ==> public final var propertyRef: KtDeclaration? defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext[PropertyDescriptorImpl]

'property' @ [280:27] ==> var property: KtDeclaration defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext.runRefactoring[LocalVariableDescriptor]

'noTypeInference' @ [281:17] ==> private final val noTypeInference: Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext[PropertyDescriptorImpl]

'ShortenReferences' @ [282:17] ==> public companion object defined in org.jetbrains.kotlin.idea.core.ShortenReferences[FakeCallableDescriptorForObject]

'DEFAULT' @ [282:35] ==> @field:JvmField public final val DEFAULT: ShortenReferences defined in org.jetbrains.kotlin.idea.core.ShortenReferences.Companion[DeserializedPropertyDescriptor]

'process' @ [282:43] ==> @JvmOverloads public final fun process(element: KtElement, elementFilter: (PsiElement) -> ShortenReferences.FilterResult = ...): KtElement defined in org.jetbrains.kotlin.idea.core.ShortenReferences[DeserializedSimpleFunctionDescriptor]

'property' @ [282:51] ==> var property: KtDeclaration defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext.runRefactoring[LocalVariableDescriptor]

'commonContainer' @ [287:17] ==> private final val commonContainer: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext[PropertyDescriptorImpl]

'runRefactoring' @ [287:67] ==> private final fun runRefactoring(isVar: Boolean, expression: KtExpression, commonContainer: PsiElement, commonParent: PsiElement, allReplaces: List<KtExpression>): Unit defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext[SimpleFunctionDescriptorImpl]

'isVar' @ [287:82] ==> value-parameter isVar: Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext.runRefactoring[ValueParameterDescriptorImpl]

'expression' @ [287:89] ==> private final val expression: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext[PropertyDescriptorImpl]

'commonContainer' @ [287:101] ==> private final val commonContainer: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext[PropertyDescriptorImpl]

'commonParent' @ [287:118] ==> private final val commonParent: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext[PropertyDescriptorImpl]

'allReplaces' @ [287:132] ==> private final val allReplaces: List<KtExpression> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext[PropertyDescriptorImpl]

'commonContainer' @ [289:13] ==> private final val commonContainer: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext[PropertyDescriptorImpl]

'bodyExpression' @ [289:29] ==> public final val KtDeclarationWithBody.bodyExpression: KtExpression?[MyPropertyDescriptor]

'sure' @ [289:44] ==> public inline fun <T : Any> KtExpression?.sure(message: () -> String): KtExpression defined in org.jetbrains.kotlin.utils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> KtExpression

'+' @ [289:51] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'commonContainer' @ [289:84] ==> private final val commonContainer: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext[PropertyDescriptorImpl]

'expression' @ [291:13] ==> private final val expression: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext[PropertyDescriptorImpl]

'putCopyableUserData' @ [291:24] ==> public abstract fun <T : (Any..Any?)> putCopyableUserData(p0: (Key<(Boolean..Boolean?)>..Key<(Boolean..Boolean?)>?), @Nullable p1: Boolean?): Unit defined in org.jetbrains.kotlin.psi.KtExpression[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.Boolean..kotlin.Boolean?)

'EXPRESSION_KEY' @ [291:44] ==> private final val EXPRESSION_KEY: Key<(Boolean..Boolean?)> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler[PropertyDescriptorImpl]

'allReplaces' @ [292:29] ==> private final val allReplaces: List<KtExpression> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext[PropertyDescriptorImpl]

'replace' @ [293:17] ==> val replace: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext.runRefactoring[LocalVariableDescriptor]

'substringContextOrThis' @ [293:25] ==> public val KtExpression.substringContextOrThis: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce[DeserializedPropertyDescriptor]

'putCopyableUserData' @ [293:48] ==> public abstract fun <T : (Any..Any?)> putCopyableUserData(p0: (Key<(Boolean..Boolean?)>..Key<(Boolean..Boolean?)>?), @Nullable p1: Boolean?): Unit defined in org.jetbrains.kotlin.psi.KtExpression[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.Boolean..kotlin.Boolean?)

'REPLACE_KEY' @ [293:68] ==> private final val REPLACE_KEY: Key<(Boolean..Boolean?)> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler[PropertyDescriptorImpl]

'commonParent' @ [295:13] ==> private final val commonParent: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext[PropertyDescriptorImpl]

'putCopyableUserData' @ [295:26] ==> public abstract fun <T : (Any..Any?)> putCopyableUserData(p0: (Key<(Boolean..Boolean?)>..Key<(Boolean..Boolean?)>?), @Nullable p1: Boolean?): Unit defined in com.intellij.psi.PsiElement[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.Boolean..kotlin.Boolean?)

'COMMON_PARENT_KEY' @ [295:46] ==> private final val COMMON_PARENT_KEY: Key<(Boolean..Boolean?)> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler[PropertyDescriptorImpl]

'ConvertToBlockBodyIntention' @ [297:34] ==> public companion object defined in org.jetbrains.kotlin.idea.intentions.ConvertToBlockBodyIntention[FakeCallableDescriptorForObject]

'convert' @ [297:62] ==> public final fun convert(declaration: KtDeclarationWithBody): KtDeclarationWithBody defined in org.jetbrains.kotlin.idea.intentions.ConvertToBlockBodyIntention.Companion[SimpleFunctionDescriptorImpl]

'commonContainer' @ [297:70] ==> private final val commonContainer: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext[PropertyDescriptorImpl]

'newDeclaration' @ [299:39] ==> val newDeclaration: KtDeclarationWithBody defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext.runRefactoring[LocalVariableDescriptor]

'bodyExpression' @ [299:54] ==> public final val KtDeclarationWithBody.bodyExpression: KtExpression?[MyPropertyDescriptor]

'sure' @ [300:22] ==> public inline fun <T : Any> KtBlockExpression?.sure(message: () -> String): KtBlockExpression defined in org.jetbrains.kotlin.utils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> KtBlockExpression

'+' @ [300:29] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'newDeclaration' @ [300:57] ==> val newDeclaration: KtDeclarationWithBody defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext.runRefactoring[LocalVariableDescriptor]

'newCommonContainer' @ [302:33] ==> val newCommonContainer: KtBlockExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext.runRefactoring[LocalVariableDescriptor]

'findExpressionByCopyableDataAndClearIt' @ [302:52] ==> public fun PsiElement.findExpressionByCopyableDataAndClearIt(key: Key<Boolean>): KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce in file introduceUtil.kt[SimpleFunctionDescriptorImpl]

'EXPRESSION_KEY' @ [302:91] ==> private final val EXPRESSION_KEY: Key<(Boolean..Boolean?)> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler[PropertyDescriptorImpl]

'newCommonContainer' @ [303:35] ==> val newCommonContainer: KtBlockExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext.runRefactoring[LocalVariableDescriptor]

'findElementByCopyableDataAndClearIt' @ [303:54] ==> public fun PsiElement.findElementByCopyableDataAndClearIt(key: Key<Boolean>): PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce in file introduceUtil.kt[SimpleFunctionDescriptorImpl]

'COMMON_PARENT_KEY' @ [303:90] ==> private final val COMMON_PARENT_KEY: Key<(Boolean..Boolean?)> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler[PropertyDescriptorImpl]

'allReplaces' @ [304:35] ==> private final val allReplaces: List<KtExpression> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext[PropertyDescriptorImpl]

'newCommonContainer' @ [304:51] ==> val newCommonContainer: KtBlockExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext.runRefactoring[LocalVariableDescriptor]

'findExpressionsByCopyableDataAndClearIt' @ [304:70] ==> public fun PsiElement.findExpressionsByCopyableDataAndClearIt(key: Key<Boolean>): List<KtExpression> defined in org.jetbrains.kotlin.idea.refactoring.introduce in file introduceUtil.kt[SimpleFunctionDescriptorImpl]

'REPLACE_KEY' @ [304:110] ==> private final val REPLACE_KEY: Key<(Boolean..Boolean?)> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler[PropertyDescriptorImpl]

'map' @ [304:124] ==> public inline fun <T, R> Iterable<Pair<KtExpression, KtExpression>>.map(transform: (Pair<KtExpression, KtExpression>) -> KtExpression): List<KtExpression> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<KtExpression, KtExpression>
    <R> -> KtExpression

'component1' @ [305:22] ==> public final operator fun component1(): KtExpression defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [305:39] ==> public final operator fun component2(): KtExpression defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'it' @ [305:53] ==> value-parameter it: Pair<KtExpression, KtExpression> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext.runRefactoring.<anonymous>[ValueParameterDescriptorImpl]

'originalReplace' @ [306:17] ==> val originalReplace: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext.runRefactoring.<anonymous>[LocalVariableDescriptor]

'extractableSubstringInfo' @ [306:33] ==> public var KtExpression.extractableSubstringInfo: ExtractableSubstringInfo? defined in org.jetbrains.kotlin.idea.refactoring.introduce[DeserializedPropertyDescriptor]

'let' @ [306:59] ==> @InlineOnly public inline fun <T, R> ExtractableSubstringInfo.let(block: (ExtractableSubstringInfo) -> KtExpression): KtExpression defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ExtractableSubstringInfo
    <R> -> KtExpression

'originalReplace' @ [307:21] ==> val originalReplace: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext.runRefactoring.<anonymous>[LocalVariableDescriptor]

'apply' @ [307:37] ==> @InlineOnly public inline fun <T> KtExpression.apply(block: KtExpression.() -> Unit): KtExpression defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression

'extractableSubstringInfo' @ [307:45] ==> public var KtExpression.extractableSubstringInfo: ExtractableSubstringInfo? defined in org.jetbrains.kotlin.idea.refactoring.introduce[DeserializedPropertyDescriptor]

'it' @ [307:72] ==> value-parameter it: ExtractableSubstringInfo defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext.runRefactoring.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'copy' @ [307:75] ==> public final fun copy(newTemplate: KtStringTemplateExpression): ExtractableSubstringInfo defined in org.jetbrains.kotlin.idea.refactoring.introduce.ExtractableSubstringInfo[DeserializedSimpleFunctionDescriptor]

'newReplace' @ [307:80] ==> val newReplace: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext.runRefactoring.<anonymous>[LocalVariableDescriptor]

'newReplace' @ [308:22] ==> val newReplace: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext.runRefactoring.<anonymous>[LocalVariableDescriptor]

'runRefactoring' @ [311:13] ==> private final fun runRefactoring(isVar: Boolean, expression: KtExpression, commonContainer: PsiElement, commonParent: PsiElement, allReplaces: List<KtExpression>): Unit defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext[SimpleFunctionDescriptorImpl]

'isVar' @ [311:28] ==> value-parameter isVar: Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext.runRefactoring[ValueParameterDescriptorImpl]

'newExpression' @ [311:35] ==> val newExpression: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext.runRefactoring[LocalVariableDescriptor]

'newCommonContainer' @ [311:50] ==> val newCommonContainer: KtBlockExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext.runRefactoring[LocalVariableDescriptor]

'newCommonParent' @ [311:70] ==> val newCommonParent: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext.runRefactoring[LocalVariableDescriptor]

'newAllReplaces' @ [311:87] ==> val newAllReplaces: List<KtExpression> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext.runRefactoring[LocalVariableDescriptor]

'commonParent' @ [316:13] ==> value-parameter commonParent: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.calculateAnchor[ValueParameterDescriptorImpl]

'commonContainer' @ [316:29] ==> value-parameter commonContainer: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.calculateAnchor[ValueParameterDescriptorImpl]

'commonParent' @ [316:53] ==> value-parameter commonParent: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.calculateAnchor[ValueParameterDescriptorImpl]

'parentsWithSelf' @ [316:66] ==> public val PsiElement.parentsWithSelf: Sequence<PsiElement> defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'firstOrNull' @ [316:82] ==> public inline fun <T> Sequence<PsiElement>.firstOrNull(predicate: (PsiElement) -> Boolean): PsiElement? defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'it' @ [316:96] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.calculateAnchor.<anonymous>[ValueParameterDescriptorImpl]

'parent' @ [316:99] ==> public final val PsiElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'commonContainer' @ [316:109] ==> value-parameter commonContainer: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.calculateAnchor[ValueParameterDescriptorImpl]

'allReplaces' @ [318:27] ==> value-parameter allReplaces: List<KtExpression> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.calculateAnchor[ValueParameterDescriptorImpl]

'fold' @ [318:39] ==> public inline fun <T, R> Iterable<KtExpression>.fold(initial: Int, operation: (acc: Int, KtExpression) -> Int): Int defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression
    <R> -> Int

'commonContainer' @ [318:44] ==> value-parameter commonContainer: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.calculateAnchor[ValueParameterDescriptorImpl]

'endOffset' @ [318:60] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'min' @ [318:94] ==> public open fun min(p0: Int, p1: Int): Int defined in java.lang.Math[JavaMethodDescriptor]

'offset' @ [318:98] ==> value-parameter offset: Int defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.calculateAnchor.<anonymous>[ValueParameterDescriptorImpl]

'expr' @ [318:106] ==> value-parameter expr: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.calculateAnchor.<anonymous>[ValueParameterDescriptorImpl]

'substringContextOrThis' @ [318:111] ==> public val KtExpression.substringContextOrThis: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce[DeserializedPropertyDescriptor]

'startOffset' @ [318:134] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'commonContainer' @ [319:16] ==> value-parameter commonContainer: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.calculateAnchor[ValueParameterDescriptorImpl]

'allChildren' @ [319:32] ==> public val PsiElement.allChildren: PsiChildRange defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'lastOrNull' @ [319:44] ==> public inline fun <T> Sequence<PsiElement>.lastOrNull(predicate: (PsiElement) -> Boolean): PsiElement? defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'it' @ [319:57] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.calculateAnchor.<anonymous>[ValueParameterDescriptorImpl]

'textRange' @ [319:60] ==> public final val PsiElement.textRange: (TextRange..TextRange?)[MyPropertyDescriptor]

'contains' @ [319:70] ==> public open operator fun contains(p0: Int): Boolean defined in com.intellij.openapi.util.TextRange[JavaMethodDescriptor]

'startOffset' @ [319:79] ==> val startOffset: Int defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.calculateAnchor[LocalVariableDescriptor]

'parents' @ [323:16] ==> public val PsiElement.parents: Sequence<PsiElement> defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'any' @ [323:24] ==> public inline fun <T> Sequence<PsiElement>.any(predicate: (PsiElement) -> Boolean): Boolean defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'isAssignment' @ [323:40] ==> public open fun isAssignment(@NotNull p0: PsiElement): Boolean defined in org.jetbrains.kotlin.psi.KtPsiUtil[JavaMethodDescriptor]

'it' @ [323:53] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.isAssignmentLHS.<anonymous>[ValueParameterDescriptorImpl]

'==' @ [323:60] ==> public open fun equals(other: Any?): Boolean defined in org.jetbrains.kotlin.psi.KtExpression[DeserializedSimpleFunctionDescriptor]

'it' @ [323:61] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.isAssignmentLHS.<anonymous>[ValueParameterDescriptorImpl]

'left' @ [323:87] ==> public final val KtBinaryExpression.left: KtExpression?[MyPropertyDescriptor]

'this' @ [323:95] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.isAssignmentLHS[ReceiverParameterDescriptorImpl]

'toRange' @ [327:16] ==> public fun PsiElement?.toRange(): KotlinPsiRange defined in org.jetbrains.kotlin.idea.util.psi.patternMatching[DeserializedSimpleFunctionDescriptor]

'match' @ [328:18] ==> public open fun match(scope: PsiElement, unifier: KotlinPsiUnifier): List<UnificationResult.Matched> defined in org.jetbrains.kotlin.idea.util.psi.patternMatching.KotlinPsiRange[DeserializedSimpleFunctionDescriptor]

'occurrenceContainer' @ [328:24] ==> value-parameter occurrenceContainer: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.findOccurrences[ValueParameterDescriptorImpl]

'DEFAULT' @ [328:62] ==> public final val DEFAULT: KotlinPsiUnifier defined in org.jetbrains.kotlin.idea.util.psi.patternMatching.KotlinPsiUnifier.Companion[DeserializedPropertyDescriptor]

'mapNotNull' @ [329:18] ==> public inline fun <T, R : Any> Iterable<UnificationResult.Matched>.mapNotNull(transform: (UnificationResult.Matched) -> KtExpression?): List<KtExpression> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Matched
    <R : Any> -> KtExpression

'it' @ [330:37] ==> value-parameter it: UnificationResult.Matched defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.findOccurrences.<anonymous>[ValueParameterDescriptorImpl]

'range' @ [330:40] ==> public abstract val range: KotlinPsiRange defined in org.jetbrains.kotlin.idea.util.psi.patternMatching.UnificationResult.Matched[DeserializedPropertyDescriptor]

'elements' @ [330:46] ==> public abstract val elements: List<PsiElement> defined in org.jetbrains.kotlin.idea.util.psi.patternMatching.KotlinPsiRange[DeserializedPropertyDescriptor]

'first' @ [330:55] ==> public fun <T> List<PsiElement>.first(): PsiElement defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'candidate' @ [332:25] ==> val candidate: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.findOccurrences.<anonymous>[LocalVariableDescriptor]

'isAssignmentLHS' @ [332:35] ==> private final fun PsiElement.isAssignmentLHS(): Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler[SimpleFunctionDescriptorImpl]

'when (candidate) {
                        is KtExpression -> candidate
                        is KtStringTemplateEntryWithExpression -> candidate.expression
                        else -> throw AssertionError("Unexpected candidate element: " + candidate.text)
                    }' @ [334:21] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: KtExpression?, entry1: KtExpression?, entry2: KtExpression?): KtExpression?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> KtExpression?

'candidate' @ [334:27] ==> val candidate: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.findOccurrences.<anonymous>[LocalVariableDescriptor]

'candidate' @ [335:44] ==> val candidate: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.findOccurrences.<anonymous>[LocalVariableDescriptor]

'candidate' @ [336:67] ==> val candidate: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.findOccurrences.<anonymous>[LocalVariableDescriptor]

'expression' @ [336:77] ==> public final val KtStringTemplateEntryWithExpression.expression: KtExpression?[MyPropertyDescriptor]

'AssertionError' @ [337:39] ==> public final fun <init>(p0: (Any..Any?)): AssertionError /* = AssertionError */ defined in kotlin.AssertionError[TypeAliasConstructorDescriptorImpl]

'+' @ [337:54] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'candidate' @ [337:89] ==> val candidate: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.findOccurrences.<anonymous>[LocalVariableDescriptor]

'text' @ [337:99] ==> public final val PsiElement.text: (String..String?)[MyPropertyDescriptor]

'?:' @ [343:31] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: PsiElement?, right: (PsiElement..PsiElement?)): (PsiElement..PsiElement?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)

'parent' @ [343:32] ==> public final val KtExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'parent' @ [343:65] ==> public final val KtScriptInitializer.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'parent' @ [343:75] ==> public final val KtExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'isUsedAsExpression' @ [344:16] ==> public fun KtExpression.isUsedAsExpression(context: BindingContext): Boolean defined in org.jetbrains.kotlin.resolve.bindingContextUtil[DeserializedSimpleFunctionDescriptor]

'bindingContext' @ [344:35] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.shouldReplaceOccurrence[ValueParameterDescriptorImpl]

'container' @ [344:54] ==> value-parameter container: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.shouldReplaceOccurrence[ValueParameterDescriptorImpl]

'effectiveParent' @ [344:67] ==> val effectiveParent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.shouldReplaceOccurrence[LocalVariableDescriptor]

'this' @ [348:13] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.getContainer[ReceiverParameterDescriptorImpl]

'this' @ [348:47] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.getContainer[ReceiverParameterDescriptorImpl]

'parentsWithSelf' @ [350:17] ==> public val PsiElement.parentsWithSelf: Sequence<PsiElement> defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'zip' @ [350:33] ==> public infix fun <T, R> Sequence<PsiElement>.zip(other: Sequence<PsiElement>): Sequence<Pair<PsiElement, PsiElement>> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement
    <R> -> PsiElement

'parents' @ [350:37] ==> public val PsiElement.parents: Sequence<PsiElement> defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'firstOrNull' @ [350:47] ==> public inline fun <T> Sequence<Pair<PsiElement, PsiElement>>.firstOrNull(predicate: (Pair<PsiElement, PsiElement>) -> Boolean): Pair<PsiElement, PsiElement>? defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<PsiElement, PsiElement>

'component1' @ [351:18] ==> public final operator fun component1(): PsiElement defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [351:25] ==> public final operator fun component2(): PsiElement defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'it' @ [351:35] ==> value-parameter it: Pair<PsiElement, PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.getContainer.<anonymous>[ValueParameterDescriptorImpl]

'when (parent) {
                is KtContainerNode -> !parent.isBadContainerNode(place)
                is KtBlockExpression -> true
                is KtWhenEntry -> place == parent.expression
                is KtDeclarationWithBody -> parent.bodyExpression == place
                is KtClassBody -> true
                is KtFile -> true
                else -> false
            }' @ [352:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean, entry2: Boolean, entry3: Boolean, entry4: Boolean, entry5: Boolean, entry6: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'parent' @ [352:19] ==> val parent: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.getContainer.<anonymous>[LocalVariableDescriptor]

'!' @ [353:39] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'parent' @ [353:40] ==> val parent: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.getContainer.<anonymous>[LocalVariableDescriptor]

'isBadContainerNode' @ [353:47] ==> private final fun KtContainerNode.isBadContainerNode(place: PsiElement): Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler[SimpleFunctionDescriptorImpl]

'place' @ [353:66] ==> val place: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.getContainer.<anonymous>[LocalVariableDescriptor]

'place' @ [355:35] ==> val place: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.getContainer.<anonymous>[LocalVariableDescriptor]

'parent' @ [355:44] ==> val parent: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.getContainer.<anonymous>[LocalVariableDescriptor]

'expression' @ [355:51] ==> public final val KtWhenEntry.expression: KtExpression?[MyPropertyDescriptor]

'parent' @ [356:45] ==> val parent: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.getContainer.<anonymous>[LocalVariableDescriptor]

'bodyExpression' @ [356:52] ==> public final val KtDeclarationWithBody.bodyExpression: KtExpression?[MyPropertyDescriptor]

'place' @ [356:70] ==> val place: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.getContainer.<anonymous>[LocalVariableDescriptor]

'second' @ [361:12] ==> public final val second: PsiElement defined in kotlin.Pair[DeserializedPropertyDescriptor]

'parent' @ [365:22] ==> public final val KtContainerNode.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'when (parent) {
            is KtIfExpression -> parent.condition == place
            is KtLoopExpression -> parent.body != place
            is KtArrayAccessExpression -> true
            else -> false
        }' @ [366:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean, entry2: Boolean, entry3: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'parent' @ [366:22] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.isBadContainerNode[LocalVariableDescriptor]

'parent' @ [367:34] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.isBadContainerNode[LocalVariableDescriptor]

'condition' @ [367:41] ==> public final val KtIfExpression.condition: KtExpression?[MyPropertyDescriptor]

'place' @ [367:54] ==> value-parameter place: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.isBadContainerNode[ValueParameterDescriptorImpl]

'parent' @ [368:36] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.isBadContainerNode[LocalVariableDescriptor]

'body' @ [368:43] ==> public final val KtLoopExpression.body: KtExpression?[MyPropertyDescriptor]

'place' @ [368:51] ==> value-parameter place: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.isBadContainerNode[ValueParameterDescriptorImpl]

'component1' @ [376:15] ==> public final operator fun component1(): PsiElement defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [376:22] ==> public final operator fun component2(): PsiElement defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'parentsWithSelf' @ [376:33] ==> public val PsiElement.parentsWithSelf: Sequence<PsiElement> defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'zip' @ [376:49] ==> public infix fun <T, R> Sequence<PsiElement>.zip(other: Sequence<PsiElement>): Sequence<Pair<PsiElement, PsiElement>> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement
    <R> -> PsiElement

'parents' @ [376:53] ==> public val PsiElement.parents: Sequence<PsiElement> defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'when {
                parent is KtContainerNode && place !is KtBlockExpression && !parent.isBadContainerNode(place) -> result = parent
                parent is KtClassBody || parent is KtFile -> return if (result == null) parent as KtElement else result
                parent is KtBlockExpression -> result = parent
                parent is KtWhenEntry && place !is KtBlockExpression -> result = parent
                parent is KtDeclarationWithBody && parent.bodyExpression == place && place !is KtBlockExpression -> result = parent
            }' @ [377:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit, entry3: Unit, entry4: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'parent' @ [378:17] ==> val parent: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.getOccurrenceContainer[LocalVariableDescriptor]

'place' @ [378:46] ==> val place: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.getOccurrenceContainer[LocalVariableDescriptor]

'!' @ [378:77] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'parent' @ [378:78] ==> val parent: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.getOccurrenceContainer[LocalVariableDescriptor]

'isBadContainerNode' @ [378:85] ==> private final fun KtContainerNode.isBadContainerNode(place: PsiElement): Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler[SimpleFunctionDescriptorImpl]

'place' @ [378:104] ==> val place: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.getOccurrenceContainer[LocalVariableDescriptor]

'result' @ [378:114] ==> var result: KtElement? defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.getOccurrenceContainer[LocalVariableDescriptor]

'parent' @ [378:123] ==> val parent: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.getOccurrenceContainer[LocalVariableDescriptor]

'parent' @ [379:17] ==> val parent: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.getOccurrenceContainer[LocalVariableDescriptor]

'parent' @ [379:42] ==> val parent: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.getOccurrenceContainer[LocalVariableDescriptor]

'if (result == null) parent as KtElement else result' @ [379:69] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KtElement?, elseBranch: KtElement?): KtElement?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KtElement?

'result' @ [379:73] ==> var result: KtElement? defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.getOccurrenceContainer[LocalVariableDescriptor]

'parent' @ [379:89] ==> val parent: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.getOccurrenceContainer[LocalVariableDescriptor]

'result' @ [379:114] ==> var result: KtElement? defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.getOccurrenceContainer[LocalVariableDescriptor]

'parent' @ [380:17] ==> val parent: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.getOccurrenceContainer[LocalVariableDescriptor]

'result' @ [380:48] ==> var result: KtElement? defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.getOccurrenceContainer[LocalVariableDescriptor]

'parent' @ [380:57] ==> val parent: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.getOccurrenceContainer[LocalVariableDescriptor]

'parent' @ [381:17] ==> val parent: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.getOccurrenceContainer[LocalVariableDescriptor]

'place' @ [381:42] ==> val place: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.getOccurrenceContainer[LocalVariableDescriptor]

'result' @ [381:73] ==> var result: KtElement? defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.getOccurrenceContainer[LocalVariableDescriptor]

'parent' @ [381:82] ==> val parent: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.getOccurrenceContainer[LocalVariableDescriptor]

'parent' @ [382:17] ==> val parent: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.getOccurrenceContainer[LocalVariableDescriptor]

'parent' @ [382:52] ==> val parent: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.getOccurrenceContainer[LocalVariableDescriptor]

'bodyExpression' @ [382:59] ==> public final val KtDeclarationWithBody.bodyExpression: KtExpression?[MyPropertyDescriptor]

'place' @ [382:77] ==> val place: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.getOccurrenceContainer[LocalVariableDescriptor]

'place' @ [382:86] ==> val place: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.getOccurrenceContainer[LocalVariableDescriptor]

'result' @ [382:117] ==> var result: KtElement? defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.getOccurrenceContainer[LocalVariableDescriptor]

'parent' @ [382:126] ==> val parent: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.getOccurrenceContainer[LocalVariableDescriptor]

'showErrorHint' @ [390:31] ==> public open fun showErrorHint(@NotNull p0: Project, @Nullable p1: Editor?, @NotNull @Nls p2: String, @NotNull @Nls p3: String, @Nullable p4: String?): Unit defined in com.intellij.refactoring.util.CommonRefactoringUtil[JavaMethodDescriptor]

'project' @ [390:45] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.showErrorHint[ValueParameterDescriptorImpl]

'editor' @ [390:54] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.showErrorHint[ValueParameterDescriptorImpl]

'message' @ [390:62] ==> value-parameter message: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.showErrorHint[ValueParameterDescriptorImpl]

'INTRODUCE_VARIABLE' @ [390:71] ==> public final val INTRODUCE_VARIABLE: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler[PropertyDescriptorImpl]

'INTRODUCE_VARIABLE' @ [390:98] ==> public const final val INTRODUCE_VARIABLE: String defined in com.intellij.refactoring.HelpID[JavaPropertyDescriptor]

'haveOccurrencesToReplace' @ [398:13] ==> value-parameter haveOccurrencesToReplace: Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.chooseApplicableComponentFunctionsForVariableDeclaration[ValueParameterDescriptorImpl]

'invoke' @ [398:46] ==> public abstract operator fun invoke(p1: List<FunctionDescriptor>): Unit defined in kotlin.Function1[FunctionInvokeDescriptor]

'emptyList' @ [398:55] ==> public fun <T> emptyList(): List<FunctionDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FunctionDescriptor

'chooseApplicableComponentFunctions' @ [399:16] ==> internal fun chooseApplicableComponentFunctions(contextExpression: KtExpression, editor: Editor?, type: KotlinType? = ..., receiverExpression: KtExpression? = ..., callback: (List<FunctionDescriptor>) -> Unit): Unit defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable in file introduceVariableUtils.kt[SimpleFunctionDescriptorImpl]

'this' @ [399:51] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.chooseApplicableComponentFunctionsForVariableDeclaration[ReceiverParameterDescriptorImpl]

'editor' @ [399:57] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.chooseApplicableComponentFunctionsForVariableDeclaration[ValueParameterDescriptorImpl]

'callback' @ [399:76] ==> value-parameter callback: (List<FunctionDescriptor>) -> Unit defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.chooseApplicableComponentFunctionsForVariableDeclaration[ValueParameterDescriptorImpl]

'canStart' @ [409:25] ==> public open fun canStart(p0: (Project..Project?)): (StartMarkAction..StartMarkAction?) defined in com.intellij.openapi.command.impl.StartMarkAction[JavaMethodDescriptor]

'project' @ [409:34] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.executeMultiDeclarationTemplate[ValueParameterDescriptorImpl]

'let' @ [409:44] ==> @InlineOnly public inline fun <T, R> StartMarkAction.let(block: (StartMarkAction) -> Nothing): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StartMarkAction
    <R> -> Nothing

'TemplateBuilderImpl' @ [411:23] ==> public constructor TemplateBuilderImpl(@NotNull p0: PsiElement) defined in com.intellij.codeInsight.template.TemplateBuilderImpl[JavaClassConstructorDescriptor]

'declaration' @ [411:43] ==> value-parameter declaration: KtDestructuringDeclaration defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.executeMultiDeclarationTemplate[ValueParameterDescriptorImpl]

'component1' @ [412:15] ==> public final operator fun component1(): Int defined in kotlin.collections.IndexedValue[DeserializedSimpleFunctionDescriptor]

'component2' @ [412:22] ==> public final operator fun component2(): (KtDestructuringDeclarationEntry..KtDestructuringDeclarationEntry?) defined in kotlin.collections.IndexedValue[DeserializedSimpleFunctionDescriptor]

'declaration' @ [412:32] ==> value-parameter declaration: KtDestructuringDeclaration defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.executeMultiDeclarationTemplate[ValueParameterDescriptorImpl]

'entries' @ [412:44] ==> public final val KtDestructuringDeclaration.entries: (MutableList<(KtDestructuringDeclarationEntry..KtDestructuringDeclarationEntry?)>..List<(KtDestructuringDeclarationEntry..KtDestructuringDeclarationEntry?)>)[MyPropertyDescriptor]

'withIndex' @ [412:52] ==> public fun <T> Iterable<(KtDestructuringDeclarationEntry..KtDestructuringDeclarationEntry?)>.withIndex(): Iterable<IndexedValue<(KtDestructuringDeclarationEntry..KtDestructuringDeclarationEntry?)>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtDestructuringDeclarationEntry..org.jetbrains.kotlin.psi.KtDestructuringDeclarationEntry?)

'Expression' @ [413:47] ==> public constructor Expression() defined in com.intellij.codeInsight.template.Expression[JavaClassConstructorDescriptor]

'suggestedNames' @ [414:43] ==> value-parameter suggestedNames: List<Collection<String>> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.executeMultiDeclarationTemplate[ValueParameterDescriptorImpl]

'index' @ [414:58] ==> val index: Int defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.executeMultiDeclarationTemplate[LocalVariableDescriptor]

'map' @ [414:65] ==> public inline fun <T, R> Iterable<String>.map(transform: (String) -> LookupElementBuilder): List<LookupElementBuilder> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> LookupElementBuilder

'create' @ [414:92] ==> @NotNull public open fun create(@NotNull p0: String): LookupElementBuilder defined in com.intellij.codeInsight.lookup.LookupElementBuilder[JavaMethodDescriptor]

'it' @ [414:99] ==> value-parameter it: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.executeMultiDeclarationTemplate.<no name provided>.lookupItems.<anonymous>[ValueParameterDescriptorImpl]

'toTypedArray' @ [414:105] ==> public inline fun <reified T> Collection<LookupElementBuilder>.toTypedArray(): Array<LookupElementBuilder> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> LookupElementBuilder

'TextResult' @ [416:82] ==> public constructor TextResult(@NotNull p0: String) defined in com.intellij.codeInsight.template.TextResult[JavaClassConstructorDescriptor]

'suggestedNames' @ [416:93] ==> value-parameter suggestedNames: List<Collection<String>> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.executeMultiDeclarationTemplate[ValueParameterDescriptorImpl]

'index' @ [416:108] ==> val index: Int defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.executeMultiDeclarationTemplate[LocalVariableDescriptor]

'first' @ [416:115] ==> public fun <T> Iterable<String>.first(): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'calculateQuickResult' @ [418:77] ==> public open fun calculateQuickResult(context: ExpressionContext?): TextResult defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.executeMultiDeclarationTemplate.<no name provided>[SimpleFunctionDescriptorImpl]

'context' @ [418:98] ==> value-parameter context: ExpressionContext? defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.executeMultiDeclarationTemplate.<no name provided>.calculateResult[ValueParameterDescriptorImpl]

'lookupItems' @ [420:82] ==> private final val lookupItems: Array<LookupElementBuilder> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.executeMultiDeclarationTemplate.<no name provided>[PropertyDescriptorImpl]

'builder' @ [422:13] ==> val builder: TemplateBuilderImpl defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.executeMultiDeclarationTemplate[LocalVariableDescriptor]

'replaceElement' @ [422:21] ==> public open fun replaceElement(@NotNull p0: PsiElement, p1: (Expression..Expression?)): Unit defined in com.intellij.codeInsight.template.TemplateBuilderImpl[JavaMethodDescriptor]

'entry' @ [422:36] ==> val entry: (KtDestructuringDeclarationEntry..KtDestructuringDeclarationEntry?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.executeMultiDeclarationTemplate[LocalVariableDescriptor]

'templateExpression' @ [422:43] ==> val templateExpression: <no name provided> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.executeMultiDeclarationTemplate[LocalVariableDescriptor]

'start' @ [425:47] ==> public open fun start(p0: (Editor..Editor?), p1: (Project..Project?), p2: (String..String?)): (StartMarkAction..StartMarkAction?) defined in com.intellij.openapi.command.impl.StartMarkAction[JavaMethodDescriptor]

'editor' @ [425:53] ==> value-parameter editor: Editor defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.executeMultiDeclarationTemplate[ValueParameterDescriptorImpl]

'project' @ [425:61] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.executeMultiDeclarationTemplate[ValueParameterDescriptorImpl]

'INTRODUCE_VARIABLE' @ [425:70] ==> public final val INTRODUCE_VARIABLE: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler[PropertyDescriptorImpl]

'editor' @ [426:9] ==> value-parameter editor: Editor defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.executeMultiDeclarationTemplate[ValueParameterDescriptorImpl]

'caretModel' @ [426:16] ==> public final val Editor.caretModel: CaretModel[MyPropertyDescriptor]

'moveToOffset' @ [426:27] ==> public abstract fun moveToOffset(p0: Int): Unit defined in com.intellij.openapi.editor.CaretModel[JavaMethodDescriptor]

'declaration' @ [426:40] ==> value-parameter declaration: KtDestructuringDeclaration defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.executeMultiDeclarationTemplate[ValueParameterDescriptorImpl]

'startOffset' @ [426:52] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'project' @ [428:9] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.executeMultiDeclarationTemplate[ValueParameterDescriptorImpl]

'executeWriteCommand' @ [428:17] ==> public fun Project.executeWriteCommand(name: String, command: () -> Unit): Unit defined in org.jetbrains.kotlin.idea.util.application[DeserializedSimpleFunctionDescriptor]

'INTRODUCE_VARIABLE' @ [428:37] ==> public final val INTRODUCE_VARIABLE: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler[PropertyDescriptorImpl]

'getInstance' @ [429:29] ==> public open fun getInstance(p0: (Project..Project?)): (TemplateManager..TemplateManager?) defined in com.intellij.codeInsight.template.TemplateManager[JavaMethodDescriptor]

'project' @ [429:41] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.executeMultiDeclarationTemplate[ValueParameterDescriptorImpl]

'startTemplate' @ [429:50] ==> public abstract fun startTemplate(@NotNull p0: Editor, @NotNull p1: Template, p2: (TemplateEditingListener..TemplateEditingListener?)): Unit defined in com.intellij.codeInsight.template.TemplateManager[JavaMethodDescriptor]

'editor' @ [430:21] ==> value-parameter editor: Editor defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.executeMultiDeclarationTemplate[ValueParameterDescriptorImpl]

'builder' @ [431:21] ==> val builder: TemplateBuilderImpl defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.executeMultiDeclarationTemplate[LocalVariableDescriptor]

'buildInlineTemplate' @ [431:29] ==> public open fun buildInlineTemplate(): (Template..Template?) defined in com.intellij.codeInsight.template.TemplateBuilderImpl[JavaMethodDescriptor]

'TemplateEditingAdapter' @ [432:29] ==> public constructor TemplateEditingAdapter() defined in com.intellij.codeInsight.template.TemplateEditingAdapter[JavaClassConstructorDescriptor]

'finish' @ [434:46] ==> public open fun finish(p0: (Project..Project?), p1: (Editor..Editor?), @Nullable p2: StartMarkAction?): Unit defined in com.intellij.openapi.command.impl.FinishMarkAction[JavaMethodDescriptor]

'project' @ [434:53] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.executeMultiDeclarationTemplate[ValueParameterDescriptorImpl]

'editor' @ [434:62] ==> value-parameter editor: Editor defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.executeMultiDeclarationTemplate[ValueParameterDescriptorImpl]

'startMarkAction' @ [434:70] ==> val startMarkAction: (StartMarkAction..StartMarkAction?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.executeMultiDeclarationTemplate[LocalVariableDescriptor]

'!' @ [438:33] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'brokenOff' @ [438:34] ==> value-parameter brokenOff: Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.executeMultiDeclarationTemplate.<anonymous>.<no name provided>.templateFinished[ValueParameterDescriptorImpl]

'invoke' @ [439:33] ==> public abstract operator fun invoke(p1: KtDeclaration): Unit defined in kotlin.Function1[FunctionInvokeDescriptor]

'declaration' @ [439:45] ==> value-parameter declaration: KtDestructuringDeclaration defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.executeMultiDeclarationTemplate[ValueParameterDescriptorImpl]

'finishMarkAction' @ [441:29] ==> private final fun finishMarkAction(): Unit defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.executeMultiDeclarationTemplate.<anonymous>.<no name provided>[SimpleFunctionDescriptorImpl]

'finishMarkAction' @ [445:29] ==> private final fun finishMarkAction(): Unit defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.executeMultiDeclarationTemplate.<anonymous>.<no name provided>[SimpleFunctionDescriptorImpl]

'expression' @ [464:29] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.doRefactoring[ValueParameterDescriptorImpl]

'extractableSubstringInfo' @ [464:40] ==> public var KtExpression.extractableSubstringInfo: ExtractableSubstringInfo? defined in org.jetbrains.kotlin.idea.refactoring.introduce[DeserializedPropertyDescriptor]

'expression' @ [465:34] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.doRefactoring[ValueParameterDescriptorImpl]

'substringContextOrThis' @ [465:45] ==> public val KtExpression.substringContextOrThis: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce[DeserializedPropertyDescriptor]

'physicalExpression' @ [467:22] ==> val physicalExpression: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.doRefactoring[LocalVariableDescriptor]

'parent' @ [467:41] ==> public final val KtExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'when {
            parent is KtQualifiedExpression -> {
                if (parent.receiverExpression != physicalExpression) {
                    return showErrorHint(project, editor, KotlinRefactoringBundle.message("cannot.refactor.no.expression"))
                }
            }
            physicalExpression is KtStatementExpression ->
                return showErrorHint(project, editor, KotlinRefactoringBundle.message("cannot.refactor.no.expression"))
            parent is KtOperationExpression && parent.operationReference == physicalExpression ->
                return showErrorHint(project, editor, KotlinRefactoringBundle.message("cannot.refactor.no.expression"))
        }' @ [469:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'parent' @ [470:13] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.doRefactoring[LocalVariableDescriptor]

'parent' @ [471:21] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.doRefactoring[LocalVariableDescriptor]

'receiverExpression' @ [471:28] ==> public open val receiverExpression: KtExpression defined in org.jetbrains.kotlin.psi.KtQualifiedExpression[DeserializedPropertyDescriptor]

'physicalExpression' @ [471:50] ==> val physicalExpression: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.doRefactoring[LocalVariableDescriptor]

'showErrorHint' @ [472:28] ==> private final fun showErrorHint(project: Project, editor: Editor?, message: String): Unit defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler[SimpleFunctionDescriptorImpl]

'project' @ [472:42] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.doRefactoring[ValueParameterDescriptorImpl]

'editor' @ [472:51] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.doRefactoring[ValueParameterDescriptorImpl]

'message' @ [472:83] ==> @NotNull public open fun message(@NonNls @PropertyKey key: (String..String?), vararg params: (Any..Any?)): String defined in org.jetbrains.kotlin.idea.refactoring.KotlinRefactoringBundle[JavaMethodDescriptor]

'physicalExpression' @ [475:13] ==> val physicalExpression: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.doRefactoring[LocalVariableDescriptor]

'showErrorHint' @ [476:24] ==> private final fun showErrorHint(project: Project, editor: Editor?, message: String): Unit defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler[SimpleFunctionDescriptorImpl]

'project' @ [476:38] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.doRefactoring[ValueParameterDescriptorImpl]

'editor' @ [476:47] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.doRefactoring[ValueParameterDescriptorImpl]

'message' @ [476:79] ==> @NotNull public open fun message(@NonNls @PropertyKey key: (String..String?), vararg params: (Any..Any?)): String defined in org.jetbrains.kotlin.idea.refactoring.KotlinRefactoringBundle[JavaMethodDescriptor]

'parent' @ [477:13] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.doRefactoring[LocalVariableDescriptor]

'parent' @ [477:48] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.doRefactoring[LocalVariableDescriptor]

'operationReference' @ [477:55] ==> public final val KtOperationExpression.operationReference: KtSimpleNameExpression[MyPropertyDescriptor]

'physicalExpression' @ [477:77] ==> val physicalExpression: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.doRefactoring[LocalVariableDescriptor]

'showErrorHint' @ [478:24] ==> private final fun showErrorHint(project: Project, editor: Editor?, message: String): Unit defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler[SimpleFunctionDescriptorImpl]

'project' @ [478:38] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.doRefactoring[ValueParameterDescriptorImpl]

'editor' @ [478:47] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.doRefactoring[ValueParameterDescriptorImpl]

'message' @ [478:79] ==> @NotNull public open fun message(@NonNls @PropertyKey key: (String..String?), vararg params: (Any..Any?)): String defined in org.jetbrains.kotlin.idea.refactoring.KotlinRefactoringBundle[JavaMethodDescriptor]

'getNonStrictParentOfType' @ [481:21] ==> @SafeVarargs @Nullable @Contract public open fun <T : (PsiElement..PsiElement?)> getNonStrictParentOfType(@Nullable p0: PsiElement?, @NotNull vararg p1: (Class<out (NavigatablePsiElement..NavigatablePsiElement?)>..Class<out (NavigatablePsiElement..NavigatablePsiElement?)>?)): NavigatablePsiElement? defined in com.intellij.psi.util.PsiTreeUtil[JavaMethodDescriptor]
Inferred types:
    <T : (PsiElement..PsiElement?)> -> (com.intellij.psi.NavigatablePsiElement..com.intellij.psi.NavigatablePsiElement?)

'physicalExpression' @ [481:46] ==> val physicalExpression: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.doRefactoring[LocalVariableDescriptor]

'java' @ [482:69] ==> public val <T> KClass<KtTypeReference>.java: Class<KtTypeReference> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtTypeReference

'java' @ [483:83] ==> public val <T> KClass<KtConstructorCalleeExpression>.java: Class<KtConstructorCalleeExpression> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtConstructorCalleeExpression

'KtSuperExpression' @ [484:46] ==> public constructor KtSuperExpression(@NotNull p0: ASTNode) defined in org.jetbrains.kotlin.psi.KtSuperExpression[JavaClassConstructorDescriptor]

'java' @ [484:71] ==> public val <T> KClass<KtSuperExpression>.java: Class<KtSuperExpression> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtSuperExpression

'KtConstructorDelegationReferenceExpression' @ [485:46] ==> public constructor KtConstructorDelegationReferenceExpression(@NotNull p0: ASTNode) defined in org.jetbrains.kotlin.psi.KtConstructorDelegationReferenceExpression[JavaClassConstructorDescriptor]

'java' @ [485:96] ==> public val <T> KClass<KtConstructorDelegationReferenceExpression>.java: Class<KtConstructorDelegationReferenceExpression> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtConstructorDelegationReferenceExpression

'java' @ [486:71] ==> public val <T> KClass<KtAnnotationEntry>.java: Class<KtAnnotationEntry> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtAnnotationEntry

'let' @ [486:78] ==> @InlineOnly public inline fun <T, R> NavigatablePsiElement.let(block: (NavigatablePsiElement) -> Nothing): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> NavigatablePsiElement
    <R> -> Nothing

'showErrorHint' @ [487:20] ==> private final fun showErrorHint(project: Project, editor: Editor?, message: String): Unit defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler[SimpleFunctionDescriptorImpl]

'project' @ [487:34] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.doRefactoring[ValueParameterDescriptorImpl]

'editor' @ [487:43] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.doRefactoring[ValueParameterDescriptorImpl]

'message' @ [487:75] ==> @NotNull public open fun message(@NonNls @PropertyKey key: (String..String?), vararg params: (Any..Any?)): String defined in org.jetbrains.kotlin.idea.refactoring.KotlinRefactoringBundle[JavaMethodDescriptor]

'substringInfo' @ [490:30] ==> val substringInfo: ExtractableSubstringInfo? defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.doRefactoring[LocalVariableDescriptor]

'type' @ [490:45] ==> public final val type: KotlinType defined in org.jetbrains.kotlin.idea.refactoring.introduce.ExtractableSubstringInfo[DeserializedPropertyDescriptor]

'bindingContext' @ [490:53] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.doRefactoring[ValueParameterDescriptorImpl]

'getType' @ [490:68] ==> @Nullable public abstract fun getType(@NotNull p0: KtExpression): KotlinType? defined in org.jetbrains.kotlin.resolve.BindingContext[JavaMethodDescriptor]

'physicalExpression' @ [490:76] ==> val physicalExpression: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.doRefactoring[LocalVariableDescriptor]

'physicalExpression' @ [491:21] ==> val physicalExpression: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.doRefactoring[LocalVariableDescriptor]

'getResolutionScope' @ [491:40] ==> public fun PsiElement.getResolutionScope(bindingContext: BindingContext, resolutionFacade: ResolutionFacade): LexicalScope defined in org.jetbrains.kotlin.idea.util[DeserializedSimpleFunctionDescriptor]

'bindingContext' @ [491:59] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.doRefactoring[ValueParameterDescriptorImpl]

'resolutionFacade' @ [491:75] ==> value-parameter resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.doRefactoring[ValueParameterDescriptorImpl]

'bindingContext' @ [492:28] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.doRefactoring[ValueParameterDescriptorImpl]

'getDataFlowInfoAfter' @ [492:43] ==> public fun BindingContext.getDataFlowInfoAfter(position: PsiElement): DataFlowInfo defined in org.jetbrains.kotlin.resolve.bindingContextUtil[DeserializedSimpleFunctionDescriptor]

'physicalExpression' @ [492:64] ==> val physicalExpression: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.doRefactoring[LocalVariableDescriptor]

'ObservableBindingTrace' @ [494:28] ==> public constructor ObservableBindingTrace(p0: (BindingTrace..BindingTrace?)) defined in org.jetbrains.kotlin.resolve.ObservableBindingTrace[JavaClassConstructorDescriptor]

'BindingTraceContext' @ [494:51] ==> public constructor BindingTraceContext() defined in org.jetbrains.kotlin.resolve.BindingTraceContext[JavaClassConstructorDescriptor]

'substringInfo' @ [495:34] ==> val substringInfo: ExtractableSubstringInfo? defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.doRefactoring[LocalVariableDescriptor]

'type' @ [495:49] ==> public final val type: KotlinType defined in org.jetbrains.kotlin.idea.refactoring.introduce.ExtractableSubstringInfo[DeserializedPropertyDescriptor]

'physicalExpression' @ [496:37] ==> val physicalExpression: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.doRefactoring[LocalVariableDescriptor]

'computeTypeInfoInContext' @ [496:56] ==> @JvmOverloads public fun KtExpression.computeTypeInfoInContext(scope: LexicalScope, contextExpression: KtExpression = ..., trace: BindingTrace = ..., dataFlowInfo: DataFlowInfo = ..., expectedType: KotlinType = ..., isStatement: Boolean = ..., contextDependency: ContextDependency = ..., expressionTypingServices: ExpressionTypingServices = ...): KotlinTypeInfo defined in org.jetbrains.kotlin.idea.analysis[DeserializedSimpleFunctionDescriptor]

'scope' @ [496:81] ==> val scope: LexicalScope defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.doRefactoring[LocalVariableDescriptor]

'physicalExpression' @ [496:88] ==> val physicalExpression: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.doRefactoring[LocalVariableDescriptor]

'bindingTrace' @ [496:108] ==> val bindingTrace: ObservableBindingTrace defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.doRefactoring[LocalVariableDescriptor]

'dataFlowInfo' @ [496:122] ==> val dataFlowInfo: DataFlowInfo defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.doRefactoring[LocalVariableDescriptor]

'type' @ [496:136] ==> public final val type: KotlinType? defined in org.jetbrains.kotlin.types.expressions.KotlinTypeInfo[DeserializedPropertyDescriptor]

'expressionType' @ [497:31] ==> val expressionType: KotlinType? defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.doRefactoring[LocalVariableDescriptor]

'typeNoExpectedType' @ [498:34] ==> val typeNoExpectedType: KotlinType? defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.doRefactoring[LocalVariableDescriptor]

'!' @ [499:34] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'DEFAULT' @ [499:53] ==> public final val DEFAULT: (KotlinTypeChecker..KotlinTypeChecker?) defined in org.jetbrains.kotlin.types.checker.KotlinTypeChecker[JavaPropertyDescriptor]

'equalTypes' @ [499:61] ==> public abstract fun equalTypes(@NotNull p0: KotlinType, @NotNull p1: KotlinType): Boolean defined in org.jetbrains.kotlin.types.checker.KotlinTypeChecker[JavaMethodDescriptor]

'expressionType' @ [499:72] ==> val expressionType: KotlinType? defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.doRefactoring[LocalVariableDescriptor]

'typeNoExpectedType' @ [499:88] ==> val typeNoExpectedType: KotlinType? defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.doRefactoring[LocalVariableDescriptor]

'expressionType' @ [501:13] ==> val expressionType: KotlinType? defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.doRefactoring[LocalVariableDescriptor]

'bindingContext' @ [501:39] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.doRefactoring[ValueParameterDescriptorImpl]

'get' @ [501:54] ==> @Nullable public abstract operator fun <K : (Any..Any?), V : (Any..Any?)> get(p0: (ReadOnlySlice<(KtExpression..KtExpression?), (Qualifier..Qualifier?)>..ReadOnlySlice<(KtExpression..KtExpression?), (Qualifier..Qualifier?)>?), p1: (KtExpression..KtExpression?)): Qualifier? defined in org.jetbrains.kotlin.resolve.BindingContext[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> (org.jetbrains.kotlin.psi.KtExpression..org.jetbrains.kotlin.psi.KtExpression?)
    <V : (Any..Any?)> -> (org.jetbrains.kotlin.resolve.scopes.receivers.Qualifier..org.jetbrains.kotlin.resolve.scopes.receivers.Qualifier?)

'QUALIFIER' @ [501:73] ==> public final val QUALIFIER: (WritableSlice<(KtExpression..KtExpression?), (Qualifier..Qualifier?)>..WritableSlice<(KtExpression..KtExpression?), (Qualifier..Qualifier?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'physicalExpression' @ [501:84] ==> val physicalExpression: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.doRefactoring[LocalVariableDescriptor]

'showErrorHint' @ [502:20] ==> private final fun showErrorHint(project: Project, editor: Editor?, message: String): Unit defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler[SimpleFunctionDescriptorImpl]

'project' @ [502:34] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.doRefactoring[ValueParameterDescriptorImpl]

'editor' @ [502:43] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.doRefactoring[ValueParameterDescriptorImpl]

'message' @ [502:75] ==> @NotNull public open fun message(@NonNls @PropertyKey key: (String..String?), vararg params: (Any..Any?)): String defined in org.jetbrains.kotlin.idea.refactoring.KotlinRefactoringBundle[JavaMethodDescriptor]

'expressionType' @ [505:13] ==> val expressionType: KotlinType? defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.doRefactoring[LocalVariableDescriptor]

'isUnit' @ [505:54] ==> public open fun isUnit(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'expressionType' @ [505:61] ==> val expressionType: KotlinType? defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.doRefactoring[LocalVariableDescriptor]

'showErrorHint' @ [506:20] ==> private final fun showErrorHint(project: Project, editor: Editor?, message: String): Unit defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler[SimpleFunctionDescriptorImpl]

'project' @ [506:34] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.doRefactoring[ValueParameterDescriptorImpl]

'editor' @ [506:43] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.doRefactoring[ValueParameterDescriptorImpl]

'message' @ [506:75] ==> @NotNull public open fun message(@NonNls @PropertyKey key: (String..String?), vararg params: (Any..Any?)): String defined in org.jetbrains.kotlin.idea.refactoring.KotlinRefactoringBundle[JavaMethodDescriptor]

'getQualifiedTypeArgumentList' @ [509:32] ==> public fun getQualifiedTypeArgumentList(initializer: KtExpression, context: BindingContext = ...): KtTypeArgumentList? defined in org.jetbrains.kotlin.idea.refactoring in file kotlinRefactoringUtil.kt[SimpleFunctionDescriptorImpl]

'safeDeparenthesize' @ [509:71] ==> @NotNull public open fun safeDeparenthesize(@NotNull p0: KtExpression): KtExpression defined in org.jetbrains.kotlin.psi.KtPsiUtil[JavaMethodDescriptor]

'physicalExpression' @ [509:90] ==> val physicalExpression: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.doRefactoring[LocalVariableDescriptor]

'editor' @ [511:34] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.doRefactoring[ValueParameterDescriptorImpl]

'editor' @ [512:37] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.doRefactoring[ValueParameterDescriptorImpl]

'settings' @ [512:44] ==> public final val Editor.settings: EditorSettings[MyPropertyDescriptor]

'isVariableInplaceRenameEnabled' @ [512:53] ==> public final var EditorSettings.isVariableInplaceRenameEnabled: Boolean[MyPropertyDescriptor]

'!' @ [513:37] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'getApplication' @ [513:57] ==> public open fun getApplication(): (Application..Application?) defined in com.intellij.openapi.application.ApplicationManager[JavaMethodDescriptor]

'isUnitTestMode' @ [513:74] ==> public final val Application.isUnitTestMode: Boolean[MyPropertyDescriptor]

'occurrencesToReplace' @ [515:30] ==> value-parameter occurrencesToReplace: List<KtExpression>? defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.doRefactoring[ValueParameterDescriptorImpl]

'expression' @ [515:54] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.doRefactoring[ValueParameterDescriptorImpl]

'findOccurrences' @ [515:65] ==> private final fun KtExpression.findOccurrences(occurrenceContainer: PsiElement): List<KtExpression> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler[SimpleFunctionDescriptorImpl]

'occurrenceContainer' @ [515:81] ==> value-parameter occurrenceContainer: KtElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.doRefactoring[ValueParameterDescriptorImpl]

'Pass' @ [517:24] ==> public fun <T> Pass(body: (OccurrencesChooser.ReplaceChoice) -> Unit): Pass<OccurrencesChooser.ReplaceChoice> defined in org.jetbrains.kotlin.idea.refactoring[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> ReplaceChoice

'when (replaceChoice) {
                OccurrencesChooser.ReplaceChoice.ALL -> allOccurrences
                else -> listOf(expression)
            }' @ [518:31] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: List<KtExpression>, entry1: List<KtExpression>): List<KtExpression>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> List<KtExpression>

'replaceChoice' @ [518:37] ==> value-parameter replaceChoice: OccurrencesChooser.ReplaceChoice defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.doRefactoring.<anonymous>[ValueParameterDescriptorImpl]

'ALL' @ [519:50] ==> enum entry ALL defined in com.intellij.refactoring.introduce.inplace.OccurrencesChooser.ReplaceChoice[FakeCallableDescriptorForObject]

'allOccurrences' @ [519:57] ==> val allOccurrences: List<KtExpression> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.doRefactoring[LocalVariableDescriptor]

'listOf' @ [520:25] ==> public fun <T> listOf(element: KtExpression): List<KtExpression> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression

'expression' @ [520:32] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.doRefactoring[ValueParameterDescriptorImpl]

'substringInfo' @ [522:37] ==> val substringInfo: ExtractableSubstringInfo? defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.doRefactoring[LocalVariableDescriptor]

'expression' @ [523:40] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.doRefactoring[ValueParameterDescriptorImpl]

'shouldReplaceOccurrence' @ [523:51] ==> private final fun KtExpression.shouldReplaceOccurrence(bindingContext: BindingContext, container: PsiElement?): Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler[SimpleFunctionDescriptorImpl]

'bindingContext' @ [523:75] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.doRefactoring[ValueParameterDescriptorImpl]

'container' @ [523:91] ==> value-parameter container: KtElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.doRefactoring[ValueParameterDescriptorImpl]

'allReplaces' @ [524:40] ==> val allReplaces: List<KtExpression> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.doRefactoring.<anonymous>[LocalVariableDescriptor]

'size' @ [524:52] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'if (allReplaces.isNotEmpty()) {
                PsiTreeUtil.findCommonParent(allReplaces.map { it.substringContextOrThis }) as KtElement
            }
            else {
                expression.parent as KtElement
            }' @ [526:32] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KtElement, elseBranch: KtElement): KtElement[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KtElement

'allReplaces' @ [526:36] ==> val allReplaces: List<KtExpression> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.doRefactoring.<anonymous>[LocalVariableDescriptor]

'isNotEmpty' @ [526:48] ==> @InlineOnly public inline fun <T> Collection<KtExpression>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression

'findCommonParent' @ [527:29] ==> @Nullable public open fun findCommonParent(@NotNull p0: (MutableList<out (PsiElement..PsiElement?)>..List<(PsiElement..PsiElement?)>)): PsiElement? defined in com.intellij.psi.util.PsiTreeUtil[JavaMethodDescriptor]

'allReplaces' @ [527:46] ==> val allReplaces: List<KtExpression> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.doRefactoring.<anonymous>[LocalVariableDescriptor]

'map' @ [527:58] ==> public inline fun <T, R> Iterable<KtExpression>.map(transform: (KtExpression) -> KtExpression): List<KtExpression> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression
    <R> -> KtExpression

'it' @ [527:64] ==> value-parameter it: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.doRefactoring.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'substringContextOrThis' @ [527:67] ==> public val KtExpression.substringContextOrThis: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce[DeserializedPropertyDescriptor]

'expression' @ [530:17] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.doRefactoring[ValueParameterDescriptorImpl]

'parent' @ [530:28] ==> public final val KtExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'commonParent' @ [532:35] ==> val commonParent: KtElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.doRefactoring.<anonymous>[LocalVariableDescriptor]

'getContainer' @ [532:48] ==> private final fun KtElement.getContainer(): KtElement? defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler[SimpleFunctionDescriptorImpl]

'commonContainer' @ [533:17] ==> var commonContainer: KtElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.doRefactoring.<anonymous>[LocalVariableDescriptor]

'container' @ [533:36] ==> value-parameter container: KtElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.doRefactoring[ValueParameterDescriptorImpl]

'container' @ [533:49] ==> value-parameter container: KtElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.doRefactoring[ValueParameterDescriptorImpl]

'isAncestor' @ [533:59] ==> public fun PsiElement?.isAncestor(element: PsiElement, strict: Boolean = ...): Boolean defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'commonContainer' @ [533:70] ==> var commonContainer: KtElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.doRefactoring.<anonymous>[LocalVariableDescriptor]

'commonContainer' @ [534:17] ==> var commonContainer: KtElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.doRefactoring.<anonymous>[LocalVariableDescriptor]

'container' @ [534:35] ==> value-parameter container: KtElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.doRefactoring[ValueParameterDescriptorImpl]

'typeArgumentList' @ [538:21] ==> val typeArgumentList: KtTypeArgumentList? defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.doRefactoring[LocalVariableDescriptor]

'when (declaration) {
                                          is KtProperty -> declaration.initializer
                                          is KtDestructuringDeclaration -> declaration.initializer
                                          else -> null
                                      }' @ [539:39] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: KtExpression?, entry1: KtExpression?, entry2: KtExpression?): KtExpression?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> KtExpression?

'declaration' @ [539:45] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.doRefactoring.<anonymous>.postProcess[ValueParameterDescriptorImpl]

'declaration' @ [540:60] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.doRefactoring.<anonymous>.postProcess[ValueParameterDescriptorImpl]

'initializer' @ [540:72] ==> public final var KtProperty.initializer: KtExpression?[MyPropertyDescriptor]

'declaration' @ [541:76] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.doRefactoring.<anonymous>.postProcess[ValueParameterDescriptorImpl]

'initializer' @ [541:88] ==> public final val KtDestructuringDeclaration.initializer: KtExpression?[MyPropertyDescriptor]

'runWriteAction' @ [544:21] ==> public fun <T> runWriteAction(action: () -> Unit): Unit defined in org.jetbrains.kotlin.idea.util.application[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit

'addTypeArgumentsIfNeeded' @ [544:38] ==> public fun addTypeArgumentsIfNeeded(expression: KtExpression, typeArgumentList: KtTypeArgumentList): Unit defined in org.jetbrains.kotlin.idea.refactoring in file kotlinRefactoringUtil.kt[SimpleFunctionDescriptorImpl]

'initializer' @ [544:63] ==> val initializer: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.doRefactoring.<anonymous>.postProcess[LocalVariableDescriptor]

'typeArgumentList' @ [544:76] ==> val typeArgumentList: KtTypeArgumentList? defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.doRefactoring[LocalVariableDescriptor]

'editor' @ [547:21] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.doRefactoring[ValueParameterDescriptorImpl]

'!' @ [547:39] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'replaceOccurrence' @ [547:40] ==> val replaceOccurrence: Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.doRefactoring.<anonymous>[LocalVariableDescriptor]

'editor' @ [548:21] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.doRefactoring[ValueParameterDescriptorImpl]

'caretModel' @ [548:28] ==> public final val Editor.caretModel: CaretModel[MyPropertyDescriptor]

'moveToOffset' @ [548:39] ==> public abstract fun moveToOffset(p0: Int): Unit defined in com.intellij.openapi.editor.CaretModel[JavaMethodDescriptor]

'declaration' @ [548:52] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.doRefactoring.<anonymous>.postProcess[ValueParameterDescriptorImpl]

'endOffset' @ [548:64] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'physicalExpression' @ [552:13] ==> val physicalExpression: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.doRefactoring[LocalVariableDescriptor]

'chooseApplicableComponentFunctionsForVariableDeclaration' @ [552:32] ==> private final fun KtExpression.chooseApplicableComponentFunctionsForVariableDeclaration(haveOccurrencesToReplace: Boolean, editor: Editor?, callback: (List<FunctionDescriptor>) -> Unit): Unit defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler[SimpleFunctionDescriptorImpl]

'replaceOccurrence' @ [552:89] ==> val replaceOccurrence: Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.doRefactoring.<anonymous>[LocalVariableDescriptor]

'editor' @ [552:108] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.doRefactoring[ValueParameterDescriptorImpl]

'NewDeclarationNameValidator' @ [553:33] ==> public constructor NewDeclarationNameValidator(container: PsiElement, anchor: PsiElement?, target: NewDeclarationNameValidator.Target, excludedDeclarations: List<KtDeclaration> = ...) defined in org.jetbrains.kotlin.idea.core.NewDeclarationNameValidator[DeserializedClassConstructorDescriptor]

'commonContainer' @ [554:25] ==> var commonContainer: KtElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.doRefactoring.<anonymous>[LocalVariableDescriptor]

'calculateAnchor' @ [555:25] ==> private final fun calculateAnchor(commonParent: PsiElement, commonContainer: PsiElement, allReplaces: List<KtExpression>): PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler[SimpleFunctionDescriptorImpl]

'commonParent' @ [555:41] ==> val commonParent: KtElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.doRefactoring.<anonymous>[LocalVariableDescriptor]

'commonContainer' @ [555:55] ==> var commonContainer: KtElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.doRefactoring.<anonymous>[LocalVariableDescriptor]

'allReplaces' @ [555:72] ==> val allReplaces: List<KtExpression> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.doRefactoring.<anonymous>[LocalVariableDescriptor]

'VARIABLES' @ [556:60] ==> enum entry VARIABLES defined in org.jetbrains.kotlin.idea.core.NewDeclarationNameValidator.Target[FakeCallableDescriptorForObject]

'if (componentFunctions.isNotEmpty()) {
                    val collectingValidator = CollectingNameValidator(filter = validator)
                    componentFunctions.map { suggestNamesForComponent(it, project, collectingValidator) }
                }
                else {
                    KotlinNameSuggester.suggestNamesByExpressionAndType(expression,
                                                                        substringInfo?.type,
                                                                        bindingContext,
                                                                        validator,
                                                                        "value").let(::listOf)
                }' @ [559:38] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: List<Collection<String>>, elseBranch: List<Collection<String>>): List<Collection<String>>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> List<Collection<String>>

'componentFunctions' @ [559:42] ==> value-parameter componentFunctions: List<FunctionDescriptor> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.doRefactoring.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'isNotEmpty' @ [559:61] ==> @InlineOnly public inline fun <T> Collection<FunctionDescriptor>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FunctionDescriptor

'CollectingNameValidator' @ [560:47] ==> @JvmOverloads public constructor CollectingNameValidator(existingNames: Collection<String> = ..., filter: (String) -> Boolean = ...) defined in org.jetbrains.kotlin.idea.core.CollectingNameValidator[DeserializedClassConstructorDescriptor]

'validator' @ [560:80] ==> val validator: NewDeclarationNameValidator defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.doRefactoring.<anonymous>.<anonymous>[LocalVariableDescriptor]

'componentFunctions' @ [561:21] ==> value-parameter componentFunctions: List<FunctionDescriptor> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.doRefactoring.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'map' @ [561:40] ==> public inline fun <T, R> Iterable<FunctionDescriptor>.map(transform: (FunctionDescriptor) -> Set<String>): List<Set<String>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FunctionDescriptor
    <R> -> Set<String>

'suggestNamesForComponent' @ [561:46] ==> internal fun suggestNamesForComponent(descriptor: FunctionDescriptor, project: Project, validator: (String) -> Boolean): Set<String> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable in file introduceVariableUtils.kt[SimpleFunctionDescriptorImpl]

'it' @ [561:71] ==> value-parameter it: FunctionDescriptor defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.doRefactoring.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'project' @ [561:75] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.doRefactoring[ValueParameterDescriptorImpl]

'collectingValidator' @ [561:84] ==> val collectingValidator: CollectingNameValidator defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.doRefactoring.<anonymous>.<anonymous>[LocalVariableDescriptor]

'suggestNamesByExpressionAndType' @ [564:41] ==> public final fun suggestNamesByExpressionAndType(expression: KtExpression, type: KotlinType?, bindingContext: BindingContext?, validator: (String) -> Boolean, defaultName: String?): Collection<String> defined in org.jetbrains.kotlin.idea.core.KotlinNameSuggester[DeserializedSimpleFunctionDescriptor]

'expression' @ [564:73] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.doRefactoring[ValueParameterDescriptorImpl]

'substringInfo' @ [565:73] ==> val substringInfo: ExtractableSubstringInfo? defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.doRefactoring[LocalVariableDescriptor]

'type' @ [565:88] ==> public final val type: KotlinType defined in org.jetbrains.kotlin.idea.refactoring.introduce.ExtractableSubstringInfo[DeserializedPropertyDescriptor]

'bindingContext' @ [566:73] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.doRefactoring[ValueParameterDescriptorImpl]

'validator' @ [567:73] ==> val validator: NewDeclarationNameValidator defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.doRefactoring.<anonymous>.<anonymous>[LocalVariableDescriptor]

'let' @ [568:82] ==> @InlineOnly public inline fun <T, R> Collection<String>.let(block: (Collection<String>) -> List<Collection<String>>): List<Collection<String>> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Collection<String>
    <R> -> List<Collection<String>>

'listOf' @ [568:88] ==> public fun <T> listOf(element: Collection<String>): List<Collection<String>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Collection<String>

'IntroduceVariableContext' @ [571:48] ==> public constructor IntroduceVariableContext(expression: KtExpression, nameSuggestions: List<Collection<String>>, allReplaces: List<KtExpression>, commonContainer: PsiElement, commonParent: PsiElement, replaceOccurrence: Boolean, noTypeInference: Boolean, expressionType: KotlinType?, componentFunctions: List<FunctionDescriptor>, bindingContext: BindingContext, resolutionFacade: ResolutionFacade) defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext[ClassConstructorDescriptorImpl]

'expression' @ [572:25] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.doRefactoring[ValueParameterDescriptorImpl]

'suggestedNames' @ [572:37] ==> val suggestedNames: List<Collection<String>> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.doRefactoring.<anonymous>.<anonymous>[LocalVariableDescriptor]

'allReplaces' @ [572:53] ==> val allReplaces: List<KtExpression> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.doRefactoring.<anonymous>[LocalVariableDescriptor]

'commonContainer' @ [572:66] ==> var commonContainer: KtElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.doRefactoring.<anonymous>[LocalVariableDescriptor]

'commonParent' @ [572:83] ==> val commonParent: KtElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.doRefactoring.<anonymous>[LocalVariableDescriptor]

'replaceOccurrence' @ [573:25] ==> val replaceOccurrence: Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.doRefactoring.<anonymous>[LocalVariableDescriptor]

'noTypeInference' @ [573:44] ==> val noTypeInference: Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.doRefactoring[LocalVariableDescriptor]

'expressionType' @ [573:61] ==> val expressionType: KotlinType? defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.doRefactoring[LocalVariableDescriptor]

'componentFunctions' @ [573:77] ==> value-parameter componentFunctions: List<FunctionDescriptor> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.doRefactoring.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'bindingContext' @ [573:97] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.doRefactoring[ValueParameterDescriptorImpl]

'resolutionFacade' @ [573:113] ==> value-parameter resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.doRefactoring[ValueParameterDescriptorImpl]

'project' @ [576:17] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.doRefactoring[ValueParameterDescriptorImpl]

'executeCommand' @ [576:25] ==> public fun <T> Project.executeCommand(name: String, groupId: Any? = ..., command: () -> Unit): Unit defined in org.jetbrains.kotlin.idea.util.application[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit

'INTRODUCE_VARIABLE' @ [576:40] ==> public final val INTRODUCE_VARIABLE: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler[PropertyDescriptorImpl]

'runWriteAction' @ [577:21] ==> public fun <T> runWriteAction(action: () -> Unit): Unit defined in org.jetbrains.kotlin.idea.util.application[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit

'introduceVariableContext' @ [577:38] ==> val introduceVariableContext: KotlinIntroduceVariableHandler.IntroduceVariableContext defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.doRefactoring.<anonymous>.<anonymous>[LocalVariableDescriptor]

'runRefactoring' @ [577:63] ==> public final fun runRefactoring(isVar: Boolean): Unit defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext[SimpleFunctionDescriptorImpl]

'isVar' @ [577:78] ==> value-parameter isVar: Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.doRefactoring[ValueParameterDescriptorImpl]

'introduceVariableContext' @ [579:36] ==> val introduceVariableContext: KotlinIntroduceVariableHandler.IntroduceVariableContext defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.doRefactoring.<anonymous>.<anonymous>[LocalVariableDescriptor]

'propertyRef' @ [579:61] ==> public final var propertyRef: KtDeclaration? defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext[PropertyDescriptorImpl]

'editor' @ [581:25] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.doRefactoring[ValueParameterDescriptorImpl]

'onNonInteractiveFinish' @ [582:25] ==> value-parameter onNonInteractiveFinish: ((KtDeclaration) -> Unit)? defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.doRefactoring[ValueParameterDescriptorImpl]

'invoke' @ [582:49] ==> public abstract operator fun invoke(p1: KtDeclaration): Unit defined in kotlin.Function1[FunctionInvokeDescriptor]

'property' @ [582:56] ==> val property: KtDeclaration defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.doRefactoring.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'editor' @ [586:21] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.doRefactoring[ValueParameterDescriptorImpl]

'caretModel' @ [586:28] ==> public final val Editor.caretModel: CaretModel[MyPropertyDescriptor]

'moveToOffset' @ [586:39] ==> public abstract fun moveToOffset(p0: Int): Unit defined in com.intellij.openapi.editor.CaretModel[JavaMethodDescriptor]

'property' @ [586:52] ==> val property: KtDeclaration defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.doRefactoring.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'textOffset' @ [586:61] ==> public final val KtDeclaration.textOffset: Int[MyPropertyDescriptor]

'editor' @ [587:21] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.doRefactoring[ValueParameterDescriptorImpl]

'selectionModel' @ [587:28] ==> public final val Editor.selectionModel: SelectionModel[MyPropertyDescriptor]

'removeSelection' @ [587:43] ==> public abstract fun removeSelection(): Unit defined in com.intellij.openapi.editor.SelectionModel[JavaMethodDescriptor]

'!' @ [589:25] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isInplaceAvailable' @ [589:26] ==> val isInplaceAvailable: Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.doRefactoring[LocalVariableDescriptor]

'postProcess' @ [590:25] ==> local final fun postProcess(declaration: KtDeclaration): Unit defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.doRefactoring.<anonymous>[SimpleFunctionDescriptorImpl]

'property' @ [590:37] ==> val property: KtDeclaration defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.doRefactoring.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'getInstance' @ [594:40] ==> public open fun getInstance(@NotNull p0: Project): (PsiDocumentManager..PsiDocumentManager?) defined in com.intellij.psi.PsiDocumentManager[JavaMethodDescriptor]

'project' @ [594:52] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.doRefactoring[ValueParameterDescriptorImpl]

'commitDocument' @ [594:61] ==> public abstract fun commitDocument(@NotNull p0: Document): Unit defined in com.intellij.psi.PsiDocumentManager[JavaMethodDescriptor]

'editor' @ [594:76] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.doRefactoring[ValueParameterDescriptorImpl]

'document' @ [594:83] ==> public final val Editor.document: Document[MyPropertyDescriptor]

'getInstance' @ [595:40] ==> public open fun getInstance(@NotNull p0: Project): (PsiDocumentManager..PsiDocumentManager?) defined in com.intellij.psi.PsiDocumentManager[JavaMethodDescriptor]

'project' @ [595:52] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.doRefactoring[ValueParameterDescriptorImpl]

'doPostponedOperationsAndUnblockDocument' @ [595:61] ==> public abstract fun doPostponedOperationsAndUnblockDocument(@NotNull p0: Document): Unit defined in com.intellij.psi.PsiDocumentManager[JavaMethodDescriptor]

'editor' @ [595:101] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.doRefactoring[ValueParameterDescriptorImpl]

'document' @ [595:108] ==> public final val Editor.document: Document[MyPropertyDescriptor]

'when (property) {
                        is KtProperty -> {
                            KotlinVariableInplaceIntroducer(
                                    property,
                                    introduceVariableContext.reference,
                                    introduceVariableContext.references.toTypedArray(),
                                    suggestedNames.single(),
                                    isVar,
                                    /*todo*/ false,
                                    expressionType,
                                    noTypeInference,
                                    project,
                                    editor,
                                    ::postProcess
                            ).startInplaceIntroduceTemplate()
                        }

                        is KtDestructuringDeclaration -> {
                            executeMultiDeclarationTemplate(project, editor, property, suggestedNames, ::postProcess)
                        }

                        else -> throw AssertionError("Unexpected declaration: ${property.getElementTextWithContext()}")
                    }' @ [597:21] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Any, entry1: Any, entry2: Any): Any[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Any

'property' @ [597:27] ==> val property: KtDeclaration defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.doRefactoring.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'KotlinVariableInplaceIntroducer' @ [599:29] ==> public constructor KotlinVariableInplaceIntroducer(addedVariable: KtProperty, originalExpression: KtExpression?, occurrencesToReplace: Array<KtExpression>, suggestedNames: Collection<String>, isVar: Boolean, doNotChangeVar: Boolean, expressionType: KotlinType?, noTypeInference: Boolean, project: Project, editor: Editor, postProcess: (KtDeclaration) -> Unit) defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinVariableInplaceIntroducer[ClassConstructorDescriptorImpl]

'property' @ [600:37] ==> val property: KtDeclaration defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.doRefactoring.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'introduceVariableContext' @ [601:37] ==> val introduceVariableContext: KotlinIntroduceVariableHandler.IntroduceVariableContext defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.doRefactoring.<anonymous>.<anonymous>[LocalVariableDescriptor]

'reference' @ [601:62] ==> public final var reference: KtExpression? defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext[PropertyDescriptorImpl]

'introduceVariableContext' @ [602:37] ==> val introduceVariableContext: KotlinIntroduceVariableHandler.IntroduceVariableContext defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.doRefactoring.<anonymous>.<anonymous>[LocalVariableDescriptor]

'references' @ [602:62] ==> public final val references: ArrayList<KtExpression> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.IntroduceVariableContext[PropertyDescriptorImpl]

'toTypedArray' @ [602:73] ==> public inline fun <reified T> Collection<KtExpression>.toTypedArray(): Array<KtExpression> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> KtExpression

'suggestedNames' @ [603:37] ==> val suggestedNames: List<Collection<String>> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.doRefactoring.<anonymous>.<anonymous>[LocalVariableDescriptor]

'single' @ [603:52] ==> public fun <T> List<Collection<String>>.single(): Collection<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Collection<String>

'isVar' @ [604:37] ==> value-parameter isVar: Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.doRefactoring[ValueParameterDescriptorImpl]

'expressionType' @ [606:37] ==> val expressionType: KotlinType? defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.doRefactoring[LocalVariableDescriptor]

'noTypeInference' @ [607:37] ==> val noTypeInference: Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.doRefactoring[LocalVariableDescriptor]

'project' @ [608:37] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.doRefactoring[ValueParameterDescriptorImpl]

'editor' @ [609:37] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.doRefactoring[ValueParameterDescriptorImpl]

'postProcess' @ [610:39] ==> local final fun postProcess(declaration: KtDeclaration): Unit defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.doRefactoring.<anonymous>[SimpleFunctionDescriptorImpl]

'startInplaceIntroduceTemplate' @ [611:31] ==> public open fun startInplaceIntroduceTemplate(): Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinVariableInplaceIntroducer[JavaMethodDescriptor]

'executeMultiDeclarationTemplate' @ [615:29] ==> private final fun executeMultiDeclarationTemplate(project: Project, editor: Editor, declaration: KtDestructuringDeclaration, suggestedNames: List<Collection<String>>, postProcess: (KtDeclaration) -> Unit): Unit defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler[SimpleFunctionDescriptorImpl]

'project' @ [615:61] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.doRefactoring[ValueParameterDescriptorImpl]

'editor' @ [615:70] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.doRefactoring[ValueParameterDescriptorImpl]

'property' @ [615:78] ==> val property: KtDeclaration defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.doRefactoring.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'suggestedNames' @ [615:88] ==> val suggestedNames: List<Collection<String>> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.doRefactoring.<anonymous>.<anonymous>[LocalVariableDescriptor]

'postProcess' @ [615:106] ==> local final fun postProcess(declaration: KtDeclaration): Unit defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.doRefactoring.<anonymous>[SimpleFunctionDescriptorImpl]

'AssertionError' @ [618:39] ==> public final fun <init>(p0: (Any..Any?)): AssertionError /* = AssertionError */ defined in kotlin.AssertionError[TypeAliasConstructorDescriptorImpl]

'property' @ [618:81] ==> val property: KtDeclaration defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.doRefactoring.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'getElementTextWithContext' @ [618:90] ==> public fun PsiElement.getElementTextWithContext(): String defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'if (isInplaceAvailable && occurrencesToReplace == null) {
            val chooser = object: OccurrencesChooser<KtExpression>(editor) {
                override fun getOccurrenceRange(occurrence: KtExpression): TextRange? {
                    return occurrence.extractableSubstringInfo?.contentRange ?: occurrence.textRange
                }
            }
            chooser.showChooser(expression, allOccurrences, callback)
        }
        else {
            callback.pass(OccurrencesChooser.ReplaceChoice.ALL)
        }' @ [624:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'isInplaceAvailable' @ [624:13] ==> val isInplaceAvailable: Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.doRefactoring[LocalVariableDescriptor]

'occurrencesToReplace' @ [624:35] ==> value-parameter occurrencesToReplace: List<KtExpression>? defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.doRefactoring[ValueParameterDescriptorImpl]

'OccurrencesChooser<KtExpression>' @ [625:35] ==> public constructor OccurrencesChooser<T : (Any..Any?)>(p0: (Editor..Editor?)) defined in com.intellij.refactoring.introduce.inplace.OccurrencesChooser[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> KtExpression

'editor' @ [625:68] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.doRefactoring[ValueParameterDescriptorImpl]

'occurrence' @ [627:28] ==> value-parameter occurrence: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.doRefactoring.<no name provided>.getOccurrenceRange[ValueParameterDescriptorImpl]

'extractableSubstringInfo' @ [627:39] ==> public var KtExpression.extractableSubstringInfo: ExtractableSubstringInfo? defined in org.jetbrains.kotlin.idea.refactoring.introduce[DeserializedPropertyDescriptor]

'contentRange' @ [627:65] ==> public final val contentRange: TextRange defined in org.jetbrains.kotlin.idea.refactoring.introduce.ExtractableSubstringInfo[DeserializedPropertyDescriptor]

'occurrence' @ [627:81] ==> value-parameter occurrence: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.doRefactoring.<no name provided>.getOccurrenceRange[ValueParameterDescriptorImpl]

'textRange' @ [627:92] ==> public final val KtExpression.textRange: (TextRange..TextRange?)[MyPropertyDescriptor]

'chooser' @ [630:13] ==> val chooser: <no name provided> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.doRefactoring[LocalVariableDescriptor]

'showChooser' @ [630:21] ==> public open fun showChooser(p0: (KtExpression..KtExpression?), p1: (MutableList<(KtExpression..KtExpression?)>..List<(KtExpression..KtExpression?)>?), p2: (Pass<(OccurrencesChooser.ReplaceChoice..OccurrencesChooser.ReplaceChoice?)>..Pass<(OccurrencesChooser.ReplaceChoice..OccurrencesChooser.ReplaceChoice?)>?)): Unit defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.doRefactoring.<no name provided>[JavaMethodDescriptor]

'expression' @ [630:33] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.doRefactoring[ValueParameterDescriptorImpl]

'allOccurrences' @ [630:45] ==> val allOccurrences: List<KtExpression> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.doRefactoring[LocalVariableDescriptor]

'callback' @ [630:61] ==> val callback: Pass<OccurrencesChooser.ReplaceChoice> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.doRefactoring[LocalVariableDescriptor]

'callback' @ [633:13] ==> val callback: Pass<OccurrencesChooser.ReplaceChoice> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.doRefactoring[LocalVariableDescriptor]

'pass' @ [633:22] ==> public abstract fun pass(p0: (OccurrencesChooser.ReplaceChoice..OccurrencesChooser.ReplaceChoice?)): Unit defined in com.intellij.openapi.util.Pass[JavaMethodDescriptor]

'ALL' @ [633:60] ==> enum entry ALL defined in com.intellij.refactoring.introduce.inplace.OccurrencesChooser.ReplaceChoice[FakeCallableDescriptorForObject]

'isFunctionalExpression' @ [638:13] ==> public fun PsiElement.isFunctionalExpression(): Boolean defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'parent' @ [639:22] ==> public final val PsiElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'parent' @ [640:16] ==> val parent: KtFunction defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.isFunExpressionOrLambdaBody[LocalVariableDescriptor]

'bodyExpression' @ [640:23] ==> public final val KtFunction.bodyExpression: KtExpression?[MyPropertyDescriptor]

'this' @ [640:41] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.isFunExpressionOrLambdaBody[ReceiverParameterDescriptorImpl]

'parent' @ [640:50] ==> val parent: KtFunction defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.isFunExpressionOrLambdaBody[LocalVariableDescriptor]

'parent' @ [640:81] ==> val parent: KtFunction defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.isFunExpressionOrLambdaBody[LocalVariableDescriptor]

'isFunctionalExpression' @ [640:88] ==> public fun PsiElement.isFunctionalExpression(): Boolean defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'substringContextOrThis' @ [647:34] ==> public val KtExpression.substringContextOrThis: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce[DeserializedPropertyDescriptor]

'extractableSubstringInfo' @ [648:28] ==> public var KtExpression.extractableSubstringInfo: ExtractableSubstringInfo? defined in org.jetbrains.kotlin.idea.refactoring.introduce[DeserializedPropertyDescriptor]

'contentRange' @ [648:54] ==> public final val contentRange: TextRange defined in org.jetbrains.kotlin.idea.refactoring.introduce.ExtractableSubstringInfo[DeserializedPropertyDescriptor]

'physicalExpression' @ [650:20] ==> val physicalExpression: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.getCandidateContainers[LocalVariableDescriptor]

'containingKtFile' @ [650:39] ==> public final val KtExpression.containingKtFile: KtFile[MyPropertyDescriptor]

'physicalExpression' @ [652:26] ==> val physicalExpression: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.getCandidateContainers[LocalVariableDescriptor]

'collectDescendantsOfType' @ [653:18] ==> public inline fun <reified T : PsiElement> PsiElement.collectDescendantsOfType(noinline predicate: (KtReferenceExpression) -> Boolean = ...): List<KtReferenceExpression> defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtReferenceExpression

'contentRange' @ [653:68] ==> val contentRange: TextRange? defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.getCandidateContainers[LocalVariableDescriptor]

'contentRange' @ [653:92] ==> val contentRange: TextRange? defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.getCandidateContainers[LocalVariableDescriptor]

'contains' @ [653:105] ==> public open operator fun contains(@NotNull p0: TextRange): Boolean defined in com.intellij.openapi.util.TextRange[JavaMethodDescriptor]

'it' @ [653:114] ==> value-parameter it: KtReferenceExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.getCandidateContainers.<anonymous>[ValueParameterDescriptorImpl]

'textRange' @ [653:117] ==> public final val KtReferenceExpression.textRange: (TextRange..TextRange?)[MyPropertyDescriptor]

'neighbour' @ [656:25] ==> value-parameter neighbour: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.getCandidateContainers.isResolvableNextTo[ValueParameterDescriptorImpl]

'getResolutionScope' @ [656:35] ==> public fun PsiElement.getResolutionScope(bindingContext: BindingContext, resolutionFacade: ResolutionFacade): LexicalScope defined in org.jetbrains.kotlin.idea.util[DeserializedSimpleFunctionDescriptor]

'originalContext' @ [656:54] ==> value-parameter originalContext: BindingContext defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.getCandidateContainers[ValueParameterDescriptorImpl]

'resolutionFacade' @ [656:71] ==> value-parameter resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.getCandidateContainers[ValueParameterDescriptorImpl]

'physicalExpression' @ [657:30] ==> val physicalExpression: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.getCandidateContainers[LocalVariableDescriptor]

'analyzeInContext' @ [657:49] ==> @JvmOverloads public fun KtExpression.analyzeInContext(scope: LexicalScope, contextExpression: KtExpression = ..., trace: BindingTrace = ..., dataFlowInfo: DataFlowInfo = ..., expectedType: KotlinType = ..., isStatement: Boolean = ..., contextDependency: ContextDependency = ..., expressionTypingServices: ExpressionTypingServices = ...): BindingContext defined in org.jetbrains.kotlin.idea.analysis[DeserializedSimpleFunctionDescriptor]

'scope' @ [657:66] ==> val scope: LexicalScope defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.getCandidateContainers.isResolvableNextTo[LocalVariableDescriptor]

'neighbour' @ [657:73] ==> value-parameter neighbour: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.getCandidateContainers.isResolvableNextTo[ValueParameterDescriptorImpl]

'file' @ [658:27] ==> val file: KtFile defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.getCandidateContainers[LocalVariableDescriptor]

'project' @ [658:32] ==> public final val KtFile.project: Project[MyPropertyDescriptor]

'references' @ [659:20] ==> val references: List<KtReferenceExpression> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.getCandidateContainers[LocalVariableDescriptor]

'all' @ [659:31] ==> public inline fun <T> Iterable<KtReferenceExpression>.all(predicate: (KtReferenceExpression) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtReferenceExpression

'originalContext' @ [660:42] ==> value-parameter originalContext: BindingContext defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.getCandidateContainers[ValueParameterDescriptorImpl]

'REFERENCE_TARGET' @ [660:73] ==> public final val REFERENCE_TARGET: (WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>..WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'it' @ [660:91] ==> value-parameter it: KtReferenceExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.getCandidateContainers.isResolvableNextTo.<anonymous>[ValueParameterDescriptorImpl]

'newContext' @ [661:37] ==> val newContext: BindingContext defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.getCandidateContainers.isResolvableNextTo[LocalVariableDescriptor]

'REFERENCE_TARGET' @ [661:63] ==> public final val REFERENCE_TARGET: (WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>..WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'it' @ [661:81] ==> value-parameter it: KtReferenceExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.getCandidateContainers.isResolvableNextTo.<anonymous>[ValueParameterDescriptorImpl]

'originalDescriptor' @ [663:21] ==> val originalDescriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.getCandidateContainers.isResolvableNextTo.<anonymous>[LocalVariableDescriptor]

'originalContext' @ [664:25] ==> value-parameter originalContext: BindingContext defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.getCandidateContainers[ValueParameterDescriptorImpl]

'AUTO_CREATED_IT' @ [664:56] ==> public final val AUTO_CREATED_IT: (WritableSlice<(ValueParameterDescriptor..ValueParameterDescriptor?), (Boolean..Boolean?)>..WritableSlice<(ValueParameterDescriptor..ValueParameterDescriptor?), (Boolean..Boolean?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'originalDescriptor' @ [664:73] ==> val originalDescriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.getCandidateContainers.isResolvableNextTo.<anonymous>[LocalVariableDescriptor]

'originalDescriptor' @ [665:32] ==> val originalDescriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.getCandidateContainers.isResolvableNextTo.<anonymous>[LocalVariableDescriptor]

'containingDeclaration' @ [665:51] ==> public final val ValueParameterDescriptor.containingDeclaration: CallableDescriptor[MyPropertyDescriptor]

'source' @ [665:73] ==> public final val CallableDescriptor.source: SourceElement[MyPropertyDescriptor]

'getPsi' @ [665:80] ==> public fun SourceElement.getPsi(): PsiElement? defined in org.jetbrains.kotlin.resolve.source[DeserializedSimpleFunctionDescriptor]

'isAncestor' @ [665:89] ==> public fun PsiElement?.isAncestor(element: PsiElement, strict: Boolean = ...): Boolean defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'neighbour' @ [665:100] ==> value-parameter neighbour: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.getCandidateContainers.isResolvableNextTo[ValueParameterDescriptorImpl]

'compareDescriptors' @ [668:17] ==> public fun compareDescriptors(project: Project, currentDescriptor: DeclarationDescriptor?, originalDescriptor: DeclarationDescriptor?): Boolean defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]

'project' @ [668:36] ==> val project: Project defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.getCandidateContainers.isResolvableNextTo[LocalVariableDescriptor]

'newDescriptor' @ [668:45] ==> val newDescriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.getCandidateContainers.isResolvableNextTo.<anonymous>[LocalVariableDescriptor]

'originalDescriptor' @ [668:60] ==> val originalDescriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.getCandidateContainers.isResolvableNextTo.<anonymous>[LocalVariableDescriptor]

'physicalExpression' @ [672:30] ==> val physicalExpression: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.getCandidateContainers[LocalVariableDescriptor]

'getContainer' @ [672:49] ==> private final fun KtElement.getContainer(): KtElement? defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler[SimpleFunctionDescriptorImpl]

'emptyList' @ [672:74] ==> public fun <T> emptyList(): List<Pair<KtElement, KtElement>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<KtElement, KtElement>

'physicalExpression' @ [673:40] ==> val physicalExpression: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.getCandidateContainers[LocalVariableDescriptor]

'getOccurrenceContainer' @ [673:59] ==> private final fun KtExpression.getOccurrenceContainer(): KtElement? defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler[SimpleFunctionDescriptorImpl]

'emptyList' @ [673:94] ==> public fun <T> emptyList(): List<Pair<KtElement, KtElement>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<KtElement, KtElement>

'SmartList' @ [675:26] ==> public constructor SmartList<E : (Any..Any?)>(p0: (KtElement..KtElement?)) defined in com.intellij.util.SmartList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> (org.jetbrains.kotlin.psi.KtElement..org.jetbrains.kotlin.psi.KtElement?)

'firstContainer' @ [675:36] ==> val firstContainer: KtElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.getCandidateContainers[LocalVariableDescriptor]

'SmartList' @ [676:36] ==> public constructor SmartList<E : (Any..Any?)>(p0: (KtElement..KtElement?)) defined in com.intellij.util.SmartList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> (org.jetbrains.kotlin.psi.KtElement..org.jetbrains.kotlin.psi.KtElement?)

'firstOccurrenceContainer' @ [676:46] ==> val firstOccurrenceContainer: KtElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.getCandidateContainers[LocalVariableDescriptor]

'!' @ [678:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'firstContainer' @ [678:14] ==> val firstContainer: KtElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.getCandidateContainers[LocalVariableDescriptor]

'isFunExpressionOrLambdaBody' @ [678:29] ==> private final fun PsiElement.isFunExpressionOrLambdaBody(): Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler[SimpleFunctionDescriptorImpl]

'listOf' @ [678:67] ==> public fun <T> listOf(element: Pair<KtElement, KtElement>): List<Pair<KtElement, KtElement>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<KtElement, KtElement>

'firstContainer' @ [678:74] ==> val firstContainer: KtElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.getCandidateContainers[LocalVariableDescriptor]

'firstOccurrenceContainer' @ [678:92] ==> val firstOccurrenceContainer: KtElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.getCandidateContainers[LocalVariableDescriptor]

'ArrayList' @ [680:36] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> Pair<KtExpression, KtElement>

'apply' @ [680:79] ==> @InlineOnly public inline fun <T> ArrayList<Pair<KtExpression, KtElement>>.apply(block: ArrayList<Pair<KtExpression, KtElement>>.() -> Unit): ArrayList<Pair<KtExpression, KtElement>> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ArrayList<Pair<KtExpression, KtElement>>

'firstContainer' @ [681:29] ==> val firstContainer: KtElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.getCandidateContainers[LocalVariableDescriptor]

'container' @ [683:44] ==> var container: KtElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.getCandidateContainers.<anonymous>[LocalVariableDescriptor]

'getNonStrictParentOfType' @ [683:54] ==> public inline fun <reified T : PsiElement> PsiElement.getNonStrictParentOfType(): KtFunction? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtFunction

'lambda' @ [684:21] ==> var lambda: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.getCandidateContainers.<anonymous>[LocalVariableDescriptor]

'lambda' @ [684:50] ==> var lambda: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.getCandidateContainers.<anonymous>[LocalVariableDescriptor]

'lambda' @ [684:59] ==> var lambda: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.getCandidateContainers.<anonymous>[LocalVariableDescriptor]

'parent' @ [684:66] ==> public final val KtFunctionLiteral.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'!' @ [685:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isResolvableNextTo' @ [685:22] ==> local final fun isResolvableNextTo(neighbour: KtExpression): Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.getCandidateContainers[SimpleFunctionDescriptorImpl]

'lambda' @ [685:41] ==> var lambda: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.getCandidateContainers.<anonymous>[LocalVariableDescriptor]

'container' @ [686:17] ==> var container: KtElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.getCandidateContainers.<anonymous>[LocalVariableDescriptor]

'lambda' @ [686:29] ==> var lambda: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.getCandidateContainers.<anonymous>[LocalVariableDescriptor]

'getContainer' @ [686:36] ==> private final fun KtElement.getContainer(): KtElement? defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler[SimpleFunctionDescriptorImpl]

'add' @ [687:17] ==> public open fun add(element: Pair<KtExpression, KtElement>): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'lambda' @ [687:21] ==> var lambda: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.getCandidateContainers.<anonymous>[LocalVariableDescriptor]

'container' @ [687:31] ==> var container: KtElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.getCandidateContainers.<anonymous>[LocalVariableDescriptor]

'container' @ [688:22] ==> var container: KtElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.getCandidateContainers.<anonymous>[LocalVariableDescriptor]

'isFunExpressionOrLambdaBody' @ [688:32] ==> private final fun PsiElement.isFunExpressionOrLambdaBody(): Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler[SimpleFunctionDescriptorImpl]

'lambdasAndContainers' @ [691:9] ==> val lambdasAndContainers: ArrayList<Pair<KtExpression, KtElement>> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.getCandidateContainers[LocalVariableDescriptor]

'mapTo' @ [691:30] ==> public inline fun <T, R, C : MutableCollection<in KtElement>> Iterable<Pair<KtExpression, KtElement>>.mapTo(destination: SmartList<(KtElement..KtElement?)>, transform: (Pair<KtExpression, KtElement>) -> KtElement): SmartList<(KtElement..KtElement?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<KtExpression, KtElement>
    <R> -> KtElement
    <C : MutableCollection<in R>> -> SmartList<(org.jetbrains.kotlin.psi.KtElement..org.jetbrains.kotlin.psi.KtElement?)>

'containers' @ [691:36] ==> val containers: SmartList<(KtElement..KtElement?)> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.getCandidateContainers[LocalVariableDescriptor]

'it' @ [691:50] ==> value-parameter it: Pair<KtExpression, KtElement> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.getCandidateContainers.<anonymous>[ValueParameterDescriptorImpl]

'second' @ [691:53] ==> public final val second: KtElement defined in kotlin.Pair[DeserializedPropertyDescriptor]

'lambdasAndContainers' @ [692:9] ==> val lambdasAndContainers: ArrayList<Pair<KtExpression, KtElement>> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.getCandidateContainers[LocalVariableDescriptor]

'mapTo' @ [692:30] ==> public inline fun <T, R, C : MutableCollection<in KtElement?>> Iterable<Pair<KtExpression, KtElement>>.mapTo(destination: SmartList<(KtElement..KtElement?)>, transform: (Pair<KtExpression, KtElement>) -> KtElement?): SmartList<(KtElement..KtElement?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<KtExpression, KtElement>
    <R> -> KtElement?
    <C : MutableCollection<in R>> -> SmartList<(org.jetbrains.kotlin.psi.KtElement..org.jetbrains.kotlin.psi.KtElement?)>

'occurrenceContainers' @ [692:36] ==> val occurrenceContainers: SmartList<(KtElement..KtElement?)> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.getCandidateContainers[LocalVariableDescriptor]

'it' @ [692:60] ==> value-parameter it: Pair<KtExpression, KtElement> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.getCandidateContainers.<anonymous>[ValueParameterDescriptorImpl]

'first' @ [692:63] ==> public final val first: KtExpression defined in kotlin.Pair[DeserializedPropertyDescriptor]

'getOccurrenceContainer' @ [692:69] ==> private final fun KtExpression.getOccurrenceContainer(): KtElement? defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler[SimpleFunctionDescriptorImpl]

'ArrayList' @ [693:16] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> Pair<KtElement, KtElement>

'apply' @ [693:56] ==> @InlineOnly public inline fun <T> ArrayList<Pair<KtElement, KtElement>>.apply(block: ArrayList<Pair<KtElement, KtElement>>.() -> Unit): ArrayList<Pair<KtElement, KtElement>> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ArrayList<Pair<KtElement, KtElement>>

'component1' @ [694:19] ==> public final operator fun component1(): (KtElement..KtElement?) defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [694:30] ==> public final operator fun component2(): (KtElement..KtElement?) defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'iterator' @ [694:54] ==> public abstract fun iterator(): Iterator<Pair<(KtElement..KtElement?), (KtElement..KtElement?)>> defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'containers' @ [694:55] ==> val containers: SmartList<(KtElement..KtElement?)> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.getCandidateContainers[LocalVariableDescriptor]

'occurrenceContainers' @ [694:70] ==> val occurrenceContainers: SmartList<(KtElement..KtElement?)> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.getCandidateContainers[LocalVariableDescriptor]

'occurrenceContainer' @ [695:21] ==> val occurrenceContainer: (KtElement..KtElement?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.getCandidateContainers.<anonymous>[LocalVariableDescriptor]

'add' @ [696:17] ==> public open fun add(element: Pair<KtElement, KtElement>): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'container' @ [696:21] ==> val container: (KtElement..KtElement?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.getCandidateContainers.<anonymous>[LocalVariableDescriptor]

'occurrenceContainer' @ [696:34] ==> val occurrenceContainer: (KtElement..KtElement?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.getCandidateContainers.<anonymous>[LocalVariableDescriptor]

'expressionToExtract' @ [709:26] ==> value-parameter expressionToExtract: KtExpression? defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.doRefactoring[ValueParameterDescriptorImpl]

'let' @ [709:47] ==> @InlineOnly public inline fun <T, R> KtExpression.let(block: (KtExpression) -> KtExpression): KtExpression defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression
    <R> -> KtExpression

'safeDeparenthesize' @ [709:63] ==> @NotNull public open fun safeDeparenthesize(@NotNull p0: KtExpression): KtExpression defined in org.jetbrains.kotlin.psi.KtPsiUtil[JavaMethodDescriptor]

'it' @ [709:82] ==> value-parameter it: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.doRefactoring.<anonymous>[ValueParameterDescriptorImpl]

'showErrorHint' @ [710:36] ==> private final fun showErrorHint(project: Project, editor: Editor?, message: String): Unit defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler[SimpleFunctionDescriptorImpl]

'project' @ [710:50] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.doRefactoring[ValueParameterDescriptorImpl]

'editor' @ [710:59] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.doRefactoring[ValueParameterDescriptorImpl]

'message' @ [710:91] ==> @NotNull public open fun message(@NonNls @PropertyKey key: (String..String?), vararg params: (Any..Any?)): String defined in org.jetbrains.kotlin.idea.refactoring.KotlinRefactoringBundle[JavaMethodDescriptor]

'expression' @ [712:13] ==> val expression: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.doRefactoring[LocalVariableDescriptor]

'isAssignmentLHS' @ [712:24] ==> private final fun PsiElement.isAssignmentLHS(): Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler[SimpleFunctionDescriptorImpl]

'showErrorHint' @ [713:20] ==> private final fun showErrorHint(project: Project, editor: Editor?, message: String): Unit defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler[SimpleFunctionDescriptorImpl]

'project' @ [713:34] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.doRefactoring[ValueParameterDescriptorImpl]

'editor' @ [713:43] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.doRefactoring[ValueParameterDescriptorImpl]

'message' @ [713:75] ==> @NotNull public open fun message(@NonNls @PropertyKey key: (String..String?), vararg params: (Any..Any?)): String defined in org.jetbrains.kotlin.idea.refactoring.KotlinRefactoringBundle[JavaMethodDescriptor]

'expression' @ [716:34] ==> val expression: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.doRefactoring[LocalVariableDescriptor]

'substringContextOrThis' @ [716:45] ==> public val KtExpression.substringContextOrThis: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce[DeserializedPropertyDescriptor]

'physicalExpression' @ [718:32] ==> val physicalExpression: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.doRefactoring[LocalVariableDescriptor]

'getResolutionFacade' @ [718:51] ==> public fun KtElement.getResolutionFacade(): ResolutionFacade defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'resolutionFacade' @ [719:30] ==> val resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.doRefactoring[LocalVariableDescriptor]

'analyze' @ [719:47] ==> public abstract fun analyze(element: KtElement, bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.resolve.ResolutionFacade[DeserializedSimpleFunctionDescriptor]

'physicalExpression' @ [719:55] ==> val physicalExpression: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.doRefactoring[LocalVariableDescriptor]

'FULL' @ [719:91] ==> enum entry FULL defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'doRefactoring' @ [722:13] ==> private final fun doRefactoring(project: Project, editor: Editor?, expression: KtExpression, container: KtElement, occurrenceContainer: KtElement, resolutionFacade: ResolutionFacade, bindingContext: BindingContext, isVar: Boolean, occurrencesToReplace: List<KtExpression>?, onNonInteractiveFinish: ((KtDeclaration) -> Unit)?): Unit defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler[SimpleFunctionDescriptorImpl]

'project' @ [723:21] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.doRefactoring[ValueParameterDescriptorImpl]

'editor' @ [723:30] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.doRefactoring[ValueParameterDescriptorImpl]

'expression' @ [723:38] ==> val expression: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.doRefactoring[LocalVariableDescriptor]

'container' @ [723:50] ==> value-parameter container: KtElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.doRefactoring.runWithChosenContainers[ValueParameterDescriptorImpl]

'occurrenceContainer' @ [723:61] ==> value-parameter occurrenceContainer: KtElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.doRefactoring.runWithChosenContainers[ValueParameterDescriptorImpl]

'resolutionFacade' @ [723:82] ==> val resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.doRefactoring[LocalVariableDescriptor]

'bindingContext' @ [723:100] ==> val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.doRefactoring[LocalVariableDescriptor]

'isVar' @ [724:21] ==> value-parameter isVar: Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.doRefactoring[ValueParameterDescriptorImpl]

'occurrencesToReplace' @ [724:28] ==> value-parameter occurrencesToReplace: List<KtExpression>? defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.doRefactoring[ValueParameterDescriptorImpl]

'onNonInteractiveFinish' @ [724:50] ==> value-parameter onNonInteractiveFinish: ((KtDeclaration) -> Unit)? defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.doRefactoring[ValueParameterDescriptorImpl]

'expression' @ [728:35] ==> val expression: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.doRefactoring[LocalVariableDescriptor]

'getCandidateContainers' @ [728:46] ==> private final fun KtExpression.getCandidateContainers(resolutionFacade: ResolutionFacade, originalContext: BindingContext): List<Pair<KtElement, KtElement>> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler[SimpleFunctionDescriptorImpl]

'resolutionFacade' @ [728:69] ==> val resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.doRefactoring[LocalVariableDescriptor]

'bindingContext' @ [728:87] ==> val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.doRefactoring[LocalVariableDescriptor]

'ifEmpty' @ [728:103] ==> public inline fun <T, C : Collection<Pair<KtElement, KtElement>>> List<Pair<KtElement, KtElement>>.ifEmpty(body: () -> List<Pair<KtElement, KtElement>>): List<Pair<KtElement, KtElement>> defined in org.jetbrains.kotlin.utils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<KtElement, KtElement>
    <C : Collection<T>> -> List<Pair<KtElement, KtElement>>

'showErrorHint' @ [729:20] ==> private final fun showErrorHint(project: Project, editor: Editor?, message: String): Unit defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler[SimpleFunctionDescriptorImpl]

'project' @ [729:34] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.doRefactoring[ValueParameterDescriptorImpl]

'editor' @ [729:43] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.doRefactoring[ValueParameterDescriptorImpl]

'message' @ [729:75] ==> @NotNull public open fun message(@NonNls @PropertyKey key: (String..String?), vararg params: (Any..Any?)): String defined in org.jetbrains.kotlin.idea.refactoring.KotlinRefactoringBundle[JavaMethodDescriptor]

'editor' @ [732:13] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.doRefactoring[ValueParameterDescriptorImpl]

'candidateContainers' @ [733:20] ==> val candidateContainers: List<Pair<KtElement, KtElement>> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.doRefactoring[LocalVariableDescriptor]

'first' @ [733:40] ==> public fun <T> List<Pair<KtElement, KtElement>>.first(): Pair<KtElement, KtElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<KtElement, KtElement>

'let' @ [733:48] ==> @InlineOnly public inline fun <T, R> Pair<KtElement, KtElement>.let(block: (Pair<KtElement, KtElement>) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<KtElement, KtElement>
    <R> -> Unit

'runWithChosenContainers' @ [733:54] ==> local final fun runWithChosenContainers(container: KtElement, occurrenceContainer: KtElement): Unit defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.doRefactoring[SimpleFunctionDescriptorImpl]

'it' @ [733:78] ==> value-parameter it: Pair<KtElement, KtElement> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.doRefactoring.<anonymous>[ValueParameterDescriptorImpl]

'first' @ [733:81] ==> public final val first: KtElement defined in kotlin.Pair[DeserializedPropertyDescriptor]

'it' @ [733:88] ==> value-parameter it: Pair<KtElement, KtElement> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.doRefactoring.<anonymous>[ValueParameterDescriptorImpl]

'second' @ [733:91] ==> public final val second: KtElement defined in kotlin.Pair[DeserializedPropertyDescriptor]

'getApplication' @ [736:32] ==> public open fun getApplication(): (Application..Application?) defined in com.intellij.openapi.application.ApplicationManager[JavaMethodDescriptor]

'isUnitTestMode' @ [736:49] ==> public final val Application.isUnitTestMode: Boolean[MyPropertyDescriptor]

'candidateContainers' @ [737:20] ==> val candidateContainers: List<Pair<KtElement, KtElement>> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.doRefactoring[LocalVariableDescriptor]

'last' @ [737:40] ==> public fun <T> List<Pair<KtElement, KtElement>>.last(): Pair<KtElement, KtElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<KtElement, KtElement>

'let' @ [737:47] ==> @InlineOnly public inline fun <T, R> Pair<KtElement, KtElement>.let(block: (Pair<KtElement, KtElement>) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<KtElement, KtElement>
    <R> -> Unit

'runWithChosenContainers' @ [737:53] ==> local final fun runWithChosenContainers(container: KtElement, occurrenceContainer: KtElement): Unit defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.doRefactoring[SimpleFunctionDescriptorImpl]

'it' @ [737:77] ==> value-parameter it: Pair<KtElement, KtElement> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.doRefactoring.<anonymous>[ValueParameterDescriptorImpl]

'first' @ [737:80] ==> public final val first: KtElement defined in kotlin.Pair[DeserializedPropertyDescriptor]

'it' @ [737:87] ==> value-parameter it: Pair<KtElement, KtElement> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.doRefactoring.<anonymous>[ValueParameterDescriptorImpl]

'second' @ [737:90] ==> public final val second: KtElement defined in kotlin.Pair[DeserializedPropertyDescriptor]

'chooseContainerElementIfNecessary' @ [740:9] ==> public fun <T> chooseContainerElementIfNecessary(containers: List<Pair<KtElement, KtElement>>, editor: Editor, title: String, highlightSelection: Boolean, toPsi: (Pair<KtElement, KtElement>) -> PsiElement, onSelect: (Pair<KtElement, KtElement>) -> Unit): Unit defined in org.jetbrains.kotlin.idea.refactoring[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Pair<KtElement, KtElement>

'candidateContainers' @ [740:43] ==> val candidateContainers: List<Pair<KtElement, KtElement>> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.doRefactoring[LocalVariableDescriptor]

'editor' @ [740:64] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.doRefactoring[ValueParameterDescriptorImpl]

'it' @ [740:108] ==> value-parameter it: Pair<KtElement, KtElement> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.doRefactoring.<anonymous>[ValueParameterDescriptorImpl]

'first' @ [740:111] ==> public final val first: KtElement defined in kotlin.Pair[DeserializedPropertyDescriptor]

'runWithChosenContainers' @ [741:13] ==> local final fun runWithChosenContainers(container: KtElement, occurrenceContainer: KtElement): Unit defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.doRefactoring[SimpleFunctionDescriptorImpl]

'it' @ [741:37] ==> value-parameter it: Pair<KtElement, KtElement> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.doRefactoring.<anonymous>[ValueParameterDescriptorImpl]

'first' @ [741:40] ==> public final val first: KtElement defined in kotlin.Pair[DeserializedPropertyDescriptor]

'it' @ [741:47] ==> value-parameter it: Pair<KtElement, KtElement> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.doRefactoring.<anonymous>[ValueParameterDescriptorImpl]

'second' @ [741:50] ==> public final val second: KtElement defined in kotlin.Pair[DeserializedPropertyDescriptor]

'file' @ [746:13] ==> value-parameter file: PsiFile defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.invoke[ValueParameterDescriptorImpl]

'selectElement' @ [749:13] ==> @Throws public fun selectElement(editor: Editor, file: KtFile, elementKinds: Collection<CodeInsightUtils.ElementKind>, callback: (PsiElement?) -> Unit): Unit defined in org.jetbrains.kotlin.idea.refactoring in file elementSelectionUtils.kt[SimpleFunctionDescriptorImpl]

'editor' @ [749:27] ==> value-parameter editor: Editor defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.invoke[ValueParameterDescriptorImpl]

'file' @ [749:35] ==> value-parameter file: PsiFile defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.invoke[ValueParameterDescriptorImpl]

'listOf' @ [749:41] ==> public fun <T> listOf(element: CodeInsightUtils.ElementKind): List<CodeInsightUtils.ElementKind> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ElementKind

'EXPRESSION' @ [749:77] ==> enum entry EXPRESSION defined in org.jetbrains.kotlin.idea.codeInsight.CodeInsightUtils.ElementKind[FakeCallableDescriptorForObject]

'doRefactoring' @ [750:17] ==> public final fun doRefactoring(project: Project, editor: Editor?, expressionToExtract: KtExpression?, isVar: Boolean, occurrencesToReplace: List<KtExpression>?, onNonInteractiveFinish: ((KtDeclaration) -> Unit)?): Unit defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler[SimpleFunctionDescriptorImpl]

'project' @ [750:31] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.invoke[ValueParameterDescriptorImpl]

'editor' @ [750:40] ==> value-parameter editor: Editor defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.invoke[ValueParameterDescriptorImpl]

'it' @ [750:48] ==> value-parameter it: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.invoke.<anonymous>[ValueParameterDescriptorImpl]

'showErrorHint' @ [754:13] ==> private final fun showErrorHint(project: Project, editor: Editor?, message: String): Unit defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler[SimpleFunctionDescriptorImpl]

'project' @ [754:27] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.invoke[ValueParameterDescriptorImpl]

'editor' @ [754:36] ==> value-parameter editor: Editor defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.invoke[ValueParameterDescriptorImpl]

'e' @ [754:44] ==> val e: IntroduceRefactoringException defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler.invoke[LocalVariableDescriptor]

'message' @ [754:46] ==> public open val message: String? defined in org.jetbrains.kotlin.idea.refactoring.IntroduceRefactoringException[DeserializedPropertyDescriptor]

