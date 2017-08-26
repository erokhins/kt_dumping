'IntentionBasedInspection<KtDeclaration>' @ [48:31] ==> public constructor IntentionBasedInspection<TElement : PsiElement>(intention: KClass<out SelfTargetingRangeIntention<KtDeclaration>>, additionalChecker: (KtDeclaration, IntentionBasedInspection<KtDeclaration>) -> Boolean, problemText: String? = ...) defined in org.jetbrains.kotlin.idea.inspections.IntentionBasedInspection[DeserializedClassConstructorDescriptor]
Inferred types:
    <TElement : PsiElement> -> KtDeclaration

'DestructureIntention' @ [49:9] ==> public companion object defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention[FakeCallableDescriptorForObject]

'DestructureIntention' @ [51:34] ==> public companion object defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention[FakeCallableDescriptorForObject]

'collectUsagesToRemove' @ [51:55] ==> internal final fun collectUsagesToRemove(declaration: KtDeclaration): DestructureIntention.Companion.UsagesToRemove? defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.Companion[SimpleFunctionDescriptorImpl]

'element' @ [51:77] ==> value-parameter element: KtDeclaration defined in org.jetbrains.kotlin.idea.intentions.DestructureInspection.<init>.<anonymous>[ValueParameterDescriptorImpl]

'data' @ [51:87] ==> public final val data: List<DestructureIntention.Companion.UsageData> defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.Companion.UsagesToRemove[PropertyDescriptorImpl]

'if (element is KtParameter) {
                usagesToRemove != null &&
                (usagesToRemove.any { it.declarationToDrop is KtDestructuringDeclaration } ||
                 usagesToRemove.filter { it.usagesToReplace.isNotEmpty() }.size > usagesToRemove.size / 2)
            }
            else {
                usagesToRemove?.any { it.declarationToDrop is KtDestructuringDeclaration } ?: false
            }' @ [52:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Boolean, elseBranch: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Boolean

'element' @ [52:17] ==> value-parameter element: KtDeclaration defined in org.jetbrains.kotlin.idea.intentions.DestructureInspection.<init>.<anonymous>[ValueParameterDescriptorImpl]

'usagesToRemove' @ [53:17] ==> val usagesToRemove: List<DestructureIntention.Companion.UsageData>? defined in org.jetbrains.kotlin.idea.intentions.DestructureInspection.<init>.<anonymous>[LocalVariableDescriptor]

'usagesToRemove' @ [54:18] ==> val usagesToRemove: List<DestructureIntention.Companion.UsageData>? defined in org.jetbrains.kotlin.idea.intentions.DestructureInspection.<init>.<anonymous>[LocalVariableDescriptor]

'any' @ [54:33] ==> public inline fun <T> Iterable<DestructureIntention.Companion.UsageData>.any(predicate: (DestructureIntention.Companion.UsageData) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> UsageData

'it' @ [54:39] ==> value-parameter it: DestructureIntention.Companion.UsageData defined in org.jetbrains.kotlin.idea.intentions.DestructureInspection.<init>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'declarationToDrop' @ [54:42] ==> public final var declarationToDrop: KtDeclaration? defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.Companion.UsageData[PropertyDescriptorImpl]

'usagesToRemove' @ [55:18] ==> val usagesToRemove: List<DestructureIntention.Companion.UsageData>? defined in org.jetbrains.kotlin.idea.intentions.DestructureInspection.<init>.<anonymous>[LocalVariableDescriptor]

'filter' @ [55:33] ==> public inline fun <T> Iterable<DestructureIntention.Companion.UsageData>.filter(predicate: (DestructureIntention.Companion.UsageData) -> Boolean): List<DestructureIntention.Companion.UsageData> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> UsageData

'it' @ [55:42] ==> value-parameter it: DestructureIntention.Companion.UsageData defined in org.jetbrains.kotlin.idea.intentions.DestructureInspection.<init>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'usagesToReplace' @ [55:45] ==> public final val usagesToReplace: MutableList<KtExpression> defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.Companion.UsageData[PropertyDescriptorImpl]

'isNotEmpty' @ [55:61] ==> @InlineOnly public inline fun <T> Collection<KtExpression>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression

'size' @ [55:76] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'usagesToRemove' @ [55:83] ==> val usagesToRemove: List<DestructureIntention.Companion.UsageData>? defined in org.jetbrains.kotlin.idea.intentions.DestructureInspection.<init>.<anonymous>[LocalVariableDescriptor]

'size' @ [55:98] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'usagesToRemove' @ [58:17] ==> val usagesToRemove: List<DestructureIntention.Companion.UsageData>? defined in org.jetbrains.kotlin.idea.intentions.DestructureInspection.<init>.<anonymous>[LocalVariableDescriptor]

'any' @ [58:33] ==> public inline fun <T> Iterable<DestructureIntention.Companion.UsageData>.any(predicate: (DestructureIntention.Companion.UsageData) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> UsageData

'it' @ [58:39] ==> value-parameter it: DestructureIntention.Companion.UsageData defined in org.jetbrains.kotlin.idea.intentions.DestructureInspection.<init>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'declarationToDrop' @ [58:42] ==> public final var declarationToDrop: KtDeclaration? defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.Companion.UsageData[PropertyDescriptorImpl]

'SelfTargetingRangeIntention<KtDeclaration>' @ [63:30] ==> public constructor SelfTargetingRangeIntention<TElement : PsiElement>(elementType: Class<KtDeclaration>, text: String, familyName: String = ...) defined in org.jetbrains.kotlin.idea.intentions.SelfTargetingRangeIntention[DeserializedClassConstructorDescriptor]
Inferred types:
    <TElement : PsiElement> -> KtDeclaration

'java' @ [64:30] ==> public val <T> KClass<KtDeclaration>.java: Class<KtDeclaration> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtDeclaration

'component1' @ [68:14] ==> public final operator fun component1(): List<DestructureIntention.Companion.UsageData> defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.Companion.UsagesToRemove[SimpleFunctionDescriptorImpl]

'component2' @ [68:30] ==> public final operator fun component2(): Boolean defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.Companion.UsagesToRemove[SimpleFunctionDescriptorImpl]

'collectUsagesToRemove' @ [68:59] ==> internal final fun collectUsagesToRemove(declaration: KtDeclaration): DestructureIntention.Companion.UsagesToRemove? defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.Companion[SimpleFunctionDescriptorImpl]

'element' @ [68:81] ==> value-parameter element: KtDeclaration defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.applyTo[ValueParameterDescriptorImpl]

'KtPsiFactory' @ [70:23] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'element' @ [70:36] ==> value-parameter element: KtDeclaration defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.applyTo[ValueParameterDescriptorImpl]

'NewDeclarationNameValidator' @ [71:25] ==> public constructor NewDeclarationNameValidator(container: PsiElement, anchor: PsiElement?, target: NewDeclarationNameValidator.Target, excludedDeclarations: List<KtDeclaration> = ...) defined in org.jetbrains.kotlin.idea.core.NewDeclarationNameValidator[DeserializedClassConstructorDescriptor]

'element' @ [72:29] ==> value-parameter element: KtDeclaration defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.applyTo[ValueParameterDescriptorImpl]

'parent' @ [72:37] ==> public final val KtDeclaration.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'element' @ [72:54] ==> value-parameter element: KtDeclaration defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.applyTo[ValueParameterDescriptorImpl]

'VARIABLES' @ [72:107] ==> enum entry VARIABLES defined in org.jetbrains.kotlin.idea.core.NewDeclarationNameValidator.Target[FakeCallableDescriptorForObject]

'usagesToRemove' @ [73:40] ==> val usagesToRemove: List<DestructureIntention.Companion.UsageData> defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.applyTo[LocalVariableDescriptor]

'map' @ [73:55] ==> public inline fun <T, R> Iterable<DestructureIntention.Companion.UsageData>.map(transform: (DestructureIntention.Companion.UsageData) -> List<KtDeclaration>): List<List<KtDeclaration>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> UsageData
    <R> -> List<KtDeclaration>

'listOfNotNull' @ [73:61] ==> public fun <T : Any> listOfNotNull(element: KtDeclaration?): List<KtDeclaration> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> KtDeclaration

'it' @ [73:75] ==> value-parameter it: DestructureIntention.Companion.UsageData defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.applyTo.<anonymous>[ValueParameterDescriptorImpl]

'declarationToDrop' @ [73:78] ==> public final var declarationToDrop: KtDeclaration? defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.Companion.UsageData[PropertyDescriptorImpl]

'flatten' @ [73:99] ==> public fun <T> Iterable<Iterable<KtDeclaration>>.flatten(): List<KtDeclaration> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtDeclaration

'ArrayList' @ [75:21] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> String

'element' @ [76:35] ==> value-parameter element: KtDeclaration defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.applyTo[ValueParameterDescriptorImpl]

'languageVersionSettings' @ [76:43] ==> public val KtElement.languageVersionSettings: LanguageVersionSettings defined in org.jetbrains.kotlin.idea.project[DeserializedPropertyDescriptor]

'supportsFeature' @ [76:67] ==> public open fun supportsFeature(feature: LanguageFeature): Boolean defined in org.jetbrains.kotlin.config.LanguageVersionSettings[DeserializedSimpleFunctionDescriptor]

'SingleUnderscoreForParameterName' @ [76:99] ==> enum entry SingleUnderscoreForParameterName defined in org.jetbrains.kotlin.config.LanguageFeature[FakeCallableDescriptorForObject]

'usagesToRemove' @ [78:25] ==> val usagesToRemove: List<DestructureIntention.Companion.UsageData> defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.applyTo[LocalVariableDescriptor]

'all' @ [78:40] ==> public inline fun <T> Iterable<DestructureIntention.Companion.UsageData>.all(predicate: (DestructureIntention.Companion.UsageData) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> UsageData

'component1' @ [78:47] ==> public final operator fun component1(): CallableDescriptor defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.Companion.UsageData[SimpleFunctionDescriptorImpl]

'component2' @ [78:50] ==> public final operator fun component2(): MutableList<KtExpression> defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.Companion.UsageData[SimpleFunctionDescriptorImpl]

'component3' @ [78:67] ==> public final operator fun component3(): KtDeclaration? defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.Companion.UsageData[SimpleFunctionDescriptorImpl]

'usagesToReplace' @ [79:13] ==> val usagesToReplace: MutableList<KtExpression> defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.applyTo.<anonymous>[LocalVariableDescriptor]

'isEmpty' @ [79:29] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'variableToDrop' @ [79:42] ==> val variableToDrop: KtDeclaration? defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.applyTo.<anonymous>[LocalVariableDescriptor]

'usagesToRemove' @ [82:9] ==> val usagesToRemove: List<DestructureIntention.Companion.UsageData> defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.applyTo[LocalVariableDescriptor]

'forEach' @ [82:24] ==> @HidesMembers public inline fun <T> Iterable<DestructureIntention.Companion.UsageData>.forEach(action: (DestructureIntention.Companion.UsageData) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> UsageData

'component1' @ [82:35] ==> public final operator fun component1(): CallableDescriptor defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.Companion.UsageData[SimpleFunctionDescriptorImpl]

'component2' @ [82:47] ==> public final operator fun component2(): MutableList<KtExpression> defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.Companion.UsageData[SimpleFunctionDescriptorImpl]

'component3' @ [82:64] ==> public final operator fun component3(): KtDeclaration? defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.Companion.UsageData[SimpleFunctionDescriptorImpl]

'component4' @ [82:80] ==> public final operator fun component4(): String? defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.Companion.UsageData[SimpleFunctionDescriptorImpl]

'if (usagesToReplace.isEmpty() && variableToDrop == null && underscoreSupported && !allUnused) {
                        "_"
                    }
                    else {
                        name ?: KotlinNameSuggester.suggestNameByName(descriptor.name.asString(), validator)
                    }' @ [84:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'usagesToReplace' @ [84:25] ==> val usagesToReplace: MutableList<KtExpression> defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.applyTo.<anonymous>[LocalVariableDescriptor]

'isEmpty' @ [84:41] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'variableToDrop' @ [84:54] ==> val variableToDrop: KtDeclaration? defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.applyTo.<anonymous>[LocalVariableDescriptor]

'underscoreSupported' @ [84:80] ==> val underscoreSupported: Boolean defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.applyTo[LocalVariableDescriptor]

'!' @ [84:103] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'allUnused' @ [84:104] ==> val allUnused: Boolean defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.applyTo[LocalVariableDescriptor]

'name' @ [88:25] ==> val name: String? defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.applyTo.<anonymous>[LocalVariableDescriptor]

'suggestNameByName' @ [88:53] ==> public final fun suggestNameByName(name: String, validator: (String) -> Boolean): String defined in org.jetbrains.kotlin.idea.core.KotlinNameSuggester[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [88:71] ==> val descriptor: CallableDescriptor defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.applyTo.<anonymous>[LocalVariableDescriptor]

'name' @ [88:82] ==> public final val CallableDescriptor.name: Name[MyPropertyDescriptor]

'asString' @ [88:87] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'validator' @ [88:99] ==> val validator: NewDeclarationNameValidator defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.applyTo[LocalVariableDescriptor]

'variableToDrop' @ [90:13] ==> val variableToDrop: KtDeclaration? defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.applyTo.<anonymous>[LocalVariableDescriptor]

'delete' @ [90:29] ==> public abstract fun delete(): Unit defined in org.jetbrains.kotlin.psi.KtDeclaration[JavaMethodDescriptor]

'usagesToReplace' @ [91:13] ==> val usagesToReplace: MutableList<KtExpression> defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.applyTo.<anonymous>[LocalVariableDescriptor]

'forEach' @ [91:29] ==> @HidesMembers public inline fun <T> Iterable<KtExpression>.forEach(action: (KtExpression) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression

'it' @ [92:17] ==> value-parameter it: KtExpression defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.applyTo.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'replace' @ [92:20] ==> public abstract fun replace(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtExpression[JavaMethodDescriptor]

'factory' @ [92:28] ==> val factory: KtPsiFactory defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.applyTo[LocalVariableDescriptor]

'createExpression' @ [92:36] ==> public final fun createExpression(text: String): KtExpression defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'suggestedName' @ [92:53] ==> val suggestedName: String defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.applyTo.<anonymous>[LocalVariableDescriptor]

'names' @ [94:13] ==> val names: ArrayList<String> defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.applyTo[LocalVariableDescriptor]

'add' @ [94:19] ==> public open fun add(element: String): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'suggestedName' @ [94:23] ==> val suggestedName: String defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.applyTo.<anonymous>[LocalVariableDescriptor]

'names' @ [97:27] ==> val names: ArrayList<String> defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.applyTo[LocalVariableDescriptor]

'joinToString' @ [97:33] ==> public fun <T> Iterable<String>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((String) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'when (element) {
            is KtParameter -> {
                val loopRange = (element.parent as? KtForExpression)?.loopRange
                element.replace(factory.createDestructuringParameter("($joinedNames)"))
                if (removeSelectorInLoopRange && loopRange is KtDotQualifiedExpression) {
                    loopRange.replace(loopRange.receiverExpression)
                }
            }

            is KtFunctionLiteral -> {
                val lambda = element.parent as KtLambdaExpression
                SpecifyExplicitLambdaSignatureIntention().applyTo(lambda, editor)
                lambda.functionLiteral.valueParameters.singleOrNull()?.replace(
                        factory.createDestructuringParameter("($joinedNames)")
                )
            }

            is KtVariableDeclaration -> {
                val rangeAfterEq = PsiChildRange(element.initializer, element.lastChild)
                val modifierList = element.modifierList
                if (modifierList == null) {
                    element.replace(factory.createDestructuringDeclarationByPattern(
                            "val ($joinedNames) = $0", rangeAfterEq))
                }
                else {
                    val rangeBeforeVal = PsiChildRange(element.firstChild, modifierList)
                    element.replace(factory.createDestructuringDeclarationByPattern(
                            "$0:'@xyz' val ($joinedNames) = $1", rangeBeforeVal, rangeAfterEq))
                }
            }
        }' @ [98:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Any?, entry1: Any?, entry2: Any?): Any?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Any?

'element' @ [98:15] ==> value-parameter element: KtDeclaration defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.applyTo[ValueParameterDescriptorImpl]

'element' @ [100:34] ==> value-parameter element: KtDeclaration defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.applyTo[ValueParameterDescriptorImpl]

'parent' @ [100:42] ==> public final val KtParameter.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'loopRange' @ [100:71] ==> public final val KtForExpression.loopRange: KtExpression?[MyPropertyDescriptor]

'element' @ [101:17] ==> value-parameter element: KtDeclaration defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.applyTo[ValueParameterDescriptorImpl]

'replace' @ [101:25] ==> public abstract fun replace(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtDeclaration[JavaMethodDescriptor]

'factory' @ [101:33] ==> val factory: KtPsiFactory defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.applyTo[LocalVariableDescriptor]

'createDestructuringParameter' @ [101:41] ==> public final fun createDestructuringParameter(text: String): KtParameter defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'joinedNames' @ [101:73] ==> val joinedNames: String defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.applyTo[LocalVariableDescriptor]

'removeSelectorInLoopRange' @ [102:21] ==> val removeSelectorInLoopRange: Boolean defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.applyTo[LocalVariableDescriptor]

'loopRange' @ [102:50] ==> val loopRange: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.applyTo[LocalVariableDescriptor]

'loopRange' @ [103:21] ==> val loopRange: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.applyTo[LocalVariableDescriptor]

'replace' @ [103:31] ==> @NotNull public open fun replace(@NotNull p0: PsiElement): PsiElement defined in org.jetbrains.kotlin.psi.KtDotQualifiedExpression[JavaMethodDescriptor]

'loopRange' @ [103:39] ==> val loopRange: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.applyTo[LocalVariableDescriptor]

'receiverExpression' @ [103:49] ==> public open val receiverExpression: KtExpression defined in org.jetbrains.kotlin.psi.KtDotQualifiedExpression[DeserializedPropertyDescriptor]

'element' @ [108:30] ==> value-parameter element: KtDeclaration defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.applyTo[ValueParameterDescriptorImpl]

'parent' @ [108:38] ==> public final val KtFunctionLiteral.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'SpecifyExplicitLambdaSignatureIntention' @ [109:17] ==> public constructor SpecifyExplicitLambdaSignatureIntention() defined in org.jetbrains.kotlin.idea.intentions.SpecifyExplicitLambdaSignatureIntention[ClassConstructorDescriptorImpl]

'applyTo' @ [109:59] ==> public open fun applyTo(element: KtLambdaExpression, editor: Editor?): Unit defined in org.jetbrains.kotlin.idea.intentions.SpecifyExplicitLambdaSignatureIntention[SimpleFunctionDescriptorImpl]

'lambda' @ [109:67] ==> val lambda: KtLambdaExpression defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.applyTo[LocalVariableDescriptor]

'editor' @ [109:75] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.applyTo[ValueParameterDescriptorImpl]

'lambda' @ [110:17] ==> val lambda: KtLambdaExpression defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.applyTo[LocalVariableDescriptor]

'functionLiteral' @ [110:24] ==> public final val KtLambdaExpression.functionLiteral: KtFunctionLiteral[MyPropertyDescriptor]

'valueParameters' @ [110:40] ==> public final val KtFunctionLiteral.valueParameters: (MutableList<(KtParameter..KtParameter?)>..List<(KtParameter..KtParameter?)>)[MyPropertyDescriptor]

'singleOrNull' @ [110:56] ==> public fun <T> List<(KtParameter..KtParameter?)>.singleOrNull(): KtParameter? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtParameter..org.jetbrains.kotlin.psi.KtParameter?)

'replace' @ [110:72] ==> public open fun replace(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtParameter[JavaMethodDescriptor]

'factory' @ [111:25] ==> val factory: KtPsiFactory defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.applyTo[LocalVariableDescriptor]

'createDestructuringParameter' @ [111:33] ==> public final fun createDestructuringParameter(text: String): KtParameter defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'joinedNames' @ [111:65] ==> val joinedNames: String defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.applyTo[LocalVariableDescriptor]

'PsiChildRange' @ [116:36] ==> public constructor PsiChildRange(first: PsiElement?, last: PsiElement?) defined in org.jetbrains.kotlin.psi.psiUtil.PsiChildRange[DeserializedClassConstructorDescriptor]

'element' @ [116:50] ==> value-parameter element: KtDeclaration defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.applyTo[ValueParameterDescriptorImpl]

'initializer' @ [116:58] ==> public final val KtVariableDeclaration.initializer: KtExpression?[MyPropertyDescriptor]

'element' @ [116:71] ==> value-parameter element: KtDeclaration defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.applyTo[ValueParameterDescriptorImpl]

'lastChild' @ [116:79] ==> public final val KtVariableDeclaration.lastChild: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'element' @ [117:36] ==> value-parameter element: KtDeclaration defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.applyTo[ValueParameterDescriptorImpl]

'modifierList' @ [117:44] ==> public final val KtVariableDeclaration.modifierList: KtModifierList?[MyPropertyDescriptor]

'if (modifierList == null) {
                    element.replace(factory.createDestructuringDeclarationByPattern(
                            "val ($joinedNames) = $0", rangeAfterEq))
                }
                else {
                    val rangeBeforeVal = PsiChildRange(element.firstChild, modifierList)
                    element.replace(factory.createDestructuringDeclarationByPattern(
                            "$0:'@xyz' val ($joinedNames) = $1", rangeBeforeVal, rangeAfterEq))
                }' @ [118:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (PsiElement..PsiElement?), elseBranch: (PsiElement..PsiElement?)): (PsiElement..PsiElement?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)

'modifierList' @ [118:21] ==> val modifierList: KtModifierList? defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.applyTo[LocalVariableDescriptor]

'element' @ [119:21] ==> value-parameter element: KtDeclaration defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.applyTo[ValueParameterDescriptorImpl]

'replace' @ [119:29] ==> public abstract fun replace(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtDeclaration[JavaMethodDescriptor]

'factory' @ [119:37] ==> val factory: KtPsiFactory defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.applyTo[LocalVariableDescriptor]

'createDestructuringDeclarationByPattern' @ [119:45] ==> public fun KtPsiFactory.createDestructuringDeclarationByPattern(pattern: String, vararg args: Any, reformat: Boolean = ...): KtDestructuringDeclaration defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'joinedNames' @ [120:36] ==> val joinedNames: String defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.applyTo[LocalVariableDescriptor]

'rangeAfterEq' @ [120:56] ==> val rangeAfterEq: PsiChildRange defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.applyTo[LocalVariableDescriptor]

'PsiChildRange' @ [123:42] ==> public constructor PsiChildRange(first: PsiElement?, last: PsiElement?) defined in org.jetbrains.kotlin.psi.psiUtil.PsiChildRange[DeserializedClassConstructorDescriptor]

'element' @ [123:56] ==> value-parameter element: KtDeclaration defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.applyTo[ValueParameterDescriptorImpl]

'firstChild' @ [123:64] ==> public final val KtVariableDeclaration.firstChild: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'modifierList' @ [123:76] ==> val modifierList: KtModifierList? defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.applyTo[LocalVariableDescriptor]

'element' @ [124:21] ==> value-parameter element: KtDeclaration defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.applyTo[ValueParameterDescriptorImpl]

'replace' @ [124:29] ==> public abstract fun replace(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtDeclaration[JavaMethodDescriptor]

'factory' @ [124:37] ==> val factory: KtPsiFactory defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.applyTo[LocalVariableDescriptor]

'createDestructuringDeclarationByPattern' @ [124:45] ==> public fun KtPsiFactory.createDestructuringDeclarationByPattern(pattern: String, vararg args: Any, reformat: Boolean = ...): KtDestructuringDeclaration defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'joinedNames' @ [125:46] ==> val joinedNames: String defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.applyTo[LocalVariableDescriptor]

'rangeBeforeVal' @ [125:66] ==> val rangeBeforeVal: PsiChildRange defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.applyTo[LocalVariableDescriptor]

'rangeAfterEq' @ [125:82] ==> val rangeAfterEq: PsiChildRange defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.applyTo[LocalVariableDescriptor]

'!' @ [132:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'element' @ [132:14] ==> value-parameter element: KtDeclaration defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.applicabilityRange[ValueParameterDescriptorImpl]

'isSuitableDeclaration' @ [132:22] ==> internal final fun KtDeclaration.isSuitableDeclaration(): Boolean defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.Companion[SimpleFunctionDescriptorImpl]

'collectUsagesToRemove' @ [134:30] ==> internal final fun collectUsagesToRemove(declaration: KtDeclaration): DestructureIntention.Companion.UsagesToRemove? defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.Companion[SimpleFunctionDescriptorImpl]

'element' @ [134:52] ==> value-parameter element: KtDeclaration defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.applicabilityRange[ValueParameterDescriptorImpl]

'data' @ [134:62] ==> public final val data: List<DestructureIntention.Companion.UsageData> defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.Companion.UsagesToRemove[PropertyDescriptorImpl]

'usagesToRemove' @ [135:13] ==> val usagesToRemove: List<DestructureIntention.Companion.UsageData> defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.applicabilityRange[LocalVariableDescriptor]

'isEmpty' @ [135:28] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'when (element) {
            is KtFunctionLiteral -> element.lBrace.textRange
            is KtNamedDeclaration -> element.nameIdentifier?.textRange
            else -> null
        }' @ [137:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: TextRange?, entry1: TextRange?, entry2: TextRange?): TextRange?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> TextRange?

'element' @ [137:22] ==> value-parameter element: KtDeclaration defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.applicabilityRange[ValueParameterDescriptorImpl]

'element' @ [138:37] ==> value-parameter element: KtDeclaration defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.applicabilityRange[ValueParameterDescriptorImpl]

'lBrace' @ [138:45] ==> public final val KtFunctionLiteral.lBrace: PsiElement[MyPropertyDescriptor]

'textRange' @ [138:52] ==> public final val PsiElement.textRange: (TextRange..TextRange?)[MyPropertyDescriptor]

'element' @ [139:38] ==> value-parameter element: KtDeclaration defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.applicabilityRange[ValueParameterDescriptorImpl]

'nameIdentifier' @ [139:46] ==> public final val KtNamedDeclaration.nameIdentifier: PsiElement?[MyPropertyDescriptor]

'textRange' @ [139:62] ==> public final val PsiElement.textRange: (TextRange..TextRange?)[MyPropertyDescriptor]

'getUsageScopeElement' @ [146:62] ==> private final fun KtDeclaration.getUsageScopeElement(): PsiElement? defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.Companion[SimpleFunctionDescriptorImpl]

'languageVersionSettings' @ [149:35] ==> public val KtElement.languageVersionSettings: LanguageVersionSettings defined in org.jetbrains.kotlin.idea.project[DeserializedPropertyDescriptor]

'supportsFeature' @ [149:59] ==> public open fun supportsFeature(feature: LanguageFeature): Boolean defined in org.jetbrains.kotlin.config.LanguageVersionSettings[DeserializedSimpleFunctionDescriptor]

'DestructuringLambdaParameters' @ [149:91] ==> enum entry DestructuringLambdaParameters defined in org.jetbrains.kotlin.config.LanguageFeature[FakeCallableDescriptorForObject]

'when (this) {
                is KtParameter -> {
                    val parent = parent
                    when {
                        parent is KtForExpression -> parent
                        parent.parent is KtFunctionLiteral -> if (lambdaSupported) parent.parent else null
                        else -> null
                    }
                }
                is KtProperty -> parent.takeIf { isLocal }
                is KtFunctionLiteral -> if (!hasParameterSpecification() && lambdaSupported) this else null
                else -> null
            }' @ [150:20] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: PsiElement?, entry1: PsiElement?, entry2: PsiElement?, entry3: PsiElement?): PsiElement?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> PsiElement?

'this' @ [150:26] ==> <this> defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.Companion.getUsageScopeElement[ReceiverParameterDescriptorImpl]

'parent' @ [152:34] ==> public final val KtParameter.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'when {
                        parent is KtForExpression -> parent
                        parent.parent is KtFunctionLiteral -> if (lambdaSupported) parent.parent else null
                        else -> null
                    }' @ [153:21] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: PsiElement?, entry1: PsiElement?, entry2: PsiElement?): PsiElement?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> PsiElement?

'parent' @ [154:25] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.Companion.getUsageScopeElement[LocalVariableDescriptor]

'parent' @ [154:54] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.Companion.getUsageScopeElement[LocalVariableDescriptor]

'parent' @ [155:25] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.Companion.getUsageScopeElement[LocalVariableDescriptor]

'parent' @ [155:32] ==> public final val PsiElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'if (lambdaSupported) parent.parent else null' @ [155:63] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: PsiElement?, elseBranch: PsiElement?): PsiElement?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> PsiElement?

'lambdaSupported' @ [155:67] ==> val lambdaSupported: Boolean defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.Companion.getUsageScopeElement[LocalVariableDescriptor]

'parent' @ [155:84] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.Companion.getUsageScopeElement[LocalVariableDescriptor]

'parent' @ [155:91] ==> public final val PsiElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'parent' @ [159:34] ==> public final val KtProperty.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'takeIf' @ [159:41] ==> @InlineOnly @SinceKotlin public inline fun <T> (PsiElement..PsiElement?).takeIf(predicate: ((PsiElement..PsiElement?)) -> Boolean): PsiElement? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)

'isLocal' @ [159:50] ==> public final val KtProperty.isLocal: Boolean[MyPropertyDescriptor]

'if (!hasParameterSpecification() && lambdaSupported) this else null' @ [160:41] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KtFunctionLiteral?, elseBranch: KtFunctionLiteral?): KtFunctionLiteral?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KtFunctionLiteral?

'!' @ [160:45] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'hasParameterSpecification' @ [160:46] ==> public open fun hasParameterSpecification(): Boolean defined in org.jetbrains.kotlin.psi.KtFunctionLiteral[JavaMethodDescriptor]

'lambdaSupported' @ [160:77] ==> val lambdaSupported: Boolean defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.Companion.getUsageScopeElement[LocalVariableDescriptor]

'this' @ [160:94] ==> <this> defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.Companion.getUsageScopeElement[ReceiverParameterDescriptorImpl]

'declaration' @ [168:27] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.Companion.collectUsagesToRemove[ValueParameterDescriptorImpl]

'analyze' @ [168:39] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'when (declaration) {
                        is KtParameter -> context.get(BindingContext.VALUE_PARAMETER, declaration)
                        is KtFunctionLiteral -> context.get(BindingContext.FUNCTION, declaration)?.valueParameters?.singleOrNull()
                        is KtVariableDeclaration -> context.get(BindingContext.VARIABLE, declaration)
                        else -> null
                    }' @ [171:21] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: VariableDescriptor?, entry1: VariableDescriptor?, entry2: VariableDescriptor?, entry3: VariableDescriptor?): VariableDescriptor?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> VariableDescriptor?

'declaration' @ [171:27] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.Companion.collectUsagesToRemove[ValueParameterDescriptorImpl]

'context' @ [172:43] ==> val context: BindingContext defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.Companion.collectUsagesToRemove[LocalVariableDescriptor]

'get' @ [172:51] ==> @Nullable public abstract operator fun <K : (Any..Any?), V : (Any..Any?)> get(p0: (ReadOnlySlice<(KtParameter..KtParameter?), (VariableDescriptor..VariableDescriptor?)>..ReadOnlySlice<(KtParameter..KtParameter?), (VariableDescriptor..VariableDescriptor?)>?), p1: (KtParameter..KtParameter?)): VariableDescriptor? defined in org.jetbrains.kotlin.resolve.BindingContext[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> (org.jetbrains.kotlin.psi.KtParameter..org.jetbrains.kotlin.psi.KtParameter?)
    <V : (Any..Any?)> -> (org.jetbrains.kotlin.descriptors.VariableDescriptor..org.jetbrains.kotlin.descriptors.VariableDescriptor?)

'VALUE_PARAMETER' @ [172:70] ==> public final val VALUE_PARAMETER: (WritableSlice<(KtParameter..KtParameter?), (VariableDescriptor..VariableDescriptor?)>..WritableSlice<(KtParameter..KtParameter?), (VariableDescriptor..VariableDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'declaration' @ [172:87] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.Companion.collectUsagesToRemove[ValueParameterDescriptorImpl]

'context' @ [173:49] ==> val context: BindingContext defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.Companion.collectUsagesToRemove[LocalVariableDescriptor]

'get' @ [173:57] ==> @Nullable public abstract operator fun <K : (Any..Any?), V : (Any..Any?)> get(p0: (ReadOnlySlice<(PsiElement..PsiElement?), (SimpleFunctionDescriptor..SimpleFunctionDescriptor?)>..ReadOnlySlice<(PsiElement..PsiElement?), (SimpleFunctionDescriptor..SimpleFunctionDescriptor?)>?), p1: (PsiElement..PsiElement?)): SimpleFunctionDescriptor? defined in org.jetbrains.kotlin.resolve.BindingContext[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)
    <V : (Any..Any?)> -> (org.jetbrains.kotlin.descriptors.SimpleFunctionDescriptor..org.jetbrains.kotlin.descriptors.SimpleFunctionDescriptor?)

'FUNCTION' @ [173:76] ==> public final val FUNCTION: (WritableSlice<(PsiElement..PsiElement?), (SimpleFunctionDescriptor..SimpleFunctionDescriptor?)>..WritableSlice<(PsiElement..PsiElement?), (SimpleFunctionDescriptor..SimpleFunctionDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'declaration' @ [173:86] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.Companion.collectUsagesToRemove[ValueParameterDescriptorImpl]

'valueParameters' @ [173:100] ==> public final val SimpleFunctionDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'singleOrNull' @ [173:117] ==> public fun <T> List<(ValueParameterDescriptor..ValueParameterDescriptor?)>.singleOrNull(): ValueParameterDescriptor? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.ValueParameterDescriptor..org.jetbrains.kotlin.descriptors.ValueParameterDescriptor?)

'context' @ [174:53] ==> val context: BindingContext defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.Companion.collectUsagesToRemove[LocalVariableDescriptor]

'get' @ [174:61] ==> @Nullable public abstract operator fun <K : (Any..Any?), V : (Any..Any?)> get(p0: (ReadOnlySlice<(PsiElement..PsiElement?), (VariableDescriptor..VariableDescriptor?)>..ReadOnlySlice<(PsiElement..PsiElement?), (VariableDescriptor..VariableDescriptor?)>?), p1: (PsiElement..PsiElement?)): VariableDescriptor? defined in org.jetbrains.kotlin.resolve.BindingContext[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)
    <V : (Any..Any?)> -> (org.jetbrains.kotlin.descriptors.VariableDescriptor..org.jetbrains.kotlin.descriptors.VariableDescriptor?)

'VARIABLE' @ [174:80] ==> public final val VARIABLE: (WritableSlice<(PsiElement..PsiElement?), (VariableDescriptor..VariableDescriptor?)>..WritableSlice<(PsiElement..PsiElement?), (VariableDescriptor..VariableDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'declaration' @ [174:90] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.Companion.collectUsagesToRemove[ValueParameterDescriptorImpl]

'variableDescriptor' @ [178:32] ==> val variableDescriptor: VariableDescriptor defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.Companion.collectUsagesToRemove[LocalVariableDescriptor]

'type' @ [178:51] ==> public final val VariableDescriptor.type: KotlinType[MyPropertyDescriptor]

'variableType' @ [179:17] ==> val variableType: KotlinType defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.Companion.collectUsagesToRemove[LocalVariableDescriptor]

'isMarkedNullable' @ [179:30] ==> public abstract val isMarkedNullable: Boolean defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'variableType' @ [180:35] ==> val variableType: KotlinType defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.Companion.collectUsagesToRemove[LocalVariableDescriptor]

'constructor' @ [180:48] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'declarationDescriptor' @ [180:60] ==> public final val TypeConstructor.declarationDescriptor: ClassifierDescriptor?[MyPropertyDescriptor]

'classDescriptor' @ [182:43] ==> val classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.Companion.collectUsagesToRemove[LocalVariableDescriptor]

'builtIns' @ [182:59] ==> public val DeclarationDescriptor.builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedPropertyDescriptor]

'mapEntry' @ [182:68] ==> public final val KotlinBuiltIns.mapEntry: ClassDescriptor[MyPropertyDescriptor]

'mutableListOf' @ [185:34] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableListOf(): MutableList<DestructureIntention.Companion.UsageData> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> UsageData

'declaration' @ [188:27] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.Companion.collectUsagesToRemove[ValueParameterDescriptorImpl]

'parent' @ [188:39] ==> public final val KtDeclaration.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'if (forLoop != null && DescriptorUtils.isSubclass(classDescriptor, mapEntryClassDescriptor)) {
                val loopRangeDescriptor = forLoop.loopRange.getResolvedCall(context)?.resultingDescriptor
                if (loopRangeDescriptor != null) {
                    val loopRangeDescriptorOwner = loopRangeDescriptor.containingDeclaration
                    val mapClassDescriptor = classDescriptor.builtIns.map
                    if (loopRangeDescriptorOwner is ClassDescriptor &&
                        DescriptorUtils.isSubclass(loopRangeDescriptorOwner, mapClassDescriptor)) {
                        removeSelectorInLoopRange = loopRangeDescriptor.name.asString().let { it == "entries" || it == "entrySet" }
                    }
                }

                listOf("key", "value").mapTo(usagesToRemove) {
                    UsageData(descriptor = mapEntryClassDescriptor.unsubstitutedMemberScope.getContributedVariables(
                            Name.identifier(it), NoLookupLocation.FROM_BUILTINS).single())
                }

                ReferencesSearch.search(declaration).iterateOverMapEntryPropertiesUsages(
                        context,
                        { index, usageData -> noBadUsages = usagesToRemove[index].add(usageData, index) && noBadUsages },
                        { noBadUsages = false }
                )
            }
            else if (classDescriptor.isData) {

                val valueParameters = classDescriptor.unsubstitutedPrimaryConstructor?.valueParameters ?: return null
                valueParameters.mapTo(usagesToRemove) { UsageData(descriptor = it) }

                val usageScopeElement = declaration.getUsageScopeElement() ?: return null

                val nameToSearch = when (declaration) {
                                       is KtParameter -> declaration.nameAsName
                                       is KtVariableDeclaration -> declaration.nameAsName
                                       else -> Name.identifier("it")
                                   } ?: return null

                val constructorParameterNameMap = mutableMapOf<Name, ValueParameterDescriptor>()
                valueParameters.forEach { constructorParameterNameMap[it.name] = it }

                usageScopeElement.iterateOverDataClassPropertiesUsagesWithIndex(
                        context,
                        nameToSearch,
                        constructorParameterNameMap,
                        { index, usageData -> noBadUsages = usagesToRemove[index].add(usageData, index) && noBadUsages },
                        { noBadUsages = false }
                )
            }
            else {
                return null
            }' @ [189:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'forLoop' @ [189:17] ==> val forLoop: KtForExpression? defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.Companion.collectUsagesToRemove[LocalVariableDescriptor]

'isSubclass' @ [189:52] ==> public open fun isSubclass(@NotNull p0: ClassDescriptor, @NotNull p1: ClassDescriptor): Boolean defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'classDescriptor' @ [189:63] ==> val classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.Companion.collectUsagesToRemove[LocalVariableDescriptor]

'mapEntryClassDescriptor' @ [189:80] ==> val mapEntryClassDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.Companion.collectUsagesToRemove[LocalVariableDescriptor]

'forLoop' @ [190:43] ==> val forLoop: KtForExpression? defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.Companion.collectUsagesToRemove[LocalVariableDescriptor]

'loopRange' @ [190:51] ==> public final val KtForExpression.loopRange: KtExpression?[MyPropertyDescriptor]

'getResolvedCall' @ [190:61] ==> public fun KtElement?.getResolvedCall(context: BindingContext): ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.resolve.calls.callUtil[DeserializedSimpleFunctionDescriptor]

'context' @ [190:77] ==> val context: BindingContext defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.Companion.collectUsagesToRemove[LocalVariableDescriptor]

'resultingDescriptor' @ [190:87] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.resultingDescriptor: CallableDescriptor[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> Captured(out CallableDescriptor)

'loopRangeDescriptor' @ [191:21] ==> val loopRangeDescriptor: CallableDescriptor? defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.Companion.collectUsagesToRemove[LocalVariableDescriptor]

'loopRangeDescriptor' @ [192:52] ==> val loopRangeDescriptor: CallableDescriptor? defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.Companion.collectUsagesToRemove[LocalVariableDescriptor]

'containingDeclaration' @ [192:72] ==> public final val CallableDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'classDescriptor' @ [193:46] ==> val classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.Companion.collectUsagesToRemove[LocalVariableDescriptor]

'builtIns' @ [193:62] ==> public val DeclarationDescriptor.builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedPropertyDescriptor]

'map' @ [193:71] ==> public final val KotlinBuiltIns.map: ClassDescriptor[MyPropertyDescriptor]

'loopRangeDescriptorOwner' @ [194:25] ==> val loopRangeDescriptorOwner: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.Companion.collectUsagesToRemove[LocalVariableDescriptor]

'isSubclass' @ [195:41] ==> public open fun isSubclass(@NotNull p0: ClassDescriptor, @NotNull p1: ClassDescriptor): Boolean defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'loopRangeDescriptorOwner' @ [195:52] ==> val loopRangeDescriptorOwner: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.Companion.collectUsagesToRemove[LocalVariableDescriptor]

'mapClassDescriptor' @ [195:78] ==> val mapClassDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.Companion.collectUsagesToRemove[LocalVariableDescriptor]

'removeSelectorInLoopRange' @ [196:25] ==> var removeSelectorInLoopRange: Boolean defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.Companion.collectUsagesToRemove[LocalVariableDescriptor]

'loopRangeDescriptor' @ [196:53] ==> val loopRangeDescriptor: CallableDescriptor? defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.Companion.collectUsagesToRemove[LocalVariableDescriptor]

'name' @ [196:73] ==> public final val CallableDescriptor.name: Name[MyPropertyDescriptor]

'asString' @ [196:78] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'let' @ [196:89] ==> @InlineOnly public inline fun <T, R> String.let(block: (String) -> Boolean): Boolean defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> Boolean

'it' @ [196:95] ==> value-parameter it: String defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.Companion.collectUsagesToRemove.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [196:114] ==> value-parameter it: String defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.Companion.collectUsagesToRemove.<anonymous>[ValueParameterDescriptorImpl]

'listOf' @ [200:17] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'mapTo' @ [200:40] ==> public inline fun <T, R, C : MutableCollection<in DestructureIntention.Companion.UsageData>> Iterable<String>.mapTo(destination: MutableList<DestructureIntention.Companion.UsageData>, transform: (String) -> DestructureIntention.Companion.UsageData): MutableList<DestructureIntention.Companion.UsageData> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> UsageData
    <C : MutableCollection<in R>> -> MutableList<UsageData>

'usagesToRemove' @ [200:46] ==> val usagesToRemove: MutableList<DestructureIntention.Companion.UsageData> defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.Companion.collectUsagesToRemove[LocalVariableDescriptor]

'UsageData' @ [201:21] ==> public constructor UsageData(descriptor: CallableDescriptor, usagesToReplace: MutableList<KtExpression> = ..., declarationToDrop: KtDeclaration? = ..., name: String? = ...) defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.Companion.UsageData[ClassConstructorDescriptorImpl]

'mapEntryClassDescriptor' @ [201:44] ==> val mapEntryClassDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.Companion.collectUsagesToRemove[LocalVariableDescriptor]

'unsubstitutedMemberScope' @ [201:68] ==> public final val ClassDescriptor.unsubstitutedMemberScope: MemberScope[MyPropertyDescriptor]

'getContributedVariables' @ [201:93] ==> public abstract fun getContributedVariables(name: Name, location: LookupLocation): Collection<PropertyDescriptor> defined in org.jetbrains.kotlin.resolve.scopes.MemberScope[DeserializedSimpleFunctionDescriptor]

'identifier' @ [202:34] ==> @NotNull public open fun identifier(@NotNull p0: String): Name defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'it' @ [202:45] ==> value-parameter it: String defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.Companion.collectUsagesToRemove.<anonymous>[ValueParameterDescriptorImpl]

'FROM_BUILTINS' @ [202:67] ==> enum entry FROM_BUILTINS defined in org.jetbrains.kotlin.incremental.components.NoLookupLocation[FakeCallableDescriptorForObject]

'single' @ [202:82] ==> public fun <T> Iterable<PropertyDescriptor>.single(): PropertyDescriptor defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PropertyDescriptor

'search' @ [205:34] ==> @NotNull public open fun search(@NotNull p0: PsiElement): Query<(PsiReference..PsiReference?)> defined in com.intellij.psi.search.searches.ReferencesSearch[JavaMethodDescriptor]

'declaration' @ [205:41] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.Companion.collectUsagesToRemove[ValueParameterDescriptorImpl]

'iterateOverMapEntryPropertiesUsages' @ [205:54] ==> private final fun Query<PsiReference>.iterateOverMapEntryPropertiesUsages(context: BindingContext, process: (Int, DestructureIntention.Companion.SingleUsageData) -> Unit, cancel: () -> Unit): Unit defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.Companion[SimpleFunctionDescriptorImpl]

'context' @ [206:25] ==> val context: BindingContext defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.Companion.collectUsagesToRemove[LocalVariableDescriptor]

'noBadUsages' @ [207:47] ==> var noBadUsages: Boolean defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.Companion.collectUsagesToRemove[LocalVariableDescriptor]

'usagesToRemove' @ [207:61] ==> val usagesToRemove: MutableList<DestructureIntention.Companion.UsageData> defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.Companion.collectUsagesToRemove[LocalVariableDescriptor]

'index' @ [207:76] ==> value-parameter index: Int defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.Companion.collectUsagesToRemove.<anonymous>[ValueParameterDescriptorImpl]

'add' @ [207:83] ==> public final fun add(newData: DestructureIntention.Companion.SingleUsageData, componentIndex: Int): Boolean defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.Companion.UsageData[SimpleFunctionDescriptorImpl]

'usageData' @ [207:87] ==> value-parameter usageData: DestructureIntention.Companion.SingleUsageData defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.Companion.collectUsagesToRemove.<anonymous>[ValueParameterDescriptorImpl]

'index' @ [207:98] ==> value-parameter index: Int defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.Companion.collectUsagesToRemove.<anonymous>[ValueParameterDescriptorImpl]

'noBadUsages' @ [207:108] ==> var noBadUsages: Boolean defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.Companion.collectUsagesToRemove[LocalVariableDescriptor]

'noBadUsages' @ [208:27] ==> var noBadUsages: Boolean defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.Companion.collectUsagesToRemove[LocalVariableDescriptor]

'if (classDescriptor.isData) {

                val valueParameters = classDescriptor.unsubstitutedPrimaryConstructor?.valueParameters ?: return null
                valueParameters.mapTo(usagesToRemove) { UsageData(descriptor = it) }

                val usageScopeElement = declaration.getUsageScopeElement() ?: return null

                val nameToSearch = when (declaration) {
                                       is KtParameter -> declaration.nameAsName
                                       is KtVariableDeclaration -> declaration.nameAsName
                                       else -> Name.identifier("it")
                                   } ?: return null

                val constructorParameterNameMap = mutableMapOf<Name, ValueParameterDescriptor>()
                valueParameters.forEach { constructorParameterNameMap[it.name] = it }

                usageScopeElement.iterateOverDataClassPropertiesUsagesWithIndex(
                        context,
                        nameToSearch,
                        constructorParameterNameMap,
                        { index, usageData -> noBadUsages = usagesToRemove[index].add(usageData, index) && noBadUsages },
                        { noBadUsages = false }
                )
            }
            else {
                return null
            }' @ [211:18] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'classDescriptor' @ [211:22] ==> val classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.Companion.collectUsagesToRemove[LocalVariableDescriptor]

'isData' @ [211:38] ==> public final val ClassDescriptor.isData: Boolean[MyPropertyDescriptor]

'classDescriptor' @ [213:39] ==> val classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.Companion.collectUsagesToRemove[LocalVariableDescriptor]

'unsubstitutedPrimaryConstructor' @ [213:55] ==> public final val ClassDescriptor.unsubstitutedPrimaryConstructor: ClassConstructorDescriptor?[MyPropertyDescriptor]

'valueParameters' @ [213:88] ==> public final val ClassConstructorDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'valueParameters' @ [214:17] ==> val valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>) defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.Companion.collectUsagesToRemove[LocalVariableDescriptor]

'mapTo' @ [214:33] ==> public inline fun <T, R, C : MutableCollection<in DestructureIntention.Companion.UsageData>> Iterable<(ValueParameterDescriptor..ValueParameterDescriptor?)>.mapTo(destination: MutableList<DestructureIntention.Companion.UsageData>, transform: ((ValueParameterDescriptor..ValueParameterDescriptor?)) -> DestructureIntention.Companion.UsageData): MutableList<DestructureIntention.Companion.UsageData> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.ValueParameterDescriptor..org.jetbrains.kotlin.descriptors.ValueParameterDescriptor?)
    <R> -> UsageData
    <C : MutableCollection<in R>> -> MutableList<UsageData>

'usagesToRemove' @ [214:39] ==> val usagesToRemove: MutableList<DestructureIntention.Companion.UsageData> defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.Companion.collectUsagesToRemove[LocalVariableDescriptor]

'UsageData' @ [214:57] ==> public constructor UsageData(descriptor: CallableDescriptor, usagesToReplace: MutableList<KtExpression> = ..., declarationToDrop: KtDeclaration? = ..., name: String? = ...) defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.Companion.UsageData[ClassConstructorDescriptorImpl]

'it' @ [214:80] ==> value-parameter it: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.Companion.collectUsagesToRemove.<anonymous>[ValueParameterDescriptorImpl]

'declaration' @ [216:41] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.Companion.collectUsagesToRemove[ValueParameterDescriptorImpl]

'getUsageScopeElement' @ [216:53] ==> private final fun KtDeclaration.getUsageScopeElement(): PsiElement? defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.Companion[SimpleFunctionDescriptorImpl]

'when (declaration) {
                                       is KtParameter -> declaration.nameAsName
                                       is KtVariableDeclaration -> declaration.nameAsName
                                       else -> Name.identifier("it")
                                   }' @ [218:36] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Name?, entry1: Name?, entry2: Name?): Name?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Name?

'declaration' @ [218:42] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.Companion.collectUsagesToRemove[ValueParameterDescriptorImpl]

'declaration' @ [219:58] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.Companion.collectUsagesToRemove[ValueParameterDescriptorImpl]

'nameAsName' @ [219:70] ==> public final val KtParameter.nameAsName: Name?[MyPropertyDescriptor]

'declaration' @ [220:68] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.Companion.collectUsagesToRemove[ValueParameterDescriptorImpl]

'nameAsName' @ [220:80] ==> public final val KtVariableDeclaration.nameAsName: Name?[MyPropertyDescriptor]

'identifier' @ [221:53] ==> @NotNull public open fun identifier(@NotNull p0: String): Name defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'mutableMapOf' @ [224:51] ==> @SinceKotlin @InlineOnly public inline fun <K, V> mutableMapOf(): MutableMap<Name, ValueParameterDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> Name
    <V> -> ValueParameterDescriptor

'valueParameters' @ [225:17] ==> val valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>) defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.Companion.collectUsagesToRemove[LocalVariableDescriptor]

'forEach' @ [225:33] ==> @HidesMembers public inline fun <T> Iterable<(ValueParameterDescriptor..ValueParameterDescriptor?)>.forEach(action: ((ValueParameterDescriptor..ValueParameterDescriptor?)) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.ValueParameterDescriptor..org.jetbrains.kotlin.descriptors.ValueParameterDescriptor?)

'constructorParameterNameMap' @ [225:43] ==> val constructorParameterNameMap: MutableMap<Name, ValueParameterDescriptor> defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.Companion.collectUsagesToRemove[LocalVariableDescriptor]

'it' @ [225:71] ==> value-parameter it: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.Companion.collectUsagesToRemove.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [225:74] ==> public final val ValueParameterDescriptor.name: Name[MyPropertyDescriptor]

'it' @ [225:82] ==> value-parameter it: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.Companion.collectUsagesToRemove.<anonymous>[ValueParameterDescriptorImpl]

'usageScopeElement' @ [227:17] ==> val usageScopeElement: PsiElement defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.Companion.collectUsagesToRemove[LocalVariableDescriptor]

'iterateOverDataClassPropertiesUsagesWithIndex' @ [227:35] ==> private final fun PsiElement.iterateOverDataClassPropertiesUsagesWithIndex(context: BindingContext, parameterName: Name, constructorParameterNameMap: Map<Name, ValueParameterDescriptor>, process: (Int, DestructureIntention.Companion.SingleUsageData) -> Unit, cancel: () -> Unit): Unit defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.Companion[SimpleFunctionDescriptorImpl]

'context' @ [228:25] ==> val context: BindingContext defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.Companion.collectUsagesToRemove[LocalVariableDescriptor]

'nameToSearch' @ [229:25] ==> val nameToSearch: Name defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.Companion.collectUsagesToRemove[LocalVariableDescriptor]

'constructorParameterNameMap' @ [230:25] ==> val constructorParameterNameMap: MutableMap<Name, ValueParameterDescriptor> defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.Companion.collectUsagesToRemove[LocalVariableDescriptor]

'noBadUsages' @ [231:47] ==> var noBadUsages: Boolean defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.Companion.collectUsagesToRemove[LocalVariableDescriptor]

'usagesToRemove' @ [231:61] ==> val usagesToRemove: MutableList<DestructureIntention.Companion.UsageData> defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.Companion.collectUsagesToRemove[LocalVariableDescriptor]

'index' @ [231:76] ==> value-parameter index: Int defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.Companion.collectUsagesToRemove.<anonymous>[ValueParameterDescriptorImpl]

'add' @ [231:83] ==> public final fun add(newData: DestructureIntention.Companion.SingleUsageData, componentIndex: Int): Boolean defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.Companion.UsageData[SimpleFunctionDescriptorImpl]

'usageData' @ [231:87] ==> value-parameter usageData: DestructureIntention.Companion.SingleUsageData defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.Companion.collectUsagesToRemove.<anonymous>[ValueParameterDescriptorImpl]

'index' @ [231:98] ==> value-parameter index: Int defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.Companion.collectUsagesToRemove.<anonymous>[ValueParameterDescriptorImpl]

'noBadUsages' @ [231:108] ==> var noBadUsages: Boolean defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.Companion.collectUsagesToRemove[LocalVariableDescriptor]

'noBadUsages' @ [232:27] ==> var noBadUsages: Boolean defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.Companion.collectUsagesToRemove[LocalVariableDescriptor]

'!' @ [238:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'noBadUsages' @ [238:18] ==> var noBadUsages: Boolean defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.Companion.collectUsagesToRemove[LocalVariableDescriptor]

'usagesToRemove' @ [240:37] ==> val usagesToRemove: MutableList<DestructureIntention.Companion.UsageData> defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.Companion.collectUsagesToRemove[LocalVariableDescriptor]

'dropLastWhile' @ [240:52] ==> public inline fun <T> List<DestructureIntention.Companion.UsageData>.dropLastWhile(predicate: (DestructureIntention.Companion.UsageData) -> Boolean): List<DestructureIntention.Companion.UsageData> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> UsageData

'it' @ [240:68] ==> value-parameter it: DestructureIntention.Companion.UsageData defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.Companion.collectUsagesToRemove.<anonymous>[ValueParameterDescriptorImpl]

'usagesToReplace' @ [240:71] ==> public final val usagesToReplace: MutableList<KtExpression> defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.Companion.UsageData[PropertyDescriptorImpl]

'isEmpty' @ [240:87] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'it' @ [240:100] ==> value-parameter it: DestructureIntention.Companion.UsageData defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.Companion.collectUsagesToRemove.<anonymous>[ValueParameterDescriptorImpl]

'declarationToDrop' @ [240:103] ==> public final var declarationToDrop: KtDeclaration? defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.Companion.UsageData[PropertyDescriptorImpl]

'if (droppedLastUnused.isEmpty()) {
                UsagesToRemove(usagesToRemove, removeSelectorInLoopRange)
            }
            else {
                UsagesToRemove(droppedLastUnused, removeSelectorInLoopRange)
            }' @ [241:20] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: DestructureIntention.Companion.UsagesToRemove?, elseBranch: DestructureIntention.Companion.UsagesToRemove?): DestructureIntention.Companion.UsagesToRemove?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> UsagesToRemove?

'droppedLastUnused' @ [241:24] ==> val droppedLastUnused: List<DestructureIntention.Companion.UsageData> defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.Companion.collectUsagesToRemove[LocalVariableDescriptor]

'isEmpty' @ [241:42] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'UsagesToRemove' @ [242:17] ==> public constructor UsagesToRemove(data: List<DestructureIntention.Companion.UsageData>, removeSelectorInLoopRange: Boolean) defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.Companion.UsagesToRemove[ClassConstructorDescriptorImpl]

'usagesToRemove' @ [242:32] ==> val usagesToRemove: MutableList<DestructureIntention.Companion.UsageData> defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.Companion.collectUsagesToRemove[LocalVariableDescriptor]

'removeSelectorInLoopRange' @ [242:48] ==> var removeSelectorInLoopRange: Boolean defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.Companion.collectUsagesToRemove[LocalVariableDescriptor]

'UsagesToRemove' @ [245:17] ==> public constructor UsagesToRemove(data: List<DestructureIntention.Companion.UsageData>, removeSelectorInLoopRange: Boolean) defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.Companion.UsagesToRemove[ClassConstructorDescriptorImpl]

'droppedLastUnused' @ [245:32] ==> val droppedLastUnused: List<DestructureIntention.Companion.UsageData> defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.Companion.collectUsagesToRemove[LocalVariableDescriptor]

'removeSelectorInLoopRange' @ [245:51] ==> var removeSelectorInLoopRange: Boolean defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.Companion.collectUsagesToRemove[LocalVariableDescriptor]

'forEach' @ [255:13] ==> public abstract fun forEach(@NotNull p0: Processor<(PsiReference..PsiReference?)>): Boolean defined in com.intellij.util.Query[JavaMethodDescriptor]

'Processor' @ [255:21] ==> public fun <T : (Any..Any?)> Processor(function: ((PsiReference..PsiReference?)) -> Boolean): Processor<(PsiReference..PsiReference?)> defined in com.intellij.util[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : (Any..Any?)> -> (com.intellij.psi.PsiReference..com.intellij.psi.PsiReference?)

'getDataIfUsageIsApplicable' @ [256:39] ==> private final fun getDataIfUsageIsApplicable(dataClassUsage: PsiReference, context: BindingContext): DestructureIntention.Companion.SingleUsageData? defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.Companion[SimpleFunctionDescriptorImpl]

'it' @ [256:66] ==> value-parameter it: (PsiReference..PsiReference?) defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.Companion.iterateOverMapEntryPropertiesUsages.<anonymous>[ValueParameterDescriptorImpl]

'context' @ [256:70] ==> value-parameter context: BindingContext defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.Companion.iterateOverMapEntryPropertiesUsages[ValueParameterDescriptorImpl]

'applicableUsage' @ [257:21] ==> val applicableUsage: DestructureIntention.Companion.SingleUsageData? defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.Companion.iterateOverMapEntryPropertiesUsages.<anonymous>[LocalVariableDescriptor]

'applicableUsage' @ [258:43] ==> val applicableUsage: DestructureIntention.Companion.SingleUsageData? defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.Companion.iterateOverMapEntryPropertiesUsages.<anonymous>[LocalVariableDescriptor]

'descriptor' @ [258:59] ==> public final val descriptor: CallableDescriptor? defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.Companion.SingleUsageData[PropertyDescriptorImpl]

'usageDescriptor' @ [259:25] ==> val usageDescriptor: CallableDescriptor? defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.Companion.iterateOverMapEntryPropertiesUsages.<anonymous>[LocalVariableDescriptor]

'invoke' @ [260:25] ==> public abstract operator fun invoke(p1: Int, p2: DestructureIntention.Companion.SingleUsageData): Unit defined in kotlin.Function2[FunctionInvokeDescriptor]

'applicableUsage' @ [260:36] ==> val applicableUsage: DestructureIntention.Companion.SingleUsageData? defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.Companion.iterateOverMapEntryPropertiesUsages.<anonymous>[LocalVariableDescriptor]

'invoke' @ [261:25] ==> public abstract operator fun invoke(p1: Int, p2: DestructureIntention.Companion.SingleUsageData): Unit defined in kotlin.Function2[FunctionInvokeDescriptor]

'applicableUsage' @ [261:36] ==> val applicableUsage: DestructureIntention.Companion.SingleUsageData? defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.Companion.iterateOverMapEntryPropertiesUsages.<anonymous>[LocalVariableDescriptor]

'when (usageDescriptor.name.asString()) {
                        "key", "getKey" -> {
                            process(0, applicableUsage)
                            return@forEach true
                        }
                        "value", "getValue" -> {
                            process(1, applicableUsage)
                            return@forEach true
                        }
                    }' @ [264:21] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Nothing, entry1: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Nothing

'usageDescriptor' @ [264:27] ==> val usageDescriptor: CallableDescriptor? defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.Companion.iterateOverMapEntryPropertiesUsages.<anonymous>[LocalVariableDescriptor]

'name' @ [264:43] ==> public final val CallableDescriptor.name: Name[MyPropertyDescriptor]

'asString' @ [264:48] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'invoke' @ [266:29] ==> public abstract operator fun invoke(p1: Int, p2: DestructureIntention.Companion.SingleUsageData): Unit defined in kotlin.Function2[FunctionInvokeDescriptor]

'applicableUsage' @ [266:40] ==> val applicableUsage: DestructureIntention.Companion.SingleUsageData? defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.Companion.iterateOverMapEntryPropertiesUsages.<anonymous>[LocalVariableDescriptor]

'invoke' @ [270:29] ==> public abstract operator fun invoke(p1: Int, p2: DestructureIntention.Companion.SingleUsageData): Unit defined in kotlin.Function2[FunctionInvokeDescriptor]

'applicableUsage' @ [270:40] ==> val applicableUsage: DestructureIntention.Companion.SingleUsageData? defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.Companion.iterateOverMapEntryPropertiesUsages.<anonymous>[LocalVariableDescriptor]

'invoke' @ [276:17] ==> public abstract operator fun invoke(): Unit defined in kotlin.Function0[FunctionInvokeDescriptor]

'anyDescendantOfType' @ [288:13] ==> public inline fun <reified T : PsiElement> PsiElement.anyDescendantOfType(noinline predicate: (KtNameReferenceExpression) -> Boolean = ...): Boolean defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtNameReferenceExpression

'if (it.getReferencedNameAsName() != parameterName) false
                else {
                    val applicableUsage = getDataIfUsageIsApplicable(it, context)
                    if (applicableUsage != null) {
                        val usageDescriptor = applicableUsage.descriptor
                        if (usageDescriptor == null) {
                            for (parameter in constructorParameterNameMap.values) {
                                process(parameter.index, applicableUsage)
                            }
                            return@anyDescendantOfType false
                        }
                        val parameter = constructorParameterNameMap[usageDescriptor.name]
                        if (parameter != null) {
                            process(parameter.index, applicableUsage)
                            return@anyDescendantOfType false
                        }
                    }

                    cancel()
                    true
                }' @ [289:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Boolean, elseBranch: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Boolean

'it' @ [289:21] ==> value-parameter it: KtNameReferenceExpression defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.Companion.iterateOverDataClassPropertiesUsagesWithIndex.<anonymous>[ValueParameterDescriptorImpl]

'getReferencedNameAsName' @ [289:24] ==> public open fun getReferencedNameAsName(): Name defined in org.jetbrains.kotlin.psi.KtNameReferenceExpression[DeserializedSimpleFunctionDescriptor]

'parameterName' @ [289:53] ==> value-parameter parameterName: Name defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.Companion.iterateOverDataClassPropertiesUsagesWithIndex[ValueParameterDescriptorImpl]

'getDataIfUsageIsApplicable' @ [291:43] ==> private final fun getDataIfUsageIsApplicable(dataClassUsage: KtReferenceExpression, context: BindingContext): DestructureIntention.Companion.SingleUsageData? defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.Companion[SimpleFunctionDescriptorImpl]

'it' @ [291:70] ==> value-parameter it: KtNameReferenceExpression defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.Companion.iterateOverDataClassPropertiesUsagesWithIndex.<anonymous>[ValueParameterDescriptorImpl]

'context' @ [291:74] ==> value-parameter context: BindingContext defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.Companion.iterateOverDataClassPropertiesUsagesWithIndex[ValueParameterDescriptorImpl]

'applicableUsage' @ [292:25] ==> val applicableUsage: DestructureIntention.Companion.SingleUsageData? defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.Companion.iterateOverDataClassPropertiesUsagesWithIndex.<anonymous>[LocalVariableDescriptor]

'applicableUsage' @ [293:47] ==> val applicableUsage: DestructureIntention.Companion.SingleUsageData? defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.Companion.iterateOverDataClassPropertiesUsagesWithIndex.<anonymous>[LocalVariableDescriptor]

'descriptor' @ [293:63] ==> public final val descriptor: CallableDescriptor? defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.Companion.SingleUsageData[PropertyDescriptorImpl]

'usageDescriptor' @ [294:29] ==> val usageDescriptor: CallableDescriptor? defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.Companion.iterateOverDataClassPropertiesUsagesWithIndex.<anonymous>[LocalVariableDescriptor]

'constructorParameterNameMap' @ [295:47] ==> value-parameter constructorParameterNameMap: Map<Name, ValueParameterDescriptor> defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.Companion.iterateOverDataClassPropertiesUsagesWithIndex[ValueParameterDescriptorImpl]

'values' @ [295:75] ==> public abstract val values: Collection<ValueParameterDescriptor> defined in kotlin.collections.Map[DeserializedPropertyDescriptor]

'invoke' @ [296:33] ==> public abstract operator fun invoke(p1: Int, p2: DestructureIntention.Companion.SingleUsageData): Unit defined in kotlin.Function2[FunctionInvokeDescriptor]

'parameter' @ [296:41] ==> val parameter: ValueParameterDescriptor defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.Companion.iterateOverDataClassPropertiesUsagesWithIndex.<anonymous>[LocalVariableDescriptor]

'index' @ [296:51] ==> public abstract val index: Int defined in org.jetbrains.kotlin.descriptors.ValueParameterDescriptor[DeserializedPropertyDescriptor]

'applicableUsage' @ [296:58] ==> val applicableUsage: DestructureIntention.Companion.SingleUsageData? defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.Companion.iterateOverDataClassPropertiesUsagesWithIndex.<anonymous>[LocalVariableDescriptor]

'constructorParameterNameMap' @ [300:41] ==> value-parameter constructorParameterNameMap: Map<Name, ValueParameterDescriptor> defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.Companion.iterateOverDataClassPropertiesUsagesWithIndex[ValueParameterDescriptorImpl]

'usageDescriptor' @ [300:69] ==> val usageDescriptor: CallableDescriptor? defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.Companion.iterateOverDataClassPropertiesUsagesWithIndex.<anonymous>[LocalVariableDescriptor]

'name' @ [300:85] ==> public final val CallableDescriptor.name: Name[MyPropertyDescriptor]

'parameter' @ [301:29] ==> val parameter: ValueParameterDescriptor? defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.Companion.iterateOverDataClassPropertiesUsagesWithIndex.<anonymous>[LocalVariableDescriptor]

'invoke' @ [302:29] ==> public abstract operator fun invoke(p1: Int, p2: DestructureIntention.Companion.SingleUsageData): Unit defined in kotlin.Function2[FunctionInvokeDescriptor]

'parameter' @ [302:37] ==> val parameter: ValueParameterDescriptor? defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.Companion.iterateOverDataClassPropertiesUsagesWithIndex.<anonymous>[LocalVariableDescriptor]

'index' @ [302:47] ==> public abstract val index: Int defined in org.jetbrains.kotlin.descriptors.ValueParameterDescriptor[DeserializedPropertyDescriptor]

'applicableUsage' @ [302:54] ==> val applicableUsage: DestructureIntention.Companion.SingleUsageData? defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.Companion.iterateOverDataClassPropertiesUsagesWithIndex.<anonymous>[LocalVariableDescriptor]

'invoke' @ [307:21] ==> public abstract operator fun invoke(): Unit defined in kotlin.Function0[FunctionInvokeDescriptor]

'dataClassUsage' @ [314:18] ==> value-parameter dataClassUsage: PsiReference defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.Companion.getDataIfUsageIsApplicable[ValueParameterDescriptorImpl]

'element' @ [314:33] ==> public final val PsiReference.element: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'let' @ [314:69] ==> @InlineOnly public inline fun <T, R> KtReferenceExpression.let(block: (KtReferenceExpression) -> DestructureIntention.Companion.SingleUsageData?): DestructureIntention.Companion.SingleUsageData? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtReferenceExpression
    <R> -> SingleUsageData?

'getDataIfUsageIsApplicable' @ [314:75] ==> private final fun getDataIfUsageIsApplicable(dataClassUsage: KtReferenceExpression, context: BindingContext): DestructureIntention.Companion.SingleUsageData? defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.Companion[SimpleFunctionDescriptorImpl]

'it' @ [314:102] ==> value-parameter it: KtReferenceExpression defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.Companion.getDataIfUsageIsApplicable.<anonymous>[ValueParameterDescriptorImpl]

'context' @ [314:106] ==> value-parameter context: BindingContext defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.Companion.getDataIfUsageIsApplicable[ValueParameterDescriptorImpl]

'dataClassUsage' @ [317:37] ==> value-parameter dataClassUsage: KtReferenceExpression defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.Companion.getDataIfUsageIsApplicable[ValueParameterDescriptorImpl]

'parent' @ [317:52] ==> public final val KtReferenceExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'destructuringDecl' @ [318:17] ==> val destructuringDecl: KtDestructuringDeclaration? defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.Companion.getDataIfUsageIsApplicable[LocalVariableDescriptor]

'destructuringDecl' @ [318:46] ==> val destructuringDecl: KtDestructuringDeclaration? defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.Companion.getDataIfUsageIsApplicable[LocalVariableDescriptor]

'initializer' @ [318:64] ==> public final val KtDestructuringDeclaration.initializer: KtExpression?[MyPropertyDescriptor]

'dataClassUsage' @ [318:79] ==> value-parameter dataClassUsage: KtReferenceExpression defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.Companion.getDataIfUsageIsApplicable[ValueParameterDescriptorImpl]

'SingleUsageData' @ [319:24] ==> public constructor SingleUsageData(descriptor: CallableDescriptor?, usageToReplace: KtExpression?, declarationToDrop: KtDeclaration?) defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.Companion.SingleUsageData[ClassConstructorDescriptorImpl]

'destructuringDecl' @ [319:102] ==> val destructuringDecl: KtDestructuringDeclaration? defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.Companion.getDataIfUsageIsApplicable[LocalVariableDescriptor]

'dataClassUsage' @ [321:39] ==> value-parameter dataClassUsage: KtReferenceExpression defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.Companion.getDataIfUsageIsApplicable[ValueParameterDescriptorImpl]

'getQualifiedExpressionForReceiver' @ [321:54] ==> public fun KtExpression.getQualifiedExpressionForReceiver(): KtQualifiedExpression? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'qualifiedExpression' @ [322:26] ==> val qualifiedExpression: KtQualifiedExpression defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.Companion.getDataIfUsageIsApplicable[LocalVariableDescriptor]

'parent' @ [322:46] ==> public final val KtQualifiedExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'when (parent) {
                is KtBinaryExpression -> {
                    if (parent.operationToken in KtTokens.ALL_ASSIGNMENTS && parent.left == qualifiedExpression) return null
                }
                is KtUnaryExpression -> {
                    if (parent.operationToken == KtTokens.PLUSPLUS || parent.operationToken == KtTokens.MINUSMINUS) return null
                }
            }' @ [323:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'parent' @ [323:19] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.Companion.getDataIfUsageIsApplicable[LocalVariableDescriptor]

'parent' @ [325:25] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.Companion.getDataIfUsageIsApplicable[LocalVariableDescriptor]

'operationToken' @ [325:32] ==> public final val KtBinaryExpression.operationToken: IElementType[MyPropertyDescriptor]

'ALL_ASSIGNMENTS' @ [325:59] ==> public final val ALL_ASSIGNMENTS: (TokenSet..TokenSet?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'parent' @ [325:78] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.Companion.getDataIfUsageIsApplicable[LocalVariableDescriptor]

'left' @ [325:85] ==> public final val KtBinaryExpression.left: KtExpression?[MyPropertyDescriptor]

'qualifiedExpression' @ [325:93] ==> val qualifiedExpression: KtQualifiedExpression defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.Companion.getDataIfUsageIsApplicable[LocalVariableDescriptor]

'parent' @ [328:25] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.Companion.getDataIfUsageIsApplicable[LocalVariableDescriptor]

'operationToken' @ [328:32] ==> public final val KtUnaryExpression.operationToken: (IElementType..IElementType?)[MyPropertyDescriptor]

'PLUSPLUS' @ [328:59] ==> public final val PLUSPLUS: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'parent' @ [328:71] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.Companion.getDataIfUsageIsApplicable[LocalVariableDescriptor]

'operationToken' @ [328:78] ==> public final val KtUnaryExpression.operationToken: (IElementType..IElementType?)[MyPropertyDescriptor]

'MINUSMINUS' @ [328:105] ==> public final val MINUSMINUS: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'parent' @ [332:28] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.Companion.getDataIfUsageIsApplicable[LocalVariableDescriptor]

'property' @ [333:17] ==> val property: KtProperty? defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.Companion.getDataIfUsageIsApplicable[LocalVariableDescriptor]

'property' @ [333:37] ==> val property: KtProperty? defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.Companion.getDataIfUsageIsApplicable[LocalVariableDescriptor]

'isVar' @ [333:46] ==> public final val KtProperty.isVar: Boolean[MyPropertyDescriptor]

'qualifiedExpression' @ [335:30] ==> val qualifiedExpression: KtQualifiedExpression defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.Companion.getDataIfUsageIsApplicable[LocalVariableDescriptor]

'getResolvedCall' @ [335:50] ==> public fun KtElement?.getResolvedCall(context: BindingContext): ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.resolve.calls.callUtil[DeserializedSimpleFunctionDescriptor]

'context' @ [335:66] ==> value-parameter context: BindingContext defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.Companion.getDataIfUsageIsApplicable[ValueParameterDescriptorImpl]

'resultingDescriptor' @ [335:76] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.resultingDescriptor: CallableDescriptor[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> Captured(out CallableDescriptor)

'SingleUsageData' @ [336:20] ==> public constructor SingleUsageData(descriptor: CallableDescriptor?, usageToReplace: KtExpression?, declarationToDrop: KtDeclaration?) defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.Companion.SingleUsageData[ClassConstructorDescriptorImpl]

'descriptor' @ [336:49] ==> val descriptor: CallableDescriptor defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.Companion.getDataIfUsageIsApplicable[LocalVariableDescriptor]

'qualifiedExpression' @ [336:78] ==> val qualifiedExpression: KtQualifiedExpression defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.Companion.getDataIfUsageIsApplicable[LocalVariableDescriptor]

'property' @ [336:119] ==> val property: KtProperty? defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.Companion.getDataIfUsageIsApplicable[LocalVariableDescriptor]

'mutableListOf' @ [347:66] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableListOf(): MutableList<KtExpression> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression

'if (newData.declarationToDrop is KtDestructuringDeclaration) {
                    val destructuringEntries = newData.declarationToDrop.entries
                    if (componentIndex < destructuringEntries.size) {
                        if (declarationToDrop != null) return false
                        name = destructuringEntries[componentIndex].name ?: return false
                        declarationToDrop = newData.declarationToDrop
                    }
                }
                else {
                    name = name ?: newData.declarationToDrop?.name
                    declarationToDrop = declarationToDrop ?: newData.declarationToDrop
                }' @ [353:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'newData' @ [353:21] ==> value-parameter newData: DestructureIntention.Companion.SingleUsageData defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.Companion.UsageData.add[ValueParameterDescriptorImpl]

'declarationToDrop' @ [353:29] ==> public final val declarationToDrop: KtDeclaration? defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.Companion.SingleUsageData[PropertyDescriptorImpl]

'newData' @ [354:48] ==> value-parameter newData: DestructureIntention.Companion.SingleUsageData defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.Companion.UsageData.add[ValueParameterDescriptorImpl]

'declarationToDrop' @ [354:56] ==> public final val declarationToDrop: KtDeclaration? defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.Companion.SingleUsageData[PropertyDescriptorImpl]

'entries' @ [354:74] ==> public final val KtDestructuringDeclaration.entries: (MutableList<(KtDestructuringDeclarationEntry..KtDestructuringDeclarationEntry?)>..List<(KtDestructuringDeclarationEntry..KtDestructuringDeclarationEntry?)>)[MyPropertyDescriptor]

'componentIndex' @ [355:25] ==> value-parameter componentIndex: Int defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.Companion.UsageData.add[ValueParameterDescriptorImpl]

'destructuringEntries' @ [355:42] ==> val destructuringEntries: (MutableList<(KtDestructuringDeclarationEntry..KtDestructuringDeclarationEntry?)>..List<(KtDestructuringDeclarationEntry..KtDestructuringDeclarationEntry?)>) defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.Companion.UsageData.add[LocalVariableDescriptor]

'size' @ [355:63] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'declarationToDrop' @ [356:29] ==> public final var declarationToDrop: KtDeclaration? defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.Companion.UsageData[PropertyDescriptorImpl]

'name' @ [357:25] ==> public final var name: String? defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.Companion.UsageData[PropertyDescriptorImpl]

'destructuringEntries' @ [357:32] ==> val destructuringEntries: (MutableList<(KtDestructuringDeclarationEntry..KtDestructuringDeclarationEntry?)>..List<(KtDestructuringDeclarationEntry..KtDestructuringDeclarationEntry?)>) defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.Companion.UsageData.add[LocalVariableDescriptor]

'componentIndex' @ [357:53] ==> value-parameter componentIndex: Int defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.Companion.UsageData.add[ValueParameterDescriptorImpl]

'name' @ [357:69] ==> public final val KtDestructuringDeclarationEntry.name: String?[MyPropertyDescriptor]

'declarationToDrop' @ [358:25] ==> public final var declarationToDrop: KtDeclaration? defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.Companion.UsageData[PropertyDescriptorImpl]

'newData' @ [358:45] ==> value-parameter newData: DestructureIntention.Companion.SingleUsageData defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.Companion.UsageData.add[ValueParameterDescriptorImpl]

'declarationToDrop' @ [358:53] ==> public final val declarationToDrop: KtDeclaration? defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.Companion.SingleUsageData[PropertyDescriptorImpl]

'name' @ [362:21] ==> public final var name: String? defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.Companion.UsageData[PropertyDescriptorImpl]

'name' @ [362:28] ==> public final var name: String? defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.Companion.UsageData[PropertyDescriptorImpl]

'newData' @ [362:36] ==> value-parameter newData: DestructureIntention.Companion.SingleUsageData defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.Companion.UsageData.add[ValueParameterDescriptorImpl]

'declarationToDrop' @ [362:44] ==> public final val declarationToDrop: KtDeclaration? defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.Companion.SingleUsageData[PropertyDescriptorImpl]

'name' @ [362:63] ==> public final val KtDeclaration.name: String?[MyPropertyDescriptor]

'declarationToDrop' @ [363:21] ==> public final var declarationToDrop: KtDeclaration? defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.Companion.UsageData[PropertyDescriptorImpl]

'declarationToDrop' @ [363:41] ==> public final var declarationToDrop: KtDeclaration? defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.Companion.UsageData[PropertyDescriptorImpl]

'newData' @ [363:62] ==> value-parameter newData: DestructureIntention.Companion.SingleUsageData defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.Companion.UsageData.add[ValueParameterDescriptorImpl]

'declarationToDrop' @ [363:70] ==> public final val declarationToDrop: KtDeclaration? defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.Companion.SingleUsageData[PropertyDescriptorImpl]

'newData' @ [365:17] ==> value-parameter newData: DestructureIntention.Companion.SingleUsageData defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.Companion.UsageData.add[ValueParameterDescriptorImpl]

'usageToReplace' @ [365:25] ==> public final val usageToReplace: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.Companion.SingleUsageData[PropertyDescriptorImpl]

'let' @ [365:41] ==> @InlineOnly public inline fun <T, R> KtExpression.let(block: (KtExpression) -> Boolean): Boolean defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression
    <R> -> Boolean

'usagesToReplace' @ [365:47] ==> public final val usagesToReplace: MutableList<KtExpression> defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.Companion.UsageData[PropertyDescriptorImpl]

'add' @ [365:63] ==> public abstract fun add(element: KtExpression): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'it' @ [365:67] ==> value-parameter it: KtExpression defined in org.jetbrains.kotlin.idea.intentions.DestructureIntention.Companion.UsageData.add.<anonymous>[ValueParameterDescriptorImpl]

