'AbstractJavaClassFinder' @ [27:29] ==> public constructor AbstractJavaClassFinder() defined in org.jetbrains.kotlin.load.java.AbstractJavaClassFinder[ClassConstructorDescriptorImpl]

'javaFacade' @ [32:9] ==> private final lateinit var javaFacade: KotlinJavaPsiFacade defined in org.jetbrains.kotlin.load.java.JavaClassFinderImpl[PropertyDescriptorImpl]

'getInstance' @ [32:42] ==> public open fun getInstance(project: (Project..Project?)): (KotlinJavaPsiFacade..KotlinJavaPsiFacade?) defined in org.jetbrains.kotlin.resolve.jvm.KotlinJavaPsiFacade[JavaMethodDescriptor]

'project' @ [32:54] ==> public final lateinit var project: Project defined in org.jetbrains.kotlin.load.java.JavaClassFinderImpl[PropertyDescriptorImpl]

'super' @ [33:9] ==> <this> defined in org.jetbrains.kotlin.load.java.JavaClassFinderImpl[LazyClassReceiverParameterDescriptor]

'initialize' @ [33:15] ==> @PostConstruct public open fun initialize(trace: BindingTrace, codeAnalyzer: KotlinCodeAnalyzer): Unit defined in org.jetbrains.kotlin.load.java.AbstractJavaClassFinder[SimpleFunctionDescriptorImpl]

'trace' @ [33:26] ==> value-parameter trace: BindingTrace defined in org.jetbrains.kotlin.load.java.JavaClassFinderImpl.initialize[ValueParameterDescriptorImpl]

'codeAnalyzer' @ [33:33] ==> value-parameter codeAnalyzer: KotlinCodeAnalyzer defined in org.jetbrains.kotlin.load.java.JavaClassFinderImpl.initialize[ValueParameterDescriptorImpl]

'javaFacade' @ [36:60] ==> private final lateinit var javaFacade: KotlinJavaPsiFacade defined in org.jetbrains.kotlin.load.java.JavaClassFinderImpl[PropertyDescriptorImpl]

'findClass' @ [36:71] ==> public open fun findClass(@NotNull classId: ClassId, @NotNull scope: GlobalSearchScope): (JavaClass..JavaClass?) defined in org.jetbrains.kotlin.resolve.jvm.KotlinJavaPsiFacade[JavaMethodDescriptor]

'classId' @ [36:81] ==> value-parameter classId: ClassId defined in org.jetbrains.kotlin.load.java.JavaClassFinderImpl.findClass[ValueParameterDescriptorImpl]

'javaSearchScope' @ [36:90] ==> protected final lateinit var javaSearchScope: GlobalSearchScope defined in org.jetbrains.kotlin.load.java.JavaClassFinderImpl[PropertyDescriptorImpl]

'javaFacade' @ [38:48] ==> private final lateinit var javaFacade: KotlinJavaPsiFacade defined in org.jetbrains.kotlin.load.java.JavaClassFinderImpl[PropertyDescriptorImpl]

'findPackage' @ [38:59] ==> public open fun findPackage(@NotNull qualifiedName: String, searchScope: (GlobalSearchScope..GlobalSearchScope?)): (PsiPackage..PsiPackage?) defined in org.jetbrains.kotlin.resolve.jvm.KotlinJavaPsiFacade[JavaMethodDescriptor]

'fqName' @ [38:71] ==> value-parameter fqName: FqName defined in org.jetbrains.kotlin.load.java.JavaClassFinderImpl.findPackage[ValueParameterDescriptorImpl]

'asString' @ [38:78] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'javaSearchScope' @ [38:90] ==> protected final lateinit var javaSearchScope: GlobalSearchScope defined in org.jetbrains.kotlin.load.java.JavaClassFinderImpl[PropertyDescriptorImpl]

'let' @ [38:108] ==> @InlineOnly public inline fun <T, R> PsiPackage.let(block: (PsiPackage) -> JavaPackageImpl): JavaPackageImpl defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiPackage
    <R> -> JavaPackageImpl

'JavaPackageImpl' @ [38:114] ==> public constructor JavaPackageImpl(psiPackage: PsiPackage, scope: GlobalSearchScope) defined in org.jetbrains.kotlin.load.java.structure.impl.JavaPackageImpl[ClassConstructorDescriptorImpl]

'it' @ [38:130] ==> value-parameter it: PsiPackage defined in org.jetbrains.kotlin.load.java.JavaClassFinderImpl.findPackage.<anonymous>[ValueParameterDescriptorImpl]

'javaSearchScope' @ [38:134] ==> protected final lateinit var javaSearchScope: GlobalSearchScope defined in org.jetbrains.kotlin.load.java.JavaClassFinderImpl[PropertyDescriptorImpl]

'javaFacade' @ [40:82] ==> private final lateinit var javaFacade: KotlinJavaPsiFacade defined in org.jetbrains.kotlin.load.java.JavaClassFinderImpl[PropertyDescriptorImpl]

'knownClassNamesInPackage' @ [40:93] ==> @Nullable public open fun knownClassNamesInPackage(@NotNull packageFqName: FqName): (MutableSet<(String..String?)>?..Set<(String..String?)>?) defined in org.jetbrains.kotlin.resolve.jvm.KotlinJavaPsiFacade[JavaMethodDescriptor]

'packageFqName' @ [40:118] ==> value-parameter packageFqName: FqName defined in org.jetbrains.kotlin.load.java.JavaClassFinderImpl.knownClassNamesInPackage[ValueParameterDescriptorImpl]

