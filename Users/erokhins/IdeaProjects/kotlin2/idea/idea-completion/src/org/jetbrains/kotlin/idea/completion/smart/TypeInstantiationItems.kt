'LinkedHashMap' @ [74:36] ==> public constructor LinkedHashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.LinkedHashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> FuzzyType
    <V : (Any..Any?)> -> MutableList<ExpectedInfo>

'expectedInfos' @ [75:30] ==> value-parameter expectedInfos: Collection<ExpectedInfo> defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.addTo[ValueParameterDescriptorImpl]

'expectedInfo' @ [76:31] ==> val expectedInfo: ExpectedInfo defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.addTo[LocalVariableDescriptor]

'multipleFuzzyTypes' @ [76:44] ==> public val ExpectedInfo.multipleFuzzyTypes: Collection<FuzzyType> defined in org.jetbrains.kotlin.idea.core[DeserializedPropertyDescriptor]

'expectedInfosGrouped' @ [77:17] ==> val expectedInfosGrouped: LinkedHashMap<FuzzyType, MutableList<ExpectedInfo>> defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.addTo[LocalVariableDescriptor]

'getOrPut' @ [77:38] ==> public inline fun <K, V> MutableMap<FuzzyType, MutableList<ExpectedInfo>>.getOrPut(key: FuzzyType, defaultValue: () -> MutableList<ExpectedInfo>): MutableList<ExpectedInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> FuzzyType
    <V> -> MutableList<ExpectedInfo>

'fuzzyType' @ [77:47] ==> val fuzzyType: FuzzyType defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.addTo[LocalVariableDescriptor]

'makeNotNullable' @ [77:57] ==> public fun FuzzyType.makeNotNullable(): FuzzyType defined in org.jetbrains.kotlin.idea.util[DeserializedSimpleFunctionDescriptor]

'ArrayList' @ [77:78] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> ExpectedInfo

'add' @ [77:92] ==> public abstract fun add(element: ExpectedInfo): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'expectedInfo' @ [77:96] ==> val expectedInfo: ExpectedInfo defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.addTo[LocalVariableDescriptor]

'component1' @ [81:15] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<FuzzyType, MutableList<ExpectedInfo>>.component1(): FuzzyType defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> FuzzyType
    <V> -> MutableList<ExpectedInfo>

'component2' @ [81:21] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<FuzzyType, MutableList<ExpectedInfo>>.component2(): MutableList<ExpectedInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> FuzzyType
    <V> -> MutableList<ExpectedInfo>

'expectedInfosGrouped' @ [81:31] ==> val expectedInfosGrouped: LinkedHashMap<FuzzyType, MutableList<ExpectedInfo>> defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.addTo[LocalVariableDescriptor]

'mergeTails' @ [82:24] ==> public fun mergeTails(tails: Collection<Tail?>): Tail? defined in org.jetbrains.kotlin.idea.completion.smart in file Utils.kt[SimpleFunctionDescriptorImpl]

'infos' @ [82:35] ==> val infos: MutableList<ExpectedInfo> defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.addTo[LocalVariableDescriptor]

'map' @ [82:41] ==> public inline fun <T, R> Iterable<ExpectedInfo>.map(transform: (ExpectedInfo) -> Tail?): List<Tail?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ExpectedInfo
    <R> -> Tail?

'it' @ [82:47] ==> value-parameter it: ExpectedInfo defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.addTo.<anonymous>[ValueParameterDescriptorImpl]

'tail' @ [82:50] ==> public final val tail: Tail? defined in org.jetbrains.kotlin.idea.core.ExpectedInfo[DeserializedPropertyDescriptor]

'addTo' @ [83:13] ==> private final fun addTo(items: MutableCollection<LookupElement>, inheritanceSearchers: MutableCollection<InheritanceItemsSearcher>, fuzzyType: FuzzyType, tail: Tail?): Unit defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems[SimpleFunctionDescriptorImpl]

'items' @ [83:19] ==> value-parameter items: MutableCollection<LookupElement> defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.addTo[ValueParameterDescriptorImpl]

'inheritanceSearchers' @ [83:26] ==> value-parameter inheritanceSearchers: MutableCollection<InheritanceItemsSearcher> defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.addTo[ValueParameterDescriptorImpl]

'type' @ [83:48] ==> val type: FuzzyType defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.addTo[LocalVariableDescriptor]

'tail' @ [83:54] ==> val tail: Tail? defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.addTo[LocalVariableDescriptor]

'fuzzyType' @ [93:13] ==> value-parameter fuzzyType: FuzzyType defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.addTo[ValueParameterDescriptorImpl]

'type' @ [93:23] ==> public final val type: KotlinType defined in org.jetbrains.kotlin.idea.util.FuzzyType[DeserializedPropertyDescriptor]

'isFunctionType' @ [93:28] ==> public val KotlinType.isFunctionType: Boolean defined in org.jetbrains.kotlin.builtins[DeserializedPropertyDescriptor]

'fuzzyType' @ [95:26] ==> value-parameter fuzzyType: FuzzyType defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.addTo[ValueParameterDescriptorImpl]

'type' @ [95:36] ==> public final val type: KotlinType defined in org.jetbrains.kotlin.idea.util.FuzzyType[DeserializedPropertyDescriptor]

'constructor' @ [95:41] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'declarationDescriptor' @ [95:53] ==> public final val TypeConstructor.declarationDescriptor: ClassifierDescriptor?[MyPropertyDescriptor]

'when (classifier) {
            is ClassDescriptor -> classifier
            is TypeAliasDescriptor -> classifier.classDescriptor
            else -> null
        }' @ [96:31] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: ClassDescriptor?, entry1: ClassDescriptor?, entry2: ClassDescriptor?): ClassDescriptor?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> ClassDescriptor?

'classifier' @ [96:37] ==> val classifier: ClassifierDescriptorWithTypeParameters defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.addTo[LocalVariableDescriptor]

'classifier' @ [97:35] ==> val classifier: ClassifierDescriptorWithTypeParameters defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.addTo[LocalVariableDescriptor]

'classifier' @ [98:39] ==> val classifier: ClassifierDescriptorWithTypeParameters defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.addTo[LocalVariableDescriptor]

'classDescriptor' @ [98:50] ==> public abstract val classDescriptor: ClassDescriptor? defined in org.jetbrains.kotlin.descriptors.TypeAliasDescriptor[DeserializedPropertyDescriptor]

'addSamConstructorItem' @ [102:9] ==> private final fun addSamConstructorItem(collection: MutableCollection<LookupElement>, classifier: ClassifierDescriptorWithTypeParameters, classDescriptor: ClassDescriptor?, tail: Tail?): Unit defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems[SimpleFunctionDescriptorImpl]

'items' @ [102:31] ==> value-parameter items: MutableCollection<LookupElement> defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.addTo[ValueParameterDescriptorImpl]

'classifier' @ [102:38] ==> val classifier: ClassifierDescriptorWithTypeParameters defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.addTo[LocalVariableDescriptor]

'classDescriptor' @ [102:50] ==> val classDescriptor: ClassDescriptor? defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.addTo[LocalVariableDescriptor]

'tail' @ [102:67] ==> value-parameter tail: Tail? defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.addTo[ValueParameterDescriptorImpl]

'items' @ [103:9] ==> value-parameter items: MutableCollection<LookupElement> defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.addTo[ValueParameterDescriptorImpl]

'addIfNotNull' @ [103:15] ==> public fun <T : Any> MutableCollection<LookupElement>.addIfNotNull(t: LookupElement?): Unit defined in org.jetbrains.kotlin.utils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> LookupElement

'createTypeInstantiationItem' @ [103:28] ==> private final fun createTypeInstantiationItem(fuzzyType: FuzzyType, classDescriptor: ClassDescriptor?, tail: Tail?): LookupElement? defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems[SimpleFunctionDescriptorImpl]

'fuzzyType' @ [103:56] ==> value-parameter fuzzyType: FuzzyType defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.addTo[ValueParameterDescriptorImpl]

'classDescriptor' @ [103:67] ==> val classDescriptor: ClassDescriptor? defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.addTo[LocalVariableDescriptor]

'tail' @ [103:84] ==> value-parameter tail: Tail? defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.addTo[ValueParameterDescriptorImpl]

'indicesHelper' @ [105:9] ==> public final val indicesHelper: KotlinIndicesHelper defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems[PropertyDescriptorImpl]

'resolveTypeAliasesUsingIndex' @ [105:23] ==> public final fun resolveTypeAliasesUsingIndex(type: KotlinType, originalTypeName: String): Set<TypeAliasDescriptor> defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper[DeserializedSimpleFunctionDescriptor]

'fuzzyType' @ [105:52] ==> value-parameter fuzzyType: FuzzyType defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.addTo[ValueParameterDescriptorImpl]

'type' @ [105:62] ==> public final val type: KotlinType defined in org.jetbrains.kotlin.idea.util.FuzzyType[DeserializedPropertyDescriptor]

'classifier' @ [105:68] ==> val classifier: ClassifierDescriptorWithTypeParameters defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.addTo[LocalVariableDescriptor]

'name' @ [105:79] ==> public final val ClassifierDescriptorWithTypeParameters.name: Name[MyPropertyDescriptor]

'asString' @ [105:84] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'forEach' @ [105:96] ==> @HidesMembers public inline fun <T> Iterable<TypeAliasDescriptor>.forEach(action: (TypeAliasDescriptor) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeAliasDescriptor

'addSamConstructorItem' @ [106:13] ==> private final fun addSamConstructorItem(collection: MutableCollection<LookupElement>, classifier: ClassifierDescriptorWithTypeParameters, classDescriptor: ClassDescriptor?, tail: Tail?): Unit defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems[SimpleFunctionDescriptorImpl]

'items' @ [106:35] ==> value-parameter items: MutableCollection<LookupElement> defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.addTo[ValueParameterDescriptorImpl]

'it' @ [106:42] ==> value-parameter it: TypeAliasDescriptor defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.addTo.<anonymous>[ValueParameterDescriptorImpl]

'classDescriptor' @ [106:46] ==> val classDescriptor: ClassDescriptor? defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.addTo[LocalVariableDescriptor]

'tail' @ [106:63] ==> value-parameter tail: Tail? defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.addTo[ValueParameterDescriptorImpl]

'it' @ [107:38] ==> value-parameter it: TypeAliasDescriptor defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.addTo.<anonymous>[ValueParameterDescriptorImpl]

'defaultType' @ [107:41] ==> public final val TypeAliasDescriptor.defaultType: SimpleType[MyPropertyDescriptor]

'toFuzzyType' @ [107:53] ==> public fun KotlinType.toFuzzyType(freeParameters: Collection<TypeParameterDescriptor>): FuzzyType defined in org.jetbrains.kotlin.idea.util[DeserializedSimpleFunctionDescriptor]

'fuzzyType' @ [107:65] ==> value-parameter fuzzyType: FuzzyType defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.addTo[ValueParameterDescriptorImpl]

'freeParameters' @ [107:75] ==> public final val freeParameters: Set<TypeParameterDescriptor> defined in org.jetbrains.kotlin.idea.util.FuzzyType[DeserializedPropertyDescriptor]

'items' @ [108:13] ==> value-parameter items: MutableCollection<LookupElement> defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.addTo[ValueParameterDescriptorImpl]

'addIfNotNull' @ [108:19] ==> public fun <T : Any> MutableCollection<LookupElement>.addIfNotNull(t: LookupElement?): Unit defined in org.jetbrains.kotlin.utils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> LookupElement

'createTypeInstantiationItem' @ [108:32] ==> private final fun createTypeInstantiationItem(fuzzyType: FuzzyType, classDescriptor: ClassDescriptor?, tail: Tail?): LookupElement? defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems[SimpleFunctionDescriptorImpl]

'typeAliasFuzzyType' @ [108:60] ==> val typeAliasFuzzyType: FuzzyType defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.addTo.<anonymous>[LocalVariableDescriptor]

'classDescriptor' @ [108:80] ==> val classDescriptor: ClassDescriptor? defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.addTo[LocalVariableDescriptor]

'tail' @ [108:97] ==> value-parameter tail: Tail? defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.addTo[ValueParameterDescriptorImpl]

'classDescriptor' @ [111:13] ==> val classDescriptor: ClassDescriptor? defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.addTo[LocalVariableDescriptor]

'!' @ [111:40] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'forOrdinaryCompletion' @ [111:41] ==> public final val forOrdinaryCompletion: Boolean defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems[PropertyDescriptorImpl]

'!' @ [111:66] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isAny' @ [111:82] ==> public open fun isAny(@NotNull p0: ClassDescriptor): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'classDescriptor' @ [111:88] ==> val classDescriptor: ClassDescriptor? defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.addTo[LocalVariableDescriptor]

'fuzzyType' @ [112:28] ==> value-parameter fuzzyType: FuzzyType defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.addTo[ValueParameterDescriptorImpl]

'type' @ [112:38] ==> public final val type: KotlinType defined in org.jetbrains.kotlin.idea.util.FuzzyType[DeserializedPropertyDescriptor]

'arguments' @ [112:43] ==> public abstract val arguments: List<TypeProjection> defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'inheritanceSearchers' @ [113:13] ==> value-parameter inheritanceSearchers: MutableCollection<InheritanceItemsSearcher> defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.addTo[ValueParameterDescriptorImpl]

'addInheritorSearcher' @ [113:34] ==> private final fun MutableCollection<InheritanceItemsSearcher>.addInheritorSearcher(descriptor: ClassDescriptor, kotlinClassDescriptor: ClassDescriptor, typeArgs: List<TypeProjection>, freeParameters: Collection<TypeParameterDescriptor>, tail: Tail?): Unit defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems[SimpleFunctionDescriptorImpl]

'classDescriptor' @ [113:55] ==> val classDescriptor: ClassDescriptor? defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.addTo[LocalVariableDescriptor]

'classDescriptor' @ [113:72] ==> val classDescriptor: ClassDescriptor? defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.addTo[LocalVariableDescriptor]

'typeArgs' @ [113:89] ==> val typeArgs: List<TypeProjection> defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.addTo[LocalVariableDescriptor]

'fuzzyType' @ [113:99] ==> value-parameter fuzzyType: FuzzyType defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.addTo[ValueParameterDescriptorImpl]

'freeParameters' @ [113:109] ==> public final val freeParameters: Set<TypeParameterDescriptor> defined in org.jetbrains.kotlin.idea.util.FuzzyType[DeserializedPropertyDescriptor]

'tail' @ [113:125] ==> value-parameter tail: Tail? defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.addTo[ValueParameterDescriptorImpl]

'JavaToKotlinClassMap' @ [115:31] ==> public object JavaToKotlinClassMap : PlatformToKotlinClassMap defined in org.jetbrains.kotlin.platform[FakeCallableDescriptorForObject]

'mapKotlinToJava' @ [115:52] ==> public final fun mapKotlinToJava(kotlinFqName: FqNameUnsafe): ClassId? defined in org.jetbrains.kotlin.platform.JavaToKotlinClassMap[DeserializedSimpleFunctionDescriptor]

'getFqName' @ [115:84] ==> @NotNull public open fun getFqName(@NotNull p0: DeclarationDescriptor): FqNameUnsafe defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'classifier' @ [115:94] ==> val classifier: ClassifierDescriptorWithTypeParameters defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.addTo[LocalVariableDescriptor]

'javaClassId' @ [116:17] ==> val javaClassId: ClassId? defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.addTo[LocalVariableDescriptor]

'resolutionFacade' @ [117:34] ==> public final val resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems[PropertyDescriptorImpl]

'moduleDescriptor' @ [117:51] ==> public abstract val moduleDescriptor: ModuleDescriptor defined in org.jetbrains.kotlin.idea.resolve.ResolutionFacade[DeserializedPropertyDescriptor]

'resolveTopLevelClass' @ [117:68] ==> public fun ModuleDescriptor.resolveTopLevelClass(topLevelClassFqName: FqName, location: LookupLocation): ClassDescriptor? defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedSimpleFunctionDescriptor]

'javaClassId' @ [117:89] ==> val javaClassId: ClassId? defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.addTo[LocalVariableDescriptor]

'asSingleFqName' @ [117:101] ==> @NotNull public open fun asSingleFqName(): FqName defined in org.jetbrains.kotlin.name.ClassId[JavaMethodDescriptor]

'FROM_IDE' @ [117:136] ==> enum entry FROM_IDE defined in org.jetbrains.kotlin.incremental.components.NoLookupLocation[FakeCallableDescriptorForObject]

'javaAnalog' @ [118:21] ==> val javaAnalog: ClassDescriptor? defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.addTo[LocalVariableDescriptor]

'inheritanceSearchers' @ [119:21] ==> value-parameter inheritanceSearchers: MutableCollection<InheritanceItemsSearcher> defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.addTo[ValueParameterDescriptorImpl]

'addInheritorSearcher' @ [119:42] ==> private final fun MutableCollection<InheritanceItemsSearcher>.addInheritorSearcher(descriptor: ClassDescriptor, kotlinClassDescriptor: ClassDescriptor, typeArgs: List<TypeProjection>, freeParameters: Collection<TypeParameterDescriptor>, tail: Tail?): Unit defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems[SimpleFunctionDescriptorImpl]

'javaAnalog' @ [119:63] ==> val javaAnalog: ClassDescriptor? defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.addTo[LocalVariableDescriptor]

'classDescriptor' @ [119:75] ==> val classDescriptor: ClassDescriptor? defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.addTo[LocalVariableDescriptor]

'typeArgs' @ [119:92] ==> val typeArgs: List<TypeProjection> defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.addTo[LocalVariableDescriptor]

'fuzzyType' @ [119:102] ==> value-parameter fuzzyType: FuzzyType defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.addTo[ValueParameterDescriptorImpl]

'freeParameters' @ [119:112] ==> public final val freeParameters: Set<TypeParameterDescriptor> defined in org.jetbrains.kotlin.idea.util.FuzzyType[DeserializedPropertyDescriptor]

'tail' @ [119:128] ==> value-parameter tail: Tail? defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.addTo[ValueParameterDescriptorImpl]

'?:' @ [128:28] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: PsiElement?, right: PsiElement): PsiElement[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> PsiElement

'getAnyDeclaration' @ [128:55] ==> public final fun getAnyDeclaration(project: Project, descriptor: DeclarationDescriptor): PsiElement? defined in org.jetbrains.kotlin.idea.codeInsight.DescriptorToSourceUtilsIde[DeserializedSimpleFunctionDescriptor]

'resolutionFacade' @ [128:73] ==> public final val resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems[PropertyDescriptorImpl]

'project' @ [128:90] ==> public abstract val project: Project defined in org.jetbrains.kotlin.idea.resolve.ResolutionFacade[DeserializedPropertyDescriptor]

'descriptor' @ [128:99] ==> value-parameter descriptor: ClassDescriptor defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.addInheritorSearcher[ValueParameterDescriptorImpl]

'if (_declaration is KtDeclaration)
            toFromOriginalFileMapper.toOriginalFile(_declaration) ?: return
        else
            _declaration' @ [129:27] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: PsiElement, elseBranch: PsiElement): PsiElement[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> PsiElement

'_declaration' @ [129:31] ==> val _declaration: PsiElement defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.addInheritorSearcher[LocalVariableDescriptor]

'toFromOriginalFileMapper' @ [130:13] ==> public final val toFromOriginalFileMapper: ToFromOriginalFileMapper defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems[PropertyDescriptorImpl]

'toOriginalFile' @ [130:38] ==> public final fun <TElement : PsiElement> toOriginalFile(element: KtDeclaration): KtDeclaration? defined in org.jetbrains.kotlin.idea.completion.ToFromOriginalFileMapper[SimpleFunctionDescriptorImpl]
Inferred types:
    <TElement : PsiElement> -> KtDeclaration

'_declaration' @ [130:53] ==> val _declaration: PsiElement defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.addInheritorSearcher[LocalVariableDescriptor]

'_declaration' @ [132:13] ==> val _declaration: PsiElement defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.addInheritorSearcher[LocalVariableDescriptor]

'when (declaration) {
            is PsiClass -> declaration
            is KtClassOrObject -> declaration.toLightClass() ?: return
            else -> return
        }' @ [134:34] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: PsiClass, entry1: PsiClass, entry2: PsiClass): PsiClass[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> PsiClass

'declaration' @ [134:40] ==> val declaration: PsiElement defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.addInheritorSearcher[LocalVariableDescriptor]

'declaration' @ [135:28] ==> val declaration: PsiElement defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.addInheritorSearcher[LocalVariableDescriptor]

'declaration' @ [136:35] ==> val declaration: PsiElement defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.addInheritorSearcher[LocalVariableDescriptor]

'toLightClass' @ [136:47] ==> public fun KtClassOrObject.toLightClass(): KtLightClass? defined in org.jetbrains.kotlin.asJava[DeserializedSimpleFunctionDescriptor]

'add' @ [139:9] ==> public abstract fun add(element: InheritanceItemsSearcher): Boolean defined in kotlin.collections.MutableCollection[DeserializedSimpleFunctionDescriptor]

'InheritanceSearcher' @ [139:13] ==> public constructor InheritanceSearcher(psiClass: PsiClass, classDescriptor: ClassDescriptor, typeArgs: List<TypeProjection>, freeParameters: Collection<TypeParameterDescriptor>, tail: Tail?) defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.InheritanceSearcher[ClassConstructorDescriptorImpl]

'psiClass' @ [139:33] ==> val psiClass: PsiClass defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.addInheritorSearcher[LocalVariableDescriptor]

'kotlinClassDescriptor' @ [139:43] ==> value-parameter kotlinClassDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.addInheritorSearcher[ValueParameterDescriptorImpl]

'typeArgs' @ [139:66] ==> value-parameter typeArgs: List<TypeProjection> defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.addInheritorSearcher[ValueParameterDescriptorImpl]

'freeParameters' @ [139:76] ==> value-parameter freeParameters: Collection<TypeParameterDescriptor> defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.addInheritorSearcher[ValueParameterDescriptorImpl]

'tail' @ [139:92] ==> value-parameter tail: Tail? defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.addInheritorSearcher[ValueParameterDescriptorImpl]

'fuzzyType' @ [143:26] ==> value-parameter fuzzyType: FuzzyType defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.createTypeInstantiationItem[ValueParameterDescriptorImpl]

'type' @ [143:36] ==> public final val type: KotlinType defined in org.jetbrains.kotlin.idea.util.FuzzyType[DeserializedPropertyDescriptor]

'constructor' @ [143:41] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'declarationDescriptor' @ [143:53] ==> public final val TypeConstructor.declarationDescriptor: ClassifierDescriptor?[MyPropertyDescriptor]

'lookupElementFactory' @ [145:29] ==> public final val lookupElementFactory: LookupElementFactory defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems[PropertyDescriptorImpl]

'createLookupElement' @ [145:50] ==> public open fun createLookupElement(descriptor: DeclarationDescriptor, useReceiverTypes: Boolean, qualifyNestedClasses: Boolean, includeClassTypeArguments: Boolean, parametersAndTypeGrayed: Boolean): LookupElement defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory[SimpleFunctionDescriptorImpl]

'classifier' @ [145:70] ==> val classifier: ClassifierDescriptorWithTypeParameters defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.createTypeInstantiationItem[LocalVariableDescriptor]

'isNonCompanionObject' @ [147:29] ==> public open fun isNonCompanionObject(@NotNull p0: DeclarationDescriptor): Boolean defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'classifier' @ [147:50] ==> val classifier: ClassifierDescriptorWithTypeParameters defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.createTypeInstantiationItem[LocalVariableDescriptor]

'lookupElement' @ [148:20] ==> var lookupElement: LookupElement defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.createTypeInstantiationItem[LocalVariableDescriptor]

'addTail' @ [148:34] ==> public fun LookupElement.addTail(tail: Tail?): LookupElement defined in org.jetbrains.kotlin.idea.completion.smart in file Utils.kt[SimpleFunctionDescriptorImpl]

'tail' @ [148:42] ==> value-parameter tail: Tail? defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.createTypeInstantiationItem[ValueParameterDescriptorImpl]

'classifier' @ [152:13] ==> val classifier: ClassifierDescriptorWithTypeParameters defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.createTypeInstantiationItem[LocalVariableDescriptor]

'isInner' @ [152:24] ==> public final val ClassifierDescriptorWithTypeParameters.isInner: Boolean[MyPropertyDescriptor]

'classDescriptor' @ [154:26] ==> value-parameter classDescriptor: ClassDescriptor? defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.createTypeInstantiationItem[ValueParameterDescriptorImpl]

'modality' @ [154:43] ==> public final val ClassDescriptor.modality: Modality[MyPropertyDescriptor]

'ABSTRACT' @ [154:64] ==> enum entry ABSTRACT defined in org.jetbrains.kotlin.descriptors.Modality[FakeCallableDescriptorForObject]

'forOrdinaryCompletion' @ [155:13] ==> public final val forOrdinaryCompletion: Boolean defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems[PropertyDescriptorImpl]

'isAbstract' @ [155:38] ==> val isAbstract: Boolean defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.createTypeInstantiationItem[LocalVariableDescriptor]

'classifier' @ [157:31] ==> val classifier: ClassifierDescriptorWithTypeParameters defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.createTypeInstantiationItem[LocalVariableDescriptor]

'constructors' @ [157:42] ==> public val ClassifierDescriptorWithTypeParameters.constructors: Collection<ConstructorDescriptor> defined in org.jetbrains.kotlin.util[DeserializedPropertyDescriptor]

'allConstructors' @ [158:35] ==> val allConstructors: Collection<ConstructorDescriptor> defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.createTypeInstantiationItem[LocalVariableDescriptor]

'filter' @ [158:51] ==> public inline fun <T> Iterable<ConstructorDescriptor>.filter(predicate: (ConstructorDescriptor) -> Boolean): List<ConstructorDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ConstructorDescriptor

'if (isAbstract)
                visibilityFilter(it) || it.visibility == Visibilities.PROTECTED
            else
                visibilityFilter(it)' @ [159:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Boolean, elseBranch: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Boolean

'isAbstract' @ [159:17] ==> val isAbstract: Boolean defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.createTypeInstantiationItem[LocalVariableDescriptor]

'invoke' @ [160:17] ==> public abstract operator fun invoke(p1: DeclarationDescriptor): Boolean defined in kotlin.Function1[FunctionInvokeDescriptor]

'it' @ [160:34] ==> value-parameter it: ConstructorDescriptor defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.createTypeInstantiationItem.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [160:41] ==> value-parameter it: ConstructorDescriptor defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.createTypeInstantiationItem.<anonymous>[ValueParameterDescriptorImpl]

'visibility' @ [160:44] ==> public final val ConstructorDescriptor.visibility: Visibility[MyPropertyDescriptor]

'PROTECTED' @ [160:71] ==> @NotNull public final val PROTECTED: Visibility defined in org.jetbrains.kotlin.descriptors.Visibilities[JavaPropertyDescriptor]

'invoke' @ [162:17] ==> public abstract operator fun invoke(p1: DeclarationDescriptor): Boolean defined in kotlin.Function1[FunctionInvokeDescriptor]

'it' @ [162:34] ==> value-parameter it: ConstructorDescriptor defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.createTypeInstantiationItem.<anonymous>[ValueParameterDescriptorImpl]

'allConstructors' @ [164:13] ==> val allConstructors: Collection<ConstructorDescriptor> defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.createTypeInstantiationItem[LocalVariableDescriptor]

'isNotEmpty' @ [164:29] ==> @InlineOnly public inline fun <T> Collection<ConstructorDescriptor>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ConstructorDescriptor

'visibleConstructors' @ [164:45] ==> val visibleConstructors: List<ConstructorDescriptor> defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.createTypeInstantiationItem[LocalVariableDescriptor]

'isEmpty' @ [164:65] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'lookupElement' @ [166:28] ==> var lookupElement: LookupElement defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.createTypeInstantiationItem[LocalVariableDescriptor]

'lookupString' @ [166:42] ==> public final val LookupElement.lookupString: String[MyPropertyDescriptor]

'setOf' @ [167:32] ==> public fun <T> setOf(element: String): Set<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'lookupString' @ [167:38] ==> var lookupString: String defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.createTypeInstantiationItem[LocalVariableDescriptor]

'lookupString' @ [168:24] ==> var lookupString: String defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.createTypeInstantiationItem[LocalVariableDescriptor]

'IdeDescriptorRenderers' @ [170:24] ==> public object IdeDescriptorRenderers defined in org.jetbrains.kotlin.idea.util[FakeCallableDescriptorForObject]

'SOURCE_CODE' @ [170:47] ==> @field:JvmField public final val SOURCE_CODE: DescriptorRenderer defined in org.jetbrains.kotlin.idea.util.IdeDescriptorRenderers[DeserializedPropertyDescriptor]

'renderClassifierName' @ [170:59] ==> public abstract fun renderClassifierName(klass: ClassifierDescriptor): String defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[DeserializedSimpleFunctionDescriptor]

'classifier' @ [170:80] ==> val classifier: ClassifierDescriptorWithTypeParameters defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.createTypeInstantiationItem[LocalVariableDescriptor]

'if (isAbstract) {
            val typeArgs = fuzzyType.type.arguments
            // drop "in" and "out" from type arguments - they cannot be used in constructor call
            val typeArgsToUse = typeArgs.map { TypeProjectionImpl(Variance.INVARIANT, it.type) }

            val allTypeArgsKnown = fuzzyType.freeParameters.isEmpty() || typeArgs.none { it.type.areTypeParametersUsedInside(fuzzyType.freeParameters) }
            itemText += if (allTypeArgsKnown) {
                IdeDescriptorRenderers.SOURCE_CODE_SHORT_NAMES_IN_TYPES.renderTypeArguments(typeArgsToUse)
            }
            else {
                "<...>"
            }

            val constructorParenthesis = if (classifier.kind != ClassKind.INTERFACE) "()" else ""
            itemText += constructorParenthesis
            itemText = "object: $itemText{...}"
            lookupString = "object"
            allLookupStrings = setOf(lookupString, lookupElement.lookupString)
            insertHandler = InsertHandler<LookupElement> { context, _ ->
                val startOffset = context.startOffset

                val text1 = "object: $typeText"
                val text2 = "$constructorParenthesis {}"
                val text = if (allTypeArgsKnown)
                    text1 + IdeDescriptorRenderers.SOURCE_CODE.renderTypeArguments(typeArgsToUse) + text2
                else
                    text1 + "<>" + text2

                context.document.replaceString(startOffset, context.tailOffset, text)

                if (allTypeArgsKnown) {
                    context.editor.caretModel.moveToOffset(startOffset + text.length - 1)

                    shortenReferences(context, startOffset, startOffset + text.length)

                    ImplementMembersHandler().invoke(context.project, context.editor, context.file, true)
                }
                else {
                    context.editor.caretModel.moveToOffset(startOffset + text1.length + 1) // put caret into "<>"

                    shortenReferences(context, startOffset, startOffset + text.length)
                }
            }
            lookupElement = lookupElement.suppressAutoInsertion()
            lookupElement = lookupElement.assignSmartCompletionPriority(SmartCompletionItemPriority.ANONYMOUS_OBJECT)
        }
        else {
            //TODO: when constructor has one parameter of lambda type with more than one parameter, generate special additional item
            signatureText = when (visibleConstructors.size) {
                0 -> "()"

                1 -> {
                    val constructor = visibleConstructors.single()
                    val substitutor = TypeSubstitutor.create(fuzzyType.presentationType())
                    val substitutedConstructor = constructor.substitute(substitutor) ?: constructor // render original signature if failed to substitute
                    BasicLookupElementFactory.SHORT_NAMES_RENDERER.renderFunctionParameters(substitutedConstructor)
                }

                else -> "(...)"
            }

            val baseInsertHandler = when (visibleConstructors.size) {
                0 -> KotlinFunctionInsertHandler.Normal(CallType.DEFAULT, inputTypeArguments = false, inputValueArguments = false, argumentsOnly = true)

                1 -> (lookupElementFactory.insertHandlerProvider.insertHandler(visibleConstructors.single()) as KotlinFunctionInsertHandler.Normal)
                        .copy(argumentsOnly = true)

                else -> KotlinFunctionInsertHandler.Normal(CallType.DEFAULT, inputTypeArguments = false, inputValueArguments = true, argumentsOnly = true)
            }

            insertHandler = object : InsertHandler<LookupElement> {
                override fun handleInsert(context: InsertionContext, item: LookupElement) {
                    context.document.replaceString(context.startOffset, context.tailOffset, typeText)
                    context.tailOffset = context.startOffset + typeText.length

                    baseInsertHandler.handleInsert(context, item)

                    shortenReferences(context, context.startOffset, context.tailOffset)
                }
            }
            if (baseInsertHandler.inputValueArguments) {
                lookupElement = lookupElement.keepOldArgumentListOnTab()
            }
            if (baseInsertHandler.lambdaInfo != null) {
                lookupElement.putUserData(KotlinCompletionCharFilter.ACCEPT_OPENING_BRACE, Unit)
            }
            lookupElement = lookupElement.assignSmartCompletionPriority(SmartCompletionItemPriority.INSTANTIATION)
        }' @ [173:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'isAbstract' @ [173:13] ==> val isAbstract: Boolean defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.createTypeInstantiationItem[LocalVariableDescriptor]

'fuzzyType' @ [174:28] ==> value-parameter fuzzyType: FuzzyType defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.createTypeInstantiationItem[ValueParameterDescriptorImpl]

'type' @ [174:38] ==> public final val type: KotlinType defined in org.jetbrains.kotlin.idea.util.FuzzyType[DeserializedPropertyDescriptor]

'arguments' @ [174:43] ==> public abstract val arguments: List<TypeProjection> defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'typeArgs' @ [176:33] ==> val typeArgs: List<TypeProjection> defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.createTypeInstantiationItem[LocalVariableDescriptor]

'map' @ [176:42] ==> public inline fun <T, R> Iterable<TypeProjection>.map(transform: (TypeProjection) -> TypeProjectionImpl): List<TypeProjectionImpl> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeProjection
    <R> -> TypeProjectionImpl

'TypeProjectionImpl' @ [176:48] ==> public constructor TypeProjectionImpl(@NotNull p0: Variance, @NotNull p1: KotlinType) defined in org.jetbrains.kotlin.types.TypeProjectionImpl[JavaClassConstructorDescriptor]

'INVARIANT' @ [176:76] ==> enum entry INVARIANT defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

'it' @ [176:87] ==> value-parameter it: TypeProjection defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.createTypeInstantiationItem.<anonymous>[ValueParameterDescriptorImpl]

'type' @ [176:90] ==> public final val TypeProjection.type: KotlinType[MyPropertyDescriptor]

'fuzzyType' @ [178:36] ==> value-parameter fuzzyType: FuzzyType defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.createTypeInstantiationItem[ValueParameterDescriptorImpl]

'freeParameters' @ [178:46] ==> public final val freeParameters: Set<TypeParameterDescriptor> defined in org.jetbrains.kotlin.idea.util.FuzzyType[DeserializedPropertyDescriptor]

'isEmpty' @ [178:61] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.Set[DeserializedSimpleFunctionDescriptor]

'typeArgs' @ [178:74] ==> val typeArgs: List<TypeProjection> defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.createTypeInstantiationItem[LocalVariableDescriptor]

'none' @ [178:83] ==> public inline fun <T> Iterable<TypeProjection>.none(predicate: (TypeProjection) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeProjection

'it' @ [178:90] ==> value-parameter it: TypeProjection defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.createTypeInstantiationItem.<anonymous>[ValueParameterDescriptorImpl]

'type' @ [178:93] ==> public final val TypeProjection.type: KotlinType[MyPropertyDescriptor]

'areTypeParametersUsedInside' @ [178:98] ==> private final fun KotlinType.areTypeParametersUsedInside(freeParameters: Collection<TypeParameterDescriptor>): Boolean defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems[SimpleFunctionDescriptorImpl]

'fuzzyType' @ [178:126] ==> value-parameter fuzzyType: FuzzyType defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.createTypeInstantiationItem[ValueParameterDescriptorImpl]

'freeParameters' @ [178:136] ==> public final val freeParameters: Set<TypeParameterDescriptor> defined in org.jetbrains.kotlin.idea.util.FuzzyType[DeserializedPropertyDescriptor]

'itemText' @ [179:13] ==> var itemText: String defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.createTypeInstantiationItem[LocalVariableDescriptor]

'if (allTypeArgsKnown) {
                IdeDescriptorRenderers.SOURCE_CODE_SHORT_NAMES_IN_TYPES.renderTypeArguments(typeArgsToUse)
            }
            else {
                "<...>"
            }' @ [179:25] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'allTypeArgsKnown' @ [179:29] ==> val allTypeArgsKnown: Boolean defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.createTypeInstantiationItem[LocalVariableDescriptor]

'SOURCE_CODE_SHORT_NAMES_IN_TYPES' @ [180:40] ==> @field:JvmField public final val SOURCE_CODE_SHORT_NAMES_IN_TYPES: DescriptorRenderer defined in org.jetbrains.kotlin.idea.util.IdeDescriptorRenderers[DeserializedPropertyDescriptor]

'renderTypeArguments' @ [180:73] ==> public abstract fun renderTypeArguments(typeArguments: List<TypeProjection>): String defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[DeserializedSimpleFunctionDescriptor]

'typeArgsToUse' @ [180:93] ==> val typeArgsToUse: List<TypeProjectionImpl> defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.createTypeInstantiationItem[LocalVariableDescriptor]

'if (classifier.kind != ClassKind.INTERFACE) "()" else ""' @ [186:42] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'classifier' @ [186:46] ==> val classifier: ClassifierDescriptorWithTypeParameters defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.createTypeInstantiationItem[LocalVariableDescriptor]

'kind' @ [186:57] ==> public val ClassifierDescriptorWithTypeParameters.kind: ClassKind? defined in org.jetbrains.kotlin.util[DeserializedPropertyDescriptor]

'INTERFACE' @ [186:75] ==> enum entry INTERFACE defined in org.jetbrains.kotlin.descriptors.ClassKind[FakeCallableDescriptorForObject]

'itemText' @ [187:13] ==> var itemText: String defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.createTypeInstantiationItem[LocalVariableDescriptor]

'constructorParenthesis' @ [187:25] ==> val constructorParenthesis: String defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.createTypeInstantiationItem[LocalVariableDescriptor]

'itemText' @ [188:13] ==> var itemText: String defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.createTypeInstantiationItem[LocalVariableDescriptor]

'itemText' @ [188:34] ==> var itemText: String defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.createTypeInstantiationItem[LocalVariableDescriptor]

'lookupString' @ [189:13] ==> var lookupString: String defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.createTypeInstantiationItem[LocalVariableDescriptor]

'allLookupStrings' @ [190:13] ==> var allLookupStrings: Set<String> defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.createTypeInstantiationItem[LocalVariableDescriptor]

'setOf' @ [190:32] ==> public fun <T> setOf(vararg elements: String): Set<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'lookupString' @ [190:38] ==> var lookupString: String defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.createTypeInstantiationItem[LocalVariableDescriptor]

'lookupElement' @ [190:52] ==> var lookupElement: LookupElement defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.createTypeInstantiationItem[LocalVariableDescriptor]

'lookupString' @ [190:66] ==> public final val LookupElement.lookupString: String[MyPropertyDescriptor]

'insertHandler' @ [191:13] ==> val insertHandler: InsertHandler<LookupElement> defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.createTypeInstantiationItem[LocalVariableDescriptor]

'InsertHandler' @ [191:29] ==> public fun <T : (LookupElement..LookupElement?)> InsertHandler(function: ((InsertionContext..InsertionContext?), (LookupElement..LookupElement?)) -> Unit): InsertHandler<LookupElement> defined in com.intellij.codeInsight.completion[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : (LookupElement..LookupElement?)> -> LookupElement

'context' @ [192:35] ==> value-parameter context: (InsertionContext..InsertionContext?) defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.createTypeInstantiationItem.<anonymous>[ValueParameterDescriptorImpl]

'startOffset' @ [192:43] ==> public final val InsertionContext.startOffset: Int[MyPropertyDescriptor]

'typeText' @ [194:39] ==> val typeText: String defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.createTypeInstantiationItem[LocalVariableDescriptor]

'constructorParenthesis' @ [195:31] ==> val constructorParenthesis: String defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.createTypeInstantiationItem[LocalVariableDescriptor]

'if (allTypeArgsKnown)
                    text1 + IdeDescriptorRenderers.SOURCE_CODE.renderTypeArguments(typeArgsToUse) + text2
                else
                    text1 + "<>" + text2' @ [196:28] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'allTypeArgsKnown' @ [196:32] ==> val allTypeArgsKnown: Boolean defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.createTypeInstantiationItem[LocalVariableDescriptor]

'text1' @ [197:21] ==> val text1: String defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.createTypeInstantiationItem.<anonymous>[LocalVariableDescriptor]

'SOURCE_CODE' @ [197:52] ==> @field:JvmField public final val SOURCE_CODE: DescriptorRenderer defined in org.jetbrains.kotlin.idea.util.IdeDescriptorRenderers[DeserializedPropertyDescriptor]

'renderTypeArguments' @ [197:64] ==> public abstract fun renderTypeArguments(typeArguments: List<TypeProjection>): String defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[DeserializedSimpleFunctionDescriptor]

'typeArgsToUse' @ [197:84] ==> val typeArgsToUse: List<TypeProjectionImpl> defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.createTypeInstantiationItem[LocalVariableDescriptor]

'text2' @ [197:101] ==> val text2: String defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.createTypeInstantiationItem.<anonymous>[LocalVariableDescriptor]

'text1' @ [199:21] ==> val text1: String defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.createTypeInstantiationItem.<anonymous>[LocalVariableDescriptor]

'text2' @ [199:36] ==> val text2: String defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.createTypeInstantiationItem.<anonymous>[LocalVariableDescriptor]

'context' @ [201:17] ==> value-parameter context: (InsertionContext..InsertionContext?) defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.createTypeInstantiationItem.<anonymous>[ValueParameterDescriptorImpl]

'document' @ [201:25] ==> public final val InsertionContext.document: Document[MyPropertyDescriptor]

'replaceString' @ [201:34] ==> public abstract fun replaceString(p0: Int, p1: Int, @NotNull p2: CharSequence): Unit defined in com.intellij.openapi.editor.Document[JavaMethodDescriptor]

'startOffset' @ [201:48] ==> val startOffset: Int defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.createTypeInstantiationItem.<anonymous>[LocalVariableDescriptor]

'context' @ [201:61] ==> value-parameter context: (InsertionContext..InsertionContext?) defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.createTypeInstantiationItem.<anonymous>[ValueParameterDescriptorImpl]

'tailOffset' @ [201:69] ==> public final var InsertionContext.tailOffset: Int[MyPropertyDescriptor]

'text' @ [201:81] ==> val text: String defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.createTypeInstantiationItem.<anonymous>[LocalVariableDescriptor]

'if (allTypeArgsKnown) {
                    context.editor.caretModel.moveToOffset(startOffset + text.length - 1)

                    shortenReferences(context, startOffset, startOffset + text.length)

                    ImplementMembersHandler().invoke(context.project, context.editor, context.file, true)
                }
                else {
                    context.editor.caretModel.moveToOffset(startOffset + text1.length + 1) // put caret into "<>"

                    shortenReferences(context, startOffset, startOffset + text.length)
                }' @ [203:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'allTypeArgsKnown' @ [203:21] ==> val allTypeArgsKnown: Boolean defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.createTypeInstantiationItem[LocalVariableDescriptor]

'context' @ [204:21] ==> value-parameter context: (InsertionContext..InsertionContext?) defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.createTypeInstantiationItem.<anonymous>[ValueParameterDescriptorImpl]

'editor' @ [204:29] ==> public final val InsertionContext.editor: Editor[MyPropertyDescriptor]

'caretModel' @ [204:36] ==> public final val Editor.caretModel: CaretModel[MyPropertyDescriptor]

'moveToOffset' @ [204:47] ==> public abstract fun moveToOffset(p0: Int): Unit defined in com.intellij.openapi.editor.CaretModel[JavaMethodDescriptor]

'startOffset' @ [204:60] ==> val startOffset: Int defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.createTypeInstantiationItem.<anonymous>[LocalVariableDescriptor]

'text' @ [204:74] ==> val text: String defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.createTypeInstantiationItem.<anonymous>[LocalVariableDescriptor]

'length' @ [204:79] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'shortenReferences' @ [206:21] ==> public fun shortenReferences(context: InsertionContext, startOffset: Int, endOffset: Int): Unit defined in org.jetbrains.kotlin.idea.completion in file CompletionUtils.kt[SimpleFunctionDescriptorImpl]

'context' @ [206:39] ==> value-parameter context: (InsertionContext..InsertionContext?) defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.createTypeInstantiationItem.<anonymous>[ValueParameterDescriptorImpl]

'startOffset' @ [206:48] ==> val startOffset: Int defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.createTypeInstantiationItem.<anonymous>[LocalVariableDescriptor]

'startOffset' @ [206:61] ==> val startOffset: Int defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.createTypeInstantiationItem.<anonymous>[LocalVariableDescriptor]

'text' @ [206:75] ==> val text: String defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.createTypeInstantiationItem.<anonymous>[LocalVariableDescriptor]

'length' @ [206:80] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'ImplementMembersHandler' @ [208:21] ==> public constructor ImplementMembersHandler() defined in org.jetbrains.kotlin.idea.core.overrideImplement.ImplementMembersHandler[DeserializedClassConstructorDescriptor]

'invoke' @ [208:47] ==> public final fun invoke(project: Project, editor: Editor, file: PsiFile, implementAll: Boolean): Unit defined in org.jetbrains.kotlin.idea.core.overrideImplement.ImplementMembersHandler[DeserializedSimpleFunctionDescriptor]

'context' @ [208:54] ==> value-parameter context: (InsertionContext..InsertionContext?) defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.createTypeInstantiationItem.<anonymous>[ValueParameterDescriptorImpl]

'project' @ [208:62] ==> public final val InsertionContext.project: (Project..Project?)[MyPropertyDescriptor]

'context' @ [208:71] ==> value-parameter context: (InsertionContext..InsertionContext?) defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.createTypeInstantiationItem.<anonymous>[ValueParameterDescriptorImpl]

'editor' @ [208:79] ==> public final val InsertionContext.editor: Editor[MyPropertyDescriptor]

'context' @ [208:87] ==> value-parameter context: (InsertionContext..InsertionContext?) defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.createTypeInstantiationItem.<anonymous>[ValueParameterDescriptorImpl]

'file' @ [208:95] ==> public final val InsertionContext.file: PsiFile[MyPropertyDescriptor]

'context' @ [211:21] ==> value-parameter context: (InsertionContext..InsertionContext?) defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.createTypeInstantiationItem.<anonymous>[ValueParameterDescriptorImpl]

'editor' @ [211:29] ==> public final val InsertionContext.editor: Editor[MyPropertyDescriptor]

'caretModel' @ [211:36] ==> public final val Editor.caretModel: CaretModel[MyPropertyDescriptor]

'moveToOffset' @ [211:47] ==> public abstract fun moveToOffset(p0: Int): Unit defined in com.intellij.openapi.editor.CaretModel[JavaMethodDescriptor]

'startOffset' @ [211:60] ==> val startOffset: Int defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.createTypeInstantiationItem.<anonymous>[LocalVariableDescriptor]

'text1' @ [211:74] ==> val text1: String defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.createTypeInstantiationItem.<anonymous>[LocalVariableDescriptor]

'length' @ [211:80] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'shortenReferences' @ [213:21] ==> public fun shortenReferences(context: InsertionContext, startOffset: Int, endOffset: Int): Unit defined in org.jetbrains.kotlin.idea.completion in file CompletionUtils.kt[SimpleFunctionDescriptorImpl]

'context' @ [213:39] ==> value-parameter context: (InsertionContext..InsertionContext?) defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.createTypeInstantiationItem.<anonymous>[ValueParameterDescriptorImpl]

'startOffset' @ [213:48] ==> val startOffset: Int defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.createTypeInstantiationItem.<anonymous>[LocalVariableDescriptor]

'startOffset' @ [213:61] ==> val startOffset: Int defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.createTypeInstantiationItem.<anonymous>[LocalVariableDescriptor]

'text' @ [213:75] ==> val text: String defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.createTypeInstantiationItem.<anonymous>[LocalVariableDescriptor]

'length' @ [213:80] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'lookupElement' @ [216:13] ==> var lookupElement: LookupElement defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.createTypeInstantiationItem[LocalVariableDescriptor]

'lookupElement' @ [216:29] ==> var lookupElement: LookupElement defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.createTypeInstantiationItem[LocalVariableDescriptor]

'suppressAutoInsertion' @ [216:43] ==> public fun LookupElement.suppressAutoInsertion(): LookupElement defined in org.jetbrains.kotlin.idea.completion in file CompletionUtils.kt[SimpleFunctionDescriptorImpl]

'lookupElement' @ [217:13] ==> var lookupElement: LookupElement defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.createTypeInstantiationItem[LocalVariableDescriptor]

'lookupElement' @ [217:29] ==> var lookupElement: LookupElement defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.createTypeInstantiationItem[LocalVariableDescriptor]

'assignSmartCompletionPriority' @ [217:43] ==> public fun LookupElement.assignSmartCompletionPriority(priority: SmartCompletionItemPriority): LookupElement defined in org.jetbrains.kotlin.idea.completion.smart in file Utils.kt[SimpleFunctionDescriptorImpl]

'ANONYMOUS_OBJECT' @ [217:101] ==> enum entry ANONYMOUS_OBJECT defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionItemPriority[FakeCallableDescriptorForObject]

'signatureText' @ [221:13] ==> var signatureText: String? defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.createTypeInstantiationItem[LocalVariableDescriptor]

'when (visibleConstructors.size) {
                0 -> "()"

                1 -> {
                    val constructor = visibleConstructors.single()
                    val substitutor = TypeSubstitutor.create(fuzzyType.presentationType())
                    val substitutedConstructor = constructor.substitute(substitutor) ?: constructor // render original signature if failed to substitute
                    BasicLookupElementFactory.SHORT_NAMES_RENDERER.renderFunctionParameters(substitutedConstructor)
                }

                else -> "(...)"
            }' @ [221:29] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: String?, entry1: String?, entry2: String?): String?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> String?

'visibleConstructors' @ [221:35] ==> val visibleConstructors: List<ConstructorDescriptor> defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.createTypeInstantiationItem[LocalVariableDescriptor]

'size' @ [221:55] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'visibleConstructors' @ [225:39] ==> val visibleConstructors: List<ConstructorDescriptor> defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.createTypeInstantiationItem[LocalVariableDescriptor]

'single' @ [225:59] ==> public fun <T> List<ConstructorDescriptor>.single(): ConstructorDescriptor defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ConstructorDescriptor

'create' @ [226:55] ==> @NotNull public open fun create(@NotNull p0: KotlinType): TypeSubstitutor defined in org.jetbrains.kotlin.types.TypeSubstitutor[JavaMethodDescriptor]

'fuzzyType' @ [226:62] ==> value-parameter fuzzyType: FuzzyType defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.createTypeInstantiationItem[ValueParameterDescriptorImpl]

'presentationType' @ [226:72] ==> public fun FuzzyType.presentationType(): KotlinType defined in org.jetbrains.kotlin.idea.util[DeserializedSimpleFunctionDescriptor]

'constructor' @ [227:50] ==> val constructor: ConstructorDescriptor defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.createTypeInstantiationItem[LocalVariableDescriptor]

'substitute' @ [227:62] ==> @Nullable public abstract fun substitute(@NotNull substitutor: TypeSubstitutor): ConstructorDescriptor? defined in org.jetbrains.kotlin.descriptors.ConstructorDescriptor[JavaMethodDescriptor]

'substitutor' @ [227:73] ==> val substitutor: TypeSubstitutor defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.createTypeInstantiationItem[LocalVariableDescriptor]

'constructor' @ [227:89] ==> val constructor: ConstructorDescriptor defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.createTypeInstantiationItem[LocalVariableDescriptor]

'SHORT_NAMES_RENDERER' @ [228:47] ==> public final val SHORT_NAMES_RENDERER: DescriptorRenderer defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.Companion[PropertyDescriptorImpl]

'renderFunctionParameters' @ [228:68] ==> public final fun renderFunctionParameters(functionDescriptor: FunctionDescriptor): String defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[DeserializedSimpleFunctionDescriptor]

'substitutedConstructor' @ [228:93] ==> val substitutedConstructor: ConstructorDescriptor defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.createTypeInstantiationItem[LocalVariableDescriptor]

'when (visibleConstructors.size) {
                0 -> KotlinFunctionInsertHandler.Normal(CallType.DEFAULT, inputTypeArguments = false, inputValueArguments = false, argumentsOnly = true)

                1 -> (lookupElementFactory.insertHandlerProvider.insertHandler(visibleConstructors.single()) as KotlinFunctionInsertHandler.Normal)
                        .copy(argumentsOnly = true)

                else -> KotlinFunctionInsertHandler.Normal(CallType.DEFAULT, inputTypeArguments = false, inputValueArguments = true, argumentsOnly = true)
            }' @ [234:37] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: KotlinFunctionInsertHandler.Normal, entry1: KotlinFunctionInsertHandler.Normal, entry2: KotlinFunctionInsertHandler.Normal): KotlinFunctionInsertHandler.Normal[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Normal

'visibleConstructors' @ [234:43] ==> val visibleConstructors: List<ConstructorDescriptor> defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.createTypeInstantiationItem[LocalVariableDescriptor]

'size' @ [234:63] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'Normal' @ [235:50] ==> public constructor Normal(callType: CallType<*>, inputTypeArguments: Boolean, inputValueArguments: Boolean, argumentText: String = ..., lambdaInfo: GenerateLambdaInfo? = ..., argumentsOnly: Boolean = ...) defined in org.jetbrains.kotlin.idea.completion.handlers.KotlinFunctionInsertHandler.Normal[ClassConstructorDescriptorImpl]

'DEFAULT' @ [235:66] ==> public object DEFAULT : CallType<Nothing?> defined in org.jetbrains.kotlin.idea.util.CallType[FakeCallableDescriptorForObject]

'lookupElementFactory' @ [237:23] ==> public final val lookupElementFactory: LookupElementFactory defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems[PropertyDescriptorImpl]

'insertHandlerProvider' @ [237:44] ==> public final val insertHandlerProvider: InsertHandlerProvider defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory[PropertyDescriptorImpl]

'insertHandler' @ [237:66] ==> public final fun insertHandler(descriptor: DeclarationDescriptor): InsertHandler<LookupElement> defined in org.jetbrains.kotlin.idea.completion.InsertHandlerProvider[SimpleFunctionDescriptorImpl]

'visibleConstructors' @ [237:80] ==> val visibleConstructors: List<ConstructorDescriptor> defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.createTypeInstantiationItem[LocalVariableDescriptor]

'single' @ [237:100] ==> public fun <T> List<ConstructorDescriptor>.single(): ConstructorDescriptor defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ConstructorDescriptor

'copy' @ [238:26] ==> public final fun copy(callType: CallType<*> = ..., inputTypeArguments: Boolean = ..., inputValueArguments: Boolean = ..., argumentText: String = ..., lambdaInfo: GenerateLambdaInfo? = ..., argumentsOnly: Boolean = ...): KotlinFunctionInsertHandler.Normal defined in org.jetbrains.kotlin.idea.completion.handlers.KotlinFunctionInsertHandler.Normal[SimpleFunctionDescriptorImpl]

'Normal' @ [240:53] ==> public constructor Normal(callType: CallType<*>, inputTypeArguments: Boolean, inputValueArguments: Boolean, argumentText: String = ..., lambdaInfo: GenerateLambdaInfo? = ..., argumentsOnly: Boolean = ...) defined in org.jetbrains.kotlin.idea.completion.handlers.KotlinFunctionInsertHandler.Normal[ClassConstructorDescriptorImpl]

'DEFAULT' @ [240:69] ==> public object DEFAULT : CallType<Nothing?> defined in org.jetbrains.kotlin.idea.util.CallType[FakeCallableDescriptorForObject]

'insertHandler' @ [243:13] ==> val insertHandler: InsertHandler<LookupElement> defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.createTypeInstantiationItem[LocalVariableDescriptor]

'context' @ [245:21] ==> value-parameter context: InsertionContext defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.createTypeInstantiationItem.<no name provided>.handleInsert[ValueParameterDescriptorImpl]

'document' @ [245:29] ==> public final val InsertionContext.document: Document[MyPropertyDescriptor]

'replaceString' @ [245:38] ==> public abstract fun replaceString(p0: Int, p1: Int, @NotNull p2: CharSequence): Unit defined in com.intellij.openapi.editor.Document[JavaMethodDescriptor]

'context' @ [245:52] ==> value-parameter context: InsertionContext defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.createTypeInstantiationItem.<no name provided>.handleInsert[ValueParameterDescriptorImpl]

'startOffset' @ [245:60] ==> public final val InsertionContext.startOffset: Int[MyPropertyDescriptor]

'context' @ [245:73] ==> value-parameter context: InsertionContext defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.createTypeInstantiationItem.<no name provided>.handleInsert[ValueParameterDescriptorImpl]

'tailOffset' @ [245:81] ==> public final var InsertionContext.tailOffset: Int[MyPropertyDescriptor]

'typeText' @ [245:93] ==> val typeText: String defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.createTypeInstantiationItem[LocalVariableDescriptor]

'context' @ [246:21] ==> value-parameter context: InsertionContext defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.createTypeInstantiationItem.<no name provided>.handleInsert[ValueParameterDescriptorImpl]

'tailOffset' @ [246:29] ==> public final var InsertionContext.tailOffset: Int[MyPropertyDescriptor]

'context' @ [246:42] ==> value-parameter context: InsertionContext defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.createTypeInstantiationItem.<no name provided>.handleInsert[ValueParameterDescriptorImpl]

'startOffset' @ [246:50] ==> public final val InsertionContext.startOffset: Int[MyPropertyDescriptor]

'typeText' @ [246:64] ==> val typeText: String defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.createTypeInstantiationItem[LocalVariableDescriptor]

'length' @ [246:73] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'baseInsertHandler' @ [248:21] ==> val baseInsertHandler: KotlinFunctionInsertHandler.Normal defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.createTypeInstantiationItem[LocalVariableDescriptor]

'handleInsert' @ [248:39] ==> public open fun handleInsert(context: InsertionContext, item: LookupElement): Unit defined in org.jetbrains.kotlin.idea.completion.handlers.KotlinFunctionInsertHandler.Normal[SimpleFunctionDescriptorImpl]

'context' @ [248:52] ==> value-parameter context: InsertionContext defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.createTypeInstantiationItem.<no name provided>.handleInsert[ValueParameterDescriptorImpl]

'item' @ [248:61] ==> value-parameter item: LookupElement defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.createTypeInstantiationItem.<no name provided>.handleInsert[ValueParameterDescriptorImpl]

'shortenReferences' @ [250:21] ==> public fun shortenReferences(context: InsertionContext, startOffset: Int, endOffset: Int): Unit defined in org.jetbrains.kotlin.idea.completion in file CompletionUtils.kt[SimpleFunctionDescriptorImpl]

'context' @ [250:39] ==> value-parameter context: InsertionContext defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.createTypeInstantiationItem.<no name provided>.handleInsert[ValueParameterDescriptorImpl]

'context' @ [250:48] ==> value-parameter context: InsertionContext defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.createTypeInstantiationItem.<no name provided>.handleInsert[ValueParameterDescriptorImpl]

'startOffset' @ [250:56] ==> public final val InsertionContext.startOffset: Int[MyPropertyDescriptor]

'context' @ [250:69] ==> value-parameter context: InsertionContext defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.createTypeInstantiationItem.<no name provided>.handleInsert[ValueParameterDescriptorImpl]

'tailOffset' @ [250:77] ==> public final var InsertionContext.tailOffset: Int[MyPropertyDescriptor]

'baseInsertHandler' @ [253:17] ==> val baseInsertHandler: KotlinFunctionInsertHandler.Normal defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.createTypeInstantiationItem[LocalVariableDescriptor]

'inputValueArguments' @ [253:35] ==> public final val inputValueArguments: Boolean defined in org.jetbrains.kotlin.idea.completion.handlers.KotlinFunctionInsertHandler.Normal[PropertyDescriptorImpl]

'lookupElement' @ [254:17] ==> var lookupElement: LookupElement defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.createTypeInstantiationItem[LocalVariableDescriptor]

'lookupElement' @ [254:33] ==> var lookupElement: LookupElement defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.createTypeInstantiationItem[LocalVariableDescriptor]

'keepOldArgumentListOnTab' @ [254:47] ==> public fun LookupElement.keepOldArgumentListOnTab(): LookupElement defined in org.jetbrains.kotlin.idea.completion in file CompletionUtils.kt[SimpleFunctionDescriptorImpl]

'baseInsertHandler' @ [256:17] ==> val baseInsertHandler: KotlinFunctionInsertHandler.Normal defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.createTypeInstantiationItem[LocalVariableDescriptor]

'lambdaInfo' @ [256:35] ==> public final val lambdaInfo: GenerateLambdaInfo? defined in org.jetbrains.kotlin.idea.completion.handlers.KotlinFunctionInsertHandler.Normal[PropertyDescriptorImpl]

'lookupElement' @ [257:17] ==> var lookupElement: LookupElement defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.createTypeInstantiationItem[LocalVariableDescriptor]

'putUserData' @ [257:31] ==> public open fun <T : (Any..Any?)> putUserData(@NotNull p0: Key<(Unit..Unit?)>, @Nullable p1: Unit?): Unit defined in com.intellij.codeInsight.lookup.LookupElement[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.Unit..kotlin.Unit?)

'ACCEPT_OPENING_BRACE' @ [257:70] ==> public final val ACCEPT_OPENING_BRACE: Key<Unit> defined in org.jetbrains.kotlin.idea.completion.KotlinCompletionCharFilter.Companion[PropertyDescriptorImpl]

'Unit' @ [257:92] ==> public object Unit defined in kotlin[FakeCallableDescriptorForObject]

'lookupElement' @ [259:13] ==> var lookupElement: LookupElement defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.createTypeInstantiationItem[LocalVariableDescriptor]

'lookupElement' @ [259:29] ==> var lookupElement: LookupElement defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.createTypeInstantiationItem[LocalVariableDescriptor]

'assignSmartCompletionPriority' @ [259:43] ==> public fun LookupElement.assignSmartCompletionPriority(priority: SmartCompletionItemPriority): LookupElement defined in org.jetbrains.kotlin.idea.completion.smart in file Utils.kt[SimpleFunctionDescriptorImpl]

'INSTANTIATION' @ [259:101] ==> enum entry INSTANTIATION defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionItemPriority[FakeCallableDescriptorForObject]

'LookupElementDecorator<LookupElement>' @ [262:44] ==> protected/*protected and package*/ constructor LookupElementDecorator<T : (LookupElement..LookupElement?)>(p0: (LookupElement..LookupElement?)) defined in com.intellij.codeInsight.lookup.LookupElementDecorator[JavaClassConstructorDescriptor]
Inferred types:
    <T : (LookupElement..LookupElement?)> -> LookupElement

'lookupElement' @ [262:82] ==> var lookupElement: LookupElement defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.createTypeInstantiationItem[LocalVariableDescriptor]

'lookupString' @ [263:46] ==> var lookupString: String defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.createTypeInstantiationItem[LocalVariableDescriptor]

'allLookupStrings' @ [265:50] ==> var allLookupStrings: Set<String> defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.createTypeInstantiationItem[LocalVariableDescriptor]

'delegate' @ [268:17] ==> public final val InstantiationLookupElement.delegate: (LookupElement..LookupElement?)[MyPropertyDescriptor]

'renderElement' @ [268:26] ==> public open fun renderElement(p0: (LookupElementPresentation..LookupElementPresentation?)): Unit defined in com.intellij.codeInsight.lookup.LookupElement[JavaMethodDescriptor]

'presentation' @ [268:40] ==> value-parameter presentation: LookupElementPresentation defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.createTypeInstantiationItem.InstantiationLookupElement.renderElement[ValueParameterDescriptorImpl]

'presentation' @ [269:17] ==> value-parameter presentation: LookupElementPresentation defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.createTypeInstantiationItem.InstantiationLookupElement.renderElement[ValueParameterDescriptorImpl]

'itemText' @ [269:30] ==> public final var LookupElementPresentation.itemText: String?[MyPropertyDescriptor]

'itemText' @ [269:41] ==> var itemText: String defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.createTypeInstantiationItem[LocalVariableDescriptor]

'presentation' @ [271:17] ==> value-parameter presentation: LookupElementPresentation defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.createTypeInstantiationItem.InstantiationLookupElement.renderElement[ValueParameterDescriptorImpl]

'clearTail' @ [271:30] ==> public open fun clearTail(): Unit defined in com.intellij.codeInsight.lookup.LookupElementPresentation[JavaMethodDescriptor]

'signatureText' @ [272:21] ==> var signatureText: String? defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.createTypeInstantiationItem[LocalVariableDescriptor]

'presentation' @ [273:21] ==> value-parameter presentation: LookupElementPresentation defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.createTypeInstantiationItem.InstantiationLookupElement.renderElement[ValueParameterDescriptorImpl]

'appendTailText' @ [273:34] ==> public open fun appendTailText(@NotNull p0: String, p1: Boolean): Unit defined in com.intellij.codeInsight.lookup.LookupElementPresentation[JavaMethodDescriptor]

'signatureText' @ [273:49] ==> var signatureText: String? defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.createTypeInstantiationItem[LocalVariableDescriptor]

'presentation' @ [275:17] ==> value-parameter presentation: LookupElementPresentation defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.createTypeInstantiationItem.InstantiationLookupElement.renderElement[ValueParameterDescriptorImpl]

'appendTailText' @ [275:30] ==> public open fun appendTailText(@NotNull p0: String, p1: Boolean): Unit defined in com.intellij.codeInsight.lookup.LookupElementPresentation[JavaMethodDescriptor]

'+' @ [275:45] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'getFqName' @ [275:68] ==> @NotNull public open fun getFqName(@NotNull p0: DeclarationDescriptor): FqNameUnsafe defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'classifier' @ [275:78] ==> val classifier: ClassifierDescriptorWithTypeParameters defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.createTypeInstantiationItem[LocalVariableDescriptor]

'containingDeclaration' @ [275:89] ==> public final val ClassifierDescriptorWithTypeParameters.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'insertHandler' @ [279:17] ==> val insertHandler: InsertHandler<LookupElement> defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.createTypeInstantiationItem[LocalVariableDescriptor]

'handleInsert' @ [279:31] ==> public abstract fun handleInsert(p0: (InsertionContext..InsertionContext?), p1: (LookupElement..LookupElement?)): Unit defined in com.intellij.codeInsight.completion.InsertHandler[JavaMethodDescriptor]

'context' @ [279:44] ==> value-parameter context: InsertionContext defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.createTypeInstantiationItem.InstantiationLookupElement.handleInsert[ValueParameterDescriptorImpl]

'delegate' @ [279:53] ==> public final val InstantiationLookupElement.delegate: (LookupElement..LookupElement?)[MyPropertyDescriptor]

'other' @ [283:21] ==> value-parameter other: Any? defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.createTypeInstantiationItem.InstantiationLookupElement.equals[ValueParameterDescriptorImpl]

'this' @ [283:31] ==> <this> defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.createTypeInstantiationItem.InstantiationLookupElement[LazyClassReceiverParameterDescriptor]

'other' @ [284:21] ==> value-parameter other: Any? defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.createTypeInstantiationItem.InstantiationLookupElement.equals[ValueParameterDescriptorImpl]

'getLookupString' @ [285:21] ==> public open fun getLookupString(): String defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.createTypeInstantiationItem.InstantiationLookupElement[SimpleFunctionDescriptorImpl]

'other' @ [285:42] ==> value-parameter other: Any? defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.createTypeInstantiationItem.InstantiationLookupElement.equals[ValueParameterDescriptorImpl]

'lookupString' @ [285:48] ==> public final val InstantiationLookupElement.lookupString: String[MyPropertyDescriptor]

'LookupElementPresentation' @ [286:37] ==> public constructor LookupElementPresentation() defined in com.intellij.codeInsight.lookup.LookupElementPresentation[JavaClassConstructorDescriptor]

'LookupElementPresentation' @ [287:37] ==> public constructor LookupElementPresentation() defined in com.intellij.codeInsight.lookup.LookupElementPresentation[JavaClassConstructorDescriptor]

'renderElement' @ [288:17] ==> public open fun renderElement(presentation: LookupElementPresentation): Unit defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.createTypeInstantiationItem.InstantiationLookupElement[SimpleFunctionDescriptorImpl]

'presentation1' @ [288:31] ==> val presentation1: LookupElementPresentation defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.createTypeInstantiationItem.InstantiationLookupElement.equals[LocalVariableDescriptor]

'other' @ [289:17] ==> value-parameter other: Any? defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.createTypeInstantiationItem.InstantiationLookupElement.equals[ValueParameterDescriptorImpl]

'renderElement' @ [289:23] ==> public open fun renderElement(presentation: LookupElementPresentation): Unit defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.createTypeInstantiationItem.InstantiationLookupElement[SimpleFunctionDescriptorImpl]

'presentation2' @ [289:37] ==> val presentation2: LookupElementPresentation defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.createTypeInstantiationItem.InstantiationLookupElement.equals[LocalVariableDescriptor]

'presentation1' @ [290:24] ==> val presentation1: LookupElementPresentation defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.createTypeInstantiationItem.InstantiationLookupElement.equals[LocalVariableDescriptor]

'itemText' @ [290:38] ==> public final var LookupElementPresentation.itemText: String?[MyPropertyDescriptor]

'presentation2' @ [290:50] ==> val presentation2: LookupElementPresentation defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.createTypeInstantiationItem.InstantiationLookupElement.equals[LocalVariableDescriptor]

'itemText' @ [290:64] ==> public final var LookupElementPresentation.itemText: String?[MyPropertyDescriptor]

'presentation1' @ [290:76] ==> val presentation1: LookupElementPresentation defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.createTypeInstantiationItem.InstantiationLookupElement.equals[LocalVariableDescriptor]

'tailText' @ [290:90] ==> public final var LookupElementPresentation.tailText: String?[MyPropertyDescriptor]

'presentation2' @ [290:102] ==> val presentation2: LookupElementPresentation defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.createTypeInstantiationItem.InstantiationLookupElement.equals[LocalVariableDescriptor]

'tailText' @ [290:116] ==> public final var LookupElementPresentation.tailText: String?[MyPropertyDescriptor]

'lookupString' @ [293:39] ==> var lookupString: String defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.createTypeInstantiationItem[LocalVariableDescriptor]

'hashCode' @ [293:52] ==> public open fun hashCode(): Int defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'InstantiationLookupElement' @ [296:16] ==> public constructor InstantiationLookupElement() defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.createTypeInstantiationItem.InstantiationLookupElement[ClassConstructorDescriptorImpl]

'addTail' @ [296:45] ==> public fun LookupElement.addTail(tail: Tail?): LookupElement defined in org.jetbrains.kotlin.idea.completion.smart in file Utils.kt[SimpleFunctionDescriptorImpl]

'tail' @ [296:53] ==> value-parameter tail: Tail? defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.createTypeInstantiationItem[ValueParameterDescriptorImpl]

'FuzzyType' @ [300:16] ==> public constructor FuzzyType(type: KotlinType, freeParameters: Collection<TypeParameterDescriptor>) defined in org.jetbrains.kotlin.idea.util.FuzzyType[DeserializedClassConstructorDescriptor]

'this' @ [300:26] ==> <this> defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.areTypeParametersUsedInside[ReceiverParameterDescriptorImpl]

'freeParameters' @ [300:32] ==> value-parameter freeParameters: Collection<TypeParameterDescriptor> defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.areTypeParametersUsedInside[ValueParameterDescriptorImpl]

'freeParameters' @ [300:48] ==> public final val freeParameters: Set<TypeParameterDescriptor> defined in org.jetbrains.kotlin.idea.util.FuzzyType[DeserializedPropertyDescriptor]

'isNotEmpty' @ [300:63] ==> @InlineOnly public inline fun <T> Collection<TypeParameterDescriptor>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeParameterDescriptor

'classDescriptor' @ [307:13] ==> value-parameter classDescriptor: ClassDescriptor? defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.addSamConstructorItem[ValueParameterDescriptorImpl]

'kind' @ [307:30] ==> public final val ClassDescriptor.kind: ClassKind[MyPropertyDescriptor]

'INTERFACE' @ [307:48] ==> enum entry INTERFACE defined in org.jetbrains.kotlin.descriptors.ClassKind[FakeCallableDescriptorForObject]

'run' @ [308:34] ==> @InlineOnly public inline fun <T, R> TypeInstantiationItems.run(block: TypeInstantiationItems.() -> SamConstructorDescriptor): SamConstructorDescriptor defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeInstantiationItems
    <R> -> SamConstructorDescriptor

'classifier' @ [309:33] ==> value-parameter classifier: ClassifierDescriptorWithTypeParameters defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.addSamConstructorItem[ValueParameterDescriptorImpl]

'containingDeclaration' @ [309:44] ==> public final val ClassifierDescriptorWithTypeParameters.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'when (container) {
                    is PackageFragmentDescriptor -> container.getMemberScope()
                    is ClassDescriptor -> container.unsubstitutedMemberScope
                    else -> return
                }' @ [310:29] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: MemberScope, entry1: MemberScope, entry2: MemberScope): MemberScope[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> MemberScope

'container' @ [310:35] ==> val container: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.addSamConstructorItem.<anonymous>[LocalVariableDescriptor]

'container' @ [311:53] ==> val container: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.addSamConstructorItem.<anonymous>[LocalVariableDescriptor]

'getMemberScope' @ [311:63] ==> public abstract fun getMemberScope(): MemberScope defined in org.jetbrains.kotlin.descriptors.PackageFragmentDescriptor[DeserializedSimpleFunctionDescriptor]

'container' @ [312:43] ==> val container: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.addSamConstructorItem.<anonymous>[LocalVariableDescriptor]

'unsubstitutedMemberScope' @ [312:53] ==> public final val ClassDescriptor.unsubstitutedMemberScope: MemberScope[MyPropertyDescriptor]

'scope' @ [315:17] ==> val scope: MemberScope defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.addSamConstructorItem.<anonymous>[LocalVariableDescriptor]

'collectSyntheticStaticMembersAndConstructors' @ [315:23] ==> public fun ResolutionScope.collectSyntheticStaticMembersAndConstructors(resolutionFacade: ResolutionFacade, kindFilter: DescriptorKindFilter, nameFilter: (Name) -> Boolean): List<FunctionDescriptor> defined in org.jetbrains.kotlin.idea.codeInsight[DeserializedSimpleFunctionDescriptor]

'resolutionFacade' @ [315:68] ==> public final val resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems[PropertyDescriptorImpl]

'FUNCTIONS' @ [315:107] ==> @field:JvmField public final val FUNCTIONS: DescriptorKindFilter defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter.Companion[DeserializedPropertyDescriptor]

'classifier' @ [315:120] ==> value-parameter classifier: ClassifierDescriptorWithTypeParameters defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.addSamConstructorItem[ValueParameterDescriptorImpl]

'name' @ [315:131] ==> public final val ClassifierDescriptorWithTypeParameters.name: Name[MyPropertyDescriptor]

'it' @ [315:139] ==> value-parameter it: Name defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.addSamConstructorItem.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'filterIsInstance' @ [316:26] ==> public inline fun <reified R> Iterable<*>.filterIsInstance(): List<SamConstructorDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> SamConstructorDescriptor

'singleOrNull' @ [317:26] ==> public fun <T> List<SamConstructorDescriptor>.singleOrNull(): SamConstructorDescriptor? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SamConstructorDescriptor

'lookupElementFactory' @ [319:13] ==> public final val lookupElementFactory: LookupElementFactory defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems[PropertyDescriptorImpl]

'createStandardLookupElementsForDescriptor' @ [320:22] ==> public open fun createStandardLookupElementsForDescriptor(descriptor: DeclarationDescriptor, useReceiverTypes: Boolean): Collection<LookupElement> defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory[SimpleFunctionDescriptorImpl]

'samConstructor' @ [320:64] ==> val samConstructor: SamConstructorDescriptor defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.addSamConstructorItem[LocalVariableDescriptor]

'mapTo' @ [321:22] ==> public inline fun <T, R, C : MutableCollection<in LookupElement>> Iterable<LookupElement>.mapTo(destination: MutableCollection<LookupElement>, transform: (LookupElement) -> LookupElement): MutableCollection<LookupElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> LookupElement
    <R> -> LookupElement
    <C : MutableCollection<in R>> -> MutableCollection<LookupElement>

'collection' @ [321:28] ==> value-parameter collection: MutableCollection<LookupElement> defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.addSamConstructorItem[ValueParameterDescriptorImpl]

'it' @ [321:42] ==> value-parameter it: LookupElement defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.addSamConstructorItem.<anonymous>[ValueParameterDescriptorImpl]

'assignSmartCompletionPriority' @ [321:45] ==> public fun LookupElement.assignSmartCompletionPriority(priority: SmartCompletionItemPriority): LookupElement defined in org.jetbrains.kotlin.idea.completion.smart in file Utils.kt[SimpleFunctionDescriptorImpl]

'INSTANTIATION' @ [321:103] ==> enum entry INSTANTIATION defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionItemPriority[FakeCallableDescriptorForObject]

'addTail' @ [321:118] ==> public fun LookupElement.addTail(tail: Tail?): LookupElement defined in org.jetbrains.kotlin.idea.completion.smart in file Utils.kt[SimpleFunctionDescriptorImpl]

'tail' @ [321:126] ==> value-parameter tail: Tail? defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.addSamConstructorItem[ValueParameterDescriptorImpl]

'classDescriptor' @ [332:39] ==> value-parameter classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.InheritanceSearcher.<init>[ValueParameterDescriptorImpl]

'declaredTypeParameters' @ [332:55] ==> public final val ClassDescriptor.declaredTypeParameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)>[MyPropertyDescriptor]

'isNotEmpty' @ [332:78] ==> @InlineOnly public inline fun <T> Collection<(TypeParameterDescriptor..TypeParameterDescriptor?)>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.TypeParameterDescriptor..org.jetbrains.kotlin.descriptors.TypeParameterDescriptor?)

'KotlinTypeFactory' @ [333:36] ==> public object KotlinTypeFactory defined in org.jetbrains.kotlin.types[FakeCallableDescriptorForObject]

'simpleNotNullType' @ [333:54] ==> @JvmStatic public final fun simpleNotNullType(annotations: Annotations, descriptor: ClassDescriptor, arguments: List<TypeProjection>): SimpleType defined in org.jetbrains.kotlin.types.KotlinTypeFactory[DeserializedSimpleFunctionDescriptor]

'EMPTY' @ [333:84] ==> public final val EMPTY: Annotations defined in org.jetbrains.kotlin.descriptors.annotations.Annotations.Companion[DeserializedPropertyDescriptor]

'classDescriptor' @ [333:91] ==> value-parameter classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.InheritanceSearcher.<init>[ValueParameterDescriptorImpl]

'typeArgs' @ [333:108] ==> value-parameter typeArgs: List<TypeProjection> defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.InheritanceSearcher.<init>[ValueParameterDescriptorImpl]

'expectedType' @ [334:41] ==> private final val expectedType: SimpleType defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.InheritanceSearcher[PropertyDescriptorImpl]

'toFuzzyType' @ [334:54] ==> public fun KotlinType.toFuzzyType(freeParameters: Collection<TypeParameterDescriptor>): FuzzyType defined in org.jetbrains.kotlin.idea.util[DeserializedSimpleFunctionDescriptor]

'freeParameters' @ [334:66] ==> private final val freeParameters: Collection<TypeParameterDescriptor> defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.InheritanceSearcher[PropertyDescriptorImpl]

'SearchParameters' @ [337:52] ==> public constructor SearchParameters(@NotNull p0: PsiClass, @NotNull p1: SearchScope, p2: Boolean, p3: Boolean, p4: Boolean, @NotNull p5: ((String..String?)) -> Boolean) defined in com.intellij.psi.search.searches.ClassInheritorsSearch.SearchParameters[SamAdapterClassConstructorDescriptor]

'psiClass' @ [337:69] ==> private final val psiClass: PsiClass defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.InheritanceSearcher[PropertyDescriptorImpl]

'inheritorSearchScope' @ [337:79] ==> public final val inheritorSearchScope: GlobalSearchScope defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems[PropertyDescriptorImpl]

'nameFilter' @ [337:120] ==> value-parameter nameFilter: (String) -> Boolean defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.InheritanceSearcher.search[ValueParameterDescriptorImpl]

'iterator' @ [338:31] ==> public abstract fun iterator(): MutableIterator<(PsiClass..PsiClass?)> defined in com.intellij.util.Query[DeserializedSimpleFunctionDescriptor]

'search' @ [338:53] ==> @NotNull public open fun search(@NotNull p0: ClassInheritorsSearch.SearchParameters): Query<(PsiClass..PsiClass?)> defined in com.intellij.psi.search.searches.ClassInheritorsSearch[JavaMethodDescriptor]

'parameters' @ [338:60] ==> val parameters: ClassInheritorsSearch.SearchParameters defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.InheritanceSearcher.search[LocalVariableDescriptor]

'inheritor' @ [339:34] ==> val inheritor: (PsiClass..PsiClass?) defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.InheritanceSearcher.search[LocalVariableDescriptor]

'resolveToDescriptor' @ [339:44] ==> public fun PsiClass.resolveToDescriptor(resolutionFacade: ResolutionFacade, declarationTranslator: (KtClassOrObject) -> KtClassOrObject? = ...): ClassDescriptor? defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'resolutionFacade' @ [340:25] ==> public final val resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems[PropertyDescriptorImpl]

'toFromOriginalFileMapper' @ [341:27] ==> public final val toFromOriginalFileMapper: ToFromOriginalFileMapper defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems[PropertyDescriptorImpl]

'toSyntheticFile' @ [341:52] ==> public final fun <TElement : PsiElement> toSyntheticFile(element: KtClassOrObject): KtClassOrObject? defined in org.jetbrains.kotlin.idea.completion.ToFromOriginalFileMapper[SimpleFunctionDescriptorImpl]
Inferred types:
    <TElement : PsiElement> -> KtClassOrObject

'it' @ [341:68] ==> value-parameter it: KtClassOrObject defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.InheritanceSearcher.search.<anonymous>[ValueParameterDescriptorImpl]

'!' @ [343:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'invoke' @ [343:22] ==> public abstract operator fun invoke(p1: DeclarationDescriptor): Boolean defined in kotlin.Function1[FunctionInvokeDescriptor]

'descriptor' @ [343:39] ==> val descriptor: ClassDescriptor defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.InheritanceSearcher.search[LocalVariableDescriptor]

'descriptor' @ [345:42] ==> val descriptor: ClassDescriptor defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.InheritanceSearcher.search[LocalVariableDescriptor]

'defaultType' @ [345:53] ==> public final val ClassDescriptor.defaultType: SimpleType[MyPropertyDescriptor]

'toFuzzyType' @ [345:65] ==> public fun KotlinType.toFuzzyType(freeParameters: Collection<TypeParameterDescriptor>): FuzzyType defined in org.jetbrains.kotlin.idea.util[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [345:77] ==> val descriptor: ClassDescriptor defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.InheritanceSearcher.search[LocalVariableDescriptor]

'typeConstructor' @ [345:88] ==> public final val ClassDescriptor.typeConstructor: TypeConstructor[MyPropertyDescriptor]

'parameters' @ [345:104] ==> public final val TypeConstructor.parameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)>[MyPropertyDescriptor]

'descriptor' @ [346:35] ==> val descriptor: ClassDescriptor defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.InheritanceSearcher.search[LocalVariableDescriptor]

'declaredTypeParameters' @ [346:46] ==> public final val ClassDescriptor.declaredTypeParameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)>[MyPropertyDescriptor]

'isNotEmpty' @ [346:69] ==> @InlineOnly public inline fun <T> Collection<(TypeParameterDescriptor..TypeParameterDescriptor?)>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.TypeParameterDescriptor..org.jetbrains.kotlin.descriptors.TypeParameterDescriptor?)

'hasTypeArgs' @ [347:21] ==> val hasTypeArgs: Boolean defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.InheritanceSearcher.search[LocalVariableDescriptor]

'baseHasTypeArgs' @ [347:36] ==> private final val baseHasTypeArgs: Boolean defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.InheritanceSearcher[PropertyDescriptorImpl]

'inheritorFuzzyType' @ [348:39] ==> var inheritorFuzzyType: FuzzyType defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.InheritanceSearcher.search[LocalVariableDescriptor]

'checkIsSubtypeOf' @ [348:58] ==> public final fun checkIsSubtypeOf(otherType: FuzzyType): TypeSubstitutor? defined in org.jetbrains.kotlin.idea.util.FuzzyType[DeserializedSimpleFunctionDescriptor]

'expectedFuzzyType' @ [348:75] ==> private final val expectedFuzzyType: FuzzyType defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.InheritanceSearcher[PropertyDescriptorImpl]

'!' @ [349:25] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'substitutor' @ [349:26] ==> val substitutor: TypeSubstitutor defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.InheritanceSearcher.search[LocalVariableDescriptor]

'isEmpty' @ [349:38] ==> public final val TypeSubstitutor.isEmpty: Boolean[MyPropertyDescriptor]

'substitutor' @ [350:56] ==> val substitutor: TypeSubstitutor defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.InheritanceSearcher.search[LocalVariableDescriptor]

'substitute' @ [350:68] ==> @Nullable public open fun substitute(@NotNull p0: KotlinType, @NotNull p1: Variance): KotlinType? defined in org.jetbrains.kotlin.types.TypeSubstitutor[JavaMethodDescriptor]

'inheritorFuzzyType' @ [350:79] ==> var inheritorFuzzyType: FuzzyType defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.InheritanceSearcher.search[LocalVariableDescriptor]

'type' @ [350:98] ==> public final val type: KotlinType defined in org.jetbrains.kotlin.idea.util.FuzzyType[DeserializedPropertyDescriptor]

'INVARIANT' @ [350:113] ==> enum entry INVARIANT defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

'inheritorFuzzyType' @ [351:25] ==> var inheritorFuzzyType: FuzzyType defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.InheritanceSearcher.search[LocalVariableDescriptor]

'inheritorTypeSubstituted' @ [351:46] ==> val inheritorTypeSubstituted: KotlinType defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.InheritanceSearcher.search[LocalVariableDescriptor]

'toFuzzyType' @ [351:71] ==> public fun KotlinType.toFuzzyType(freeParameters: Collection<TypeParameterDescriptor>): FuzzyType defined in org.jetbrains.kotlin.idea.util[DeserializedSimpleFunctionDescriptor]

'freeParameters' @ [351:83] ==> private final val freeParameters: Collection<TypeParameterDescriptor> defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.InheritanceSearcher[PropertyDescriptorImpl]

'inheritorFuzzyType' @ [351:100] ==> var inheritorFuzzyType: FuzzyType defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.InheritanceSearcher.search[LocalVariableDescriptor]

'freeParameters' @ [351:119] ==> public final val freeParameters: Set<TypeParameterDescriptor> defined in org.jetbrains.kotlin.idea.util.FuzzyType[DeserializedPropertyDescriptor]

'createTypeInstantiationItem' @ [355:37] ==> private final fun createTypeInstantiationItem(fuzzyType: FuzzyType, classDescriptor: ClassDescriptor?, tail: Tail?): LookupElement? defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems[SimpleFunctionDescriptorImpl]

'inheritorFuzzyType' @ [355:65] ==> var inheritorFuzzyType: FuzzyType defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.InheritanceSearcher.search[LocalVariableDescriptor]

'descriptor' @ [355:85] ==> val descriptor: ClassDescriptor defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.InheritanceSearcher.search[LocalVariableDescriptor]

'tail' @ [355:97] ==> private final val tail: Tail? defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.InheritanceSearcher[PropertyDescriptorImpl]

'invoke' @ [356:17] ==> public abstract operator fun invoke(p1: LookupElement): Unit defined in kotlin.Function1[FunctionInvokeDescriptor]

'lookupElement' @ [356:26] ==> val lookupElement: LookupElement defined in org.jetbrains.kotlin.idea.completion.smart.TypeInstantiationItems.InheritanceSearcher.search[LocalVariableDescriptor]

'assignSmartCompletionPriority' @ [356:40] ==> public fun LookupElement.assignSmartCompletionPriority(priority: SmartCompletionItemPriority): LookupElement defined in org.jetbrains.kotlin.idea.completion.smart in file Utils.kt[SimpleFunctionDescriptorImpl]

'INHERITOR_INSTANTIATION' @ [356:98] ==> enum entry INHERITOR_INSTANTIATION defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionItemPriority[FakeCallableDescriptorForObject]

