'element' @ [42:13] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.core.KotlinNameSuggestionProvider.getSuggestedNames[ValueParameterDescriptorImpl]

'nameSuggestionContext' @ [43:27] ==> value-parameter nameSuggestionContext: PsiElement? defined in org.jetbrains.kotlin.idea.core.KotlinNameSuggestionProvider.getSuggestedNames[ValueParameterDescriptorImpl]

'element' @ [43:52] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.core.KotlinNameSuggestionProvider.getSuggestedNames[ValueParameterDescriptorImpl]

'parent' @ [43:60] ==> public final val KtCallableDeclaration.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'if (element is KtProperty || element is KtParameter) {
                NewDeclarationNameValidator.Target.VARIABLES
            }
            else {
                NewDeclarationNameValidator.Target.FUNCTIONS_AND_CLASSES
            }' @ [44:26] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: NewDeclarationNameValidator.Target, elseBranch: NewDeclarationNameValidator.Target): NewDeclarationNameValidator.Target[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Target

'element' @ [44:30] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.core.KotlinNameSuggestionProvider.getSuggestedNames[ValueParameterDescriptorImpl]

'element' @ [44:55] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.core.KotlinNameSuggestionProvider.getSuggestedNames[ValueParameterDescriptorImpl]

'VARIABLES' @ [45:52] ==> enum entry VARIABLES defined in org.jetbrains.kotlin.idea.core.NewDeclarationNameValidator.Target[FakeCallableDescriptorForObject]

'FUNCTIONS_AND_CLASSES' @ [48:52] ==> enum entry FUNCTIONS_AND_CLASSES defined in org.jetbrains.kotlin.idea.core.NewDeclarationNameValidator.Target[FakeCallableDescriptorForObject]

'NewDeclarationNameValidator' @ [50:29] ==> public constructor NewDeclarationNameValidator(container: PsiElement, anchor: PsiElement?, target: NewDeclarationNameValidator.Target, excludedDeclarations: List<KtDeclaration> = ...) defined in org.jetbrains.kotlin.idea.core.NewDeclarationNameValidator[ClassConstructorDescriptorImpl]

'context' @ [50:57] ==> val context: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.core.KotlinNameSuggestionProvider.getSuggestedNames[LocalVariableDescriptor]

'element' @ [50:66] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.core.KotlinNameSuggestionProvider.getSuggestedNames[ValueParameterDescriptorImpl]

'target' @ [50:75] ==> val target: NewDeclarationNameValidator.Target defined in org.jetbrains.kotlin.idea.core.KotlinNameSuggestionProvider.getSuggestedNames[LocalVariableDescriptor]

'listOf' @ [50:83] ==> public fun <T> listOf(element: KtCallableDeclaration): List<KtCallableDeclaration> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtCallableDeclaration

'element' @ [50:90] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.core.KotlinNameSuggestionProvider.getSuggestedNames[ValueParameterDescriptorImpl]

'SmartList' @ [51:25] ==> public constructor SmartList<E : (Any..Any?)>() defined in org.jetbrains.kotlin.utils.SmartList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> String

'apply' @ [51:45] ==> @InlineOnly public inline fun <T> SmartList<String>.apply(block: SmartList<String>.() -> Unit): SmartList<String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SmartList<String>

'element' @ [52:28] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.core.KotlinNameSuggestionProvider.getSuggestedNames[ValueParameterDescriptorImpl]

'name' @ [52:36] ==> public final val KtCallableDeclaration.name: String?[MyPropertyDescriptor]

'!' @ [53:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'name' @ [53:22] ==> val name: String? defined in org.jetbrains.kotlin.idea.core.KotlinNameSuggestionProvider.getSuggestedNames.<anonymous>[LocalVariableDescriptor]

'isNullOrBlank' @ [53:27] ==> @InlineOnly public inline fun CharSequence?.isNullOrBlank(): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'this' @ [54:21] ==> <this> defined in org.jetbrains.kotlin.idea.core.KotlinNameSuggestionProvider.getSuggestedNames.<anonymous>[ReceiverParameterDescriptorImpl]

'getCamelNames' @ [54:49] ==> public final fun getCamelNames(name: String, validator: (String) -> Boolean, startLowerCase: Boolean): List<String> defined in org.jetbrains.kotlin.idea.core.KotlinNameSuggester[SimpleFunctionDescriptorImpl]

'name' @ [54:63] ==> val name: String? defined in org.jetbrains.kotlin.idea.core.KotlinNameSuggestionProvider.getSuggestedNames.<anonymous>[LocalVariableDescriptor]

'validator' @ [54:71] ==> val validator: NewDeclarationNameValidator defined in org.jetbrains.kotlin.idea.core.KotlinNameSuggestionProvider.getSuggestedNames[LocalVariableDescriptor]

'name' @ [54:82] ==> val name: String? defined in org.jetbrains.kotlin.idea.core.KotlinNameSuggestionProvider.getSuggestedNames.<anonymous>[LocalVariableDescriptor]

'first' @ [54:87] ==> public fun CharSequence.first(): Char defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'isLowerCase' @ [54:95] ==> @InlineOnly public inline fun Char.isLowerCase(): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'element' @ [57:42] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.core.KotlinNameSuggestionProvider.getSuggestedNames[ValueParameterDescriptorImpl]

'resolveToDescriptor' @ [57:50] ==> public fun KtDeclaration.resolveToDescriptor(bodyResolveMode: BodyResolveMode = ...): DeclarationDescriptor defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'PARTIAL' @ [57:86] ==> enum entry PARTIAL defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'callableDescriptor' @ [58:28] ==> val callableDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.idea.core.KotlinNameSuggestionProvider.getSuggestedNames.<anonymous>[LocalVariableDescriptor]

'returnType' @ [58:47] ==> public final val CallableDescriptor.returnType: KotlinType?[MyPropertyDescriptor]

'type' @ [59:21] ==> val type: KotlinType? defined in org.jetbrains.kotlin.idea.core.KotlinNameSuggestionProvider.getSuggestedNames.<anonymous>[LocalVariableDescriptor]

'!' @ [59:37] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'type' @ [59:38] ==> val type: KotlinType? defined in org.jetbrains.kotlin.idea.core.KotlinNameSuggestionProvider.getSuggestedNames.<anonymous>[LocalVariableDescriptor]

'isUnit' @ [59:43] ==> public fun KotlinType.isUnit(): Boolean defined in org.jetbrains.kotlin.types.typeUtil[DeserializedSimpleFunctionDescriptor]

'!' @ [59:55] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isPrimitiveType' @ [59:71] ==> public open fun isPrimitiveType(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'type' @ [59:87] ==> val type: KotlinType? defined in org.jetbrains.kotlin.idea.core.KotlinNameSuggestionProvider.getSuggestedNames.<anonymous>[LocalVariableDescriptor]

'this' @ [60:21] ==> <this> defined in org.jetbrains.kotlin.idea.core.KotlinNameSuggestionProvider.getSuggestedNames.<anonymous>[ReceiverParameterDescriptorImpl]

'suggestNamesByType' @ [60:49] ==> public final fun suggestNamesByType(type: KotlinType, validator: (String) -> Boolean, defaultName: String? = ...): List<String> defined in org.jetbrains.kotlin.idea.core.KotlinNameSuggester[SimpleFunctionDescriptorImpl]

'type' @ [60:68] ==> val type: KotlinType? defined in org.jetbrains.kotlin.idea.core.KotlinNameSuggestionProvider.getSuggestedNames.<anonymous>[LocalVariableDescriptor]

'validator' @ [60:74] ==> val validator: NewDeclarationNameValidator defined in org.jetbrains.kotlin.idea.core.KotlinNameSuggestionProvider.getSuggestedNames[LocalVariableDescriptor]

'result' @ [63:13] ==> value-parameter result: MutableSet<String> defined in org.jetbrains.kotlin.idea.core.KotlinNameSuggestionProvider.getSuggestedNames[ValueParameterDescriptorImpl]

'names' @ [63:23] ==> val names: SmartList<String> defined in org.jetbrains.kotlin.idea.core.KotlinNameSuggestionProvider.getSuggestedNames[LocalVariableDescriptor]

'element' @ [65:17] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.core.KotlinNameSuggestionProvider.getSuggestedNames[ValueParameterDescriptorImpl]

'element' @ [65:42] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.core.KotlinNameSuggestionProvider.getSuggestedNames[ValueParameterDescriptorImpl]

'isLocal' @ [65:50] ==> public final val KtProperty.isLocal: Boolean[MyPropertyDescriptor]

'iterator' @ [66:29] ==> public abstract fun iterator(): MutableIterator<(PsiReference..PsiReference?)> defined in com.intellij.util.Query[DeserializedSimpleFunctionDescriptor]

'search' @ [66:46] ==> @NotNull public open fun search(@NotNull p0: PsiElement, @NotNull p1: SearchScope): Query<(PsiReference..PsiReference?)> defined in com.intellij.psi.search.searches.ReferencesSearch[JavaMethodDescriptor]

'element' @ [66:53] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.core.KotlinNameSuggestionProvider.getSuggestedNames[ValueParameterDescriptorImpl]

'LocalSearchScope' @ [66:62] ==> public constructor LocalSearchScope(@NotNull p0: PsiElement) defined in com.intellij.psi.search.LocalSearchScope[JavaClassConstructorDescriptor]

'element' @ [66:79] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.core.KotlinNameSuggestionProvider.getSuggestedNames[ValueParameterDescriptorImpl]

'parent' @ [66:87] ==> public final val KtProperty.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'ref' @ [67:35] ==> val ref: (PsiReference..PsiReference?) defined in org.jetbrains.kotlin.idea.core.KotlinNameSuggestionProvider.getSuggestedNames[LocalVariableDescriptor]

'element' @ [67:39] ==> public final val PsiReference.element: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'refExpr' @ [68:36] ==> val refExpr: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.core.KotlinNameSuggestionProvider.getSuggestedNames[LocalVariableDescriptor]

'parent' @ [68:44] ==> public final val KtSimpleNameExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'?:' @ [69:39] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: KtCallElement?, right: KtCallElement): KtCallElement[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> KtCallElement

'argument' @ [69:40] ==> val argument: KtValueArgument defined in org.jetbrains.kotlin.idea.core.KotlinNameSuggestionProvider.getSuggestedNames[LocalVariableDescriptor]

'parent' @ [69:49] ==> public final val KtValueArgument.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'parent' @ [69:82] ==> public final val KtValueArgumentList.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'callElement' @ [70:40] ==> val callElement: KtCallElement defined in org.jetbrains.kotlin.idea.core.KotlinNameSuggestionProvider.getSuggestedNames[LocalVariableDescriptor]

'getResolvedCall' @ [70:52] ==> public fun KtElement?.getResolvedCall(context: BindingContext): ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.resolve.calls.callUtil[DeserializedSimpleFunctionDescriptor]

'callElement' @ [70:68] ==> val callElement: KtCallElement defined in org.jetbrains.kotlin.idea.core.KotlinNameSuggestionProvider.getSuggestedNames[LocalVariableDescriptor]

'analyze' @ [70:80] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'PARTIAL' @ [70:104] ==> enum entry PARTIAL defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'?:' @ [71:41] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: Name?, right: Name): Name[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> Name

'resolvedCall' @ [71:42] ==> val resolvedCall: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.idea.core.KotlinNameSuggestionProvider.getSuggestedNames[LocalVariableDescriptor]

'getArgumentMapping' @ [71:55] ==> @NotNull public abstract fun getArgumentMapping(@NotNull p0: ValueArgument): ArgumentMapping defined in org.jetbrains.kotlin.resolve.calls.model.ResolvedCall[JavaMethodDescriptor]

'argument' @ [71:74] ==> val argument: KtValueArgument defined in org.jetbrains.kotlin.idea.core.KotlinNameSuggestionProvider.getSuggestedNames[LocalVariableDescriptor]

'valueParameter' @ [71:104] ==> public abstract val valueParameter: ValueParameterDescriptor defined in org.jetbrains.kotlin.resolve.calls.model.ArgumentMatch[DeserializedPropertyDescriptor]

'name' @ [71:120] ==> public final val ValueParameterDescriptor.name: Name[MyPropertyDescriptor]

'result' @ [72:21] ==> value-parameter result: MutableSet<String> defined in org.jetbrains.kotlin.idea.core.KotlinNameSuggestionProvider.getSuggestedNames[ValueParameterDescriptorImpl]

'parameterName' @ [72:31] ==> val parameterName: Name defined in org.jetbrains.kotlin.idea.core.KotlinNameSuggestionProvider.getSuggestedNames[LocalVariableDescriptor]

'asString' @ [72:45] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'SuggestedNameInfo' @ [76:29] ==> public constructor SuggestedNameInfo(p0: (Array<(String..String?)>..Array<out (String..String?)>?)) defined in com.intellij.psi.codeStyle.SuggestedNameInfo[JavaClassConstructorDescriptor]

'names' @ [76:47] ==> val names: SmartList<String> defined in org.jetbrains.kotlin.idea.core.KotlinNameSuggestionProvider.getSuggestedNames[LocalVariableDescriptor]

'toTypedArray' @ [76:53] ==> public inline fun <reified T> Collection<(String..String?)>.toTypedArray(): Array<(String..String?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> (kotlin.String..kotlin.String?)

'element' @ [78:39] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.core.KotlinNameSuggestionProvider.getSuggestedNames[ValueParameterDescriptorImpl]

'toLightElements' @ [78:47] ==> public fun KtElement.toLightElements(): List<PsiNamedElement> defined in org.jetbrains.kotlin.asJava[DeserializedSimpleFunctionDescriptor]

'firstIsInstanceOrNull' @ [78:65] ==> public inline fun <reified T : Any> Iterable<*>.firstIsInstanceOrNull(): PsiVariable? defined in org.jetbrains.kotlin.utils.addToStdlib[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> PsiVariable

'incVariableNameUseCount' @ [79:43] ==> public open fun incVariableNameUseCount(p0: (String..String?), p1: (VariableKind..VariableKind?), p2: (String..String?), p3: (PsiType..PsiType?)): Unit defined in com.intellij.psi.statistics.JavaStatisticsManager[JavaMethodDescriptor]

'name' @ [80:29] ==> value-parameter name: String? defined in org.jetbrains.kotlin.idea.core.KotlinNameSuggestionProvider.getSuggestedNames.<no name provided>.nameChosen[ValueParameterDescriptorImpl]

'getInstance' @ [81:50] ==> public open fun getInstance(p0: (Project..Project?)): (JavaCodeStyleManager..JavaCodeStyleManager?) defined in com.intellij.psi.codeStyle.JavaCodeStyleManager[JavaMethodDescriptor]

'element' @ [81:62] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.core.KotlinNameSuggestionProvider.getSuggestedNames[ValueParameterDescriptorImpl]

'project' @ [81:70] ==> public final val KtCallableDeclaration.project: Project[MyPropertyDescriptor]

'getVariableKind' @ [81:79] ==> @NotNull public open fun getVariableKind(@NotNull p0: PsiVariable): VariableKind defined in com.intellij.psi.codeStyle.JavaCodeStyleManager[JavaMethodDescriptor]

'psiVariable' @ [81:95] ==> val psiVariable: PsiVariable defined in org.jetbrains.kotlin.idea.core.KotlinNameSuggestionProvider.getSuggestedNames.<no name provided>.nameChosen[LocalVariableDescriptor]

'psiVariable' @ [82:29] ==> val psiVariable: PsiVariable defined in org.jetbrains.kotlin.idea.core.KotlinNameSuggestionProvider.getSuggestedNames.<no name provided>.nameChosen[LocalVariableDescriptor]

'name' @ [82:41] ==> public final val PsiVariable.name: String?[MyPropertyDescriptor]

'psiVariable' @ [83:29] ==> val psiVariable: PsiVariable defined in org.jetbrains.kotlin.idea.core.KotlinNameSuggestionProvider.getSuggestedNames.<no name provided>.nameChosen[LocalVariableDescriptor]

'type' @ [83:41] ==> public final val PsiVariable.type: PsiType[MyPropertyDescriptor]

