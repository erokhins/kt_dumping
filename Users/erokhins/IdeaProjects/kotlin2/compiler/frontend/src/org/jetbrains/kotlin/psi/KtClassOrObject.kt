'super' @ [33:34] ==> public constructor KtTypeParameterListOwnerStub<T : (KotlinStubWithFqName<*>..KotlinStubWithFqName<*>?)>(@NotNull node: ASTNode) defined in org.jetbrains.kotlin.psi.KtTypeParameterListOwnerStub[JavaClassConstructorDescriptor]
Inferred types:
    <T : (KotlinStubWithFqName<*>..KotlinStubWithFqName<*>?)> -> KotlinClassOrObjectStub<out KtClassOrObject>

'node' @ [33:40] ==> value-parameter node: ASTNode defined in org.jetbrains.kotlin.psi.KtClassOrObject.<init>[ValueParameterDescriptorImpl]

'super' @ [34:105] ==> public constructor KtTypeParameterListOwnerStub<T : (KotlinStubWithFqName<*>..KotlinStubWithFqName<*>?)>(@NotNull stub: KotlinClassOrObjectStub<out KtClassOrObject>, @NotNull nodeType: raw (IStubElementType<(StubElement<*>..StubElement<*>?), (PsiElement..PsiElement?)>..IStubElementType<out (StubElement<*>..StubElement<*>?), *>)) defined in org.jetbrains.kotlin.psi.KtTypeParameterListOwnerStub[JavaClassConstructorDescriptor]
Inferred types:
    <T : (KotlinStubWithFqName<*>..KotlinStubWithFqName<*>?)> -> KotlinClassOrObjectStub<out KtClassOrObject>

'stub' @ [34:111] ==> value-parameter stub: KotlinClassOrObjectStub<out KtClassOrObject> defined in org.jetbrains.kotlin.psi.KtClassOrObject.<init>[ValueParameterDescriptorImpl]

'nodeType' @ [34:117] ==> value-parameter nodeType: IStubElementType<*, *> defined in org.jetbrains.kotlin.psi.KtClassOrObject.<init>[ValueParameterDescriptorImpl]

'getStubOrPsiChild' @ [36:48] ==> @Nullable public open fun <Psi : (PsiElement..PsiElement?)> getStubOrPsiChild(@NotNull p0: IStubElementType<out raw (StubElement<(PsiElement..PsiElement?)>..StubElement<*>?), (KtSuperTypeList..KtSuperTypeList?)>): KtSuperTypeList? defined in org.jetbrains.kotlin.psi.KtClassOrObject[JavaMethodDescriptor]
Inferred types:
    <Psi : (PsiElement..PsiElement?)> -> KtSuperTypeList

'SUPER_TYPE_LIST' @ [36:85] ==> public final val SUPER_TYPE_LIST: (KtPlaceHolderStubElementType<(KtSuperTypeList..KtSuperTypeList?)>..KtPlaceHolderStubElementType<(KtSuperTypeList..KtSuperTypeList?)>?) defined in org.jetbrains.kotlin.psi.stubs.elements.KtStubElementTypes[JavaPropertyDescriptor]

'getSuperTypeList' @ [38:74] ==> public final fun getSuperTypeList(): KtSuperTypeList? defined in org.jetbrains.kotlin.psi.KtClassOrObject[SimpleFunctionDescriptorImpl]

'entries' @ [38:94] ==> public final val KtSuperTypeList.entries: (MutableList<(KtSuperTypeListEntry..KtSuperTypeListEntry?)>..List<(KtSuperTypeListEntry..KtSuperTypeListEntry?)>?)[MyPropertyDescriptor]

'orEmpty' @ [38:102] ==> @InlineOnly public inline fun <T> List<(KtSuperTypeListEntry..KtSuperTypeListEntry?)>?.orEmpty(): List<(KtSuperTypeListEntry..KtSuperTypeListEntry?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtSuperTypeListEntry..org.jetbrains.kotlin.psi.KtSuperTypeListEntry?)

'getSuperTypeList' @ [41:9] ==> public final fun getSuperTypeList(): KtSuperTypeList? defined in org.jetbrains.kotlin.psi.KtClassOrObject[SimpleFunctionDescriptorImpl]

'let' @ [41:29] ==> @InlineOnly public inline fun <T, R> KtSuperTypeList.let(block: (KtSuperTypeList) -> Nothing): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtSuperTypeList
    <R> -> Nothing

'it' @ [42:26] ==> value-parameter it: KtSuperTypeList defined in org.jetbrains.kotlin.psi.KtClassOrObject.addSuperTypeListEntry.<anonymous>[ValueParameterDescriptorImpl]

'entries' @ [42:29] ==> public final val KtSuperTypeList.entries: (MutableList<(KtSuperTypeListEntry..KtSuperTypeListEntry?)>..List<(KtSuperTypeListEntry..KtSuperTypeListEntry?)>?)[MyPropertyDescriptor]

'singleOrNull' @ [42:37] ==> public fun <T> List<(KtSuperTypeListEntry..KtSuperTypeListEntry?)>.singleOrNull(): KtSuperTypeListEntry? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtSuperTypeListEntry..org.jetbrains.kotlin.psi.KtSuperTypeListEntry?)

'single' @ [43:17] ==> val single: KtSuperTypeListEntry? defined in org.jetbrains.kotlin.psi.KtClassOrObject.addSuperTypeListEntry.<anonymous>[LocalVariableDescriptor]

'single' @ [43:35] ==> val single: KtSuperTypeListEntry? defined in org.jetbrains.kotlin.psi.KtClassOrObject.addSuperTypeListEntry.<anonymous>[LocalVariableDescriptor]

'typeReference' @ [43:42] ==> public final val KtSuperTypeListEntry.typeReference: KtTypeReference?[MyPropertyDescriptor]

'typeElement' @ [43:57] ==> public final val typeElement: KtTypeElement? defined in org.jetbrains.kotlin.psi.KtTypeReference[PropertyDescriptorImpl]

'single' @ [44:24] ==> val single: KtSuperTypeListEntry? defined in org.jetbrains.kotlin.psi.KtClassOrObject.addSuperTypeListEntry.<anonymous>[LocalVariableDescriptor]

'replace' @ [44:31] ==> public open fun replace(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtSuperTypeListEntry[JavaMethodDescriptor]

'superTypeListEntry' @ [44:39] ==> value-parameter superTypeListEntry: KtSuperTypeListEntry defined in org.jetbrains.kotlin.psi.KtClassOrObject.addSuperTypeListEntry[ValueParameterDescriptorImpl]

'EditCommaSeparatedListHelper' @ [46:20] ==> public object EditCommaSeparatedListHelper defined in org.jetbrains.kotlin.psi in file EditCommaSeparatedListHelper.kt[FakeCallableDescriptorForObject]

'addItem' @ [46:49] ==> @JvmOverloads public final fun <TItem : KtElement> addItem(list: KtElement, allItems: List<KtSuperTypeListEntry>, item: KtSuperTypeListEntry, prefix: KtToken = ...): KtSuperTypeListEntry defined in org.jetbrains.kotlin.psi.EditCommaSeparatedListHelper[SimpleFunctionDescriptorImpl]
Inferred types:
    <TItem : KtElement> -> KtSuperTypeListEntry

'it' @ [46:57] ==> value-parameter it: KtSuperTypeList defined in org.jetbrains.kotlin.psi.KtClassOrObject.addSuperTypeListEntry.<anonymous>[ValueParameterDescriptorImpl]

'superTypeListEntries' @ [46:61] ==> public final val KtClassOrObject.superTypeListEntries: List<KtSuperTypeListEntry>[MyPropertyDescriptor]

'superTypeListEntry' @ [46:83] ==> value-parameter superTypeListEntry: KtSuperTypeListEntry defined in org.jetbrains.kotlin.psi.KtClassOrObject.addSuperTypeListEntry[ValueParameterDescriptorImpl]

'KtPsiFactory' @ [49:26] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi in file KtPsiFactory.kt[SimpleFunctionDescriptorImpl]

'this' @ [49:39] ==> <this> defined in org.jetbrains.kotlin.psi.KtClassOrObject[LazyClassReceiverParameterDescriptor]

'psiFactory' @ [50:34] ==> val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.psi.KtClassOrObject.addSuperTypeListEntry[LocalVariableDescriptor]

'createSuperTypeCallEntry' @ [50:45] ==> public final fun createSuperTypeCallEntry(text: String): KtSuperTypeCallEntry defined in org.jetbrains.kotlin.psi.KtPsiFactory[SimpleFunctionDescriptorImpl]

'replace' @ [50:77] ==> public open fun replace(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtSuperTypeCallEntry[JavaMethodDescriptor]

'superTypeListEntry' @ [50:85] ==> value-parameter superTypeListEntry: KtSuperTypeListEntry defined in org.jetbrains.kotlin.psi.KtClassOrObject.addSuperTypeListEntry[ValueParameterDescriptorImpl]

'parent' @ [50:105] ==> public final val PsiElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'addBefore' @ [51:21] ==> public open fun addBefore(@NotNull p0: PsiElement, p1: PsiElement?): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtClassOrObject[JavaMethodDescriptor]

'psiFactory' @ [51:31] ==> val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.psi.KtClassOrObject.addSuperTypeListEntry[LocalVariableDescriptor]

'createColon' @ [51:42] ==> public final fun createColon(): PsiElement defined in org.jetbrains.kotlin.psi.KtPsiFactory[SimpleFunctionDescriptorImpl]

'getBody' @ [51:57] ==> public final fun getBody(): KtClassBody? defined in org.jetbrains.kotlin.psi.KtClassOrObject[SimpleFunctionDescriptorImpl]

'addAfter' @ [52:17] ==> public open fun addAfter(@NotNull p0: PsiElement, p1: PsiElement?): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtClassOrObject[JavaMethodDescriptor]

'specifierListToAdd' @ [52:26] ==> val specifierListToAdd: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtClassOrObject.addSuperTypeListEntry[LocalVariableDescriptor]

'colon' @ [52:46] ==> val colon: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtClassOrObject.addSuperTypeListEntry[LocalVariableDescriptor]

'entries' @ [52:73] ==> public final val KtSuperTypeList.entries: (MutableList<(KtSuperTypeListEntry..KtSuperTypeListEntry?)>..List<(KtSuperTypeListEntry..KtSuperTypeListEntry?)>?)[MyPropertyDescriptor]

'first' @ [52:81] ==> public fun <T> List<(KtSuperTypeListEntry..KtSuperTypeListEntry?)>.first(): (KtSuperTypeListEntry..KtSuperTypeListEntry?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtSuperTypeListEntry..org.jetbrains.kotlin.psi.KtSuperTypeListEntry?)

'getSuperTypeList' @ [56:29] ==> public final fun getSuperTypeList(): KtSuperTypeList? defined in org.jetbrains.kotlin.psi.KtClassOrObject[SimpleFunctionDescriptorImpl]

'assert' @ [57:9] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'superTypeListEntry' @ [57:16] ==> value-parameter superTypeListEntry: KtSuperTypeListEntry defined in org.jetbrains.kotlin.psi.KtClassOrObject.removeSuperTypeListEntry[ValueParameterDescriptorImpl]

'parent' @ [57:35] ==> public final val KtSuperTypeListEntry.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'specifierList' @ [57:46] ==> val specifierList: KtSuperTypeList defined in org.jetbrains.kotlin.psi.KtClassOrObject.removeSuperTypeListEntry[LocalVariableDescriptor]

'if (specifierList.entries.size > 1) {
            EditCommaSeparatedListHelper.removeItem<KtElement>(superTypeListEntry)
        }
        else {
            deleteChildRange(findChildByType<PsiElement>(KtTokens.COLON) ?: specifierList, specifierList)
        }' @ [59:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'specifierList' @ [59:13] ==> val specifierList: KtSuperTypeList defined in org.jetbrains.kotlin.psi.KtClassOrObject.removeSuperTypeListEntry[LocalVariableDescriptor]

'entries' @ [59:27] ==> public final val KtSuperTypeList.entries: (MutableList<(KtSuperTypeListEntry..KtSuperTypeListEntry?)>..List<(KtSuperTypeListEntry..KtSuperTypeListEntry?)>?)[MyPropertyDescriptor]

'size' @ [59:35] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'EditCommaSeparatedListHelper' @ [60:13] ==> public object EditCommaSeparatedListHelper defined in org.jetbrains.kotlin.psi in file EditCommaSeparatedListHelper.kt[FakeCallableDescriptorForObject]

'removeItem' @ [60:42] ==> public final fun <TItem : KtElement> removeItem(item: KtElement): Unit defined in org.jetbrains.kotlin.psi.EditCommaSeparatedListHelper[SimpleFunctionDescriptorImpl]
Inferred types:
    <TItem : KtElement> -> KtElement

'superTypeListEntry' @ [60:64] ==> value-parameter superTypeListEntry: KtSuperTypeListEntry defined in org.jetbrains.kotlin.psi.KtClassOrObject.removeSuperTypeListEntry[ValueParameterDescriptorImpl]

'deleteChildRange' @ [63:13] ==> public open fun deleteChildRange(p0: (PsiElement..PsiElement?), p1: (PsiElement..PsiElement?)): Unit defined in org.jetbrains.kotlin.psi.KtClassOrObject[JavaMethodDescriptor]

'findChildByType' @ [63:30] ==> @Nullable protected/*protected and package*/ open fun <T : (PsiElement..PsiElement?)> findChildByType(p0: (IElementType..IElementType?)): PsiElement? defined in org.jetbrains.kotlin.psi.KtClassOrObject[JavaMethodDescriptor]
Inferred types:
    <T : (PsiElement..PsiElement?)> -> PsiElement

'COLON' @ [63:67] ==> public final val COLON: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'specifierList' @ [63:77] ==> val specifierList: KtSuperTypeList defined in org.jetbrains.kotlin.psi.KtClassOrObject.removeSuperTypeListEntry[LocalVariableDescriptor]

'specifierList' @ [63:92] ==> val specifierList: KtSuperTypeList defined in org.jetbrains.kotlin.psi.KtClassOrObject.removeSuperTypeListEntry[LocalVariableDescriptor]

'getBody' @ [67:68] ==> public final fun getBody(): KtClassBody? defined in org.jetbrains.kotlin.psi.KtClassOrObject[SimpleFunctionDescriptorImpl]

'anonymousInitializers' @ [67:79] ==> public final val anonymousInitializers: List<KtAnonymousInitializer> defined in org.jetbrains.kotlin.psi.KtClassBody[PropertyDescriptorImpl]

'orEmpty' @ [67:101] ==> @InlineOnly public inline fun <T> List<KtAnonymousInitializer>?.orEmpty(): List<KtAnonymousInitializer> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtAnonymousInitializer

'getStubOrPsiChild' @ [69:35] ==> @Nullable public open fun <Psi : (PsiElement..PsiElement?)> getStubOrPsiChild(@NotNull p0: IStubElementType<out raw (StubElement<(PsiElement..PsiElement?)>..StubElement<*>?), (KtClassBody..KtClassBody?)>): KtClassBody? defined in org.jetbrains.kotlin.psi.KtClassOrObject[JavaMethodDescriptor]
Inferred types:
    <Psi : (PsiElement..PsiElement?)> -> KtClassBody

'CLASS_BODY' @ [69:72] ==> public final val CLASS_BODY: (KtPlaceHolderStubElementType<(KtClassBody..KtClassBody?)>..KtPlaceHolderStubElementType<(KtClassBody..KtClassBody?)>?) defined in org.jetbrains.kotlin.psi.stubs.elements.KtStubElementTypes[JavaPropertyDescriptor]

'getOrCreateBody' @ [72:20] ==> public fun KtClassOrObject.getOrCreateBody(): KtClassBody defined in org.jetbrains.kotlin.psi in file KtClassOrObject.kt[SimpleFunctionDescriptorImpl]

'skipSiblingsBackward' @ [73:34] ==> @Nullable @Contract public open fun skipSiblingsBackward(@Nullable p0: PsiElement?, @NotNull vararg p1: raw (Class<(Any..Any?)>..Class<*>?)): PsiElement? defined in com.intellij.psi.util.PsiTreeUtil[JavaMethodDescriptor]

'body' @ [73:55] ==> val body: KtClassBody defined in org.jetbrains.kotlin.psi.KtClassOrObject.addDeclaration[LocalVariableDescriptor]

'rBrace' @ [73:60] ==> public final val rBrace: PsiElement? defined in org.jetbrains.kotlin.psi.KtClassBody[PropertyDescriptorImpl]

'body' @ [73:70] ==> val body: KtClassBody defined in org.jetbrains.kotlin.psi.KtClassOrObject.addDeclaration[LocalVariableDescriptor]

'lastChild' @ [73:75] ==> public final val KtClassBody.lastChild: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'java' @ [73:109] ==> public val <T> KClass<PsiWhiteSpace>.java: Class<PsiWhiteSpace> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> PsiWhiteSpace

'body' @ [74:16] ==> val body: KtClassBody defined in org.jetbrains.kotlin.psi.KtClassOrObject.addDeclaration[LocalVariableDescriptor]

'addAfter' @ [74:21] ==> public open fun addAfter(@NotNull p0: PsiElement, p1: PsiElement?): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtClassBody[JavaMethodDescriptor]

'declaration' @ [74:30] ==> value-parameter declaration: T defined in org.jetbrains.kotlin.psi.KtClassOrObject.addDeclaration[ValueParameterDescriptorImpl]

'anchor' @ [74:43] ==> val anchor: PsiElement? defined in org.jetbrains.kotlin.psi.KtClassOrObject.addDeclaration[LocalVariableDescriptor]

'anchor' @ [78:28] ==> value-parameter anchor: PsiElement? defined in org.jetbrains.kotlin.psi.KtClassOrObject.addDeclarationAfter[ValueParameterDescriptorImpl]

'declarations' @ [78:38] ==> public final val KtClassOrObject.declarations: List<KtDeclaration>[MyPropertyDescriptor]

'lastOrNull' @ [78:51] ==> public fun <T> List<KtDeclaration>.lastOrNull(): KtDeclaration? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtDeclaration

'addDeclaration' @ [78:74] ==> public final inline fun <reified T : KtDeclaration> addDeclaration(declaration: T): T defined in org.jetbrains.kotlin.psi.KtClassOrObject[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T : KtDeclaration> -> T

'declaration' @ [78:89] ==> value-parameter declaration: T defined in org.jetbrains.kotlin.psi.KtClassOrObject.addDeclarationAfter[ValueParameterDescriptorImpl]

'getOrCreateBody' @ [79:16] ==> public fun KtClassOrObject.getOrCreateBody(): KtClassBody defined in org.jetbrains.kotlin.psi in file KtClassOrObject.kt[SimpleFunctionDescriptorImpl]

'addAfter' @ [79:34] ==> public open fun addAfter(@NotNull p0: PsiElement, p1: PsiElement?): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtClassBody[JavaMethodDescriptor]

'declaration' @ [79:43] ==> value-parameter declaration: T defined in org.jetbrains.kotlin.psi.KtClassOrObject.addDeclarationAfter[ValueParameterDescriptorImpl]

'anchorBefore' @ [79:56] ==> val anchorBefore: PsiElement defined in org.jetbrains.kotlin.psi.KtClassOrObject.addDeclarationAfter[LocalVariableDescriptor]

'anchor' @ [83:27] ==> value-parameter anchor: PsiElement? defined in org.jetbrains.kotlin.psi.KtClassOrObject.addDeclarationBefore[ValueParameterDescriptorImpl]

'declarations' @ [83:37] ==> public final val KtClassOrObject.declarations: List<KtDeclaration>[MyPropertyDescriptor]

'firstOrNull' @ [83:50] ==> public fun <T> List<KtDeclaration>.firstOrNull(): KtDeclaration? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtDeclaration

'addDeclaration' @ [83:74] ==> public final inline fun <reified T : KtDeclaration> addDeclaration(declaration: T): T defined in org.jetbrains.kotlin.psi.KtClassOrObject[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T : KtDeclaration> -> T

'declaration' @ [83:89] ==> value-parameter declaration: T defined in org.jetbrains.kotlin.psi.KtClassOrObject.addDeclarationBefore[ValueParameterDescriptorImpl]

'getOrCreateBody' @ [84:16] ==> public fun KtClassOrObject.getOrCreateBody(): KtClassBody defined in org.jetbrains.kotlin.psi in file KtClassOrObject.kt[SimpleFunctionDescriptorImpl]

'addBefore' @ [84:34] ==> public open fun addBefore(@NotNull p0: PsiElement, p1: PsiElement?): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtClassBody[JavaMethodDescriptor]

'declaration' @ [84:44] ==> value-parameter declaration: T defined in org.jetbrains.kotlin.psi.KtClassOrObject.addDeclarationBefore[ValueParameterDescriptorImpl]

'anchorAfter' @ [84:57] ==> val anchorAfter: PsiElement defined in org.jetbrains.kotlin.psi.KtClassOrObject.addDeclarationBefore[LocalVariableDescriptor]

'stub' @ [87:33] ==> public final val KtClassOrObject.stub: KotlinClassOrObjectStub<out KtClassOrObject>?[MyPropertyDescriptor]

'isTopLevel' @ [87:39] ==> public abstract fun isTopLevel(): Boolean defined in org.jetbrains.kotlin.psi.stubs.KotlinClassOrObjectStub[SimpleFunctionDescriptorImpl]

'parent' @ [87:56] ==> public final val KtClassOrObject.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'stub' @ [89:39] ==> public final val KtClassOrObject.stub: KotlinClassOrObjectStub<out KtClassOrObject>?[MyPropertyDescriptor]

'isLocal' @ [89:45] ==> public abstract fun isLocal(): Boolean defined in org.jetbrains.kotlin.psi.stubs.KotlinClassOrObjectStub[SimpleFunctionDescriptorImpl]

'isLocal' @ [89:68] ==> public open fun isLocal(@NotNull declaration: KtDeclaration): Boolean defined in org.jetbrains.kotlin.psi.KtPsiUtil[JavaMethodDescriptor]

'this' @ [89:76] ==> <this> defined in org.jetbrains.kotlin.psi.KtClassOrObject[LazyClassReceiverParameterDescriptor]

'getBody' @ [91:59] ==> public final fun getBody(): KtClassBody? defined in org.jetbrains.kotlin.psi.KtClassOrObject[SimpleFunctionDescriptorImpl]

'declarations' @ [91:70] ==> public final val KtClassBody.declarations: (MutableList<(KtDeclaration..KtDeclaration?)>..List<(KtDeclaration..KtDeclaration?)>?)[MyPropertyDescriptor]

'orEmpty' @ [91:83] ==> @InlineOnly public inline fun <T> List<(KtDeclaration..KtDeclaration?)>?.orEmpty(): List<(KtDeclaration..KtDeclaration?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtDeclaration..org.jetbrains.kotlin.psi.KtDeclaration?)

'getItemPresentation' @ [93:83] ==> @Nullable public open fun getItemPresentation(@NotNull p0: NavigationItem): ItemPresentation? defined in com.intellij.navigation.ItemPresentationProviders[JavaMethodDescriptor]

'this' @ [93:103] ==> <this> defined in org.jetbrains.kotlin.psi.KtClassOrObject[LazyClassReceiverParameterDescriptor]

'getStubOrPsiChild' @ [95:67] ==> @Nullable public open fun <Psi : (PsiElement..PsiElement?)> getStubOrPsiChild(@NotNull p0: IStubElementType<out raw (StubElement<(PsiElement..PsiElement?)>..StubElement<*>?), (KtPrimaryConstructor..KtPrimaryConstructor?)>): KtPrimaryConstructor? defined in org.jetbrains.kotlin.psi.KtClassOrObject[JavaMethodDescriptor]
Inferred types:
    <Psi : (PsiElement..PsiElement?)> -> KtPrimaryConstructor

'PRIMARY_CONSTRUCTOR' @ [95:104] ==> public final val PRIMARY_CONSTRUCTOR: (KtPlaceHolderStubElementType<(KtPrimaryConstructor..KtPrimaryConstructor?)>..KtPlaceHolderStubElementType<(KtPrimaryConstructor..KtPrimaryConstructor?)>?) defined in org.jetbrains.kotlin.psi.stubs.elements.KtStubElementTypes[JavaPropertyDescriptor]

'primaryConstructor' @ [97:73] ==> public final val KtClassOrObject.primaryConstructor: KtPrimaryConstructor?[MyPropertyDescriptor]

'modifierList' @ [97:93] ==> public final val KtPrimaryConstructor.modifierList: KtModifierList?[MyPropertyDescriptor]

'primaryConstructor' @ [99:66] ==> public final val KtClassOrObject.primaryConstructor: KtPrimaryConstructor?[MyPropertyDescriptor]

'valueParameterList' @ [99:86] ==> public final val KtPrimaryConstructor.valueParameterList: KtParameterList?[MyPropertyDescriptor]

'getPrimaryConstructorParameterList' @ [101:73] ==> public final fun getPrimaryConstructorParameterList(): KtParameterList? defined in org.jetbrains.kotlin.psi.KtClassOrObject[SimpleFunctionDescriptorImpl]

'parameters' @ [101:111] ==> public final val KtParameterList.parameters: (MutableList<(KtParameter..KtParameter?)>..List<(KtParameter..KtParameter?)>)[MyPropertyDescriptor]

'orEmpty' @ [101:122] ==> @InlineOnly public inline fun <T> List<(KtParameter..KtParameter?)>?.orEmpty(): List<(KtParameter..KtParameter?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtParameter..org.jetbrains.kotlin.psi.KtParameter?)

'primaryConstructor' @ [103:61] ==> public final val KtClassOrObject.primaryConstructor: KtPrimaryConstructor?[MyPropertyDescriptor]

'hasExplicitPrimaryConstructor' @ [105:53] ==> public open fun hasExplicitPrimaryConstructor(): Boolean defined in org.jetbrains.kotlin.psi.KtClassOrObject[SimpleFunctionDescriptorImpl]

'!' @ [105:88] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'hasSecondaryConstructors' @ [105:89] ==> private final fun hasSecondaryConstructors(): Boolean defined in org.jetbrains.kotlin.psi.KtClassOrObject[SimpleFunctionDescriptorImpl]

'!' @ [107:55] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'secondaryConstructors' @ [107:56] ==> public final val KtClassOrObject.secondaryConstructors: List<KtSecondaryConstructor>[MyPropertyDescriptor]

'isEmpty' @ [107:78] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'getBody' @ [109:77] ==> public final fun getBody(): KtClassBody? defined in org.jetbrains.kotlin.psi.KtClassOrObject[SimpleFunctionDescriptorImpl]

'secondaryConstructors' @ [109:88] ==> internal final val secondaryConstructors: List<KtSecondaryConstructor> defined in org.jetbrains.kotlin.psi.KtClassBody[PropertyDescriptorImpl]

'orEmpty' @ [109:110] ==> @InlineOnly public inline fun <T> List<KtSecondaryConstructor>?.orEmpty(): List<KtSecondaryConstructor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtSecondaryConstructor

'hasModifier' @ [111:35] ==> @Override public open fun hasModifier(@NotNull modifier: KtModifierKeywordToken): Boolean defined in org.jetbrains.kotlin.psi.KtClassOrObject[JavaMethodDescriptor]

'ANNOTATION_KEYWORD' @ [111:56] ==> public final val ANNOTATION_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'checkWritable' @ [114:19] ==> public open fun checkWritable(@NotNull p0: PsiElement): Unit defined in com.intellij.psi.impl.CheckUtil[JavaMethodDescriptor]

'this' @ [114:33] ==> <this> defined in org.jetbrains.kotlin.psi.KtClassOrObject[LazyClassReceiverParameterDescriptor]

'containingKtFile' @ [116:20] ==> public final val KtClassOrObject.containingKtFile: KtFile[MyPropertyDescriptor]

'if (!isTopLevel() || file.declarations.size > 1) {
            super.delete()
        }
        else {
            file.delete()
        }' @ [117:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'!' @ [117:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isTopLevel' @ [117:14] ==> public final fun isTopLevel(): Boolean defined in org.jetbrains.kotlin.psi.KtClassOrObject[SimpleFunctionDescriptorImpl]

'file' @ [117:30] ==> val file: KtFile defined in org.jetbrains.kotlin.psi.KtClassOrObject.delete[LocalVariableDescriptor]

'declarations' @ [117:35] ==> public final val KtFile.declarations: List<(KtDeclaration..KtDeclaration?)>[MyPropertyDescriptor]

'size' @ [117:48] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'super' @ [118:13] ==> <this> defined in org.jetbrains.kotlin.psi.KtClassOrObject[LazyClassReceiverParameterDescriptor]

'delete' @ [118:19] ==> @Override public open fun delete(): Unit defined in org.jetbrains.kotlin.psi.KtTypeParameterListOwnerStub[JavaMethodDescriptor]

'file' @ [121:13] ==> val file: KtFile defined in org.jetbrains.kotlin.psi.KtClassOrObject.delete[LocalVariableDescriptor]

'delete' @ [121:18] ==> public open fun delete(): Unit defined in org.jetbrains.kotlin.psi.KtFile[JavaMethodDescriptor]

'getBody' @ [127:5] ==> public final fun getBody(): KtClassBody? defined in org.jetbrains.kotlin.psi.KtClassOrObject[SimpleFunctionDescriptorImpl]

'let' @ [127:16] ==> @InlineOnly public inline fun <T, R> KtClassBody.let(block: (KtClassBody) -> Nothing): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtClassBody
    <R> -> Nothing

'it' @ [127:29] ==> value-parameter it: KtClassBody defined in org.jetbrains.kotlin.psi.getOrCreateBody.<anonymous>[ValueParameterDescriptorImpl]

'KtPsiFactory' @ [129:19] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi in file KtPsiFactory.kt[SimpleFunctionDescriptorImpl]

'this' @ [129:32] ==> <this> defined in org.jetbrains.kotlin.psi.getOrCreateBody[ReceiverParameterDescriptorImpl]

'createEmptyClassBody' @ [129:38] ==> public final fun createEmptyClassBody(): KtClassBody defined in org.jetbrains.kotlin.psi.KtPsiFactory[SimpleFunctionDescriptorImpl]

'this' @ [130:9] ==> <this> defined in org.jetbrains.kotlin.psi.getOrCreateBody[ReceiverParameterDescriptorImpl]

'addAfter' @ [130:37] ==> public open fun addAfter(@NotNull p0: PsiElement, p1: PsiElement?): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtClassOrObject[JavaMethodDescriptor]

'newBody' @ [130:46] ==> val newBody: KtClassBody defined in org.jetbrains.kotlin.psi.getOrCreateBody[LocalVariableDescriptor]

'initializerList' @ [130:55] ==> public final val KtEnumEntry.initializerList: KtInitializerList?[MyPropertyDescriptor]

'nameIdentifier' @ [130:74] ==> public final val KtEnumEntry.nameIdentifier: PsiElement?[MyPropertyDescriptor]

'add' @ [131:12] ==> public open fun add(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtClassOrObject[JavaMethodDescriptor]

'newBody' @ [131:16] ==> val newBody: KtClassBody defined in org.jetbrains.kotlin.psi.getOrCreateBody[LocalVariableDescriptor]

