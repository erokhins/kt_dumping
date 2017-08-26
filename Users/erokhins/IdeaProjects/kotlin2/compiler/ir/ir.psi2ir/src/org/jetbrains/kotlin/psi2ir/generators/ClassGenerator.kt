'DeclarationGeneratorExtension' @ [38:68] ==> public constructor DeclarationGeneratorExtension(declarationGenerator: DeclarationGenerator) defined in org.jetbrains.kotlin.psi2ir.generators.DeclarationGeneratorExtension[ClassConstructorDescriptorImpl]

'declarationGenerator' @ [38:98] ==> value-parameter declarationGenerator: DeclarationGenerator defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator.<init>[ValueParameterDescriptorImpl]

'getOrFail' @ [40:26] ==> public fun <K, V : Any> Generator.getOrFail(slice: ReadOnlySlice<(PsiElement..PsiElement?), (ClassDescriptor..ClassDescriptor?)>, key: (PsiElement..PsiElement?)): (ClassDescriptor..ClassDescriptor?) defined in org.jetbrains.kotlin.psi2ir.generators[SimpleFunctionDescriptorImpl]
Inferred types:
    <K> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)
    <V : Any> -> (org.jetbrains.kotlin.descriptors.ClassDescriptor..org.jetbrains.kotlin.descriptors.ClassDescriptor?)

'CLASS' @ [40:51] ==> public final val CLASS: (WritableSlice<(PsiElement..PsiElement?), (ClassDescriptor..ClassDescriptor?)>..WritableSlice<(PsiElement..PsiElement?), (ClassDescriptor..ClassDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'ktClassOrObject' @ [40:58] ==> value-parameter ktClassOrObject: KtClassOrObject defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator.generateClass[ValueParameterDescriptorImpl]

'context' @ [42:16] ==> public open val context: GeneratorContext defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator[PropertyDescriptorImpl]

'symbolTable' @ [42:24] ==> public final val symbolTable: SymbolTable defined in org.jetbrains.kotlin.psi2ir.generators.GeneratorContext[PropertyDescriptorImpl]

'declareClass' @ [42:36] ==> public final fun declareClass(startOffset: Int, endOffset: Int, origin: IrDeclarationOrigin, descriptor: ClassDescriptor): IrClass defined in org.jetbrains.kotlin.ir.util.SymbolTable[DeserializedSimpleFunctionDescriptor]

'ktClassOrObject' @ [43:17] ==> value-parameter ktClassOrObject: KtClassOrObject defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator.generateClass[ValueParameterDescriptorImpl]

'startOffset' @ [43:33] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'ktClassOrObject' @ [43:46] ==> value-parameter ktClassOrObject: KtClassOrObject defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator.generateClass[ValueParameterDescriptorImpl]

'endOffset' @ [43:62] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'DEFINED' @ [44:37] ==> public object DEFINED : IrDeclarationOriginImpl defined in org.jetbrains.kotlin.ir.declarations.IrDeclarationOrigin[FakeCallableDescriptorForObject]

'descriptor' @ [45:17] ==> val descriptor: (ClassDescriptor..ClassDescriptor?) defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator.generateClass[LocalVariableDescriptor]

'buildWithScope' @ [46:11] ==> public final inline fun <T : IrDeclaration> IrClass.buildWithScope(builder: (IrClass) -> Unit): IrClass defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : IrDeclaration> -> IrClass

'irClass' @ [47:13] ==> value-parameter irClass: IrClass defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator.generateClass.<anonymous>[ValueParameterDescriptorImpl]

'thisReceiver' @ [47:21] ==> public abstract var thisReceiver: IrValueParameter? defined in org.jetbrains.kotlin.ir.declarations.IrClass[DeserializedPropertyDescriptor]

'context' @ [47:36] ==> public open val context: GeneratorContext defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator[PropertyDescriptorImpl]

'symbolTable' @ [47:44] ==> public final val symbolTable: SymbolTable defined in org.jetbrains.kotlin.psi2ir.generators.GeneratorContext[PropertyDescriptorImpl]

'declareValueParameter' @ [47:56] ==> public final fun declareValueParameter(startOffset: Int, endOffset: Int, origin: IrDeclarationOrigin, descriptor: ParameterDescriptor): IrValueParameter defined in org.jetbrains.kotlin.ir.util.SymbolTable[DeserializedSimpleFunctionDescriptor]

'ktClassOrObject' @ [48:21] ==> value-parameter ktClassOrObject: KtClassOrObject defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator.generateClass[ValueParameterDescriptorImpl]

'startOffset' @ [48:37] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'ktClassOrObject' @ [48:50] ==> value-parameter ktClassOrObject: KtClassOrObject defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator.generateClass[ValueParameterDescriptorImpl]

'endOffset' @ [48:66] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'INSTANCE_RECEIVER' @ [49:41] ==> public object INSTANCE_RECEIVER : IrDeclarationOriginImpl defined in org.jetbrains.kotlin.ir.declarations.IrDeclarationOrigin[FakeCallableDescriptorForObject]

'irClass' @ [50:21] ==> value-parameter irClass: IrClass defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator.generateClass.<anonymous>[ValueParameterDescriptorImpl]

'descriptor' @ [50:29] ==> public abstract val descriptor: ClassDescriptor defined in org.jetbrains.kotlin.ir.declarations.IrClass[DeserializedPropertyDescriptor]

'thisAsReceiverParameter' @ [50:40] ==> public final val ClassDescriptor.thisAsReceiverParameter: ReceiverParameterDescriptor[MyPropertyDescriptor]

'declarationGenerator' @ [53:13] ==> public final val declarationGenerator: DeclarationGenerator defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator[PropertyDescriptorImpl]

'generateTypeParameterDeclarations' @ [53:34] ==> public final fun generateTypeParameterDeclarations(irTypeParametersOwner: IrTypeParametersContainer, from: List<TypeParameterDescriptor>): Unit defined in org.jetbrains.kotlin.psi2ir.generators.DeclarationGenerator[SimpleFunctionDescriptorImpl]

'irClass' @ [53:68] ==> value-parameter irClass: IrClass defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator.generateClass.<anonymous>[ValueParameterDescriptorImpl]

'descriptor' @ [53:77] ==> val descriptor: (ClassDescriptor..ClassDescriptor?) defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator.generateClass[LocalVariableDescriptor]

'declaredTypeParameters' @ [53:88] ==> public final val ClassDescriptor.declaredTypeParameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)>[MyPropertyDescriptor]

'generatePrimaryConstructor' @ [55:40] ==> private final fun generatePrimaryConstructor(irClass: IrClass, ktClassOrObject: KtClassOrObject): IrConstructor? defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator[SimpleFunctionDescriptorImpl]

'irClass' @ [55:67] ==> value-parameter irClass: IrClass defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator.generateClass.<anonymous>[ValueParameterDescriptorImpl]

'ktClassOrObject' @ [55:76] ==> value-parameter ktClassOrObject: KtClassOrObject defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator.generateClass[ValueParameterDescriptorImpl]

'irPrimaryConstructor' @ [56:17] ==> val irPrimaryConstructor: IrConstructor? defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator.generateClass.<anonymous>[LocalVariableDescriptor]

'generateDeclarationsForPrimaryConstructorParameters' @ [57:17] ==> private final fun generateDeclarationsForPrimaryConstructorParameters(irClass: IrClass, irPrimaryConstructor: IrConstructor, ktClassOrObject: KtClassOrObject): Unit defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator[SimpleFunctionDescriptorImpl]

'irClass' @ [57:69] ==> value-parameter irClass: IrClass defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator.generateClass.<anonymous>[ValueParameterDescriptorImpl]

'irPrimaryConstructor' @ [57:78] ==> val irPrimaryConstructor: IrConstructor? defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator.generateClass.<anonymous>[LocalVariableDescriptor]

'ktClassOrObject' @ [57:100] ==> value-parameter ktClassOrObject: KtClassOrObject defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator.generateClass[ValueParameterDescriptorImpl]

'generateMembersDeclaredInSupertypeList' @ [60:13] ==> private final fun generateMembersDeclaredInSupertypeList(irClass: IrClass, ktClassOrObject: KtClassOrObject): Unit defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator[SimpleFunctionDescriptorImpl]

'irClass' @ [60:52] ==> value-parameter irClass: IrClass defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator.generateClass.<anonymous>[ValueParameterDescriptorImpl]

'ktClassOrObject' @ [60:61] ==> value-parameter ktClassOrObject: KtClassOrObject defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator.generateClass[ValueParameterDescriptorImpl]

'generateMembersDeclaredInClassBody' @ [62:13] ==> private final fun generateMembersDeclaredInClassBody(irClass: IrClass, ktClassOrObject: KtClassOrObject): Unit defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator[SimpleFunctionDescriptorImpl]

'irClass' @ [62:48] ==> value-parameter irClass: IrClass defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator.generateClass.<anonymous>[ValueParameterDescriptorImpl]

'ktClassOrObject' @ [62:57] ==> value-parameter ktClassOrObject: KtClassOrObject defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator.generateClass[ValueParameterDescriptorImpl]

'generateFakeOverrideMemberDeclarations' @ [64:13] ==> private final fun generateFakeOverrideMemberDeclarations(irClass: IrClass, ktClassOrObject: KtClassOrObject): Unit defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator[SimpleFunctionDescriptorImpl]

'irClass' @ [64:52] ==> value-parameter irClass: IrClass defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator.generateClass.<anonymous>[ValueParameterDescriptorImpl]

'ktClassOrObject' @ [64:61] ==> value-parameter ktClassOrObject: KtClassOrObject defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator.generateClass[ValueParameterDescriptorImpl]

'descriptor' @ [66:17] ==> val descriptor: (ClassDescriptor..ClassDescriptor?) defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator.generateClass[LocalVariableDescriptor]

'isData' @ [66:28] ==> public final val ClassDescriptor.isData: Boolean[MyPropertyDescriptor]

'generateAdditionalMembersForDataClass' @ [67:17] ==> private final fun generateAdditionalMembersForDataClass(irClass: IrClass, ktClassOrObject: KtClassOrObject): Unit defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator[SimpleFunctionDescriptorImpl]

'irClass' @ [67:55] ==> value-parameter irClass: IrClass defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator.generateClass.<anonymous>[ValueParameterDescriptorImpl]

'ktClassOrObject' @ [67:64] ==> value-parameter ktClassOrObject: KtClassOrObject defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator.generateClass[ValueParameterDescriptorImpl]

'descriptor' @ [70:17] ==> val descriptor: (ClassDescriptor..ClassDescriptor?) defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator.generateClass[LocalVariableDescriptor]

'kind' @ [70:28] ==> public final val ClassDescriptor.kind: ClassKind[MyPropertyDescriptor]

'ENUM_CLASS' @ [70:46] ==> enum entry ENUM_CLASS defined in org.jetbrains.kotlin.descriptors.ClassKind[FakeCallableDescriptorForObject]

'generateAdditionalMembersForEnumClass' @ [71:17] ==> private final fun generateAdditionalMembersForEnumClass(irClass: IrClass): Unit defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator[SimpleFunctionDescriptorImpl]

'irClass' @ [71:55] ==> value-parameter irClass: IrClass defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator.generateClass.<anonymous>[ValueParameterDescriptorImpl]

'irClass' @ [77:9] ==> value-parameter irClass: IrClass defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator.generateFakeOverrideMemberDeclarations[ValueParameterDescriptorImpl]

'descriptor' @ [77:17] ==> public abstract val descriptor: ClassDescriptor defined in org.jetbrains.kotlin.ir.declarations.IrClass[DeserializedPropertyDescriptor]

'unsubstitutedMemberScope' @ [77:28] ==> public final val ClassDescriptor.unsubstitutedMemberScope: MemberScope[MyPropertyDescriptor]

'getContributedDescriptors' @ [77:53] ==> public abstract fun getContributedDescriptors(kindFilter: DescriptorKindFilter, nameFilter: (Name) -> Boolean): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.resolve.scopes.MemberScope[DeserializedSimpleFunctionDescriptor]

'mapNotNull' @ [78:18] ==> public inline fun <T, R : Any> Iterable<DeclarationDescriptor>.mapNotNull(transform: (DeclarationDescriptor) -> CallableMemberDescriptor?): List<CallableMemberDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor
    <R : Any> -> CallableMemberDescriptor

'it' @ [79:21] ==> value-parameter it: DeclarationDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator.generateFakeOverrideMemberDeclarations.<anonymous>[ValueParameterDescriptorImpl]

'safeAs' @ [79:24] ==> public inline fun <reified T : Any> Any?.safeAs(): CallableMemberDescriptor? defined in org.jetbrains.kotlin.utils.addToStdlib[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> CallableMemberDescriptor

'takeIf' @ [79:59] ==> @InlineOnly @SinceKotlin public inline fun <T> CallableMemberDescriptor?.takeIf(predicate: (CallableMemberDescriptor?) -> Boolean): CallableMemberDescriptor? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CallableMemberDescriptor?

'it' @ [80:25] ==> value-parameter it: CallableMemberDescriptor? defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator.generateFakeOverrideMemberDeclarations.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'kind' @ [80:29] ==> public final val CallableMemberDescriptor.kind: CallableMemberDescriptor.Kind[MyPropertyDescriptor]

'FAKE_OVERRIDE' @ [80:67] ==> enum entry FAKE_OVERRIDE defined in org.jetbrains.kotlin.descriptors.CallableMemberDescriptor.Kind[FakeCallableDescriptorForObject]

'sortedWith' @ [83:18] ==> public fun <T> Iterable<CallableMemberDescriptor>.sortedWith(comparator: Comparator<in CallableMemberDescriptor> /* = Comparator<in CallableMemberDescriptor> */): List<CallableMemberDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CallableMemberDescriptor

'StableDescriptorsComparator' @ [83:29] ==> public object StableDescriptorsComparator : Comparator<DeclarationDescriptor> defined in org.jetbrains.kotlin.ir.util[FakeCallableDescriptorForObject]

'forEach' @ [84:18] ==> @HidesMembers public inline fun <T> Iterable<CallableMemberDescriptor>.forEach(action: (CallableMemberDescriptor) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CallableMemberDescriptor

'irClass' @ [85:21] ==> value-parameter irClass: IrClass defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator.generateFakeOverrideMemberDeclarations[ValueParameterDescriptorImpl]

'addMember' @ [85:29] ==> public fun IrClass.addMember(member: IrDeclaration): Unit defined in org.jetbrains.kotlin.ir.declarations[DeserializedSimpleFunctionDescriptor]

'declarationGenerator' @ [85:39] ==> public final val declarationGenerator: DeclarationGenerator defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator[PropertyDescriptorImpl]

'generateFakeOverrideDeclaration' @ [85:60] ==> public final fun generateFakeOverrideDeclaration(memberDescriptor: CallableMemberDescriptor, ktElement: KtElement): IrDeclaration defined in org.jetbrains.kotlin.psi2ir.generators.DeclarationGenerator[SimpleFunctionDescriptorImpl]

'fakeOverride' @ [85:92] ==> value-parameter fakeOverride: CallableMemberDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator.generateFakeOverrideMemberDeclarations.<anonymous>[ValueParameterDescriptorImpl]

'ktClassOrObject' @ [85:106] ==> value-parameter ktClassOrObject: KtClassOrObject defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator.generateFakeOverrideMemberDeclarations[ValueParameterDescriptorImpl]

'ktClassOrObject' @ [90:9] ==> value-parameter ktClassOrObject: KtClassOrObject defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator.generateMembersDeclaredInSupertypeList[ValueParameterDescriptorImpl]

'getSuperTypeList' @ [90:25] ==> public final fun getSuperTypeList(): KtSuperTypeList? defined in org.jetbrains.kotlin.psi.KtClassOrObject[DeserializedSimpleFunctionDescriptor]

'let' @ [90:45] ==> @InlineOnly public inline fun <T, R> KtSuperTypeList.let(block: (KtSuperTypeList) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtSuperTypeList
    <R> -> Unit

'irClass' @ [91:36] ==> value-parameter irClass: IrClass defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator.generateMembersDeclaredInSupertypeList[ValueParameterDescriptorImpl]

'descriptor' @ [91:44] ==> public abstract val descriptor: ClassDescriptor defined in org.jetbrains.kotlin.ir.declarations.IrClass[DeserializedPropertyDescriptor]

'unsubstitutedMemberScope' @ [91:55] ==> public final val ClassDescriptor.unsubstitutedMemberScope: MemberScope[MyPropertyDescriptor]

'getContributedDescriptors' @ [92:22] ==> public abstract fun getContributedDescriptors(kindFilter: DescriptorKindFilter, nameFilter: (Name) -> Boolean): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.resolve.scopes.MemberScope[DeserializedSimpleFunctionDescriptor]

'DescriptorKindFilter' @ [92:48] ==> public companion object defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter[FakeCallableDescriptorForObject]

'CALLABLES' @ [92:69] ==> @field:JvmField public final val CALLABLES: DescriptorKindFilter defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter.Companion[DeserializedPropertyDescriptor]

'filterIsInstance' @ [93:22] ==> public inline fun <reified R> Iterable<*>.filterIsInstance(): List<CallableMemberDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> CallableMemberDescriptor

'filter' @ [94:22] ==> public inline fun <T> Iterable<CallableMemberDescriptor>.filter(predicate: (CallableMemberDescriptor) -> Boolean): List<CallableMemberDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CallableMemberDescriptor

'it' @ [94:31] ==> value-parameter it: CallableMemberDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator.generateMembersDeclaredInSupertypeList.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'kind' @ [94:34] ==> public final val CallableMemberDescriptor.kind: CallableMemberDescriptor.Kind[MyPropertyDescriptor]

'DELEGATION' @ [94:72] ==> enum entry DELEGATION defined in org.jetbrains.kotlin.descriptors.CallableMemberDescriptor.Kind[FakeCallableDescriptorForObject]

'sortedWith' @ [95:22] ==> public fun <T> Iterable<CallableMemberDescriptor>.sortedWith(comparator: Comparator<in CallableMemberDescriptor> /* = Comparator<in CallableMemberDescriptor> */): List<CallableMemberDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CallableMemberDescriptor

'StableDescriptorsComparator' @ [95:33] ==> public object StableDescriptorsComparator : Comparator<DeclarationDescriptor> defined in org.jetbrains.kotlin.ir.util[FakeCallableDescriptorForObject]

'delegatedMembers' @ [96:17] ==> val delegatedMembers: List<CallableMemberDescriptor> defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator.generateMembersDeclaredInSupertypeList.<anonymous>[LocalVariableDescriptor]

'isEmpty' @ [96:34] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'ktSuperTypeList' @ [98:29] ==> value-parameter ktSuperTypeList: KtSuperTypeList defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator.generateMembersDeclaredInSupertypeList.<anonymous>[ValueParameterDescriptorImpl]

'entries' @ [98:45] ==> public final val KtSuperTypeList.entries: (MutableList<(KtSuperTypeListEntry..KtSuperTypeListEntry?)>..List<(KtSuperTypeListEntry..KtSuperTypeListEntry?)>?)[MyPropertyDescriptor]

'ktEntry' @ [99:21] ==> val ktEntry: (KtSuperTypeListEntry..KtSuperTypeListEntry?) defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator.generateMembersDeclaredInSupertypeList.<anonymous>[LocalVariableDescriptor]

'generateDelegatedImplementationMembers' @ [100:21] ==> private final fun generateDelegatedImplementationMembers(irClass: IrClass, ktEntry: KtDelegatedSuperTypeEntry, delegatedMembers: List<CallableMemberDescriptor>): Unit defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator[SimpleFunctionDescriptorImpl]

'irClass' @ [100:60] ==> value-parameter irClass: IrClass defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator.generateMembersDeclaredInSupertypeList[ValueParameterDescriptorImpl]

'ktEntry' @ [100:69] ==> val ktEntry: (KtSuperTypeListEntry..KtSuperTypeListEntry?) defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator.generateMembersDeclaredInSupertypeList.<anonymous>[LocalVariableDescriptor]

'delegatedMembers' @ [100:78] ==> val delegatedMembers: List<CallableMemberDescriptor> defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator.generateMembersDeclaredInSupertypeList.<anonymous>[LocalVariableDescriptor]

'ktEntry' @ [111:36] ==> value-parameter ktEntry: KtDelegatedSuperTypeEntry defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator.generateDelegatedImplementationMembers[ValueParameterDescriptorImpl]

'delegateExpression' @ [111:44] ==> public final val KtDelegatedSuperTypeEntry.delegateExpression: KtExpression?[MyPropertyDescriptor]

'getInferredTypeWithImplicitCastsOrFail' @ [112:28] ==> public fun Generator.getInferredTypeWithImplicitCastsOrFail(key: KtExpression): KotlinType defined in org.jetbrains.kotlin.psi2ir.generators in file Generator.kt[SimpleFunctionDescriptorImpl]

'ktDelegateExpression' @ [112:67] ==> val ktDelegateExpression: KtExpression defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator.generateDelegatedImplementationMembers[LocalVariableDescriptor]

'getOrFail' @ [113:25] ==> public fun <K, V : Any> Generator.getOrFail(slice: ReadOnlySlice<(KtTypeReference..KtTypeReference?), (KotlinType..KotlinType?)>, key: (KtTypeReference..KtTypeReference?)): (KotlinType..KotlinType?) defined in org.jetbrains.kotlin.psi2ir.generators[SimpleFunctionDescriptorImpl]
Inferred types:
    <K> -> (org.jetbrains.kotlin.psi.KtTypeReference..org.jetbrains.kotlin.psi.KtTypeReference?)
    <V : Any> -> (org.jetbrains.kotlin.types.KotlinType..org.jetbrains.kotlin.types.KotlinType?)

'TYPE' @ [113:50] ==> public final val TYPE: (WritableSlice<(KtTypeReference..KtTypeReference?), (KotlinType..KotlinType?)>..WritableSlice<(KtTypeReference..KtTypeReference?), (KotlinType..KotlinType?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'ktEntry' @ [113:56] ==> value-parameter ktEntry: KtDelegatedSuperTypeEntry defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator.generateDelegatedImplementationMembers[ValueParameterDescriptorImpl]

'typeReference' @ [113:64] ==> public final val KtDelegatedSuperTypeEntry.typeReference: KtTypeReference?[MyPropertyDescriptor]

'superType' @ [114:46] ==> val superType: (KotlinType..KotlinType?) defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator.generateDelegatedImplementationMembers[LocalVariableDescriptor]

'constructor' @ [114:56] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'declarationDescriptor' @ [114:68] ==> public final val TypeConstructor.declarationDescriptor: ClassifierDescriptor?[MyPropertyDescriptor]

'superTypeConstructorDescriptor' @ [115:26] ==> val superTypeConstructorDescriptor: ClassifierDescriptor? defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator.generateDelegatedImplementationMembers[LocalVariableDescriptor]

'AssertionError' @ [116:32] ==> public constructor AssertionError(p0: (Any..Any?)) defined in java.lang.AssertionError[JavaClassConstructorDescriptor]

'superTypeConstructorDescriptor' @ [116:98] ==> val superTypeConstructorDescriptor: ClassifierDescriptor? defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator.generateDelegatedImplementationMembers[LocalVariableDescriptor]

'IrImplementingDelegateDescriptorImpl' @ [117:34] ==> public constructor IrImplementingDelegateDescriptorImpl(containingDeclaration: ClassDescriptor, delegateType: KotlinType, correspondingSuperType: KotlinType) defined in org.jetbrains.kotlin.ir.descriptors.IrImplementingDelegateDescriptorImpl[DeserializedClassConstructorDescriptor]

'irClass' @ [117:71] ==> value-parameter irClass: IrClass defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator.generateDelegatedImplementationMembers[ValueParameterDescriptorImpl]

'descriptor' @ [117:79] ==> public abstract val descriptor: ClassDescriptor defined in org.jetbrains.kotlin.ir.declarations.IrClass[DeserializedPropertyDescriptor]

'delegateType' @ [117:91] ==> val delegateType: KotlinType defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator.generateDelegatedImplementationMembers[LocalVariableDescriptor]

'superType' @ [117:105] ==> val superType: (KotlinType..KotlinType?) defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator.generateDelegatedImplementationMembers[LocalVariableDescriptor]

'context' @ [118:31] ==> public open val context: GeneratorContext defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator[PropertyDescriptorImpl]

'symbolTable' @ [118:39] ==> public final val symbolTable: SymbolTable defined in org.jetbrains.kotlin.psi2ir.generators.GeneratorContext[PropertyDescriptorImpl]

'declareField' @ [118:51] ==> public final fun declareField(startOffset: Int, endOffset: Int, origin: IrDeclarationOrigin, descriptor: PropertyDescriptor, irInitializer: IrExpressionBody?): IrField defined in org.jetbrains.kotlin.ir.util.SymbolTable[DeserializedSimpleFunctionDescriptor]

'ktDelegateExpression' @ [119:17] ==> val ktDelegateExpression: KtExpression defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator.generateDelegatedImplementationMembers[LocalVariableDescriptor]

'startOffset' @ [119:38] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'ktDelegateExpression' @ [119:51] ==> val ktDelegateExpression: KtExpression defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator.generateDelegatedImplementationMembers[LocalVariableDescriptor]

'endOffset' @ [119:72] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'DELEGATE' @ [120:37] ==> public object DELEGATE : IrDeclarationOriginImpl defined in org.jetbrains.kotlin.ir.declarations.IrDeclarationOrigin[FakeCallableDescriptorForObject]

'delegateDescriptor' @ [121:17] ==> val delegateDescriptor: IrImplementingDelegateDescriptorImpl defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator.generateDelegatedImplementationMembers[LocalVariableDescriptor]

'createBodyGenerator' @ [122:17] ==> public fun Generator.createBodyGenerator(scopeOwnerSymbol: IrSymbol): BodyGenerator defined in org.jetbrains.kotlin.psi2ir.generators[SimpleFunctionDescriptorImpl]

'irClass' @ [122:37] ==> value-parameter irClass: IrClass defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator.generateDelegatedImplementationMembers[ValueParameterDescriptorImpl]

'symbol' @ [122:45] ==> public abstract val symbol: IrClassSymbol defined in org.jetbrains.kotlin.ir.declarations.IrClass[DeserializedPropertyDescriptor]

'generateExpressionBody' @ [122:53] ==> public final fun generateExpressionBody(ktExpression: KtExpression): IrExpressionBody defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator[SimpleFunctionDescriptorImpl]

'ktDelegateExpression' @ [122:76] ==> val ktDelegateExpression: KtExpression defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator.generateDelegatedImplementationMembers[LocalVariableDescriptor]

'irClass' @ [124:9] ==> value-parameter irClass: IrClass defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator.generateDelegatedImplementationMembers[ValueParameterDescriptorImpl]

'addMember' @ [124:17] ==> public fun IrClass.addMember(member: IrDeclaration): Unit defined in org.jetbrains.kotlin.ir.declarations[DeserializedSimpleFunctionDescriptor]

'irDelegateField' @ [124:27] ==> val irDelegateField: IrField defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator.generateDelegatedImplementationMembers[LocalVariableDescriptor]

'delegatedMembers' @ [126:33] ==> value-parameter delegatedMembers: List<CallableMemberDescriptor> defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator.generateDelegatedImplementationMembers[ValueParameterDescriptorImpl]

'delegatedMember' @ [127:36] ==> val delegatedMember: CallableMemberDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator.generateDelegatedImplementationMembers[LocalVariableDescriptor]

'overriddenDescriptors' @ [127:52] ==> public final var CallableMemberDescriptor.overriddenDescriptors: (MutableCollection<out (CallableMemberDescriptor..CallableMemberDescriptor?)>..Collection<(CallableMemberDescriptor..CallableMemberDescriptor?)>)[MyPropertyDescriptor]

'find' @ [127:74] ==> @InlineOnly public inline fun <T> Iterable<(CallableMemberDescriptor..CallableMemberDescriptor?)>.find(predicate: ((CallableMemberDescriptor..CallableMemberDescriptor?)) -> Boolean): CallableMemberDescriptor? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.CallableMemberDescriptor..org.jetbrains.kotlin.descriptors.CallableMemberDescriptor?)

'it' @ [127:81] ==> value-parameter it: (CallableMemberDescriptor..CallableMemberDescriptor?) defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator.generateDelegatedImplementationMembers.<anonymous>[ValueParameterDescriptorImpl]

'containingDeclaration' @ [127:84] ==> public final val CallableMemberDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'original' @ [127:106] ==> public final val DeclarationDescriptor.original: DeclarationDescriptor[MyPropertyDescriptor]

'superClass' @ [127:118] ==> val superClass: ClassDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator.generateDelegatedImplementationMembers[LocalVariableDescriptor]

'original' @ [127:129] ==> public final val ClassDescriptor.original: ClassDescriptor[MyPropertyDescriptor]

'overriddenMember' @ [128:17] ==> val overriddenMember: CallableMemberDescriptor? defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator.generateDelegatedImplementationMembers[LocalVariableDescriptor]

'generateDelegatedMember' @ [129:17] ==> private final fun generateDelegatedMember(irClass: IrClass, irDelegate: IrField, delegatedMember: CallableMemberDescriptor, overriddenMember: CallableMemberDescriptor): Unit defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator[SimpleFunctionDescriptorImpl]

'irClass' @ [129:41] ==> value-parameter irClass: IrClass defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator.generateDelegatedImplementationMembers[ValueParameterDescriptorImpl]

'irDelegateField' @ [129:50] ==> val irDelegateField: IrField defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator.generateDelegatedImplementationMembers[LocalVariableDescriptor]

'delegatedMember' @ [129:67] ==> val delegatedMember: CallableMemberDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator.generateDelegatedImplementationMembers[LocalVariableDescriptor]

'overriddenMember' @ [129:84] ==> val overriddenMember: CallableMemberDescriptor? defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator.generateDelegatedImplementationMembers[LocalVariableDescriptor]

'when (delegatedMember) {
            is FunctionDescriptor ->
                generateDelegatedFunction(irClass, irDelegate, delegatedMember, overriddenMember as FunctionDescriptor)
            is PropertyDescriptor ->
                generateDelegatedProperty(irClass, irDelegate, delegatedMember, overriddenMember as PropertyDescriptor)
        }' @ [136:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'delegatedMember' @ [136:15] ==> value-parameter delegatedMember: CallableMemberDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator.generateDelegatedMember[ValueParameterDescriptorImpl]

'generateDelegatedFunction' @ [138:17] ==> private final fun generateDelegatedFunction(irClass: IrClass, irDelegate: IrField, delegated: FunctionDescriptor, overridden: FunctionDescriptor): Unit defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator[SimpleFunctionDescriptorImpl]

'irClass' @ [138:43] ==> value-parameter irClass: IrClass defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator.generateDelegatedMember[ValueParameterDescriptorImpl]

'irDelegate' @ [138:52] ==> value-parameter irDelegate: IrField defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator.generateDelegatedMember[ValueParameterDescriptorImpl]

'delegatedMember' @ [138:64] ==> value-parameter delegatedMember: CallableMemberDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator.generateDelegatedMember[ValueParameterDescriptorImpl]

'overriddenMember' @ [138:81] ==> value-parameter overriddenMember: CallableMemberDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator.generateDelegatedMember[ValueParameterDescriptorImpl]

'generateDelegatedProperty' @ [140:17] ==> private final fun generateDelegatedProperty(irClass: IrClass, irDelegate: IrField, delegated: PropertyDescriptor, overridden: PropertyDescriptor): Unit defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator[SimpleFunctionDescriptorImpl]

'irClass' @ [140:43] ==> value-parameter irClass: IrClass defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator.generateDelegatedMember[ValueParameterDescriptorImpl]

'irDelegate' @ [140:52] ==> value-parameter irDelegate: IrField defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator.generateDelegatedMember[ValueParameterDescriptorImpl]

'delegatedMember' @ [140:64] ==> value-parameter delegatedMember: CallableMemberDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator.generateDelegatedMember[ValueParameterDescriptorImpl]

'overriddenMember' @ [140:81] ==> value-parameter overriddenMember: CallableMemberDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator.generateDelegatedMember[ValueParameterDescriptorImpl]

'irClass' @ [146:9] ==> value-parameter irClass: IrClass defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator.generateDelegatedProperty[ValueParameterDescriptorImpl]

'addMember' @ [146:17] ==> public fun IrClass.addMember(member: IrDeclaration): Unit defined in org.jetbrains.kotlin.ir.declarations[DeserializedSimpleFunctionDescriptor]

'generateDelegatedProperty' @ [146:27] ==> private final fun generateDelegatedProperty(irDelegate: IrField, delegated: PropertyDescriptor, overridden: PropertyDescriptor): IrPropertyImpl defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator[SimpleFunctionDescriptorImpl]

'irDelegate' @ [146:53] ==> value-parameter irDelegate: IrField defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator.generateDelegatedProperty[ValueParameterDescriptorImpl]

'delegated' @ [146:65] ==> value-parameter delegated: PropertyDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator.generateDelegatedProperty[ValueParameterDescriptorImpl]

'overridden' @ [146:76] ==> value-parameter overridden: PropertyDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator.generateDelegatedProperty[ValueParameterDescriptorImpl]

'irDelegate' @ [150:27] ==> value-parameter irDelegate: IrField defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator.generateDelegatedProperty[ValueParameterDescriptorImpl]

'startOffset' @ [150:38] ==> public abstract val startOffset: Int defined in org.jetbrains.kotlin.ir.declarations.IrField[DeserializedPropertyDescriptor]

'irDelegate' @ [151:25] ==> value-parameter irDelegate: IrField defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator.generateDelegatedProperty[ValueParameterDescriptorImpl]

'endOffset' @ [151:36] ==> public abstract val endOffset: Int defined in org.jetbrains.kotlin.ir.declarations.IrField[DeserializedPropertyDescriptor]

'IrPropertyImpl' @ [153:26] ==> public constructor IrPropertyImpl(startOffset: Int, endOffset: Int, origin: IrDeclarationOrigin, isDelegated: Boolean, descriptor: PropertyDescriptor) defined in org.jetbrains.kotlin.ir.declarations.impl.IrPropertyImpl[DeserializedClassConstructorDescriptor]

'startOffset' @ [153:41] ==> val startOffset: Int defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator.generateDelegatedProperty[LocalVariableDescriptor]

'endOffset' @ [153:54] ==> val endOffset: Int defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator.generateDelegatedProperty[LocalVariableDescriptor]

'DELEGATED_MEMBER' @ [153:85] ==> public object DELEGATED_MEMBER : IrDeclarationOriginImpl defined in org.jetbrains.kotlin.ir.declarations.IrDeclarationOrigin[FakeCallableDescriptorForObject]

'delegated' @ [153:110] ==> value-parameter delegated: PropertyDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator.generateDelegatedProperty[ValueParameterDescriptorImpl]

'irProperty' @ [155:9] ==> val irProperty: IrPropertyImpl defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator.generateDelegatedProperty[LocalVariableDescriptor]

'getter' @ [155:20] ==> public open var getter: IrFunction? defined in org.jetbrains.kotlin.ir.declarations.impl.IrPropertyImpl[DeserializedPropertyDescriptor]

'generateDelegatedFunction' @ [155:29] ==> private final fun generateDelegatedFunction(irDelegate: IrField, delegated: FunctionDescriptor, overridden: FunctionDescriptor): IrFunction defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator[SimpleFunctionDescriptorImpl]

'irDelegate' @ [155:55] ==> value-parameter irDelegate: IrField defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator.generateDelegatedProperty[ValueParameterDescriptorImpl]

'delegated' @ [155:67] ==> value-parameter delegated: PropertyDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator.generateDelegatedProperty[ValueParameterDescriptorImpl]

'getter' @ [155:77] ==> public abstract val getter: PropertyGetterDescriptor? defined in org.jetbrains.kotlin.descriptors.PropertyDescriptor[JavaPropertyDescriptor]

'overridden' @ [155:87] ==> value-parameter overridden: PropertyDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator.generateDelegatedProperty[ValueParameterDescriptorImpl]

'getter' @ [155:98] ==> public abstract val getter: PropertyGetterDescriptor? defined in org.jetbrains.kotlin.descriptors.PropertyDescriptor[JavaPropertyDescriptor]

'delegated' @ [157:13] ==> value-parameter delegated: PropertyDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator.generateDelegatedProperty[ValueParameterDescriptorImpl]

'isVar' @ [157:23] ==> public final val PropertyDescriptor.isVar: Boolean[MyPropertyDescriptor]

'irProperty' @ [158:13] ==> val irProperty: IrPropertyImpl defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator.generateDelegatedProperty[LocalVariableDescriptor]

'setter' @ [158:24] ==> public open var setter: IrFunction? defined in org.jetbrains.kotlin.ir.declarations.impl.IrPropertyImpl[DeserializedPropertyDescriptor]

'generateDelegatedFunction' @ [158:33] ==> private final fun generateDelegatedFunction(irDelegate: IrField, delegated: FunctionDescriptor, overridden: FunctionDescriptor): IrFunction defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator[SimpleFunctionDescriptorImpl]

'irDelegate' @ [158:59] ==> value-parameter irDelegate: IrField defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator.generateDelegatedProperty[ValueParameterDescriptorImpl]

'delegated' @ [158:71] ==> value-parameter delegated: PropertyDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator.generateDelegatedProperty[ValueParameterDescriptorImpl]

'setter' @ [158:81] ==> public abstract val setter: PropertySetterDescriptor? defined in org.jetbrains.kotlin.descriptors.PropertyDescriptor[JavaPropertyDescriptor]

'overridden' @ [158:91] ==> value-parameter overridden: PropertyDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator.generateDelegatedProperty[ValueParameterDescriptorImpl]

'setter' @ [158:102] ==> public abstract val setter: PropertySetterDescriptor? defined in org.jetbrains.kotlin.descriptors.PropertyDescriptor[JavaPropertyDescriptor]

'irProperty' @ [160:16] ==> val irProperty: IrPropertyImpl defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator.generateDelegatedProperty[LocalVariableDescriptor]

'irClass' @ [164:9] ==> value-parameter irClass: IrClass defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator.generateDelegatedFunction[ValueParameterDescriptorImpl]

'addMember' @ [164:17] ==> public fun IrClass.addMember(member: IrDeclaration): Unit defined in org.jetbrains.kotlin.ir.declarations[DeserializedSimpleFunctionDescriptor]

'generateDelegatedFunction' @ [164:27] ==> private final fun generateDelegatedFunction(irDelegate: IrField, delegated: FunctionDescriptor, overridden: FunctionDescriptor): IrFunction defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator[SimpleFunctionDescriptorImpl]

'irDelegate' @ [164:53] ==> value-parameter irDelegate: IrField defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator.generateDelegatedFunction[ValueParameterDescriptorImpl]

'delegated' @ [164:65] ==> value-parameter delegated: FunctionDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator.generateDelegatedFunction[ValueParameterDescriptorImpl]

'overridden' @ [164:76] ==> value-parameter overridden: FunctionDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator.generateDelegatedFunction[ValueParameterDescriptorImpl]

'context' @ [168:13] ==> public open val context: GeneratorContext defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator[PropertyDescriptorImpl]

'symbolTable' @ [168:21] ==> public final val symbolTable: SymbolTable defined in org.jetbrains.kotlin.psi2ir.generators.GeneratorContext[PropertyDescriptorImpl]

'declareSimpleFunction' @ [168:33] ==> public final fun declareSimpleFunction(startOffset: Int, endOffset: Int, origin: IrDeclarationOrigin, descriptor: FunctionDescriptor): IrSimpleFunction defined in org.jetbrains.kotlin.ir.util.SymbolTable[DeserializedSimpleFunctionDescriptor]

'irDelegate' @ [169:21] ==> value-parameter irDelegate: IrField defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator.generateDelegatedFunction[ValueParameterDescriptorImpl]

'startOffset' @ [169:32] ==> public abstract val startOffset: Int defined in org.jetbrains.kotlin.ir.declarations.IrField[DeserializedPropertyDescriptor]

'irDelegate' @ [169:45] ==> value-parameter irDelegate: IrField defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator.generateDelegatedFunction[ValueParameterDescriptorImpl]

'endOffset' @ [169:56] ==> public abstract val endOffset: Int defined in org.jetbrains.kotlin.ir.declarations.IrField[DeserializedPropertyDescriptor]

'DELEGATED_MEMBER' @ [170:41] ==> public object DELEGATED_MEMBER : IrDeclarationOriginImpl defined in org.jetbrains.kotlin.ir.declarations.IrDeclarationOrigin[FakeCallableDescriptorForObject]

'delegated' @ [171:21] ==> value-parameter delegated: FunctionDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator.generateDelegatedFunction[ValueParameterDescriptorImpl]

'buildWithScope' @ [172:15] ==> public final inline fun <T : IrDeclaration> IrSimpleFunction.buildWithScope(builder: (IrSimpleFunction) -> Unit): IrSimpleFunction defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : IrDeclaration> -> IrSimpleFunction

'FunctionGenerator' @ [173:17] ==> public constructor FunctionGenerator(declarationGenerator: DeclarationGenerator) defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator[ClassConstructorDescriptorImpl]

'declarationGenerator' @ [173:35] ==> public final val declarationGenerator: DeclarationGenerator defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator[PropertyDescriptorImpl]

'generateSyntheticFunctionParameterDeclarations' @ [173:57] ==> public final fun generateSyntheticFunctionParameterDeclarations(irFunction: IrFunction): Unit defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator[SimpleFunctionDescriptorImpl]

'irFunction' @ [173:104] ==> value-parameter irFunction: IrSimpleFunction defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator.generateDelegatedFunction.<anonymous>[ValueParameterDescriptorImpl]

'irFunction' @ [174:17] ==> value-parameter irFunction: IrSimpleFunction defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator.generateDelegatedFunction.<anonymous>[ValueParameterDescriptorImpl]

'body' @ [174:28] ==> public abstract var body: IrBody? defined in org.jetbrains.kotlin.ir.declarations.IrSimpleFunction[DeserializedPropertyDescriptor]

'generateDelegateFunctionBody' @ [174:35] ==> private final fun generateDelegateFunctionBody(irDelegate: IrField, delegated: FunctionDescriptor, overridden: FunctionDescriptor, irDelegatedFunction: IrSimpleFunction): IrBlockBodyImpl defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator[SimpleFunctionDescriptorImpl]

'irDelegate' @ [174:64] ==> value-parameter irDelegate: IrField defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator.generateDelegatedFunction[ValueParameterDescriptorImpl]

'delegated' @ [174:76] ==> value-parameter delegated: FunctionDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator.generateDelegatedFunction[ValueParameterDescriptorImpl]

'overridden' @ [174:87] ==> value-parameter overridden: FunctionDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator.generateDelegatedFunction[ValueParameterDescriptorImpl]

'irFunction' @ [174:99] ==> value-parameter irFunction: IrSimpleFunction defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator.generateDelegatedFunction.<anonymous>[ValueParameterDescriptorImpl]

'irDelegate' @ [179:27] ==> value-parameter irDelegate: IrField defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator.generateDelegateFunctionBody[ValueParameterDescriptorImpl]

'startOffset' @ [179:38] ==> public abstract val startOffset: Int defined in org.jetbrains.kotlin.ir.declarations.IrField[DeserializedPropertyDescriptor]

'irDelegate' @ [180:25] ==> value-parameter irDelegate: IrField defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator.generateDelegateFunctionBody[ValueParameterDescriptorImpl]

'endOffset' @ [180:36] ==> public abstract val endOffset: Int defined in org.jetbrains.kotlin.ir.declarations.IrField[DeserializedPropertyDescriptor]

'IrBlockBodyImpl' @ [181:27] ==> public constructor IrBlockBodyImpl(startOffset: Int, endOffset: Int) defined in org.jetbrains.kotlin.ir.expressions.impl.IrBlockBodyImpl[DeserializedClassConstructorDescriptor]

'startOffset' @ [181:43] ==> val startOffset: Int defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator.generateDelegateFunctionBody[LocalVariableDescriptor]

'endOffset' @ [181:56] ==> val endOffset: Int defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator.generateDelegateFunctionBody[LocalVariableDescriptor]

'overridden' @ [182:26] ==> value-parameter overridden: FunctionDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator.generateDelegateFunctionBody[ValueParameterDescriptorImpl]

'returnType' @ [182:37] ==> public final val FunctionDescriptor.returnType: KotlinType?[MyPropertyDescriptor]

'IrCallImpl' @ [183:22] ==> public constructor IrCallImpl(startOffset: Int, endOffset: Int, type: KotlinType, symbol: IrFunctionSymbol, descriptor: FunctionDescriptor, typeArguments: Map<TypeParameterDescriptor, KotlinType>?, origin: IrStatementOrigin? = ..., superQualifierSymbol: IrClassSymbol? = ...) defined in org.jetbrains.kotlin.ir.expressions.impl.IrCallImpl[DeserializedClassConstructorDescriptor]

'startOffset' @ [183:33] ==> val startOffset: Int defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator.generateDelegateFunctionBody[LocalVariableDescriptor]

'endOffset' @ [183:46] ==> val endOffset: Int defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator.generateDelegateFunctionBody[LocalVariableDescriptor]

'returnType' @ [183:57] ==> val returnType: KotlinType defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator.generateDelegateFunctionBody[LocalVariableDescriptor]

'context' @ [183:69] ==> public open val context: GeneratorContext defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator[PropertyDescriptorImpl]

'symbolTable' @ [183:77] ==> public final val symbolTable: SymbolTable defined in org.jetbrains.kotlin.psi2ir.generators.GeneratorContext[PropertyDescriptorImpl]

'referenceFunction' @ [183:89] ==> public final fun referenceFunction(callable: CallableDescriptor): IrFunctionSymbol defined in org.jetbrains.kotlin.ir.util.SymbolTable[DeserializedSimpleFunctionDescriptor]

'overridden' @ [183:107] ==> value-parameter overridden: FunctionDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator.generateDelegateFunctionBody[ValueParameterDescriptorImpl]

'original' @ [183:118] ==> public final val FunctionDescriptor.original: FunctionDescriptor[MyPropertyDescriptor]

'overridden' @ [183:129] ==> value-parameter overridden: FunctionDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator.generateDelegateFunctionBody[ValueParameterDescriptorImpl]

'irCall' @ [184:9] ==> val irCall: IrCallImpl defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator.generateDelegateFunctionBody[LocalVariableDescriptor]

'dispatchReceiver' @ [184:16] ==> public open var dispatchReceiver: IrExpression? defined in org.jetbrains.kotlin.ir.expressions.impl.IrCallImpl[DeserializedPropertyDescriptor]

'IrGetFieldImpl' @ [185:17] ==> public constructor IrGetFieldImpl(startOffset: Int, endOffset: Int, symbol: IrFieldSymbol, receiver: IrExpression?, origin: IrStatementOrigin? = ..., superQualifierSymbol: IrClassSymbol? = ...) defined in org.jetbrains.kotlin.ir.expressions.impl.IrGetFieldImpl[DeserializedClassConstructorDescriptor]

'startOffset' @ [186:25] ==> val startOffset: Int defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator.generateDelegateFunctionBody[LocalVariableDescriptor]

'endOffset' @ [186:38] ==> val endOffset: Int defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator.generateDelegateFunctionBody[LocalVariableDescriptor]

'irDelegate' @ [186:49] ==> value-parameter irDelegate: IrField defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator.generateDelegateFunctionBody[ValueParameterDescriptorImpl]

'symbol' @ [186:60] ==> public abstract val symbol: IrFieldSymbol defined in org.jetbrains.kotlin.ir.declarations.IrField[DeserializedPropertyDescriptor]

'IrGetValueImpl' @ [187:25] ==> public constructor IrGetValueImpl(startOffset: Int, endOffset: Int, symbol: IrValueSymbol, origin: IrStatementOrigin? = ...) defined in org.jetbrains.kotlin.ir.expressions.impl.IrGetValueImpl[DeserializedClassConstructorDescriptor]

'startOffset' @ [187:40] ==> val startOffset: Int defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator.generateDelegateFunctionBody[LocalVariableDescriptor]

'endOffset' @ [187:53] ==> val endOffset: Int defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator.generateDelegateFunctionBody[LocalVariableDescriptor]

'irDelegatedFunction' @ [187:64] ==> value-parameter irDelegatedFunction: IrSimpleFunction defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator.generateDelegateFunctionBody[ValueParameterDescriptorImpl]

'dispatchReceiverParameter' @ [187:84] ==> public abstract var dispatchReceiverParameter: IrValueParameter? defined in org.jetbrains.kotlin.ir.declarations.IrSimpleFunction[DeserializedPropertyDescriptor]

'symbol' @ [187:112] ==> public abstract val symbol: IrValueParameterSymbol defined in org.jetbrains.kotlin.ir.declarations.IrValueParameter[DeserializedPropertyDescriptor]

'irCall' @ [189:9] ==> val irCall: IrCallImpl defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator.generateDelegateFunctionBody[LocalVariableDescriptor]

'extensionReceiver' @ [189:16] ==> public open var extensionReceiver: IrExpression? defined in org.jetbrains.kotlin.ir.expressions.impl.IrCallImpl[DeserializedPropertyDescriptor]

'irDelegatedFunction' @ [190:17] ==> value-parameter irDelegatedFunction: IrSimpleFunction defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator.generateDelegateFunctionBody[ValueParameterDescriptorImpl]

'extensionReceiverParameter' @ [190:37] ==> public abstract var extensionReceiverParameter: IrValueParameter? defined in org.jetbrains.kotlin.ir.declarations.IrSimpleFunction[DeserializedPropertyDescriptor]

'let' @ [190:65] ==> @InlineOnly public inline fun <T, R> IrValueParameter.let(block: (IrValueParameter) -> IrGetValueImpl): IrGetValueImpl defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrValueParameter
    <R> -> IrGetValueImpl

'IrGetValueImpl' @ [191:21] ==> public constructor IrGetValueImpl(startOffset: Int, endOffset: Int, symbol: IrValueSymbol, origin: IrStatementOrigin? = ...) defined in org.jetbrains.kotlin.ir.expressions.impl.IrGetValueImpl[DeserializedClassConstructorDescriptor]

'startOffset' @ [191:36] ==> val startOffset: Int defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator.generateDelegateFunctionBody[LocalVariableDescriptor]

'endOffset' @ [191:49] ==> val endOffset: Int defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator.generateDelegateFunctionBody[LocalVariableDescriptor]

'extensionReceiver' @ [191:60] ==> value-parameter extensionReceiver: IrValueParameter defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator.generateDelegateFunctionBody.<anonymous>[ValueParameterDescriptorImpl]

'symbol' @ [191:78] ==> public abstract val symbol: IrValueParameterSymbol defined in org.jetbrains.kotlin.ir.declarations.IrValueParameter[DeserializedPropertyDescriptor]

'irCall' @ [193:9] ==> val irCall: IrCallImpl defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator.generateDelegateFunctionBody[LocalVariableDescriptor]

'mapValueParameters' @ [193:16] ==> public inline fun <T : IrMemberAccessExpression> IrCallImpl.mapValueParameters(transform: (ValueParameterDescriptor) -> IrExpression?): IrCallImpl defined in org.jetbrains.kotlin.ir.expressions[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : IrMemberAccessExpression> -> IrCallImpl

'delegated' @ [194:43] ==> value-parameter delegated: FunctionDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator.generateDelegateFunctionBody[ValueParameterDescriptorImpl]

'valueParameters' @ [194:53] ==> public final val FunctionDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'overriddenValueParameter' @ [194:69] ==> value-parameter overriddenValueParameter: ValueParameterDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator.generateDelegateFunctionBody.<anonymous>[ValueParameterDescriptorImpl]

'index' @ [194:94] ==> public abstract val index: Int defined in org.jetbrains.kotlin.descriptors.ValueParameterDescriptor[DeserializedPropertyDescriptor]

'irDelegatedFunction' @ [195:45] ==> value-parameter irDelegatedFunction: IrSimpleFunction defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator.generateDelegateFunctionBody[ValueParameterDescriptorImpl]

'getIrValueParameter' @ [195:65] ==> public fun IrFunction.getIrValueParameter(parameter: ValueParameterDescriptor): IrValueParameter defined in org.jetbrains.kotlin.ir.declarations[DeserializedSimpleFunctionDescriptor]

'delegatedValueParameter' @ [195:85] ==> val delegatedValueParameter: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator.generateDelegateFunctionBody.<anonymous>[LocalVariableDescriptor]

'IrGetValueImpl' @ [196:13] ==> public constructor IrGetValueImpl(startOffset: Int, endOffset: Int, symbol: IrValueSymbol, origin: IrStatementOrigin? = ...) defined in org.jetbrains.kotlin.ir.expressions.impl.IrGetValueImpl[DeserializedClassConstructorDescriptor]

'startOffset' @ [196:28] ==> val startOffset: Int defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator.generateDelegateFunctionBody[LocalVariableDescriptor]

'endOffset' @ [196:41] ==> val endOffset: Int defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator.generateDelegateFunctionBody[LocalVariableDescriptor]

'irDelegatedValueParameter' @ [196:52] ==> val irDelegatedValueParameter: IrValueParameter defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator.generateDelegateFunctionBody.<anonymous>[LocalVariableDescriptor]

'symbol' @ [196:78] ==> public abstract val symbol: IrValueParameterSymbol defined in org.jetbrains.kotlin.ir.declarations.IrValueParameter[DeserializedPropertyDescriptor]

'if (KotlinBuiltIns.isUnit(returnType) || KotlinBuiltIns.isNothing(returnType)) {
            irBlockBody.statements.add(irCall)
        }
        else {
            val irReturn = IrReturnImpl(startOffset, endOffset, context.builtIns.nothingType, irDelegatedFunction.symbol, irCall)
            irBlockBody.statements.add(irReturn)
        }' @ [198:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Boolean, elseBranch: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Boolean

'isUnit' @ [198:28] ==> public open fun isUnit(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'returnType' @ [198:35] ==> val returnType: KotlinType defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator.generateDelegateFunctionBody[LocalVariableDescriptor]

'isNothing' @ [198:65] ==> public open fun isNothing(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'returnType' @ [198:75] ==> val returnType: KotlinType defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator.generateDelegateFunctionBody[LocalVariableDescriptor]

'irBlockBody' @ [199:13] ==> val irBlockBody: IrBlockBodyImpl defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator.generateDelegateFunctionBody[LocalVariableDescriptor]

'statements' @ [199:25] ==> public open val statements: MutableList<IrStatement> defined in org.jetbrains.kotlin.ir.expressions.impl.IrBlockBodyImpl[DeserializedPropertyDescriptor]

'add' @ [199:36] ==> public abstract fun add(element: IrStatement): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'irCall' @ [199:40] ==> val irCall: IrCallImpl defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator.generateDelegateFunctionBody[LocalVariableDescriptor]

'IrReturnImpl' @ [202:28] ==> public constructor IrReturnImpl(startOffset: Int, endOffset: Int, type: KotlinType, returnTargetSymbol: IrFunctionSymbol, value: IrExpression) defined in org.jetbrains.kotlin.ir.expressions.impl.IrReturnImpl[DeserializedClassConstructorDescriptor]

'startOffset' @ [202:41] ==> val startOffset: Int defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator.generateDelegateFunctionBody[LocalVariableDescriptor]

'endOffset' @ [202:54] ==> val endOffset: Int defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator.generateDelegateFunctionBody[LocalVariableDescriptor]

'context' @ [202:65] ==> public open val context: GeneratorContext defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator[PropertyDescriptorImpl]

'builtIns' @ [202:73] ==> public final val builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.psi2ir.generators.GeneratorContext[DeserializedPropertyDescriptor]

'nothingType' @ [202:82] ==> public final val KotlinBuiltIns.nothingType: SimpleType[MyPropertyDescriptor]

'irDelegatedFunction' @ [202:95] ==> value-parameter irDelegatedFunction: IrSimpleFunction defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator.generateDelegateFunctionBody[ValueParameterDescriptorImpl]

'symbol' @ [202:115] ==> public abstract val symbol: IrSimpleFunctionSymbol defined in org.jetbrains.kotlin.ir.declarations.IrSimpleFunction[DeserializedPropertyDescriptor]

'irCall' @ [202:123] ==> val irCall: IrCallImpl defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator.generateDelegateFunctionBody[LocalVariableDescriptor]

'irBlockBody' @ [203:13] ==> val irBlockBody: IrBlockBodyImpl defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator.generateDelegateFunctionBody[LocalVariableDescriptor]

'statements' @ [203:25] ==> public open val statements: MutableList<IrStatement> defined in org.jetbrains.kotlin.ir.expressions.impl.IrBlockBodyImpl[DeserializedPropertyDescriptor]

'add' @ [203:36] ==> public abstract fun add(element: IrStatement): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'irReturn' @ [203:40] ==> val irReturn: IrReturnImpl defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator.generateDelegateFunctionBody[LocalVariableDescriptor]

'irBlockBody' @ [205:16] ==> val irBlockBody: IrBlockBodyImpl defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator.generateDelegateFunctionBody[LocalVariableDescriptor]

'DataClassMembersGenerator' @ [209:9] ==> public constructor DataClassMembersGenerator(declarationGenerator: DeclarationGenerator) defined in org.jetbrains.kotlin.psi2ir.generators.DataClassMembersGenerator[ClassConstructorDescriptorImpl]

'declarationGenerator' @ [209:35] ==> public final val declarationGenerator: DeclarationGenerator defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator[PropertyDescriptorImpl]

'generate' @ [209:57] ==> public final fun generate(ktClassOrObject: KtClassOrObject, irClass: IrClass): Unit defined in org.jetbrains.kotlin.psi2ir.generators.DataClassMembersGenerator[SimpleFunctionDescriptorImpl]

'ktClassOrObject' @ [209:66] ==> value-parameter ktClassOrObject: KtClassOrObject defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator.generateAdditionalMembersForDataClass[ValueParameterDescriptorImpl]

'irClass' @ [209:83] ==> value-parameter irClass: IrClass defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator.generateAdditionalMembersForDataClass[ValueParameterDescriptorImpl]

'EnumClassMembersGenerator' @ [213:9] ==> public constructor EnumClassMembersGenerator(declarationGenerator: DeclarationGenerator) defined in org.jetbrains.kotlin.psi2ir.generators.EnumClassMembersGenerator[ClassConstructorDescriptorImpl]

'declarationGenerator' @ [213:35] ==> public final val declarationGenerator: DeclarationGenerator defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator[PropertyDescriptorImpl]

'generateSpecialMembers' @ [213:57] ==> public final fun generateSpecialMembers(irClass: IrClass): Unit defined in org.jetbrains.kotlin.psi2ir.generators.EnumClassMembersGenerator[SimpleFunctionDescriptorImpl]

'irClass' @ [213:80] ==> value-parameter irClass: IrClass defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator.generateAdditionalMembersForEnumClass[ValueParameterDescriptorImpl]

'irClass' @ [217:31] ==> value-parameter irClass: IrClass defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator.generatePrimaryConstructor[ValueParameterDescriptorImpl]

'descriptor' @ [217:39] ==> public abstract val descriptor: ClassDescriptor defined in org.jetbrains.kotlin.ir.declarations.IrClass[DeserializedPropertyDescriptor]

'classDescriptor' @ [218:44] ==> val classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator.generatePrimaryConstructor[LocalVariableDescriptor]

'unsubstitutedPrimaryConstructor' @ [218:60] ==> public final val ClassDescriptor.unsubstitutedPrimaryConstructor: ClassConstructorDescriptor?[MyPropertyDescriptor]

'FunctionGenerator' @ [220:36] ==> public constructor FunctionGenerator(declarationGenerator: DeclarationGenerator) defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator[ClassConstructorDescriptorImpl]

'declarationGenerator' @ [220:54] ==> public final val declarationGenerator: DeclarationGenerator defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator[PropertyDescriptorImpl]

'generatePrimaryConstructor' @ [220:76] ==> public final fun generatePrimaryConstructor(primaryConstructorDescriptor: ClassConstructorDescriptor, ktClassOrObject: KtClassOrObject): IrConstructor defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator[SimpleFunctionDescriptorImpl]

'primaryConstructorDescriptor' @ [220:103] ==> val primaryConstructorDescriptor: ClassConstructorDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator.generatePrimaryConstructor[LocalVariableDescriptor]

'ktClassOrObject' @ [220:133] ==> value-parameter ktClassOrObject: KtClassOrObject defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator.generatePrimaryConstructor[ValueParameterDescriptorImpl]

'!' @ [222:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isAnnotationClass' @ [222:30] ==> public open fun isAnnotationClass(@Nullable p0: DeclarationDescriptor?): Boolean defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'classDescriptor' @ [222:48] ==> val classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator.generatePrimaryConstructor[LocalVariableDescriptor]

'irClass' @ [223:13] ==> value-parameter irClass: IrClass defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator.generatePrimaryConstructor[ValueParameterDescriptorImpl]

'addMember' @ [223:21] ==> public fun IrClass.addMember(member: IrDeclaration): Unit defined in org.jetbrains.kotlin.ir.declarations[DeserializedSimpleFunctionDescriptor]

'irPrimaryConstructor' @ [223:31] ==> val irPrimaryConstructor: IrConstructor defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator.generatePrimaryConstructor[LocalVariableDescriptor]

'irPrimaryConstructor' @ [226:16] ==> val irPrimaryConstructor: IrConstructor defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator.generatePrimaryConstructor[LocalVariableDescriptor]

'ktClassOrObject' @ [234:9] ==> value-parameter ktClassOrObject: KtClassOrObject defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator.generateDeclarationsForPrimaryConstructorParameters[ValueParameterDescriptorImpl]

'primaryConstructor' @ [234:25] ==> public final val KtClassOrObject.primaryConstructor: KtPrimaryConstructor?[MyPropertyDescriptor]

'let' @ [234:45] ==> @InlineOnly public inline fun <T, R> KtPrimaryConstructor.let(block: (KtPrimaryConstructor) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtPrimaryConstructor
    <R> -> Unit

'irPrimaryConstructor' @ [235:13] ==> value-parameter irPrimaryConstructor: IrConstructor defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator.generateDeclarationsForPrimaryConstructorParameters[ValueParameterDescriptorImpl]

'valueParameters' @ [235:34] ==> public abstract val valueParameters: MutableList<IrValueParameter> defined in org.jetbrains.kotlin.ir.declarations.IrConstructor[DeserializedPropertyDescriptor]

'forEach' @ [235:50] ==> @HidesMembers public inline fun <T> Iterable<IrValueParameter>.forEach(action: (IrValueParameter) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrValueParameter

'context' @ [236:17] ==> public open val context: GeneratorContext defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator[PropertyDescriptorImpl]

'symbolTable' @ [236:25] ==> public final val symbolTable: SymbolTable defined in org.jetbrains.kotlin.psi2ir.generators.GeneratorContext[PropertyDescriptorImpl]

'introduceValueParameter' @ [236:37] ==> public final fun introduceValueParameter(irValueParameter: IrValueParameter): Unit defined in org.jetbrains.kotlin.ir.util.SymbolTable[DeserializedSimpleFunctionDescriptor]

'it' @ [236:61] ==> value-parameter it: IrValueParameter defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator.generateDeclarationsForPrimaryConstructorParameters.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'ktPrimaryConstructor' @ [239:13] ==> value-parameter ktPrimaryConstructor: KtPrimaryConstructor defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator.generateDeclarationsForPrimaryConstructorParameters.<anonymous>[ValueParameterDescriptorImpl]

'valueParameters' @ [239:34] ==> public final val KtPrimaryConstructor.valueParameters: (MutableList<(KtParameter..KtParameter?)>..List<(KtParameter..KtParameter?)>)[MyPropertyDescriptor]

'forEachIndexed' @ [239:50] ==> public inline fun <T> Iterable<(KtParameter..KtParameter?)>.forEachIndexed(action: (index: Int, (KtParameter..KtParameter?)) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtParameter..org.jetbrains.kotlin.psi.KtParameter?)

'irPrimaryConstructor' @ [240:40] ==> value-parameter irPrimaryConstructor: IrConstructor defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator.generateDeclarationsForPrimaryConstructorParameters[ValueParameterDescriptorImpl]

'valueParameters' @ [240:61] ==> public abstract val valueParameters: MutableList<IrValueParameter> defined in org.jetbrains.kotlin.ir.declarations.IrConstructor[DeserializedPropertyDescriptor]

'i' @ [240:77] ==> value-parameter i: Int defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator.generateDeclarationsForPrimaryConstructorParameters.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'ktParameter' @ [241:21] ==> value-parameter ktParameter: (KtParameter..KtParameter?) defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator.generateDeclarationsForPrimaryConstructorParameters.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'hasValOrVar' @ [241:33] ==> public open fun hasValOrVar(): Boolean defined in org.jetbrains.kotlin.psi.KtParameter[JavaMethodDescriptor]

'PropertyGenerator' @ [242:38] ==> public constructor PropertyGenerator(declarationGenerator: DeclarationGenerator) defined in org.jetbrains.kotlin.psi2ir.generators.PropertyGenerator[ClassConstructorDescriptorImpl]

'declarationGenerator' @ [242:56] ==> public final val declarationGenerator: DeclarationGenerator defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator[PropertyDescriptorImpl]

'generatePropertyForPrimaryConstructorParameter' @ [243:30] ==> public final fun generatePropertyForPrimaryConstructorParameter(ktParameter: KtParameter, irValueParameter: IrValueParameter): IrDeclaration defined in org.jetbrains.kotlin.psi2ir.generators.PropertyGenerator[SimpleFunctionDescriptorImpl]

'ktParameter' @ [243:77] ==> value-parameter ktParameter: (KtParameter..KtParameter?) defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator.generateDeclarationsForPrimaryConstructorParameters.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'irValueParameter' @ [243:90] ==> val irValueParameter: IrValueParameter defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator.generateDeclarationsForPrimaryConstructorParameters.<anonymous>.<anonymous>[LocalVariableDescriptor]

'irClass' @ [244:21] ==> value-parameter irClass: IrClass defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator.generateDeclarationsForPrimaryConstructorParameters[ValueParameterDescriptorImpl]

'addMember' @ [244:29] ==> public fun IrClass.addMember(member: IrDeclaration): Unit defined in org.jetbrains.kotlin.ir.declarations[DeserializedSimpleFunctionDescriptor]

'irProperty' @ [244:39] ==> val irProperty: IrDeclaration defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator.generateDeclarationsForPrimaryConstructorParameters.<anonymous>.<anonymous>[LocalVariableDescriptor]

'ktClassOrObject' @ [251:9] ==> value-parameter ktClassOrObject: KtClassOrObject defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator.generateMembersDeclaredInClassBody[ValueParameterDescriptorImpl]

'getBody' @ [251:25] ==> public final fun getBody(): KtClassBody? defined in org.jetbrains.kotlin.psi.KtClassOrObject[DeserializedSimpleFunctionDescriptor]

'let' @ [251:36] ==> @InlineOnly public inline fun <T, R> KtClassBody.let(block: (KtClassBody) -> MutableList<IrDeclaration>): MutableList<IrDeclaration> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtClassBody
    <R> -> MutableList<IrDeclaration>

'ktClassBody' @ [252:13] ==> value-parameter ktClassBody: KtClassBody defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator.generateMembersDeclaredInClassBody.<anonymous>[ValueParameterDescriptorImpl]

'declarations' @ [252:25] ==> public final val KtClassBody.declarations: (MutableList<(KtDeclaration..KtDeclaration?)>..List<(KtDeclaration..KtDeclaration?)>?)[MyPropertyDescriptor]

'mapTo' @ [252:38] ==> public inline fun <T, R, C : MutableCollection<in IrDeclaration>> Iterable<(KtDeclaration..KtDeclaration?)>.mapTo(destination: MutableList<IrDeclaration>, transform: ((KtDeclaration..KtDeclaration?)) -> IrDeclaration): MutableList<IrDeclaration> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtDeclaration..org.jetbrains.kotlin.psi.KtDeclaration?)
    <R> -> IrDeclaration
    <C : MutableCollection<in R>> -> MutableList<IrDeclaration>

'irClass' @ [252:44] ==> value-parameter irClass: IrClass defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator.generateMembersDeclaredInClassBody[ValueParameterDescriptorImpl]

'declarations' @ [252:52] ==> public abstract val declarations: MutableList<IrDeclaration> defined in org.jetbrains.kotlin.ir.declarations.IrClass[DeserializedPropertyDescriptor]

'declarationGenerator' @ [253:17] ==> public final val declarationGenerator: DeclarationGenerator defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator[PropertyDescriptorImpl]

'generateClassMemberDeclaration' @ [253:38] ==> public final fun generateClassMemberDeclaration(ktDeclaration: KtDeclaration, classDescriptor: ClassDescriptor): IrDeclaration defined in org.jetbrains.kotlin.psi2ir.generators.DeclarationGenerator[SimpleFunctionDescriptorImpl]

'ktDeclaration' @ [253:69] ==> value-parameter ktDeclaration: (KtDeclaration..KtDeclaration?) defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator.generateMembersDeclaredInClassBody.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'irClass' @ [253:84] ==> value-parameter irClass: IrClass defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator.generateMembersDeclaredInClassBody[ValueParameterDescriptorImpl]

'descriptor' @ [253:92] ==> public abstract val descriptor: ClassDescriptor defined in org.jetbrains.kotlin.ir.declarations.IrClass[DeserializedPropertyDescriptor]

'getOrFail' @ [259:35] ==> public fun <K, V : Any> Generator.getOrFail(slice: ReadOnlySlice<(PsiElement..PsiElement?), (ClassDescriptor..ClassDescriptor?)>, key: (PsiElement..PsiElement?)): (ClassDescriptor..ClassDescriptor?) defined in org.jetbrains.kotlin.psi2ir.generators[SimpleFunctionDescriptorImpl]
Inferred types:
    <K> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)
    <V : Any> -> (org.jetbrains.kotlin.descriptors.ClassDescriptor..org.jetbrains.kotlin.descriptors.ClassDescriptor?)

'CLASS' @ [259:60] ==> public final val CLASS: (WritableSlice<(PsiElement..PsiElement?), (ClassDescriptor..ClassDescriptor?)>..WritableSlice<(PsiElement..PsiElement?), (ClassDescriptor..ClassDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'ktEnumEntry' @ [259:67] ==> value-parameter ktEnumEntry: KtEnumEntry defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator.generateEnumEntry[ValueParameterDescriptorImpl]

'context' @ [260:16] ==> public open val context: GeneratorContext defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator[PropertyDescriptorImpl]

'symbolTable' @ [260:24] ==> public final val symbolTable: SymbolTable defined in org.jetbrains.kotlin.psi2ir.generators.GeneratorContext[PropertyDescriptorImpl]

'declareEnumEntry' @ [260:36] ==> public final fun declareEnumEntry(startOffset: Int, endOffset: Int, origin: IrDeclarationOrigin, descriptor: ClassDescriptor): IrEnumEntry defined in org.jetbrains.kotlin.ir.util.SymbolTable[DeserializedSimpleFunctionDescriptor]

'ktEnumEntry' @ [261:17] ==> value-parameter ktEnumEntry: KtEnumEntry defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator.generateEnumEntry[ValueParameterDescriptorImpl]

'startOffset' @ [261:29] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'ktEnumEntry' @ [262:17] ==> value-parameter ktEnumEntry: KtEnumEntry defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator.generateEnumEntry[ValueParameterDescriptorImpl]

'endOffset' @ [262:29] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'DEFINED' @ [263:37] ==> public object DEFINED : IrDeclarationOriginImpl defined in org.jetbrains.kotlin.ir.declarations.IrDeclarationOrigin[FakeCallableDescriptorForObject]

'enumEntryDescriptor' @ [264:17] ==> val enumEntryDescriptor: (ClassDescriptor..ClassDescriptor?) defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator.generateEnumEntry[LocalVariableDescriptor]

'buildWithScope' @ [265:11] ==> public final inline fun <T : IrDeclaration> IrEnumEntry.buildWithScope(builder: (IrEnumEntry) -> Unit): IrEnumEntry defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : IrDeclaration> -> IrEnumEntry

'irEnumEntry' @ [266:13] ==> value-parameter irEnumEntry: IrEnumEntry defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator.generateEnumEntry.<anonymous>[ValueParameterDescriptorImpl]

'initializerExpression' @ [266:25] ==> public abstract var initializerExpression: IrExpression? defined in org.jetbrains.kotlin.ir.declarations.IrEnumEntry[DeserializedPropertyDescriptor]

'createBodyGenerator' @ [267:21] ==> public fun Generator.createBodyGenerator(scopeOwnerSymbol: IrSymbol): BodyGenerator defined in org.jetbrains.kotlin.psi2ir.generators[SimpleFunctionDescriptorImpl]

'irEnumEntry' @ [267:41] ==> value-parameter irEnumEntry: IrEnumEntry defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator.generateEnumEntry.<anonymous>[ValueParameterDescriptorImpl]

'symbol' @ [267:53] ==> public abstract val symbol: IrEnumEntrySymbol defined in org.jetbrains.kotlin.ir.declarations.IrEnumEntry[DeserializedPropertyDescriptor]

'generateEnumEntryInitializer' @ [268:30] ==> public final fun generateEnumEntryInitializer(ktEnumEntry: KtEnumEntry, enumEntryDescriptor: ClassDescriptor): IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator[SimpleFunctionDescriptorImpl]

'ktEnumEntry' @ [268:59] ==> value-parameter ktEnumEntry: KtEnumEntry defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator.generateEnumEntry[ValueParameterDescriptorImpl]

'enumEntryDescriptor' @ [268:72] ==> val enumEntryDescriptor: (ClassDescriptor..ClassDescriptor?) defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator.generateEnumEntry[LocalVariableDescriptor]

'ktEnumEntry' @ [270:17] ==> value-parameter ktEnumEntry: KtEnumEntry defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator.generateEnumEntry[ValueParameterDescriptorImpl]

'declarations' @ [270:29] ==> public final val KtEnumEntry.declarations: List<KtDeclaration>[MyPropertyDescriptor]

'isNotEmpty' @ [270:42] ==> @InlineOnly public inline fun <T> Collection<KtDeclaration>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtDeclaration

'irEnumEntry' @ [271:17] ==> value-parameter irEnumEntry: IrEnumEntry defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator.generateEnumEntry.<anonymous>[ValueParameterDescriptorImpl]

'correspondingClass' @ [271:29] ==> public abstract var correspondingClass: IrClass? defined in org.jetbrains.kotlin.ir.declarations.IrEnumEntry[DeserializedPropertyDescriptor]

'generateClass' @ [271:50] ==> public final fun generateClass(ktClassOrObject: KtClassOrObject): IrClass defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator[SimpleFunctionDescriptorImpl]

'ktEnumEntry' @ [271:64] ==> value-parameter ktEnumEntry: KtEnumEntry defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator.generateEnumEntry[ValueParameterDescriptorImpl]

