'dispatchReceiver' @ [64:46] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.dispatchReceiver: ReceiverValue?[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> Captured(*)

'extensionReceiver' @ [64:74] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.extensionReceiver: ReceiverValue?[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> Captured(*)

'getType' @ [67:30] ==> public open fun getType(@NotNull p0: PsiElement): (String..String?) defined in com.intellij.usageView.UsageViewUtil[JavaMethodDescriptor]

'this' @ [67:38] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.rename.renderDescription[ReceiverParameterDescriptorImpl]

'name' @ [68:9] ==> public final val PsiNamedElement.name: String?[MyPropertyDescriptor]

'name' @ [68:25] ==> public final val PsiNamedElement.name: String?[MyPropertyDescriptor]

'startsWith' @ [68:32] ==> public fun String.startsWith(prefix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'type' @ [68:56] ==> val type: (String..String?) defined in org.jetbrains.kotlin.idea.refactoring.rename.renderDescription[LocalVariableDescriptor]

'type' @ [69:14] ==> val type: (String..String?) defined in org.jetbrains.kotlin.idea.refactoring.rename.renderDescription[LocalVariableDescriptor]

'name' @ [69:21] ==> public final val PsiNamedElement.name: String?[MyPropertyDescriptor]

'trim' @ [69:28] ==> @InlineOnly public inline fun String.trim(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'when (this) {
            is KtDeclaration -> containingClassOrObject
                                ?: getStrictParentOfType<KtNamedDeclaration>()
                                ?: JavaPsiFacade.getInstance(project).findPackage(containingKtFile.packageFqName.asString())
            is PsiMember -> containingClass
            else -> null
        }' @ [73:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: PsiNamedElement?, entry1: PsiNamedElement?, entry2: PsiNamedElement?): PsiNamedElement?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> PsiNamedElement?

'this' @ [73:15] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.rename.representativeContainer[ReceiverParameterDescriptorImpl]

'containingClassOrObject' @ [74:33] ==> public val KtDeclaration.containingClassOrObject: KtClassOrObject? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'getStrictParentOfType' @ [75:36] ==> public inline fun <reified T : PsiElement> PsiElement.getStrictParentOfType(): KtNamedDeclaration? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtNamedDeclaration

'getInstance' @ [76:50] ==> public open fun getInstance(p0: (Project..Project?)): (JavaPsiFacade..JavaPsiFacade?) defined in com.intellij.psi.JavaPsiFacade[JavaMethodDescriptor]

'project' @ [76:62] ==> public final val KtDeclaration.project: Project[MyPropertyDescriptor]

'findPackage' @ [76:71] ==> @Nullable public abstract fun findPackage(@NonNls @NotNull p0: String): PsiPackage? defined in com.intellij.psi.JavaPsiFacade[JavaMethodDescriptor]

'containingKtFile' @ [76:83] ==> public final val KtDeclaration.containingKtFile: KtFile[MyPropertyDescriptor]

'packageFqName' @ [76:100] ==> public final val KtFile.packageFqName: FqName[MyPropertyDescriptor]

'asString' @ [76:114] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'containingClass' @ [77:29] ==> public final val PsiMember.containingClass: PsiClass?[MyPropertyDescriptor]

'DescriptorRenderer' @ [81:64] ==> public companion object defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[FakeCallableDescriptorForObject]

'FQ_NAMES_IN_TYPES' @ [81:83] ==> @field:JvmField public final val FQ_NAMES_IN_TYPES: DescriptorRenderer defined in org.jetbrains.kotlin.renderer.DescriptorRenderer.Companion[DeserializedPropertyDescriptor]

'render' @ [81:101] ==> public abstract fun render(declarationDescriptor: DeclarationDescriptor): String defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[DeserializedSimpleFunctionDescriptor]

'this' @ [81:108] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.rename.canonicalRender[ReceiverParameterDescriptorImpl]

'this' @ [89:16] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.rename.checkRedeclarations.isTopLevelPrivate[ReceiverParameterDescriptorImpl]

'visibility' @ [90:19] ==> public final val DeclarationDescriptorWithVisibility.visibility: Visibility[MyPropertyDescriptor]

'PRIVATE' @ [90:46] ==> @NotNull public final val PRIVATE: Visibility defined in org.jetbrains.kotlin.descriptors.Visibilities[JavaPropertyDescriptor]

'containingDeclaration' @ [91:19] ==> public final val DeclarationDescriptorWithVisibility.containingDeclaration: DeclarationDescriptor?[MyPropertyDescriptor]

'==' @ [95:16] ==> public open fun equals(other: Any?): Boolean defined in com.intellij.psi.PsiFile[DeserializedSimpleFunctionDescriptor]

'd1' @ [95:17] ==> value-parameter d1: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.rename.checkRedeclarations.isInSameFile[ValueParameterDescriptorImpl]

'source' @ [95:58] ==> public final val DeclarationDescriptorWithSource.source: SourceElement[MyPropertyDescriptor]

'getPsi' @ [95:66] ==> public fun SourceElement.getPsi(): PsiElement? defined in org.jetbrains.kotlin.resolve.source[DeserializedSimpleFunctionDescriptor]

'containingFile' @ [95:76] ==> public final val PsiElement.containingFile: (PsiFile..PsiFile?)[MyPropertyDescriptor]

'd2' @ [95:95] ==> value-parameter d2: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.rename.checkRedeclarations.isInSameFile[ValueParameterDescriptorImpl]

'source' @ [95:136] ==> public final val DeclarationDescriptorWithSource.source: SourceElement[MyPropertyDescriptor]

'getPsi' @ [95:144] ==> public fun SourceElement.getPsi(): PsiElement? defined in org.jetbrains.kotlin.resolve.source[DeserializedSimpleFunctionDescriptor]

'containingFile' @ [95:154] ==> public final val PsiElement.containingFile: (PsiFile..PsiFile?)[MyPropertyDescriptor]

'when (descriptor) {
            is ClassDescriptor -> DescriptorKindFilter.CLASSIFIERS
            is PropertyDescriptor -> DescriptorKindFilter.VARIABLES
            is FunctionDescriptor -> DescriptorKindFilter.FUNCTIONS
            else -> return emptyList()
        }' @ [99:36] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: DescriptorKindFilter, entry1: DescriptorKindFilter, entry2: DescriptorKindFilter, entry3: DescriptorKindFilter): DescriptorKindFilter[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> DescriptorKindFilter

'descriptor' @ [99:42] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.rename.checkRedeclarations[ValueParameterDescriptorImpl]

'CLASSIFIERS' @ [100:56] ==> @field:JvmField public final val CLASSIFIERS: DescriptorKindFilter defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter.Companion[DeserializedPropertyDescriptor]

'VARIABLES' @ [101:59] ==> @field:JvmField public final val VARIABLES: DescriptorKindFilter defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter.Companion[DeserializedPropertyDescriptor]

'FUNCTIONS' @ [102:59] ==> @field:JvmField public final val FUNCTIONS: DescriptorKindFilter defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter.Companion[DeserializedPropertyDescriptor]

'emptyList' @ [103:28] ==> public fun <T> emptyList(): List<DeclarationDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'getDescriptorsFiltered' @ [105:16] ==> public fun MemberScope.getDescriptorsFiltered(kindFilter: DescriptorKindFilter = ..., nameFilter: (Name) -> Boolean = ...): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.resolve.scopes[DeserializedSimpleFunctionDescriptor]

'descriptorKindFilter' @ [105:39] ==> val descriptorKindFilter: DescriptorKindFilter defined in org.jetbrains.kotlin.idea.refactoring.rename.checkRedeclarations.findSiblingsByName[LocalVariableDescriptor]

'it' @ [105:63] ==> value-parameter it: Name defined in org.jetbrains.kotlin.idea.refactoring.rename.checkRedeclarations.findSiblingsByName.<anonymous>[ValueParameterDescriptorImpl]

'asString' @ [105:66] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'newName' @ [105:80] ==> value-parameter newName: String defined in org.jetbrains.kotlin.idea.refactoring.rename.checkRedeclarations[ValueParameterDescriptorImpl]

'filter' @ [105:90] ==> public inline fun <T> Iterable<DeclarationDescriptor>.filter(predicate: (DeclarationDescriptor) -> Boolean): List<DeclarationDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'it' @ [105:99] ==> value-parameter it: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.rename.checkRedeclarations.findSiblingsByName.<anonymous>[ValueParameterDescriptorImpl]

'descriptor' @ [105:105] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.rename.checkRedeclarations[ValueParameterDescriptorImpl]

'descriptor' @ [109:36] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.rename.checkRedeclarations[ValueParameterDescriptorImpl]

'containingDeclaration' @ [109:47] ==> public final val DeclarationDescriptor.containingDeclaration: DeclarationDescriptor?[MyPropertyDescriptor]

'descriptor' @ [111:13] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.rename.checkRedeclarations[ValueParameterDescriptorImpl]

'containingDescriptor' @ [112:21] ==> val containingDescriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.refactoring.rename.checkRedeclarations.getSiblingWithNewName[LocalVariableDescriptor]

'valueParameters' @ [112:65] ==> public final val CallableDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'firstOrNull' @ [112:81] ==> public inline fun <T> Iterable<(ValueParameterDescriptor..ValueParameterDescriptor?)>.firstOrNull(predicate: ((ValueParameterDescriptor..ValueParameterDescriptor?)) -> Boolean): ValueParameterDescriptor? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.ValueParameterDescriptor..org.jetbrains.kotlin.descriptors.ValueParameterDescriptor?)

'it' @ [112:95] ==> value-parameter it: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.idea.refactoring.rename.checkRedeclarations.getSiblingWithNewName.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [112:98] ==> public final val ValueParameterDescriptor.name: Name[MyPropertyDescriptor]

'asString' @ [112:103] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'newName' @ [112:117] ==> value-parameter newName: String defined in org.jetbrains.kotlin.idea.refactoring.rename.checkRedeclarations[ValueParameterDescriptorImpl]

'descriptor' @ [115:13] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.rename.checkRedeclarations[ValueParameterDescriptorImpl]

'when (containingDescriptor) {
                is ClassDescriptor -> containingDescriptor.declaredTypeParameters
                is CallableDescriptor -> containingDescriptor.typeParameters
                else -> emptyList()
            }' @ [116:34] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: List<(TypeParameterDescriptor..TypeParameterDescriptor?)>, entry1: List<(TypeParameterDescriptor..TypeParameterDescriptor?)>, entry2: List<(TypeParameterDescriptor..TypeParameterDescriptor?)>): List<(TypeParameterDescriptor..TypeParameterDescriptor?)>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> List<(org.jetbrains.kotlin.descriptors.TypeParameterDescriptor..org.jetbrains.kotlin.descriptors.TypeParameterDescriptor?)>

'containingDescriptor' @ [116:40] ==> val containingDescriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.refactoring.rename.checkRedeclarations.getSiblingWithNewName[LocalVariableDescriptor]

'containingDescriptor' @ [117:39] ==> val containingDescriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.refactoring.rename.checkRedeclarations.getSiblingWithNewName[LocalVariableDescriptor]

'declaredTypeParameters' @ [117:60] ==> public final val ClassDescriptor.declaredTypeParameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)>[MyPropertyDescriptor]

'containingDescriptor' @ [118:42] ==> val containingDescriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.refactoring.rename.checkRedeclarations.getSiblingWithNewName[LocalVariableDescriptor]

'typeParameters' @ [118:63] ==> public final val CallableDescriptor.typeParameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)>[MyPropertyDescriptor]

'emptyList' @ [119:25] ==> public fun <T> emptyList(): List<(TypeParameterDescriptor..TypeParameterDescriptor?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.TypeParameterDescriptor..org.jetbrains.kotlin.descriptors.TypeParameterDescriptor?)

'typeParameters' @ [121:13] ==> val typeParameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)> defined in org.jetbrains.kotlin.idea.refactoring.rename.checkRedeclarations.getSiblingWithNewName[LocalVariableDescriptor]

'firstOrNull' @ [121:28] ==> public inline fun <T> Iterable<(TypeParameterDescriptor..TypeParameterDescriptor?)>.firstOrNull(predicate: ((TypeParameterDescriptor..TypeParameterDescriptor?)) -> Boolean): TypeParameterDescriptor? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.TypeParameterDescriptor..org.jetbrains.kotlin.descriptors.TypeParameterDescriptor?)

'it' @ [121:42] ==> value-parameter it: (TypeParameterDescriptor..TypeParameterDescriptor?) defined in org.jetbrains.kotlin.idea.refactoring.rename.checkRedeclarations.getSiblingWithNewName.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [121:45] ==> public final val TypeParameterDescriptor.name: Name[MyPropertyDescriptor]

'asString' @ [121:50] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'newName' @ [121:64] ==> value-parameter newName: String defined in org.jetbrains.kotlin.idea.refactoring.rename.checkRedeclarations[ValueParameterDescriptorImpl]

'let' @ [121:75] ==> @InlineOnly public inline fun <T, R> TypeParameterDescriptor.let(block: (TypeParameterDescriptor) -> Nothing): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeParameterDescriptor
    <R> -> Nothing

'it' @ [121:88] ==> value-parameter it: TypeParameterDescriptor defined in org.jetbrains.kotlin.idea.refactoring.rename.checkRedeclarations.getSiblingWithNewName.<anonymous>[ValueParameterDescriptorImpl]

'?:' @ [123:41] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: KtDeclaration?, right: KtDeclaration): KtDeclaration[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> KtDeclaration

'containingDescriptor' @ [123:42] ==> val containingDescriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.refactoring.rename.checkRedeclarations.getSiblingWithNewName[LocalVariableDescriptor]

'source' @ [123:101] ==> public final val DeclarationDescriptorWithSource.source: SourceElement[MyPropertyDescriptor]

'getPsi' @ [123:109] ==> public fun SourceElement.getPsi(): PsiElement? defined in org.jetbrains.kotlin.resolve.source[DeserializedSimpleFunctionDescriptor]

'KtPsiFactory' @ [125:28] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'containingDeclaration' @ [125:41] ==> val containingDeclaration: KtDeclaration defined in org.jetbrains.kotlin.idea.refactoring.rename.checkRedeclarations.getSiblingWithNewName[LocalVariableDescriptor]

'createProperty' @ [125:64] ==> public final fun createProperty(text: String): KtProperty defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'newName' @ [125:90] ==> value-parameter newName: String defined in org.jetbrains.kotlin.idea.refactoring.rename.checkRedeclarations[ValueParameterDescriptorImpl]

'containingDeclaration' @ [126:30] ==> val containingDeclaration: KtDeclaration defined in org.jetbrains.kotlin.idea.refactoring.rename.checkRedeclarations.getSiblingWithNewName[LocalVariableDescriptor]

'getResolutionScope' @ [126:52] ==> public fun KtElement.getResolutionScope(): LexicalScope defined in org.jetbrains.kotlin.idea.util[DeserializedSimpleFunctionDescriptor]

'dummyVar' @ [127:27] ==> val dummyVar: KtProperty defined in org.jetbrains.kotlin.idea.refactoring.rename.checkRedeclarations.getSiblingWithNewName[LocalVariableDescriptor]

'analyzeInContext' @ [127:36] ==> @JvmOverloads public fun KtExpression.analyzeInContext(scope: LexicalScope, contextExpression: KtExpression = ..., trace: BindingTrace = ..., dataFlowInfo: DataFlowInfo = ..., expectedType: KotlinType = ..., isStatement: Boolean = ..., contextDependency: ContextDependency = ..., expressionTypingServices: ExpressionTypingServices = ...): BindingContext defined in org.jetbrains.kotlin.idea.analysis[DeserializedSimpleFunctionDescriptor]

'outerScope' @ [127:53] ==> val outerScope: LexicalScope defined in org.jetbrains.kotlin.idea.refactoring.rename.checkRedeclarations.getSiblingWithNewName[LocalVariableDescriptor]

'containingDeclaration' @ [127:65] ==> val containingDeclaration: KtDeclaration defined in org.jetbrains.kotlin.idea.refactoring.rename.checkRedeclarations.getSiblingWithNewName[LocalVariableDescriptor]

'context' @ [128:20] ==> val context: BindingContext defined in org.jetbrains.kotlin.idea.refactoring.rename.checkRedeclarations.getSiblingWithNewName[LocalVariableDescriptor]

'VARIABLE' @ [128:43] ==> public final val VARIABLE: (WritableSlice<(PsiElement..PsiElement?), (VariableDescriptor..VariableDescriptor?)>..WritableSlice<(PsiElement..PsiElement?), (VariableDescriptor..VariableDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'dummyVar' @ [128:53] ==> val dummyVar: KtProperty defined in org.jetbrains.kotlin.idea.refactoring.rename.checkRedeclarations.getSiblingWithNewName[LocalVariableDescriptor]

'type' @ [128:64] ==> public final val VariableDescriptor.type: KotlinType[MyPropertyDescriptor]

'constructor' @ [128:70] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'declarationDescriptor' @ [128:83] ==> public final val TypeConstructor.declarationDescriptor: ClassifierDescriptor?[MyPropertyDescriptor]

'when (containingDescriptor) {
            is ClassDescriptor -> containingDescriptor.unsubstitutedMemberScope.findSiblingsByName().firstOrNull()
            is PackageFragmentDescriptor -> containingDescriptor.getMemberScope().findSiblingsByName().firstOrNull {
                it != descriptor
                && (!(descriptor.isTopLevelPrivate() || it.isTopLevelPrivate()) || isInSameFile(descriptor, it))
            }
            else -> {
                val block = (descriptor as? DeclarationDescriptorWithSource)?.source?.getPsi()?.parent as? KtBlockExpression
                            ?: return null
                (block.statements.firstOrNull {
                    if (it.name != newName) return@firstOrNull false
                    when (descriptor) {
                        is ClassDescriptor -> it is KtClassOrObject
                        is PropertyDescriptor -> it is KtProperty
                        is FunctionDescriptor -> it is KtNamedFunction
                        else -> false
                    }
                } as? KtDeclaration)?.resolveToDescriptor()
            }
        }' @ [131:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: DeclarationDescriptor?, entry1: DeclarationDescriptor?, entry2: DeclarationDescriptor?): DeclarationDescriptor?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> DeclarationDescriptor?

'containingDescriptor' @ [131:22] ==> val containingDescriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.refactoring.rename.checkRedeclarations.getSiblingWithNewName[LocalVariableDescriptor]

'containingDescriptor' @ [132:35] ==> val containingDescriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.refactoring.rename.checkRedeclarations.getSiblingWithNewName[LocalVariableDescriptor]

'unsubstitutedMemberScope' @ [132:56] ==> public final val ClassDescriptor.unsubstitutedMemberScope: MemberScope[MyPropertyDescriptor]

'findSiblingsByName' @ [132:81] ==> local final fun MemberScope.findSiblingsByName(): List<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.refactoring.rename.checkRedeclarations[SimpleFunctionDescriptorImpl]

'firstOrNull' @ [132:102] ==> public fun <T> List<DeclarationDescriptor>.firstOrNull(): DeclarationDescriptor? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'containingDescriptor' @ [133:45] ==> val containingDescriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.refactoring.rename.checkRedeclarations.getSiblingWithNewName[LocalVariableDescriptor]

'getMemberScope' @ [133:66] ==> public abstract fun getMemberScope(): MemberScope defined in org.jetbrains.kotlin.descriptors.PackageFragmentDescriptor[DeserializedSimpleFunctionDescriptor]

'findSiblingsByName' @ [133:83] ==> local final fun MemberScope.findSiblingsByName(): List<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.refactoring.rename.checkRedeclarations[SimpleFunctionDescriptorImpl]

'firstOrNull' @ [133:104] ==> public inline fun <T> Iterable<DeclarationDescriptor>.firstOrNull(predicate: (DeclarationDescriptor) -> Boolean): DeclarationDescriptor? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'it' @ [134:17] ==> value-parameter it: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.rename.checkRedeclarations.getSiblingWithNewName.<anonymous>[ValueParameterDescriptorImpl]

'descriptor' @ [134:23] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.rename.checkRedeclarations[ValueParameterDescriptorImpl]

'!' @ [135:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [135:23] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.rename.checkRedeclarations[ValueParameterDescriptorImpl]

'isTopLevelPrivate' @ [135:34] ==> local final fun DeclarationDescriptor.isTopLevelPrivate(): Boolean defined in org.jetbrains.kotlin.idea.refactoring.rename.checkRedeclarations[SimpleFunctionDescriptorImpl]

'it' @ [135:57] ==> value-parameter it: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.rename.checkRedeclarations.getSiblingWithNewName.<anonymous>[ValueParameterDescriptorImpl]

'isTopLevelPrivate' @ [135:60] ==> local final fun DeclarationDescriptor.isTopLevelPrivate(): Boolean defined in org.jetbrains.kotlin.idea.refactoring.rename.checkRedeclarations[SimpleFunctionDescriptorImpl]

'isInSameFile' @ [135:84] ==> local final fun isInSameFile(d1: DeclarationDescriptor, d2: DeclarationDescriptor): Boolean defined in org.jetbrains.kotlin.idea.refactoring.rename.checkRedeclarations[SimpleFunctionDescriptorImpl]

'descriptor' @ [135:97] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.rename.checkRedeclarations[ValueParameterDescriptorImpl]

'it' @ [135:109] ==> value-parameter it: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.rename.checkRedeclarations.getSiblingWithNewName.<anonymous>[ValueParameterDescriptorImpl]

'?:' @ [138:29] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: KtBlockExpression?, right: KtBlockExpression): KtBlockExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> KtBlockExpression

'descriptor' @ [138:30] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.rename.checkRedeclarations[ValueParameterDescriptorImpl]

'source' @ [138:79] ==> public final val DeclarationDescriptorWithSource.source: SourceElement[MyPropertyDescriptor]

'getPsi' @ [138:87] ==> public fun SourceElement.getPsi(): PsiElement? defined in org.jetbrains.kotlin.resolve.source[DeserializedSimpleFunctionDescriptor]

'parent' @ [138:97] ==> public final val PsiElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'block' @ [140:18] ==> val block: KtBlockExpression defined in org.jetbrains.kotlin.idea.refactoring.rename.checkRedeclarations.getSiblingWithNewName[LocalVariableDescriptor]

'statements' @ [140:24] ==> public final val KtBlockExpression.statements: List<(KtExpression..KtExpression?)>[MyPropertyDescriptor]

'firstOrNull' @ [140:35] ==> public inline fun <T> Iterable<(KtExpression..KtExpression?)>.firstOrNull(predicate: ((KtExpression..KtExpression?)) -> Boolean): KtExpression? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtExpression..org.jetbrains.kotlin.psi.KtExpression?)

'it' @ [141:25] ==> value-parameter it: (KtExpression..KtExpression?) defined in org.jetbrains.kotlin.idea.refactoring.rename.checkRedeclarations.getSiblingWithNewName.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [141:28] ==> public final val KtExpression.name: String?[MyPropertyDescriptor]

'newName' @ [141:36] ==> value-parameter newName: String defined in org.jetbrains.kotlin.idea.refactoring.rename.checkRedeclarations[ValueParameterDescriptorImpl]

'when (descriptor) {
                        is ClassDescriptor -> it is KtClassOrObject
                        is PropertyDescriptor -> it is KtProperty
                        is FunctionDescriptor -> it is KtNamedFunction
                        else -> false
                    }' @ [142:21] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean, entry2: Boolean, entry3: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'descriptor' @ [142:27] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.rename.checkRedeclarations[ValueParameterDescriptorImpl]

'it' @ [143:47] ==> value-parameter it: (KtExpression..KtExpression?) defined in org.jetbrains.kotlin.idea.refactoring.rename.checkRedeclarations.getSiblingWithNewName.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [144:50] ==> value-parameter it: (KtExpression..KtExpression?) defined in org.jetbrains.kotlin.idea.refactoring.rename.checkRedeclarations.getSiblingWithNewName.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [145:50] ==> value-parameter it: (KtExpression..KtExpression?) defined in org.jetbrains.kotlin.idea.refactoring.rename.checkRedeclarations.getSiblingWithNewName.<anonymous>[ValueParameterDescriptorImpl]

'resolveToDescriptor' @ [148:39] ==> public fun KtDeclaration.resolveToDescriptor(bodyResolveMode: BodyResolveMode = ...): DeclarationDescriptor defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'getSiblingWithNewName' @ [153:31] ==> local final fun getSiblingWithNewName(): DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.refactoring.rename.checkRedeclarations[SimpleFunctionDescriptorImpl]

'?:' @ [154:21] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: KtNamedDeclaration?, right: KtNamedDeclaration): KtNamedDeclaration[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> KtNamedDeclaration

'candidateDescriptor' @ [154:22] ==> val candidateDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.rename.checkRedeclarations[LocalVariableDescriptor]

'source' @ [154:80] ==> public final val DeclarationDescriptorWithSource.source: SourceElement[MyPropertyDescriptor]

'getPsi' @ [154:88] ==> public fun SourceElement.getPsi(): PsiElement? defined in org.jetbrains.kotlin.resolve.source[DeserializedSimpleFunctionDescriptor]

'candidate' @ [155:16] ==> val candidate: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.rename.checkRedeclarations[LocalVariableDescriptor]

'renderDescription' @ [155:26] ==> internal fun PsiNamedElement.renderDescription(): String defined in org.jetbrains.kotlin.idea.refactoring.rename in file renameConflictUtils.kt[SimpleFunctionDescriptorImpl]

'capitalize' @ [155:46] ==> public fun String.capitalize(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'candidate' @ [156:17] ==> val candidate: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.rename.checkRedeclarations[LocalVariableDescriptor]

'representativeContainer' @ [156:27] ==> internal fun PsiElement.representativeContainer(): PsiNamedElement? defined in org.jetbrains.kotlin.idea.refactoring.rename in file renameConflictUtils.kt[SimpleFunctionDescriptorImpl]

'renderDescription' @ [156:54] ==> internal fun PsiNamedElement.renderDescription(): String defined in org.jetbrains.kotlin.idea.refactoring.rename in file renameConflictUtils.kt[SimpleFunctionDescriptorImpl]

'what' @ [157:21] ==> val what: String defined in org.jetbrains.kotlin.idea.refactoring.rename.checkRedeclarations[LocalVariableDescriptor]

'where' @ [157:50] ==> val where: String defined in org.jetbrains.kotlin.idea.refactoring.rename.checkRedeclarations[LocalVariableDescriptor]

'result' @ [158:5] ==> value-parameter result: MutableList<UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.rename.checkRedeclarations[ValueParameterDescriptorImpl]

'BasicUnresolvableCollisionUsageInfo' @ [158:15] ==> public constructor BasicUnresolvableCollisionUsageInfo(element: PsiElement, referencedElement: PsiElement, _description: String) defined in org.jetbrains.kotlin.idea.refactoring.rename.BasicUnresolvableCollisionUsageInfo[ClassConstructorDescriptorImpl]

'candidate' @ [158:51] ==> val candidate: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.rename.checkRedeclarations[LocalVariableDescriptor]

'candidate' @ [158:62] ==> val candidate: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.rename.checkRedeclarations[LocalVariableDescriptor]

'message' @ [158:73] ==> val message: String defined in org.jetbrains.kotlin.idea.refactoring.rename.checkRedeclarations[LocalVariableDescriptor]

'identifier' @ [165:27] ==> @NotNull public open fun identifier(@NotNull p0: String): Name defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'name' @ [165:38] ==> value-parameter name: String defined in org.jetbrains.kotlin.idea.refactoring.rename.getRelevantDescriptors[ValueParameterDescriptorImpl]

'when (declaration) {
        is KtProperty, is KtParameter, is PsiField -> getAllAccessibleVariables(nameAsName)
        is KtClassOrObject, is PsiClass -> listOfNotNull(findClassifier(nameAsName, NoLookupLocation.FROM_IDE))
        else -> emptyList()
    }' @ [166:12] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Collection<DeclarationDescriptor>, entry1: Collection<DeclarationDescriptor>, entry2: Collection<DeclarationDescriptor>): Collection<DeclarationDescriptor>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Collection<DeclarationDescriptor>

'declaration' @ [166:18] ==> value-parameter declaration: PsiNamedElement defined in org.jetbrains.kotlin.idea.refactoring.rename.getRelevantDescriptors[ValueParameterDescriptorImpl]

'getAllAccessibleVariables' @ [167:55] ==> public fun LexicalScope.getAllAccessibleVariables(name: Name): Collection<VariableDescriptor> defined in org.jetbrains.kotlin.idea.util[DeserializedSimpleFunctionDescriptor]

'nameAsName' @ [167:81] ==> val nameAsName: Name defined in org.jetbrains.kotlin.idea.refactoring.rename.getRelevantDescriptors[LocalVariableDescriptor]

'listOfNotNull' @ [168:44] ==> public fun <T : Any> listOfNotNull(element: ClassifierDescriptor?): List<ClassifierDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> ClassifierDescriptor

'findClassifier' @ [168:58] ==> public fun HierarchicalScope.findClassifier(name: Name, location: LookupLocation): ClassifierDescriptor? defined in org.jetbrains.kotlin.resolve.scopes.utils[DeserializedSimpleFunctionDescriptor]

'nameAsName' @ [168:73] ==> val nameAsName: Name defined in org.jetbrains.kotlin.idea.refactoring.rename.getRelevantDescriptors[LocalVariableDescriptor]

'FROM_IDE' @ [168:102] ==> enum entry FROM_IDE defined in org.jetbrains.kotlin.incremental.components.NoLookupLocation[FakeCallableDescriptorForObject]

'emptyList' @ [169:17] ==> public fun <T> emptyList(): List<DeclarationDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'DescriptorToSourceUtilsIde' @ [180:21] ==> public object DescriptorToSourceUtilsIde defined in org.jetbrains.kotlin.idea.codeInsight[FakeCallableDescriptorForObject]

'getAnyDeclaration' @ [180:48] ==> public final fun getAnyDeclaration(project: Project, descriptor: DeclarationDescriptor): PsiElement? defined in org.jetbrains.kotlin.idea.codeInsight.DescriptorToSourceUtilsIde[DeserializedSimpleFunctionDescriptor]

'declaration' @ [180:66] ==> value-parameter declaration: PsiNamedElement defined in org.jetbrains.kotlin.idea.refactoring.rename.reportShadowing[ValueParameterDescriptorImpl]

'project' @ [180:78] ==> public final val PsiNamedElement.project: Project[MyPropertyDescriptor]

'candidateDescriptor' @ [180:87] ==> value-parameter candidateDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.rename.reportShadowing[ValueParameterDescriptorImpl]

'declaration' @ [181:9] ==> value-parameter declaration: PsiNamedElement defined in org.jetbrains.kotlin.idea.refactoring.rename.reportShadowing[ValueParameterDescriptorImpl]

'parent' @ [181:21] ==> public final val PsiNamedElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'candidate' @ [181:31] ==> val candidate: PsiNamedElement defined in org.jetbrains.kotlin.idea.refactoring.rename.reportShadowing[LocalVariableDescriptor]

'parent' @ [181:41] ==> public final val PsiNamedElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'declaration' @ [182:22] ==> value-parameter declaration: PsiNamedElement defined in org.jetbrains.kotlin.idea.refactoring.rename.reportShadowing[ValueParameterDescriptorImpl]

'renderDescription' @ [182:34] ==> internal fun PsiNamedElement.renderDescription(): String defined in org.jetbrains.kotlin.idea.refactoring.rename in file renameConflictUtils.kt[SimpleFunctionDescriptorImpl]

'capitalize' @ [182:54] ==> public fun String.capitalize(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'candidate' @ [182:90] ==> val candidate: PsiNamedElement defined in org.jetbrains.kotlin.idea.refactoring.rename.reportShadowing[LocalVariableDescriptor]

'renderDescription' @ [182:100] ==> internal fun PsiNamedElement.renderDescription(): String defined in org.jetbrains.kotlin.idea.refactoring.rename in file renameConflictUtils.kt[SimpleFunctionDescriptorImpl]

'result' @ [183:5] ==> value-parameter result: MutableList<UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.rename.reportShadowing[ValueParameterDescriptorImpl]

'BasicUnresolvableCollisionUsageInfo' @ [183:15] ==> public constructor BasicUnresolvableCollisionUsageInfo(element: PsiElement, referencedElement: PsiElement, _description: String) defined in org.jetbrains.kotlin.idea.refactoring.rename.BasicUnresolvableCollisionUsageInfo[ClassConstructorDescriptorImpl]

'refElement' @ [183:51] ==> value-parameter refElement: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.rename.reportShadowing[ValueParameterDescriptorImpl]

'elementToBindUsageInfoTo' @ [183:63] ==> value-parameter elementToBindUsageInfoTo: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.rename.reportShadowing[ValueParameterDescriptorImpl]

'message' @ [183:89] ==> val message: String defined in org.jetbrains.kotlin.idea.refactoring.rename.reportShadowing[LocalVariableDescriptor]

'originalUsages' @ [196:25] ==> value-parameter originalUsages: MutableList<UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.rename.checkUsagesRetargeting[ValueParameterDescriptorImpl]

'listIterator' @ [196:40] ==> public abstract fun listIterator(): MutableListIterator<UsageInfo> defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'usageIterator' @ [197:12] ==> val usageIterator: MutableListIterator<UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.rename.checkUsagesRetargeting[LocalVariableDescriptor]

'hasNext' @ [197:26] ==> public abstract fun hasNext(): Boolean defined in kotlin.collections.MutableListIterator[DeserializedSimpleFunctionDescriptor]

'usageIterator' @ [198:21] ==> val usageIterator: MutableListIterator<UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.rename.checkUsagesRetargeting[LocalVariableDescriptor]

'next' @ [198:35] ==> public abstract fun next(): UsageInfo defined in kotlin.collections.MutableListIterator[DeserializedSimpleFunctionDescriptor]

'usage' @ [199:26] ==> val usage: UsageInfo defined in org.jetbrains.kotlin.idea.refactoring.rename.checkUsagesRetargeting[LocalVariableDescriptor]

'element' @ [199:32] ==> public final val UsageInfo.element: PsiElement?[MyPropertyDescriptor]

'refElement' @ [200:23] ==> val refElement: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.refactoring.rename.checkUsagesRetargeting[LocalVariableDescriptor]

'analyze' @ [200:34] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'PARTIAL' @ [200:58] ==> enum entry PARTIAL defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'refElement' @ [201:21] ==> val refElement: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.refactoring.rename.checkUsagesRetargeting[LocalVariableDescriptor]

'parentsWithSelf' @ [202:30] ==> public val PsiElement.parentsWithSelf: Sequence<PsiElement> defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'filterIsInstance' @ [203:30] ==> public inline fun <reified R> Sequence<*>.filterIsInstance(): Sequence<KtElement> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> KtElement

'mapNotNull' @ [204:30] ==> public fun <T, R : Any> Sequence<KtElement>.mapNotNull(transform: (KtElement) -> LexicalScope?): Sequence<LexicalScope> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtElement
    <R : Any> -> LexicalScope

'context' @ [204:43] ==> val context: BindingContext defined in org.jetbrains.kotlin.idea.refactoring.rename.checkUsagesRetargeting[LocalVariableDescriptor]

'LEXICAL_SCOPE' @ [204:66] ==> public final val LEXICAL_SCOPE: (WritableSlice<(KtElement..KtElement?), (LexicalScope..LexicalScope?)>..WritableSlice<(KtElement..KtElement?), (LexicalScope..LexicalScope?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'it' @ [204:81] ==> value-parameter it: KtElement defined in org.jetbrains.kotlin.idea.refactoring.rename.checkUsagesRetargeting.<anonymous>[ValueParameterDescriptorImpl]

'firstOrNull' @ [205:30] ==> public fun <T> Sequence<LexicalScope>.firstOrNull(): LexicalScope? defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> LexicalScope

'scope' @ [208:13] ==> val scope: LexicalScope defined in org.jetbrains.kotlin.idea.refactoring.rename.checkUsagesRetargeting[LocalVariableDescriptor]

'getRelevantDescriptors' @ [208:19] ==> private fun LexicalScope.getRelevantDescriptors(declaration: PsiNamedElement, name: String): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.refactoring.rename in file renameConflictUtils.kt[SimpleFunctionDescriptorImpl]

'declaration' @ [208:42] ==> value-parameter declaration: PsiNamedElement defined in org.jetbrains.kotlin.idea.refactoring.rename.checkUsagesRetargeting[ValueParameterDescriptorImpl]

'name' @ [208:55] ==> value-parameter name: String defined in org.jetbrains.kotlin.idea.refactoring.rename.checkUsagesRetargeting[ValueParameterDescriptorImpl]

'isEmpty' @ [208:61] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.Collection[DeserializedSimpleFunctionDescriptor]

'declaration' @ [209:17] ==> value-parameter declaration: PsiNamedElement defined in org.jetbrains.kotlin.idea.refactoring.rename.checkUsagesRetargeting[ValueParameterDescriptorImpl]

'declaration' @ [209:47] ==> value-parameter declaration: PsiNamedElement defined in org.jetbrains.kotlin.idea.refactoring.rename.checkUsagesRetargeting[ValueParameterDescriptorImpl]

'NewDeclarationNameValidator' @ [210:17] ==> public constructor NewDeclarationNameValidator(container: PsiElement, anchor: PsiElement?, target: NewDeclarationNameValidator.Target, excludedDeclarations: List<KtDeclaration> = ...) defined in org.jetbrains.kotlin.idea.core.NewDeclarationNameValidator[DeserializedClassConstructorDescriptor]

'refElement' @ [210:45] ==> val refElement: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.refactoring.rename.checkUsagesRetargeting[LocalVariableDescriptor]

'parent' @ [210:56] ==> public final val KtSimpleNameExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'refElement' @ [210:64] ==> val refElement: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.refactoring.rename.checkUsagesRetargeting[LocalVariableDescriptor]

'VARIABLES' @ [210:111] ==> enum entry VARIABLES defined in org.jetbrains.kotlin.idea.core.NewDeclarationNameValidator.Target[FakeCallableDescriptorForObject]

'name' @ [210:122] ==> value-parameter name: String defined in org.jetbrains.kotlin.idea.refactoring.rename.checkUsagesRetargeting[ValueParameterDescriptorImpl]

'KtPsiFactory' @ [213:26] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'declaration' @ [213:39] ==> value-parameter declaration: PsiNamedElement defined in org.jetbrains.kotlin.idea.refactoring.rename.checkUsagesRetargeting[ValueParameterDescriptorImpl]

'refElement' @ [215:28] ==> val refElement: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.refactoring.rename.checkUsagesRetargeting[LocalVariableDescriptor]

'getResolvedCall' @ [215:39] ==> public fun KtElement?.getResolvedCall(context: BindingContext): ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.resolve.calls.callUtil[DeserializedSimpleFunctionDescriptor]

'context' @ [215:55] ==> val context: BindingContext defined in org.jetbrains.kotlin.idea.refactoring.rename.checkUsagesRetargeting[LocalVariableDescriptor]

'resolvedCall' @ [216:13] ==> val resolvedCall: ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.idea.refactoring.rename.checkUsagesRetargeting[LocalVariableDescriptor]

'refElement' @ [217:33] ==> val refElement: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.refactoring.rename.checkUsagesRetargeting[LocalVariableDescriptor]

'getStrictParentOfType' @ [217:44] ==> public inline fun <reified T : PsiElement> PsiElement.getStrictParentOfType(): KtTypeReference? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtTypeReference

'context' @ [218:35] ==> val context: BindingContext defined in org.jetbrains.kotlin.idea.refactoring.rename.checkUsagesRetargeting[LocalVariableDescriptor]

'TYPE' @ [218:58] ==> public final val TYPE: (WritableSlice<(KtTypeReference..KtTypeReference?), (KotlinType..KotlinType?)>..WritableSlice<(KtTypeReference..KtTypeReference?), (KotlinType..KotlinType?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'typeReference' @ [218:64] ==> val typeReference: KtTypeReference defined in org.jetbrains.kotlin.idea.refactoring.rename.checkUsagesRetargeting[LocalVariableDescriptor]

'constructor' @ [218:80] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'declarationDescriptor' @ [218:93] ==> public final val TypeConstructor.declarationDescriptor: ClassifierDescriptor?[MyPropertyDescriptor]

'FqName' @ [219:41] ==> public constructor FqName(@NotNull p0: String) defined in org.jetbrains.kotlin.name.FqName[JavaClassConstructorDescriptor]

'SOURCE_CODE' @ [219:71] ==> @field:JvmField public final val SOURCE_CODE: DescriptorRenderer defined in org.jetbrains.kotlin.idea.util.IdeDescriptorRenderers[DeserializedPropertyDescriptor]

'renderClassifierName' @ [219:83] ==> public abstract fun renderClassifierName(klass: ClassifierDescriptor): String defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[DeserializedSimpleFunctionDescriptor]

'referencedClass' @ [219:104] ==> val referencedClass: ClassifierDescriptor defined in org.jetbrains.kotlin.idea.refactoring.rename.checkUsagesRetargeting[LocalVariableDescriptor]

'if (isNewName) referencedClassFqName.parent().child(Name.identifier(name)) else referencedClassFqName' @ [220:29] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: FqName, elseBranch: FqName): FqName[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> FqName

'isNewName' @ [220:33] ==> value-parameter isNewName: Boolean defined in org.jetbrains.kotlin.idea.refactoring.rename.checkUsagesRetargeting[ValueParameterDescriptorImpl]

'referencedClassFqName' @ [220:44] ==> val referencedClassFqName: FqName defined in org.jetbrains.kotlin.idea.refactoring.rename.checkUsagesRetargeting[LocalVariableDescriptor]

'parent' @ [220:66] ==> @NotNull public open fun parent(): FqName defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'child' @ [220:75] ==> @NotNull public open fun child(@NotNull p0: Name): FqName defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'identifier' @ [220:86] ==> @NotNull public open fun identifier(@NotNull p0: String): Name defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'name' @ [220:97] ==> value-parameter name: String defined in org.jetbrains.kotlin.idea.refactoring.rename.checkUsagesRetargeting[ValueParameterDescriptorImpl]

'referencedClassFqName' @ [220:109] ==> val referencedClassFqName: FqName defined in org.jetbrains.kotlin.idea.refactoring.rename.checkUsagesRetargeting[LocalVariableDescriptor]

'psiFactory' @ [221:27] ==> val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.refactoring.rename.checkUsagesRetargeting[LocalVariableDescriptor]

'createDeclaration' @ [221:38] ==> public final fun <TDeclaration : KtDeclaration> createDeclaration(text: String): KtProperty defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <TDeclaration : KtDeclaration> -> KtProperty

'newFqName' @ [221:84] ==> val newFqName: FqName defined in org.jetbrains.kotlin.idea.refactoring.rename.checkUsagesRetargeting[LocalVariableDescriptor]

'asString' @ [221:94] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'fakeVar' @ [222:30] ==> val fakeVar: KtProperty defined in org.jetbrains.kotlin.idea.refactoring.rename.checkUsagesRetargeting[LocalVariableDescriptor]

'analyzeInContext' @ [222:38] ==> @JvmOverloads public fun KtExpression.analyzeInContext(scope: LexicalScope, contextExpression: KtExpression = ..., trace: BindingTrace = ..., dataFlowInfo: DataFlowInfo = ..., expectedType: KotlinType = ..., isStatement: Boolean = ..., contextDependency: ContextDependency = ..., expressionTypingServices: ExpressionTypingServices = ...): BindingContext defined in org.jetbrains.kotlin.idea.analysis[DeserializedSimpleFunctionDescriptor]

'scope' @ [222:55] ==> val scope: LexicalScope defined in org.jetbrains.kotlin.idea.refactoring.rename.checkUsagesRetargeting[LocalVariableDescriptor]

'refElement' @ [222:62] ==> val refElement: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.refactoring.rename.checkUsagesRetargeting[LocalVariableDescriptor]

'newContext' @ [223:47] ==> val newContext: BindingContext defined in org.jetbrains.kotlin.idea.refactoring.rename.checkUsagesRetargeting[LocalVariableDescriptor]

'TYPE' @ [223:73] ==> public final val TYPE: (WritableSlice<(KtTypeReference..KtTypeReference?), (KotlinType..KotlinType?)>..WritableSlice<(KtTypeReference..KtTypeReference?), (KotlinType..KotlinType?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'fakeVar' @ [223:79] ==> val fakeVar: KtProperty defined in org.jetbrains.kotlin.idea.refactoring.rename.checkUsagesRetargeting[LocalVariableDescriptor]

'typeReference' @ [223:87] ==> public final var KtProperty.typeReference: KtTypeReference?[MyPropertyDescriptor]

'constructor' @ [223:105] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'declarationDescriptor' @ [223:118] ==> public final val TypeConstructor.declarationDescriptor: ClassifierDescriptor?[MyPropertyDescriptor]

'referencedClassInNewContext' @ [224:33] ==> val referencedClassInNewContext: ClassifierDescriptor? defined in org.jetbrains.kotlin.idea.refactoring.rename.checkUsagesRetargeting[LocalVariableDescriptor]

'canonicalRender' @ [224:62] ==> internal fun DeclarationDescriptor.canonicalRender(): String defined in org.jetbrains.kotlin.idea.refactoring.rename in file renameConflictUtils.kt[SimpleFunctionDescriptorImpl]

'if (referencedClassInNewContext == null
                || ErrorUtils.isError(referencedClassInNewContext)
                || referencedClass.canonicalRender() == candidateText
                || accessibleDescriptors.any { it.canonicalRender() == candidateText }) {
                usageIterator.set(UsageInfoWithFqNameReplacement(refElement, declaration, newFqName))
            }
            else {
                reportShadowing(declaration, elementToBindUsageInfosTo, referencedClassInNewContext, refElement, newUsages)
            }' @ [225:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'referencedClassInNewContext' @ [225:17] ==> val referencedClassInNewContext: ClassifierDescriptor? defined in org.jetbrains.kotlin.idea.refactoring.rename.checkUsagesRetargeting[LocalVariableDescriptor]

'isError' @ [226:31] ==> public open fun isError(@Nullable p0: DeclarationDescriptor?): Boolean defined in org.jetbrains.kotlin.types.ErrorUtils[JavaMethodDescriptor]

'referencedClassInNewContext' @ [226:39] ==> val referencedClassInNewContext: ClassifierDescriptor? defined in org.jetbrains.kotlin.idea.refactoring.rename.checkUsagesRetargeting[LocalVariableDescriptor]

'referencedClass' @ [227:20] ==> val referencedClass: ClassifierDescriptor defined in org.jetbrains.kotlin.idea.refactoring.rename.checkUsagesRetargeting[LocalVariableDescriptor]

'canonicalRender' @ [227:36] ==> internal fun DeclarationDescriptor.canonicalRender(): String defined in org.jetbrains.kotlin.idea.refactoring.rename in file renameConflictUtils.kt[SimpleFunctionDescriptorImpl]

'candidateText' @ [227:57] ==> val candidateText: String? defined in org.jetbrains.kotlin.idea.refactoring.rename.checkUsagesRetargeting[LocalVariableDescriptor]

'accessibleDescriptors' @ [228:20] ==> value-parameter accessibleDescriptors: Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.refactoring.rename.checkUsagesRetargeting[ValueParameterDescriptorImpl]

'any' @ [228:42] ==> public inline fun <T> Iterable<DeclarationDescriptor>.any(predicate: (DeclarationDescriptor) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'it' @ [228:48] ==> value-parameter it: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.rename.checkUsagesRetargeting.<anonymous>[ValueParameterDescriptorImpl]

'canonicalRender' @ [228:51] ==> internal fun DeclarationDescriptor.canonicalRender(): String defined in org.jetbrains.kotlin.idea.refactoring.rename in file renameConflictUtils.kt[SimpleFunctionDescriptorImpl]

'candidateText' @ [228:72] ==> val candidateText: String? defined in org.jetbrains.kotlin.idea.refactoring.rename.checkUsagesRetargeting[LocalVariableDescriptor]

'usageIterator' @ [229:17] ==> val usageIterator: MutableListIterator<UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.rename.checkUsagesRetargeting[LocalVariableDescriptor]

'set' @ [229:31] ==> public abstract fun set(element: UsageInfo): Unit defined in kotlin.collections.MutableListIterator[DeserializedSimpleFunctionDescriptor]

'UsageInfoWithFqNameReplacement' @ [229:35] ==> public constructor UsageInfoWithFqNameReplacement(element: KtSimpleNameExpression, referencedElement: PsiElement, newFqName: FqName) defined in org.jetbrains.kotlin.idea.refactoring.rename.UsageInfoWithFqNameReplacement[ClassConstructorDescriptorImpl]

'refElement' @ [229:66] ==> val refElement: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.refactoring.rename.checkUsagesRetargeting[LocalVariableDescriptor]

'declaration' @ [229:78] ==> value-parameter declaration: PsiNamedElement defined in org.jetbrains.kotlin.idea.refactoring.rename.checkUsagesRetargeting[ValueParameterDescriptorImpl]

'newFqName' @ [229:91] ==> val newFqName: FqName defined in org.jetbrains.kotlin.idea.refactoring.rename.checkUsagesRetargeting[LocalVariableDescriptor]

'reportShadowing' @ [232:17] ==> public fun reportShadowing(declaration: PsiNamedElement, elementToBindUsageInfoTo: PsiElement, candidateDescriptor: DeclarationDescriptor, refElement: PsiElement, result: MutableList<UsageInfo>): Unit defined in org.jetbrains.kotlin.idea.refactoring.rename in file renameConflictUtils.kt[SimpleFunctionDescriptorImpl]

'declaration' @ [232:33] ==> value-parameter declaration: PsiNamedElement defined in org.jetbrains.kotlin.idea.refactoring.rename.checkUsagesRetargeting[ValueParameterDescriptorImpl]

'elementToBindUsageInfosTo' @ [232:46] ==> value-parameter elementToBindUsageInfosTo: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.rename.checkUsagesRetargeting[ValueParameterDescriptorImpl]

'referencedClassInNewContext' @ [232:73] ==> val referencedClassInNewContext: ClassifierDescriptor? defined in org.jetbrains.kotlin.idea.refactoring.rename.checkUsagesRetargeting[LocalVariableDescriptor]

'refElement' @ [232:102] ==> val refElement: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.refactoring.rename.checkUsagesRetargeting[LocalVariableDescriptor]

'newUsages' @ [232:114] ==> value-parameter newUsages: MutableList<UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.rename.checkUsagesRetargeting[ValueParameterDescriptorImpl]

'resolvedCall' @ [237:30] ==> val resolvedCall: ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.idea.refactoring.rename.checkUsagesRetargeting[LocalVariableDescriptor]

'call' @ [237:43] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.call: Call[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> Captured(out CallableDescriptor)

'callElement' @ [237:48] ==> public final val Call.callElement: KtElement[MyPropertyDescriptor]

'callExpression' @ [238:34] ==> val callExpression: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.rename.checkUsagesRetargeting[LocalVariableDescriptor]

'getQualifiedExpressionForSelectorOrThis' @ [238:49] ==> public fun KtExpression.getQualifiedExpressionForSelectorOrThis(): KtExpression defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'if (resolvedCall.noReceivers()) {
            val resultingDescriptor = resolvedCall.resultingDescriptor
            val fqName =
                    resultingDescriptor.importableFqName
                    ?: (resultingDescriptor as? ClassifierDescriptor)?.let {
                        FqName(IdeDescriptorRenderers.SOURCE_CODE.renderClassifierName(it))
                    }
                    ?: continue
            if (fqName.parent().isRoot) {
                callExpression.copied()
            }
            else {
                psiFactory.createExpressionByPattern("${fqName.parent().asString()}.$0", callExpression)
            }
        }
        else {
            resolvedCall.getExplicitReceiverValue()?.let {
                fullCallExpression.copied()
            }
            ?: resolvedCall.getImplicitReceiverValue()?.let { implicitReceiver ->
                val expectedLabelName = implicitReceiver.declarationDescriptor.getThisLabelName()
                val implicitReceivers = scope.getImplicitReceiversHierarchy()
                val receiversWithExpectedName = implicitReceivers.filter {
                    it.value.type.constructor.declarationDescriptor?.getThisLabelName() == expectedLabelName
                }

                val canQualifyThis = receiversWithExpectedName.isEmpty()
                                     || receiversWithExpectedName.size == 1 && (declaration !is KtClassOrObject || expectedLabelName != name)
                if (canQualifyThis) {
                    psiFactory.createExpressionByPattern("${implicitReceiver.explicateAsText()}.$0", callExpression)
                }
                else {
                    val defaultReceiverClassText =
                            implicitReceivers.firstOrNull()?.value?.type?.constructor?.declarationDescriptor?.canonicalRender()
                    val canInsertUnqualifiedThis = accessibleDescriptors.any { it.canonicalRender() == defaultReceiverClassText }
                    if (canInsertUnqualifiedThis) {
                        psiFactory.createExpressionByPattern("this.$0", callExpression)
                    }
                    else {
                        callExpression.copied()
                    }
                }
            }
            ?: continue
        }' @ [240:35] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KtExpression, elseBranch: KtExpression): KtExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KtExpression

'resolvedCall' @ [240:39] ==> val resolvedCall: ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.idea.refactoring.rename.checkUsagesRetargeting[LocalVariableDescriptor]

'noReceivers' @ [240:52] ==> internal fun ResolvedCall<*>.noReceivers(): Boolean defined in org.jetbrains.kotlin.idea.refactoring.rename in file renameConflictUtils.kt[SimpleFunctionDescriptorImpl]

'resolvedCall' @ [241:39] ==> val resolvedCall: ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.idea.refactoring.rename.checkUsagesRetargeting[LocalVariableDescriptor]

'resultingDescriptor' @ [241:52] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.resultingDescriptor: CallableDescriptor[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> Captured(out CallableDescriptor)

'resultingDescriptor' @ [243:21] ==> val resultingDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.idea.refactoring.rename.checkUsagesRetargeting[LocalVariableDescriptor]

'importableFqName' @ [243:41] ==> public val DeclarationDescriptor.importableFqName: FqName? defined in org.jetbrains.kotlin.idea.imports[DeserializedPropertyDescriptor]

'resultingDescriptor' @ [244:25] ==> val resultingDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.idea.refactoring.rename.checkUsagesRetargeting[LocalVariableDescriptor]

'let' @ [244:72] ==> @InlineOnly public inline fun <T, R> ClassifierDescriptor.let(block: (ClassifierDescriptor) -> FqName): FqName defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassifierDescriptor
    <R> -> FqName

'FqName' @ [245:25] ==> public constructor FqName(@NotNull p0: String) defined in org.jetbrains.kotlin.name.FqName[JavaClassConstructorDescriptor]

'SOURCE_CODE' @ [245:55] ==> @field:JvmField public final val SOURCE_CODE: DescriptorRenderer defined in org.jetbrains.kotlin.idea.util.IdeDescriptorRenderers[DeserializedPropertyDescriptor]

'renderClassifierName' @ [245:67] ==> public abstract fun renderClassifierName(klass: ClassifierDescriptor): String defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[DeserializedSimpleFunctionDescriptor]

'it' @ [245:88] ==> value-parameter it: ClassifierDescriptor defined in org.jetbrains.kotlin.idea.refactoring.rename.checkUsagesRetargeting.<anonymous>[ValueParameterDescriptorImpl]

'if (fqName.parent().isRoot) {
                callExpression.copied()
            }
            else {
                psiFactory.createExpressionByPattern("${fqName.parent().asString()}.$0", callExpression)
            }' @ [248:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KtExpression, elseBranch: KtExpression): KtExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KtExpression

'fqName' @ [248:17] ==> val fqName: FqName defined in org.jetbrains.kotlin.idea.refactoring.rename.checkUsagesRetargeting[LocalVariableDescriptor]

'parent' @ [248:24] ==> @NotNull public open fun parent(): FqName defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'isRoot' @ [248:33] ==> public final val FqName.isRoot: Boolean[MyPropertyDescriptor]

'callExpression' @ [249:17] ==> val callExpression: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.rename.checkUsagesRetargeting[LocalVariableDescriptor]

'copied' @ [249:32] ==> public fun <T : PsiElement> KtExpression.copied(): KtExpression defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : PsiElement> -> KtExpression

'psiFactory' @ [252:17] ==> val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.refactoring.rename.checkUsagesRetargeting[LocalVariableDescriptor]

'createExpressionByPattern' @ [252:28] ==> public fun KtPsiFactory.createExpressionByPattern(pattern: String, vararg args: Any, reformat: Boolean = ...): KtExpression defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'fqName' @ [252:57] ==> val fqName: FqName defined in org.jetbrains.kotlin.idea.refactoring.rename.checkUsagesRetargeting[LocalVariableDescriptor]

'parent' @ [252:64] ==> @NotNull public open fun parent(): FqName defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'asString' @ [252:73] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'callExpression' @ [252:90] ==> val callExpression: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.rename.checkUsagesRetargeting[LocalVariableDescriptor]

'resolvedCall' @ [256:13] ==> val resolvedCall: ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.idea.refactoring.rename.checkUsagesRetargeting[LocalVariableDescriptor]

'getExplicitReceiverValue' @ [256:26] ==> public fun ResolvedCall<*>.getExplicitReceiverValue(): ReceiverValue? defined in org.jetbrains.kotlin.resolve.calls.resolvedCallUtil[DeserializedSimpleFunctionDescriptor]

'let' @ [256:54] ==> @InlineOnly public inline fun <T, R> ReceiverValue.let(block: (ReceiverValue) -> KtExpression): KtExpression defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ReceiverValue
    <R> -> KtExpression

'fullCallExpression' @ [257:17] ==> val fullCallExpression: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.rename.checkUsagesRetargeting[LocalVariableDescriptor]

'copied' @ [257:36] ==> public fun <T : PsiElement> KtExpression.copied(): KtExpression defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : PsiElement> -> KtExpression

'resolvedCall' @ [259:16] ==> val resolvedCall: ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.idea.refactoring.rename.checkUsagesRetargeting[LocalVariableDescriptor]

'getImplicitReceiverValue' @ [259:29] ==> public fun ResolvedCall<*>.getImplicitReceiverValue(): ImplicitReceiver? defined in org.jetbrains.kotlin.resolve.calls.resolvedCallUtil[DeserializedSimpleFunctionDescriptor]

'let' @ [259:57] ==> @InlineOnly public inline fun <T, R> ImplicitReceiver.let(block: (ImplicitReceiver) -> KtExpression): KtExpression defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ImplicitReceiver
    <R> -> KtExpression

'implicitReceiver' @ [260:41] ==> value-parameter implicitReceiver: ImplicitReceiver defined in org.jetbrains.kotlin.idea.refactoring.rename.checkUsagesRetargeting.<anonymous>[ValueParameterDescriptorImpl]

'declarationDescriptor' @ [260:58] ==> public abstract val declarationDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.scopes.receivers.ImplicitReceiver[DeserializedPropertyDescriptor]

'getThisLabelName' @ [260:80] ==> internal fun DeclarationDescriptor.getThisLabelName(): String defined in org.jetbrains.kotlin.idea.refactoring in file kotlinRefactoringUtil.kt[SimpleFunctionDescriptorImpl]

'scope' @ [261:41] ==> val scope: LexicalScope defined in org.jetbrains.kotlin.idea.refactoring.rename.checkUsagesRetargeting[LocalVariableDescriptor]

'getImplicitReceiversHierarchy' @ [261:47] ==> public fun LexicalScope.getImplicitReceiversHierarchy(): List<ReceiverParameterDescriptor> defined in org.jetbrains.kotlin.resolve.scopes.utils[DeserializedSimpleFunctionDescriptor]

'implicitReceivers' @ [262:49] ==> val implicitReceivers: List<ReceiverParameterDescriptor> defined in org.jetbrains.kotlin.idea.refactoring.rename.checkUsagesRetargeting.<anonymous>[LocalVariableDescriptor]

'filter' @ [262:67] ==> public inline fun <T> Iterable<ReceiverParameterDescriptor>.filter(predicate: (ReceiverParameterDescriptor) -> Boolean): List<ReceiverParameterDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ReceiverParameterDescriptor

'it' @ [263:21] ==> value-parameter it: ReceiverParameterDescriptor defined in org.jetbrains.kotlin.idea.refactoring.rename.checkUsagesRetargeting.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [263:24] ==> public final val ReceiverParameterDescriptor.value: ReceiverValue[MyPropertyDescriptor]

'type' @ [263:30] ==> public final val ReceiverValue.type: KotlinType[MyPropertyDescriptor]

'constructor' @ [263:35] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'declarationDescriptor' @ [263:47] ==> public final val TypeConstructor.declarationDescriptor: ClassifierDescriptor?[MyPropertyDescriptor]

'getThisLabelName' @ [263:70] ==> internal fun DeclarationDescriptor.getThisLabelName(): String defined in org.jetbrains.kotlin.idea.refactoring in file kotlinRefactoringUtil.kt[SimpleFunctionDescriptorImpl]

'expectedLabelName' @ [263:92] ==> val expectedLabelName: String defined in org.jetbrains.kotlin.idea.refactoring.rename.checkUsagesRetargeting.<anonymous>[LocalVariableDescriptor]

'receiversWithExpectedName' @ [266:38] ==> val receiversWithExpectedName: List<ReceiverParameterDescriptor> defined in org.jetbrains.kotlin.idea.refactoring.rename.checkUsagesRetargeting.<anonymous>[LocalVariableDescriptor]

'isEmpty' @ [266:64] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'receiversWithExpectedName' @ [267:41] ==> val receiversWithExpectedName: List<ReceiverParameterDescriptor> defined in org.jetbrains.kotlin.idea.refactoring.rename.checkUsagesRetargeting.<anonymous>[LocalVariableDescriptor]

'size' @ [267:67] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'declaration' @ [267:81] ==> value-parameter declaration: PsiNamedElement defined in org.jetbrains.kotlin.idea.refactoring.rename.checkUsagesRetargeting[ValueParameterDescriptorImpl]

'expectedLabelName' @ [267:116] ==> val expectedLabelName: String defined in org.jetbrains.kotlin.idea.refactoring.rename.checkUsagesRetargeting.<anonymous>[LocalVariableDescriptor]

'name' @ [267:137] ==> value-parameter name: String defined in org.jetbrains.kotlin.idea.refactoring.rename.checkUsagesRetargeting[ValueParameterDescriptorImpl]

'if (canQualifyThis) {
                    psiFactory.createExpressionByPattern("${implicitReceiver.explicateAsText()}.$0", callExpression)
                }
                else {
                    val defaultReceiverClassText =
                            implicitReceivers.firstOrNull()?.value?.type?.constructor?.declarationDescriptor?.canonicalRender()
                    val canInsertUnqualifiedThis = accessibleDescriptors.any { it.canonicalRender() == defaultReceiverClassText }
                    if (canInsertUnqualifiedThis) {
                        psiFactory.createExpressionByPattern("this.$0", callExpression)
                    }
                    else {
                        callExpression.copied()
                    }
                }' @ [268:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KtExpression, elseBranch: KtExpression): KtExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KtExpression

'canQualifyThis' @ [268:21] ==> val canQualifyThis: Boolean defined in org.jetbrains.kotlin.idea.refactoring.rename.checkUsagesRetargeting.<anonymous>[LocalVariableDescriptor]

'psiFactory' @ [269:21] ==> val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.refactoring.rename.checkUsagesRetargeting[LocalVariableDescriptor]

'createExpressionByPattern' @ [269:32] ==> public fun KtPsiFactory.createExpressionByPattern(pattern: String, vararg args: Any, reformat: Boolean = ...): KtExpression defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'implicitReceiver' @ [269:61] ==> value-parameter implicitReceiver: ImplicitReceiver defined in org.jetbrains.kotlin.idea.refactoring.rename.checkUsagesRetargeting.<anonymous>[ValueParameterDescriptorImpl]

'explicateAsText' @ [269:78] ==> internal fun ImplicitReceiver.explicateAsText(): String defined in org.jetbrains.kotlin.idea.refactoring in file kotlinRefactoringUtil.kt[SimpleFunctionDescriptorImpl]

'callExpression' @ [269:102] ==> val callExpression: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.rename.checkUsagesRetargeting[LocalVariableDescriptor]

'implicitReceivers' @ [273:29] ==> val implicitReceivers: List<ReceiverParameterDescriptor> defined in org.jetbrains.kotlin.idea.refactoring.rename.checkUsagesRetargeting.<anonymous>[LocalVariableDescriptor]

'firstOrNull' @ [273:47] ==> public fun <T> List<ReceiverParameterDescriptor>.firstOrNull(): ReceiverParameterDescriptor? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ReceiverParameterDescriptor

'value' @ [273:62] ==> public final val ReceiverParameterDescriptor.value: ReceiverValue[MyPropertyDescriptor]

'type' @ [273:69] ==> public final val ReceiverValue.type: KotlinType[MyPropertyDescriptor]

'constructor' @ [273:75] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'declarationDescriptor' @ [273:88] ==> public final val TypeConstructor.declarationDescriptor: ClassifierDescriptor?[MyPropertyDescriptor]

'canonicalRender' @ [273:111] ==> internal fun DeclarationDescriptor.canonicalRender(): String defined in org.jetbrains.kotlin.idea.refactoring.rename in file renameConflictUtils.kt[SimpleFunctionDescriptorImpl]

'accessibleDescriptors' @ [274:52] ==> value-parameter accessibleDescriptors: Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.refactoring.rename.checkUsagesRetargeting[ValueParameterDescriptorImpl]

'any' @ [274:74] ==> public inline fun <T> Iterable<DeclarationDescriptor>.any(predicate: (DeclarationDescriptor) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'it' @ [274:80] ==> value-parameter it: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.rename.checkUsagesRetargeting.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'canonicalRender' @ [274:83] ==> internal fun DeclarationDescriptor.canonicalRender(): String defined in org.jetbrains.kotlin.idea.refactoring.rename in file renameConflictUtils.kt[SimpleFunctionDescriptorImpl]

'defaultReceiverClassText' @ [274:104] ==> val defaultReceiverClassText: String? defined in org.jetbrains.kotlin.idea.refactoring.rename.checkUsagesRetargeting.<anonymous>[LocalVariableDescriptor]

'if (canInsertUnqualifiedThis) {
                        psiFactory.createExpressionByPattern("this.$0", callExpression)
                    }
                    else {
                        callExpression.copied()
                    }' @ [275:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KtExpression, elseBranch: KtExpression): KtExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KtExpression

'canInsertUnqualifiedThis' @ [275:25] ==> val canInsertUnqualifiedThis: Boolean defined in org.jetbrains.kotlin.idea.refactoring.rename.checkUsagesRetargeting.<anonymous>[LocalVariableDescriptor]

'psiFactory' @ [276:25] ==> val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.refactoring.rename.checkUsagesRetargeting[LocalVariableDescriptor]

'createExpressionByPattern' @ [276:36] ==> public fun KtPsiFactory.createExpressionByPattern(pattern: String, vararg args: Any, reformat: Boolean = ...): KtExpression defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'callExpression' @ [276:73] ==> val callExpression: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.rename.checkUsagesRetargeting[LocalVariableDescriptor]

'callExpression' @ [279:25] ==> val callExpression: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.rename.checkUsagesRetargeting[LocalVariableDescriptor]

'copied' @ [279:40] ==> public fun <T : PsiElement> KtExpression.copied(): KtExpression defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : PsiElement> -> KtExpression

'qualifiedExpression' @ [286:25] ==> val qualifiedExpression: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.rename.checkUsagesRetargeting[LocalVariableDescriptor]

'getQualifiedElementSelector' @ [286:45] ==> public fun KtElement.getQualifiedElementSelector(): KtElement? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'isNewName' @ [287:13] ==> value-parameter isNewName: Boolean defined in org.jetbrains.kotlin.idea.refactoring.rename.checkUsagesRetargeting[ValueParameterDescriptorImpl]

'newCallee' @ [288:13] ==> val newCallee: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.refactoring.rename.checkUsagesRetargeting[LocalVariableDescriptor]

'getReferencedNameElement' @ [288:23] ==> public abstract fun getReferencedNameElement(): PsiElement defined in org.jetbrains.kotlin.psi.KtSimpleNameExpression[DeserializedSimpleFunctionDescriptor]

'replace' @ [288:50] ==> public abstract fun replace(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in com.intellij.psi.PsiElement[JavaMethodDescriptor]

'psiFactory' @ [288:58] ==> val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.refactoring.rename.checkUsagesRetargeting[LocalVariableDescriptor]

'createNameIdentifier' @ [288:69] ==> public final fun createNameIdentifier(name: String): PsiElement defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'name' @ [288:90] ==> value-parameter name: String defined in org.jetbrains.kotlin.idea.refactoring.rename.checkUsagesRetargeting[ValueParameterDescriptorImpl]

'qualifiedExpression' @ [291:26] ==> val qualifiedExpression: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.rename.checkUsagesRetargeting[LocalVariableDescriptor]

'analyzeInContext' @ [291:46] ==> @JvmOverloads public fun KtExpression.analyzeInContext(scope: LexicalScope, contextExpression: KtExpression = ..., trace: BindingTrace = ..., dataFlowInfo: DataFlowInfo = ..., expectedType: KotlinType = ..., isStatement: Boolean = ..., contextDependency: ContextDependency = ..., expressionTypingServices: ExpressionTypingServices = ...): BindingContext defined in org.jetbrains.kotlin.idea.analysis[DeserializedSimpleFunctionDescriptor]

'scope' @ [291:63] ==> val scope: LexicalScope defined in org.jetbrains.kotlin.idea.refactoring.rename.checkUsagesRetargeting[LocalVariableDescriptor]

'refElement' @ [291:70] ==> val refElement: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.refactoring.rename.checkUsagesRetargeting[LocalVariableDescriptor]

'newCallee' @ [293:31] ==> val newCallee: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.refactoring.rename.checkUsagesRetargeting[LocalVariableDescriptor]

'getResolvedCall' @ [293:41] ==> public fun KtElement?.getResolvedCall(context: BindingContext): ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.resolve.calls.callUtil[DeserializedSimpleFunctionDescriptor]

'newContext' @ [293:57] ==> val newContext: BindingContext defined in org.jetbrains.kotlin.idea.refactoring.rename.checkUsagesRetargeting[LocalVariableDescriptor]

'newResolvedCall' @ [294:29] ==> val newResolvedCall: ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.idea.refactoring.rename.checkUsagesRetargeting[LocalVariableDescriptor]

'candidateDescriptor' @ [294:46] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.candidateDescriptor: CallableDescriptor[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> Captured(out CallableDescriptor)

'getImportableDescriptor' @ [294:67] ==> public fun DeclarationDescriptor.getImportableDescriptor(): DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedSimpleFunctionDescriptor]

'canonicalRender' @ [294:94] ==> internal fun DeclarationDescriptor.canonicalRender(): String defined in org.jetbrains.kotlin.idea.refactoring.rename in file renameConflictUtils.kt[SimpleFunctionDescriptorImpl]

'newResolvedCall' @ [296:13] ==> val newResolvedCall: ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.idea.refactoring.rename.checkUsagesRetargeting[LocalVariableDescriptor]

'!' @ [297:16] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'accessibleDescriptors' @ [297:17] ==> value-parameter accessibleDescriptors: Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.refactoring.rename.checkUsagesRetargeting[ValueParameterDescriptorImpl]

'any' @ [297:39] ==> public inline fun <T> Iterable<DeclarationDescriptor>.any(predicate: (DeclarationDescriptor) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'it' @ [297:45] ==> value-parameter it: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.rename.checkUsagesRetargeting.<anonymous>[ValueParameterDescriptorImpl]

'canonicalRender' @ [297:48] ==> internal fun DeclarationDescriptor.canonicalRender(): String defined in org.jetbrains.kotlin.idea.refactoring.rename in file renameConflictUtils.kt[SimpleFunctionDescriptorImpl]

'candidateText' @ [297:69] ==> val candidateText: String? defined in org.jetbrains.kotlin.idea.refactoring.rename.checkUsagesRetargeting[LocalVariableDescriptor]

'resolvedCall' @ [298:16] ==> val resolvedCall: ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.idea.refactoring.rename.checkUsagesRetargeting[LocalVariableDescriptor]

'candidateDescriptor' @ [298:29] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.candidateDescriptor: CallableDescriptor[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> Captured(out CallableDescriptor)

'canonicalRender' @ [298:49] ==> internal fun DeclarationDescriptor.canonicalRender(): String defined in org.jetbrains.kotlin.idea.refactoring.rename in file renameConflictUtils.kt[SimpleFunctionDescriptorImpl]

'candidateText' @ [298:70] ==> val candidateText: String? defined in org.jetbrains.kotlin.idea.refactoring.rename.checkUsagesRetargeting[LocalVariableDescriptor]

'reportShadowing' @ [299:13] ==> public fun reportShadowing(declaration: PsiNamedElement, elementToBindUsageInfoTo: PsiElement, candidateDescriptor: DeclarationDescriptor, refElement: PsiElement, result: MutableList<UsageInfo>): Unit defined in org.jetbrains.kotlin.idea.refactoring.rename in file renameConflictUtils.kt[SimpleFunctionDescriptorImpl]

'declaration' @ [299:29] ==> value-parameter declaration: PsiNamedElement defined in org.jetbrains.kotlin.idea.refactoring.rename.checkUsagesRetargeting[ValueParameterDescriptorImpl]

'elementToBindUsageInfosTo' @ [299:42] ==> value-parameter elementToBindUsageInfosTo: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.rename.checkUsagesRetargeting[ValueParameterDescriptorImpl]

'newResolvedCall' @ [299:69] ==> val newResolvedCall: ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.idea.refactoring.rename.checkUsagesRetargeting[LocalVariableDescriptor]

'candidateDescriptor' @ [299:85] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.candidateDescriptor: CallableDescriptor[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> Captured(out CallableDescriptor)

'refElement' @ [299:106] ==> val refElement: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.refactoring.rename.checkUsagesRetargeting[LocalVariableDescriptor]

'newUsages' @ [299:118] ==> value-parameter newUsages: MutableList<UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.rename.checkUsagesRetargeting[ValueParameterDescriptorImpl]

'fullCallExpression' @ [303:13] ==> val fullCallExpression: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.rename.checkUsagesRetargeting[LocalVariableDescriptor]

'usageIterator' @ [304:13] ==> val usageIterator: MutableListIterator<UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.rename.checkUsagesRetargeting[LocalVariableDescriptor]

'set' @ [304:27] ==> public abstract fun set(element: UsageInfo): Unit defined in kotlin.collections.MutableListIterator[DeserializedSimpleFunctionDescriptor]

'UsageInfoWithReplacement' @ [304:31] ==> public constructor UsageInfoWithReplacement(element: PsiElement, referencedElement: PsiElement, replacement: KtElement) defined in org.jetbrains.kotlin.idea.refactoring.rename.UsageInfoWithReplacement[ClassConstructorDescriptorImpl]

'fullCallExpression' @ [304:56] ==> val fullCallExpression: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.rename.checkUsagesRetargeting[LocalVariableDescriptor]

'declaration' @ [304:76] ==> value-parameter declaration: PsiNamedElement defined in org.jetbrains.kotlin.idea.refactoring.rename.checkUsagesRetargeting[ValueParameterDescriptorImpl]

'qualifiedExpression' @ [304:89] ==> val qualifiedExpression: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.rename.checkUsagesRetargeting[LocalVariableDescriptor]

'declaration' @ [315:33] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.rename.checkOriginalUsagesRetargeting[ValueParameterDescriptorImpl]

'getResolutionScope' @ [315:45] ==> public fun KtElement.getResolutionScope(): LexicalScope defined in org.jetbrains.kotlin.idea.util[DeserializedSimpleFunctionDescriptor]

'getRelevantDescriptors' @ [315:66] ==> private fun LexicalScope.getRelevantDescriptors(declaration: PsiNamedElement, name: String): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.refactoring.rename in file renameConflictUtils.kt[SimpleFunctionDescriptorImpl]

'declaration' @ [315:89] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.rename.checkOriginalUsagesRetargeting[ValueParameterDescriptorImpl]

'newName' @ [315:102] ==> value-parameter newName: String defined in org.jetbrains.kotlin.idea.refactoring.rename.checkOriginalUsagesRetargeting[ValueParameterDescriptorImpl]

'checkUsagesRetargeting' @ [316:5] ==> private fun checkUsagesRetargeting(elementToBindUsageInfosTo: PsiElement, declaration: PsiNamedElement, name: String, isNewName: Boolean, accessibleDescriptors: Collection<DeclarationDescriptor>, originalUsages: MutableList<UsageInfo>, newUsages: MutableList<UsageInfo>): Unit defined in org.jetbrains.kotlin.idea.refactoring.rename in file renameConflictUtils.kt[SimpleFunctionDescriptorImpl]

'declaration' @ [316:28] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.rename.checkOriginalUsagesRetargeting[ValueParameterDescriptorImpl]

'declaration' @ [316:41] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.rename.checkOriginalUsagesRetargeting[ValueParameterDescriptorImpl]

'newName' @ [316:54] ==> value-parameter newName: String defined in org.jetbrains.kotlin.idea.refactoring.rename.checkOriginalUsagesRetargeting[ValueParameterDescriptorImpl]

'accessibleDescriptors' @ [316:69] ==> val accessibleDescriptors: Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.refactoring.rename.checkOriginalUsagesRetargeting[LocalVariableDescriptor]

'originalUsages' @ [316:92] ==> value-parameter originalUsages: MutableList<UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.rename.checkOriginalUsagesRetargeting[ValueParameterDescriptorImpl]

'newUsages' @ [316:108] ==> value-parameter newUsages: MutableList<UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.rename.checkOriginalUsagesRetargeting[ValueParameterDescriptorImpl]

'declaration' @ [324:23] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.rename.checkNewNameUsagesRetargeting[ValueParameterDescriptorImpl]

'name' @ [324:35] ==> public final val KtNamedDeclaration.name: String?[MyPropertyDescriptor]

'declaration' @ [325:22] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.rename.checkNewNameUsagesRetargeting[ValueParameterDescriptorImpl]

'resolveToDescriptor' @ [325:34] ==> public fun KtDeclaration.resolveToDescriptor(bodyResolveMode: BodyResolveMode = ...): DeclarationDescriptor defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'declaration' @ [327:9] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.rename.checkNewNameUsagesRetargeting[ValueParameterDescriptorImpl]

'!' @ [327:39] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'declaration' @ [327:40] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.rename.checkNewNameUsagesRetargeting[ValueParameterDescriptorImpl]

'hasValOrVar' @ [327:52] ==> public open fun hasValOrVar(): Boolean defined in org.jetbrains.kotlin.psi.KtParameter[JavaMethodDescriptor]

'declaration' @ [328:29] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.rename.checkNewNameUsagesRetargeting[ValueParameterDescriptorImpl]

'ownerFunction' @ [328:41] ==> public final val KtParameter.ownerFunction: KtDeclarationWithBody?[MyPropertyDescriptor]

'?:' @ [329:27] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: KtDeclaration?, right: KtDeclaration): KtDeclaration[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> KtDeclaration

'if (ownerFunction is KtPrimaryConstructor) ownerFunction.containingClassOrObject else ownerFunction' @ [329:28] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KtDeclaration?, elseBranch: KtDeclaration?): KtDeclaration?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KtDeclaration?

'ownerFunction' @ [329:32] ==> val ownerFunction: KtDeclarationWithBody? defined in org.jetbrains.kotlin.idea.refactoring.rename.checkNewNameUsagesRetargeting[LocalVariableDescriptor]

'ownerFunction' @ [329:71] ==> val ownerFunction: KtDeclarationWithBody? defined in org.jetbrains.kotlin.idea.refactoring.rename.checkNewNameUsagesRetargeting[LocalVariableDescriptor]

'containingClassOrObject' @ [329:85] ==> public val KtDeclaration.containingClassOrObject: KtClassOrObject? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'ownerFunction' @ [329:114] ==> val ownerFunction: KtDeclarationWithBody? defined in org.jetbrains.kotlin.idea.refactoring.rename.checkNewNameUsagesRetargeting[LocalVariableDescriptor]

'LinkedHashMap' @ [331:33] ==> public constructor LinkedHashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.LinkedHashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> PsiElement
    <V : (Any..Any?)> -> MutableList<UsageInfo>

'searchScope' @ [333:9] ==> val searchScope: KtDeclaration defined in org.jetbrains.kotlin.idea.refactoring.rename.checkNewNameUsagesRetargeting[LocalVariableDescriptor]

'accept' @ [333:21] ==> public abstract fun accept(@NotNull p0: PsiElementVisitor): Unit defined in org.jetbrains.kotlin.psi.KtDeclaration[JavaMethodDescriptor]

'KtTreeVisitorVoid' @ [334:25] ==> public constructor KtTreeVisitorVoid() defined in org.jetbrains.kotlin.psi.KtTreeVisitorVoid[JavaClassConstructorDescriptor]

'expression' @ [336:29] ==> value-parameter expression: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.refactoring.rename.checkNewNameUsagesRetargeting.<no name provided>.visitSimpleNameExpression[ValueParameterDescriptorImpl]

'getReferencedName' @ [336:40] ==> public abstract fun getReferencedName(): String defined in org.jetbrains.kotlin.psi.KtSimpleNameExpression[DeserializedSimpleFunctionDescriptor]

'newName' @ [336:63] ==> value-parameter newName: String defined in org.jetbrains.kotlin.idea.refactoring.rename.checkNewNameUsagesRetargeting[ValueParameterDescriptorImpl]

'expression' @ [337:35] ==> value-parameter expression: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.refactoring.rename.checkNewNameUsagesRetargeting.<no name provided>.visitSimpleNameExpression[ValueParameterDescriptorImpl]

'mainReference' @ [337:46] ==> public val KtSimpleNameExpression.mainReference: KtSimpleNameReference defined in org.jetbrains.kotlin.idea.references[DeserializedPropertyDescriptor]

'ref' @ [338:41] ==> val ref: KtSimpleNameReference defined in org.jetbrains.kotlin.idea.refactoring.rename.checkNewNameUsagesRetargeting.<no name provided>.visitSimpleNameExpression[LocalVariableDescriptor]

'resolve' @ [338:45] ==> @Nullable public open fun resolve(): PsiElement? defined in org.jetbrains.kotlin.idea.references.KtSimpleNameReference[JavaMethodDescriptor]

'usagesByCandidate' @ [339:25] ==> val usagesByCandidate: LinkedHashMap<PsiElement, MutableList<UsageInfo>> defined in org.jetbrains.kotlin.idea.refactoring.rename.checkNewNameUsagesRetargeting[LocalVariableDescriptor]

'getOrPut' @ [339:43] ==> public inline fun <K, V> MutableMap<PsiElement, MutableList<UsageInfo>>.getOrPut(key: PsiElement, defaultValue: () -> MutableList<UsageInfo>): MutableList<UsageInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> PsiElement
    <V> -> MutableList<UsageInfo>

'candidate' @ [339:52] ==> val candidate: PsiNamedElement defined in org.jetbrains.kotlin.idea.refactoring.rename.checkNewNameUsagesRetargeting.<no name provided>.visitSimpleNameExpression[LocalVariableDescriptor]

'SmartList' @ [339:65] ==> public constructor SmartList<E : (Any..Any?)>() defined in org.jetbrains.kotlin.utils.SmartList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> (com.intellij.usageView.UsageInfo..com.intellij.usageView.UsageInfo?)

'add' @ [339:79] ==> public abstract fun add(element: UsageInfo): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'MoveRenameUsageInfo' @ [339:83] ==> public constructor MoveRenameUsageInfo(p0: (PsiReference..PsiReference?), p1: (PsiElement..PsiElement?)) defined in com.intellij.refactoring.util.MoveRenameUsageInfo[JavaClassConstructorDescriptor]

'ref' @ [339:103] ==> val ref: KtSimpleNameReference defined in org.jetbrains.kotlin.idea.refactoring.rename.checkNewNameUsagesRetargeting.<no name provided>.visitSimpleNameExpression[LocalVariableDescriptor]

'candidate' @ [339:108] ==> val candidate: PsiNamedElement defined in org.jetbrains.kotlin.idea.refactoring.rename.checkNewNameUsagesRetargeting.<no name provided>.visitSimpleNameExpression[LocalVariableDescriptor]

'component1' @ [344:15] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<PsiElement, MutableList<UsageInfo>>.component1(): PsiElement defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> PsiElement
    <V> -> MutableList<UsageInfo>

'component2' @ [344:26] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<PsiElement, MutableList<UsageInfo>>.component2(): MutableList<UsageInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> PsiElement
    <V> -> MutableList<UsageInfo>

'usagesByCandidate' @ [344:37] ==> val usagesByCandidate: LinkedHashMap<PsiElement, MutableList<UsageInfo>> defined in org.jetbrains.kotlin.idea.refactoring.rename.checkNewNameUsagesRetargeting[LocalVariableDescriptor]

'checkUsagesRetargeting' @ [345:13] ==> private fun checkUsagesRetargeting(elementToBindUsageInfosTo: PsiElement, declaration: PsiNamedElement, name: String, isNewName: Boolean, accessibleDescriptors: Collection<DeclarationDescriptor>, originalUsages: MutableList<UsageInfo>, newUsages: MutableList<UsageInfo>): Unit defined in org.jetbrains.kotlin.idea.refactoring.rename in file renameConflictUtils.kt[SimpleFunctionDescriptorImpl]

'candidate' @ [345:36] ==> val candidate: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.rename.checkNewNameUsagesRetargeting[LocalVariableDescriptor]

'declaration' @ [345:47] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.rename.checkNewNameUsagesRetargeting[ValueParameterDescriptorImpl]

'currentName' @ [345:60] ==> val currentName: String defined in org.jetbrains.kotlin.idea.refactoring.rename.checkNewNameUsagesRetargeting[LocalVariableDescriptor]

'listOf' @ [345:80] ==> public fun <T> listOf(element: DeclarationDescriptor): List<DeclarationDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'descriptor' @ [345:87] ==> val descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.rename.checkNewNameUsagesRetargeting[LocalVariableDescriptor]

'usages' @ [345:100] ==> val usages: MutableList<UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.rename.checkNewNameUsagesRetargeting[LocalVariableDescriptor]

'newUsages' @ [345:108] ==> value-parameter newUsages: MutableList<UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.rename.checkNewNameUsagesRetargeting[ValueParameterDescriptorImpl]

'usages' @ [346:13] ==> val usages: MutableList<UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.rename.checkNewNameUsagesRetargeting[LocalVariableDescriptor]

'filterIsInstanceTo' @ [346:20] ==> public inline fun <reified R, C : MutableCollection<in KtResolvableCollisionUsageInfo>> Iterable<*>.filterIsInstanceTo(destination: MutableList<UsageInfo>): MutableList<UsageInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> KtResolvableCollisionUsageInfo
    <C : MutableCollection<in R>> -> MutableList<UsageInfo>

'newUsages' @ [346:95] ==> value-parameter newUsages: MutableList<UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.rename.checkNewNameUsagesRetargeting[ValueParameterDescriptorImpl]

'declaration' @ [352:33] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.rename.checkNewNameUsagesRetargeting[ValueParameterDescriptorImpl]

'getResolutionScope' @ [352:45] ==> public fun KtElement.getResolutionScope(): LexicalScope defined in org.jetbrains.kotlin.idea.util[DeserializedSimpleFunctionDescriptor]

'getRelevantDescriptors' @ [352:66] ==> private fun LexicalScope.getRelevantDescriptors(declaration: PsiNamedElement, name: String): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.refactoring.rename in file renameConflictUtils.kt[SimpleFunctionDescriptorImpl]

'declaration' @ [352:89] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.rename.checkNewNameUsagesRetargeting[ValueParameterDescriptorImpl]

'newName' @ [352:102] ==> value-parameter newName: String defined in org.jetbrains.kotlin.idea.refactoring.rename.checkNewNameUsagesRetargeting[ValueParameterDescriptorImpl]

'DescriptorToSourceUtilsIde' @ [353:25] ==> public object DescriptorToSourceUtilsIde defined in org.jetbrains.kotlin.idea.codeInsight[FakeCallableDescriptorForObject]

'getAnyDeclaration' @ [353:52] ==> public final fun getAnyDeclaration(project: Project, descriptor: DeclarationDescriptor): PsiElement? defined in org.jetbrains.kotlin.idea.codeInsight.DescriptorToSourceUtilsIde[DeserializedSimpleFunctionDescriptor]

'declaration' @ [353:70] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.rename.checkNewNameUsagesRetargeting[ValueParameterDescriptorImpl]

'project' @ [353:82] ==> public final val KtNamedDeclaration.project: Project[MyPropertyDescriptor]

'candidateDescriptor' @ [353:91] ==> val candidateDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.rename.checkNewNameUsagesRetargeting[LocalVariableDescriptor]

'search' @ [355:18] ==> @NotNull public open fun search(@NotNull p0: PsiElement, @NotNull p1: SearchScope): Query<(PsiReference..PsiReference?)> defined in com.intellij.psi.search.searches.ReferencesSearch[JavaMethodDescriptor]

'candidate' @ [355:25] ==> val candidate: PsiNamedElement defined in org.jetbrains.kotlin.idea.refactoring.rename.checkNewNameUsagesRetargeting[LocalVariableDescriptor]

'candidate' @ [355:36] ==> val candidate: PsiNamedElement defined in org.jetbrains.kotlin.idea.refactoring.rename.checkNewNameUsagesRetargeting[LocalVariableDescriptor]

'useScope' @ [355:46] ==> public final val PsiNamedElement.useScope: SearchScope[MyPropertyDescriptor]

'restrictToKotlinSources' @ [355:55] ==> public fun SearchScope.restrictToKotlinSources(): SearchScope defined in org.jetbrains.kotlin.idea.search[DeserializedSimpleFunctionDescriptor]

'declaration' @ [355:85] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.rename.checkNewNameUsagesRetargeting[ValueParameterDescriptorImpl]

'useScope' @ [355:97] ==> public final val KtNamedDeclaration.useScope: SearchScope[MyPropertyDescriptor]

'mapTo' @ [356:18] ==> public inline fun <T, R, C : MutableCollection<in MoveRenameUsageInfo>> Iterable<(PsiReference..PsiReference?)>.mapTo(destination: SmartList<UsageInfo>, transform: ((PsiReference..PsiReference?)) -> MoveRenameUsageInfo): SmartList<UsageInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiReference..com.intellij.psi.PsiReference?)
    <R> -> MoveRenameUsageInfo
    <C : MutableCollection<in R>> -> SmartList<UsageInfo>

'SmartList' @ [356:24] ==> public constructor SmartList<E : (Any..Any?)>() defined in org.jetbrains.kotlin.utils.SmartList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> UsageInfo

'MoveRenameUsageInfo' @ [356:50] ==> public constructor MoveRenameUsageInfo(p0: (PsiReference..PsiReference?), p1: (PsiElement..PsiElement?)) defined in com.intellij.refactoring.util.MoveRenameUsageInfo[JavaClassConstructorDescriptor]

'it' @ [356:70] ==> value-parameter it: (PsiReference..PsiReference?) defined in org.jetbrains.kotlin.idea.refactoring.rename.checkNewNameUsagesRetargeting.<anonymous>[ValueParameterDescriptorImpl]

'candidate' @ [356:74] ==> val candidate: PsiNamedElement defined in org.jetbrains.kotlin.idea.refactoring.rename.checkNewNameUsagesRetargeting[LocalVariableDescriptor]

'checkUsagesRetargeting' @ [357:9] ==> private fun checkUsagesRetargeting(elementToBindUsageInfosTo: PsiElement, declaration: PsiNamedElement, name: String, isNewName: Boolean, accessibleDescriptors: Collection<DeclarationDescriptor>, originalUsages: MutableList<UsageInfo>, newUsages: MutableList<UsageInfo>): Unit defined in org.jetbrains.kotlin.idea.refactoring.rename in file renameConflictUtils.kt[SimpleFunctionDescriptorImpl]

'candidate' @ [357:32] ==> val candidate: PsiNamedElement defined in org.jetbrains.kotlin.idea.refactoring.rename.checkNewNameUsagesRetargeting[LocalVariableDescriptor]

'declaration' @ [357:43] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.rename.checkNewNameUsagesRetargeting[ValueParameterDescriptorImpl]

'currentName' @ [357:56] ==> val currentName: String defined in org.jetbrains.kotlin.idea.refactoring.rename.checkNewNameUsagesRetargeting[LocalVariableDescriptor]

'listOf' @ [357:76] ==> public fun <T> listOf(element: DeclarationDescriptor): List<DeclarationDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'descriptor' @ [357:83] ==> val descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.rename.checkNewNameUsagesRetargeting[LocalVariableDescriptor]

'usages' @ [357:96] ==> val usages: SmartList<UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.rename.checkNewNameUsagesRetargeting[LocalVariableDescriptor]

'newUsages' @ [357:104] ==> value-parameter newUsages: MutableList<UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.rename.checkNewNameUsagesRetargeting[ValueParameterDescriptorImpl]

'usages' @ [358:9] ==> val usages: SmartList<UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.rename.checkNewNameUsagesRetargeting[LocalVariableDescriptor]

'filterIsInstanceTo' @ [358:16] ==> public inline fun <reified R, C : MutableCollection<in KtResolvableCollisionUsageInfo>> Iterable<*>.filterIsInstanceTo(destination: MutableList<UsageInfo>): MutableList<UsageInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> KtResolvableCollisionUsageInfo
    <C : MutableCollection<in R>> -> MutableList<UsageInfo>

'newUsages' @ [358:91] ==> value-parameter newUsages: MutableList<UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.rename.checkNewNameUsagesRetargeting[ValueParameterDescriptorImpl]

