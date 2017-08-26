'getParametersToRemove' @ [78:51] ==> public fun getParametersToRemove(withDefaultValue: Boolean, parametersUsages: MultiMap<KtElement, KtElement>, occurrencesToReplace: List<KotlinPsiRange>): List<KtElement> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter in file KotlinIntroduceParameterHandler.kt[SimpleFunctionDescriptorImpl]

'withDefaultValue' @ [78:73] ==> value-parameter withDefaultValue: Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.IntroduceParameterDescriptor.<init>[ValueParameterDescriptorImpl]

'parametersUsages' @ [78:91] ==> value-parameter parametersUsages: MultiMap<KtElement, KtElement> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.IntroduceParameterDescriptor.<init>[ValueParameterDescriptorImpl]

'occurrencesToReplace' @ [78:109] ==> value-parameter occurrencesToReplace: List<KotlinPsiRange> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.IntroduceParameterDescriptor.<init>[ValueParameterDescriptorImpl]

'getValue' @ [81:43] ==> @InlineOnly public operator inline fun <T> Lazy<T>.getValue(thisRef: Any?, property: KProperty<*>): T defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'if (argumentValue.mustBeParenthesizedInInitializerPosition()) {
            KtPsiFactory(callable).createExpressionByPattern("($0)", argumentValue)
        }
        else {
            argumentValue
        }' @ [82:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KtExpression, elseBranch: KtExpression): KtExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KtExpression

'argumentValue' @ [82:13] ==> public final val argumentValue: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.IntroduceParameterDescriptor[PropertyDescriptorImpl]

'mustBeParenthesizedInInitializerPosition' @ [82:27] ==> public fun KtExpression.mustBeParenthesizedInInitializerPosition(): Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce in file introduceUtil.kt[SimpleFunctionDescriptorImpl]

'KtPsiFactory' @ [83:13] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'callable' @ [83:26] ==> public final val callable: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.IntroduceParameterDescriptor[PropertyDescriptorImpl]

'createExpressionByPattern' @ [83:36] ==> public fun KtPsiFactory.createExpressionByPattern(pattern: String, vararg args: Any, reformat: Boolean = ...): KtExpression defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'argumentValue' @ [83:70] ==> public final val argumentValue: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.IntroduceParameterDescriptor[PropertyDescriptorImpl]

'argumentValue' @ [86:13] ==> public final val argumentValue: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.IntroduceParameterDescriptor[PropertyDescriptorImpl]

'occurrencesToReplace' @ [91:17] ==> public final val occurrencesToReplace: List<KotlinPsiRange> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.IntroduceParameterDescriptor[PropertyDescriptorImpl]

'first' @ [91:38] ==> public inline fun <T> Iterable<KotlinPsiRange>.first(predicate: (KotlinPsiRange) -> Boolean): KotlinPsiRange defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinPsiRange

'it' @ [91:46] ==> value-parameter it: KotlinPsiRange defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.IntroduceParameterDescriptor.<get-originalOccurrence>.<anonymous>[ValueParameterDescriptorImpl]

'getTextRange' @ [91:49] ==> public abstract fun getTextRange(): TextRange defined in org.jetbrains.kotlin.idea.util.psi.patternMatching.KotlinPsiRange[DeserializedSimpleFunctionDescriptor]

'intersects' @ [91:64] ==> public open fun intersects(@NotNull p0: TextRange): Boolean defined in com.intellij.openapi.util.TextRange[JavaMethodDescriptor]

'originalRange' @ [91:75] ==> public final val originalRange: KotlinPsiRange defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.IntroduceParameterDescriptor[PropertyDescriptorImpl]

'getTextRange' @ [91:89] ==> public abstract fun getTextRange(): TextRange defined in org.jetbrains.kotlin.idea.util.psi.patternMatching.KotlinPsiRange[DeserializedSimpleFunctionDescriptor]

'valVar' @ [95:9] ==> public final val valVar: KotlinValVar defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.IntroduceParameterDescriptor[PropertyDescriptorImpl]

'if (callable is KtClass) {
            val modifierIsUnnecessary: (PsiElement) -> Boolean = {
                when {
                    it.parent != callable.getBody() ->
                        false
                    it is KtAnonymousInitializer ->
                        true
                    it is KtProperty && it.initializer?.textRange?.intersects(originalRange.getTextRange()) ?: false ->
                        true
                    else ->
                        false
                }
            }
            if (occurrencesToReplace.all {
                PsiTreeUtil.findCommonParent(it.elements)?.parentsWithSelf?.any(modifierIsUnnecessary) ?: false
            }) KotlinValVar.None else KotlinValVar.Val
        }
        else KotlinValVar.None' @ [95:18] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KotlinValVar, elseBranch: KotlinValVar): KotlinValVar[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KotlinValVar

'callable' @ [95:22] ==> public final val callable: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.IntroduceParameterDescriptor[PropertyDescriptorImpl]

'when {
                    it.parent != callable.getBody() ->
                        false
                    it is KtAnonymousInitializer ->
                        true
                    it is KtProperty && it.initializer?.textRange?.intersects(originalRange.getTextRange()) ?: false ->
                        true
                    else ->
                        false
                }' @ [97:17] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean, entry2: Boolean, entry3: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'it' @ [98:21] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.IntroduceParameterDescriptor.<init>.<anonymous>[ValueParameterDescriptorImpl]

'parent' @ [98:24] ==> public final val PsiElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'callable' @ [98:34] ==> public final val callable: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.IntroduceParameterDescriptor[PropertyDescriptorImpl]

'getBody' @ [98:43] ==> public final fun getBody(): KtClassBody? defined in org.jetbrains.kotlin.psi.KtClass[DeserializedSimpleFunctionDescriptor]

'it' @ [100:21] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.IntroduceParameterDescriptor.<init>.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [102:21] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.IntroduceParameterDescriptor.<init>.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [102:41] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.IntroduceParameterDescriptor.<init>.<anonymous>[ValueParameterDescriptorImpl]

'initializer' @ [102:44] ==> public final var KtProperty.initializer: KtExpression?[MyPropertyDescriptor]

'textRange' @ [102:57] ==> public final val KtExpression.textRange: (TextRange..TextRange?)[MyPropertyDescriptor]

'intersects' @ [102:68] ==> public open fun intersects(@NotNull p0: TextRange): Boolean defined in com.intellij.openapi.util.TextRange[JavaMethodDescriptor]

'originalRange' @ [102:79] ==> public final val originalRange: KotlinPsiRange defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.IntroduceParameterDescriptor[PropertyDescriptorImpl]

'getTextRange' @ [102:93] ==> public abstract fun getTextRange(): TextRange defined in org.jetbrains.kotlin.idea.util.psi.patternMatching.KotlinPsiRange[DeserializedSimpleFunctionDescriptor]

'if (occurrencesToReplace.all {
                PsiTreeUtil.findCommonParent(it.elements)?.parentsWithSelf?.any(modifierIsUnnecessary) ?: false
            }) KotlinValVar.None else KotlinValVar.Val' @ [108:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KotlinValVar, elseBranch: KotlinValVar): KotlinValVar[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KotlinValVar

'occurrencesToReplace' @ [108:17] ==> public final val occurrencesToReplace: List<KotlinPsiRange> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.IntroduceParameterDescriptor[PropertyDescriptorImpl]

'all' @ [108:38] ==> public inline fun <T> Iterable<KotlinPsiRange>.all(predicate: (KotlinPsiRange) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinPsiRange

'?:' @ [109:17] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: Boolean?, right: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> Boolean

'findCommonParent' @ [109:29] ==> @Nullable public open fun findCommonParent(@NotNull p0: (MutableList<out (PsiElement..PsiElement?)>..List<(PsiElement..PsiElement?)>)): PsiElement? defined in com.intellij.psi.util.PsiTreeUtil[JavaMethodDescriptor]

'it' @ [109:46] ==> value-parameter it: KotlinPsiRange defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.IntroduceParameterDescriptor.<init>.<anonymous>[ValueParameterDescriptorImpl]

'elements' @ [109:49] ==> public abstract val elements: List<PsiElement> defined in org.jetbrains.kotlin.idea.util.psi.patternMatching.KotlinPsiRange[DeserializedPropertyDescriptor]

'parentsWithSelf' @ [109:60] ==> public val PsiElement.parentsWithSelf: Sequence<PsiElement> defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'any' @ [109:77] ==> public inline fun <T> Sequence<PsiElement>.any(predicate: (PsiElement) -> Boolean): Boolean defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'modifierIsUnnecessary' @ [109:81] ==> val modifierIsUnnecessary: (PsiElement) -> Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.IntroduceParameterDescriptor.<init>[LocalVariableDescriptor]

'None' @ [110:29] ==> enum entry None defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinValVar[FakeCallableDescriptorForObject]

'Val' @ [110:52] ==> enum entry Val defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinValVar[FakeCallableDescriptorForObject]

'None' @ [112:27] ==> enum entry None defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinValVar[FakeCallableDescriptorForObject]

'withDefaultValue' @ [121:9] ==> value-parameter withDefaultValue: Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.getParametersToRemove[ValueParameterDescriptorImpl]

'emptyList' @ [121:46] ==> public final fun <T : (Any..Any?)> emptyList(): (MutableList<(KtElement..KtElement?)>..List<(KtElement..KtElement?)>?) defined in java.util.Collections[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (org.jetbrains.kotlin.psi.KtElement..org.jetbrains.kotlin.psi.KtElement?)

'occurrencesToReplace' @ [123:28] ==> value-parameter occurrencesToReplace: List<KotlinPsiRange> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.getParametersToRemove[ValueParameterDescriptorImpl]

'map' @ [123:49] ==> public inline fun <T, R> Iterable<KotlinPsiRange>.map(transform: (KotlinPsiRange) -> TextRange): List<TextRange> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinPsiRange
    <R> -> TextRange

'it' @ [123:55] ==> value-parameter it: KotlinPsiRange defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.getParametersToRemove.<anonymous>[ValueParameterDescriptorImpl]

'getTextRange' @ [123:58] ==> public abstract fun getTextRange(): TextRange defined in org.jetbrains.kotlin.idea.util.psi.patternMatching.KotlinPsiRange[DeserializedSimpleFunctionDescriptor]

'parametersUsages' @ [124:12] ==> value-parameter parametersUsages: MultiMap<KtElement, KtElement> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.getParametersToRemove[ValueParameterDescriptorImpl]

'entrySet' @ [124:29] ==> @NotNull public open fun entrySet(): (MutableSet<(MutableMap.MutableEntry<(KtElement..KtElement?), (MutableCollection<(KtElement..KtElement?)>..Collection<(KtElement..KtElement?)>?)>..Map.Entry<(KtElement..KtElement?), (MutableCollection<(KtElement..KtElement?)>..Collection<(KtElement..KtElement?)>?)>?)>..Set<(MutableMap.MutableEntry<(KtElement..KtElement?), (MutableCollection<(KtElement..KtElement?)>..Collection<(KtElement..KtElement?)>?)>..Map.Entry<(KtElement..KtElement?), (MutableCollection<(KtElement..KtElement?)>..Collection<(KtElement..KtElement?)>?)>?)>) defined in com.intellij.util.containers.MultiMap[JavaMethodDescriptor]

'filter' @ [125:14] ==> public inline fun <T> Iterable<(MutableMap.MutableEntry<(KtElement..KtElement?), (MutableCollection<(KtElement..KtElement?)>..Collection<(KtElement..KtElement?)>?)>..Map.Entry<(KtElement..KtElement?), (MutableCollection<(KtElement..KtElement?)>..Collection<(KtElement..KtElement?)>?)>?)>.filter(predicate: ((MutableMap.MutableEntry<(KtElement..KtElement?), (MutableCollection<(KtElement..KtElement?)>..Collection<(KtElement..KtElement?)>?)>..Map.Entry<(KtElement..KtElement?), (MutableCollection<(KtElement..KtElement?)>..Collection<(KtElement..KtElement?)>?)>?)) -> Boolean): List<(MutableMap.MutableEntry<(KtElement..KtElement?), (MutableCollection<(KtElement..KtElement?)>..Collection<(KtElement..KtElement?)>?)>..Map.Entry<(KtElement..KtElement?), (MutableCollection<(KtElement..KtElement?)>..Collection<(KtElement..KtElement?)>?)>?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.collections.MutableMap.MutableEntry<(org.jetbrains.kotlin.psi.KtElement..org.jetbrains.kotlin.psi.KtElement?), (kotlin.collections.MutableCollection<(org.jetbrains.kotlin.psi.KtElement..org.jetbrains.kotlin.psi.KtElement?)>..kotlin.collections.Collection<(org.jetbrains.kotlin.psi.KtElement..org.jetbrains.kotlin.psi.KtElement?)>?)>..kotlin.collections.Map.Entry<(org.jetbrains.kotlin.psi.KtElement..org.jetbrains.kotlin.psi.KtElement?), (kotlin.collections.MutableCollection<(org.jetbrains.kotlin.psi.KtElement..org.jetbrains.kotlin.psi.KtElement?)>..kotlin.collections.Collection<(org.jetbrains.kotlin.psi.KtElement..org.jetbrains.kotlin.psi.KtElement?)>?)>?)

'it' @ [126:17] ==> value-parameter it: (MutableMap.MutableEntry<(KtElement..KtElement?), (MutableCollection<(KtElement..KtElement?)>..Collection<(KtElement..KtElement?)>?)>..Map.Entry<(KtElement..KtElement?), (MutableCollection<(KtElement..KtElement?)>..Collection<(KtElement..KtElement?)>?)>?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.getParametersToRemove.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [126:20] ==> public abstract val value: (MutableCollection<(KtElement..KtElement?)>..Collection<(KtElement..KtElement?)>?) defined in kotlin.collections.MutableMap.MutableEntry[DeserializedPropertyDescriptor]

'all' @ [126:26] ==> public inline fun <T> Iterable<(KtElement..KtElement?)>.all(predicate: ((KtElement..KtElement?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtElement..org.jetbrains.kotlin.psi.KtElement?)

'occurrenceRanges' @ [127:21] ==> val occurrenceRanges: List<TextRange> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.getParametersToRemove[LocalVariableDescriptor]

'any' @ [127:38] ==> public inline fun <T> Iterable<TextRange>.any(predicate: (TextRange) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TextRange

'occurrenceRange' @ [127:63] ==> value-parameter occurrenceRange: TextRange defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.getParametersToRemove.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'contains' @ [127:79] ==> public open operator fun contains(@NotNull p0: TextRange): Boolean defined in com.intellij.openapi.util.TextRange[JavaMethodDescriptor]

'paramUsage' @ [127:88] ==> value-parameter paramUsage: (KtElement..KtElement?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.getParametersToRemove.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'textRange' @ [127:99] ==> public final val KtElement.textRange: (TextRange..TextRange?)[MyPropertyDescriptor]

'map' @ [130:14] ==> public inline fun <T, R> Iterable<(MutableMap.MutableEntry<(KtElement..KtElement?), (MutableCollection<(KtElement..KtElement?)>..Collection<(KtElement..KtElement?)>?)>..Map.Entry<(KtElement..KtElement?), (MutableCollection<(KtElement..KtElement?)>..Collection<(KtElement..KtElement?)>?)>?)>.map(transform: ((MutableMap.MutableEntry<(KtElement..KtElement?), (MutableCollection<(KtElement..KtElement?)>..Collection<(KtElement..KtElement?)>?)>..Map.Entry<(KtElement..KtElement?), (MutableCollection<(KtElement..KtElement?)>..Collection<(KtElement..KtElement?)>?)>?)) -> (KtElement..KtElement?)): List<(KtElement..KtElement?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.collections.MutableMap.MutableEntry<(org.jetbrains.kotlin.psi.KtElement..org.jetbrains.kotlin.psi.KtElement?), (kotlin.collections.MutableCollection<(org.jetbrains.kotlin.psi.KtElement..org.jetbrains.kotlin.psi.KtElement?)>..kotlin.collections.Collection<(org.jetbrains.kotlin.psi.KtElement..org.jetbrains.kotlin.psi.KtElement?)>?)>..kotlin.collections.Map.Entry<(org.jetbrains.kotlin.psi.KtElement..org.jetbrains.kotlin.psi.KtElement?), (kotlin.collections.MutableCollection<(org.jetbrains.kotlin.psi.KtElement..org.jetbrains.kotlin.psi.KtElement?)>..kotlin.collections.Collection<(org.jetbrains.kotlin.psi.KtElement..org.jetbrains.kotlin.psi.KtElement?)>?)>?)
    <R> -> (org.jetbrains.kotlin.psi.KtElement..org.jetbrains.kotlin.psi.KtElement?)

'it' @ [130:20] ==> value-parameter it: (MutableMap.MutableEntry<(KtElement..KtElement?), (MutableCollection<(KtElement..KtElement?)>..Collection<(KtElement..KtElement?)>?)>..Map.Entry<(KtElement..KtElement?), (MutableCollection<(KtElement..KtElement?)>..Collection<(KtElement..KtElement?)>?)>?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.getParametersToRemove.<anonymous>[ValueParameterDescriptorImpl]

'key' @ [130:23] ==> public abstract val key: (KtElement..KtElement?) defined in kotlin.collections.MutableMap.MutableEntry[DeserializedPropertyDescriptor]

'originalDescriptor' @ [136:20] ==> value-parameter originalDescriptor: KotlinMethodDescriptor defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.performRefactoring.<no name provided>.configure[ValueParameterDescriptorImpl]

'modify' @ [136:39] ==> public fun KotlinMethodDescriptor.modify(action: (KotlinMutableMethodDescriptor) -> Unit): KotlinMethodDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature in file KotlinChangeSignature.kt[SimpleFunctionDescriptorImpl]

'!' @ [137:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'withDefaultValue' @ [137:22] ==> public final val withDefaultValue: Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.IntroduceParameterDescriptor[PropertyDescriptorImpl]

'callable' @ [138:38] ==> public final val callable: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.IntroduceParameterDescriptor[PropertyDescriptorImpl]

'getValueParameters' @ [138:47] ==> public fun KtNamedDeclaration.getValueParameters(): List<KtParameter> defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'methodDescriptor' @ [139:40] ==> value-parameter methodDescriptor: KotlinMutableMethodDescriptor defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.performRefactoring.<no name provided>.configure.<anonymous>[ValueParameterDescriptorImpl]

'receiver' @ [139:57] ==> public open var receiver: KotlinParameterInfo? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinMutableMethodDescriptor[PropertyDescriptorImpl]

'parametersToRemove' @ [140:21] ==> public final val parametersToRemove: List<KtElement> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.IntroduceParameterDescriptor[PropertyDescriptorImpl]

'map' @ [141:30] ==> public inline fun <T, R> Iterable<KtElement>.map(transform: (KtElement) -> Int): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtElement
    <R> -> Int

'if (it is KtParameter) {
                                    parameters.indexOf(it) + if (withReceiver) 1 else 0
                                } else 0' @ [142:33] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Int, elseBranch: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Int

'it' @ [142:37] ==> value-parameter it: KtElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.performRefactoring.<no name provided>.configure.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'parameters' @ [143:37] ==> val parameters: List<KtParameter> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.performRefactoring.<no name provided>.configure.<anonymous>[LocalVariableDescriptor]

'indexOf' @ [143:48] ==> public abstract fun indexOf(element: KtParameter): Int defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'it' @ [143:56] ==> value-parameter it: KtElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.performRefactoring.<no name provided>.configure.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'if (withReceiver) 1 else 0' @ [143:62] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Int, elseBranch: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Int

'withReceiver' @ [143:66] ==> val withReceiver: Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.performRefactoring.<no name provided>.configure.<anonymous>[LocalVariableDescriptor]

'sortedDescending' @ [146:30] ==> public fun <T : Comparable<Int>> Iterable<Int>.sortedDescending(): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Comparable<T>> -> Int

'forEach' @ [147:30] ==> @HidesMembers public inline fun <T> Iterable<Int>.forEach(action: (Int) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'methodDescriptor' @ [147:40] ==> value-parameter methodDescriptor: KotlinMutableMethodDescriptor defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.performRefactoring.<no name provided>.configure.<anonymous>[ValueParameterDescriptorImpl]

'removeParameter' @ [147:57] ==> public final fun removeParameter(index: Int): Unit defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinMutableMethodDescriptor[SimpleFunctionDescriptorImpl]

'it' @ [147:73] ==> value-parameter it: Int defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.performRefactoring.<no name provided>.configure.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'if (newArgumentValue is KtProperty) (newArgumentValue as KtProperty).initializer else newArgumentValue' @ [150:36] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KtExpression?, elseBranch: KtExpression?): KtExpression?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KtExpression?

'newArgumentValue' @ [150:40] ==> public final val newArgumentValue: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.IntroduceParameterDescriptor[PropertyDescriptorImpl]

'newArgumentValue' @ [150:73] ==> public final val newArgumentValue: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.IntroduceParameterDescriptor[PropertyDescriptorImpl]

'initializer' @ [150:105] ==> public final var KtProperty.initializer: KtExpression?[MyPropertyDescriptor]

'newArgumentValue' @ [150:122] ==> public final val newArgumentValue: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.IntroduceParameterDescriptor[PropertyDescriptorImpl]

'KotlinParameterInfo' @ [151:37] ==> @JvmOverloads public constructor KotlinParameterInfo(callableDescriptor: CallableDescriptor, originalIndex: Int = ..., name: String, originalTypeInfo: KotlinTypeInfo = ..., defaultValueForParameter: KtExpression? = ..., defaultValueForCall: KtExpression? = ..., valOrVar: KotlinValVar = ..., modifierList: KtModifierList? = ...) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo[ClassConstructorDescriptorImpl]

'callableDescriptor' @ [151:78] ==> public final val callableDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.IntroduceParameterDescriptor[PropertyDescriptorImpl]

'newParameterName' @ [152:64] ==> public final val newParameterName: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.IntroduceParameterDescriptor[PropertyDescriptorImpl]

'if (withDefaultValue) null else defaultValue' @ [153:79] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KtExpression?, elseBranch: KtExpression?): KtExpression?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KtExpression?

'withDefaultValue' @ [153:83] ==> public final val withDefaultValue: Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.IntroduceParameterDescriptor[PropertyDescriptorImpl]

'defaultValue' @ [153:111] ==> val defaultValue: KtExpression? defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.performRefactoring.<no name provided>.configure.<anonymous>[LocalVariableDescriptor]

'if (withDefaultValue) defaultValue else null' @ [154:84] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KtExpression?, elseBranch: KtExpression?): KtExpression?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KtExpression?

'withDefaultValue' @ [154:88] ==> public final val withDefaultValue: Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.IntroduceParameterDescriptor[PropertyDescriptorImpl]

'defaultValue' @ [154:106] ==> val defaultValue: KtExpression? defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.performRefactoring.<no name provided>.configure.<anonymous>[LocalVariableDescriptor]

'valVar' @ [155:68] ==> public final val valVar: KotlinValVar defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.IntroduceParameterDescriptor[PropertyDescriptorImpl]

'parameterInfo' @ [156:17] ==> val parameterInfo: KotlinParameterInfo defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.performRefactoring.<no name provided>.configure.<anonymous>[LocalVariableDescriptor]

'currentTypeInfo' @ [156:31] ==> public final var currentTypeInfo: KotlinTypeInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo[PropertyDescriptorImpl]

'KotlinTypeInfo' @ [156:49] ==> public constructor KotlinTypeInfo(isCovariant: Boolean, type: KotlinType? = ..., text: String? = ...) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinTypeInfo[ClassConstructorDescriptorImpl]

'newParameterTypeText' @ [156:77] ==> public final val newParameterTypeText: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.IntroduceParameterDescriptor[PropertyDescriptorImpl]

'methodDescriptor' @ [157:17] ==> value-parameter methodDescriptor: KotlinMutableMethodDescriptor defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.performRefactoring.<no name provided>.configure.<anonymous>[ValueParameterDescriptorImpl]

'addParameter' @ [157:34] ==> public final fun addParameter(parameter: KotlinParameterInfo): Unit defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinMutableMethodDescriptor[SimpleFunctionDescriptorImpl]

'parameterInfo' @ [157:47] ==> val parameterInfo: KotlinParameterInfo defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.performRefactoring.<no name provided>.configure.<anonymous>[LocalVariableDescriptor]

'callable' @ [164:19] ==> public final val callable: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.IntroduceParameterDescriptor[PropertyDescriptorImpl]

'project' @ [164:28] ==> public final val KtNamedDeclaration.project: Project[MyPropertyDescriptor]

'runChangeSignature' @ [165:29] ==> public fun runChangeSignature(project: Project, callableDescriptor: CallableDescriptor, configuration: KotlinChangeSignatureConfiguration, defaultValueContext: PsiElement, commandName: String? = ...): Boolean defined in org.jetbrains.kotlin.idea.refactoring.changeSignature in file KotlinChangeSignature.kt[SimpleFunctionDescriptorImpl]

'project' @ [165:48] ==> val project: Project defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.performRefactoring[LocalVariableDescriptor]

'callableDescriptor' @ [165:57] ==> public final val callableDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.IntroduceParameterDescriptor[PropertyDescriptorImpl]

'config' @ [165:77] ==> val config: <no name provided> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.performRefactoring[LocalVariableDescriptor]

'callable' @ [165:85] ==> public final val callable: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.IntroduceParameterDescriptor[PropertyDescriptorImpl]

'INTRODUCE_PARAMETER' @ [165:95] ==> public val INTRODUCE_PARAMETER: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter in file KotlinIntroduceParameterHandler.kt[PropertyDescriptorImpl]

'changeSignature' @ [167:5] ==> val changeSignature: () -> Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.performRefactoring[LocalVariableDescriptor]

'runRefactoringWithPostprocessing' @ [167:21] ==> public fun (() -> Any).runRefactoringWithPostprocessing(project: Project, targetRefactoringId: String, finishAction: () -> Unit): Unit defined in org.jetbrains.kotlin.idea.refactoring in file kotlinRefactoringUtil.kt[SimpleFunctionDescriptorImpl]

'project' @ [167:54] ==> val project: Project defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.performRefactoring[LocalVariableDescriptor]

'occurrencesToReplace' @ [169:13] ==> public final val occurrencesToReplace: List<KotlinPsiRange> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.IntroduceParameterDescriptor[PropertyDescriptorImpl]

'forEach' @ [169:34] ==> @HidesMembers public inline fun <T> Iterable<KotlinPsiRange>.forEach(action: (KotlinPsiRange) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinPsiRange

'invoke' @ [169:44] ==> public abstract operator fun IntroduceParameterDescriptor.invoke(p2: KotlinPsiRange): Unit defined in kotlin.Function2[FunctionInvokeDescriptor]

'it' @ [169:63] ==> value-parameter it: KotlinPsiRange defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.performRefactoring.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'project' @ [172:13] ==> val project: Project defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.performRefactoring[LocalVariableDescriptor]

'messageBus' @ [172:21] ==> public final val Project.messageBus: MessageBus[MyPropertyDescriptor]

'syncPublisher' @ [173:22] ==> @NotNull public abstract fun <L : (Any..Any?)> syncPublisher(@NotNull p0: Topic<(RefactoringEventListener..RefactoringEventListener?)>): RefactoringEventListener defined in com.intellij.util.messages.MessageBus[JavaMethodDescriptor]
Inferred types:
    <L : (Any..Any?)> -> (com.intellij.refactoring.listeners.RefactoringEventListener..com.intellij.refactoring.listeners.RefactoringEventListener?)

'REFACTORING_EVENT_TOPIC' @ [173:61] ==> public final val REFACTORING_EVENT_TOPIC: (Topic<(RefactoringEventListener..RefactoringEventListener?)>..Topic<(RefactoringEventListener..RefactoringEventListener?)>?) defined in com.intellij.refactoring.listeners.RefactoringEventListener[JavaPropertyDescriptor]

'refactoringDone' @ [174:22] ==> public abstract fun refactoringDone(@NotNull p0: String, @Nullable p1: RefactoringEventData?): Unit defined in com.intellij.refactoring.listeners.RefactoringEventListener[JavaMethodDescriptor]

'INTRODUCE_PARAMETER_REFACTORING_ID' @ [174:38] ==> public val INTRODUCE_PARAMETER_REFACTORING_ID: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter in file KotlinIntroduceParameterHandler.kt[PropertyDescriptorImpl]

'selectElementsWithTargetParent' @ [184:5] ==> public fun selectElementsWithTargetParent(operationName: String, editor: Editor, file: KtFile, title: String, elementKinds: Collection<CodeInsightUtils.ElementKind>, getContainers: (elements: List<PsiElement>, commonParent: PsiElement) -> List<PsiElement>, continuation: (elements: List<PsiElement>, targetParent: PsiElement) -> Unit): Unit defined in org.jetbrains.kotlin.idea.refactoring.introduce in file introduceUtil.kt[SimpleFunctionDescriptorImpl]

'INTRODUCE_PARAMETER' @ [185:29] ==> public val INTRODUCE_PARAMETER: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter in file KotlinIntroduceParameterHandler.kt[PropertyDescriptorImpl]

'editor' @ [186:22] ==> value-parameter editor: Editor defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.selectNewParameterContext[ValueParameterDescriptorImpl]

'file' @ [187:20] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.selectNewParameterContext[ValueParameterDescriptorImpl]

'listOf' @ [189:28] ==> public fun <T> listOf(element: CodeInsightUtils.ElementKind): List<CodeInsightUtils.ElementKind> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ElementKind

'EXPRESSION' @ [189:64] ==> enum entry EXPRESSION defined in org.jetbrains.kotlin.idea.codeInsight.CodeInsightUtils.ElementKind[FakeCallableDescriptorForObject]

'parent' @ [191:31] ==> value-parameter parent: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.selectNewParameterContext.<anonymous>[ValueParameterDescriptorImpl]

'parents' @ [191:38] ==> public val PsiElement.parents: Sequence<PsiElement> defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'parent' @ [192:31] ==> value-parameter parent: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.selectNewParameterContext.<anonymous>[ValueParameterDescriptorImpl]

'parents' @ [192:38] ==> public val PsiElement.parents: Sequence<PsiElement> defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'zip' @ [192:46] ==> public infix fun <T, R> Sequence<PsiElement>.zip(other: Sequence<PsiElement>): Sequence<Pair<PsiElement, PsiElement>> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement
    <R> -> PsiElement

'parent' @ [192:50] ==> value-parameter parent: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.selectNewParameterContext.<anonymous>[ValueParameterDescriptorImpl]

'parents' @ [192:57] ==> public val PsiElement.parents: Sequence<PsiElement> defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'drop' @ [192:65] ==> public fun <T> Sequence<PsiElement>.drop(n: Int): Sequence<PsiElement> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'firstOrNull' @ [193:26] ==> public inline fun <T> Sequence<Pair<PsiElement, PsiElement>>.firstOrNull(predicate: (Pair<PsiElement, PsiElement>) -> Boolean): Pair<PsiElement, PsiElement>? defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<PsiElement, PsiElement>

'isObjectOrNonInnerClass' @ [193:40] ==> public fun isObjectOrNonInnerClass(e: PsiElement): Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce in file introduceUtil.kt[SimpleFunctionDescriptorImpl]

'it' @ [193:64] ==> value-parameter it: Pair<PsiElement, PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.selectNewParameterContext.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'first' @ [193:67] ==> public final val first: PsiElement defined in kotlin.Pair[DeserializedPropertyDescriptor]

'second' @ [194:27] ==> public final val second: PsiElement defined in kotlin.Pair[DeserializedPropertyDescriptor]

'if (stopAt != null) parent.parents.takeWhile { it != stopAt } else parents' @ [196:18] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Sequence<PsiElement>, elseBranch: Sequence<PsiElement>): Sequence<PsiElement>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Sequence<PsiElement>

'stopAt' @ [196:22] ==> val stopAt: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.selectNewParameterContext.<anonymous>[LocalVariableDescriptor]

'parent' @ [196:38] ==> value-parameter parent: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.selectNewParameterContext.<anonymous>[ValueParameterDescriptorImpl]

'parents' @ [196:45] ==> public val PsiElement.parents: Sequence<PsiElement> defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'takeWhile' @ [196:53] ==> public fun <T> Sequence<PsiElement>.takeWhile(predicate: (PsiElement) -> Boolean): Sequence<PsiElement> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'it' @ [196:65] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.selectNewParameterContext.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'stopAt' @ [196:71] ==> val stopAt: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.selectNewParameterContext.<anonymous>[LocalVariableDescriptor]

'parents' @ [196:85] ==> val parents: Sequence<PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.selectNewParameterContext.<anonymous>[LocalVariableDescriptor]

'filter' @ [197:26] ==> public fun <T> Sequence<PsiElement>.filter(predicate: (PsiElement) -> Boolean): Sequence<PsiElement> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'it' @ [198:31] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.selectNewParameterContext.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'!' @ [198:48] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'it' @ [198:49] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.selectNewParameterContext.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'isInterface' @ [198:52] ==> public final fun isInterface(): Boolean defined in org.jetbrains.kotlin.psi.KtClass[DeserializedSimpleFunctionDescriptor]

'it' @ [198:69] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.selectNewParameterContext.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [198:92] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.selectNewParameterContext.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [198:117] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.selectNewParameterContext.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'!=' @ [199:30] ==> public open fun equals(other: Any?): Boolean defined in org.jetbrains.kotlin.psi.KtParameterList[DeserializedSimpleFunctionDescriptor]

'it' @ [199:31] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.selectNewParameterContext.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'getValueParameterList' @ [199:57] ==> public fun KtNamedDeclaration.getValueParameterList(): KtParameterList? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'it' @ [199:92] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.selectNewParameterContext.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'nameIdentifier' @ [199:95] ==> public final val KtNamedDeclaration.nameIdentifier: PsiElement?[MyPropertyDescriptor]

'toList' @ [201:26] ==> public fun <T> Sequence<PsiElement>.toList(): List<PsiElement> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'continuation' @ [203:28] ==> value-parameter continuation: (elements: List<PsiElement>, targetParent: PsiElement) -> Unit defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.selectNewParameterContext[ValueParameterDescriptorImpl]

'descriptor' @ [210:93] ==> value-parameter descriptor: IntroduceParameterDescriptor defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterHelper.configure[ValueParameterDescriptorImpl]

'Default' @ [214:85] ==> public object Default : KotlinIntroduceParameterHelper defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterHelper[FakeCallableDescriptorForObject]

'expression' @ [217:34] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterHandler.invoke[ValueParameterDescriptorImpl]

'substringContextOrThis' @ [217:45] ==> public val KtExpression.substringContextOrThis: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce[DeserializedPropertyDescriptor]

'physicalExpression' @ [218:13] ==> val physicalExpression: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterHandler.invoke[LocalVariableDescriptor]

'physicalExpression' @ [218:49] ==> val physicalExpression: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterHandler.invoke[LocalVariableDescriptor]

'isLocal' @ [218:68] ==> public final val KtProperty.isLocal: Boolean[MyPropertyDescriptor]

'physicalExpression' @ [218:79] ==> val physicalExpression: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterHandler.invoke[LocalVariableDescriptor]

'nameIdentifier' @ [218:98] ==> public final val KtProperty.nameIdentifier: PsiElement?[MyPropertyDescriptor]

'showErrorHintByKey' @ [219:13] ==> public fun showErrorHintByKey(project: Project, editor: Editor, messageKey: String, title: String): Unit defined in org.jetbrains.kotlin.idea.refactoring.introduce in file introduceUtil.kt[SimpleFunctionDescriptorImpl]

'project' @ [219:32] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterHandler.invoke[ValueParameterDescriptorImpl]

'editor' @ [219:41] ==> value-parameter editor: Editor defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterHandler.invoke[ValueParameterDescriptorImpl]

'INTRODUCE_PARAMETER' @ [219:82] ==> public val INTRODUCE_PARAMETER: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter in file KotlinIntroduceParameterHandler.kt[PropertyDescriptorImpl]

'physicalExpression' @ [223:23] ==> val physicalExpression: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterHandler.invoke[LocalVariableDescriptor]

'analyze' @ [223:42] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'if (physicalExpression is KtProperty && physicalExpression.isLocal) {
            context[BindingContext.VARIABLE, physicalExpression]?.type
        }
        else {
            expression.extractableSubstringInfo?.type ?: context.getType(physicalExpression)
        }' @ [225:30] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KotlinType?, elseBranch: KotlinType?): KotlinType?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KotlinType?

'physicalExpression' @ [225:34] ==> val physicalExpression: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterHandler.invoke[LocalVariableDescriptor]

'physicalExpression' @ [225:70] ==> val physicalExpression: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterHandler.invoke[LocalVariableDescriptor]

'isLocal' @ [225:89] ==> public final val KtProperty.isLocal: Boolean[MyPropertyDescriptor]

'context' @ [226:13] ==> val context: BindingContext defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterHandler.invoke[LocalVariableDescriptor]

'VARIABLE' @ [226:36] ==> public final val VARIABLE: (WritableSlice<(PsiElement..PsiElement?), (VariableDescriptor..VariableDescriptor?)>..WritableSlice<(PsiElement..PsiElement?), (VariableDescriptor..VariableDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'physicalExpression' @ [226:46] ==> val physicalExpression: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterHandler.invoke[LocalVariableDescriptor]

'type' @ [226:67] ==> public final val VariableDescriptor.type: KotlinType[MyPropertyDescriptor]

'expression' @ [229:13] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterHandler.invoke[ValueParameterDescriptorImpl]

'extractableSubstringInfo' @ [229:24] ==> public var KtExpression.extractableSubstringInfo: ExtractableSubstringInfo? defined in org.jetbrains.kotlin.idea.refactoring.introduce[DeserializedPropertyDescriptor]

'type' @ [229:50] ==> public final val type: KotlinType defined in org.jetbrains.kotlin.idea.refactoring.introduce.ExtractableSubstringInfo[DeserializedPropertyDescriptor]

'context' @ [229:58] ==> val context: BindingContext defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterHandler.invoke[LocalVariableDescriptor]

'getType' @ [229:66] ==> @Nullable public abstract fun getType(@NotNull p0: KtExpression): KotlinType? defined in org.jetbrains.kotlin.resolve.BindingContext[JavaMethodDescriptor]

'physicalExpression' @ [229:74] ==> val physicalExpression: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterHandler.invoke[LocalVariableDescriptor]

'expressionType' @ [232:13] ==> val expressionType: KotlinType? defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterHandler.invoke[LocalVariableDescriptor]

'showErrorHint' @ [233:13] ==> public fun showErrorHint(project: Project, editor: Editor, message: String, title: String): Unit defined in org.jetbrains.kotlin.idea.refactoring.introduce in file introduceUtil.kt[SimpleFunctionDescriptorImpl]

'project' @ [233:27] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterHandler.invoke[ValueParameterDescriptorImpl]

'editor' @ [233:36] ==> value-parameter editor: Editor defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterHandler.invoke[ValueParameterDescriptorImpl]

'INTRODUCE_PARAMETER' @ [233:70] ==> public val INTRODUCE_PARAMETER: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter in file KotlinIntroduceParameterHandler.kt[PropertyDescriptorImpl]

'expressionType' @ [237:13] ==> val expressionType: KotlinType? defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterHandler.invoke[LocalVariableDescriptor]

'isUnit' @ [237:28] ==> public fun KotlinType.isUnit(): Boolean defined in org.jetbrains.kotlin.types.typeUtil[DeserializedSimpleFunctionDescriptor]

'expressionType' @ [237:40] ==> val expressionType: KotlinType? defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterHandler.invoke[LocalVariableDescriptor]

'isNothing' @ [237:55] ==> public fun KotlinType.isNothing(): Boolean defined in org.jetbrains.kotlin.types.typeUtil[DeserializedSimpleFunctionDescriptor]

'message' @ [238:51] ==> @NotNull public open fun message(@NonNls @PropertyKey key: (String..String?), vararg params: (Any..Any?)): String defined in org.jetbrains.kotlin.idea.refactoring.KotlinRefactoringBundle[JavaMethodDescriptor]

'SOURCE_CODE_SHORT_NAMES_IN_TYPES' @ [240:44] ==> @field:JvmField public final val SOURCE_CODE_SHORT_NAMES_IN_TYPES: DescriptorRenderer defined in org.jetbrains.kotlin.idea.util.IdeDescriptorRenderers[DeserializedPropertyDescriptor]

'renderType' @ [240:77] ==> public abstract fun renderType(type: KotlinType): String defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[DeserializedSimpleFunctionDescriptor]

'expressionType' @ [240:88] ==> val expressionType: KotlinType? defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterHandler.invoke[LocalVariableDescriptor]

'showErrorHint' @ [242:13] ==> public fun showErrorHint(project: Project, editor: Editor, message: String, title: String): Unit defined in org.jetbrains.kotlin.idea.refactoring.introduce in file introduceUtil.kt[SimpleFunctionDescriptorImpl]

'project' @ [242:27] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterHandler.invoke[ValueParameterDescriptorImpl]

'editor' @ [242:36] ==> value-parameter editor: Editor defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterHandler.invoke[ValueParameterDescriptorImpl]

'message' @ [242:44] ==> val message: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterHandler.invoke[LocalVariableDescriptor]

'INTRODUCE_PARAMETER' @ [242:53] ==> public val INTRODUCE_PARAMETER: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter in file KotlinIntroduceParameterHandler.kt[PropertyDescriptorImpl]

'context' @ [246:26] ==> val context: BindingContext defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterHandler.invoke[LocalVariableDescriptor]

'DECLARATION_TO_DESCRIPTOR' @ [246:49] ==> public final val DECLARATION_TO_DESCRIPTOR: (ReadOnlySlice<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?)>..ReadOnlySlice<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'targetParent' @ [246:76] ==> value-parameter targetParent: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterHandler.invoke[ValueParameterDescriptorImpl]

'descriptor' @ [247:34] ==> val descriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterHandler.invoke[LocalVariableDescriptor]

'toFunctionDescriptor' @ [247:45] ==> private fun DeclarationDescriptor?.toFunctionDescriptor(targetParent: KtNamedDeclaration): FunctionDescriptor defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter in file KotlinIntroduceParameterHandler.kt[SimpleFunctionDescriptorImpl]

'targetParent' @ [247:66] ==> value-parameter targetParent: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterHandler.invoke[ValueParameterDescriptorImpl]

'expressionType' @ [248:31] ==> val expressionType: KotlinType? defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterHandler.invoke[LocalVariableDescriptor]

'approximateWithResolvableType' @ [248:46] ==> public fun KotlinType.approximateWithResolvableType(scope: LexicalScope?, checkTypeParameters: Boolean): KotlinType defined in org.jetbrains.kotlin.idea.util[DeserializedSimpleFunctionDescriptor]

'targetParent' @ [248:76] ==> value-parameter targetParent: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterHandler.invoke[ValueParameterDescriptorImpl]

'getResolutionScope' @ [248:89] ==> public fun PsiElement.getResolutionScope(bindingContext: BindingContext, resolutionFacade: ResolutionFacade): LexicalScope defined in org.jetbrains.kotlin.idea.util[DeserializedSimpleFunctionDescriptor]

'context' @ [248:108] ==> val context: BindingContext defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterHandler.invoke[LocalVariableDescriptor]

'targetParent' @ [248:117] ==> value-parameter targetParent: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterHandler.invoke[ValueParameterDescriptorImpl]

'getResolutionFacade' @ [248:130] ==> public fun KtElement.getResolutionFacade(): ResolutionFacade defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'when (targetParent) {
                       is KtFunction -> targetParent.bodyExpression
                       is KtClass -> targetParent.getBody()
                       else -> null
                   }' @ [250:20] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: KtElement?, entry1: KtElement?, entry2: KtElement?): KtElement?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> KtElement?

'targetParent' @ [250:26] ==> value-parameter targetParent: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterHandler.invoke[ValueParameterDescriptorImpl]

'targetParent' @ [251:41] ==> value-parameter targetParent: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterHandler.invoke[ValueParameterDescriptorImpl]

'bodyExpression' @ [251:54] ==> public final val KtFunction.bodyExpression: KtExpression?[MyPropertyDescriptor]

'targetParent' @ [252:38] ==> value-parameter targetParent: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterHandler.invoke[ValueParameterDescriptorImpl]

'getBody' @ [252:51] ==> public final fun getBody(): KtClassBody? defined in org.jetbrains.kotlin.psi.KtClass[DeserializedSimpleFunctionDescriptor]

'AssertionError' @ [254:31] ==> public final fun <init>(p0: (Any..Any?)): AssertionError /* = AssertionError */ defined in kotlin.AssertionError[TypeAliasConstructorDescriptorImpl]

'targetParent' @ [254:76] ==> value-parameter targetParent: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterHandler.invoke[ValueParameterDescriptorImpl]

'getElementTextWithContext' @ [254:89] ==> public fun PsiElement.getElementTextWithContext(): String defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'NewDeclarationNameValidator' @ [255:29] ==> public constructor NewDeclarationNameValidator(visibleDeclarationsContext: KtElement?, checkDeclarationsIn: Sequence<PsiElement>, target: NewDeclarationNameValidator.Target, excludedDeclarations: List<KtDeclaration> = ...) defined in org.jetbrains.kotlin.idea.core.NewDeclarationNameValidator[DeserializedClassConstructorDescriptor]

'body' @ [255:57] ==> val body: KtElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterHandler.invoke[LocalVariableDescriptor]

'sequenceOf' @ [255:63] ==> public fun <T> sequenceOf(vararg elements: KtElement): Sequence<KtElement> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtElement

'body' @ [255:74] ==> val body: KtElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterHandler.invoke[LocalVariableDescriptor]

'VARIABLES' @ [255:116] ==> enum entry VARIABLES defined in org.jetbrains.kotlin.idea.core.NewDeclarationNameValidator.Target[FakeCallableDescriptorForObject]

'SmartList' @ [257:30] ==> public constructor SmartList<E : (Any..Any?)>() defined in com.intellij.util.SmartList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> String

'apply' @ [257:50] ==> @InlineOnly public inline fun <T> SmartList<String>.apply(block: SmartList<String>.() -> Unit): SmartList<String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SmartList<String>

'physicalExpression' @ [258:17] ==> val physicalExpression: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterHandler.invoke[LocalVariableDescriptor]

'!' @ [258:53] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'getApplication' @ [258:73] ==> public open fun getApplication(): (Application..Application?) defined in com.intellij.openapi.application.ApplicationManager[JavaMethodDescriptor]

'isUnitTestMode' @ [258:90] ==> public final val Application.isUnitTestMode: Boolean[MyPropertyDescriptor]

'addIfNotNull' @ [259:17] ==> public fun <T : Any> MutableCollection<(String..String?)>.addIfNotNull(t: String?): Unit defined in org.jetbrains.kotlin.utils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> (kotlin.String..kotlin.String?)

'physicalExpression' @ [259:30] ==> val physicalExpression: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterHandler.invoke[LocalVariableDescriptor]

'name' @ [259:49] ==> public final val KtProperty.name: String?[MyPropertyDescriptor]

'addAll' @ [261:13] ==> public open fun addAll(elements: Collection<(String..String?)>): Boolean defined in com.intellij.util.SmartList[JavaMethodDescriptor]

'suggestNamesByType' @ [261:40] ==> public final fun suggestNamesByType(type: KotlinType, validator: (String) -> Boolean, defaultName: String? = ...): List<String> defined in org.jetbrains.kotlin.idea.core.KotlinNameSuggester[DeserializedSimpleFunctionDescriptor]

'replacementType' @ [261:59] ==> val replacementType: KotlinType defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterHandler.invoke[LocalVariableDescriptor]

'nameValidator' @ [261:76] ==> val nameValidator: NewDeclarationNameValidator defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterHandler.invoke[LocalVariableDescriptor]

'findInternalUsagesOfParametersAndReceiver' @ [264:32] ==> private fun findInternalUsagesOfParametersAndReceiver(targetParent: KtNamedDeclaration, targetDescriptor: FunctionDescriptor): MultiMap<KtElement, KtElement>? defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter in file KotlinIntroduceParameterHandler.kt[SimpleFunctionDescriptorImpl]

'targetParent' @ [264:74] ==> value-parameter targetParent: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterHandler.invoke[ValueParameterDescriptorImpl]

'functionDescriptor' @ [264:88] ==> val functionDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterHandler.invoke[LocalVariableDescriptor]

'?:' @ [266:31] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: List<(TextRange..TextRange?)>?, right: List<(TextRange..TextRange?)>): List<(TextRange..TextRange?)>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> List<(com.intellij.openapi.util.TextRange..com.intellij.openapi.util.TextRange?)>

'targetParent' @ [266:32] ==> value-parameter targetParent: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterHandler.invoke[ValueParameterDescriptorImpl]

'declarations' @ [266:59] ==> public final val KtClass.declarations: List<KtDeclaration>[MyPropertyDescriptor]

'filter' @ [266:73] ==> public inline fun <T> Iterable<KtDeclaration>.filter(predicate: (KtDeclaration) -> Boolean): List<KtDeclaration> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtDeclaration

'isObjectOrNonInnerClass' @ [266:82] ==> public fun isObjectOrNonInnerClass(e: PsiElement): Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce in file introduceUtil.kt[SimpleFunctionDescriptorImpl]

'map' @ [266:108] ==> public inline fun <T, R> Iterable<KtDeclaration>.map(transform: (KtDeclaration) -> (TextRange..TextRange?)): List<(TextRange..TextRange?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtDeclaration
    <R> -> (com.intellij.openapi.util.TextRange..com.intellij.openapi.util.TextRange?)

'it' @ [266:114] ==> value-parameter it: KtDeclaration defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterHandler.invoke.<anonymous>[ValueParameterDescriptorImpl]

'textRange' @ [266:117] ==> public final val KtDeclaration.textRange: (TextRange..TextRange?)[MyPropertyDescriptor]

'emptyList' @ [267:46] ==> public final fun <T : (Any..Any?)> emptyList(): (MutableList<(TextRange..TextRange?)>..List<(TextRange..TextRange?)>?) defined in java.util.Collections[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (com.intellij.openapi.util.TextRange..com.intellij.openapi.util.TextRange?)

'if (expression is KtProperty) {
            ReferencesSearch.search(expression).mapNotNullTo(SmartList(expression.toRange())) { it.element?.toRange() }
        }
        else {
            expression.toRange()
                    .match(body, KotlinPsiUnifier.DEFAULT)
                    .filterNot {
                        val textRange = it.range.getPhysicalTextRange()
                        forbiddenRanges.any { it.intersects(textRange) }
                    }
                    .mapNotNull {
                        val matchedElement = it.range.elements.singleOrNull()
                        val matchedExpr = when (matchedElement) {
                            is KtExpression -> matchedElement
                            is KtStringTemplateEntryWithExpression -> matchedElement.expression
                            else -> null
                        }
                        matchedExpr?.toRange()
                    }
        }' @ [269:36] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: List<KotlinPsiRange>, elseBranch: List<KotlinPsiRange>): List<KotlinPsiRange>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> List<KotlinPsiRange>

'expression' @ [269:40] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterHandler.invoke[ValueParameterDescriptorImpl]

'search' @ [270:30] ==> @NotNull public open fun search(@NotNull p0: PsiElement): Query<(PsiReference..PsiReference?)> defined in com.intellij.psi.search.searches.ReferencesSearch[JavaMethodDescriptor]

'expression' @ [270:37] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterHandler.invoke[ValueParameterDescriptorImpl]

'mapNotNullTo' @ [270:49] ==> public inline fun <T, R : Any, C : MutableCollection<in KotlinPsiRange>> Iterable<(PsiReference..PsiReference?)>.mapNotNullTo(destination: SmartList<(KotlinPsiRange..KotlinPsiRange?)>, transform: ((PsiReference..PsiReference?)) -> KotlinPsiRange?): SmartList<(KotlinPsiRange..KotlinPsiRange?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiReference..com.intellij.psi.PsiReference?)
    <R : Any> -> KotlinPsiRange
    <C : MutableCollection<in R>> -> SmartList<(org.jetbrains.kotlin.idea.util.psi.patternMatching.KotlinPsiRange..org.jetbrains.kotlin.idea.util.psi.patternMatching.KotlinPsiRange?)>

'SmartList' @ [270:62] ==> public constructor SmartList<E : (Any..Any?)>(p0: (KotlinPsiRange..KotlinPsiRange?)) defined in com.intellij.util.SmartList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> (org.jetbrains.kotlin.idea.util.psi.patternMatching.KotlinPsiRange..org.jetbrains.kotlin.idea.util.psi.patternMatching.KotlinPsiRange?)

'expression' @ [270:72] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterHandler.invoke[ValueParameterDescriptorImpl]

'toRange' @ [270:83] ==> public fun PsiElement?.toRange(): KotlinPsiRange defined in org.jetbrains.kotlin.idea.util.psi.patternMatching[DeserializedSimpleFunctionDescriptor]

'it' @ [270:97] ==> value-parameter it: (PsiReference..PsiReference?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterHandler.invoke.<anonymous>[ValueParameterDescriptorImpl]

'element' @ [270:100] ==> public final val PsiReference.element: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'toRange' @ [270:109] ==> public fun PsiElement?.toRange(): KotlinPsiRange defined in org.jetbrains.kotlin.idea.util.psi.patternMatching[DeserializedSimpleFunctionDescriptor]

'expression' @ [273:13] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterHandler.invoke[ValueParameterDescriptorImpl]

'toRange' @ [273:24] ==> public fun PsiElement?.toRange(): KotlinPsiRange defined in org.jetbrains.kotlin.idea.util.psi.patternMatching[DeserializedSimpleFunctionDescriptor]

'match' @ [274:22] ==> public open fun match(scope: PsiElement, unifier: KotlinPsiUnifier): List<UnificationResult.Matched> defined in org.jetbrains.kotlin.idea.util.psi.patternMatching.KotlinPsiRange[DeserializedSimpleFunctionDescriptor]

'body' @ [274:28] ==> val body: KtElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterHandler.invoke[LocalVariableDescriptor]

'DEFAULT' @ [274:51] ==> public final val DEFAULT: KotlinPsiUnifier defined in org.jetbrains.kotlin.idea.util.psi.patternMatching.KotlinPsiUnifier.Companion[DeserializedPropertyDescriptor]

'filterNot' @ [275:22] ==> public inline fun <T> Iterable<UnificationResult.Matched>.filterNot(predicate: (UnificationResult.Matched) -> Boolean): List<UnificationResult.Matched> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Matched

'it' @ [276:41] ==> value-parameter it: UnificationResult.Matched defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterHandler.invoke.<anonymous>[ValueParameterDescriptorImpl]

'range' @ [276:44] ==> public abstract val range: KotlinPsiRange defined in org.jetbrains.kotlin.idea.util.psi.patternMatching.UnificationResult.Matched[DeserializedPropertyDescriptor]

'getPhysicalTextRange' @ [276:50] ==> public fun KotlinPsiRange.getPhysicalTextRange(): TextRange defined in org.jetbrains.kotlin.idea.refactoring.introduce in file introduceUtil.kt[SimpleFunctionDescriptorImpl]

'forbiddenRanges' @ [277:25] ==> val forbiddenRanges: List<(TextRange..TextRange?)> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterHandler.invoke[LocalVariableDescriptor]

'any' @ [277:41] ==> public inline fun <T> Iterable<(TextRange..TextRange?)>.any(predicate: ((TextRange..TextRange?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.openapi.util.TextRange..com.intellij.openapi.util.TextRange?)

'it' @ [277:47] ==> value-parameter it: (TextRange..TextRange?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterHandler.invoke.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'intersects' @ [277:50] ==> public open fun intersects(@NotNull p0: TextRange): Boolean defined in com.intellij.openapi.util.TextRange[JavaMethodDescriptor]

'textRange' @ [277:61] ==> val textRange: TextRange defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterHandler.invoke.<anonymous>[LocalVariableDescriptor]

'mapNotNull' @ [279:22] ==> public inline fun <T, R : Any> Iterable<UnificationResult.Matched>.mapNotNull(transform: (UnificationResult.Matched) -> KotlinPsiRange?): List<KotlinPsiRange> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Matched
    <R : Any> -> KotlinPsiRange

'it' @ [280:46] ==> value-parameter it: UnificationResult.Matched defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterHandler.invoke.<anonymous>[ValueParameterDescriptorImpl]

'range' @ [280:49] ==> public abstract val range: KotlinPsiRange defined in org.jetbrains.kotlin.idea.util.psi.patternMatching.UnificationResult.Matched[DeserializedPropertyDescriptor]

'elements' @ [280:55] ==> public abstract val elements: List<PsiElement> defined in org.jetbrains.kotlin.idea.util.psi.patternMatching.KotlinPsiRange[DeserializedPropertyDescriptor]

'singleOrNull' @ [280:64] ==> public fun <T> List<PsiElement>.singleOrNull(): PsiElement? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'when (matchedElement) {
                            is KtExpression -> matchedElement
                            is KtStringTemplateEntryWithExpression -> matchedElement.expression
                            else -> null
                        }' @ [281:43] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: KtExpression?, entry1: KtExpression?, entry2: KtExpression?): KtExpression?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> KtExpression?

'matchedElement' @ [281:49] ==> val matchedElement: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterHandler.invoke.<anonymous>[LocalVariableDescriptor]

'matchedElement' @ [282:48] ==> val matchedElement: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterHandler.invoke.<anonymous>[LocalVariableDescriptor]

'matchedElement' @ [283:71] ==> val matchedElement: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterHandler.invoke.<anonymous>[LocalVariableDescriptor]

'expression' @ [283:86] ==> public final val KtStringTemplateEntryWithExpression.expression: KtExpression?[MyPropertyDescriptor]

'matchedExpr' @ [286:25] ==> val matchedExpr: KtExpression? defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterHandler.invoke.<anonymous>[LocalVariableDescriptor]

'toRange' @ [286:38] ==> public fun PsiElement?.toRange(): KotlinPsiRange defined in org.jetbrains.kotlin.idea.util.psi.patternMatching[DeserializedSimpleFunctionDescriptor]

'project' @ [290:9] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterHandler.invoke[ValueParameterDescriptorImpl]

'executeCommand' @ [290:17] ==> public fun <T> Project.executeCommand(name: String, groupId: Any? = ..., command: () -> Unit): Unit defined in org.jetbrains.kotlin.idea.util.application[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit

'INTRODUCE_PARAMETER' @ [291:17] ==> public val INTRODUCE_PARAMETER: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter in file KotlinIntroduceParameterHandler.kt[PropertyDescriptorImpl]

'getApplication' @ [294:57] ==> public open fun getApplication(): (Application..Application?) defined in com.intellij.openapi.application.ApplicationManager[JavaMethodDescriptor]

'isUnitTestMode' @ [294:74] ==> public final val Application.isUnitTestMode: Boolean[MyPropertyDescriptor]

'occurrencesToReplace' @ [295:56] ==> val occurrencesToReplace: List<KotlinPsiRange> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterHandler.invoke[LocalVariableDescriptor]

'any' @ [295:77] ==> public inline fun <T> Iterable<KotlinPsiRange>.any(predicate: (KotlinPsiRange) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinPsiRange

'it' @ [296:25] ==> value-parameter it: KotlinPsiRange defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterHandler.invoke.<no name provided>.<anonymous>[ValueParameterDescriptorImpl]

'elements' @ [296:28] ==> public abstract val elements: List<PsiElement> defined in org.jetbrains.kotlin.idea.util.psi.patternMatching.KotlinPsiRange[DeserializedPropertyDescriptor]

'any' @ [296:37] ==> public inline fun <T> Iterable<PsiElement>.any(predicate: (PsiElement) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'it' @ [296:43] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterHandler.invoke.<no name provided>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [296:71] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterHandler.invoke.<no name provided>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'parent' @ [296:74] ==> public final val KtLambdaExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'editor' @ [298:46] ==> value-parameter editor: Editor defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterHandler.invoke[ValueParameterDescriptorImpl]

'settings' @ [298:53] ==> public final val Editor.settings: EditorSettings[MyPropertyDescriptor]

'isVariableInplaceRenameEnabled' @ [298:62] ==> public final var EditorSettings.isVariableInplaceRenameEnabled: Boolean[MyPropertyDescriptor]

'!' @ [299:49] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isTestMode' @ [299:50] ==> val isTestMode: Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterHandler.invoke.<no name provided>[LocalVariableDescriptor]

'!' @ [300:49] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'haveLambdaArgumentsToReplace' @ [300:50] ==> val haveLambdaArgumentsToReplace: Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterHandler.invoke.<no name provided>[LocalVariableDescriptor]

'expression' @ [301:49] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterHandler.invoke[ValueParameterDescriptorImpl]

'extractableSubstringInfo' @ [301:60] ==> public var KtExpression.extractableSubstringInfo: ExtractableSubstringInfo? defined in org.jetbrains.kotlin.idea.refactoring.introduce[DeserializedPropertyDescriptor]

'!' @ [302:49] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'expression' @ [302:50] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterHandler.invoke[ValueParameterDescriptorImpl]

'mustBeParenthesizedInInitializerPosition' @ [302:61] ==> public fun KtExpression.mustBeParenthesizedInInitializerPosition(): Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce in file introduceUtil.kt[SimpleFunctionDescriptorImpl]

'safeDeparenthesize' @ [304:56] ==> @NotNull public open fun safeDeparenthesize(@NotNull p0: KtExpression): KtExpression defined in org.jetbrains.kotlin.psi.KtPsiUtil[JavaMethodDescriptor]

'expression' @ [304:75] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterHandler.invoke[ValueParameterDescriptorImpl]

'KtPsiFactory' @ [305:38] ==> @JvmOverloads public constructor KtPsiFactory(project: Project, markGenerated: Boolean = ...) defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedClassConstructorDescriptor]

'project' @ [305:51] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterHandler.invoke[ValueParameterDescriptorImpl]

'helper' @ [307:29] ==> public final val helper: KotlinIntroduceParameterHelper defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterHandler[PropertyDescriptorImpl]

'configure' @ [307:36] ==> public open fun configure(descriptor: IntroduceParameterDescriptor): IntroduceParameterDescriptor defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterHelper[SimpleFunctionDescriptorImpl]

'IntroduceParameterDescriptor' @ [308:37] ==> public constructor IntroduceParameterDescriptor(originalRange: KotlinPsiRange, callable: KtNamedDeclaration, callableDescriptor: FunctionDescriptor, newParameterName: String, newParameterTypeText: String, argumentValue: KtExpression, withDefaultValue: Boolean, parametersUsages: MultiMap<KtElement, KtElement>, occurrencesToReplace: List<KotlinPsiRange>, parametersToRemove: List<KtElement> = ..., occurrenceReplacer: IntroduceParameterDescriptor.(KotlinPsiRange) -> Unit = ...) defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.IntroduceParameterDescriptor[ClassConstructorDescriptorImpl]

'originalExpression' @ [309:61] ==> val originalExpression: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterHandler.invoke.<no name provided>[LocalVariableDescriptor]

'toRange' @ [309:80] ==> public fun PsiElement?.toRange(): KotlinPsiRange defined in org.jetbrains.kotlin.idea.util.psi.patternMatching[DeserializedSimpleFunctionDescriptor]

'targetParent' @ [310:56] ==> value-parameter targetParent: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterHandler.invoke[ValueParameterDescriptorImpl]

'functionDescriptor' @ [311:66] ==> val functionDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterHandler.invoke[LocalVariableDescriptor]

'suggestedNames' @ [312:64] ==> val suggestedNames: SmartList<String> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterHandler.invoke[LocalVariableDescriptor]

'first' @ [312:79] ==> public fun <T> List<(String..String?)>.first(): (String..String?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.String..kotlin.String?)

'quoteIfNeeded' @ [312:87] ==> public fun String.quoteIfNeeded(): String defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]

'SOURCE_CODE_SHORT_NAMES_IN_TYPES' @ [313:91] ==> @field:JvmField public final val SOURCE_CODE_SHORT_NAMES_IN_TYPES: DescriptorRenderer defined in org.jetbrains.kotlin.idea.util.IdeDescriptorRenderers[DeserializedPropertyDescriptor]

'renderType' @ [313:124] ==> public abstract fun renderType(type: KotlinType): String defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[DeserializedSimpleFunctionDescriptor]

'replacementType' @ [313:135] ==> val replacementType: KotlinType defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterHandler.invoke[LocalVariableDescriptor]

'originalExpression' @ [314:61] ==> val originalExpression: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterHandler.invoke.<no name provided>[LocalVariableDescriptor]

'parametersUsages' @ [316:64] ==> val parametersUsages: MultiMap<KtElement, KtElement> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterHandler.invoke[LocalVariableDescriptor]

'occurrencesToReplace' @ [317:68] ==> val occurrencesToReplace: List<KotlinPsiRange> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterHandler.invoke[LocalVariableDescriptor]

'it' @ [319:75] ==> value-parameter it: KotlinPsiRange defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterHandler.invoke.<no name provided>.<anonymous>[ValueParameterDescriptorImpl]

'elements' @ [319:78] ==> public abstract val elements: List<PsiElement> defined in org.jetbrains.kotlin.idea.util.psi.patternMatching.KotlinPsiRange[DeserializedPropertyDescriptor]

'single' @ [319:87] ==> public fun <T> List<PsiElement>.single(): PsiElement defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'psiFactory' @ [320:75] ==> val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterHandler.invoke.<no name provided>[LocalVariableDescriptor]

'createExpression' @ [320:86] ==> public final fun createExpression(text: String): KtExpression defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'newParameterName' @ [320:103] ==> public final val newParameterName: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.IntroduceParameterDescriptor[PropertyDescriptorImpl]

'expressionToReplace' @ [321:69] ==> val expressionToReplace: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterHandler.invoke.<no name provided>.<anonymous>[LocalVariableDescriptor]

'extractableSubstringInfo' @ [321:89] ==> public var KtExpression.extractableSubstringInfo: ExtractableSubstringInfo? defined in org.jetbrains.kotlin.idea.refactoring.introduce[DeserializedPropertyDescriptor]

'when {
                                                    expressionToReplace is KtProperty -> return@replacer expressionToReplace.delete()
                                                    expressionToReplace.isLambdaOutsideParentheses() -> {
                                                        expressionToReplace
                                                                .getStrictParentOfType<KtLambdaArgument>()!!
                                                                .moveInsideParenthesesAndReplaceWith(replacingExpression, context)
                                                    }
                                                    substringInfo != null -> substringInfo.replaceWith(replacingExpression)
                                                    else -> expressionToReplace.replaced(replacingExpression)
                                                }' @ [322:62] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: KtExpression, entry1: KtExpression, entry2: KtExpression, entry3: KtExpression): KtExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> KtExpression

'expressionToReplace' @ [323:53] ==> val expressionToReplace: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterHandler.invoke.<no name provided>.<anonymous>[LocalVariableDescriptor]

'expressionToReplace' @ [323:106] ==> val expressionToReplace: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterHandler.invoke.<no name provided>.<anonymous>[LocalVariableDescriptor]

'delete' @ [323:126] ==> public abstract fun delete(): Unit defined in org.jetbrains.kotlin.psi.KtExpression[JavaMethodDescriptor]

'expressionToReplace' @ [324:53] ==> val expressionToReplace: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterHandler.invoke.<no name provided>.<anonymous>[LocalVariableDescriptor]

'isLambdaOutsideParentheses' @ [324:73] ==> public fun KtExpression.isLambdaOutsideParentheses(): Boolean defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'expressionToReplace' @ [325:57] ==> val expressionToReplace: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterHandler.invoke.<no name provided>.<anonymous>[LocalVariableDescriptor]

'getStrictParentOfType' @ [326:66] ==> public inline fun <reified T : PsiElement> PsiElement.getStrictParentOfType(): KtLambdaArgument? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtLambdaArgument

'moveInsideParenthesesAndReplaceWith' @ [327:66] ==> public fun KtLambdaArgument.moveInsideParenthesesAndReplaceWith(replacement: KtExpression, bindingContext: BindingContext): KtCallExpression defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]

'replacingExpression' @ [327:102] ==> val replacingExpression: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterHandler.invoke.<no name provided>.<anonymous>[LocalVariableDescriptor]

'context' @ [327:123] ==> val context: BindingContext defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterHandler.invoke[LocalVariableDescriptor]

'substringInfo' @ [329:53] ==> val substringInfo: ExtractableSubstringInfo? defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterHandler.invoke.<no name provided>.<anonymous>[LocalVariableDescriptor]

'substringInfo' @ [329:78] ==> val substringInfo: ExtractableSubstringInfo? defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterHandler.invoke.<no name provided>.<anonymous>[LocalVariableDescriptor]

'replaceWith' @ [329:92] ==> public fun ExtractableSubstringInfo.replaceWith(replacement: KtExpression): KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce in file introduceUtil.kt[SimpleFunctionDescriptorImpl]

'replacingExpression' @ [329:104] ==> val replacingExpression: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterHandler.invoke.<no name provided>.<anonymous>[LocalVariableDescriptor]

'expressionToReplace' @ [330:61] ==> val expressionToReplace: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterHandler.invoke.<no name provided>.<anonymous>[LocalVariableDescriptor]

'replaced' @ [330:81] ==> public inline fun <reified T : PsiElement> PsiElement.replaced(newElement: KtExpression): KtExpression defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtExpression

'replacingExpression' @ [330:90] ==> val replacingExpression: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterHandler.invoke.<no name provided>.<anonymous>[LocalVariableDescriptor]

'result' @ [332:49] ==> val result: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterHandler.invoke.<no name provided>.<anonymous>[LocalVariableDescriptor]

'removeTemplateEntryBracesIfPossible' @ [332:56] ==> public fun KtExpression.removeTemplateEntryBracesIfPossible(): KtExpression defined in org.jetbrains.kotlin.idea.refactoring in file kotlinRefactoringUtil.kt[SimpleFunctionDescriptorImpl]

'isTestMode' @ [336:25] ==> val isTestMode: Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterHandler.invoke.<no name provided>[LocalVariableDescriptor]

'introduceParameterDescriptor' @ [337:25] ==> val introduceParameterDescriptor: IntroduceParameterDescriptor defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterHandler.invoke.<no name provided>[LocalVariableDescriptor]

'performRefactoring' @ [337:54] ==> public fun IntroduceParameterDescriptor.performRefactoring(): Unit defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter in file KotlinIntroduceParameterHandler.kt[SimpleFunctionDescriptorImpl]

'inplaceIsAvailable' @ [341:25] ==> val inplaceIsAvailable: Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterHandler.invoke.<no name provided>[LocalVariableDescriptor]

'with' @ [342:25] ==> @InlineOnly public inline fun <T, R> with(receiver: (PsiDocumentManager..PsiDocumentManager?), block: (PsiDocumentManager..PsiDocumentManager?).() -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiDocumentManager..com.intellij.psi.PsiDocumentManager?)
    <R> -> Unit

'getInstance' @ [342:49] ==> public open fun getInstance(@NotNull p0: Project): (PsiDocumentManager..PsiDocumentManager?) defined in com.intellij.psi.PsiDocumentManager[JavaMethodDescriptor]

'project' @ [342:61] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterHandler.invoke[ValueParameterDescriptorImpl]

'commitDocument' @ [343:29] ==> public abstract fun commitDocument(@NotNull p0: Document): Unit defined in com.intellij.psi.PsiDocumentManager[JavaMethodDescriptor]

'editor' @ [343:44] ==> value-parameter editor: Editor defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterHandler.invoke[ValueParameterDescriptorImpl]

'document' @ [343:51] ==> public final val Editor.document: Document[MyPropertyDescriptor]

'doPostponedOperationsAndUnblockDocument' @ [344:29] ==> public abstract fun doPostponedOperationsAndUnblockDocument(@NotNull p0: Document): Unit defined in com.intellij.psi.PsiDocumentManager[JavaMethodDescriptor]

'editor' @ [344:69] ==> value-parameter editor: Editor defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterHandler.invoke[ValueParameterDescriptorImpl]

'document' @ [344:76] ==> public final val Editor.document: Document[MyPropertyDescriptor]

'KotlinInplaceParameterIntroducer' @ [347:42] ==> public constructor KotlinInplaceParameterIntroducer(originalDescriptor: IntroduceParameterDescriptor, parameterType: KotlinType, suggestedNames: Array<out String>, project: Project, editor: Editor) defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinInplaceParameterIntroducer[ClassConstructorDescriptorImpl]

'introduceParameterDescriptor' @ [347:75] ==> val introduceParameterDescriptor: IntroduceParameterDescriptor defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterHandler.invoke.<no name provided>[LocalVariableDescriptor]

'replacementType' @ [348:75] ==> val replacementType: KotlinType defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterHandler.invoke[LocalVariableDescriptor]

'suggestedNames' @ [349:75] ==> val suggestedNames: SmartList<String> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterHandler.invoke[LocalVariableDescriptor]

'toTypedArray' @ [349:90] ==> public inline fun <reified T> Collection<(String..String?)>.toTypedArray(): Array<(String..String?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> (kotlin.String..kotlin.String?)

'project' @ [350:75] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterHandler.invoke[ValueParameterDescriptorImpl]

'editor' @ [351:75] ==> value-parameter editor: Editor defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterHandler.invoke[ValueParameterDescriptorImpl]

'introducer' @ [352:29] ==> val introducer: KotlinInplaceParameterIntroducer defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterHandler.invoke.<no name provided>[LocalVariableDescriptor]

'startInplaceIntroduceTemplate' @ [352:40] ==> public open fun startInplaceIntroduceTemplate(): Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinInplaceParameterIntroducer[JavaMethodDescriptor]

'KotlinIntroduceParameterDialog' @ [355:21] ==> public constructor KotlinIntroduceParameterDialog(project: Project, editor: Editor, descriptor: IntroduceParameterDescriptor, nameSuggestions: Array<String>, typeSuggestions: List<KotlinType>, helper: KotlinIntroduceParameterHelper) defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterDialog[ClassConstructorDescriptorImpl]

'project' @ [355:52] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterHandler.invoke[ValueParameterDescriptorImpl]

'editor' @ [356:52] ==> value-parameter editor: Editor defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterHandler.invoke[ValueParameterDescriptorImpl]

'introduceParameterDescriptor' @ [357:52] ==> val introduceParameterDescriptor: IntroduceParameterDescriptor defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterHandler.invoke.<no name provided>[LocalVariableDescriptor]

'suggestedNames' @ [358:52] ==> val suggestedNames: SmartList<String> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterHandler.invoke[LocalVariableDescriptor]

'toTypedArray' @ [358:67] ==> public inline fun <reified T> Collection<String>.toTypedArray(): Array<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> String

'listOf' @ [359:52] ==> public fun <T> listOf(element: KotlinType): List<KotlinType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType

'replacementType' @ [359:59] ==> val replacementType: KotlinType defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterHandler.invoke[LocalVariableDescriptor]

'replacementType' @ [359:78] ==> val replacementType: KotlinType defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterHandler.invoke[LocalVariableDescriptor]

'supertypes' @ [359:94] ==> public fun KotlinType.supertypes(): Collection<KotlinType> defined in org.jetbrains.kotlin.types.typeUtil[DeserializedSimpleFunctionDescriptor]

'helper' @ [360:52] ==> public final val helper: KotlinIntroduceParameterHelper defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterHandler[PropertyDescriptorImpl]

'show' @ [360:60] ==> public open fun show(): Unit defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterDialog[JavaMethodDescriptor]

'getActiveIntroducer' @ [366:36] ==> @Nullable public open fun getActiveIntroducer(@Nullable p0: Editor?): raw (AbstractInplaceIntroducer<(PsiNameIdentifierOwner..PsiNameIdentifierOwner?), (PsiElement..PsiElement?)>?..AbstractInplaceIntroducer<*, *>?) defined in com.intellij.refactoring.introduce.inplace.AbstractInplaceIntroducer[JavaMethodDescriptor]

'editor' @ [366:56] ==> value-parameter editor: Editor defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterHandler.invoke[ValueParameterDescriptorImpl]

'let' @ [366:103] ==> @InlineOnly public inline fun <T, R> KotlinInplaceParameterIntroducer.let(block: (KotlinInplaceParameterIntroducer) -> Nothing): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinInplaceParameterIntroducer
    <R> -> Nothing

'it' @ [367:13] ==> value-parameter it: KotlinInplaceParameterIntroducer defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterHandler.invoke.<anonymous>[ValueParameterDescriptorImpl]

'switchToDialogUI' @ [367:16] ==> public final fun switchToDialogUI(): Unit defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinInplaceParameterIntroducer[SimpleFunctionDescriptorImpl]

'file' @ [371:13] ==> value-parameter file: PsiFile defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterHandler.invoke[ValueParameterDescriptorImpl]

'selectNewParameterContext' @ [372:9] ==> public fun selectNewParameterContext(editor: Editor, file: KtFile, continuation: (elements: List<PsiElement>, targetParent: PsiElement) -> Unit): Unit defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter in file KotlinIntroduceParameterHandler.kt[SimpleFunctionDescriptorImpl]

'editor' @ [372:35] ==> value-parameter editor: Editor defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterHandler.invoke[ValueParameterDescriptorImpl]

'file' @ [372:43] ==> value-parameter file: PsiFile defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterHandler.invoke[ValueParameterDescriptorImpl]

'?:' @ [373:31] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: List<(PsiElement..PsiElement?)>?, right: List<(PsiElement..PsiElement?)>): List<(PsiElement..PsiElement?)>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> List<(com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)>

'elements' @ [373:32] ==> value-parameter elements: List<PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterHandler.invoke.<anonymous>[ValueParameterDescriptorImpl]

'singleOrNull' @ [373:41] ==> public fun <T> List<PsiElement>.singleOrNull(): PsiElement? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'statements' @ [373:80] ==> public final val KtBlockExpression.statements: List<(KtExpression..KtExpression?)>[MyPropertyDescriptor]

'elements' @ [373:94] ==> value-parameter elements: List<PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterHandler.invoke.<anonymous>[ValueParameterDescriptorImpl]

'singleOrNull' @ [373:104] ==> public fun <T> List<(PsiElement..PsiElement?)>.singleOrNull(): PsiElement? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)

'if (expression is KtExpression) {
                invoke(project, editor, expression, targetParent as KtNamedDeclaration)
            }
            else {
                showErrorHintByKey(project, editor, "cannot.refactor.no.expression", INTRODUCE_PARAMETER)
            }' @ [374:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'expression' @ [374:17] ==> val expression: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterHandler.invoke.<anonymous>[LocalVariableDescriptor]

'invoke' @ [375:17] ==> public open fun invoke(project: Project, editor: Editor, expression: KtExpression, targetParent: KtNamedDeclaration): Unit defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterHandler[SimpleFunctionDescriptorImpl]

'project' @ [375:24] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterHandler.invoke[ValueParameterDescriptorImpl]

'editor' @ [375:33] ==> value-parameter editor: Editor defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterHandler.invoke[ValueParameterDescriptorImpl]

'expression' @ [375:41] ==> val expression: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterHandler.invoke.<anonymous>[LocalVariableDescriptor]

'targetParent' @ [375:53] ==> value-parameter targetParent: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterHandler.invoke.<anonymous>[ValueParameterDescriptorImpl]

'showErrorHintByKey' @ [378:17] ==> public fun showErrorHintByKey(project: Project, editor: Editor, messageKey: String, title: String): Unit defined in org.jetbrains.kotlin.idea.refactoring.introduce in file introduceUtil.kt[SimpleFunctionDescriptorImpl]

'project' @ [378:36] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterHandler.invoke[ValueParameterDescriptorImpl]

'editor' @ [378:45] ==> value-parameter editor: Editor defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterHandler.invoke[ValueParameterDescriptorImpl]

'INTRODUCE_PARAMETER' @ [378:86] ==> public val INTRODUCE_PARAMETER: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter in file KotlinIntroduceParameterHandler.kt[PropertyDescriptorImpl]

'AssertionError' @ [384:15] ==> public final fun <init>(p0: (Any..Any?)): AssertionError /* = AssertionError */ defined in kotlin.AssertionError[TypeAliasConstructorDescriptorImpl]

'INTRODUCE_PARAMETER' @ [384:32] ==> public val INTRODUCE_PARAMETER: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter in file KotlinIntroduceParameterHandler.kt[PropertyDescriptorImpl]

'when (this) {
                is FunctionDescriptor -> this
                is ClassDescriptor -> this.unsubstitutedPrimaryConstructor
                else -> null
            }' @ [390:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: FunctionDescriptor?, entry1: FunctionDescriptor?, entry2: FunctionDescriptor?): FunctionDescriptor?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> FunctionDescriptor?

'this' @ [390:19] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.toFunctionDescriptor[ReceiverParameterDescriptorImpl]

'this' @ [391:42] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.toFunctionDescriptor[ReceiverParameterDescriptorImpl]

'this' @ [392:39] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.toFunctionDescriptor[ReceiverParameterDescriptorImpl]

'unsubstitutedPrimaryConstructor' @ [392:44] ==> public final val ClassDescriptor.unsubstitutedPrimaryConstructor: ClassConstructorDescriptor?[MyPropertyDescriptor]

'functionDescriptor' @ [395:12] ==> val functionDescriptor: FunctionDescriptor? defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.toFunctionDescriptor[LocalVariableDescriptor]

'AssertionError' @ [395:40] ==> public final fun <init>(p0: (Any..Any?)): AssertionError /* = AssertionError */ defined in kotlin.AssertionError[TypeAliasConstructorDescriptorImpl]

'targetParent' @ [395:83] ==> value-parameter targetParent: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.toFunctionDescriptor[ValueParameterDescriptorImpl]

'getElementTextWithContext' @ [395:96] ==> public fun PsiElement.getElementTextWithContext(): String defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'MultiMap' @ [402:18] ==> public constructor MultiMap<K : (Any..Any?), V : (Any..Any?)>() defined in com.intellij.util.containers.MultiMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> KtElement
    <V : (Any..Any?)> -> KtElement

'targetParent' @ [403:26] ==> value-parameter targetParent: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.findInternalUsagesOfParametersAndReceiver[ValueParameterDescriptorImpl]

'project' @ [403:39] ==> public final val KtNamedDeclaration.project: Project[MyPropertyDescriptor]

'runSynchronouslyWithProgress' @ [403:47] ==> public fun <T : Any> Project.runSynchronouslyWithProgress(progressTitle: String, canBeCanceled: Boolean, action: () -> Unit): Unit? defined in org.jetbrains.kotlin.idea[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> Unit

'targetParent' @ [403:100] ==> value-parameter targetParent: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.findInternalUsagesOfParametersAndReceiver[ValueParameterDescriptorImpl]

'name' @ [403:113] ==> public final val KtNamedDeclaration.name: String?[MyPropertyDescriptor]

'runReadAction' @ [404:9] ==> public fun <T> runReadAction(action: () -> Unit): Unit defined in org.jetbrains.kotlin.idea.util.application[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit

'targetParent' @ [405:13] ==> value-parameter targetParent: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.findInternalUsagesOfParametersAndReceiver[ValueParameterDescriptorImpl]

'getValueParameters' @ [405:26] ==> public fun KtNamedDeclaration.getValueParameters(): List<KtParameter> defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'filter' @ [406:22] ==> public inline fun <T> Iterable<KtParameter>.filter(predicate: (KtParameter) -> Boolean): List<KtParameter> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtParameter

'!' @ [406:31] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'it' @ [406:32] ==> value-parameter it: KtParameter defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.findInternalUsagesOfParametersAndReceiver.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'hasValOrVar' @ [406:35] ==> public open fun hasValOrVar(): Boolean defined in org.jetbrains.kotlin.psi.KtParameter[JavaMethodDescriptor]

'forEach' @ [407:22] ==> @HidesMembers public inline fun <T> Iterable<KtParameter>.forEach(action: (KtParameter) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtParameter

'search' @ [408:60] ==> @NotNull public open fun search(@NotNull p0: PsiElement): Query<(PsiReference..PsiReference?)> defined in com.intellij.psi.search.searches.ReferencesSearch[JavaMethodDescriptor]

'it' @ [408:67] ==> value-parameter it: KtParameter defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.findInternalUsagesOfParametersAndReceiver.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'map' @ [408:71] ==> public inline fun <T, R> Iterable<(PsiReference..PsiReference?)>.map(transform: ((PsiReference..PsiReference?)) -> KtElement): List<KtElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiReference..com.intellij.psi.PsiReference?)
    <R> -> KtElement

'it' @ [408:77] ==> value-parameter it: (PsiReference..PsiReference?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.findInternalUsagesOfParametersAndReceiver.<anonymous>.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'element' @ [408:80] ==> public final val PsiReference.element: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'paramUsages' @ [409:29] ==> val paramUsages: List<KtElement> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.findInternalUsagesOfParametersAndReceiver.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'isNotEmpty' @ [409:41] ==> @InlineOnly public inline fun <T> Collection<KtElement>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtElement

'usages' @ [410:29] ==> val usages: MultiMap<KtElement, KtElement> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.findInternalUsagesOfParametersAndReceiver[LocalVariableDescriptor]

'put' @ [410:36] ==> public open fun put(p0: (KtElement..KtElement?), p1: (MutableCollection<(KtElement..KtElement?)>..Collection<(KtElement..KtElement?)>?)): Unit defined in com.intellij.util.containers.MultiMap[JavaMethodDescriptor]

'it' @ [410:40] ==> value-parameter it: KtParameter defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.findInternalUsagesOfParametersAndReceiver.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'paramUsages' @ [410:44] ==> val paramUsages: List<KtElement> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.findInternalUsagesOfParametersAndReceiver.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'!' @ [415:9] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'searchComplete' @ [415:10] ==> val searchComplete: Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.findInternalUsagesOfParametersAndReceiver[LocalVariableDescriptor]

'targetParent' @ [416:28] ==> value-parameter targetParent: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.findInternalUsagesOfParametersAndReceiver[ValueParameterDescriptorImpl]

'receiverTypeReference' @ [416:58] ==> public final val KtFunction.receiverTypeReference: KtTypeReference?[MyPropertyDescriptor]

'receiverTypeRef' @ [417:9] ==> val receiverTypeRef: KtTypeReference? defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.findInternalUsagesOfParametersAndReceiver[LocalVariableDescriptor]

'targetParent' @ [418:9] ==> value-parameter targetParent: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.findInternalUsagesOfParametersAndReceiver[ValueParameterDescriptorImpl]

'acceptChildren' @ [418:22] ==> public abstract fun acceptChildren(@NotNull p0: PsiElementVisitor): Unit defined in org.jetbrains.kotlin.psi.KtNamedDeclaration[JavaMethodDescriptor]

'KtTreeVisitorVoid' @ [419:26] ==> public constructor KtTreeVisitorVoid() defined in org.jetbrains.kotlin.psi.KtTreeVisitorVoid[JavaClassConstructorDescriptor]

'super' @ [421:25] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.findInternalUsagesOfParametersAndReceiver.<no name provided>[LazyClassReceiverParameterDescriptor]

'visitThisExpression' @ [421:31] ==> public open fun visitThisExpression(@NotNull p0: KtThisExpression): Unit defined in org.jetbrains.kotlin.psi.KtTreeVisitorVoid[JavaMethodDescriptor]

'expression' @ [421:51] ==> value-parameter expression: KtThisExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.findInternalUsagesOfParametersAndReceiver.<no name provided>.visitThisExpression[ValueParameterDescriptorImpl]

'expression' @ [423:29] ==> value-parameter expression: KtThisExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.findInternalUsagesOfParametersAndReceiver.<no name provided>.visitThisExpression[ValueParameterDescriptorImpl]

'instanceReference' @ [423:40] ==> public final val KtThisExpression.instanceReference: KtReferenceExpression[MyPropertyDescriptor]

'mainReference' @ [423:58] ==> public val KtReferenceExpression.mainReference: KtReference defined in org.jetbrains.kotlin.idea.references[DeserializedPropertyDescriptor]

'resolve' @ [423:72] ==> @Nullable public abstract fun resolve(): PsiElement? defined in org.jetbrains.kotlin.idea.references.KtReference[JavaMethodDescriptor]

'targetDescriptor' @ [423:85] ==> value-parameter targetDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.findInternalUsagesOfParametersAndReceiver[ValueParameterDescriptorImpl]

'usages' @ [424:29] ==> val usages: MultiMap<KtElement, KtElement> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.findInternalUsagesOfParametersAndReceiver[LocalVariableDescriptor]

'putValue' @ [424:36] ==> public open fun putValue(@Nullable p0: KtElement?, p1: (KtElement..KtElement?)): Unit defined in com.intellij.util.containers.MultiMap[JavaMethodDescriptor]

'receiverTypeRef' @ [424:45] ==> val receiverTypeRef: KtTypeReference? defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.findInternalUsagesOfParametersAndReceiver[LocalVariableDescriptor]

'expression' @ [424:62] ==> value-parameter expression: KtThisExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.findInternalUsagesOfParametersAndReceiver.<no name provided>.visitThisExpression[ValueParameterDescriptorImpl]

'super' @ [429:25] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.findInternalUsagesOfParametersAndReceiver.<no name provided>[LazyClassReceiverParameterDescriptor]

'visitKtElement' @ [429:31] ==> public open fun visitKtElement(@NotNull p0: KtElement): Unit defined in org.jetbrains.kotlin.psi.KtTreeVisitorVoid[JavaMethodDescriptor]

'element' @ [429:46] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.findInternalUsagesOfParametersAndReceiver.<no name provided>.visitKtElement[ValueParameterDescriptorImpl]

'element' @ [431:46] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.findInternalUsagesOfParametersAndReceiver.<no name provided>.visitKtElement[ValueParameterDescriptorImpl]

'analyze' @ [431:54] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'element' @ [432:44] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.findInternalUsagesOfParametersAndReceiver.<no name provided>.visitKtElement[ValueParameterDescriptorImpl]

'getResolvedCall' @ [432:52] ==> public fun KtElement?.getResolvedCall(context: BindingContext): ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.resolve.calls.callUtil[DeserializedSimpleFunctionDescriptor]

'bindingContext' @ [432:68] ==> val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.findInternalUsagesOfParametersAndReceiver.<no name provided>.visitKtElement[LocalVariableDescriptor]

'==' @ [434:29] ==> public open fun equals(other: Any?): Boolean defined in org.jetbrains.kotlin.descriptors.DeclarationDescriptor[DeserializedSimpleFunctionDescriptor]

'resolvedCall' @ [434:30] ==> val resolvedCall: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.findInternalUsagesOfParametersAndReceiver.<no name provided>.visitKtElement[LocalVariableDescriptor]

'extensionReceiver' @ [434:43] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.extensionReceiver: ReceiverValue?[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> Captured(out CallableDescriptor)

'declarationDescriptor' @ [434:84] ==> public abstract val declarationDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.scopes.receivers.ImplicitReceiver[DeserializedPropertyDescriptor]

'targetDescriptor' @ [434:109] ==> value-parameter targetDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.findInternalUsagesOfParametersAndReceiver[ValueParameterDescriptorImpl]

'==' @ [435:29] ==> public open fun equals(other: Any?): Boolean defined in org.jetbrains.kotlin.descriptors.DeclarationDescriptor[DeserializedSimpleFunctionDescriptor]

'resolvedCall' @ [435:30] ==> val resolvedCall: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.findInternalUsagesOfParametersAndReceiver.<no name provided>.visitKtElement[LocalVariableDescriptor]

'dispatchReceiver' @ [435:43] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.dispatchReceiver: ReceiverValue?[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> Captured(out CallableDescriptor)

'declarationDescriptor' @ [435:83] ==> public abstract val declarationDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.scopes.receivers.ImplicitReceiver[DeserializedPropertyDescriptor]

'targetDescriptor' @ [435:108] ==> value-parameter targetDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.findInternalUsagesOfParametersAndReceiver[ValueParameterDescriptorImpl]

'usages' @ [436:29] ==> val usages: MultiMap<KtElement, KtElement> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.findInternalUsagesOfParametersAndReceiver[LocalVariableDescriptor]

'putValue' @ [436:36] ==> public open fun putValue(@Nullable p0: KtElement?, p1: (KtElement..KtElement?)): Unit defined in com.intellij.util.containers.MultiMap[JavaMethodDescriptor]

'receiverTypeRef' @ [436:45] ==> val receiverTypeRef: KtTypeReference? defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.findInternalUsagesOfParametersAndReceiver[LocalVariableDescriptor]

'resolvedCall' @ [436:62] ==> val resolvedCall: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.findInternalUsagesOfParametersAndReceiver.<no name provided>.visitKtElement[LocalVariableDescriptor]

'call' @ [436:75] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.call: Call[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> Captured(out CallableDescriptor)

'callElement' @ [436:80] ==> public final val Call.callElement: KtElement[MyPropertyDescriptor]

'usages' @ [442:12] ==> val usages: MultiMap<KtElement, KtElement> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.findInternalUsagesOfParametersAndReceiver[LocalVariableDescriptor]

'descriptor' @ [448:100] ==> value-parameter descriptor: ExtractableCodeDescriptor defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceLambdaParameterHelper.configureExtractLambda[ValueParameterDescriptorImpl]

'Default' @ [452:93] ==> public object Default : KotlinIntroduceLambdaParameterHelper defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceLambdaParameterHelper[FakeCallableDescriptorForObject]

'KotlinIntroduceParameterHandler' @ [453:4] ==> public constructor KotlinIntroduceParameterHandler(helper: KotlinIntroduceParameterHelper = ...) defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterHandler[ClassConstructorDescriptorImpl]

'helper' @ [453:36] ==> value-parameter helper: KotlinIntroduceLambdaParameterHelper = ... defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceLambdaParameterHandler.<init>[ValueParameterDescriptorImpl]

'ExtractionEngineHelper' @ [454:47] ==> public constructor ExtractionEngineHelper(operationName: String) defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionEngineHelper[ClassConstructorDescriptorImpl]

'INTRODUCE_LAMBDA_PARAMETER' @ [454:70] ==> public val INTRODUCE_LAMBDA_PARAMETER: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter in file KotlinIntroduceParameterHandler.kt[PropertyDescriptorImpl]

'lambdaExtractionDescriptor' @ [460:28] ==> value-parameter lambdaExtractionDescriptor: ExtractableCodeDescriptor defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceLambdaParameterHandler.extractLambdaHelper.<no name provided>.createDialog[ValueParameterDescriptorImpl]

'extractionData' @ [460:55] ==> public final val extractionData: ExtractionData defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractableCodeDescriptor[PropertyDescriptorImpl]

'targetSibling' @ [460:70] ==> public final val targetSibling: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData[PropertyDescriptorImpl]

'callable' @ [461:30] ==> val callable: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceLambdaParameterHandler.extractLambdaHelper.<no name provided>.createDialog[LocalVariableDescriptor]

'resolveToDescriptor' @ [461:39] ==> public fun KtDeclaration.resolveToDescriptor(bodyResolveMode: BodyResolveMode = ...): DeclarationDescriptor defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [462:38] ==> val descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceLambdaParameterHandler.extractLambdaHelper.<no name provided>.createDialog[LocalVariableDescriptor]

'toFunctionDescriptor' @ [462:49] ==> private fun DeclarationDescriptor?.toFunctionDescriptor(targetParent: KtNamedDeclaration): FunctionDescriptor defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter in file KotlinIntroduceParameterHandler.kt[SimpleFunctionDescriptorImpl]

'callable' @ [462:70] ==> val callable: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceLambdaParameterHandler.extractLambdaHelper.<no name provided>.createDialog[LocalVariableDescriptor]

'lambdaExtractionDescriptor' @ [463:33] ==> value-parameter lambdaExtractionDescriptor: ExtractableCodeDescriptor defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceLambdaParameterHandler.extractLambdaHelper.<no name provided>.createDialog[ValueParameterDescriptorImpl]

'extractionData' @ [463:60] ==> public final val extractionData: ExtractionData defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractableCodeDescriptor[PropertyDescriptorImpl]

'originalRange' @ [463:75] ==> public final val originalRange: KotlinPsiRange defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData[PropertyDescriptorImpl]

'findInternalUsagesOfParametersAndReceiver' @ [464:36] ==> private fun findInternalUsagesOfParametersAndReceiver(targetParent: KtNamedDeclaration, targetDescriptor: FunctionDescriptor): MultiMap<KtElement, KtElement>? defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter in file KotlinIntroduceParameterHandler.kt[SimpleFunctionDescriptorImpl]

'callable' @ [464:78] ==> val callable: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceLambdaParameterHandler.extractLambdaHelper.<no name provided>.createDialog[LocalVariableDescriptor]

'callableDescriptor' @ [464:88] ==> val callableDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceLambdaParameterHandler.extractLambdaHelper.<no name provided>.createDialog[LocalVariableDescriptor]

'IntroduceParameterDescriptor' @ [465:48] ==> public constructor IntroduceParameterDescriptor(originalRange: KotlinPsiRange, callable: KtNamedDeclaration, callableDescriptor: FunctionDescriptor, newParameterName: String, newParameterTypeText: String, argumentValue: KtExpression, withDefaultValue: Boolean, parametersUsages: MultiMap<KtElement, KtElement>, occurrencesToReplace: List<KotlinPsiRange>, parametersToRemove: List<KtElement> = ..., occurrenceReplacer: IntroduceParameterDescriptor.(KotlinPsiRange) -> Unit = ...) defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.IntroduceParameterDescriptor[ClassConstructorDescriptorImpl]

'originalRange' @ [466:37] ==> val originalRange: KotlinPsiRange defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceLambdaParameterHandler.extractLambdaHelper.<no name provided>.createDialog[LocalVariableDescriptor]

'callable' @ [467:32] ==> val callable: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceLambdaParameterHandler.extractLambdaHelper.<no name provided>.createDialog[LocalVariableDescriptor]

'callableDescriptor' @ [468:42] ==> val callableDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceLambdaParameterHandler.extractLambdaHelper.<no name provided>.createDialog[LocalVariableDescriptor]

'KtPsiFactory' @ [471:37] ==> @JvmOverloads public constructor KtPsiFactory(project: Project, markGenerated: Boolean = ...) defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedClassConstructorDescriptor]

'project' @ [471:50] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceLambdaParameterHandler.extractLambdaHelper.<no name provided>.createDialog[ValueParameterDescriptorImpl]

'createExpression' @ [471:59] ==> public final fun createExpression(text: String): KtExpression defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'parametersUsages' @ [473:40] ==> val parametersUsages: MultiMap<KtElement, KtElement> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceLambdaParameterHandler.extractLambdaHelper.<no name provided>.createDialog[LocalVariableDescriptor]

'listOf' @ [474:44] ==> public fun <T> listOf(element: KotlinPsiRange): List<KotlinPsiRange> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinPsiRange

'originalRange' @ [474:51] ==> val originalRange: KotlinPsiRange defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceLambdaParameterHandler.extractLambdaHelper.<no name provided>.createDialog[LocalVariableDescriptor]

'listOf' @ [475:42] ==> @InlineOnly public inline fun <T> listOf(): List<KtElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtElement

'KotlinIntroduceParameterDialog' @ [478:20] ==> public constructor KotlinIntroduceParameterDialog(project: Project, editor: Editor, introduceParameterDescriptor: IntroduceParameterDescriptor, lambdaExtractionDescriptor: ExtractableCodeDescriptor, helper: KotlinIntroduceParameterHelper) defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterDialog[ClassConstructorDescriptorImpl]

'project' @ [478:51] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceLambdaParameterHandler.extractLambdaHelper.<no name provided>.createDialog[ValueParameterDescriptorImpl]

'editor' @ [478:60] ==> value-parameter editor: Editor defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceLambdaParameterHandler.extractLambdaHelper.<no name provided>.createDialog[ValueParameterDescriptorImpl]

'introduceParameterDescriptor' @ [478:68] ==> val introduceParameterDescriptor: IntroduceParameterDescriptor defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceLambdaParameterHandler.extractLambdaHelper.<no name provided>.createDialog[LocalVariableDescriptor]

'lambdaExtractionDescriptor' @ [478:98] ==> value-parameter lambdaExtractionDescriptor: ExtractableCodeDescriptor defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceLambdaParameterHandler.extractLambdaHelper.<no name provided>.createDialog[ValueParameterDescriptorImpl]

'helper' @ [478:126] ==> value-parameter helper: KotlinIntroduceLambdaParameterHelper = ... defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceLambdaParameterHandler.<init>[ValueParameterDescriptorImpl]

'helper' @ [487:46] ==> value-parameter helper: KotlinIntroduceLambdaParameterHelper = ... defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceLambdaParameterHandler.<init>[ValueParameterDescriptorImpl]

'configureExtractLambda' @ [487:53] ==> public open fun configureExtractLambda(descriptor: ExtractableCodeDescriptor): ExtractableCodeDescriptor defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceLambdaParameterHelper[SimpleFunctionDescriptorImpl]

'descriptorWithConflicts' @ [487:76] ==> value-parameter descriptorWithConflicts: ExtractableCodeDescriptorWithConflicts defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceLambdaParameterHandler.extractLambdaHelper.<no name provided>.configureAndRun[ValueParameterDescriptorImpl]

'descriptor' @ [487:100] ==> public final val descriptor: ExtractableCodeDescriptor defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractableCodeDescriptorWithConflicts[PropertyDescriptorImpl]

'!' @ [488:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'ExtractionTarget' @ [488:18] ==> public companion object defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionTarget[FakeCallableDescriptorForObject]

'isAvailable' @ [488:60] ==> public abstract fun isAvailable(descriptor: ExtractableCodeDescriptor): Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionTarget[SimpleFunctionDescriptorImpl]

'lambdaExtractionDescriptor' @ [488:72] ==> val lambdaExtractionDescriptor: ExtractableCodeDescriptor defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceLambdaParameterHandler.extractLambdaHelper.<no name provided>.configureAndRun[LocalVariableDescriptor]

'showErrorHint' @ [489:17] ==> public fun showErrorHint(project: Project, editor: Editor, message: String, title: String): Unit defined in org.jetbrains.kotlin.idea.refactoring.introduce in file introduceUtil.kt[SimpleFunctionDescriptorImpl]

'project' @ [489:31] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceLambdaParameterHandler.extractLambdaHelper.<no name provided>.configureAndRun[ValueParameterDescriptorImpl]

'editor' @ [489:40] ==> value-parameter editor: Editor defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceLambdaParameterHandler.extractLambdaHelper.<no name provided>.configureAndRun[ValueParameterDescriptorImpl]

'INTRODUCE_LAMBDA_PARAMETER' @ [489:104] ==> public val INTRODUCE_LAMBDA_PARAMETER: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter in file KotlinIntroduceParameterHandler.kt[PropertyDescriptorImpl]

'createDialog' @ [493:26] ==> private final fun createDialog(project: Project, editor: Editor, lambdaExtractionDescriptor: ExtractableCodeDescriptor): KotlinIntroduceParameterDialog? defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceLambdaParameterHandler.extractLambdaHelper.<no name provided>[SimpleFunctionDescriptorImpl]

'project' @ [493:39] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceLambdaParameterHandler.extractLambdaHelper.<no name provided>.configureAndRun[ValueParameterDescriptorImpl]

'editor' @ [493:48] ==> value-parameter editor: Editor defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceLambdaParameterHandler.extractLambdaHelper.<no name provided>.configureAndRun[ValueParameterDescriptorImpl]

'lambdaExtractionDescriptor' @ [493:56] ==> val lambdaExtractionDescriptor: ExtractableCodeDescriptor defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceLambdaParameterHandler.extractLambdaHelper.<no name provided>.configureAndRun[LocalVariableDescriptor]

'if (ApplicationManager.getApplication()!!.isUnitTestMode) {
                dialog.performRefactoring()
            }
            else {
                dialog.show()
            }' @ [494:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'!!' @ [494:17] ==> public final fun <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-EXCLEXCL-RESOLVE>`(baseExpr: Application?): Application[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> -> Application

'getApplication' @ [494:36] ==> public open fun getApplication(): (Application..Application?) defined in com.intellij.openapi.application.ApplicationManager[JavaMethodDescriptor]

'isUnitTestMode' @ [494:55] ==> public final val Application.isUnitTestMode: Boolean[MyPropertyDescriptor]

'dialog' @ [495:17] ==> val dialog: KotlinIntroduceParameterDialog defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceLambdaParameterHandler.extractLambdaHelper.<no name provided>.configureAndRun[LocalVariableDescriptor]

'performRefactoring' @ [495:24] ==> public final fun performRefactoring(): Unit defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterDialog[SimpleFunctionDescriptorImpl]

'dialog' @ [498:17] ==> val dialog: KotlinIntroduceParameterDialog defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceLambdaParameterHandler.extractLambdaHelper.<no name provided>.configureAndRun[LocalVariableDescriptor]

'show' @ [498:24] ==> public open fun show(): Unit defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceParameterDialog[JavaMethodDescriptor]

'when (targetParent) {
                    is KtFunction -> targetParent.bodyExpression
                    is KtClass -> targetParent.getBody()
                    else -> null
                }' @ [505:17] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: KtElement?, entry1: KtElement?, entry2: KtElement?): KtElement?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> KtElement?

'targetParent' @ [505:23] ==> value-parameter targetParent: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceLambdaParameterHandler.invoke[ValueParameterDescriptorImpl]

'targetParent' @ [506:38] ==> value-parameter targetParent: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceLambdaParameterHandler.invoke[ValueParameterDescriptorImpl]

'bodyExpression' @ [506:51] ==> public final val KtFunction.bodyExpression: KtExpression?[MyPropertyDescriptor]

'targetParent' @ [507:35] ==> value-parameter targetParent: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceLambdaParameterHandler.invoke[ValueParameterDescriptorImpl]

'getBody' @ [507:48] ==> public final fun getBody(): KtClassBody? defined in org.jetbrains.kotlin.psi.KtClass[DeserializedSimpleFunctionDescriptor]

'AssertionError' @ [509:28] ==> public final fun <init>(p0: (Any..Any?)): AssertionError /* = AssertionError */ defined in kotlin.AssertionError[TypeAliasConstructorDescriptorImpl]

'targetParent' @ [509:73] ==> value-parameter targetParent: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceLambdaParameterHandler.invoke[ValueParameterDescriptorImpl]

'getElementTextWithContext' @ [509:86] ==> public fun PsiElement.getElementTextWithContext(): String defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'ExtractionData' @ [510:30] ==> public constructor ExtractionData(originalFile: KtFile, originalRange: KotlinPsiRange, targetSibling: PsiElement, duplicateContainer: PsiElement? = ..., options: ExtractionOptions = ...) defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData[ClassConstructorDescriptorImpl]

'targetParent' @ [510:45] ==> value-parameter targetParent: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceLambdaParameterHandler.invoke[ValueParameterDescriptorImpl]

'containingKtFile' @ [510:58] ==> public final val KtNamedDeclaration.containingKtFile: KtFile[MyPropertyDescriptor]

'expression' @ [511:45] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceLambdaParameterHandler.invoke[ValueParameterDescriptorImpl]

'toRange' @ [511:56] ==> public fun PsiElement?.toRange(): KotlinPsiRange defined in org.jetbrains.kotlin.idea.util.psi.patternMatching[DeserializedSimpleFunctionDescriptor]

'targetParent' @ [512:45] ==> value-parameter targetParent: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceLambdaParameterHandler.invoke[ValueParameterDescriptorImpl]

'duplicateContainer' @ [513:45] ==> val duplicateContainer: KtElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceLambdaParameterHandler.invoke[LocalVariableDescriptor]

'DEFAULT' @ [514:63] ==> public final val DEFAULT: ExtractionOptions defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionOptions.Companion[PropertyDescriptorImpl]

'ExtractionEngine' @ [515:9] ==> public constructor ExtractionEngine(helper: ExtractionEngineHelper) defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionEngine[ClassConstructorDescriptorImpl]

'extractLambdaHelper' @ [515:26] ==> private final val extractLambdaHelper: <no name provided> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceLambdaParameterHandler[PropertyDescriptorImpl]

'run' @ [515:47] ==> public final fun run(editor: Editor, extractionData: ExtractionData, onFinish: (ExtractionResult) -> Unit = ...): Unit defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionEngine[SimpleFunctionDescriptorImpl]

'editor' @ [515:51] ==> value-parameter editor: Editor defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceLambdaParameterHandler.invoke[ValueParameterDescriptorImpl]

'extractionData' @ [515:59] ==> val extractionData: ExtractionData defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceParameter.KotlinIntroduceLambdaParameterHandler.invoke[LocalVariableDescriptor]

