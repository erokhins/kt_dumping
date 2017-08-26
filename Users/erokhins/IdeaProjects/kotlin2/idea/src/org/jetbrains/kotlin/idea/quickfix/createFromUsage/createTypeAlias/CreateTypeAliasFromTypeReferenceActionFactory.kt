'KotlinSingleIntentionActionFactoryWithDelegate<KtUserType, TypeAliasInfo>' @ [35:56] ==> public constructor KotlinSingleIntentionActionFactoryWithDelegate<E : KtElement, D : Any>(actionPriority: IntentionActionPriority = ...) defined in org.jetbrains.kotlin.idea.quickfix.KotlinSingleIntentionActionFactoryWithDelegate[ClassConstructorDescriptorImpl]
Inferred types:
    <E : KtElement> -> KtUserType
    <D : Any> -> TypeAliasInfo

'LOW' @ [35:154] ==> enum entry LOW defined in org.jetbrains.kotlin.idea.quickfix.IntentionActionPriority[FakeCallableDescriptorForObject]

'CreateClassFromTypeReferenceActionFactory' @ [36:65] ==> public object CreateClassFromTypeReferenceActionFactory : CreateClassFromUsageFactory<KtUserType> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass in file CreateClassFromTypeReferenceActionFactory.kt[FakeCallableDescriptorForObject]

'getElementOfInterest' @ [36:107] ==> public open fun getElementOfInterest(diagnostic: Diagnostic): KtUserType? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromTypeReferenceActionFactory[SimpleFunctionDescriptorImpl]

'diagnostic' @ [36:128] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeAlias.CreateTypeAliasFromTypeReferenceActionFactory.getElementOfInterest[ValueParameterDescriptorImpl]

'element' @ [39:13] ==> value-parameter element: KtUserType defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeAlias.CreateTypeAliasFromTypeReferenceActionFactory.extractFixData[ValueParameterDescriptorImpl]

'getParentOfTypeAndBranch' @ [39:21] ==> public inline fun <reified T : PsiElement> PsiElement.getParentOfTypeAndBranch(strict: Boolean = ..., noinline branch: KtUserType.() -> PsiElement?): KtUserType? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtUserType

'qualifier' @ [39:66] ==> public final val KtUserType.qualifier: KtUserType?[MyPropertyDescriptor]

'!' @ [40:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'element' @ [40:14] ==> value-parameter element: KtUserType defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeAlias.CreateTypeAliasFromTypeReferenceActionFactory.extractFixData[ValueParameterDescriptorImpl]

'languageVersionSettings' @ [40:22] ==> public val KtElement.languageVersionSettings: LanguageVersionSettings defined in org.jetbrains.kotlin.idea.project[DeserializedPropertyDescriptor]

'supportsFeature' @ [40:46] ==> public open fun supportsFeature(feature: LanguageFeature): Boolean defined in org.jetbrains.kotlin.config.LanguageVersionSettings[DeserializedSimpleFunctionDescriptor]

'TypeAliases' @ [40:78] ==> enum entry TypeAliases defined in org.jetbrains.kotlin.config.LanguageFeature[FakeCallableDescriptorForObject]

'?:' @ [42:25] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: ClassInfo?, right: ClassInfo): ClassInfo[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> ClassInfo

'extractFixData' @ [42:67] ==> public open fun extractFixData(element: KtUserType, diagnostic: Diagnostic): ClassInfo? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromTypeReferenceActionFactory[SimpleFunctionDescriptorImpl]

'element' @ [42:82] ==> value-parameter element: KtUserType defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeAlias.CreateTypeAliasFromTypeReferenceActionFactory.extractFixData[ValueParameterDescriptorImpl]

'diagnostic' @ [42:91] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeAlias.CreateTypeAliasFromTypeReferenceActionFactory.extractFixData[ValueParameterDescriptorImpl]

'classInfo' @ [43:28] ==> val classInfo: ClassInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeAlias.CreateTypeAliasFromTypeReferenceActionFactory.extractFixData[LocalVariableDescriptor]

'applicableParents' @ [43:38] ==> public final val applicableParents: List<PsiElement> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.ClassInfo[PropertyDescriptorImpl]

'singleOrNull' @ [43:56] ==> public inline fun <T> Iterable<PsiElement>.singleOrNull(predicate: (PsiElement) -> Boolean): PsiElement? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'it' @ [43:71] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeAlias.CreateTypeAliasFromTypeReferenceActionFactory.extractFixData.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [43:95] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeAlias.CreateTypeAliasFromTypeReferenceActionFactory.extractFixData.<anonymous>[ValueParameterDescriptorImpl]

'getTypeConstraintInfo' @ [45:28] ==> public fun getTypeConstraintInfo(element: KtTypeElement): TypeConstraintInfo? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass in file createClassUtils.kt[SimpleFunctionDescriptorImpl]

'element' @ [45:50] ==> value-parameter element: KtUserType defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeAlias.CreateTypeAliasFromTypeReferenceActionFactory.extractFixData[ValueParameterDescriptorImpl]

'upperBound' @ [45:60] ==> public final val upperBound: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.TypeConstraintInfo[PropertyDescriptorImpl]

'expectedType' @ [46:13] ==> val expectedType: KotlinType? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeAlias.CreateTypeAliasFromTypeReferenceActionFactory.extractFixData[LocalVariableDescriptor]

'expectedType' @ [46:37] ==> val expectedType: KotlinType? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeAlias.CreateTypeAliasFromTypeReferenceActionFactory.extractFixData[LocalVariableDescriptor]

'containsError' @ [46:50] ==> public fun KotlinType.containsError(): Boolean defined in org.jetbrains.kotlin.types.typeUtil[DeserializedSimpleFunctionDescriptor]

'CollectingNameValidator' @ [48:25] ==> @JvmOverloads public constructor CollectingNameValidator(existingNames: Collection<String> = ..., filter: (String) -> Boolean = ...) defined in org.jetbrains.kotlin.idea.core.CollectingNameValidator[DeserializedClassConstructorDescriptor]

'NewDeclarationNameValidator' @ [49:26] ==> public constructor NewDeclarationNameValidator(container: PsiElement, anchor: PsiElement?, target: NewDeclarationNameValidator.Target, excludedDeclarations: List<KtDeclaration> = ...) defined in org.jetbrains.kotlin.idea.core.NewDeclarationNameValidator[DeserializedClassConstructorDescriptor]

'targetParent' @ [49:54] ==> val targetParent: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeAlias.CreateTypeAliasFromTypeReferenceActionFactory.extractFixData[LocalVariableDescriptor]

'FUNCTIONS_AND_CLASSES' @ [49:109] ==> enum entry FUNCTIONS_AND_CLASSES defined in org.jetbrains.kotlin.idea.core.NewDeclarationNameValidator.Target[FakeCallableDescriptorForObject]

'KotlinNameSuggester' @ [51:34] ==> public object KotlinNameSuggester defined in org.jetbrains.kotlin.idea.core[FakeCallableDescriptorForObject]

'suggestNamesForTypeParameters' @ [51:54] ==> public final fun suggestNamesForTypeParameters(count: Int, validator: (String) -> Boolean): List<String> defined in org.jetbrains.kotlin.idea.core.KotlinNameSuggester[DeserializedSimpleFunctionDescriptor]

'classInfo' @ [51:84] ==> val classInfo: ClassInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeAlias.CreateTypeAliasFromTypeReferenceActionFactory.extractFixData[LocalVariableDescriptor]

'typeArguments' @ [51:94] ==> public final val typeArguments: List<TypeInfo> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.ClassInfo[PropertyDescriptorImpl]

'size' @ [51:108] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'validator' @ [51:114] ==> val validator: CollectingNameValidator defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeAlias.CreateTypeAliasFromTypeReferenceActionFactory.extractFixData[LocalVariableDescriptor]

'TypeAliasInfo' @ [52:16] ==> public constructor TypeAliasInfo(name: String, targetParent: PsiElement, typeParameterNames: List<String>, expectedType: KotlinType?) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeAlias.TypeAliasInfo[ClassConstructorDescriptorImpl]

'classInfo' @ [52:30] ==> val classInfo: ClassInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeAlias.CreateTypeAliasFromTypeReferenceActionFactory.extractFixData[LocalVariableDescriptor]

'name' @ [52:40] ==> public final val name: String defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.ClassInfo[PropertyDescriptorImpl]

'targetParent' @ [52:46] ==> val targetParent: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeAlias.CreateTypeAliasFromTypeReferenceActionFactory.extractFixData[LocalVariableDescriptor]

'typeParameterNames' @ [52:60] ==> val typeParameterNames: List<String> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeAlias.CreateTypeAliasFromTypeReferenceActionFactory.extractFixData[LocalVariableDescriptor]

'expectedType' @ [52:80] ==> val expectedType: KotlinType? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeAlias.CreateTypeAliasFromTypeReferenceActionFactory.extractFixData[LocalVariableDescriptor]

'CreateTypeAliasFromUsageFix' @ [55:80] ==> public constructor CreateTypeAliasFromUsageFix<E : KtElement>(element: KtUserType, aliasInfo: TypeAliasInfo) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeAlias.CreateTypeAliasFromUsageFix[ClassConstructorDescriptorImpl]
Inferred types:
    <E : KtElement> -> KtUserType

'originalElement' @ [55:108] ==> value-parameter originalElement: KtUserType defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeAlias.CreateTypeAliasFromTypeReferenceActionFactory.createFix[ValueParameterDescriptorImpl]

'data' @ [55:125] ==> value-parameter data: TypeAliasInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeAlias.CreateTypeAliasFromTypeReferenceActionFactory.createFix[ValueParameterDescriptorImpl]

