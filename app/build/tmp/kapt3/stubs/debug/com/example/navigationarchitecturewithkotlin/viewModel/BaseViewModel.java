package com.example.navigationarchitecturewithkotlin.viewModel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u000f\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0006"}, d2 = {"Lcom/example/navigationarchitecturewithkotlin/viewModel/BaseViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "Companion", "app_debug"})
public class BaseViewModel extends androidx.lifecycle.AndroidViewModel {
    @org.jetbrains.annotations.NotNull()
    public static final com.example.navigationarchitecturewithkotlin.viewModel.BaseViewModel.Companion Companion = null;
    @org.jetbrains.annotations.Nullable()
    private static com.example.navigationarchitecturewithkotlin.repository.NavRepository repository;
    
    public BaseViewModel(@org.jetbrains.annotations.NotNull()
    @io.reactivex.annotations.NonNull()
    android.app.Application application) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lcom/example/navigationarchitecturewithkotlin/viewModel/BaseViewModel$Companion;", "", "()V", "repository", "Lcom/example/navigationarchitecturewithkotlin/repository/NavRepository;", "getRepository", "()Lcom/example/navigationarchitecturewithkotlin/repository/NavRepository;", "setRepository", "(Lcom/example/navigationarchitecturewithkotlin/repository/NavRepository;)V", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.example.navigationarchitecturewithkotlin.repository.NavRepository getRepository() {
            return null;
        }
        
        public final void setRepository(@org.jetbrains.annotations.Nullable()
        com.example.navigationarchitecturewithkotlin.repository.NavRepository p0) {
        }
    }
}