(function() {
  const translations = {
    en: {
      nav_home: "Home",
      nav_catalog: "Catalog",
      nav_lab: "Lab",
      nav_community: "Community",
      nav_portal: "Portal",
      nav_analytics: "Analytics",
      search_placeholder: "Search products...",
      banner_title_1: "Summer Sale - Up to 40% Off",
      banner_desc_1: "Premium sportswear at unbeatable prices",
      banner_title_2: "New Collection Arrived",
      banner_desc_2: "Discover the latest in fitness fashion",
      banner_cta: "Shop Now",
      scarcity_label: "Limited Stock Alert",
      missions_title: "Fitness Missions",
      mission_1: "Complete 30 min cardio",
      mission_2: "Drink 2L of water",
      mission_3: "Stretch for 10 minutes",
      reward_points: "Reward Points",
      rec_title: "Recommended For You",
      cat_all: "All Categories",
      cat_apparel: "Apparel",
      cat_equipment: "Equipment",
      cat_accessories: "Accessories",
      sort_default: "Default",
      sort_asc: "Price: Low to High",
      sort_desc: "Price: High to Low",
      sort_name: "Name",
      cart_title: "Shopping Cart",
      cart_total: "Total",
      cart_checkout: "Checkout",
      compare_tray: "Compare Products",
      compare_now: "Compare Now",
      portal_login: "Login",
      portal_register: "Register",
      portal_profile: "Profile",
      login_title: "Access Your Account",
      email_placeholder: "Email",
      password_placeholder: "Password",
      login_btn: "Sign In",
      register_title: "Create Account",
      name_placeholder: "Full Name",
      confirm_password_placeholder: "Confirm Password",
      register_btn: "Sign Up",
      profile_title: "Your Profile",
      profile_name: "Name",
      profile_email: "Email",
      profile_points: "Points",
      lab_style: "AI Style Recommender",
      goal_default: "Select Goal",
      goal_wl: "Weight Loss",
      goal_muscle: "Muscle Gain",
      goal_endurance: "Endurance",
      freq_default: "Weekly Frequency",
      style_default: "Style Preference",
      style_casual: "Casual",
      style_bold: "Bold",
      style_minimal: "Minimal",
      lab_get_rec: "Get Recommendations",
      lab_virtual: "Virtual Try-On",
      tryon_top: "Top",
      tryon_bottom: "Bottom",
      tryon_shoes: "Shoes",
      lab_composer: "Look Composer",
      composer_total: "Total",
      lab_quiz: "Fitness Quiz",
      quiz_q1: "What is your primary goal?",
      quiz_q2: "How often do you train?",
      lab_bmi: "BMI Calculator",
      height_placeholder: "Height (cm)",
      weight_placeholder: "Weight (kg)",
      lab_calc_bmi: "Calculate",
      lab_sustainability: "Sustainability Panel",
      sust_carbon: "Carbon Offset",
      sust_recycled: "Recycled Packaging",
      sust_plastic: "Plastic Saved",
      lab_vault: "Achievement Vault",
      comm_feed: "Community Feed",
      post_placeholder: "Share your workout...",
      comm_publish: "Publish",
      comm_ranking: "Weekly Ranking",
      comm_look: "Look of the Week",
      analytics_title: "Corporate Analytics Dashboard",
      an_total_sales: "Total Sales",
      an_growth: "Monthly Growth",
      an_most_viewed: "Most Viewed",
      an_most_fav: "Most Favorited",
      an_sales_rank: "Top Seller",
      an_reviews: "Review Trend",
      an_stock: "Stock Control",
      add_cart: "Add to Cart",
      add_wishlist: "Wishlist",
      view_details: "View Details",
      compare: "Compare",
      remove: "Remove"
    },
    pt: {
      nav_home: "Inicio",
      nav_catalog: "Catalogo",
      nav_lab: "Laboratorio",
      nav_community: "Comunidade",
      nav_portal: "Portal",
      nav_analytics: "Analises",
      search_placeholder: "Buscar produtos...",
      banner_title_1: "Promocao de Verao - Ate 40% Off",
      banner_desc_1: "Roupas esportivas premium com precos incriveis",
      banner_title_2: "Nova Colecao Chegou",
      banner_desc_2: "Descubra as ultimas tendencias em moda fitness",
      banner_cta: "Comprar Agora",
      scarcity_label: "Alerta de Estoque Limitado",
      missions_title: "Missoes Fitness",
      mission_1: "Completar 30 min de cardio",
      mission_2: "Beber 2L de agua",
      mission_3: "Alongar por 10 minutos",
      reward_points: "Pontos de Recompensa",
      rec_title: "Recomendado Para Voce",
      cat_all: "Todas Categorias",
      cat_apparel: "Vestuario",
      cat_equipment: "Equipamentos",
      cat_accessories: "Acessorios",
      sort_default: "Padrao",
      sort_asc: "Preco: Menor para Maior",
      sort_desc: "Preco: Maior para Menor",
      sort_name: "Nome",
      cart_title: "Carrinho de Compras",
      cart_total: "Total",
      cart_checkout: "Finalizar",
      compare_tray: "Comparar Produtos",
      compare_now: "Comparar Agora",
      portal_login: "Entrar",
      portal_register: "Cadastrar",
      portal_profile: "Perfil",
      login_title: "Acessar Sua Conta",
      email_placeholder: "Email",
      password_placeholder: "Senha",
      login_btn: "Entrar",
      register_title: "Criar Conta",
      name_placeholder: "Nome Completo",
      confirm_password_placeholder: "Confirmar Senha",
      register_btn: "Cadastrar",
      profile_title: "Seu Perfil",
      profile_name: "Nome",
      profile_email: "Email",
      profile_points: "Pontos",
      lab_style: "Recomendador de Estilo IA",
      goal_default: "Selecione Objetivo",
      goal_wl: "Perda de Peso",
      goal_muscle: "Ganho Muscular",
      goal_endurance: "Resistencia",
      freq_default: "Frequencia Semanal",
      style_default: "Preferencia de Estilo",
      style_casual: "Casual",
      style_bold: "Ousado",
      style_minimal: "Minimalista",
      lab_get_rec: "Obter Recomendacoes",
      lab_virtual: "Provador Virtual",
      tryon_top: "Parte de Cima",
      tryon_bottom: "Parte de Baixo",
      tryon_shoes: "Calcado",
      lab_composer: "Compositor de Looks",
      composer_total: "Total",
      lab_quiz: "Quiz Fitness",
      quiz_q1: "Qual seu objetivo principal?",
      quiz_q2: "Com que frequencia treina?",
      lab_bmi: "Calculadora de IMC",
      height_placeholder: "Altura (cm)",
      weight_placeholder: "Peso (kg)",
      lab_calc_bmi: "Calcular",
      lab_sustainability: "Painel de Sustentabilidade",
      sust_carbon: "Compensacao de Carbono",
      sust_recycled: "Embalagens Recicladas",
      sust_plastic: "Plastico Economizado",
      lab_vault: "Cofre de Conquistas",
      comm_feed: "Feed da Comunidade",
      post_placeholder: "Compartilhe seu treino...",
      comm_publish: "Publicar",
      comm_ranking: "Ranking Semanal",
      comm_look: "Look da Semana",
      analytics_title: "Painel Analitico Corporativo",
      an_total_sales: "Vendas Totais",
      an_growth: "Crescimento Mensal",
      an_most_viewed: "Mais Visualizados",
      an_most_fav: "Mais Favoritados",
      an_sales_rank: "Ranking de Vendas",
      an_reviews: "Tendencia de Avaliacoes",
      an_stock: "Controle de Estoque",
      add_cart: "Adicionar ao Carrinho",
      add_wishlist: "Favoritar",
      view_details: "Ver Detalhes",
      compare: "Comparar",
      remove: "Remover"
    }
  };

  const products = [
    { id: 1, name: "Urban Technical T-Shirt", category: "apparel", price: 49.99, image: "top", rating: 4.5 },
    { id: 2, name: "Urban Performance Shorts", category: "apparel", price: 59.99, image: "bottom", rating: 4.2 },
    { id: 3, name: "Urban Pro Leggings", category: "apparel", price: 79.99, image: "bottom", rating: 4.8 },
    { id: 4, name: "Urban Performance Sneaker", category: "apparel", price: 129.99, image: "shoes", rating: 4.7 },
    { id: 5, name: "Tech Shaker 500", category: "equipment", price: 29.99, image: "accessory", rating: 4.0 },
    { id: 6, name: "Pro Resistance Bands", category: "equipment", price: 19.99, image: "accessory", rating: 4.3 },
    { id: 7, name: "Urban Gym Bag", category: "accessories", price: 39.99, image: "accessory", rating: 4.1 },
    { id: 8, name: "Compression Arm Sleeves", category: "accessories", price: 24.99, image: "top", rating: 4.4 },
    { id: 9, name: "Urban Training Gloves", category: "accessories", price: 34.99, image: "accessory", rating: 4.6 },
    { id: 10, name: "Jump Rope Pro", category: "equipment", price: 14.99, image: "accessory", rating: 3.9 }
  ];

  const state = {
    language: "en",
    theme: "light",
    cart: [],
    wishlist: [],
    rewardPoints: 0,
    missionsCompleted: [],
    compareList: [],
    currentView: "home",
    user: null
  };

  const viewsOrder = ["home", "catalog", "detail", "portal", "lab", "community", "analytics"];
  const viewIndices = { home: 0, catalog: 1, detail: 2, portal: 3, lab: 4, community: 5, analytics: 6 };

  function saveState() {
    localStorage.setItem("urbanSportsState", JSON.stringify({
      language: state.language,
      theme: state.theme,
      cart: state.cart,
      wishlist: state.wishlist,
      rewardPoints: state.rewardPoints,
      missionsCompleted: state.missionsCompleted,
      user: state.user
    }));
  }

  function loadState() {
    const saved = localStorage.getItem("urbanSportsState");
    if (saved) {
      try {
        const parsed = JSON.parse(saved);
        state.language = parsed.language || "en";
        state.theme = parsed.theme || "light";
        state.cart = parsed.cart || [];
        state.wishlist = parsed.wishlist || [];
        state.rewardPoints = parsed.rewardPoints || 0;
        state.missionsCompleted = parsed.missionsCompleted || [];
        state.user = parsed.user || null;
      } catch (e) {}
    }
  }

  function applyTheme() {
    document.documentElement.setAttribute("data-theme", state.theme);
  }

  function applyLanguage() {
    document.documentElement.lang = state.language;
    document.querySelectorAll("[data-key]").forEach(el => {
      const key = el.getAttribute("data-key");
      if (translations[state.language] && translations[state.language][key]) {
        el.textContent = translations[state.language][key];
      }
    });
    document.querySelectorAll("[data-key-placeholder]").forEach(el => {
      const key = el.getAttribute("data-key-placeholder");
      if (translations[state.language] && translations[state.language][key]) {
        el.setAttribute("placeholder", translations[state.language][key]);
      }
    });
    formatCurrencyElements();
  }

  function formatCurrency(value) {
    if (state.language === "pt") {
      return "R$ " + value.toFixed(2).replace(".", ",");
    }
    return "$" + value.toFixed(2);
  }

  function formatCurrencyElements() {
    document.querySelectorAll("[data-price]").forEach(el => {
      const val = parseFloat(el.getAttribute("data-price"));
      if (!isNaN(val)) el.textContent = formatCurrency(val);
    });
  }

  function navigateTo(viewName) {
    state.currentView = viewName;
    const index = viewIndices[viewName] !== undefined ? viewIndices[viewName] : 0;
    const container = document.getElementById("viewsContainer");
    container.style.transform = `translateX(-${index * (100 / 7)}%)`;
    document.querySelectorAll(".nav-btn").forEach(btn => {
      btn.classList.remove("active");
      if (btn.getAttribute("data-route") === viewName) btn.classList.add("active");
    });
    if (viewName === "home") renderHomeRecommendations();
    if (viewName === "catalog") renderCatalog();
    if (viewName === "lab") renderLabVault();
    if (viewName === "community") renderCommunity();
    if (viewName === "portal") updateProfileDisplay();
  }

  function showToast(message) {
    const container = document.getElementById("toastContainer");
    const toast = document.createElement("div");
    toast.className = "toast";
    toast.textContent = message;
    container.appendChild(toast);
    setTimeout(() => toast.remove(), 4000);
  }

  function updateCartCount() {
    const count = state.cart.reduce((sum, item) => sum + item.quantity, 0);
    document.getElementById("cartCount").textContent = count;
  }

  function updateWishlistCount() {
    document.getElementById("wishlistCount").textContent = state.wishlist.length;
  }

  function addToCart(productId) {
    const existing = state.cart.find(item => item.id === productId);
    if (existing) {
      existing.quantity += 1;
    } else {
      state.cart.push({ id: productId, quantity: 1 });
    }
    saveState();
    updateCartCount();
    renderCartSidebar();
    showToast("Product added to cart");
  }

  function removeFromCart(productId) {
    state.cart = state.cart.filter(item => item.id !== productId);
    saveState();
    updateCartCount();
    renderCartSidebar();
  }

  function toggleWishlist(productId) {
    const index = state.wishlist.indexOf(productId);
    if (index > -1) {
      state.wishlist.splice(index, 1);
    } else {
      state.wishlist.push(productId);
    }
    saveState();
    updateWishlistCount();
    if (state.currentView === "catalog") renderCatalog();
    if (state.currentView === "home") renderHomeRecommendations();
  }

  function isInWishlist(productId) {
    return state.wishlist.includes(productId);
  }

  function completeMission(index) {
    if (!state.missionsCompleted.includes(index)) {
      state.missionsCompleted.push(index);
      state.rewardPoints += 10;
      saveState();
      document.getElementById("rewardPointsDisplay").textContent = state.rewardPoints;
      renderMissions();
      showToast("+10 points!");
    }
  }

  function renderMissions() {
    const list = document.getElementById("missionList");
    if (!list) return;
    const missions = [
      translations[state.language].mission_1,
      translations[state.language].mission_2,
      translations[state.language].mission_3
    ];
    list.innerHTML = missions.map((text, i) => {
      const checked = state.missionsCompleted.includes(i) ? "checked" : "";
      return `<div class="mission-item"><input type="checkbox" ${checked} data-mission="${i}"><span>${text}</span></div>`;
    }).join("");
    list.querySelectorAll("input").forEach(input => {
      input.addEventListener("change", (e) => {
        if (e.target.checked) completeMission(parseInt(e.target.getAttribute("data-mission")));
      });
    });
    document.getElementById("rewardPointsDisplay").textContent = state.rewardPoints;
  }

  function renderHomeRecommendations() {
    const recContainer = document.getElementById("recCards");
    if (!recContainer) return;
    const recProducts = products.slice(0, 4);
    recContainer.innerHTML = recProducts.map(p => createProductCardHTML(p)).join("");
    attachProductCardEvents(recContainer);
  }

  function createProductCardHTML(product) {
    const wishlistActive = isInWishlist(product.id) ? "active" : "";
    return `
      <div class="product-card" data-product-id="${product.id}">
        <div class="card-img">${product.name.charAt(0)}</div>
        <div class="card-body">
          <div class="card-title">${product.name}</div>
          <div class="card-price" data-price="${product.price}">${formatCurrency(product.price)}</div>
        </div>
        <div class="card-actions">
          <label class="compare-checkbox"><input type="checkbox" class="compare-check" data-product-id="${product.id}"><span data-key="compare">Compare</span></label>
          <button class="icon-btn-sm wishlist-btn ${wishlistActive}" data-wishlist="${product.id}" title="Wishlist">&#9733;</button>
          <button class="icon-btn-sm view-detail-btn" data-view-detail="${product.id}" data-key="view_details">View Details</button>
          <button class="icon-btn-sm add-cart-btn" data-add-cart="${product.id}" data-key="add_cart">Add to Cart</button>
        </div>
      </div>
    `;
  }

  function attachProductCardEvents(container) {
    container.querySelectorAll(".add-cart-btn").forEach(btn => {
      btn.addEventListener("click", (e) => {
        e.stopPropagation();
        addToCart(parseInt(btn.getAttribute("data-add-cart")));
      });
    });
    container.querySelectorAll(".wishlist-btn").forEach(btn => {
      btn.addEventListener("click", (e) => {
        e.stopPropagation();
        toggleWishlist(parseInt(btn.getAttribute("data-wishlist")));
        btn.classList.toggle("active", isInWishlist(parseInt(btn.getAttribute("data-wishlist"))));
      });
    });
    container.querySelectorAll(".view-detail-btn").forEach(btn => {
      btn.addEventListener("click", (e) => {
        e.stopPropagation();
        const id = parseInt(btn.getAttribute("data-view-detail"));
        renderProductDetail(id);
        navigateTo("detail");
      });
    });
    container.querySelectorAll(".compare-check").forEach(check => {
      check.addEventListener("change", (e) => {
        const productId = parseInt(check.getAttribute("data-product-id"));
        if (e.target.checked) {
          if (state.compareList.length >= 3) {
            e.target.checked = false;
            showToast("Maximum 3 products for comparison");
            return;
          }
          state.compareList.push(productId);
        } else {
          state.compareList = state.compareList.filter(id => id !== productId);
        }
        updateComparisonTray();
      });
    });
  }

  function renderCatalog() {
    const grid = document.getElementById("catalogGrid");
    const skeleton = document.getElementById("skeletonGrid");
    if (!grid) return;
    grid.style.display = "none";
    skeleton.style.display = "grid";
    setTimeout(() => {
      skeleton.style.display = "none";
      grid.style.display = "grid";
      const searchTerm = document.getElementById("catalogSearch")?.value?.toLowerCase() || "";
      const category = document.getElementById("categoryFilter")?.value || "all";
      const sort = document.getElementById("sortFilter")?.value || "default";
      let filtered = products.filter(p => {
        const matchSearch = p.name.toLowerCase().includes(searchTerm);
        const matchCat = category === "all" || p.category === category;
        return matchSearch && matchCat;
      });
      if (sort === "price-asc") filtered.sort((a,b) => a.price - b.price);
      else if (sort === "price-desc") filtered.sort((a,b) => b.price - a.price);
      else if (sort === "name") filtered.sort((a,b) => a.name.localeCompare(b.name));
      grid.innerHTML = filtered.map(p => createProductCardHTML(p)).join("");
      attachProductCardEvents(grid);
      updateComparisonTray();
    }, 600);
  }

  function renderProductDetail(productId) {
    const container = document.getElementById("detailContent");
    const product = products.find(p => p.id === productId);
    if (!product) return;
    container.innerHTML = `
      <div class="detail-gallery">[${product.name} Image]</div>
      <div class="detail-info">
        <h2>${product.name}</h2>
        <div class="rating-stars" data-product-id="${product.id}">
          ${[1,2,3,4,5].map(i => `<span class="star ${i <= Math.round(product.rating) ? 'filled' : ''}" data-star="${i}">&#9733;</span>`).join("")}
        </div>
        <p class="card-price" data-price="${product.price}">${formatCurrency(product.price)}</p>
        <p>Category: ${product.category}</p>
        <button class="cta-btn" id="detailAddCart">${translations[state.language].add_cart}</button>
        <button class="cta-btn" id="detailWishlist">${isInWishlist(product.id) ? "Remove from Wishlist" : translations[state.language].add_wishlist}</button>
        <div class="feedback-panel" style="margin-top:2rem;">
          <h4>Leave Feedback</h4>
          <textarea id="feedbackText" placeholder="Your review..."></textarea>
          <button class="cta-btn" id="submitFeedback">Submit</button>
        </div>
      </div>
    `;
    document.getElementById("detailAddCart").addEventListener("click", () => addToCart(product.id));
    document.getElementById("detailWishlist").addEventListener("click", () => {
      toggleWishlist(product.id);
      renderProductDetail(product.id);
    });
    document.getElementById("submitFeedback").addEventListener("click", () => {
      showToast("Feedback submitted!");
    });
    container.querySelectorAll(".star").forEach(star => {
      star.addEventListener("click", (e) => {
        const val = parseInt(star.getAttribute("data-star"));
        product.rating = val;
        renderProductDetail(product.id);
      });
    });
  }

  function updateComparisonTray() {
    const tray = document.getElementById("comparisonTray");
    const itemsDiv = document.getElementById("trayItems");
    const countSpan = document.getElementById("trayCount");
    if (!tray) return;
    if (state.compareList.length === 0) {
      tray.style.display = "none";
      return;
    }
    tray.style.display = "flex";
    countSpan.textContent = `${state.compareList.length}/3`;
    itemsDiv.innerHTML = state.compareList.map(id => {
      const p = products.find(prod => prod.id === id);
      return p ? `<span class="tray-item">${p.name} <button class="remove-compare" data-remove="${id}">&times;</button></span>` : "";
    }).join("");
    itemsDiv.querySelectorAll(".remove-compare").forEach(btn => {
      btn.addEventListener("click", (e) => {
        e.stopPropagation();
        const id = parseInt(btn.getAttribute("data-remove"));
        state.compareList = state.compareList.filter(cid => cid !== id);
        updateComparisonTray();
        if (state.currentView === "catalog") renderCatalog();
      });
    });
  }

  function openCompareModal() {
    const overlay = document.getElementById("modalOverlay");
    const content = document.getElementById("modalContent");
    const prods = state.compareList.map(id => products.find(p => p.id === id)).filter(Boolean);
    if (prods.length === 0) return;
    let tableHTML = `<h3>Comparison</h3><table style="width:100%; border-collapse:collapse;"><tr><th>Feature</th>${prods.map(p => `<th>${p.name}</th>`).join("")}</tr>`;
    tableHTML += `<tr><td>Price</td>${prods.map(p => `<td>${formatCurrency(p.price)}</td>`).join("")}</tr>`;
    tableHTML += `<tr><td>Category</td>${prods.map(p => `<td>${p.category}</td>`).join("")}</tr>`;
    tableHTML += `<tr><td>Rating</td>${prods.map(p => `<td>${p.rating}</td>`).join("")}</tr></table>`;
    content.innerHTML = tableHTML + `<button class="cta-btn" id="closeModal">Close</button>`;
    overlay.style.display = "flex";
    document.getElementById("closeModal").addEventListener("click", () => overlay.style.display = "none");
  }

  function renderCartSidebar() {
    const itemsDiv = document.getElementById("cartItems");
    const totalEl = document.getElementById("cartTotal");
    if (!itemsDiv) return;
    if (state.cart.length === 0) {
      itemsDiv.innerHTML = "<p>Cart is empty</p>";
      totalEl.textContent = formatCurrency(0);
      return;
    }
    let total = 0;
    itemsDiv.innerHTML = state.cart.map(item => {
      const product = products.find(p => p.id === item.id);
      if (!product) return "";
      const lineTotal = product.price * item.quantity;
      total += lineTotal;
      return `<div class="cart-item" style="display:flex; justify-content:space-between; margin-bottom:0.5rem;">
        <span>${product.name} x${item.quantity}</span>
        <span>${formatCurrency(lineTotal)}</span>
        <button class="remove-cart-item" data-remove="${item.id}">X</button>
      </div>`;
    }).join("");
    totalEl.textContent = formatCurrency(total);
    itemsDiv.querySelectorAll(".remove-cart-item").forEach(btn => {
      btn.addEventListener("click", (e) => {
        removeFromCart(parseInt(btn.getAttribute("data-remove")));
      });
    });
  }

  function renderCommunity() {
    const postsList = document.getElementById("postsList");
    if (!postsList) return;
    postsList.innerHTML = [
      { user: "Ana", text: "Just finished a 5K run!", likes: 12 },
      { user: "Carlos", text: "New personal record on deadlift!", likes: 8 }
    ].map((p, i) => `<div class="post-card"><strong>${p.user}</strong><p>${p.text}</p><div class="post-actions"><button class="like-btn" data-post="${i}">&#9825; ${p.likes}</button></div></div>`).join("");
    document.getElementById("rankingList").innerHTML = `<li>Ana - 340 pts</li><li>Carlos - 290 pts</li><li>Bia - 250 pts</li>`;
  }

  function renderLabVault() {
    const vault = document.getElementById("vaultMedals");
    if (!vault) return;
    const medals = [
      { name: "First Mission", unlocked: state.rewardPoints >= 10 },
      { name: "Shopper", unlocked: state.cart.length > 0 },
      { name: "Collector", unlocked: state.wishlist.length >= 3 }
    ];
    vault.innerHTML = medals.map(m => `<div class="medal ${m.unlocked ? 'unlocked' : ''}" title="${m.name}">${m.unlocked ? 'M' : '?'}</div>`).join("");
  }

  function updateProfileDisplay() {
    const nameEl = document.getElementById("profileName");
    const emailEl = document.getElementById("profileEmail");
    const pointsEl = document.getElementById("profilePoints");
    if (state.user) {
      if (nameEl) nameEl.textContent = state.user.name;
      if (emailEl) emailEl.textContent = state.user.email;
    }
    if (pointsEl) pointsEl.textContent = state.rewardPoints;
  }

  function handleLogin(e) {
    e.preventDefault();
    const email = document.querySelector("#loginForm input[type='email']")?.value;
    if (email) {
      state.user = { name: email.split("@")[0], email: email };
      saveState();
      updateProfileDisplay();
      showToast("Logged in!");
      document.querySelectorAll(".portal-form").forEach(f => f.classList.remove("active"));
      document.querySelector("[data-portal-form='profile']").classList.add("active");
    }
  }

  function handleRegister(e) {
    e.preventDefault();
    const name = document.querySelector("#registerForm input[placeholder]")?.value;
    const email = document.querySelectorAll("#registerForm input")[1]?.value;
    if (name && email) {
      state.user = { name, email };
      saveState();
      updateProfileDisplay();
      showToast("Registered!");
      document.querySelectorAll(".portal-form").forEach(f => f.classList.remove("active"));
      document.querySelector("[data-portal-form='profile']").classList.add("active");
    }
  }

  document.addEventListener("DOMContentLoaded", () => {
    loadState();
    applyTheme();
    applyLanguage();
    updateCartCount();
    updateWishlistCount();
    navigateTo("home");
    renderMissions();
    renderHomeRecommendations();
    renderCartSidebar();
    updateComparisonTray();

    document.querySelectorAll(".nav-btn").forEach(btn => {
      btn.addEventListener("click", (e) => {
        const route = btn.getAttribute("data-route");
        navigateTo(route);
      });
    });

    document.getElementById("langToggle").addEventListener("click", () => {
      state.language = state.language === "en" ? "pt" : "en";
      saveState();
      applyLanguage();
      renderMissions();
      if (state.currentView === "catalog") renderCatalog();
      if (state.currentView === "home") renderHomeRecommendations();
    });

    document.getElementById("themeToggle").addEventListener("click", () => {
      state.theme = state.theme === "light" ? "dark" : "light";
      saveState();
      applyTheme();
    });

    document.getElementById("cartBtn").addEventListener("click", () => {
      document.getElementById("cartSidebar").classList.add("open");
      document.getElementById("cartOverlay").style.display = "block";
    });

    document.getElementById("cartClose").addEventListener("click", () => {
      document.getElementById("cartSidebar").classList.remove("open");
      document.getElementById("cartOverlay").style.display = "none";
    });

    document.getElementById("cartOverlay").addEventListener("click", () => {
      document.getElementById("cartSidebar").classList.remove("open");
      document.getElementById("cartOverlay").style.display = "none";
    });

    document.getElementById("compareBtn").addEventListener("click", openCompareModal);
    document.getElementById("trayClose").addEventListener("click", () => {
      state.compareList = [];
      updateComparisonTray();
      if (state.currentView === "catalog") renderCatalog();
    });

    document.getElementById("modalOverlay").addEventListener("click", (e) => {
      if (e.target === e.currentTarget) e.currentTarget.style.display = "none";
    });

    document.getElementById("catalogSearch")?.addEventListener("input", renderCatalog);
    document.getElementById("categoryFilter")?.addEventListener("change", renderCatalog);
    document.getElementById("sortFilter")?.addEventListener("change", renderCatalog);

    document.getElementById("loginForm")?.addEventListener("submit", handleLogin);
    document.getElementById("registerForm")?.addEventListener("submit", handleRegister);

    document.querySelectorAll(".portal-tab").forEach(tab => {
      tab.addEventListener("click", () => {
        document.querySelectorAll(".portal-tab").forEach(t => t.classList.remove("active"));
        tab.classList.add("active");
        const target = tab.getAttribute("data-portal-tab");
        document.querySelectorAll(".portal-form").forEach(f => f.classList.remove("active"));
        const form = document.querySelector(`[data-portal-form='${target}']`);
        if (form) form.classList.add("active");
        if (target === "profile") updateProfileDisplay();
      });
    });

    document.getElementById("getRecommendation")?.addEventListener("click", () => {
      const res = document.getElementById("labRecResult");
      if (res) res.innerHTML = "<p>Try our Pro Leggings and Performance Sneaker!</p>";
    });

    document.getElementById("calcBMI")?.addEventListener("click", () => {
      const h = parseFloat(document.getElementById("bmiHeight")?.value);
      const w = parseFloat(document.getElementById("bmiWeight")?.value);
      const res = document.getElementById("bmiResult");
      if (res && h && w) {
        const imc = (w / ((h/100)**2)).toFixed(1);
        res.innerHTML = `<p>IMC: ${imc} - Recommended size: ${imc > 25 ? 'L' : 'M'}</p>`;
      }
    });

    document.querySelectorAll(".quiz-opt").forEach(opt => {
      opt.addEventListener("click", () => {
        document.getElementById("quizStep1").style.display = "none";
        document.getElementById("quizStep2").style.display = "block";
        document.getElementById("quizStep2").querySelectorAll(".quiz-opt").forEach(o => {
          o.addEventListener("click", () => {
            document.getElementById("quizStep2").style.display = "none";
            document.getElementById("quizResult").style.display = "block";
            document.getElementById("quizResult").innerHTML = "<p>We recommend Urban Pro Leggings!</p>";
          });
        });
      });
    });

    document.getElementById("publishPost")?.addEventListener("click", () => {
      const text = document.getElementById("newPostText")?.value;
      if (text) {
        const postsList = document.getElementById("postsList");
        const postDiv = document.createElement("div");
        postDiv.className = "post-card";
        postDiv.innerHTML = `<strong>You</strong><p>${text}</p><div class="post-actions"><button class="like-btn">&#9825; 0</button></div>`;
        postsList.prepend(postDiv);
        document.getElementById("newPostText").value = "";
      }
    });

    setInterval(() => {
      const cities = ["London", "New York", "Tokyo", "Berlin", "Sydney"];
      const productsList = ["Urban Technical T-Shirt", "Urban Performance Shorts", "Urban Performance Sneaker"];
      const city = cities[Math.floor(Math.random() * cities.length)];
      const prod = productsList[Math.floor(Math.random() * productsList.length)];
      showToast(`A customer in ${city} just purchased ${prod}`);
    }, 15000);

    const bannerSlides = document.querySelectorAll(".banner-slide");
    const bannerDots = document.getElementById("bannerDots");
    let currentBanner = 0;
    if (bannerSlides.length && bannerDots) {
      for (let i = 0; i < bannerSlides.length; i++) {
        const dot = document.createElement("button");
        dot.addEventListener("click", () => {
          bannerSlides.forEach(s => s.classList.remove("active"));
          bannerSlides[i].classList.add("active");
          document.querySelectorAll(".banner-dots button").forEach(d => d.classList.remove("active"));
          dot.classList.add("active");
          currentBanner = i;
        });
        bannerDots.appendChild(dot);
      }
      bannerDots.children[0]?.classList.add("active");
      setInterval(() => {
        currentBanner = (currentBanner + 1) % bannerSlides.length;
        bannerSlides.forEach(s => s.classList.remove("active"));
        bannerSlides[currentBanner].classList.add("active");
        document.querySelectorAll(".banner-dots button").forEach((d, idx) => d.classList.toggle("active", idx === currentBanner));
      }, 4000);
    }
  });
})();
