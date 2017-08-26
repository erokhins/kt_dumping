'KtLightClassBase' @ [35:5] ==> protected constructor KtLightClassBase(manager: PsiManager) defined in org.jetbrains.kotlin.asJava.classes.KtLightClassBase[DeserializedClassConstructorDescriptor]

'clsDelegate' @ [35:22] ==> value-parameter clsDelegate: ClsClassImpl defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.KtLightClassForDecompiledDeclaration.<init>[ValueParameterDescriptorImpl]

'manager' @ [35:34] ==> public final val ClsClassImpl.manager: (PsiManager..PsiManager?)[MyPropertyDescriptor]

'kotlinOrigin' @ [36:18] ==> public open val kotlinOrigin: KtClassOrObject? defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.KtLightClassForDecompiledDeclaration[PropertyDescriptorImpl]

'fqName' @ [36:32] ==> public final val KtClassOrObject.fqName: FqName?[MyPropertyDescriptor]

'FqName' @ [36:42] ==> public constructor FqName(@NotNull p0: String) defined in org.jetbrains.kotlin.name.FqName[JavaClassConstructorDescriptor]

'clsDelegate' @ [36:49] ==> public open val clsDelegate: ClsClassImpl defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.KtLightClassForDecompiledDeclaration[PropertyDescriptorImpl]

'qualifiedName' @ [36:61] ==> public final val ClsClassImpl.qualifiedName: String[MyPropertyDescriptor]

'this' @ [38:27] ==> <this> defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.KtLightClassForDecompiledDeclaration[LazyClassReceiverParameterDescriptor]

'kotlinOrigin' @ [41:29] ==> public open val kotlinOrigin: KtClassOrObject? defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.KtLightClassForDecompiledDeclaration[PropertyDescriptorImpl]

'declarations' @ [41:43] ==> public final val KtClassOrObject.declarations: List<KtDeclaration>[MyPropertyDescriptor]

'filterIsInstance' @ [41:57] ==> public inline fun <reified R> Iterable<*>.filterIsInstance(): List<KtClassOrObject> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> KtClassOrObject

'emptyList' @ [41:96] ==> public fun <T> emptyList(): List<KtClassOrObject> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtClassOrObject

'clsDelegate' @ [42:16] ==> public open val clsDelegate: ClsClassImpl defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.KtLightClassForDecompiledDeclaration[PropertyDescriptorImpl]

'ownInnerClasses' @ [42:28] ==> public final val ClsClassImpl.ownInnerClasses: (MutableList<(PsiClass..PsiClass?)>..List<(PsiClass..PsiClass?)>)[MyPropertyDescriptor]

'map' @ [42:44] ==> public inline fun <T, R> Iterable<(PsiClass..PsiClass?)>.map(transform: ((PsiClass..PsiClass?)) -> KtLightClassForDecompiledDeclaration): List<KtLightClassForDecompiledDeclaration> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiClass..com.intellij.psi.PsiClass?)
    <R> -> KtLightClassForDecompiledDeclaration

'KtLightClassForDecompiledDeclaration' @ [43:13] ==> public constructor KtLightClassForDecompiledDeclaration(clsDelegate: ClsClassImpl, kotlinOrigin: KtClassOrObject?, file: KtClsFile) defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.KtLightClassForDecompiledDeclaration[ClassConstructorDescriptorImpl]

'innerClsClass' @ [43:50] ==> value-parameter innerClsClass: (PsiClass..PsiClass?) defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.KtLightClassForDecompiledDeclaration.getOwnInnerClasses.<anonymous>[ValueParameterDescriptorImpl]

'nestedClasses' @ [44:50] ==> val nestedClasses: List<KtClassOrObject> defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.KtLightClassForDecompiledDeclaration.getOwnInnerClasses[LocalVariableDescriptor]

'firstOrNull' @ [44:64] ==> public inline fun <T> Iterable<KtClassOrObject>.firstOrNull(predicate: (KtClassOrObject) -> Boolean): KtClassOrObject? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtClassOrObject

'innerClsClass' @ [44:78] ==> value-parameter innerClsClass: (PsiClass..PsiClass?) defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.KtLightClassForDecompiledDeclaration.getOwnInnerClasses.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [44:92] ==> public final var ClsClassImpl.name: String[MyPropertyDescriptor]

'it' @ [44:100] ==> value-parameter it: KtClassOrObject defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.KtLightClassForDecompiledDeclaration.getOwnInnerClasses.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [44:103] ==> public final val KtClassOrObject.name: String?[MyPropertyDescriptor]

'file' @ [44:111] ==> private final val file: KtClsFile defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.KtLightClassForDecompiledDeclaration[PropertyDescriptorImpl]

'clsDelegate' @ [49:16] ==> public open val clsDelegate: ClsClassImpl defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.KtLightClassForDecompiledDeclaration[PropertyDescriptorImpl]

'ownFields' @ [49:28] ==> public final val ClsClassImpl.ownFields: (MutableList<(PsiField..PsiField?)>..List<(PsiField..PsiField?)>)[MyPropertyDescriptor]

'map' @ [49:38] ==> public inline fun <T, R> Iterable<(PsiField..PsiField?)>.map(transform: ((PsiField..PsiField?)) -> KtLightField): List<KtLightField> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiField..com.intellij.psi.PsiField?)
    <R> -> KtLightField

'KtLightFieldImpl' @ [49:44] ==> public companion object Factory defined in org.jetbrains.kotlin.asJava.elements.KtLightFieldImpl[FakeCallableDescriptorForObject]

'create' @ [49:61] ==> public final fun create(origin: LightMemberOrigin?, delegate: PsiField, containingClass: KtLightClass): KtLightField defined in org.jetbrains.kotlin.asJava.elements.KtLightFieldImpl.Factory[DeserializedSimpleFunctionDescriptor]

'LightMemberOriginForCompiledField' @ [49:68] ==> public constructor LightMemberOriginForCompiledField(psiField: PsiField, file: KtClsFile) defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.LightMemberOriginForCompiledField[ClassConstructorDescriptorImpl]

'it' @ [49:102] ==> value-parameter it: (PsiField..PsiField?) defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.KtLightClassForDecompiledDeclaration.getOwnFields.<anonymous>[ValueParameterDescriptorImpl]

'file' @ [49:106] ==> private final val file: KtClsFile defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.KtLightClassForDecompiledDeclaration[PropertyDescriptorImpl]

'it' @ [49:113] ==> value-parameter it: (PsiField..PsiField?) defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.KtLightClassForDecompiledDeclaration.getOwnFields.<anonymous>[ValueParameterDescriptorImpl]

'this' @ [49:117] ==> <this> defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.KtLightClassForDecompiledDeclaration[LazyClassReceiverParameterDescriptor]

'clsDelegate' @ [53:16] ==> public open val clsDelegate: ClsClassImpl defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.KtLightClassForDecompiledDeclaration[PropertyDescriptorImpl]

'ownMethods' @ [53:28] ==> public final val ClsClassImpl.ownMethods: (MutableList<(PsiMethod..PsiMethod?)>..List<(PsiMethod..PsiMethod?)>)[MyPropertyDescriptor]

'map' @ [53:39] ==> public inline fun <T, R> Iterable<(PsiMethod..PsiMethod?)>.map(transform: ((PsiMethod..PsiMethod?)) -> KtLightMethodImpl): List<KtLightMethodImpl> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiMethod..com.intellij.psi.PsiMethod?)
    <R> -> KtLightMethodImpl

'KtLightMethodImpl' @ [53:45] ==> public companion object Factory defined in org.jetbrains.kotlin.asJava.elements.KtLightMethodImpl[FakeCallableDescriptorForObject]

'create' @ [53:63] ==> public final fun create(delegate: PsiMethod, origin: LightMemberOrigin?, containingClass: KtLightClass): KtLightMethodImpl defined in org.jetbrains.kotlin.asJava.elements.KtLightMethodImpl.Factory[DeserializedSimpleFunctionDescriptor]

'it' @ [53:70] ==> value-parameter it: (PsiMethod..PsiMethod?) defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.KtLightClassForDecompiledDeclaration.getOwnMethods.<anonymous>[ValueParameterDescriptorImpl]

'LightMemberOriginForCompiledMethod' @ [53:74] ==> public constructor LightMemberOriginForCompiledMethod(psiMethod: PsiMethod, file: KtClsFile) defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.LightMemberOriginForCompiledMethod[ClassConstructorDescriptorImpl]

'it' @ [53:109] ==> value-parameter it: (PsiMethod..PsiMethod?) defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.KtLightClassForDecompiledDeclaration.getOwnMethods.<anonymous>[ValueParameterDescriptorImpl]

'file' @ [53:113] ==> private final val file: KtClsFile defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.KtLightClassForDecompiledDeclaration[PropertyDescriptorImpl]

'this' @ [53:120] ==> <this> defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.KtLightClassForDecompiledDeclaration[LazyClassReceiverParameterDescriptor]

'kotlinOrigin' @ [56:43] ==> public open val kotlinOrigin: KtClassOrObject? defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.KtLightClassForDecompiledDeclaration[PropertyDescriptorImpl]

'navigationElement' @ [56:57] ==> public final val KtClassOrObject.navigationElement: PsiElement[MyPropertyDescriptor]

'file' @ [56:78] ==> private final val file: KtClsFile defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.KtLightClassForDecompiledDeclaration[PropertyDescriptorImpl]

'clsDelegate' @ [58:32] ==> public open val clsDelegate: ClsClassImpl defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.KtLightClassForDecompiledDeclaration[PropertyDescriptorImpl]

'parent' @ [58:44] ==> public final val ClsClassImpl.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'other' @ [61:13] ==> value-parameter other: Any? defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.KtLightClassForDecompiledDeclaration.equals[ValueParameterDescriptorImpl]

'fqName' @ [62:13] ==> public final val fqName: FqName defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.KtLightClassForDecompiledDeclaration[PropertyDescriptorImpl]

'other' @ [62:23] ==> value-parameter other: Any? defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.KtLightClassForDecompiledDeclaration.equals[ValueParameterDescriptorImpl]

'fqName' @ [62:29] ==> public final val fqName: FqName defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.KtLightClassForDecompiledDeclaration[PropertyDescriptorImpl]

'fqName' @ [65:13] ==> public final val fqName: FqName defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.KtLightClassForDecompiledDeclaration[PropertyDescriptorImpl]

'hashCode' @ [65:20] ==> public open fun hashCode(): Int defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'BINARY' @ [68:38] ==> enum entry BINARY defined in org.jetbrains.kotlin.load.java.structure.LightClassOriginKind[FakeCallableDescriptorForObject]

