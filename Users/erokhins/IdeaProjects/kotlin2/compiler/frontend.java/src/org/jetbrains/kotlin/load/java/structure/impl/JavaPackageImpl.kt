'JavaElementImpl<PsiPackage>' @ [27:5] ==> protected/*protected and package*/ constructor JavaElementImpl<Psi : (PsiElement..PsiElement?)>(@NotNull psiElement: PsiPackage) defined in org.jetbrains.kotlin.load.java.structure.impl.JavaElementImpl[JavaClassConstructorDescriptor]
Inferred types:
    <Psi : (PsiElement..PsiElement?)> -> PsiPackage

'psiPackage' @ [27:33] ==> value-parameter psiPackage: PsiPackage defined in org.jetbrains.kotlin.load.java.structure.impl.JavaPackageImpl.<init>[ValueParameterDescriptorImpl]

'psi' @ [30:26] ==> public final val JavaPackageImpl.psi: PsiPackage[MyPropertyDescriptor]

'getClasses' @ [30:30] ==> @NotNull public abstract fun getClasses(@NotNull p0: GlobalSearchScope): (Array<(PsiClass..PsiClass?)>..Array<out (PsiClass..PsiClass?)>) defined in com.intellij.psi.PsiPackage[JavaMethodDescriptor]

'scope' @ [30:41] ==> private final val scope: GlobalSearchScope defined in org.jetbrains.kotlin.load.java.structure.impl.JavaPackageImpl[PropertyDescriptorImpl]

'filter' @ [30:48] ==> public inline fun <T> Array<out (PsiClass..PsiClass?)>.filter(predicate: ((PsiClass..PsiClass?)) -> Boolean): List<(PsiClass..PsiClass?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiClass..com.intellij.psi.PsiClass?)

'it' @ [31:24] ==> value-parameter it: (PsiClass..PsiClass?) defined in org.jetbrains.kotlin.load.java.structure.impl.JavaPackageImpl.getClasses.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [31:27] ==> public final val PsiClass.name: String?[MyPropertyDescriptor]

'name' @ [32:13] ==> val name: String? defined in org.jetbrains.kotlin.load.java.structure.impl.JavaPackageImpl.getClasses.<anonymous>[LocalVariableDescriptor]

'invoke' @ [32:29] ==> public abstract operator fun invoke(p1: Name): Boolean defined in kotlin.Function1[FunctionInvokeDescriptor]

'identifier' @ [32:45] ==> @NotNull public open fun identifier(@NotNull p0: String): Name defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'name' @ [32:56] ==> val name: String? defined in org.jetbrains.kotlin.load.java.structure.impl.JavaPackageImpl.getClasses.<anonymous>[LocalVariableDescriptor]

'classes' @ [34:16] ==> internal fun classes(classes: Collection<PsiClass>): Collection<JavaClass> defined in org.jetbrains.kotlin.load.java.structure.impl in file JavaElementCollectionFromPsiArrayUtil.kt[SimpleFunctionDescriptorImpl]

'psiClasses' @ [34:24] ==> val psiClasses: List<(PsiClass..PsiClass?)> defined in org.jetbrains.kotlin.load.java.structure.impl.JavaPackageImpl.getClasses[LocalVariableDescriptor]

'packages' @ [38:17] ==> internal fun packages(packages: Array<PsiPackage>, scope: GlobalSearchScope): Collection<JavaPackage> defined in org.jetbrains.kotlin.load.java.structure.impl in file JavaElementCollectionFromPsiArrayUtil.kt[SimpleFunctionDescriptorImpl]

'psi' @ [38:26] ==> public final val JavaPackageImpl.psi: PsiPackage[MyPropertyDescriptor]

'getSubPackages' @ [38:30] ==> @NotNull public abstract fun getSubPackages(@NotNull p0: GlobalSearchScope): (Array<(PsiPackage..PsiPackage?)>..Array<out (PsiPackage..PsiPackage?)>) defined in com.intellij.psi.PsiPackage[JavaMethodDescriptor]

'scope' @ [38:45] ==> private final val scope: GlobalSearchScope defined in org.jetbrains.kotlin.load.java.structure.impl.JavaPackageImpl[PropertyDescriptorImpl]

'scope' @ [38:53] ==> private final val scope: GlobalSearchScope defined in org.jetbrains.kotlin.load.java.structure.impl.JavaPackageImpl[PropertyDescriptorImpl]

'FqName' @ [41:17] ==> public constructor FqName(@NotNull p0: String) defined in org.jetbrains.kotlin.name.FqName[JavaClassConstructorDescriptor]

'psi' @ [41:24] ==> public final val JavaPackageImpl.psi: PsiPackage[MyPropertyDescriptor]

'qualifiedName' @ [41:28] ==> public final val PsiPackage.qualifiedName: String[MyPropertyDescriptor]

'psi' @ [45:32] ==> public final val JavaPackageImpl.psi: PsiPackage[MyPropertyDescriptor]

'annotationList' @ [45:36] ==> public final val PsiPackage.annotationList: PsiModifierList?[MyPropertyDescriptor]

'annotations' @ [45:52] ==> public final val PsiModifierList.annotations: (Array<(PsiAnnotation..PsiAnnotation?)>..Array<out (PsiAnnotation..PsiAnnotation?)>)[MyPropertyDescriptor]

'orEmpty' @ [45:64] ==> public inline fun <reified T> Array<out (PsiAnnotation..PsiAnnotation?)>?.orEmpty(): Array<out (PsiAnnotation..PsiAnnotation?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> (com.intellij.psi.PsiAnnotation..com.intellij.psi.PsiAnnotation?)

'annotations' @ [46:66] ==> internal fun annotations(annotations: Array<out PsiAnnotation>): Collection<JavaAnnotation> defined in org.jetbrains.kotlin.load.java.structure.impl in file JavaElementCollectionFromPsiArrayUtil.kt[SimpleFunctionDescriptorImpl]

'annotations1' @ [46:78] ==> val annotations1: Array<out (PsiAnnotation..PsiAnnotation?)> defined in org.jetbrains.kotlin.load.java.structure.impl.JavaPackageImpl.<get-annotations>[LocalVariableDescriptor]

'buildLazyValueForMap' @ [49:71] ==> public fun JavaAnnotationOwner.buildLazyValueForMap(): Lazy<Map<FqName?, JavaAnnotation>> defined in org.jetbrains.kotlin.load.java.structure[DeserializedSimpleFunctionDescriptor]

