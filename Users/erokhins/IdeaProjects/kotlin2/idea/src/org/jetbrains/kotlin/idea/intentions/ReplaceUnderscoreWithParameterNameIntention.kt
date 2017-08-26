'SelfTargetingOffsetIndependentIntention<KtCallableDeclaration>' @ [38:53] ==> public constructor SelfTargetingOffsetIndependentIntention<TElement : KtElement>(elementType: Class<KtCallableDeclaration>, text: String, familyName: String = ...) defined in org.jetbrains.kotlin.idea.intentions.SelfTargetingOffsetIndependentIntention[DeserializedClassConstructorDescriptor]
Inferred types:
    <TElement : KtElement> -> KtCallableDeclaration

'java' @ [39:38] ==> public val <T> KClass<KtCallableDeclaration>.java: Class<KtCallableDeclaration> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtCallableDeclaration

'element' @ [43:13] ==> value-parameter element: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.intentions.ReplaceUnderscoreWithParameterNameIntention.isApplicableTo[ValueParameterDescriptorImpl]

'name' @ [43:21] ==> public final val KtCallableDeclaration.name: String?[MyPropertyDescriptor]

'element' @ [43:37] ==> value-parameter element: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.intentions.ReplaceUnderscoreWithParameterNameIntention.isApplicableTo[ValueParameterDescriptorImpl]

'element' @ [43:83] ==> value-parameter element: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.intentions.ReplaceUnderscoreWithParameterNameIntention.isApplicableTo[ValueParameterDescriptorImpl]

'suggestedParameterName' @ [46:38] ==> private final fun suggestedParameterName(element: KtCallableDeclaration): String? defined in org.jetbrains.kotlin.idea.intentions.ReplaceUnderscoreWithParameterNameIntention[SimpleFunctionDescriptorImpl]

'element' @ [46:61] ==> value-parameter element: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.intentions.ReplaceUnderscoreWithParameterNameIntention.applyTo[ValueParameterDescriptorImpl]

'CollectingNameValidator' @ [47:25] ==> @JvmOverloads public constructor CollectingNameValidator(existingNames: Collection<String> = ..., filter: (String) -> Boolean = ...) defined in org.jetbrains.kotlin.idea.core.CollectingNameValidator[DeserializedClassConstructorDescriptor]

'NewDeclarationNameValidator' @ [48:26] ==> public constructor NewDeclarationNameValidator(container: PsiElement, anchor: PsiElement?, target: NewDeclarationNameValidator.Target, excludedDeclarations: List<KtDeclaration> = ...) defined in org.jetbrains.kotlin.idea.core.NewDeclarationNameValidator[DeserializedClassConstructorDescriptor]

'element' @ [48:54] ==> value-parameter element: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.intentions.ReplaceUnderscoreWithParameterNameIntention.applyTo[ValueParameterDescriptorImpl]

'parent' @ [48:62] ==> public final val KtCallableDeclaration.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'parent' @ [48:69] ==> public final val PsiElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'VARIABLES' @ [48:118] ==> enum entry VARIABLES defined in org.jetbrains.kotlin.idea.core.NewDeclarationNameValidator.Target[FakeCallableDescriptorForObject]

'suggestedParameterName' @ [50:20] ==> val suggestedParameterName: String? defined in org.jetbrains.kotlin.idea.intentions.ReplaceUnderscoreWithParameterNameIntention.applyTo[LocalVariableDescriptor]

'let' @ [50:44] ==> @InlineOnly public inline fun <T, R> String.let(block: (String) -> String): String defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> String

'KotlinNameSuggester' @ [51:13] ==> public object KotlinNameSuggester defined in org.jetbrains.kotlin.idea.core[FakeCallableDescriptorForObject]

'suggestNameByName' @ [51:33] ==> public final fun suggestNameByName(name: String, validator: (String) -> Boolean): String defined in org.jetbrains.kotlin.idea.core.KotlinNameSuggester[DeserializedSimpleFunctionDescriptor]

'it' @ [51:51] ==> value-parameter it: String defined in org.jetbrains.kotlin.idea.intentions.ReplaceUnderscoreWithParameterNameIntention.applyTo.<anonymous>[ValueParameterDescriptorImpl]

'validator' @ [51:55] ==> val validator: CollectingNameValidator defined in org.jetbrains.kotlin.idea.intentions.ReplaceUnderscoreWithParameterNameIntention.applyTo[LocalVariableDescriptor]

'run' @ [52:14] ==> @InlineOnly public inline fun <T, R> ReplaceUnderscoreWithParameterNameIntention.run(block: ReplaceUnderscoreWithParameterNameIntention.() -> String?): String? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ReplaceUnderscoreWithParameterNameIntention
    <R> -> String?

'element' @ [53:37] ==> value-parameter element: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.intentions.ReplaceUnderscoreWithParameterNameIntention.applyTo[ValueParameterDescriptorImpl]

'resolveToDescriptorIfAny' @ [53:45] ==> public fun KtDeclaration.resolveToDescriptorIfAny(bodyResolveMode: BodyResolveMode = ...): DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'elementDescriptor' @ [54:13] ==> val elementDescriptor: CallableDescriptor? defined in org.jetbrains.kotlin.idea.intentions.ReplaceUnderscoreWithParameterNameIntention.applyTo.<anonymous>[LocalVariableDescriptor]

'returnType' @ [54:32] ==> public final val CallableDescriptor.returnType: KotlinType?[MyPropertyDescriptor]

'let' @ [54:44] ==> @InlineOnly public inline fun <T, R> KotlinType.let(block: (KotlinType) -> String?): String? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType
    <R> -> String?

'KotlinNameSuggester' @ [54:50] ==> public object KotlinNameSuggester defined in org.jetbrains.kotlin.idea.core[FakeCallableDescriptorForObject]

'suggestNamesByType' @ [54:70] ==> public final fun suggestNamesByType(type: KotlinType, validator: (String) -> Boolean, defaultName: String? = ...): List<String> defined in org.jetbrains.kotlin.idea.core.KotlinNameSuggester[DeserializedSimpleFunctionDescriptor]

'it' @ [54:89] ==> value-parameter it: KotlinType defined in org.jetbrains.kotlin.idea.intentions.ReplaceUnderscoreWithParameterNameIntention.applyTo.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'validator' @ [54:93] ==> val validator: CollectingNameValidator defined in org.jetbrains.kotlin.idea.intentions.ReplaceUnderscoreWithParameterNameIntention.applyTo[LocalVariableDescriptor]

'firstOrNull' @ [54:104] ==> public fun <T> List<String>.firstOrNull(): String? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'element' @ [56:9] ==> value-parameter element: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.intentions.ReplaceUnderscoreWithParameterNameIntention.applyTo[ValueParameterDescriptorImpl]

'setName' @ [56:17] ==> public abstract fun setName(@NotNull p0: String): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtCallableDeclaration[JavaMethodDescriptor]

'name' @ [56:25] ==> val name: String defined in org.jetbrains.kotlin.idea.intentions.ReplaceUnderscoreWithParameterNameIntention.applyTo[LocalVariableDescriptor]

'when (element) {
                is KtDestructuringDeclarationEntry -> dataClassParameterName(element)
                is KtParameter -> lambdaParameterName(element)
                else -> null
            }' @ [60:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: String?, entry1: String?, entry2: String?): String?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> String?

'element' @ [60:19] ==> value-parameter element: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.intentions.ReplaceUnderscoreWithParameterNameIntention.suggestedParameterName[ValueParameterDescriptorImpl]

'dataClassParameterName' @ [61:55] ==> private final fun dataClassParameterName(declarationEntry: KtDestructuringDeclarationEntry): String? defined in org.jetbrains.kotlin.idea.intentions.ReplaceUnderscoreWithParameterNameIntention[SimpleFunctionDescriptorImpl]

'element' @ [61:78] ==> value-parameter element: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.intentions.ReplaceUnderscoreWithParameterNameIntention.suggestedParameterName[ValueParameterDescriptorImpl]

'lambdaParameterName' @ [62:35] ==> private final fun lambdaParameterName(element: KtParameter): String? defined in org.jetbrains.kotlin.idea.intentions.ReplaceUnderscoreWithParameterNameIntention[SimpleFunctionDescriptorImpl]

'element' @ [62:55] ==> value-parameter element: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.intentions.ReplaceUnderscoreWithParameterNameIntention.suggestedParameterName[ValueParameterDescriptorImpl]

'element' @ [67:31] ==> value-parameter element: KtParameter defined in org.jetbrains.kotlin.idea.intentions.ReplaceUnderscoreWithParameterNameIntention.lambdaParameterName[ValueParameterDescriptorImpl]

'getParentOfType' @ [67:39] ==> public inline fun <reified T : PsiElement> PsiElement.getParentOfType(strict: Boolean): KtFunctionLiteral? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtFunctionLiteral

'functionLiteral' @ [68:19] ==> val functionLiteral: KtFunctionLiteral defined in org.jetbrains.kotlin.idea.intentions.ReplaceUnderscoreWithParameterNameIntention.lambdaParameterName[LocalVariableDescriptor]

'valueParameters' @ [68:35] ==> public final val KtFunctionLiteral.valueParameters: (MutableList<(KtParameter..KtParameter?)>..List<(KtParameter..KtParameter?)>)[MyPropertyDescriptor]

'indexOf' @ [68:51] ==> public abstract fun indexOf(element: (KtParameter..KtParameter?)): Int defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'element' @ [68:59] ==> value-parameter element: KtParameter defined in org.jetbrains.kotlin.idea.intentions.ReplaceUnderscoreWithParameterNameIntention.lambdaParameterName[ValueParameterDescriptorImpl]

'idx' @ [69:13] ==> val idx: Int defined in org.jetbrains.kotlin.idea.intentions.ReplaceUnderscoreWithParameterNameIntention.lambdaParameterName[LocalVariableDescriptor]

'-' @ [69:20] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'functionLiteral' @ [70:23] ==> val functionLiteral: KtFunctionLiteral defined in org.jetbrains.kotlin.idea.intentions.ReplaceUnderscoreWithParameterNameIntention.lambdaParameterName[LocalVariableDescriptor]

'analyze' @ [70:39] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'PARTIAL' @ [70:63] ==> enum entry PARTIAL defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'element' @ [71:28] ==> value-parameter element: KtParameter defined in org.jetbrains.kotlin.idea.intentions.ReplaceUnderscoreWithParameterNameIntention.lambdaParameterName[ValueParameterDescriptorImpl]

'getParentResolvedCall' @ [71:36] ==> public fun KtElement?.getParentResolvedCall(context: BindingContext, strict: Boolean = ...): ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.resolve.calls.callUtil[DeserializedSimpleFunctionDescriptor]

'context' @ [71:58] ==> val context: BindingContext defined in org.jetbrains.kotlin.idea.intentions.ReplaceUnderscoreWithParameterNameIntention.lambdaParameterName[LocalVariableDescriptor]

'functionLiteral' @ [72:30] ==> val functionLiteral: KtFunctionLiteral defined in org.jetbrains.kotlin.idea.intentions.ReplaceUnderscoreWithParameterNameIntention.lambdaParameterName[LocalVariableDescriptor]

'getParentOfType' @ [72:46] ==> public inline fun <reified T : PsiElement> PsiElement.getParentOfType(strict: Boolean): KtLambdaArgument? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtLambdaArgument

'resolvedCall' @ [73:27] ==> val resolvedCall: ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.idea.intentions.ReplaceUnderscoreWithParameterNameIntention.lambdaParameterName[LocalVariableDescriptor]

'getParameterForArgument' @ [73:41] ==> public fun <D : CallableDescriptor> ResolvedCall<out CallableDescriptor>.getParameterForArgument(valueArgument: ValueArgument?): ValueParameterDescriptor? defined in org.jetbrains.kotlin.resolve.calls.callUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <D : CallableDescriptor> -> CallableDescriptor

'lambdaArgument' @ [73:65] ==> val lambdaArgument: KtLambdaArgument defined in org.jetbrains.kotlin.idea.intentions.ReplaceUnderscoreWithParameterNameIntention.lambdaParameterName[LocalVariableDescriptor]

'lambdaParam' @ [74:16] ==> val lambdaParam: ValueParameterDescriptor defined in org.jetbrains.kotlin.idea.intentions.ReplaceUnderscoreWithParameterNameIntention.lambdaParameterName[LocalVariableDescriptor]

'type' @ [74:28] ==> public final val ValueParameterDescriptor.type: KotlinType[MyPropertyDescriptor]

'arguments' @ [74:33] ==> public abstract val arguments: List<TypeProjection> defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'getOrNull' @ [74:43] ==> public fun <T> List<TypeProjection>.getOrNull(index: Int): TypeProjection? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeProjection

'idx' @ [74:53] ==> val idx: Int defined in org.jetbrains.kotlin.idea.intentions.ReplaceUnderscoreWithParameterNameIntention.lambdaParameterName[LocalVariableDescriptor]

'type' @ [74:59] ==> public final val TypeProjection.type: KotlinType[MyPropertyDescriptor]

'extractParameterNameFromFunctionTypeArgument' @ [74:65] ==> public fun KotlinType.extractParameterNameFromFunctionTypeArgument(): Name? defined in org.jetbrains.kotlin.builtins[DeserializedSimpleFunctionDescriptor]

'asString' @ [74:113] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'declarationEntry' @ [78:23] ==> value-parameter declarationEntry: KtDestructuringDeclarationEntry defined in org.jetbrains.kotlin.idea.intentions.ReplaceUnderscoreWithParameterNameIntention.dataClassParameterName[ValueParameterDescriptorImpl]

'analyze' @ [78:40] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'context' @ [79:37] ==> val context: BindingContext defined in org.jetbrains.kotlin.idea.intentions.ReplaceUnderscoreWithParameterNameIntention.dataClassParameterName[LocalVariableDescriptor]

'COMPONENT_RESOLVED_CALL' @ [79:60] ==> public final val COMPONENT_RESOLVED_CALL: (WritableSlice<(KtDestructuringDeclarationEntry..KtDestructuringDeclarationEntry?), (ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>..ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>?)>..WritableSlice<(KtDestructuringDeclarationEntry..KtDestructuringDeclarationEntry?), (ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>..ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'declarationEntry' @ [79:85] ==> value-parameter declarationEntry: KtDestructuringDeclarationEntry defined in org.jetbrains.kotlin.idea.intentions.ReplaceUnderscoreWithParameterNameIntention.dataClassParameterName[ValueParameterDescriptorImpl]

'componentResolvedCall' @ [80:24] ==> val componentResolvedCall: ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)> defined in org.jetbrains.kotlin.idea.intentions.ReplaceUnderscoreWithParameterNameIntention.dataClassParameterName[LocalVariableDescriptor]

'dispatchReceiver' @ [80:46] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>.dispatchReceiver: ReceiverValue?[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.FunctionDescriptor..org.jetbrains.kotlin.descriptors.FunctionDescriptor?)

'componentResolvedCall' @ [80:66] ==> val componentResolvedCall: ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)> defined in org.jetbrains.kotlin.idea.intentions.ReplaceUnderscoreWithParameterNameIntention.dataClassParameterName[LocalVariableDescriptor]

'extensionReceiver' @ [80:88] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>.extensionReceiver: ReceiverValue?[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.FunctionDescriptor..org.jetbrains.kotlin.descriptors.FunctionDescriptor?)

'receiver' @ [81:31] ==> val receiver: ReceiverValue defined in org.jetbrains.kotlin.idea.intentions.ReplaceUnderscoreWithParameterNameIntention.dataClassParameterName[LocalVariableDescriptor]

'type' @ [81:40] ==> public final val ReceiverValue.type: KotlinType[MyPropertyDescriptor]

'constructor' @ [81:45] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'declarationDescriptor' @ [81:57] ==> public final val TypeConstructor.declarationDescriptor: ClassifierDescriptor?[MyPropertyDescriptor]

'when {
            classDescriptor.isData -> {
                val primaryParameters = classDescriptor.unsubstitutedPrimaryConstructor?.valueParameters
                primaryParameters?.getOrNull(declarationEntry.entryIndex())?.name?.asString()
            }
            DescriptorUtils.isSubclass(classDescriptor, classDescriptor.builtIns.mapEntry) -> {
                listOf("key", "value").getOrNull(declarationEntry.entryIndex())
            }
            else -> null
        }' @ [82:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: String?, entry1: String?, entry2: String?): String?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> String?

'classDescriptor' @ [83:13] ==> val classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.idea.intentions.ReplaceUnderscoreWithParameterNameIntention.dataClassParameterName[LocalVariableDescriptor]

'isData' @ [83:29] ==> public final val ClassDescriptor.isData: Boolean[MyPropertyDescriptor]

'classDescriptor' @ [84:41] ==> val classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.idea.intentions.ReplaceUnderscoreWithParameterNameIntention.dataClassParameterName[LocalVariableDescriptor]

'unsubstitutedPrimaryConstructor' @ [84:57] ==> public final val ClassDescriptor.unsubstitutedPrimaryConstructor: ClassConstructorDescriptor?[MyPropertyDescriptor]

'valueParameters' @ [84:90] ==> public final val ClassConstructorDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'primaryParameters' @ [85:17] ==> val primaryParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>?..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>?) defined in org.jetbrains.kotlin.idea.intentions.ReplaceUnderscoreWithParameterNameIntention.dataClassParameterName[LocalVariableDescriptor]

'getOrNull' @ [85:36] ==> public fun <T> List<(ValueParameterDescriptor..ValueParameterDescriptor?)>.getOrNull(index: Int): ValueParameterDescriptor? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.ValueParameterDescriptor..org.jetbrains.kotlin.descriptors.ValueParameterDescriptor?)

'declarationEntry' @ [85:46] ==> value-parameter declarationEntry: KtDestructuringDeclarationEntry defined in org.jetbrains.kotlin.idea.intentions.ReplaceUnderscoreWithParameterNameIntention.dataClassParameterName[ValueParameterDescriptorImpl]

'entryIndex' @ [85:63] ==> private final fun KtDestructuringDeclarationEntry.entryIndex(): Int defined in org.jetbrains.kotlin.idea.intentions.ReplaceUnderscoreWithParameterNameIntention[SimpleFunctionDescriptorImpl]

'name' @ [85:78] ==> public final val ValueParameterDescriptor.name: Name[MyPropertyDescriptor]

'asString' @ [85:84] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'isSubclass' @ [87:29] ==> public open fun isSubclass(@NotNull p0: ClassDescriptor, @NotNull p1: ClassDescriptor): Boolean defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'classDescriptor' @ [87:40] ==> val classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.idea.intentions.ReplaceUnderscoreWithParameterNameIntention.dataClassParameterName[LocalVariableDescriptor]

'classDescriptor' @ [87:57] ==> val classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.idea.intentions.ReplaceUnderscoreWithParameterNameIntention.dataClassParameterName[LocalVariableDescriptor]

'builtIns' @ [87:73] ==> public val DeclarationDescriptor.builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedPropertyDescriptor]

'mapEntry' @ [87:82] ==> public final val KotlinBuiltIns.mapEntry: ClassDescriptor[MyPropertyDescriptor]

'listOf' @ [88:17] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'getOrNull' @ [88:40] ==> public fun <T> List<String>.getOrNull(index: Int): String? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'declarationEntry' @ [88:50] ==> value-parameter declarationEntry: KtDestructuringDeclarationEntry defined in org.jetbrains.kotlin.idea.intentions.ReplaceUnderscoreWithParameterNameIntention.dataClassParameterName[ValueParameterDescriptorImpl]

'entryIndex' @ [88:67] ==> private final fun KtDestructuringDeclarationEntry.entryIndex(): Int defined in org.jetbrains.kotlin.idea.intentions.ReplaceUnderscoreWithParameterNameIntention[SimpleFunctionDescriptorImpl]

'parent' @ [95:13] ==> public final val KtDestructuringDeclarationEntry.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'getChildrenOfType' @ [95:20] ==> public inline fun <reified T : PsiElement> PsiElement.getChildrenOfType(): Array<KtDestructuringDeclarationEntry> defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtDestructuringDeclarationEntry

'indexOf' @ [95:73] ==> public fun <@OnlyInputTypes T> Array<out KtDestructuringDeclarationEntry>.indexOf(element: KtDestructuringDeclarationEntry): Int defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> KtDestructuringDeclarationEntry

'this' @ [95:81] ==> <this> defined in org.jetbrains.kotlin.idea.intentions.ReplaceUnderscoreWithParameterNameIntention.entryIndex[ReceiverParameterDescriptorImpl]

